package com.festas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.festas.Entity.Tema;

public interface TemaRepository extends JpaRepository <Tema, Long> {

}
