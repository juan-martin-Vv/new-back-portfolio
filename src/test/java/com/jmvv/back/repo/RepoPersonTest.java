package com.jmvv.back.repo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.jmvv.back.models.Person;


@DataJpaTest
public class RepoPersonTest {

    @Autowired
    private RepoPerson repoPerson;
    
    private final String random_email= "email@email.random";
    private final Integer random_numberId=4_000_000;
    private final Person samplPerson = new Person(
                                    0,
                                    "Jhon",
                                    "Gibsom",
                                    "dump",
                                    "email@email.com",
                                    LocalDate.parse("2000-01-01"),
                                    3_000_000);
    
    
    void insertPerson()
    {
        repoPerson.save(samplPerson);
    }
    @Test
    void testFreeUser() {
        insertPerson();
        assertFalse(repoPerson.freeUser(random_numberId, samplPerson.getEmail()));
        assertFalse(repoPerson.freeUser(samplPerson.getNumberId(), samplPerson.getEmail()));
        assertFalse(repoPerson.freeUser(samplPerson.getNumberId(), random_email));
        assertTrue(repoPerson.freeUser(random_numberId,random_email));
    }
}
