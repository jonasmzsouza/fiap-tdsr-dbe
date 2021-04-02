package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public interface Imposto {

	public BigDecimal calcular(PedidoInterface pedido);

}
