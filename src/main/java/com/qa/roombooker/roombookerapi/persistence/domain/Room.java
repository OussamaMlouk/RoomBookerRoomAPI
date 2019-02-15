package com.qa.roombooker.roombookerapi.persistence.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Room {

	@Id
	@GeneratedValue
	private Long roomId;

	private String roomName;

	private String floor;

	@Column(name = "available")
	private boolean available = true;

	public Room() {

	}

	public Room(String roomName, String floor) {
		this.roomName = roomName;
		this.floor = floor;
	}

	public Long getRoomId() {
		return roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
}
