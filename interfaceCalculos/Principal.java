package interfaceCalculos;

public class Principal {

	public static void main(String[] args) {
		Adicionar adicao = new Adicionar();
		System.out.println("SOMA: " + adicao.somar(10, 5));
		
		Subtrair sub = new Subtrair();
		System.out.println("SUBTRACAO: " + sub.sub(10, 5));
		
		Calcular calculo = new Calcular();
		System.out.println("DIVISAO: " + calculo.div(10, 5));
		System.out.println("MULTIPLICACAO: " + calculo.mult(10, 5));
		
		Expo expoente = new Expo();
		System.out.println("EXPOENTE: " + expoente.exp(10, 5));
	}

}
