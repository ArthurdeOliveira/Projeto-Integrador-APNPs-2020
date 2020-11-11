import java.util.Scanner;

class Main {
  static int x = 0;
  int tempo;
  public static void main(String[] args) {
    Scanner resposta = new Scanner(System.in);

    Text historia = new Text();
    Avatar usuario = new Avatar();
    Rota1 rota1 = new Rota1();

    historia.Intro();
    historia.escolha1();
    historia.escolha2();
    
  }

  public void pausa(int tempo){
      try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

  }
}