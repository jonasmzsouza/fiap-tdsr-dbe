package br.com.fiap.facade;

import br.com.fiap.interf.PedidoInterface;

public class ChamadoFacade {

	public void abrir(PedidoInterface pedido) {
		System.out.println("Registrar no CRM");
		System.out.println("Registrar no HelpDesk");
		System.out.println("SMS para o gerente");
		System.out.println("Registrar um log de chamado");
	}
}
