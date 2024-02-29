package candidaturas;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);

        }

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuaTentanto = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuaTentanto = !atendeu;
            if (continuaTentanto)
                tentativasRealizadas++;
            else
            System.out.println("Contato realizado com sucesso");
            
        }while(continuaTentanto && tentativasRealizadas < 3);

        if (atendeu) 
            System.out.println("Conseguimos contato com " + candidato + ", na "+ tentativasRealizadas + " tentativa");
        else
            System.out.println("Não conseguimos contato com " + candidato + ", número maximo tentativas "+ tentativasRealizadas + " realizadas");    

    }

    //método auxiliar
        static boolean atender() {
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados() {

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice = 0; indice < candidatos.length;indice++) {
            System.out.println("O candidato de nº " + (indice+1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for eah");

        for(String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }


    }
    static void selecaoCandidato(){
        //Array com lista de candidatos

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};        
        
        int candidatosSelecionado = 0;
        int candidatoAtual = 0;
        double salaraioBase = 2000.0;
        while (candidatosSelecionado < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salaraioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salaraioPretendido);
            if (salaraioBase >= salaraioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionado++;
                
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salaraioPretendido) {
        double salaraioBase = 2000.0;
        if (salaraioBase > salaraioPretendido) {
            System.out.println("Ligar para o candidato");            
        }else if(salaraioBase==salaraioPretendido)
            System.out.println("Ligar para o candidato com contra proposta");
         else {
            System.out.println("Aguardando o resultado dos demais candidatos");
         }   
    }
    
}