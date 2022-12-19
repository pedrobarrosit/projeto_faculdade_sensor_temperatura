package dados;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class sensorDados {

	public static void main(String[] args) {
		sensorTemperatura();

	}

	public static void sensorTemperatura() {

		Calendar now = Calendar.getInstance();
		Scanner include = new Scanner(System.in);
		int line = 5;
		int column = 2;
		int a = 0, b, c, d, measure;
		int[][] matriz = new int[line][column];

		System.out.println("--------------Temperature Data-------------");

		for (b = 0; b < line; b++) {
			for (b = 0; b < column; b++) {
				Format structure = new SimpleDateFormat("HH:mm");
				now.add(Calendar.MINUTE, 30);
				structure = new SimpleDateFormat("HH:mm");
				System.out.println(" ");
				System.out.println("-> Time Measurement: " + structure.format(now.getTime()));
				System.out.printf("-> Current Temperature: ");
				matriz[a][b] = include.nextInt();
			}

			for (a = 0; a < line; a++) {
				for (b = 0; b < column; b++) {
					for (c = 0; c < line; c++) {
						for (d = 0; d < column; d++) {
							if (matriz[a][b] < matriz[c][d]) {
								measure = matriz[a][b];
								matriz[a][b] = matriz[c][d];
								matriz[c][d] = measure;
							}
						}
					}
				}
			}
			System.out.println("---------- Temperature Report ----------");
			for (a = 0; a < line; a++) {
				for (b = 0; b < column; b++) {
					System.out.printf("[Temperature: " + matriz[a][b] + "Â°C]");
					System.out.println("");
				}
			}
		}
	}

	public static void sensorCarbonico() {
		Calendar now = Calendar.getInstance();
		Scanner include = new Scanner(System.in);
		int line = 5;
		int column = 2;
		int a, c, b, d, y;
		int[][] matriz = new int[line][column];
		System.out.println("--------------Co2--------------");               
		for (a = 0; a < line; a++) {
			for (c = 0; c < column; c++) {
				Format structure = new SimpleDateFormat("HH:mm");
				now.add(Calendar.MINUTE, 30);
				structure = new SimpleDateFormat("HH:mm");
				System.out.println(" ");
				System.out.println("-> Measurement Time: " + structure.format(now.getTime()));
				System.out.printf("-> Current Carbon dioxide: ");
				matriz[a][c] = include.nextInt();
			}
		}
		for (a = 0; a < line; a++) {
			for (c = 0; c < column; c++) {
				for (b = 0; b < line; b++) {
					for (d = 0; d < column; d++) {
						if (matriz[a][c] < matriz[b][d]) {
							y = matriz[a][c];
							matriz[a][c] = matriz[b][d];
							matriz[b][d] = y;
						}
					}
				}
			}
		}
		System.out.println("---------- CO2 report ----------");
		for (a = 0; a < line; a++) {
			for (c = 0; c < column; c++) {
				System.out.printf("[Carbon dioxide: " + matriz[a][c] + " CO2]");
				System.out.println("");
			}
		}

	}

	public static void sensorUmidade() {
		Calendar now = Calendar.getInstance();
		Scanner include = new Scanner(System.in);
		int line = 5;
		int column = 2;
		int a, b, c, w;
		float aux;
		float[][] matriz = new float[line][column];
		System.out.println("-----------Moisture----------");
		for (a = 0; a < line; a++) {
			for (b = 0; b < column; b++) {
				Format structure = new SimpleDateFormat("HH:mm");
				now.add(Calendar.MINUTE, 30);
				structure = new SimpleDateFormat("HH:mm");
				System.out.println(" ");
				System.out.println("-> Measurement Time: " + structure.format(now.getTime()));
				System.out.printf("-> Current Humidity: ");
				include.useLocale(Locale.US);
				matriz[a][b] = include.nextFloat();
			}
		}
		for (a = 0; a < line; a++) {
			for (b = 0; b < column; b++) {
				for (c = 0; c < line; c++) {
					for (w = 0; w < column; w++) {
						if (matriz[a][b] > matriz[c][w]) {
							aux = matriz[a][b];
							matriz[a][b] = matriz[c][w];
							matriz[c][w] = aux;
						}
					}
				}
			}
		}
		System.out.println("---------- Humidity Report ----------");
		for (a = 0; a < line; a++) {
			for (b = 0; b < column; b++) {
				System.out.printf("[Moisture: " + matriz[a][b] + "%%]");
				System.out.println("");
			}
		}
	}
}
