package com.example.hotel_management_api.repositories;

import com.example.hotel_management_api.entities.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
