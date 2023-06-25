package com.example.OnlineRentalHouses.entity;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "houses")
@Entity
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "address")
    //@NotBlank(message = "address is required field")
    private String address;

    @Column(name = "price")
    //@NotBlank(message = "price is required field")
    private int price;

    @Column(name = "description")
    //@NotBlank(message = "description is required field")
    private String description;

}
