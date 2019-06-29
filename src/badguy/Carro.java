/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package badguy;

import java.util.Scanner;

/**
 *
 * @author 277061
 */
public class Carro {
    
    	public String cor;
	public int portas;
	public String marca;
	public double motor;
	public String placa;
	public double kilo;
	public double novoKilo;
	
	public Carro() {
		this.cor = cor;
		this.portas = portas;
		this.marca = marca;
		this.motor = motor;
		this.placa = placa;
		this.kilo = kilo;
		this.novoKilo = novoKilo;
		
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getMotor() {
		return motor;
	}
	public void setMotor(double motor) {
		this.motor = motor;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public double getKilo() {
		return kilo;
	}
	public void setKilo(double kilo) {
		this.kilo = kilo;
	}
	public double getnovoKilo() {
		return novoKilo;
	}
	public void setnovoKilo(double novoKilo) {
		this.novoKilo = novoKilo;
	}
	
		public void recebeKmh(){
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a nova quilometragem: ");
		this.novoKilo = leia.nextDouble();
		
		this.novoKilo += this.kilo;

		if(this.novoKilo >= 5000){
			System.out.println("Este carro está velho :(");
		} else if(this.novoKilo < 5000) {
			System.out.println("Nova quilometragem: "+novoKilo+". Tudo certo! Seu carro ainda pode rodar. Deseja adicionar mais quilômetros? [S / N]");			
			String r = leia.nextLine();			
			if (r.equalsIgnoreCase("s")) {
				System.out.println("Digite a novsssa quilometragem: ");
				this.novoKilo = leia.nextDouble();
				
				if (this.novoKilo >= 5000) {
					System.out.println("Este carro está velho :(");
				}
				
			} else if(r.equalsIgnoreCase("n")) {
				System.out.println("Tchau!");
			}
			
		}
		
	}
	
	public void Mostrar(){
		System.out.println("DADOS DO CARRO");
		System.out.println("Marca: "+this.marca);
		System.out.println("Cor: "+this.cor);
		System.out.println("Portas: "+this.portas);
		System.out.println(this.kilo+" quilômetros rodados");
		System.out.println("Motor: "+this.motor);
		System.out.println("Placa: "+this.placa);
	}
	
	@Override
	public String toString() {
		return "Dados do Carro [cor: " + cor + ", portas: " + portas + ", marca: " + marca + ", motor: " + motor + ", placa: " + placa
				+ ", kilo: " + kilo + "]";
	}

}
