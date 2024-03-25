package com.customer.management.adapter.out.persistence.dao;

import com.customer.management.adapter.out.persistence.entity.PersonEntity;
import com.customer.management.adapter.out.persistence.mapper.PersonMapper;
import com.customer.management.adapter.out.persistence.repository.PersonEntityRepository;
import com.customer.management.application.port.out.CreatePersonPort;
import com.customer.management.common.PersistenceAdapter;
import com.customer.management.domain.Person;

@PersistenceAdapter
public class CreatePerson implements CreatePersonPort {

    private final PersonEntityRepository personEntityRepository;

    public CreatePerson(PersonEntityRepository personEntityRepository) {
        this.personEntityRepository = personEntityRepository;
    }

    @Override
    public Person createPerson(Person person) throws Exception {
        try {
            PersonEntity personEntity = this.personEntityRepository.save(
                    PersonMapper.DomainToEntity(person));
            return PersonMapper.EntityToDomain(personEntity);

        } catch (Exception e) {
            throw new Exception();
        }
    }
}
