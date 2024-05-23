import java.util.Scanner;

public class Verificaraprovadomedia {
  public static void main(String[] args) {
      Scanner scanner  = new Scanner(System.in); 

      System.out.println("Digite a nota da primeira prova:");
      double nota1 = scanner.nextDouble();
      
      System.out.println("Digite a nota da segunda prova:");
      double nota2 = scanner.nextDouble();
      
      System.out.println("Digite a nota da três  prova:");
      double nota3 = scanner.nextDouble();
      
      System.out.println("Digite a nota da quatro  prova:");
      double nota4 = scanner.nextDouble();

      double media = (nota1 + nota2 + nota3+ nota4) / 4;

      System.out.println("Media:" +media);


      if(media <4) {
        System.out.println("Ruim, como ir forte estudar muitos com recuperação!");
      } else if(media < 6){
        System.out.println("talvez precisa vem minha escola novo estudar!");
      } else if(media < 7){
        System.out.println("um bom, mais estudarrei! ");
      } else if(media < 8){
        System.out.println("muitos bom, pouco estudarei");
      } else if(media <= 10){
        System.out.println("Parabens, voce pode sair!");

      }
      scanner.close();
  }
}

