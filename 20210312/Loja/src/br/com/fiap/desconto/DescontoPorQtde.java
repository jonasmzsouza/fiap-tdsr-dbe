package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public class DescontoPorQtde extends Desconto {

	public DescontoPorQtde(Desconto proximo) {
		super(proximo);

	}

	@Override
	public BigDecimal aplicar(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.5"));
	}

	@Override
	protected boolean devoAplicar(PedidoInterface pedido) {
		return pedido.getQtdItens() > 10;
	}

}
