package com.example.db.mail.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

//    private String Name;
//    private String email;
//    private String contact;


    // Basic info
    private String country;
    private String city;

    // Drone details
    private List<String> models;

    // Company info
    private String companyName;
    private String website;
    private String businessType;
    private String turnover;

    // Contact info
    private String Name;
    private String jobTitle;
    private String email;
    private String phone;

    // Other details
    private String brands;
    private String message;

    // File info (Business Proposal/Company Profile)
    private String fileName;
    private String fileType;
    private byte[] fileData;
}
