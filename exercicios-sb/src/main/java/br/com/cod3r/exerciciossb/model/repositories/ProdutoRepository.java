package br.com.cod3r.exerciciossb.model.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);
	
	// finByNomeContaining
	// finByNomeIsContaining
	// finByNomeContains
	
	// finByNomeStartsWith
	// finByNomeEndsWith
	
	// finByNomeNotContaining
	
	@Query("SELECT p FROM Produto p WHERE p.nome like %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome") String nome);
	
}
