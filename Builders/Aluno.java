public class Aluno {
	String nome;
	Double nota1 = 0.0, nota2 = 0.0;
	
	public Aluno(String nome, Double nota1, Double nota2){
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public Double media(){
		return (this.nota1 + this.nota2) / 2;
	}
	
	public String resultado(){
		return media() >= 6 ? "Aprovado." : "Reprovado.";
	}
}
