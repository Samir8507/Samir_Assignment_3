package com.samir.tickettrackerapplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("ticket")
public class TicketController {
	@GetMapping("/list")
	public String shomeTicket() {
		
	// public String shomHome(Model model) {
		//System.out.println("in Controller");
		//model.addAttribute("date", new Date());
		return "ticket-list";
	}

}
