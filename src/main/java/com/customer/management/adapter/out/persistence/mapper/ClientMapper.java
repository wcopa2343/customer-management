package com.customer.management.adapter.out.persistence.mapper;

import com.customer.management.adapter.out.persistence.entity.ClientEntity;
import com.customer.management.domain.Client;
import org.springframework.beans.BeanUtils;

public class ClientMapper {

    public static Client EntityToDomain(ClientEntity clientEntity) {
        Client client = new Client();
        BeanUtils.copyProperties(clientEntity, client);
        return client;
    }

    public static ClientEntity DomainToEntity(Client client) {
        ClientEntity clientEntity = new ClientEntity();
        BeanUtils.copyProperties(client, clientEntity);
        return clientEntity;
    }
}
