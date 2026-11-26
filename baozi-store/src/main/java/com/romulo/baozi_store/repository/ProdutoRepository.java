
package com.romulo.baozi_store.repository;

import com.romulo.baozi_store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
