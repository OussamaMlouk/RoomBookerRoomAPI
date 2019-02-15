package com.qa.roombooker.roombookerapi.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.qa.roombooker.roombookerapi.persistence.domain.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
