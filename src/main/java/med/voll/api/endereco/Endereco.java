package med.voll.api.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;
    private String complemento;
    private String numero;

    public Endereco(DadosEndereco endereco) {
        this.bairro = endereco.bairro();
        this.logradouro = endereco.logradouro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
        this.uf = endereco.uf();
    }

    public void atualizar(DadosEndereco dados) {
        if(dados.bairro() != null){
            this.bairro = dados.bairro();
        }
        if(dados.logradouro() != null){
            this.logradouro = dados.logradouro();
        }
        if(dados.cep() != null){
            this.cep = dados.cep();
        }
        if(dados.cidade() != null){
            this.cidade = dados.cidade();
        }
        if(dados.complemento() != null){
            this.complemento = dados.complemento();
        }
        if(dados.numero() != null){
            this.numero = dados.numero();
        }
        if(dados.uf() != null){
            this.uf = dados.uf();
        }
    }
}
