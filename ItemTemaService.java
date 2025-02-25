package com.festas.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.festas.Entity.ItemTema;
import com.festas.Repository.ItemTemaRepository;

@Service
public class ItemTemaService {

	private final ItemTemaRepository itemtemaRepository;
	
	@Autowired
	public ItemTemaService(ItemTemaRepository itemtemaRepository) {
		this.itemtemaRepository = itemtemaRepository;
	}
	public ItemTema saveItemTema(ItemTema itemtema) {
		return itemtemaRepository.save(itemtema);
	}
	public ItemTema getItemTemaById(Long id) {
		return itemtemaRepository.findById(id).orElse(null);
	}
	public List<ItemTema> getAllItemTemas(){
		return itemtemaRepository.findAll();
	}
    public void deleteItemTema(Long id) {
        itemtemaRepository.deleteById(id);
    }
}
