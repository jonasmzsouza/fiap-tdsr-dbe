package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public interface Imposto {

	public BigDecimal calcular(Pedido pedido);

}
