package com.brenda.displaydate.controllers;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DisplayDateController {
	@RequestMapping("/")
	public String main(Model model) {
		return "index.jsp";
	}
	@RequestMapping("/date")
	 public String date(Model model) {
		SimpleDateFormat date= new SimpleDateFormat
				("EEEE, 'the' dd 'of' MMMM, YYYY");	
		model.addAttribute("dateFormat", date.format(new java.util.Date()));
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat time= new SimpleDateFormat("h:mm a");
		model.addAttribute("timeFormat", time.format(new java.util.Date()));
		return "time.jsp";
	}
}
