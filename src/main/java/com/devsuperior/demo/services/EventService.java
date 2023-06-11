package com.devsuperior.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.entities.Event;
import com.devsuperior.demo.repositories.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	@Transactional(readOnly = true)
	public Page<EventDTO> findAll(Pageable pageable) {
		Page<Event> list = eventRepository.findAll(pageable);
		return list.map(x -> new EventDTO(x)); 
	}
	
}
