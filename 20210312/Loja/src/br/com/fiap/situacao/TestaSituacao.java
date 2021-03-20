package br.com.fiap.situacao;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;
import br.com.fiap.handler.EmailListener;
import br.com.fiap.handler.LogListener;

public class TestaSituacao {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(new BigDecimal("100"));

		pedido.handler.subscribe(new EmailListener());
		pedido.handler.subscribe(new LogListener());
		
		System.out.println(pedido.getSituacao());

		pedido.pagar();
		System.out.println(pedido.getSituacao());
		pedido.entregar();

		pedido.abrirChamado();
		// pedido.pagar();
		// System.out.println(pedido.getSituacao());
	}

}
