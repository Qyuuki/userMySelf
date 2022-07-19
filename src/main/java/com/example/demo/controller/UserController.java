package com.example.demo.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Validated
public class UserController {
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String user(@Valid @NotBlank @Size(max = 19) @RequestParam(value = "name") String name,
			@Valid @NotBlank @RequestParam(value = "birthday") String birthday, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("birthday", birthday);
		return "index";
	}
}
