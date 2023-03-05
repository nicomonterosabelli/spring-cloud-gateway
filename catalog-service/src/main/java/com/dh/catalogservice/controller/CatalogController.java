package com.dh.catalogservice.controller;

import com.dh.catalogservice.client.IMovieClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class CatalogController {

    @Autowired
    private IMovieClient movieClient;

    @GetMapping("catalog/{genre}")
    public Map<String, Object> find(@PathVariable String genre) {
        Map<String, Object> respuesta = new HashMap<String, Object>();
        respuesta.put("Genre", genre);
        respuesta.put("Peliculas", movieClient.find(genre));
        return respuesta;
    }
}
