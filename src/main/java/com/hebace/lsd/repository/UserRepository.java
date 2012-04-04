package com.hebace.lsd.repository;

import com.hebace.lsd.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Yinka Erinle.
 */
public interface UserRepository extends CrudRepository<User, Long> {
    User findByTheUsersName(String userName);
    User findByLastName(String lastName);
}
