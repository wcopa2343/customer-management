package com.customer.management.application.port.out;

import com.customer.management.domain.Client;

public interface CreateClientPort {

    Client createClient (Client client) throws Exception;
}
