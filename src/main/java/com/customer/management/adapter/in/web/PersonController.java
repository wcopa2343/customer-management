package com.customer.management.adapter.in.web;

import com.customer.management.application.port.out.CreatePersonPort;
import com.customer.management.common.WebAdapter;
import com.customer.management.domain.Client;
import com.customer.management.domain.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequestMapping(value = "/person")
public class PersonController {

    private final CreatePersonPort createPersonPort;

    public PersonController(CreatePersonPort createPersonPort) {
        this.createPersonPort = createPersonPort;
    }

    @PostMapping()
    public Person create(Person person) throws Exception {
        return this.createPersonPort.createPerson(person);
    }
}
