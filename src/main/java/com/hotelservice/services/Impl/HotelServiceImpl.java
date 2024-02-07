package com.hotelservice.services.Impl;

import com.hotelservice.entites.Hotel;
import com.hotelservice.exceptions.ResourceNotFoundException;
import com.hotelservice.repositories.HotelRepository;
import com.hotelservice.services.HotelServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelServices {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel create(Hotel hotel) {
      String hotelId =   UUID.randomUUID().toString();
      hotel.setId(hotelId);
        return hotelRepository.save(hotel) ;
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException(" Hotel with given Id not found"));
    }
}
