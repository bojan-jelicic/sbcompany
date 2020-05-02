package com.sbcompany.demo.repositories;

import com.sbcompany.demo.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

    List<User> findAllByFirstname(String firstname);

    User findByFirstnameAndLastname(String firstname, String lastname);

    List<User> findAllByFirstnameStartingWith(String prefix);

    @Query(value = "SELECT * FROM users WHERE lastname=?1", nativeQuery = true)
    List<User> findAllByLastname(String lastname);
}
