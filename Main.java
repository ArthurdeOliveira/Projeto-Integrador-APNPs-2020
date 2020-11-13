import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    
  Rota1 rota = new Rota1();

    Text historia = new Text();

    //historia.Intro();
    //historia.escolha1();
    //historia.escolha2();
    //rota1.escola();
    rota.escolha11();
    
  }

  public void pausa(int tempo){
      try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

  }
}