public class Quadrado {
	
	private Double lado;
	
	public Quadrado(Double lado){
		this.lado = lado;
	}
	
	public Double calculaArea(){
		return (this.lado * this.lado);
	}
	
	public Double calculaPerimetro(){
		return (this.lado * 4);
	}
	
}
