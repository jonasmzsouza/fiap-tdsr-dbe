package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public class ICMS extends Imposto {

	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public BigDecimal calcularImposto(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.1"));
	}

}
