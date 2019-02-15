package com.qa.roombooker.roombookerapi.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.roombooker.roombookerapi.persistence.domain.Room;
import com.qa.roombooker.roombookerapi.service.RoomService;

@RequestMapping("${path.base}")
@RestController
public class RoomRest {

	@Autowired
	private RoomService service;

	@GetMapping("${path.getRooms}")
	public List<Room> getAccounts() {
		return service.getRooms();
	}

	@GetMapping("${path.getRoomById}")
	public Room getAccount(@PathVariable Long roomId) {
		return service.getRoom(roomId);
	}

	// @GetMapping("${path.addRoom}")
	// public Room createRoom(@PathVariable String floorName, @PathVariable String
	// floor) {
	// return service.createAccount(RoomName, floor);
	// }
}
