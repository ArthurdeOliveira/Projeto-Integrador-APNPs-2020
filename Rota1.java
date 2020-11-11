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
        } else if (usuario.getEscolha() == 2) {
          print("Você se mantém concentrado na aula até que ela acaba.");
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
  }
}
