package dados;

import java.util.Random;
import java.util.Arrays;
import java.util.Date;

public class sensorDados {

	public int sensorTemperatura;
	public int sensorGasCarbonico;
	public int sensorUmidade;
	
	public void sensorTemperatura() {
		int[] vet;
		Random random = new Random();
		Date date = new Date();
		vet = new int[48];
		
		for (int i = 0; i<vet.length; i++) {
			vet[i] = random.nextInt(50);
		}
		
		Arrays.sort(vet);
		
		System.out.println("  -------  TEMPERATURA -----------------");
		
		
		for (int j = 0; j<vet.length; j++) {
			
			date = new Date(date.getTime() + 30 * 60 * 1000);
				System.out.println(" Temperatura: " + vet[j] + "ºC");
				System.out.println(" - Data/Hora: " + date);
			    System.out.println("");
		}
		
		
		
		
		
	}
	public void sensorUmidade() {
		int[] vet;
		Random random = new Random();
		Date date = new Date();
		vet = new int[48];
		
		for (int u = 0; u<vet.length; u++) {
			vet[u] = random.nextInt(50);
		}
		
		Arrays.sort(vet);
		
		
		System.out.println("  -------  UMIDADE -----------------");
		
		
		for (int a = 0; a<vet.length; a++) {
			
			
			date = new Date(date.getTime() + 30 * 60 * 1000);
				System.out.println(" Umidade: " + vet[a] + "ºC");
				System.out.println(" - Data/Hora: " + date);
			    System.out.printf("");
		}
	}
	
	public void sensorGasCarbonico(){
		
		int[] vet;
		Random random = new Random();
		Date date = new Date();
		vet = new int[48];
		
		for (int g = 0; g<vet.length; g++) {
			vet[g] = random.nextInt(50);
		}
		
		Arrays.sort(vet);
		
		System.out.println ("  -------  GAS CARBONICO -----------------");
		
		
		for (int c = 0; c<vet.length; c++) {
			
			date = new Date(date.getTime() + 30 * 60 * 1000);
				System.out.println(" Gas Carbonico: " +vet[c]+ " CO2 ");
				System.out.println(" - Data/Hora: " + date);
			    System.out.println("");
		}
		
	}
}
