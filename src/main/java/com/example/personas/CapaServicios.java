package com.example.personas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CapaServicios {


    private List<Persona> personas;

    public CapaServicios() {
        this.personas = new ArrayList<>();
    }


    public List<Persona> ObtenerPersona() {
        return this.personas;

    }

    public Persona createPerson(Persona persona) {
        this.personas.add(persona);
        return persona;
    }

    public Persona obtenerPersonaCedula(String cedula) {
        return this.personas.stream().filter(persona -> persona.getCedula().equals(cedula)).findFirst().get();

    }



    public boolean deletePersona(String cedula) {
        return this.personas.removeIf(persona -> persona.getCedula().equals(cedula));

    }

    public Boolean UpdatePersona(Persona personaActualizada) {

        int index = IntStream.range(0, personas.size()).filter(i -> personas.get(i).getCedula().equals(personaActualizada.getCedula())).findFirst().orElse(-1);
        // ojo sin esto genera error ya que el el retorno en el lado negativo con enteros

        if (index != -1) {
            personas.set(index, personaActualizada);
            return true;
        }
        return false;

    }

    public List<Persona> PersonaPorCiudad(String ciudad){
         return  this.personas.stream()
                 .filter(persona -> persona.getCiudad().equals(ciudad))
                 .collect(Collectors.toList());
    }

}




