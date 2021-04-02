package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.interf.PedidoInterface;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(PedidoInterface pedido) {

		Desconto cadeidaDeDesconto = new DescontoPorValor(new DescontoPorQtde(new SemDesconto()));

		return cadeidaDeDesconto.calcular(pedido);

	}
}
