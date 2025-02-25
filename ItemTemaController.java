package com.festas.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.festas.Entity.ItemTema;
import com.festas.Service.ItemTemaService;

@RestController
@RequestMapping("/ItemTema")
public class ItemTemaController {
	
	private final ItemTemaService itemtemaService;
	
	@Autowired
	public ItemTemaController(ItemTemaService itemtemaService) {
		this.itemtemaService = itemtemaService;
	}
	@PostMapping
	public ItemTema createItemTema(@RequestBody ItemTema itemtema) {
		return itemtemaService.saveItemTema(itemtema);
	}
	@GetMapping("/{id}")
	public ItemTema getItemTemaById(@PathVariable Long id) {
		return itemtemaService.getItemTemaById(id);
	}
	@GetMapping
	public List<ItemTema> getAllItemTema() {
		return itemtemaService.getAllItemTemas();
	}
	@DeleteMapping("/{id}")
	public void deleteItemTema(@PathVariable Long id) {
		itemtemaService.deleteItemTema(id);
	}
}
