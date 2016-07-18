package org.cbioportal.pdb_annotation.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "Handcrafted by Juexin Wang";
	}
}
