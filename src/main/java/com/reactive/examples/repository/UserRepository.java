package com.reactive.examples.repository;

import com.reactive.examples.model.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface UserRepository extends ReactiveCrudRepository<User,Integer> {
    Flux<User> findByAge(int age);
}
