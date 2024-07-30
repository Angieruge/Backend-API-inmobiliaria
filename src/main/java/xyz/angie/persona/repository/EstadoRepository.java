/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package xyz.angie.persona.repository;

/**
 *
 * @author natalia
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.angie.persona.model.Estado;


@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}