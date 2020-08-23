package com.infy.management.InfyBooking.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infy.management.InfyBooking.entity.BookingEntity;




@Repository
public interface BookingRepository extends JpaRepository<BookingEntity, Integer> {

	List<BookingEntity> findByDate(String date);


	BookingEntity findByBookingId(Integer bookingId);

}
