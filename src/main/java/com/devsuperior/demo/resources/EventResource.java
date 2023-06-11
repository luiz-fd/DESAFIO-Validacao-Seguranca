package com.devsuperior.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.demo.dto.EventDTO;
import com.devsuperior.demo.services.EventService;

@RestController
@RequestMapping(value = "/events")
public class EventResource {
	
	@Autowired
	private EventService eventService;
	
	@GetMapping
	public ResponseEntity<Page<EventDTO>> findAll(Pageable pageable) {
		Page<EventDTO> list = eventService.findAll(pageable);		
		return ResponseEntity.ok().body(list);
	}

}
