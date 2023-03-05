package com.dh.catalogservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Map;

@FeignClient("movie-service")
public interface IMovieClient {

    @GetMapping("/movies/{genre}")
    List<Map<String, ?>> find(@PathVariable String genre);


}

