import java.util.Scanner;
class Rota2{

    Main main = new Main();
  Avatar usuario = new Avatar();
  Scanner resposta = new Scanner(System.in);
  Rota1 rota1 = new Rota1();
  
  // Funções de atalho:
  //Um atalho para a função System.out.println();
  private void print(String text) {
    System.out.println(text);
  }

  //Um atalho para a função print("--------------------");
  private void printLine() {
    print("----------------------------------------------------------------");
  }
  //Um atalho para a função print("     ");
  private void printEmptyLine() {
    print("   ");
  }

  public void emCasa(){
      printEmptyLine();

      print("Você decide ficar em casa e descansar um pouco, enquanto pensa no que fazer durante o dia");

      printEmptyLine();

      print("- 08:30 da manhã -");

      printEmptyLine();

      print("Em meio ao tédio você pensa em ideias para fazer");

      printEmptyLine();
    public void escolha7.2(){
     main.pausa(1000);

      print("[ 1 ] Ligar seu videogame e jogar Grande Traficante de Aviões V (GTAV.");
      printEmptyLine();

      print("[ 2 ] Praticar exercícios físicos e Yoga.");

       usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {
          printEmptyLine();
          print("Você passa um tempo jogando seu jogo para desestressar");
          escolha8.2();
        } else if (usuario.getEscolha() == 2) {
          printEmptyLine();
          print("Você pratica algumas atividades e yoga e se sente bem mais leve e calmo.");
          escolha8.2();
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
    }
  }


  public void escolha8.2(){
    
      main.pausa(1000);

      print("- 12:00 Meio Dia -");

      main.pausa(1000);

      print("Após um tempo, sua barriga ronca de fome.");

      main.pausa(1500);

      print("Você irá:");

      main.pausa(1000);

      print("[1] Comer um sanduíche de atum e abacate acompanhado de uma laranja.");

      printEmptyLine();

      print("[2] Ficar em seu quarto por preguiça de ir até a geladeira pegar algo.");

      printEmptyLine();

      print("[3] Abrir um saco de doritos e já está satisfeito.");

       usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {
          printEmptyLine();
          print("Você prepara um sanduíche para a refeição da tarde, põe em um prato e vai para seu quarto.");
          printEmptyLine();
          main.pausa(1500);
          print("Comer um sanduíche ou algum petisco para se manter pela tarde é a melhor opção para uma alimentação saudável.");
          main.pausa(1500);
          //escolha8();
        } else if (usuario.getEscolha() == 2) {
          printEmptyLine();
          print("Você permanece em seu quarto e não come nada pela tarde.");
          main.pausa(1500);
          //escolha8();
        } else if (usuario.getEscolha() == 3) {
          printEmptyLine();
          main.pausa(1500);
          printEmptyLine();
          print("Você abre o saco de doritos e se leva isso como um café da tarde.");
          printEmptyLine();
          main.pausa(1500);
          print("Comer salgadinhos e doces em excesso pode acarretar em alguns problemas de saúde.");
          main.pausa(1500);

          print("Entre o almoço e o jantar, sempre bate aquela fominha, e o café da tarde sempre serve para dar aquela sustento até a noite.");
          printEmptyLine();
          main.pausa(1500);
          print("E para ele, uma boa opção seria: ");

            printEmptyLine();
            main.pausa(1000);

          print("1 lata de atum");
            main.pausa(1000);

          print("2 cebolinhas verdes picadas");
            main.pausa(1000);

          print("2 colheres (sopa) de maionese");
            main.pausa(1000);

          print("1 colher (chá) de sal");
            main.pausa(1000);

          print("1 abacate maduro");
            main.pausa(1000);

          print("1 colher (sopa) de suco de limãoe");
           main.pausa(1000);

          print("4 fatias de pão de centeio sem casca");
            main.pausa(1000);

          print("Fatias de limão, fatias de abacate e salsa para decorar");
            main.pausa(1000);
            printEmptyLine();

          print("Monte seu sanduíche e aproveite esse lanche saudável da tarde.");
            main.pausa(1000);
            printEmptyLine();
            printLine();
        }
        escolha9();
    }

}