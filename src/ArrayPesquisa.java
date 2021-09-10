import java.util.Scanner;

public class ArrayPesquisa {
    // Inicializar um array com 10 elementos inteiros positivos. Criar um algoritmo que busque um elemento
    // do array e exiba no console a posição do elemento.

    public static void main(String[] args) {

        // Declarando o array de inteiros
        int[] numeros = new int[10];

        // Número a ser pesquisado
        int numero;

        // Controle se encontrou o número
        boolean encontrou;

        // Posição do elemento encontrado no array
        int posicao;

        // Configurar Scanner para leitura do número encontrado
        Scanner scanner = new Scanner(System.in);

        // Inicializar o array com números de 0 a 9
        for(int i=0;i<10;i++) {
            numeros[i] = i;
        }

        // Solicitar o número a ser pesquisado
        System.out.println("Digite um número entre 0 e 9: ");
        // Leitura do número a ser pesquisado
        numero=scanner.nextInt();
        // Limpeza do buffer
        scanner.nextLine();

        // Inicializar os controles encontrou/não encontrou
        encontrou=false;
        posicao=-1;

        // Pesquisar pelo número no array
        for(int i=0;i<numeros.length;i++) {
            if(numero==numeros[i]) {
                encontrou=true;
                posicao=i;
            }
        }

        // Retornar o resultado da pesquisa
        if(encontrou) {
            System.out.println("Número " + numero + " encontrado na posição " + posicao);
        } else {
            System.out.println("Número não encontrado!");
        }
    }
}
