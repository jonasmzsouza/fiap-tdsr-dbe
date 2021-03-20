package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class DescontoPorValor extends Desconto {

	public DescontoPorValor(Desconto proximo) {
		super(proximo);

	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getValor().compareTo(new BigDecimal("500")) > 0) {
			return pedido.getValor().multiply(new BigDecimal("0.1"));
		}

		return proximo.calcular(pedido);

	}

}
