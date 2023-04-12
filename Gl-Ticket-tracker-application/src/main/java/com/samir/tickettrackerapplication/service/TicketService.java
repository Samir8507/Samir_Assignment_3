package com.samir.tickettrackerapplication.service;

import java.util.List;

import com.samir.tickettrackerapplication.model.Ticket;

public interface TicketService {
	public List<Ticket> getAllTicket();

	public Ticket getTicket(int id);

	public Ticket updateTicket(Ticket ticket);

	public Ticket saveticket(Ticket ticket);

	public Ticket searchticket(int id);

	public void deletTicket(int id);

}
