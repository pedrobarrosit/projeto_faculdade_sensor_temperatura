package applicationSensor;

import dados.sensorDados;

public class SensorResgistra extends sensorDados{
	
	public static void main(String[] args) {
		
		sensorDados temperatura = new sensorDados();
		temperatura.sensorTemperatura();

		sensorDados umidade = new sensorDados();
		umidade.sensorUmidade();
		
		sensorDados gasCarbonico = new sensorDados();
		gasCarbonico.sensorGasCarbonico();
	}
	
}
