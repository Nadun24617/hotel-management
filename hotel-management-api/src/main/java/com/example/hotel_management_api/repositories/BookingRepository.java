package com.example.hotel_management_api.repositories;

import com.example.hotel_management_api.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
