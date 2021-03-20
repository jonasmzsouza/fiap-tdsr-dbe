package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class ISS implements Imposto {

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal("0.05"));
	}

}
