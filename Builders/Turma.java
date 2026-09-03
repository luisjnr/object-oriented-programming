public class Turma {

	public static void printAlu(Aluno[] alu, int m){
		if(m<0) return;
		printAlu(alu, (m-1));
		System.out.println("Nome: " + alu[m].nome + ", Resultado: " + alu[m].resultado());
	}
	
    public static void main(String[] args) {
		Aluno alu[] = new Aluno[2];
		alu[0] = new Aluno("Luis", 7.0, 9.0);
		alu[1] = new Aluno("João", 5.0, 9.0);
    
		System.out.println("Lista de alunos");
		printAlu(alu, (alu.length-1));
    }

}
