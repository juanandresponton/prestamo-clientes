package com.spjap.service.imp;


import com.spjap.model.Cliente;
import com.spjap.repository.ClienteRepository;
import com.spjap.service.IClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService implements IClienteService {

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente getClienteById(Long id) {
        return clienteRepository.getReferenceById(id);
    }

    @Override
    public Cliente createCliente(Cliente cliente) {

        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }
}
