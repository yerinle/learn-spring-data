package com.hebace.lsd.domain;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * @author Yinka Erinle.
 */
public class User extends AbstractPersistable<Long> {

    private String firstName;
    private String lastName;

    public User() {
        this.setId(null);
    }

    public User(Long id) {
       this.setId(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setUsername(String firstName) {
        this.firstName = firstName;
    }
}
