package br.com.fiap.imposto;

import java.math.BigDecimal;

import br.com.fiap.bean.Pedido;

public class CalculadoraDeImposto {

	private Imposto imposto;

	public CalculadoraDeImposto(Imposto imposto) {
		super();
		this.imposto = imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}

	public BigDecimal calcular(Pedido pedido) {
		return imposto.calcular(pedido);
	}

}
