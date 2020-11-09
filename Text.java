import java.lang.*;

class Text{

  Main main = new Main();

  private void print(String text){
      System.out.println(text);
  }

  public void Intro(){

    //Título:
    print("     ~ A Healthy Day ~     ");

	  main.pausa(1500);

    //Intro:
	  print("-------------------------------\nBem-vindo ao seu dia a dia");

    main.pausa(1500);

    print("Cada escolha é muito importante, e afetara a sua saude\nEntão escolha com sabedoria!\n-------------------------------");

    main.pausa(2000);
    
    //Dia:
    print("27 Abril");

   	main.pausa(1000);

    print("07:00 da manhã");

    print("-------------------------------");
  
    print("O brilho do sol da manhã paira entre as frestas da janela.");

    print("O despertador toca e seus olhos se abrem de pouco a pouco, e sua primeira escolha da manhã aparece.");

    print("Você irá:");


  }

}