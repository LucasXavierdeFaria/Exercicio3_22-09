import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacao = 1;
        System.out.println("-----Bem vindo à calculadora de Área e Perímetro de um Retângulo-----");

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite o comprimento: ");
        double comprimento = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(altura, comprimento);

        while(operacao == 1){
            System.out.println("Qual operação deseja realizar?");
            System.out.println("1- Área");
            System.out.println("2- Perímetro");
            System.out.println("3- Sair");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    retangulo.calcularArea(altura, comprimento);
                    break;
                case 2:
                    retangulo.calcularPerimetro(altura, comprimento);
                    break;
                case 3:
                    System.out.println("Obrigado por utilizar o nosso sistema!");
                    operacao = 0;
                    break;
                default:
                    System.out.println("Digite uma opção correta!");
                    break;
            }
        }
    scanner.close();
    }
}