package com.spetch.school;

public class Main {
    public static void main(String[] args) {
        Professor prof1 = new Professor();
        prof1.setNome("Glauberino");
        prof1.setEmail("glauberino@gmail.com");
        prof1.setIdade(27);
        prof1.setSexo("Masculino");
        prof1.setTelefone("(11)997778-4123");

        System.out.println(prof1.toString());

//        String nomeProfessor = prof1.getNome();
//        System.out.println(nomeProfessor);
    }
}
