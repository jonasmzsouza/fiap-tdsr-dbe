package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;
import br.com.fiap.interf.PedidoInterface;

public class TestaImposto {

	public static void main(String[] args) {

		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto(new ISS());
		PedidoInterface pedido = new Pedido(new BigDecimal("200"));

		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);

		calculadoraDeImposto.setImposto(new ICMS());
		imposto = calculadoraDeImposto.calcular(pedido);
		System.out.println(imposto);
	}

}
