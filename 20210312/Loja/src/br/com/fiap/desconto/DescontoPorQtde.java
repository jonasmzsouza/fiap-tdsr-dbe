package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class DescontoPorQtde extends Desconto {

	public DescontoPorQtde(Desconto proximo) {
		super(proximo);

	}

	@Override
	public BigDecimal calcular(Pedido pedido) {
		if (pedido.getQtdItens() > 10) {
			return pedido.getValor().multiply(new BigDecimal("0.5"));
		}

		return proximo.calcular(pedido);
	}

}
