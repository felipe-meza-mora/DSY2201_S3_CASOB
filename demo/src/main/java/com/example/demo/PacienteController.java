package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PacienteController {

    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteController() {
        pacientes.add(new Paciente(1,"11.100.200-0","Felipe Meza",Arrays.asList(new Historial(1,LocalDate.of(2023, 8, 01),"Consulta","Medicina General")), Arrays.asList(new Atencion(1,"Examen de Sangre"))));

        pacientes.add(new Paciente(2,"13.021.012-0","Luis Daza",Arrays.asList(new Historial(1,LocalDate.of(2023, 8, 01),"Consulta","Cardiología")), Arrays.asList(new Atencion(1,"Examen de Orina completa"))));

        pacientes.add(new Paciente(3,"13.123.123-0","Elizabeth Maldonado",Arrays.asList(new Historial(1,LocalDate.of(2023, 8, 01),"Consulta","Gastroenterólogo")),Arrays.asList(new Atencion(1,"Perfil lipidico"))));
        
    }

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes() {
        return pacientes;
    }

    @GetMapping("/pacientes/{id}")
    public Object getPacientes(@PathVariable int id) {
        String alerta= "No existe";
        for(Paciente paciente: pacientes){
            if(paciente.getId() == id){
                return paciente;
            }
        }
        return alerta;
    }

    @GetMapping("/pacientes/{id}/historial")
    public List<Historial> getHistorial(@PathVariable int id){
        for(Paciente paciente: pacientes){
            if(paciente.getId() == id){
                return paciente.getHistorial();
            }
        }
        return null;
    }

    @GetMapping("/pacientes/{id}/atenciones")
    public List<Atencion> getAtencions(@PathVariable int id){
        for(Paciente paciente: pacientes){
            if(paciente.getId() == id){
                return paciente.getAtencion();
            }
        }
        return null;
    }


    
    
}
