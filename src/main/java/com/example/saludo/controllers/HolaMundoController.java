package com.example.saludo.controllers;

import com.example.saludo.models.Mensaje;
import com.example.saludo.repositories.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HolaMundoController {

    // Inyección de dependencia del repositorio
    @Autowired
    private MensajeRepository mensajeRepository;

    @GetMapping("/")
    public String saludo(){
        // 1. Crear un mensaje
        String nuevoContenido = "Hola mundo desde SpringBoot, conectado a la DB!";
        Mensaje nuevoMensaje = new Mensaje(nuevoContenido);

        // 2. Guardar el mensaje en la base de datos
        mensajeRepository.save(nuevoMensaje);

        // 3. Recuperar todos los mensajes de la base de datos
        List<Mensaje> mensajes = mensajeRepository.findAll();

        // 4. Retornar una confirmación y el número total de registros
        return "Se guardó el mensaje: \"" + nuevoContenido + "\". Total de registros en DB: " + mensajes.size();
    }
}