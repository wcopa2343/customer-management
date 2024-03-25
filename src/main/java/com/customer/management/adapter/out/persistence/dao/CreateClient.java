package com.customer.management.adapter.out.persistence.dao;

import com.customer.management.adapter.out.persistence.entity.ClientEntity;
import com.customer.management.adapter.out.persistence.mapper.ClientMapper;
import com.customer.management.adapter.out.persistence.repository.ClientEntityRepository;
import com.customer.management.application.port.out.CreateClientPort;
import com.customer.management.common.PersistenceAdapter;
import com.customer.management.domain.Client;

@PersistenceAdapter
public class CreateClient implements CreateClientPort {

    private final ClientEntityRepository clientEntityRepository;

    public CreateClient(ClientEntityRepository clientEntityRepository) {
        this.clientEntityRepository = clientEntityRepository;
    }

    @Override
    public Client createClient(Client client) throws Exception {
        try {
            ClientEntity clientEntity = this.clientEntityRepository.save(ClientMapper.DomainToEntity(client));
            return ClientMapper.EntityToDomain(clientEntity);
        } catch (Exception e) {
            throw new Exception();
        }
    }
}
