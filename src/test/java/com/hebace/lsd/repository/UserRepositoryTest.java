package com.hebace.lsd.repository;

import com.hebace.lsd.domain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * @author Yinka Erinle.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application-context.xml")
@Transactional
public class UserRepositoryTest {

    @Autowired
    UserRepository repository;


    /**
     * Tests inserting a user and asserts it can be loaded again.
     */
    @Test
    public void testInsert() {

        User user = new User();
        user.setUsername("yinka");

        user = repository.save(user);

        assertEquals(user, repository.findOne(user.getId()));
        assertThat(user.getFirstName(), is("yinka"));
    }
}
