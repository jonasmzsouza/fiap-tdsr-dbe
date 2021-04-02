package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public BigDecimal calcular(PedidoInterface pedido) {
		if (devoAplicar(pedido)) {
			return aplicar(pedido);
		}

		return proximo.calcular(pedido);
	}

	protected abstract BigDecimal aplicar(PedidoInterface pedido);

	protected abstract boolean devoAplicar(PedidoInterface pedido);



}
