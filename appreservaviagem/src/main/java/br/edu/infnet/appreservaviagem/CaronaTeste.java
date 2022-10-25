package br.edu.infnet.appreservaviagem;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appreservaviagem.model.domain.Carona;

@Component
public class CaronaTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Carona c1 = new Carona();
		c1.placa = "AAA1B12";
		c1.marca = "Ford";
		c1.modelo = "Ka";
		System.out.println("Carona - " + c1);
		
		Carona c2 = new Carona();
		c2.placa = "BBB1C12";
		c2.marca = "Renault";
		c2.modelo = "Kwid";
		System.out.println("Carona - " + c2);
				
		Carona c3 = new Carona();
		c3.placa = "CCC1D12";
		c3.marca = "Fiat";
		c3.modelo = "Mobi";
		System.out.println("Carona - " + c3);
		
	}

}
