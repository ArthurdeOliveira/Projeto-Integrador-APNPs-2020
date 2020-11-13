import java.lang.*;
import java.util.Scanner;

class Text {

  Main main = new Main();
  Avatar usuario = new Avatar();
  Rota1 rota = new Rota1();
  Rota2 rota2 = new Rota2();
  Scanner resposta = new Scanner(System.in);
  // Funções:

  // Funções de atalho:
  private void print(String text) {
    System.out.println(text);
  }

  private void printQ(String text) {
    System.out.print(text);
  }

  private void printLine() {
    print("----------------------------------------------------------------");
  }

  private void printEmptyLine() {
    print("   ");
  }

  public void Intro() {

    // Título:
    print("     ~ A Healthy Day ~     ");

    main.pausa(1500);

    printLine();

    // Intro:
    print("Bem-vindo ao seu dia a dia");

    main.pausa(1500);

    print("Cada escolha é muito importante, e afetara a sua saude.");

    main.pausa(1500);

    print("Então escolha com sabedoria");

    main.pausa(1500);

    printLine();

    // Dia:
    print("\t27 Abril");

    main.pausa(1000);

    print("- 07:00 da manhã -");

    printLine();

    main.pausa(1500);

    print("O brilho do sol da manhã paira entre as frestas da janela.");

    main.pausa(3000);

    print("O despertador toca e seus olhos se abrem de pouco a pouco, e sua primeira escolha da manhã aparece.");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("Você irá:");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

  }

  // Métodos das escolhas:
  public void escolha1() {

    print("\t[ 1 ] Se levantar da cama e começar o seu dia.");
    main.pausa(500);
    print("\t[ 2 ] Voltar a dormir, não custa nada dormir mais um pouco.");

    main.pausa(1000);

    printLine();

    print("\t\t\t[TUTORIAL]:");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("Para fazer uma escolha digite o número mostrado antes da frase que \nrepresenta a ação que você quer tomar");

    printLine();

    usuario.setEscolha(resposta.nextInt());

    if (usuario.getEscolha() == 1) {
      usuario.somaPsico();
      rota101();
    } else if (usuario.getEscolha() == 2) {
      usuario.subPsico();
      rota102();
    } else if (usuario.getEscolha() == 3) {
      usuario.escolhaErrada();
    }
  }

  // História:

  public void espelho() {

    printEmptyLine();
    printQ("\tQual o seu nome?: ");
    usuario.setNome(resposta.next());
    printQ("\tQual a sua idade?: ");
    usuario.setIdade(resposta.nextInt());
    printQ("\tQual a sua altura?: ");
    usuario.setAltura(resposta.nextFloat());
    printQ("\tQual o seu peso?: ");
    usuario.setPeso(resposta.nextFloat());
    // calcula imc saude anor(-20) abai(-10) ideal(0) sob(-10) obs(-20) obsg(-30)

    usuario.IMC(usuario.getPeso(), usuario.getAltura());
    usuario.Saude(usuario.getFome(), usuario.getPsico(), usuario.getFisico());
  }

  public void rota101() {

    print("Você se levanta da sua cama, põe suas pantufas e se dirige até a frente do espelho, e nele você vê:");

    main.pausa(3000);

    espelho();

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("Você sai da frente do espelho e se dirige ao banheiro, você toma um bom banho e fica pronto para começar o seu dia.");

    main.pausa(1000);

    printLine();

    print("- 07:30 da manhã -");

    printLine();

    main.pausa(1500);

    print("Após se arrumar você caminha até a sala de jantar, e lá você vários pratos prontos para seu café da manhã.");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("O que você irá querer para o café da manhã?:");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("\t[ 1 ] Você se serve com uma comida mais leve, porém nutritiva acompanhada por um copo de café sem açucar. ");
    main.pausa(500);
    print("\t[ 2 ] Você enche seu prato com salgados e um grande bolo de chocolate com cobertura e um copo de refrigerante. ");
    main.pausa(500);
    print("\t[ 3 ] Você não se sente fome e decide ficar sem comer.");

    usuario.setEscolha(resposta.nextInt());

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    if (usuario.getEscolha() == 1) {
      // fome aumenta
       usuario.somaFome();
      print("Você toma seu café da manhã e se sente cheio de energia");
      main.pausa(3000);
      print("Para um café da manhã balanceado e saudavel essa é a refeição mais apropriada para esse horario:");
    } else if (usuario.getEscolha() == 2) {
      // fome continua igual
      print("Você come seus salgados e seu bolo, e já esta se sente disposto.");
      main.pausa(3000);
      print("Injerir muito doce e gorduras de manhã sedo não é apropriado para o horario, algo mais apropriado seria:");
    } else if (usuario.getEscolha() == 3) {
      print("Você se levanta sai da mesa sem fome e se dirige ao seu quarto.");
      // fome diminui
      usuario.subFome();
    }
    if (usuario.getEscolha() == 1 || usuario.getEscolha() == 2) {

      main.pausa(3000);

      printLine();

      print("Torradas, ovos e frutas");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("Para uma refeição ser saudável, ela precisa ser balanceada. Isso significa contar com quantidades adequadas de carboidratos, proteínas e gorduras.");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("Esse exemplo é uma ideia deliciosa e fácil de café da manhã saudável, que conta com todos os grupos alimentares de maneira equilibrada.");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("Ingredientes:");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("café sem açúcar com leite(traz as gorduras boas);");

      main.pausa(500);

      print("ovo e  queijo(são as proteínas);");

      main.pausa(500);

      print("pão integral e frutas(os carboidratos);");

      main.pausa(500);

      print("adicione aveia, linhaça ou outras fibras à fruta(opcional).");

      main.pausa(4000);

    }

  }

  public void rota102() {

    printLine();

    print("- 07:40 da manhã -");

    printLine();

    main.pausa(1500);

    print("O sol arde em seu rosto, e quando você se vira, olha de relance para o despertador e percebe que já são quase oito horas e que esta atrasado para o colégio");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("Você se levanta com pressa e começa a se arrumar, você se olha para o espelho e nele você vê:");

    main.pausa(3000);

    espelho();

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("Você sai da frente do espelho com pressa e toma um banho, na correria você acaba não tendo tempo para tomar café da manhã.");
    // fome diminui
    usuario.subFome();

    main.pausa(3000);

  }

  public void escolha2() {

    printLine();

    print("- 08:00 da manhã -");

    printLine();

    main.pausa(1500);

    print("Você, após estar pronto, entra no seu quarto e olha para a sua mochila e decide:");

    main.pausa(1000);

    printEmptyLine();

    main.pausa(1000);

    print("\t[ 1 ] Pegar seus materias e sua mochila e seguir para a parada de ônibus, preciso estudar para ter um bom futuro.");
    main.pausa(500);
    print("\t[ 2 ] Ficar em casa jogando algum jogo para me divertir.");

    usuario.setEscolha(resposta.nextInt());

    if (usuario.getEscolha() == 1) {
      // classe rota 1
      rota.escola();
    } else if (usuario.getEscolha() == 2) {
      // classe rota 2
      rota2.emCasa();
    }

  }
}