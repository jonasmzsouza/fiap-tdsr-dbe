package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public class ICMS implements Imposto {

	@Override
	public BigDecimal calcular(PedidoInterface pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.1"));
	}

}
