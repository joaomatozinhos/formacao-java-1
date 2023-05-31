package jdbc.src.main.java.br.com.alura.bytebank.domain.conta;

import jdbc.src.main.java.br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
