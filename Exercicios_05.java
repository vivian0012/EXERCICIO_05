import java.util.Locale;
import java.util.Scanner;

class Cadastro {
    String nome;
    String sobrenome;
    final static int conta = 1523649;
    Double valor_conta = 0.0;

     void Cadastro_01(String nome ){
        this.nome = nome;

    }
    
}

public class Exercicios_05 {

    public static void main(String[] args) {

        // CADASTRAMENTO DE CONTA
        Scanner saldo = new Scanner(System.in);
        saldo.useLocale(Locale.US);

        Cadastro cadastramento = new Cadastro();

        System.out.println("INICIAREMOS O CADASTRO DE SUA CONTA");
        System.out.print("Nome: ");
        String nome = saldo.next();
        System.out.print("Sobrenome: ");
        String nome_sobrenome = saldo.next();

        cadastramento.nome = nome;
        cadastramento.sobrenome = nome_sobrenome;
        System.out.println("==========================================================");
        System.out.println("Nome: " + cadastramento.nome + " " + cadastramento.sobrenome);
        System.out.println("Conta: " + cadastramento.conta);
        System.out.println("Saldo: R$" + String.format("%.2f", cadastramento.valor_conta));


        System.out.println("===========================================================");

        // DEPOSITO E SAQUES

        while (true) {
            System.out.println("GOSTARIA DE FAZER UM DEPOSITO INICIAL? [SIM/NAO] ");
            String resposta = saldo.next();
            String reposta_01 = resposta.toUpperCase();

            // DEPOSITO
            if (reposta_01.equals("SIM")) {
                System.out.println("Valor atual: R$" + cadastramento.valor_conta);
                System.out.print("Qual o valor do deposito? R$ ");
                Double depositos = saldo.nextDouble();
                cadastramento.valor_conta = depositos;
                System.out.println("Valor depositado.");
                System.out.println("Valor atual: R$" + cadastramento.valor_conta);
                System.out.println("======================================================");

                // SAQUE
                System.out.println("Gostaria de fazer um saque? [SIM/NAO]");
                String saque_choose_01 = saldo.next();
                String saque_choose_02 = saque_choose_01.toUpperCase();
                System.out.println("======================================================");

                if (saque_choose_02.equals("SIM")) {
                    System.out.println("Quanto gostaria sacar? ");
                    double valor_saque = saldo.nextDouble();
                    if (valor_saque <= cadastramento.valor_conta) {
                        System.out.println("VALOR DE SAQUE: -R$" + String.format("%.2f", valor_saque));
                        cadastramento.valor_conta = cadastramento.valor_conta - valor_saque;
                        System.out.println("Valor de saque aceito.");
                        System.out.println("VALOR EM CONTA ATUAL: R$" + String.format("%.2f", cadastramento.valor_conta));
                    } else {
                        System.out.println("Valor atual: R$" +  String.format("%.2f", cadastramento.valor_conta));
                        System.out.println("Valor acima do valor em conta");
                    }
                    break;

                }

            } else if (reposta_01.equals("NAO")) {
                System.out.println("======================================================");
                System.out.println("AGRADECEMOS O CADASTRAMENTO.");
                break;

            } else {
                System.out.println("Digite um valor válido.");

            }
        }

    }
}
