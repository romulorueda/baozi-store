
package com.romulo.baozi_store.repository;

import com.romulo.baozi_store.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
