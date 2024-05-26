package candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class Candidato {
    String nome;
    double salarioPretendido;

    public Candidato(String nome, double salarioPretendido) {
        this.nome = nome;
        this.salarioPretendido = salarioPretendido;
    }
}

public class ProcessoSeletivo {

    public static void main(String[] args) {
        double salarioBase = 2000.00;
        
        // Case 1
        double salarioPretendido = valorPretendido();
        System.out.println("Salário pretendido pelo candidato: R$ " + salarioPretendido);
        
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
        }

        // Case 2
        String[] candidatosNomes = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
        List<Candidato> candidatos = new ArrayList<>();

        for (String nome : candidatosNomes) {
            double salario = valorPretendido();
            candidatos.add(new Candidato(nome, salario));
        }

        List<Candidato> candidatosSelecionados = new ArrayList<>();

        for (Candidato candidato : candidatos) {
            if (candidatosSelecionados.size() < 5 && candidato.salarioPretendido <= salarioBase) {
                candidatosSelecionados.add(candidato);
            }
        }

        // Case 3:
        System.out.println("\nCandidatos selecionados para entrevista:");
        for (Candidato candidato : candidatosSelecionados) {
            System.out.printf("Nome: " + candidato.nome + ", Salário pretendido: R$ %.2f%n", + candidato.salarioPretendido);
        }

        // Case 4: 
        System.out.println("\nTentativas de contato:");
        for (Candidato candidato : candidatosSelecionados) {
            realizarLigacoes(candidato);
        }
    }

    // simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    // simula a realização de ligações
    static void realizarLigacoes(Candidato candidato) {
        int tentativas = 0;
        boolean contatoRealizado = false;

        while (tentativas < 3 && !contatoRealizado) {
            tentativas++;
            // Simulação de contato
            if (ThreadLocalRandom.current().nextBoolean()) {
                contatoRealizado = true;
                System.out.println("CONSEGUIMOS CONTATO COM " + candidato.nome + " APÓS " + tentativas + " TENTATIVA(S)");
            }
        }

        if (!contatoRealizado) {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato.nome);
        }
    }
}