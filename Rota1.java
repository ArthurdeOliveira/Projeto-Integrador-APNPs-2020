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

  //Um atalho para a função print("----------------");
  private void printLine() {
    print("----------------------------------------------------------------");
  }
  //Um atalho para a função print("     ");
  private void printEmptyLine() {
    print("   ");
  }

public void escola(){

  print("Você segue até a estação de ônibus e fica esperando lá por um tempo, até que ele chega e você segue para o colégio");

  main.pausa(3000);

  printLine();
  print("- 08:30 da manhã -");
  printLine();

  main.pausa(1500);

  print(" Ao chegar no colégio você vê vários estudantes seguindo para suas salas, e decide fazer o mesmo");

  main.pausa(3000);

  printLine();
  print("- 10:00 da manhã -");
  printLine();

  main.pausa(1500);

  print("A aula segue normalmente e o sol brilha forte no céu, a aula está um pouco entediante, e você decide: ");

  main.pausa(1000);
  
  printEmptyLine();

  main.pausa(1000);

  escolha3();
  
}

  public void escolha3(){

    print("\t[ 1 ] Cruzar os braços sobre a carteira e tirar um cochilo, não há mal nenhum em dormir um pouco. ");
    main.pausa(500);
    print("\t[ 2 ] Focar nos estudos, se eu perder a explicação do professor, não irei entender o conteúdo.");

      usuario.setEscolha(resposta.nextInt());

        if (usuario.getEscolha() == 1) {
          print("Você cruza os braços e começa a dormir e acaba perdendo a aula.");
          usuario.subPsico();
          escolha4();
        } else if (usuario.getEscolha() == 2) {
          print("Você se mantém concentrado na aula até que ela acaba.");
          escolha4();
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
  
}

public void escolha4(){

  main.pausa(3000);

  printLine();
  print("- 12:00 Meio Dia -");
  printLine();

  main.pausa(1500);

  print("A hora do intervalo chega, e você segue até a cafeteria para almoçar, você pega um cardápio de papel que fica sobre as mesas, o que irá escolher?");

  main.pausa(1000);

  printEmptyLine();

  main.pausa(1000);

  print("\t[ 1 ] Você não se sente com fome e decidi pular o almoço");
  main.pausa(500);
  print("\t[ 2 ] Um hambúrguer com batata frita.");
  main.pausa(500);
  print("\t[ 3 ] Um almoço saudável com frango, salada e uma maçã.");
  
        usuario.setEscolha(resposta.nextInt());

        if (usuario.getEscolha() == 1) {
          print("Você pula o almoço e saí do refeitório.");
          usuario.subFome();
          escolha5();
        
        } else if (usuario.getEscolha() == 2) {
          print("Você pede um prato com batata frita e um grande hambúrguer.");
          main.pausa(1000);
          print("Comida muito pesada e gordurosa a tarde pode prejudicar você pelo resto do dia.");
          escolha5();

        } else if (usuario.getEscolha() == 3) {

          usuario.somaFome();
          print("Você pede um prato com saladas e frango, espera em sua mesa até que tragam a comida.");
          main.pausa(1000);
          print("Um almoço mais balanceado é uma ótima escolha e também a mais adequada.");
          escolha5();

        }

        if (usuario.getEscolha() == 2 || usuario.getEscolha() == 3) {

          main.pausa(3000);
          printLine();
          print("O almoço é um refeição importantíssima, já que é ele que nos dá energia para funcionar à tarde e no início da noite.");

          main.pausa(3000);

          print("Um bom exemplo de um almoço saudável e simples é:");

          main.pausa(3000);

          print("Salada: Rúcula, pepino e palmito;");
          main.pausa(500);
          print("Espinafre refogado;");
          main.pausa(500);
          print("Um filé de frango grelhado;");
          main.pausa(500);
          print("Macarrão integral ao molho vermelho;");
          main.pausa(500);
          print("Uma maçã;");

        }

    }

    public void escolha5(){

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("Após seu almoço seus colegas o convidam para passar o resto do intervalo juntos");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("Você irá:");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("[ 1 ] Voltar para a sala de aula e continuar estudando no intervalo.");

      main.pausa(500);

      print("[ 2 ] Segui-los e aproveitar o resto do intervalo.");

       usuario.setEscolha(resposta.nextInt());

        if (usuario.getEscolha() == 2) {
          usuario.somaFisico();
          usuario.somaFome();
          print("Você segue seus amigos, que vão até o pátio da escola jogar vôlei, lá você acaba se divertindo muito e aliviando seu estresse causado pela aula cansativa");

          escolha6();

        } else if (usuario.getEscolha() == 1) {
          
          usuario.subFisico();
          usuario.subPsico();
          print("Você recusa e decide retornar para a sala de aula, puxa seu livros e volta a estudar.");
          
          escolha6();

        } else if (usuario.getEscolha() == 3) {

          usuario.escolhaErrada();

        }
    }

    public void escolha6(){
      
      main.pausa(3000);

      printLine();
      print("- 02:00 da tarde -");
      printLine();

      main.pausa(1500);

      print("A aula acaba e você arruma suas coisas para ir embora, no caminho da saída,seus amigos lhe chamam para ir ao cinema do shopping.");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("Você irá:");

      main.pausa(1000);

      printEmptyLine();

      main.pausa(1000);

      print("\t[ 1 ] Você prefere recusar e segue seu caminho para a casa.");

      main.pausa(500);

      print("\t[ 2 ] Você está animado para o novo filme em cartaz e decide segui-los para o shopping.");

       usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {

          print("Você volta para a parada de ônibus e retorna para a casa.");

          escolha7();

        } else if (usuario.getEscolha() == 2) {
          
          print("Você vai com eles para o cinema.");

          main.pausa(3000);
          
          printLine();
          print("- 02:30 da tarde -");
          printLine();

          main.pausa(1500);

          print ("Você chega no shopping junto a seus amigos, e vocês decidem assistir o filme: Vendedores: Guerra Finita ");

          main.pausa(3000);
        
          printLine();
          print("- 04:00 da tarde -");
          printLine();

          main.pausa(1500);

          print (" Após o filme acabar, sua barriga ronca de fome, você vai até uma lanchonete pedir algo, as opções que mais lhe chamaram atenção foram: Sanduíche de atum e abacate, um pote G de pipoca com refri ou não comprar nada. ");

          main.pausa(1000);

          printEmptyLine();

          main.pausa(1000);

          print("Você irá:");

          main.pausa(1000);

          printEmptyLine();

          main.pausa(1000);

          print("\t[ 1 ] Comer um sanduíche de atum e abacate.");
          main.pausa(500);
          print("\t[ 2 ] Ficar sem comer para não gasta dinheiro.");
          main.pausa(500);
          print("\t[ 3 ] Pote G de pipoca com refri. ");

          usuario.setEscolha(resposta.nextInt());

          if (usuario.getEscolha() == 1) {

            usuario.somaFome();
    
            print("Você pega o sanduíche para a refeição da tarde e se senta em uma mesa na lanchonete.");

            main.pausa(1000);
            
            printEmptyLine();

            main.pausa(1000);

            print("Comer um sanduíche ou algum petisco para se manter pela tarde é a melhor opção para uma alimentação saudável.");
    
            //escolha8();
          } else if (usuario.getEscolha() == 2) {

            usuario.subFome();
        
            print("Você escolhe não gastar dinheiro e não come nada pela tarde.");
  
            //escolha8();
          } else if (usuario.getEscolha() == 3) {
      
            print(" Você come seu potão de pipoca com refri e leva isso como um café da tarde.");

            printEmptyLine();
      
            print("É sempre bom evitar tomar muito refri, pois pode acarretar em alguns problemas de saúde. ");

          }

          if (usuario.getEscolha() == 1 || usuario.getEscolha() == 3) {
            
            printLine();
            print("Entre o almoço e o jantar, sempre bate aquela fominha, e o café da tarde sempre serve para dar aquela sustento até a noite.");
      
            printEmptyLine();

            print("E para ele, uma boa opção seria: ");

            printEmptyLine();

            print("1 lata de atum");
            print("2 cebolinhas verdes picadas");
            print("2 colheres (sopa) de maionese");
            print("1 colher (chá) de sal");
            print("1 abacate maduro");
            print("1 colher (sopa) de suco de limãoe");
            print("4 fatias de pão de centeio sem casca");
            print("Fatias de limão, fatias de abacate e salsa para decorar");
            print("Monte seu sanduíche e aproveite esse lanche saudável da tarde.");

            }

            printLine();
            print("- 04:30 da tarde -");
            printLine();

            print ("Você sai do shopping e vai a caminho de sua casa, até chegar lá leva mais de meia hora.");
        
            escolha9();

        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
    }

    public void escolha7(){
      
      printLine();
      print("- 02:30 da tarde -");
      printLine();

      print("Você chega em casa, volta para seu quarto e lá você decide: ");

      printEmptyLine();

      print("\t[ 1 ] Ligar seu videogame e jogar Grande Traficante de Aviões V (GTA V).");

      print("\t[ 2 ] Praticar exercícios físicos e Yoga.");

       usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {

          usuario.subFisico();
          usuario.somaPsico();
          printEmptyLine();
          print("Você passa um tempo jogando seu jogo para desestressar");

          escolha8();
          
        } else if (usuario.getEscolha() == 2) {

          usuario.somaPsico();
          usuario.somaFisico();
          printEmptyLine();
          print("Você pratica algumas atividades e yoga e se sente bem mais leve e calmo.");

          escolha8();
          
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }

    }

    public void escolha8(){

      printLine();
      print("- 04:00 da tarde -");
      printLine();

      print("Após um tempo, sua barriga ronca de fome.");

      printEmptyLine();

      print("Você irá:");

      printEmptyLine();

      print("\t[ 1 ] Comer um sanduíche de atum e abacate acompanhado de uma laranja.");

      print("\t[ 2 ] Ficar em seu quarto por preguiça de ir até a geladeira pegar algo.");

      print("\t[ 3 ] Abrir um saco de doritos e já está satisfeito.");

       usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {

          usuario.somaFome();

          printEmptyLine();

          print("Você prepara um sanduíche para a refeição da tarde, põe em um prato e vai para seu quarto.");

          printEmptyLine();

          print("Comer um sanduíche ou algum petisco para se manter pela tarde é a melhor opção para uma alimentação saudável.");

          //escolha8();
        } else if (usuario.getEscolha() == 2) {

          usuario.subFome();
          printEmptyLine();
          print("Você permanece em seu quarto e não come nada pela tarde.");

          //escolha8();
        } else if (usuario.getEscolha() == 3) {

          printEmptyLine();
          
          print("Você abre o saco de doritos e se leva isso como um café da tarde.");

          printEmptyLine();

          print("Comer salgadinhos e doces em excesso pode acarretar em alguns problemas de saúde.");
    
        }

        if (usuario.getEscolha() == 1 || usuario.getEscolha() == 3) {

          printLine();
          print("Entre o almoço e o jantar, sempre bate aquela fominha, e o café da tarde sempre serve para dar aquela sustento até a noite.");

          printEmptyLine();

          print("E para ele, uma boa opção seria: ");

          printEmptyLine();

          print("1 lata de atum");
          print("2 cebolinhas verdes picadas");
          print("2 colheres (sopa) de maionese");
          print("1 colher (chá) de sal");
          print("1 abacate maduro");
          print("1 colher (sopa) de suco de limãoe");
          print("4 fatias de pão de centeio sem casca");
          print("Fatias de limão, fatias de abacate e salsa para decorar");
          print("Monte seu sanduíche e aproveite esse lanche saudável da tarde.");

        }

        escolha9();
    }

    public void escolha9(){

      printLine();
      print("- 06:00 da tarde -");
      printLine();
    
      print("Você escuta da porta, seus pais, que já haviam chegado do trabalho, o convidando para montar um quebra cabeça para um momento em família.");

      printEmptyLine();

      print("Você irá:");

      printEmptyLine();

      print("\t[ 1 ] Aceitar o convite de seus pais e participar do quebra cabeça.");

      print("\t[ 2 ] Recusar e ir para o seu quarto dormir.");

      usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {

         usuario.somaPsico();

         printEmptyLine();
 
          print("Você se junta a eles nessa missão de montar um quebra cabeça.");
        
        } else if (usuario.getEscolha() == 2) {

          usuario.subPsico();

          printEmptyLine();
 
          print("Você não está com vontade e decidi ir para seu quarto dormir.");
        
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
        escolha10();
    }

    public void escolha10(){

      printLine();
      print("- 08:00 da noite -");
      printLine();

      print("Algum tempo depois, seus pais o chamam avisando que o jantar está pronto");

      printEmptyLine();

      print("Você irá:");

      printEmptyLine();

      print("\t[ 1 ] Comer o jantar que eles prepararam.");

      print("\t[ 2 ] Comer um pastel que estava guardado na geladeira.");

      print("\t[ 3 ] Voltar para o quarto e não comer nada.");

        usuario.setEscolha(resposta.nextInt());

      if (usuario.getEscolha() == 1) {

          usuario.somaFome();

          printEmptyLine();
        
          print("Seus pais prepararam um quinoa com frango e legumes, você se sente satisfeito.");

          printEmptyLine();
        
          print("A refeição preparada por seus pais era saudável e leve, como um jantar deve ser.");

          printLine();
          print("Quinoa com frango e legumes: A quinoa é rica em fibras, cálcio e ferro e também não contém glúten. Para quem gosta de pratos mais leves e saborosos, essa versão de quinoa com frango e legumes é a pedida perfeita. Uma dica bem legal: se você preferir, pode colocar na geladeira e servir como uma salada fresca!");
         
        } else if (usuario.getEscolha() == 2) {

          usuario.subFome();

          printEmptyLine();
  
          print("Você esquenta o pastel que estava guardado no fundo da geladeira, ele não estava com um cheiro muito bom, mas você comeu mesmo assim.");

          printEmptyLine();
     
          print("A refeição que seus pais prepararam, uma quinoa com frango e legumes, era uma opção melhor para o jantar por se tratar de uma comida mais leve para de noite.");
          printLine();
          print("Quinoa com frango e legumes: A quinoa é rica em fibras, cálcio e ferro e também não contém glúten. Para quem gosta de pratos mais leves e saborosos, essa versão de quinoa com frango e legumes é a pedida perfeita. Uma dica bem legal: se você preferir, pode colocar na geladeira e servir como uma salada fresca!");
  
        } else if (usuario.getEscolha() == 3) {

          usuario.subFome();

          printEmptyLine();

          print("Você não estava com fome e se dirige de volta para o seu quarto e fica lá por um tempo.");
        }

      escolha11();

    }

    public void escolha11(){

        printLine();
        print("- 10:00 da noite -");
        printLine();
   
        print("O brilho da lua bate em sua janela avisando que já é tarde da noite.");
    
        print("Você boceja de sono e se prepara para dormir.");

        printEmptyLine();
  
        print("Você irá:");

        printEmptyLine();

        print("\t[ 1 ] Dormir, pois precisa de descanso para ter um sono saudável e ser produtivo no dia seguinte.");

        print("\t[ 2 ] Madrugar jogando, afinal, o que importa é a diversão.");

        usuario.setEscolha(resposta.nextInt());

          if (usuario.getEscolha() == 1) {

         usuario.somaPsico();

         printEmptyLine();
 
          print("Você se prepara para dormir, se dirige até sua cama e com o barulho da leve brisa e dos grilos lá fora você adormece.");
        
        } else if (usuario.getEscolha() == 2) {

          usuario.subPsico();

          printEmptyLine();
 
          print("Você já dormiu demais e se dirige para frente do computador, ligando-o e passando a noite toda jogando.");
        
        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
    }
}