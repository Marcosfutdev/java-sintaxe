package vetores;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
       // tipo[] nome_vetor;

       // tipos primitivos:
       // byte
       // short
       // int
       // long
       // char
       // boolean
       // double
       // float
       
       //Classes
       // String
        // tipo[] nome =  inicializar;
        int[] numeros = {2,3, 4}; // ele vai ter length de 3
       // Para usar um array em Java, primeiro eu preciso inicializar esse array.
       // Não posso atribuir valores ao array, sem antes iniciar ele.
       // Por exemplo
         numeros[0] = 22;
         numeros[1] = 34;
         numeros[2] = 45;
        // numeros[4] = 34; Erro, pois não temos esse tamanho!

        // Podemos iniciar o Array de outra forma
        // tipo[] nome = inicializa = new tipo[tamanho];
        int[] idades = new int[10];

        byte[] numeros_p = new byte[2];

        short[] numeros_s =  new short[4];


        String[] nome_alunos = new String[46];
        nome_alunos[0] = "Marcos Antonio";
        nome_alunos[1] = "Rickelmy Barbosa";

        boolean[] brasileiros = new boolean[4]; 
    
        // Revisando Array Nativos, que tem um tamanho fixo!
        // tipo[] nome = new tipo[];
        int[] valores = new int[30];
        boolean[] verda = new boolean[10];

        String[] nomes = new String[10];
        nomes[0] = "Matheus";
        // Vendo o tamanho do Array
         // nome_do_array.length;
         // nomes.length;
        // O único ponto negativo de Arrays primitivos, é que ficamos limitados na questão do tamanho deles(length);
        // Pois na sua inicalização, temos que definir um tamanho fixo!

        // Para acabar com essa limitação, usamos o ArrayList do Java, que é uma classe que é usada para acabar com
        // essa limitação!
        //ArrayList<Tipo de dados do Array> nome_array = new ArrayList<tipo>();
        //          Não dados primitivos!
        ArrayList<Integer> idades_1 = new ArrayList<Integer>();
        ArrayList<String> nomes_1 = new ArrayList<String>();


        // Funções do ArrayList

        // Para adicionar um valor, usamos a função "add(valor)"";
        // nome_array.add(valor);
        idades_1.add(22);
        nomes_1.add("Marcos");

        //Para remover um valor, utlizamos "remove(index)";
        nomes_1.remove(0);

        // Para buscar um valor, utilizamos o "get(index)";
        idades_1.get(0); // retorna 22;

        // Vendo o tamanho do Array
        // utilizamos o "size()";
        // nome_array.size();

        idades_1.size(); // retorna 1




        // Revisão sobre Arrays/Vetores em Java

        // Arrays primtivos
        // tipo[] nome_array = new tipo[length];
        
        // Existem duas formas de inicialização
        // Não posso atribuir um valor a um Array, sem inicializa-lo primeiro!
        // 1.
        int[] precos_1 = {2, 4, 5, 5};
        // 2.
        int[] precos = new int[10];
        // Ambas vão definir o length do Array;


        // Atribuindo um valor a cada Array

        precos_1[0] = 22;

        precos[0] = 22;
        // Passo dados que sejam referentes ao tipo do Array, por conta da tiapgem em Java!


        // Vendo o tamanho de cada Array Primitivo em Java
        // nome_array.length;

         System.out.println(precos_1.length);
         System.out.println(precos.length);



         // Pontos importantes sobre Array em Java:
        
         // Todo Array, inicializa seu index em 0
         // Os Arrays Primitivos são limitados, pois na sua criação determinamos seu tamanho fixo
         // Não podendo ultrapassar esse tamanho!
         // O que é um ponto negativo!

         // Para isso foi criada uma classe Java para solucionar esse problema, ela se chama ArrayList
         // Uma forma de criar Arrays que seja de tamanho dinâmico!
         // É uma classe do java.util;


         // Utilizando ArrayList
    
         // O primeiro passo é importa essa classe;
         // import java.util.ArrayList;


         // Utilizando o ArrayList

         // ArrayList<Tipo, não primitivo! Classes!> nome_array = new ArrayList<Tipo>();

         ArrayList<String> nomes_professores = new ArrayList<String>();

         // Dentro desse ArrayList, temos vários métodos para manipularmos esse Array!
         
         // Método de adição

         // nome_array.add(Valor_tipo);

         nomes_professores.add("Saulo");
         nomes_professores.add("Romero");
         // Método de remover um valor, pelo index;

         // nome_array.remove(index);
         nomes_professores.remove(1);


         // Buscando um valor, isso pelo index
         // nome_array.get(index);
         nomes_professores.get(0);

         // Verificando o tamanho de um Array
         // nome_array.size();
        // byte tamanho_array = nomes_professores.size();, erro, pois o array calcula em int
        // Criamos uma váriavel do tipo inteiro
        int tamanho_array_profs = nomes_professores.size();
         System.out.println(tamanho_array_profs);
         // Vetores primitivos
        // Os Arrays começam no index 0
        // tipo[] nome = inicialização = new int[10];

        // Primitivo
        String[] casas = new String[10];
        casas[0] = "Casa 1";
        casas[1] = "Casa 2";

        // Tamanho desse Array
        System.out.println(casas.length);


        // Classe Java, para acabar com o o problema do Array ter um length, size já definido!
        // Não podendo ser escalável
        // Usamos o ArrayList do java.util, ele é uma classe!

        // Primeiro passo
        // import java.util.ArrayList

        // ArrayList<Tipo, não primitivo (classe)> nome_array = inicialização = new ArrayList<Tipo>();
        ArrayList<String> casas_1 = new ArrayList<String>();


        // Métodos do ArrayList

        // Acrescentar um valor
        // nome_array.add(Value de acordo com o tipo!)

        casas_1.add("Casa1");
        casas_1.add("Casa2");

        // Buscando um valor pelo index
        casas_1.get(1);

        // REMOVENDO UM VALOR PELO INDEX

        casas_1.remove(1);

        // Buscando o valor do Array
        int size_casas1 = casas_1.size();

        System.out.println(size_casas1);

    }
}
