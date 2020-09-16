  package aula3;

public class CadeiraDePraia  extends Cadeira{
	String durabilidade;
	boolean inclina;

	

	public CadeiraDePraia(String durabilidade, double tamanho, double peso, String cor, String marca, String modelo, boolean inclina) {
		super(tamanho, peso, cor, marca, modelo);
		// TODO Auto-generated constructor stub
	}

	public String getDurabilidade() {
		return durabilidade;
	}

	public void setDurabilidade(String durabilidade) {
		this.durabilidade = durabilidade;
	}

	
	public boolean inclinar() {
		
		if (inclina = true ) {
			System.out.println( "a cadeira inclina");
			return true;
		}
		else {
			System.out.println("não inclina");
			return false;
		}
	
	}


	public void massagear() {
		System.out.println("Não realiza massagens! ");
	}
	public static void main(String[] args) {
		
		CadeiraDePraia praia = new CadeiraDePraia("media",10,20,"roxa","Plastico e cia","praia reclinavel", true);
		System.out.println(praia.toString());
		System.out.println(praia.inclinar());

		
	}

	

	
}
