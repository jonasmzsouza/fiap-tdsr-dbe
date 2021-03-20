package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Pedido pedido) {

		Desconto cadeidaDeDesconto = new DescontoPorValor(new DescontoPorQtde(new SemDesconto()));

		return cadeidaDeDesconto.calcular(pedido);

	}
}
