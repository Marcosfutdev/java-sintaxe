package casting;
public class Main{
    public static void main(String[] args){
        // Casting
        // Transformar um valor de um tipo para outro
        // Por exemplo transformar um double em inteiro

        // No java existem duas formas de fazer um Casting

        // Implícito
        // Explícito


        // No implícito, a linguagem o casting isso por si só! Sem declarar essa alteração

        // Por exemplo, trasnformar um inteiro em double!

        int idade_1 = 10;

        double idade_2 = idade_1; // Transforma de forma implícitamente, 10 para 10.00, faixa de representação!

        // Mas eu não consigo transformar um double em inteiro, de forma implícitamente!
           // idade_1 = idade_2;

           // Para isso, eu preciso explícitar para a linguagem esse Casting!
           // Por conta que o inteiro tem uma faixa de representação menor que o double
           // Ou seja, eu estou colocando uma coisa grande dentro de uma menor!
                    //passa dentro de (tipo que eu quero fazer o casting)
           idade_1 = (int) idade_2;


           char letra = 'a';
           // Não posso transformar de forma implícita um char em uma String!
            // Para isso, eu devo explícitar para a linguagem!
            // Devo usar a classe String e um método dela para transformar
            String nome = String.valueOf(letra); // Transformar uma letra em uma String!

            // Se eu quiser trasnformar uma String em uma letra!

            letra = nome.charAt(0);

            // Transformando um inteiro em uma String;
            String idade_3 = String.valueOf(idade_1); // Transforma inteiro em String!
            

            // Ao contrário, não é toda vez!
            // Por exemplo, eu não consigo transformar um nome em um inteiro, mas uma String com números em inteiro!
            idade_1 = Integer.parseInt(idade_3);
            // Transforma uma String de número em Inteiro!



            // Revisão

            // O Casting é transformar um valor de um tipo em outro tipo!

            // No java, temos duas formas de fazer o Casting
            // Implícitamente, a linguagem faz por si só!
            // Explícitamente, quem escreve o programa deve avisar a linguagem para fazer esse Casting!


            // Forma implícita
            // Por exemplo, transformar um inteiro em double!
            // A linguagem faz por si só, pois o valor tem uma faixa de representação menor que o double!
            int valor = 10;
            double valor_1 = valor;

            // O mesmo não acontece na trasnformação inversa!
            // Eu não consigo transformar um double em inteiro de forma implícita!
            // Eu preciso explícitar para a linguagem!
          //   valor = valor_1; // ERRO, POIS TENHO UMA FAIXA DE REPRESENTAÇÃO MAIOR ENTRANDO EM UMA MENOR!
          // SOLUCIONANDO ESSE PROBLEMA
          // Dentro de (), eu passo o tipo que eu quero fazer essa transformação! No caso para inteiro!
            valor = (int) valor_1; // CASTING EXPLÍCITO EM JAVA, PARA NÚMEROS!


            // QUANDO EU FOR FAZER O CASTING EM NÚMEROS EU FAÇO DESSA FORMA!

            byte quant = 10;
            // Consigo transformar um byte em short, pois o short tem uma faixa de representação maior que o byte!
            short quant_1 = quant;

            // Não consigo fazer o inverso!
            // Não consigo transformar um short em byte de forma implícitamente!
            // Pois o byte tem uma faixa de representação menor que o short!
            // Não consigo colocar implíctamente uma coisa grande dentro de uma menor!
            // Devo explícitar para o Java que eu aceito essa transformação, mesmo perdendo essa faixa de representação
            //(Tipo que de alteração, que o valor vai se transformar!)
            quant = (byte) quant_1;


            // Vamos para a transformação de Stirng e char

            // Usamos o Casting explícito, eu preciso explícitar para a linguagem essa transformação, através de métodos
           
            // Transformando char em String!
            char letra_5 = 'c'; // No char, só posso passar aspas simples!

            String nome_5 = String.valueOf(letra_5);


            // Transformando uma String em uma letra(char)
            // Utilizo o vari.charAt(index:0);
            letra_5 = nome_5.charAt(0);


            char letra_6 = 'b';
            String nome_6 = String.valueOf(letra_6); // TRansformando um char em uma String
            // Utlizo a função do valueOf do String!

            // Transformando String em char
            letra_6 = nome_6.charAt(0);




            // Transformando um Inteiro em uma String!
            int numero_1= 10;
            String numero_str = String.valueOf(numero_1);

            // Transformando uma String de número em  um Inteiro
           //  numero_1 = numero_str; Erro, pois um Inteiro não pode receber uma String;
           // Para isso utilizando um método de transformação!
           // do Integer.parseInt(String)
            numero_1 = Integer.parseInt(numero_str);

    }
}