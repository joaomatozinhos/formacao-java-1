package jdbc.bytebank.src.main.java.br.com.alura.bytebank.domain.conta;

import jdbc.bytebank.src.main.java.br.com.alura.bytebank.domain.cliente.DadosCadastroCliente;

public record DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente) {
}
