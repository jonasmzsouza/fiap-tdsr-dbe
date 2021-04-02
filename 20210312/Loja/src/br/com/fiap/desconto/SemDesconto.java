package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal aplicar(PedidoInterface pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean devoAplicar(PedidoInterface pedido) {
		return true;
	}

}
