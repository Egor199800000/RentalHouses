package com.example.OnlineRentalHouses.service;





import com.example.OnlineRentalHouses.entity.House;
import com.example.OnlineRentalHouses.repo.HouseRepository;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class HouseService {
    @Autowired
    @Qualifier("houseRep")
    private HouseRepository houseRepository;

    @Transactional
    public List<House> getAllHouses(){return houseRepository.findAll();}

    @Transactional
    public House getById(Integer id){
        Optional<House> house= houseRepository.findById(id);
        return house.get();
    }



}
