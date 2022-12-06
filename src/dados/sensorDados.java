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
			System.out.printf("Temperatura: " + vet[j] + "ºC");
			System.out.printf(" - Data/Hora: " + date);
			System.out.printf("");
		}
		
	}
}
