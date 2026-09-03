import java.util.Scanner;

public class Fatura {
	
    int numero, quantidade;
    String descricao;
    Double preco;
    
    public Fatura(int numero ,int quantidade, String descricao, Double preco){
		this.numero = numero;
		this.quantidade = quantidade < 0 ? 0 : quantidade;
		this.descricao = descricao;
		this.preco = preco < 0 ? 0.0 : preco;
	}
	
	public Double getValorDaFatura(){
		return (this.quantidade * this.preco);
	}
}
