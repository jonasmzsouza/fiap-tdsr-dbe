package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public BigDecimal aplicar(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean devoAplicar(Pedido pedido) {
		return true;
	}

}
