package br.edu.fema.managedBean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "calc")
@RequestScoped
public class Calculadora {

	private double num1;
	private double num2;
	private double resp;
	private String operacao;
	private boolean rendered;

	public Calculadora() {
		super();
		this.rendered = true;
	}

	public String soma() {
		this.resp = this.num1 + this.num2;
		this.operacao = "  soma ";
		this.rendered = false;
		return null;
	}

	public String subtracao() {
		this.resp = this.num1 - this.num2;
		this.operacao = "  subtração ";
		this.rendered = false;
		return null;
	}

	public String multiplicacao() {
		this.resp = this.num1 * this.num2;
		this.operacao = "  multiplicação ";
		this.rendered = false;
		return null;
	}

	public String divisao() {
		this.resp = this.num1 / this.num2;
		this.operacao = "  divisão ";
		this.rendered = false;
		return null;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double getResp() {
		return resp;
	}

	public void setResp(double resp) {
		this.resp = resp;
	}

	public String getOperacao() {
		return operacao;
	}

	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}

	public boolean isRendered() {
		return rendered;
	}

	public void setRendered(boolean rendered) {
		this.rendered = rendered;
	}

}
