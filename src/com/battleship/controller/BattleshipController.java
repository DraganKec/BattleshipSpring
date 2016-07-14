package com.battleship.controller;

import org.battleship.servis.BattleshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BattleshipController {

	@Autowired
	private BattleshipService battleshipService;

	@RequestMapping(value = "/battleship", method = RequestMethod.POST)
	public ModelAndView battleship(ModelMap model) {

		 battleshipService.fillMatrix();
		 battleshipService.addShips(4, 1);
		 battleshipService.addShips(3, 2);
		 battleshipService.addShips(2, 3);
		 battleshipService.addShips(1, 4);
		
		 model.addAttribute("battleshipMap", battleshipService.getBattleshipMap());

		return new ModelAndView("index");
	}
}
