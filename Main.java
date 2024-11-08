public class Main {
    public static void main(String[] args) {
      // Existe duas formas de nomear variáveis em JAVA:
      // Escopo Global
      // Escopo Local

      //Global:
      // tipo nome_var = valor;
      int idade = 16;
      // não preciso passar um valor logo na declaração
      // para o tipo desse valor, pois eu passo logo o tipo
      int quantidade;
      // quantidade = "10"; Erro, pois ela é do tipo inteiro!

      //Local
      // variaveis de escopo local
      // var nome_var = valor;
      // através do valor, ele indetifica
      // o tipo de dado que a variável armazena!
        var nome = " Marcos ";
       // nome = 22; Vai dar um erro, pois ela recebe apenas string;
        nome = "Paulo"; // String, posso passar!
        // var idade; Errado, pois as de escopo precisam que um valor seja passado na declaração,
        //para que seja possível inferir o tipo que ela armazena!



        // Tipos primitivos, no Java existe 8 tipos primitivos, 4 são usados para inteiro;
         // Importante para o espaço de armazenamento
        // byte = -128 a 127, ligado a 8 bits
        // short = -32.768 to 32.767, ligado a 16 bits
        // int = 2 milhoes, ligado a 32 bits
        // long = bilhões; // ligado a 64 bits

        // Declarando um número pequeno, byte -128 a 127
        byte idadeAluno = 25;
        // Declarando um número até 32 mil
        short valorCarro = 32000;
        //Declarando um valor de int, até 2 milhões e uns quebrados;!
        int casaFortaleza = 200000000;
        // casaFortaleza = 3000000000;, erro, pois passa de dois milhões e seus quebrados!

        // long
        long valorGigante = 500000000;

        // byte = -128 a 127
        // short = menos trinta e dois mil e uns quebrados 
        // para trinta e dois e mil e uns quebrados;
        // int que vai até dois milhões;

        // Por isso é importante nomear cada variável de acordo com seu armazenamento!
        // 8 bits
        byte idade_aluna = 25;

        // 16 bits
        short valor_moto = 32000;

        // 32 bits
        int valor_brasil = 200000000;

        // 64 bits
        long valor = 25425254;


        // Outros tipos primitivos
        // dados lógicos
        boolean isValid = true;
        isValid = false; 

        // para um único caractere
        char letra = 'A';

        // String, mas não é um tipo primitivo, mas sim uma classe!
        String nome_professor = "Carlos";


        // Números com ponto
        // Usamos double, float
        // A única diferença é que o double armazena mais casas depois da vírgula!
         
        float valorPao = 2.50F; // No float, colocar o F no final, para ele entender que é Float!
        double valorSalario = 400.50;
        
    }
}
