package contactus.example.Contact.Us.Mail.repository;

import contactus.example.Contact.Us.Mail.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User,String> {
}
