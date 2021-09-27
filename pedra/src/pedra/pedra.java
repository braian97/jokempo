package pedra;

import java.util.Scanner;
import java.util.Random;

public class pedra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Digite o numero que determina sua escolha");
		System.out.println("Pedra - 0");
		System.out.println("Papel - 1");
		System.out.println("Tesoura - 2");
		float op = teclado.nextFloat();
		byte cp = (byte)rand.nextInt(2);
		
		float pedra = 0;
		float papel = 1;
		float tesoura = 2;
		
		
		
			if (op == pedra && cp == pedra) {
				System.out.println("Você escolheu Pedra e a Maquina tambem, Empate");
		}else if ( op == papel && cp == papel) {
			System.out.println("Você escolheu Papel e a Maquina tambem, Empate");
		}else if ( op == tesoura && cp == tesoura){
			System.out.println("Você escolheu Tesoura e a Maquina tambem, Empate");
		}else;
		
	
			if(op == pedra && cp == tesoura) {
			System.out.println("Você escolheu Pedra e a maquina tesoura, Parabens voce ganhou");
		}else if ( op == tesoura && cp == papel) {
			System.out.println("Você escolheu tesoura e a maquina papel, parabens voce ganhou");
		}else if( op == papel && cp == pedra){
			System.out.println("Você escolheu papel e a maquina pedra, parabens voce ganhou");
		}else;
		
		
			if(op == tesoura && cp == pedra) {
			System.out.println("Você escolheu tesoura e a maquina pedra, perdedor do caraio");
		}else if ( op == papel && cp == tesoura) {
			System.out.println("Você escolheu papel e a maquina tesoura, perdedor do caraio");
		}else if( op == pedra && cp == papel){
			System.out.println("Você escolheu pedra e a maquina papel, perdedor do caraio");
		}else;
			
			
			teclado.close();
}
}