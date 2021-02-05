package cadFun;

public class Terceiro extends Empregado implements Calculos{
	private double acrescimo;
	
	public Terceiro(String nome, int matricula, int horas, double valorHoras, double acrescimo) {
		super(nome, matricula, horas, valorHoras);
		this.acrescimo = acrescimo;
	}
	
	public double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}

	
	@Override
	public double salario() {
		return super.salario()+(super.salario()*acrescimo/100);
	}

}
