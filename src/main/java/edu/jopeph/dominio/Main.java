package edu.jopeph.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Java basico");
		curso1.setDescricao("Descrição curso Java basico");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Java intermediario");
		curso2.setDescricao("Descrição curso Java intermediario");
		curso2.setCargaHoraria(8);
		
		Curso curso3 = new Curso();
		curso3.setTitulo("Java avançado");
		curso3.setDescricao("Descrição curso Java avançado");
		curso3.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria java");
		mentoria.setDescricao("Descricão mentoria java");
		mentoria.setData(LocalDate.now().plusDays(15));
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricao("Descrição Bootcamp java developer");
		
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(curso3);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("José");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos iniciados DEV: " + dev1.getNome()
		+ " " + dev1.getConteudosInscritos());
		dev1.progredir();
		dev1.progredir();
		System.out.println("Conteudos terminados DEV: " + dev1.getNome()
		+ " " + dev1.getConteudosConcluidos());
		System.out.println();
		
		Dev dev2 = new Dev();
		dev1.setNome("Camilla");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos iniciados DEV: " + dev2.getNome()
		+ " " + dev2.getConteudosInscritos());
		dev2.progredir();
		System.out.println("Conteudos terminados DEV: " + dev2.getNome()
		+ " " + dev2.getConteudosConcluidos());
		
	}
}
