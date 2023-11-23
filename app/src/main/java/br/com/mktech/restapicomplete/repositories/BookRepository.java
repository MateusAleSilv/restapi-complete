package br.com.mktech.restapicomplete.repositories;

import br.com.mktech.restapicomplete.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}