package med.voll.api.paciente;

import med.voll.api.medico.DadosEndereco;

public record DadosPaciente(String nome, String email, String telefone, String cpf, DadosEndereco endereco) {
}
