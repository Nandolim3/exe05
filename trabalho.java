package trabalho;

import java.util.Scanner;

public class trabalho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();
        
        char[] chars = str.toCharArray(); // Converte a string em um array de caracteres
        int i = 0, j = chars.length - 1; // i é o índice do primeiro caractere, j é o índice do último
        while (i < j) { // Enquanto não chegarmos ao meio da string
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        
        String strInvertida = new String(chars); // Cria uma nova string a partir do array de caracteres invertido
        System.out.println("String invertida: " + strInvertida);
    }

}