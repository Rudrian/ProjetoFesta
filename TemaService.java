package com.festas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festas.Entity.Tema;
import com.festas.Repository.TemaRepository;

@Service
public class TemaService {
	
	private final TemaRepository temaRepository;
	
	@Autowired
	public TemaService(TemaRepository temaRepository) {
	this.temaRepository = temaRepository;
	}
	public Tema saveTema(Tema tema) {
		return temaRepository.save(tema);
	}
	public Tema getTemaById(Long id) {
		return temaRepository.findById(id).orElse(null);
	}
    public List<Tema> getAllTemas() {
        return temaRepository.findAll();
    }
    public void deleteTema(Long id) {
        temaRepository.deleteById(id);
    }
}
