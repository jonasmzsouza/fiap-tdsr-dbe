package br.com.fiap.situacao;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;
import br.com.fiap.handler.EmailListener;
import br.com.fiap.handler.LogListener;
import br.com.fiap.interf.PedidoInterface;
import br.com.fiap.proxy.PedidoProxy;

public class TestaSituacao {

	public static void main(String[] args) {

		PedidoInterface pedido = new PedidoProxy(new Pedido(new BigDecimal("100")));

		System.out.println(pedido.getEndereco());

		// pedido.handler.subscribe(new EmailListener());
		// pedido.handler.subscribe(new LogListener());

		System.out.println(pedido.getSituacao());

		pedido.pagar();
		System.out.println(pedido.getSituacao());
		System.out.println(pedido.getEndereco());
		pedido.entregar();

		pedido.abrirChamado();
		// pedido.pagar();
		System.out.println(pedido.getSituacao());
	}

}
