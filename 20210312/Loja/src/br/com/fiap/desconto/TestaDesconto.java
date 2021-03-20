package br.com.fiap.desconto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class TestaDesconto {

	public static void main(String[] args) {

		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

		Pedido pedido = new Pedido(new BigDecimal("100"));

		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);

		System.out.println(desconto);

	}

}
