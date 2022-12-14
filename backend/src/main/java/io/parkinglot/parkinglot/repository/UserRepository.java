package io.parkinglot.parkinglot.repository;

import io.parkinglot.parkinglot.model.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    public Optional<User> findByCpd(String cpd);
}
