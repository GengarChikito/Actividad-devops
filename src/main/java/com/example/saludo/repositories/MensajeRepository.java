package com.example.saludo.repositories;

import com.example.saludo.models.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
// JpaRepository<Tipo_de_la_Entidad, Tipo_del_ID>
// Esto proporciona automáticamente métodos CRUD (Crear, Leer, Actualizar, Borrar)
public interface MensajeRepository extends JpaRepository<Mensaje, Long> {

}