package com.customer.management.application.port.out;

import com.customer.management.domain.Client;
import com.customer.management.domain.Person;

public interface CreatePersonPort {
    Person createPerson (Person person) throws Exception;

}
