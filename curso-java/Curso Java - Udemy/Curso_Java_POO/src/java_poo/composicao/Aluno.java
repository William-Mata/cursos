package java_poo.composicao;

import java.util.ArrayList;

public class Aluno {
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<Curso>();

	Aluno(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "nome: " + nome;
	}

	Curso getCursoByName(String nome) {

		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				
				return curso;
			}
		}
		return null;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
}
