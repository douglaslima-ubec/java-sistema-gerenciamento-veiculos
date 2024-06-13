import model.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoVeiculos {
	
    public static void main(String[] args) {
    	List<Veiculo> listaDeVeiculos = new ArrayList<>();
    	listaDeVeiculos.add(new Carro("Hyundai", "HB20", 2024, 4));
    	listaDeVeiculos.add(new Moto("Honda", "Elite 125", 2024, 124));
    	listaDeVeiculos.add(new Carro("Chevrolet", "Cruze 2023", 2024, 4));
    	listaDeVeiculos.add(new Moto("Yamaha", "Neo 125 UBS", 2024, 125));
    	listaDeVeiculos.forEach(veiculo -> {
    		veiculo.exibirDetalhes();
    		System.out.printf("Custo de manutenção: R$ %,.2f%n", veiculo.calcularCustoManutencao());
    		System.out.println();
    	});
    }
    
}
