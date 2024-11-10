package loops;

public class Main{
    public static void main(String[] args){

        // Existem vários loops em Java

        // for

        byte idade = 23;

        for(var i = 0; i == 23; i++){
            System.out.println("Olá");
        }
        // while

        byte valor = 0;
        
        while (valor < 23) { 
            valor++;
            System.out.println("Oi");
        }

        //do-while
        int aumento = 250;
        do { 
            aumento += 50;
            System.out.println(aumento);
       } while(aumento < 500);

       // Revisão de loops
       // for(valor incial; condição; incrementa){
            // Fazer
     // }
       for(var i = 0; i < 20; i++){
        System.out.println("Chegando!");
       }
       for(var i = 0; i <50; i++){
        System.out.println("É isso!");
       }
       // Criamos o incrementador fora
       int valor_i = 0;
       while (valor_i < 20) { 
           valor_i++;
           System.out.println("é isso!");
       }

       int valor_i2 = 0;
       do { 
           valor_i2++;
            System.out.println("é isso!");
       } while(valor_i2 < 20);
    


    // Revisão de loops
    // for loop
       for(var i = 0; i < 20; i++){
        System.out.println("OK");
       }


       int i_1 = 0;

       while(i_1 < 10){
        i_1++;
        System.out.println("Oi");
       }

       int i_2 = 0;
       do { 
              i_2++;
            System.out.println("Oláaa");
       } while (i_2 < 3);
    }
}