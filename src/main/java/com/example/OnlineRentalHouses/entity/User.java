//package com.example.demo.entity;
//
////ФИО,
////город, страна, ник, пароль, дата рождения, email
////рейтинг, который выставляется каждой стороной после завершения
////аренды. Рейтинг варьируется от 1–5 звезд
//
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//
//import java.util.List;
//import java.util.Objects;
//
//@Entity
//@Table(name = "users")
//@NoArgsConstructor
//@AllArgsConstructor
//@Data
//public class User {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private Long id;
//
//    @Column(name = "name")
//    private String name;
//
//
//
//    @Column(name = "surname")
//    private String surname;
//
//
//    @Column(name = "country")
//    private String country;
//
//    @Column(name = "city")
//    private String city;
//
//
//
//    @Column(name = "date_of_birth")
//    private String dateOfBirth;
//
//
//
//
//    @Column(name = "email")
//    private String email;
//
//
//    @Column(name = "password_")
//    private String password;
//
//    @Column(name = "rating")
//    private int rating;//рейтинг по звездам, максимум 5
//
//}
