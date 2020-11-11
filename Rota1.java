import java.util.Scanner;
class Rota1{

  Main main = new Main();
  Avatar usuario = new Avatar();
  Scanner resposta = new Scanner(System.in);
  
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

public void escola(){

 print("Você segue até a estação de ônibus e fica esperando lá por um tempo, até que ele chega e você segue para o colégio");

  main.pausa(4000);

  print("- 08:30 da manhã -");

  main.pausa(1500);

  print(" Ao chegar no colégio você vê vários estudantes seguindo para suas salas, e decide fazer o mesmo");

  main.pausa(3500);

  print("- 10:00 da manhã -");

  main.pausa(1500);

  print("A aula segue normalmente e o sol brilha forte no céu, a aula está um pouco entediante, e você decide: ");

  main.pausa(3000);
  
  escolha3();
}

  public void escolha3(){

    print("[ 1 ] Cruzar os braços sobre a carteira e tirar um cochilo, não há mal nenhum em dormir um pouco. ");

    print("[ 2 ] Focar nos estudos, se eu perder a explicação do professor, não irei entender o conteúdo.");

    main.pausa(3000);

      printLine();
        usuario.setEscolha(resposta.nextInt());

        if (usuario.getEscolha() == 1) {
          print("Você cruza os braços e começa a dormir e acaba perdendo a aula.");
          escolha4();
        } else if (usuario.getEscolha() == 2) {
          print("Você se mantém concentrado na aula até que ela acaba.");
          escolha4();
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
  
}

public void escolha4(){
  main.pausa(1000);

  print("A hora do intervalo chega, e você segue até a cafeteria para almoçar, você pega um cardápio de papel que fica sobre as mesas, o que irá escolher?");

  print("[ 1 ] Você não se sente com fome e decidi pular o almoço");
  printEmptyLine();
  print("[ 2 ] Um hambúrguer com batata frita.");
  printEmptyLine();
  print("[ 3 ] Um almoço saudável com frango, salada e uma maçã.");

   printLine();
   
        usuario.setEscolha(resposta.nextInt());

        if (usuario.getEscolha() == 1) {
          print("Você pula o almoço e saí do refeitório.");
          printEmptyLine();
           main.pausa(5000);
          escolha5();
        
        } else if (usuario.getEscolha() == 2) {
          print("Você pede um prato com batata frita e um grande hambúrguer.");
          
          main.pausa(1500);

          printEmptyLine();

          print("O almoço é um refeição importantíssima, já que é ele que nos dá energia para funcionar à tarde e no início da noite.");

          main.pausa(2000);

          printEmptyLine();

          print("Comida muito pesada e gordurosa a tarde pode prejudicar você pelo resto do dia.");

          main.pausa(2000);

          printEmptyLine();

          print("Um almoço mais balanceado é uma ótima escolha e também a mais adequada.");
          main.pausa(1500);
          print("Um bom exemplo de um almoço saudável e simples é:");
          main.pausa(1500);
          print("Salada: Rúcula, pepino e palmito;");
          main.pausa(1500);
          print("Espinafre refogado;");
          main.pausa(1500);
          print("Um filé de frango grelhado;");
          main.pausa(1500);
          print("Macarrão integral ao molho vermelho;");
          main.pausa(1500);
          print("Uma maçã;");

            printEmptyLine();
            main.pausa(5000);
            escolha5();
        } else if (usuario.getEscolha() == 3) {

          print("Você pede um prato com saladas e frango, espera em sua mesa até que tragam a comida.");

          printEmptyLine();

          print("O almoço é um refeição importantíssima, já que é ele que nos dá energia para funcionar à tarde e no início da noite.");

           main.pausa(2000);

          printEmptyLine();

          print("Um almoço mais balanceado é uma ótima escolha e também a mais adequada.");
          main.pausa(1500);
          print("Um bom exemplo de um almoço saudável e simples é:");
          main.pausa(1500);
          print("Salada: Rúcula, pepino e palmito;");
          main.pausa(1500);
          print("Espinafre refogado;");
          main.pausa(1500);
          print("Um filé de frango grelhado;");
          main.pausa(1500);
          print("Macarrão integral ao molho vermelho;");
          main.pausa(1500);
          print("Uma maçã;");


          printEmptyLine();
          main.pausa(5000);
          escolha5();
        }
    }

    public void escolha5(){
      main.pausa(1000);

      print("Após seu almoço seus colegas o convidam para passar o resto do intervalo juntos");

      main.pausa(2000);

      print("Você irá:");

      main.pausa(1000);

      print("[ 1 ] Voltar para a sala de aula e continuar estudando no intervalo.");

      printEmptyLine();

      print("[ 2 ] Segui-los e aproveitar o resto do intervalo.");

        if (usuario.getEscolha() == 1) {
          printEmptyLine();
          print("Você segue seus amigos, que vão até o pátio da escola jogar vôlei, lá você acaba se divertindo muito e aliviando seu estresse causado pela aula cansativa");
          escolha4();
        } else if (usuario.getEscolha() == 2) {
          printEmptyLine();
          print("Você recusa e decide retornar para a sala de aula, puxa seu livros e volta a estudar.");
          escolha4();
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }

        printEmptyLine();   
    }

    public void escolha6(){
      main.pausa(1000);

      print("- 02:00 da tarde -");

      main.pausa(1000);

      print("A aula acaba e você arruma suas coisas para ir embora, no caminho da saída, seus amigos lhe chamam para ir ao cinema.");

      main.pausa(1500);

      print("Você irá:");

      main.pausa(1000);

      print("[ 1 ] Você prefere recusar e segue seu caminho para a casa.");

      printEmptyLine();

      print("[ 2 ] Você está animado para o novo filme em cartaz e decide segui-los para o cinema.");

       if (usuario.getEscolha() == 1) {
          printEmptyLine();
          print("Você volta para a parada de ônibus e retorna para a casa.");
          escolha4();
        } else if (usuario.getEscolha() == 2) {
          printEmptyLine();
          print("Você vai com eles para o cinema, e lá vocês compram os tickets para o cinema.");
          escolha4();
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
    }

    public void escolha7(){
      main.pausa(1000);

      print("- 02:30 da tarde -");

      main.pausa(1000);

      print("Você chega em casa, volta para seu quarto e lá você decide: ");

      print("[ 1 ] Ligar seu videogame e jogar Grande Traficante de Aviões V (GTAV.");
      printEmptyLine();

      print("[ 2 ] Praticar exercícios físicos e Yoga.");

    }
}