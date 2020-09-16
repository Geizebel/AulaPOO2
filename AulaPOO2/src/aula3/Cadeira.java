package aula3;

public class Cadeira {
	public double tamanho;
	public double peso;
	public String cor;
	private String marca;
	private String modelo;

	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cadeira(double tamanho, double peso, String cor, String marca, String modelo) {

		this.tamanho = tamanho;
		this.peso = peso;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
	}

	public void inclinar(double graus) {
		System.out.println("Inclinar");
	}

	public void massagear() {
		System.out.println("Massagem");
	}
	
	public   String toString() {
		return "Cadeira > tamanho: "+tamanho+" Peso: "+peso+" cor: "+cor+" marca: "+marca+ " modelo: "+modelo;

	}

	public boolean inclinar() {
		// TODO Auto-generated method stub
		return false;
	}
}
