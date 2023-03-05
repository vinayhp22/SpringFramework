package com.xworkz.poison.configuration;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.poison")
public class PoisonConfiguration {
	public PoisonConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Bean
	public ViewResolver viewResolver() {
		System.out.println("ViewResolver");
		return new InternalResourceViewResolver("/", ".jsp");
	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("localContainerEntityManagerFactoryBean");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setPackagesToScan("com.xworkz.poison.entity");
		bean.setDataSource(dataSource());
		bean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		return bean;
	}

	public DataSource dataSource() {
		System.out.println("DataSource Running");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/new_jdbc");
		dataSource.setUsername("root");
		dataSource.setPassword("89708@Vhp");
		return dataSource;
	}
}
