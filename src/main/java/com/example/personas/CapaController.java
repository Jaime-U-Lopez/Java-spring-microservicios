package com.example.personas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import  java.util.*;

@Controller
@RestController("/api/v1")
public class CapaController {


    private CapaServicios   capaServicios;
    public CapaController(){

        this.capaServicios = new CapaServicios();
    }


    @GetMapping("get-personas")
    public List<Persona> getPerson(){

        return this.capaServicios.ObtenerPersona();
    }


    @GetMapping("/get-personas/{cedula}")
    public Persona getPersonas( @PathVariable("cedula") String cedula  ){
        return this.capaServicios.obtenerPersonaCedula(cedula);
    }


    @PostMapping("post-personas")
    public Persona createPerson(@RequestBody Persona persona){
        return this.capaServicios.createPerson(persona);
    }

    @DeleteMapping("delete-persona/{cedula}")
    public boolean deletePerson(@PathVariable("cedula") String cedula){
        return this.capaServicios.deletePersona(cedula);
    }

    @GetMapping ("persona-ciudad/{ciudad}")
    public List<Persona> getPersonForCity(@PathVariable("ciudad") String ciudad){
        return this.capaServicios.PersonaPorCiudad(ciudad);
    }

    @PutMapping("put-persona")
    public boolean updatePersonaAll(@RequestBody  Persona persona){
        return  this.capaServicios.UpdatePersona(persona);
    }



}


