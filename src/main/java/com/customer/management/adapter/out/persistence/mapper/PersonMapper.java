package com.customer.management.adapter.out.persistence.mapper;

import com.customer.management.adapter.out.persistence.entity.ClientEntity;
import com.customer.management.adapter.out.persistence.entity.PersonEntity;
import com.customer.management.domain.Client;
import com.customer.management.domain.Person;
import org.springframework.beans.BeanUtils;

public class PersonMapper {

    public static Person EntityToDomain(PersonEntity personEntity) {
        Person person = new Person();
        BeanUtils.copyProperties(personEntity, person);
        return person;
    }

    public static PersonEntity DomainToEntity(Person person) {
        PersonEntity personEntity = new PersonEntity();
        BeanUtils.copyProperties(person, personEntity);
        return personEntity;
    }
}
