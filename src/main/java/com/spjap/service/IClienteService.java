package com.spjap.service;

import com.spjap.model.Cliente;

public interface IClienteService {

    Cliente getClienteById(Long id);

    Cliente createCliente(Cliente cliente);

    Cliente updateCliente(Cliente cliente);

    void deleteCliente(Long id);
}

