package com.qa.roombooker.roombookerapi.util.exceptions;

public class RoomNotFoundException extends RuntimeException {
	
	public RoomNotFoundException(String exception){
        super("Id supplied does not exist. Id: " + exception);
    }
}
