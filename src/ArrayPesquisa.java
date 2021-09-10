import java.util.Scanner;

public class ArrayPesquisa {
    // Inicializar um array com 10 elementos inteiros positivos. Criar um algoritmo que busque um elemento
    // do array e exiba no console a posição do elemento.

    public static void main(String[] args) {

        // Declarando o array de inteiros
        int[] numeros = new int[10];

        // Número a ser pesquisado
        int elemento;

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
        elemento=scanner.nextInt();
        // Limpeza do buffer
        scanner.nextLine();

        // Efetuar a pesquisa, recebendo o resultado
        posicao=buscarPosicaoElemento(numeros,elemento);

        if(posicao>-1) {
            System.out.println("Número " + elemento + " encontrado na " + (posicao+1) + "a. posição.");
        } else {
            System.out.println("Número não encontrado!");
        }
    }

    public static int buscarPosicaoElemento(int[] numeros, int elemento) {
        // Posição do elemento encontrado no array
        int posicao;

        // Inicializar o controle encontrou/não encontrou
        posicao=-1;

        // Pesquisar pelo número no array
        for(int i=0;i<numeros.length;i++) {
            if(elemento==numeros[i]) {
                // Elemento encontrado
                posicao=i;
            }
        }

        // Retornar o resultado da pesquisa
        return posicao;
    }
}
