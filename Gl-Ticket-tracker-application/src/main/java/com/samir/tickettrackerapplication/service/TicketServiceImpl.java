package com.samir.tickettrackerapplication.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.samir.tickettrackerapplication.dao.TicketDao;
import com.samir.tickettrackerapplication.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {
	TicketDao ticketDao;

	public TicketServiceImpl(TicketDao ticketDao) {
		super();
		this.ticketDao = ticketDao;
	}

	@Override
	public List<Ticket> getAllTicket() {
		// TODO Auto-generated method stub
		return ticketDao.findAll();
	}

	@Override
	public Ticket getTicket(int id) {
		// TODO Auto-generated method stub
		return ticketDao.findById(id).get();
	}

	@Override
	public Ticket updateTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.save(ticket);
	}

	@Override
	public Ticket saveticket(Ticket ticket) {
		// TODO Auto-generated method stub
		return ticketDao.save(ticket);
	}

	@Override
	public Ticket searchticket(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletTicket(int id) {
		// TODO Auto-generated method stub
		 ticketDao.deleteById(id);

	}

}
