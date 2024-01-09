//package com.controller;
//
//import java.util.HashMap;
//
//
//import java.util.Map;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.entity.University;
//@Controller
//public class UniversityController {
//	private static Logger log = LoggerFactory
//			.getLogger(UniversityController.class.getSimpleName());
//
//	@RequestMapping(path = "/University", method = RequestMethod.GET)
//	public ModelAndView university() {
//		Map map = new HashMap();
//		map.put("headerName", "University");
//
//		return new ModelAndView("University", "uni", new University()).addAllObjects(map);
//	}
//
//	@RequestMapping(path = "/University", method = RequestMethod.POST)
//	public ModelAndView createUniversity(@ModelAttribute University university) {
//		log.info(university.toString());
////		return new ModelAndView("University", "uni", university);
//		return new ModelAndView("University", "uni", new University());
//	}
//
//}
