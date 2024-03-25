package com.customer.management.adapter.in.web;

import com.customer.management.application.port.out.CreateClientPort;
import com.customer.management.common.WebAdapter;
import com.customer.management.domain.Client;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@WebAdapter
@RestController
@RequestMapping(value = "/client")
public class ClientController {

    private final CreateClientPort createClientPort;

    public ClientController(CreateClientPort createClientPort) {
        this.createClientPort = createClientPort;
    }

    @PostMapping()
    public Client create(Client client) throws Exception {
        return this.createClientPort.createClient(client);
    }
}
