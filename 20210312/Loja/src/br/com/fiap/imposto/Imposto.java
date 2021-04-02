package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public abstract class Imposto {

	protected Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}

	public BigDecimal calcular(PedidoInterface pedido) {
		BigDecimal valorDoImposto = calcularImposto(pedido);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;

		if (outroImposto != null)
			valorDoOutroImposto = outroImposto.calcular(pedido);

		return valorDoImposto.add(valorDoOutroImposto);
	}

	protected abstract BigDecimal calcularImposto(PedidoInterface pedido);;

}
