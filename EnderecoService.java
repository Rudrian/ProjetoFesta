package com.festas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festas.Entity.Cliente;
import com.festas.Entity.Endereco;
import com.festas.Repository.EnderecoRepository;

@Service
public class EnderecoService {

	private final EnderecoRepository enderecoRepository;
	
	@Autowired
	public EnderecoService(EnderecoRepository enderecoRepository) {
		this.enderecoRepository = enderecoRepository;
	}
	public Endereco saveEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	public Endereco getEnderecoById(Long id) {
		return enderecoRepository.findById(id).orElse(null);
	}
	public List<Endereco> getAllEndereco(){
		return enderecoRepository.findAll();
	}
    public void deleteEndereco(Long id) {
    	enderecoRepository.deleteById(id);
    }
}

