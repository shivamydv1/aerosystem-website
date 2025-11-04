package contactus.example.Contact.Us.Mail.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "contact-us")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String name;
    private String email;
    private String phone;
    private String company;
    private String country;

    @JsonProperty("Are You Using a Drone?")
    private DroneUsage droneUsage;
    private String message;


}
