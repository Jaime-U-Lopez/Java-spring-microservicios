package com.example.personas;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


public class Persona {


    private String cedula;
    private String nombre;
    private String ciudad;
    private int edad;


    public Persona() {

    }

//Hola
    public Persona(String cedula, String nombre, String ciudad, int edad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getEdad() {
        return edad;
    }
}
