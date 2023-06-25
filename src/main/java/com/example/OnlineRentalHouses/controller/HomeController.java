package com.example.OnlineRentalHouses.controller;



import com.example.OnlineRentalHouses.entity.House;
import com.example.OnlineRentalHouses.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {

@Autowired
    private HouseService houseService;


    @GetMapping(value = "/main")
    public String getHome(Model model){
        List<House> list=houseService.getAllHouses();

        model.addAttribute("houses",list);
        return "main";
    }

    @GetMapping(value = "main/viewHouse/{id}")
    public String viewHouse(@PathVariable("id") Integer id,Model model){
        House house=houseService.getById(id);
        model.addAttribute("details",house);
        return "more";
    }


    @GetMapping("/def")
    public String defaultPage(Model model){
        return "def";
    }



}
