package model;

public class Moto extends Veiculo {
	
	private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }
	
    @Override
    public double calcularCustoManutencao(){
        return 300.0;
    }
    
    @Override
    public void exibirDetalhes() {
    	System.out.println("MOTO");
    	System.out.println("Marca: " + super.getMarca());
    	System.out.println("Modelo: " + super.getModelo());
    	System.out.println("Ano: " + super.getAno());
    	System.out.println("Cilindradas: " + this.cilindradas);
    }

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

}
