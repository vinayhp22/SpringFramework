package com.xworkz.poison.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.poison.configuration.PoisonConfiguration;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class PoisonFileController {

	public PoisonFileController() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	// Save the uploaded file to this folder
	private static String UPLOADED_FOLDER = "G:\\eclipse\\FileUpload\\poison_files\\";

	// @RequestMapping(value = "/upload", method = RequestMethod.POST)
	@PostMapping("/upload")
	public String onUpload(@RequestParam("file") MultipartFile file, Model model) {

		if (file.isEmpty()) {
			log.info("File is empty, please select a file uploaded");
			model.addAttribute("message", "Please select a file to upload");
			return "FileUpload";
		}

		try {
			log.info("Try block started in onUpload");
			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
			Files.write(path, bytes);

			model.addAttribute("successmessage", "You successfully uploaded '" + file.getOriginalFilename() + "'");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "FileUpload";
	}

	@GetMapping("/download")
	public void onDownload(HttpServletResponse response, @RequestParam String fileName) throws IOException {
		log.info("onDownload in PoisonFileController");
		// Getting the file
		response.setContentType("image/jpeg");
		
		File file = new File("G:\\eclipse\\FileUpload\\poison_files\\" + fileName);
		
		// converting file into byte
		BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
		ServletOutputStream out = response.getOutputStream();
		// send to response
		IOUtils.copy(in, out);
		response.flushBuffer();
	}
}
