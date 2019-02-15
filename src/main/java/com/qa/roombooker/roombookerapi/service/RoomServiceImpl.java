package com.qa.roombooker.roombookerapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.roombooker.roombookerapi.persistence.domain.Room;
import com.qa.roombooker.roombookerapi.persistence.repository.RoomRepository;
import com.qa.roombooker.roombookerapi.util.exceptions.RoomNotFoundException;

@Service
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepository repo;
	
	@Override
	public List<Room> getRooms() {
		return repo.findAll();
	}

	@Override
	public Room getRoom(Long roomId) {
		Optional<Room> room = repo.findById(roomId);
		return room.orElseThrow(()-> new RoomNotFoundException(roomId.toString()));
	}

	@Override
	public Room createRoom(String roomName, String floor) {
		return new Room(roomName, floor);
	}
	
	

}
