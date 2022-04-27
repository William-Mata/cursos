package java_poo.composicao;

import java.util.ArrayList;

public class Curso {
	final String nome;
	final ArrayList<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	public String toString() {
		return "Curso: "+this.nome;
	}
	
	void adiconarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
	
	
	
}
