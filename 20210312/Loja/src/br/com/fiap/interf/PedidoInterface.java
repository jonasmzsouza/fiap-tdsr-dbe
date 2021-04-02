package br.com.fiap.interf;

import java.math.BigDecimal;

import br.com.fiap.situacao.Situacao;

public interface PedidoInterface {

	String getEndereco();

	void abrirChamado();

	BigDecimal getValor();

	int getQtdItens();

	void pagar();

	void entregar();

	void cancelar();

	void reabrir();

	void setSituacao(Situacao situacao);

	Situacao getSituacao();

}