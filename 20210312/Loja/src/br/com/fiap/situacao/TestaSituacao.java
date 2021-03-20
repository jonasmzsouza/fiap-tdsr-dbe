package br.com.fiap.situacao;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class TestaSituacao {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(new BigDecimal("100"));

		System.out.println(pedido.getSituacao());

		pedido.pagar();
		System.out.println(pedido.getSituacao());
		pedido.entregar();

		pedido.abrirChamado();
		// pedido.pagar();
		// System.out.println(pedido.getSituacao());
	}

}
