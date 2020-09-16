package aula3;

public class Cavalo extends Animal {
	String mama;

	public String comer() {
		return super.comer() + "O cavalo";
	}

	public String dormir() {
		return super.dormir() + "O cavalo ";
	}

	public String fazerBarulho() {

		return super.fazerBarulho() + "O cavalo";
	}

	public String mama() {
		return "O cavalo amamenta ";
	}
}
