package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(Pedido pedido) {
		if (devoAplicar(pedido)) {
			return aplicar(pedido);
		}

		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicar(Pedido pedido);

	protected abstract boolean devoAplicar(Pedido pedido);



}
