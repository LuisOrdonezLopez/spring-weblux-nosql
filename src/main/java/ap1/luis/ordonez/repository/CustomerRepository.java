package ap1.luis.ordonez.repository;

import ap1.luis.ordonez.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
    
}