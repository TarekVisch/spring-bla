package com.emsi.demo.Services;

import com.emsi.demo.Models.Client;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class ClientService {
    public List<Client> getClients() {
        return Arrays.asList(
                new Client(1L, "John Doe", "john.doe@example.com", LocalDate.of(1990, 1, 1)),
                new Client(2L, "Jane Doe", "jane.doe@example.com", LocalDate.of(1992, 2, 2))
        );
    }
}
