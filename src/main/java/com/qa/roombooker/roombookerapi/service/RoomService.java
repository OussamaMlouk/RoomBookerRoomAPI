package com.qa.roombooker.roombookerapi.service;

import java.util.List;

import com.qa.roombooker.roombookerapi.persistence.domain.Room;

public interface RoomService {
	
	List<Room> getRooms();
	
	Room getRoom(Long roomId);
	
	Room createRoom(String roomName, String floor);
	
}
