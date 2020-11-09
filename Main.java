import java.util.Scanner;

class Main {
  static int x = 0;
  int tempo;
  public static void main(String[] args) {
    Scanner resposta = new Scanner(System.in);

    Text historia = new Text();
    Avatar usuario = new Avatar();

    historia.Intro();
    
    
    /*
    //Receber dados do usuario:
      //Altura:
      System.out.print("Digite sua altura: ");
      usuario.setAltura(resposta.nextFloat()); 
      
      
      //Peso:
      System.out.print("Digite seu peso: ");
      usuario.setPeso(resposta.nextFloat());
     
      
      //IMC:
      usuario.IMC(usuario.getPeso, usuario.getAltura);
      usuario.IMC(usuario.getPeso,usuario.getAltura);
      System.out.println("Seu imc é: " + usuario.getImcVal);
      */
  }

  public void pausa(int tempo){
      try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

  }
}