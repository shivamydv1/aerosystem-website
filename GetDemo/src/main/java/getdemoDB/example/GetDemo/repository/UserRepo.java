package getdemoDB.example.GetDemo.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import getdemoDB.example.GetDemo.Entity.User;

public interface UserRepo extends MongoRepository <User,String> {
    
}
