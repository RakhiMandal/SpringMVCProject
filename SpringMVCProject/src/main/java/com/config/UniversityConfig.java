//package com.config;
//
//import java.util.List;
//import java.util.Properties;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.multipart.commons.CommonsMultipartResolver;
//import org.springframework.web.servlet.HandlerExceptionResolver;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//
//@Configuration
//@EnableWebMvc
//@ComponentScan(basePackages = "com.entity,com.controller,com.bean" )
//public class UniversityConfig implements WebMvcConfigurer {
//	@Bean
//	public ViewResolver getViewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/WEB-INF/viewPage/");
//		resolver.setSuffix(".jsp");
//
//		return resolver;
//	}
//	@Override
//	public void configureHandlerExceptionResolvers(
//			List<HandlerExceptionResolver> resolvers) {
//		SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
//		exceptionResolver.setDefaultErrorView("error");// Global
//
//		Properties properties = new Properties();
//		properties.put("java.lang.Exception", "errorBook"); 
//		exceptionResolver.setExceptionMappings(properties);
//
//		resolvers.add(exceptionResolver);
//		WebMvcConfigurer.super.configureHandlerExceptionResolvers(resolvers);
//	}
//
//	@Bean
//	public CommonsMultipartResolver multipartResolver() {
//		return new CommonsMultipartResolver();
//	}
//
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
//	}
//}
