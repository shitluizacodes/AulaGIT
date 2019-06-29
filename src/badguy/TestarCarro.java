/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badguy;

/**
 *
 * @author 277061
 */
import java.util.Scanner;

public class TestarCarro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		Carro relampagomcqueen = new Carro();
		
		System.out.println("INSIRA OS DADOS DO CARRO");
		
//		System.out.println("Digite a marca:");
//		relampagomcqueen.setMarca(leia.nextLine());

//		System.out.println("Digite a placa:");
//		relampagomcqueen.setPlaca(leia.nextLine());
//		
//		System.out.println("Digite a cor:");
//		relampagomcqueen.setCor(leia.nextLine());
//		
//		System.out.println("Informe a quantidade de portas:");
//		relampagomcqueen.setPortas(leia.nextInt());
		
		System.out.println("Digite a quilometragem:");
		relampagomcqueen.setKilo(leia.nextDouble());
		
		relampagomcqueen.recebeKmh();
		
//		System.out.println("Informe a classificação do motor:");
//		relampagomcqueen.setMotor(leia.nextDouble());
		
//		relampagomcqueen.Mostrar();
		
	}

}