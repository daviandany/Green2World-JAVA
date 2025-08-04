import java.util.ArrayList;
import java.util.Scanner;

public class Main.java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista de ecopontos simulados
        ArrayList<String> ecopontos = new ArrayList<>();
        ecopontos.add("Ecoponto Central - Rua Verde, 123");
        ecopontos.add("Cooperativa ReciclaMais - Av. Sustentável, 456");
        ecopontos.add("Ponto de Coleta Bairro Novo - Rua das Árvores, 789");

        // Cadastro do usuário
        System.out.println("=== 🌿 Bem-vindo ao Green2World 🌿 ===");
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        int residuosReciclados = 0; // contador de resíduos reciclados

        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Listar Ecopontos");
            System.out.println("2 - Registrar Resíduos Reciclados");
            System.out.println("3 - Ver Quantidade de Resíduos Reciclados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n📍 Ecopontos disponíveis:");
                    for (String ponto : ecopontos) {
                        System.out.println("- " + ponto);
                    }
                    break;

                case 2:
                    System.out.print("Quantos resíduos você reciclou? ");
                    int quantidade = sc.nextInt();
                    residuosReciclados += quantidade;
                    System.out.println("✅ Registro concluído! Você reciclou mais " + quantidade + " resíduos.");
                    break;

                case 3:
                    System.out.println("\n♻ " + nome + ", você já reciclou um total de " + residuosReciclados + " resíduos.");
                    break;

                case 0:
                    System.out.println("👋 Obrigado por usar o Green2World!");
                    break;

                default:
                    System.out.println("❌ Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
