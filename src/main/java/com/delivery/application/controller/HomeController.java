package com.delivery.application.controller;

import com.delivery.application.utils.http.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping( value = {"/", "/index"})
public class HomeController {

    @GetMapping(value = {"/"})
    public Response<Object> index(){

        List<String> lista = Arrays.asList("naranja", "mandarina", "calabaza");

        String dato = "mensaje de datos";

        return Response.ok().setData(dato).setMessage("welcome to delivery application");

    }

    @GetMapping(value = {"/saludo"})
    public String saludo(){
        return "Hola Mundo";
    }

}

