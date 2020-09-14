package aula3;

public class AnimalTeste {
	public static void main(String[] args) {

		Animal animal = new Animal();
		Passaro passaro = new Passaro();
		Cavalo cavalo = new Cavalo();
		
		System.out.println(passaro.botarOvo());
		System.out.println(cavalo.comer());
		System.out.println(cavalo.mama());
		System.out.println(cavalo.dormir());
		System.out.println(passaro.fazerBarulho());
	}
}
