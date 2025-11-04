package getdemoDB.example.GetDemo.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "customers")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String country;
    private String city;
    private String address;
    private String postalCode;
    private String product;
}
