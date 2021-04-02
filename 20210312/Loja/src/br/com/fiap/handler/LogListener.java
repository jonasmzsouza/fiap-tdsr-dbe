package br.com.fiap.handler;

import br.com.fiap.interf.PedidoInterface;

public class LogListener implements PedidoListeners {

	@Override
	public void update(PedidoInterface pedido) {
		System.out.println("Registrando log...");
	}

}
