package com.example.hotel_management_api.services;

import com.example.hotel_management_api.entities.Room;
import com.example.hotel_management_api.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    public Room createRoom(Room room) {
        return roomRepository.save(room);
    }

    public Room updateRoom(Long id, Room roomDetails) {
        Room room = roomRepository.findById(id).orElseThrow(() -> new RuntimeException("Room not found"));
        room.setType(roomDetails.getType());
        room.setCapacity(roomDetails.getCapacity());
        room.setPricePerNight(roomDetails.getPricePerNight());
        room.setAvailable(roomDetails.isAvailable());
        return roomRepository.save(room);
    }

    public void deleteRoom(Long id) {
        roomRepository.deleteById(id);
    }
}
