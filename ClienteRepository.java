package com.festas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festas.Entity.Cliente;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {

}
