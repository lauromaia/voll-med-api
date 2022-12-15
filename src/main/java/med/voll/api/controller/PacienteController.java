package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.paciente.DadosPaciente;
import med.voll.api.paciente.Paciente;
import med.voll.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @Autowired
    PacienteRepository pacienteRepository;
    @PostMapping
    public void cadastraPaciente(@RequestBody @Valid DadosPaciente dados){
        pacienteRepository.save(new Paciente(dados));
    }
}
