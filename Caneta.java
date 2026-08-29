public class Caneta {
	private String modelo, cor;
	private float ponta;
	private int carga;
	private boolean tampa;
	
	public Caneta(String modelo, String cor, float ponta, int carga){
		this.modelo = modelo;
		this.cor = cor;
		this.ponta = ponta;
		this.carga = carga;
		this.tampa = true;
	}
	
	public void status(){
		System.out.println("Uma caneta " + this.cor +
		"\ntampada? " + this.tampa + "\nModelo: " + this.modelo
		+ "\nPonta: " + this.ponta + "\nCarga: " + this.carga);
	}
	
	public void rabiscar(){
		if(this.tampa)	
			System.out.println("Impossível rabiscar! Caneta tampada.");
		else
			System.out.println("Rabiscando.");
	}
	
	public void tampar(){
		this.tampa = true;
	}

	public void destampar(){
		this.tampa = false;
	}
	
	
}
