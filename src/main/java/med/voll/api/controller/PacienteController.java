package med.voll.api.controller;

import med.voll.api.paciente.DadosPaciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("paciente")
public class PacienteController {

    @PostMapping
    public void cadastraPaciente(DadosPaciente dados){
        System.out.println(dados);
    }
}
