package com.hotelservice.services;

import com.hotelservice.entites.Hotel;

import java.util.List;

public interface HotelServices {

    //create
    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get hotel by id
    Hotel get(String id);
}
