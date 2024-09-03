import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero1 = scanner1.nextInt();
        String asterisco1 = "*";
        for(int i = 0; i < numero1 ;i++){
            System.out.println(asterisco1+"\n");
            asterisco1 = asterisco1 + "*";
        }

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero2 = scanner2.nextInt();
        for(int i = 0; i < numero2 ;numero2--){
            int valor = numero2;
            String asterisco2 = "";
            for(int k = 0; k < valor; k++){
                asterisco2 = asterisco2 + "*";
            }
            System.out.println(asterisco2+"\n");
        }


        Integer valor2 = null;
        Integer total = 0;
        String soma = "";
        ArrayList<String> list = new ArrayList<>();
        list.add("1abc2");
        list.add("pqr3stu8vwx");
        list.add("a1b2c3d4e5f");
        list.add("treb7uchet");
        String nome;
        for(int i = 0; i < list.size(); i++){
            nome = list.get(i);
            Integer valor1 = null;
            for(int k = 0; k < nome.length(); k++) {
                char c = nome.charAt(k);
                if (Character.isDigit(c) && valor1 == null) {
                    valor1 = Character.getNumericValue(c);
                } if (Character.isDigit(c) ) {
                    valor2 = Character.getNumericValue(c);
                }
            }
            soma = String.valueOf(valor1) + String.valueOf(valor2);
            total += Integer.parseInt(soma);
            }
        System.out.println(total);

         */

        ArrayList<String> list = new ArrayList<>();
        list.add("3twone");
        list.add("4nineight55");
        Integer total = 0;
        String nome;
        for(int i = 0; i < list.size(); i++){
            nome = list.get(i);
            String soma = "";
            Service service = new Service();
            String valor = "";
            valor = service.oraganiza(0,nome,"");
            char c = valor.charAt(0);
            char s = valor.charAt(valor.length() -1);
            soma += c;
            soma += s;
            total += Integer.valueOf(soma);
        }
        System.out.println(total);
    }
}
