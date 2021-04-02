package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public class DescontoPorValor extends Desconto {

	public DescontoPorValor(Desconto proximo) {
		super(proximo);

	}

	@Override
	public BigDecimal aplicar(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.1"));
	}

	@Override
	protected boolean devoAplicar(PedidoInterface pedido) {
		return pedido.getValor().compareTo(new BigDecimal("500")) > 0;
	}

}
