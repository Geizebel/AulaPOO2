package aula3;

public class Banco  extends Cadeira{

	public Banco(double tamanho, double peso, String cor, String marca, String modelo) {
		super(tamanho, peso, cor, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	public void inclinar(double graus) {
		System.out.println("Não é possivel inclinar");
	}

	public void massagear() {
		System.out.println("Não é possivel massagear");
	}

	
}
