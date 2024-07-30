/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.angie.persona.service;

/**
 *
 * @author natalia
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import xyz.angie.persona.model.Pais;
import xyz.angie.persona.repository.PaisRepository;

@Service
public class PaisService {
	

	@Autowired
	private PaisRepository paisRepository;


	public List<Pais> findAll() {
		return paisRepository.findAll();
	}


}
