package java_poo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("William");
		Aluno aluno2 = new Aluno("Nina");
		Aluno aluno3 = new Aluno("Solange");

		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Full Stack 2022");
		Curso curso3 = new Curso("ADS");
		
		curso1.adiconarAluno(aluno1);
		curso1.adiconarAluno(aluno2);
		
		
		curso2.adiconarAluno(aluno2);
		aluno1.adicionarCurso(curso2);
		
		aluno1.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		
		System.out.println(aluno1.getCursoByName("Java Completo"));

		System.out.println("Alunos do Curso 1: " + curso1.alunos);
		System.out.println("Alunos do Curso 2: " + curso2.alunos);		
		System.out.println("Alunos do Curso 3: " + curso3.alunos);
	}

}
