package br.com.fiap.handler;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.interf.PedidoInterface;

public class PedidoHandler {
	private List<PedidoListeners> listeners;

	public PedidoHandler() {
		this.listeners = new ArrayList<PedidoListeners>();
	}

	public void subscribe(PedidoListeners listener) {
		listeners.add(listener);
	}

	public void unsubscribe(PedidoListeners listener) {
		listeners.remove(listener);
	}

	public void notifyAll(PedidoInterface pedido) {
		listeners.forEach(listener -> listener.update(pedido));
	}
}
