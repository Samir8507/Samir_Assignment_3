package com.samir.tickettrackerapplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String ticket_title;
	private String ticket_short_description;
	private String ticket_created_on;
	private String action;
	public Ticket(String ticket_title, String ticket_short_description, String ticket_created_on, String action) {
		super();
		this.ticket_title = ticket_title;
		this.ticket_short_description = ticket_short_description;
		this.ticket_created_on = ticket_created_on;
		this.action = action;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTicket_title() {
		return ticket_title;
	}
	public void setTicket_title(String ticket_title) {
		this.ticket_title = ticket_title;
	}
	public String getTicket_short_description() {
		return ticket_short_description;
	}
	public void setTicket_short_description(String ticket_short_description) {
		this.ticket_short_description = ticket_short_description;
	}
	public String getTicket_created_on() {
		return ticket_created_on;
	}
	public void setTicket_created_on(String ticket_created_on) {
		this.ticket_created_on = ticket_created_on;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
