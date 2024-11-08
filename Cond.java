public class Cond {
    public static void cond(String[] args) {
    // Condicionais em Java
     byte idade = 18;

     if(idade >= 18){
      System.out.println("Pode se tirar a carteira");
     }
    
     else{
      System.out.println("Não se pode tirar a carteira");
     }

     String nome = "Marcos";

     if(nome == "Marcos"){
      System.out.println("Seu nome é igual a Marcos");
     }
     else if(nome == "Rickelmy"){
      System.out.println("Seu nome é igual a Rickelmy");
     }
     else {
      System.out.println("Não há nenhum desses nomes anteriores");
     }
    }
}