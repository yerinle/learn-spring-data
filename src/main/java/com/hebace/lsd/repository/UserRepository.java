package com.hebace.lsd.repository;

import com.hebace.lsd.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Yinka Erinle.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByFirstName(String firstName);
    User findByLastName(String lastName);

}
