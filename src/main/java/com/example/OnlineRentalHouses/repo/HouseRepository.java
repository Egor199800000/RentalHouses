package com.example.OnlineRentalHouses.repo;

import com.example.OnlineRentalHouses.entity.House;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository("houseRep")
public interface HouseRepository extends JpaRepository<House,Integer> {

    List<House> findAll();

    Optional<House> findById(Integer id);


}
