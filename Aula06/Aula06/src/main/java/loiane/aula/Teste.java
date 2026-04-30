package loiane.aula;

public class Teste {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Tyrion");
        // contato.setEndereco("King Land");
        contato.setTelefone("11999999999");


        // criar objeto do endereço
        Endereco end = new Endereco();
        end.setNomeRua("Rua Dom Tomás de Noronha");
        end.setNumero("141");
        end.setComplemento("n/a");
        end.setCidade("São Paulo");
        end.setEstado("São Paulo");
        end.setCep("02877040");

        // contato.setEndereco(end);

        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());
        if (contato !=  null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }
    }

}
