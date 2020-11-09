import java.lang.*;
import java.util.Scanner;

class Text{

  Main main = new Main();
  Avatar usuario = new Avatar();
  Scanner resposta = new Scanner(System.in);
  //Funções:
  private void print(String text){
      System.out.println(text);
  }
  private void printLine(){
    print("-------------------------------");
  }
  
  public void Intro(){

    //Título:
    print("     ~ A Healthy Day ~     ");

	  main.pausa(1500);

    //Intro:
    printLine();
	  print("Bem-vindo ao seu dia a dia");

    main.pausa(1500);

    print("Cada escolha é muito importante, e afetara a sua saude\nEntão escolha com sabedoria!");

    printLine();

    main.pausa(2000);
    
    //Dia:
    print("27 Abril");

   	main.pausa(1000);

    print("07:00 da manhã");

    printLine();
  
    print("O brilho do sol da manhã paira entre as frestas da janela.");

    print("O despertador toca e seus olhos se abrem de pouco a pouco, e sua primeira escolha da manhã aparece.");

    printLine();

    print("Você irá:");

    printLine();
  }

  public void escolha1(){
    print("\t[ 1 ] Se levantar da sua cama e começar o seu dia.");
    print("\t[ 2 ] Voltar a dormir, não custa nada dormir mais um pouco.");
    usuario.setEscolha(resposta.nextInt());
    if(usuario.testeEscolha == 1){

    }else{

    }
  }
}