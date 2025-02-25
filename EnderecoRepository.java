package com.festas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festas.Entity.Endereco;

public interface EnderecoRepository extends JpaRepository <Endereco, Long> {

}
