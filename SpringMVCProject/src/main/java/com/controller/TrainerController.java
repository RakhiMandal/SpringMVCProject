package com.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Trainer;
import com.service.TrainerService;

@Controller
//@RequestMapping(path = "/mvc")
public class TrainerController {
	private static Logger log = LoggerFactory.getLogger(TrainerController.class.getSimpleName());

	@Autowired
	private TrainerService trainerService;

	@RequestMapping(path = "/trainer", method = RequestMethod.GET)
	public ModelAndView trainer() {

		return new ModelAndView("Trainer","trainer",new Trainer());
	}

	@RequestMapping(path = "/trainer1", method = RequestMethod.POST)
	public ModelAndView createTrainer(@ModelAttribute(name = "trainer") Trainer trainer,BindingResult bindingresult) {
		log.info(trainer.toString());
		trainerService.save(trainer);
		return new ModelAndView("Trainer", "trainer", trainer);
	}
}
