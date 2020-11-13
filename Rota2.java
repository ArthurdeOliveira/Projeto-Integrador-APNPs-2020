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

  //Um atalho para a função print "--------------------"
  private void printLine() {
    print("----------------------------------------------------------------");
  }
  //Um atalho para a função print("     ");
  private void printEmptyLine() {
    print("   ");
  }

  public void emCasa(){

      print("Você decide ficar em casa e descansar um pouco, enquanto pensa no que fazer durante o dia");

      printLine();
      print("- 08:30 da manhã -");
      printLine();

      print("Em meio ao tédio você pensa em ideias para fazer");
      
      escolha72();

      }

    public void escolha72(){

      print("\t[ 1 ] Ligar seu videogame e jogar Grande Traficante de Aviões V (GTAV.");

      print("\t[ 2 ] Praticar exercícios físicos e Yoga.");

      usuario.setEscolha(resposta.nextInt());

      if (usuario.getEscolha() == 1) {

        usuario.subFisico();
        usuario.somaPsico();
  
        print("Você passa um tempo jogando seu jogo para desestressar");

        escolha82();

      } else if (usuario.getEscolha() == 2) {

        usuario.somaPsico();
        usuario.somaFisico();
   
        print("Você pratica algumas atividades e yoga e se sente bem mais leve e calmo.");

        escolha82();

      } else if (usuario.getEscolha() != 1 && usuario.getEscolha() != 2) {

        usuario.escolhaErrada();

      }
      
    }

    public void escolha82(){

      printLine();
      print("- 12:00 Meio Dia -");
      printLine();

      print("A hora do almoço chega, e você vai até a cozinha, você pode cozinhar um almoço saudável, pedir um hambúrguer com batata fritas no EiFood ou não comer nada.");

      print("Você irá:");

      print("\t[ 1 ] Comer um almoço saudável com frango, salada e uma maçã.");

      print("\t[ 2 ] Pedir Um hambúrguer com batata frita.");

      print("\t[ 3 ] Você não se sente com fome e decidi pular o almoço.");

      usuario.setEscolha(resposta.nextInt());

      //[ 1 ]
      if (usuario.getEscolha() == 1) {

        usuario.somaFome();

        print("Você faz um prato com saladas e frango.");

        print("Um almoço mais balanceado é uma ótima escolha e também a mais adequada.");

        //[ 2 ]
      } else if (usuario.getEscolha() == 2) {

        print("Você pede no EiFood batatas fritas e um grande hambúrguer.");

        print("Comida muito pesada e gordurosa no almoço pode prejudicar você pelo resto do dia.");
  
        //[ 3 ]
      } else if (usuario.getEscolha() == 3) {

        usuario.subFome();
  
        print("Você pula o almoço e volta para o seu quarto.");
  
      }

      if (usuario.getEscolha() == 1 || usuario.getEscolha() == 2) {

        printLine();
        print("O almoço é um refeição importantíssima, já que é ele que nos dá energia para funcionar à tarde e no início da noite.");

        print("Um bom exemplo de um almoço saudável e simples é:");

        print("Salada: Rúcula, pepino e palmito;");

        print("Espinafre refogado;");

        print("Um filé de frango grelhado;");

        print("Macarrão integral ao molho vermelho;");

        print("Uma maçã;");

        }

        printLine();
        print("- 02:00 da tarde -");
        printLine();

        print (" Você chama alguns amigos para sair e vão todos para um shopping local. ");
        
        escolha92();
        
      }

      public void escolha92(){

        printLine();
        print("- 02:30 da tarde -");
        printLine();

        print (" Você chega no shopping junto a seus amigos, e vocês decidem assistir o filme: Vendedores: Guerra Finita ");

        printLine();
        print("- 04:00 da tarde -");
        printLine();

        print (" Após o filme acabar, sua barriga ronca de fome, você vai até uma lanchonete pedir algo, as opções que mais lhe chamaram atenção foram: Sanduíche de atum e abacate, um pote G de pipoca com refri ou não comprar nada. ");

        print("Você irá:");

        print("\t[ 1 ] Comer um sanduíche de atum e abacate.");

        print("\t[ 2 ] Ficar sem comer para não gasta dinheiro.");

        print("\t[ 3 ] Pote G de pipoca com refri. ");

        usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {

          usuario.somaFome();
  
          print("Você pega o sanduíche para a refeição da tarde e se senta em uma mesa na lanchonete.");

          print("Comer um sanduíche ou algum petisco para se manter pela tarde é a melhor opção para uma alimentação saudável.");
  
          //escolha8();
        } else if (usuario.getEscolha() == 2) {

          usuario.subFome();
       
          print("Você escolhe não gastar dinheiro e não come nada pela tarde.");
 
          //escolha8();
        } else if (usuario.getEscolha() == 3) {
    
          print(" Você come seu potão de pipoca com refri e leva isso como um café da tarde.");
     
          print("É sempre bom evitar tomar muito refri, pois pode acarretar em alguns problemas de saúde. ");

        }

        if (usuario.getEscolha() == 1 || usuario.getEscolha() == 3) {
        
        printLine();
        print("Entre o almoço e o jantar, sempre bate aquela fominha, e o café da tarde sempre serve para dar aquela sustento até a noite.");
   
          print("E para ele, uma boa opção seria: ");

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
    
      escolha101();

    }

  public void escolha101(){

    printLine();
    print("- 06:00 da tarde -");
    printLine();

      print("Você escuta da porta, seus pais, que já haviam chegado do trabalho, o convidando para montar um quebra cabeça para um momento em família.");

      print("Você irá:");

      print("\t[ 1 ] Aceitar o convite de seus pais e participar do quebra cabeça.");

      print("\t[ 2 ] Recusar e ir para o seu quarto dormir.");

      usuario.setEscolha(resposta.nextInt());

       if (usuario.getEscolha() == 1) {

          usuario.somaPsico();
 
          print("Você se junta a eles nessa missão de montar um quebra cabeça.");
        
          escolha111();

        } else if (usuario.getEscolha() == 2) {

          usuario.subFome();
 
          print("Você não está com vontade e decidi ir para seu quarto dormir.");
        
          escolha111();

        } else if (usuario.getEscolha() == 3) {
          usuario.escolhaErrada();
        }
    
  }

  public void escolha111(){

    printLine();
    print("- 08:00 da noite -");
    printLine();

      print("Algum tempo depois, seus pais o chamam avisando que o jantar está pronto");

      print("Você irá:");

      print("\t[ 1 ] Comer o jantar que eles prepararam.");

      print("\t[ 2 ] Comer um pastel que estava guardado na geladeira.");

      print("\t[ 3 ] Voltar para o quarto e não comer nada.");

        usuario.setEscolha(resposta.nextInt());

      if (usuario.getEscolha() == 1) {

          usuario.somaFome();
        
          print("Seus pais prepararam um quinoa com frango e legumes, você se sente satisfeito.");
        
          print("A refeição preparada por seus pais era saudável e leve, como um jantar deve ser.");
        
          printLine();
          print("Quinoa com frango e legumes: A quinoa é rica em fibras, cálcio e ferro e também não contém glúten. Para quem gosta de pratos mais leves e saborosos, essa versão de quinoa com frango e legumes é a pedida perfeita. Uma dica bem legal: se você preferir, pode colocar na geladeira e servir como uma salada fresca!");
         
        } else if (usuario.getEscolha() == 2) {

          usuario.subFome();
          
          print("Você esquenta o pastel que estava guardado no fundo da geladeira, ele não estava com um cheiro muito bom, mas você comeu mesmo assim.");
     
          print("A refeição que seus pais prepararam, uma quinoa com frango e legumes, era uma opção melhor para o jantar por se tratar de uma comida mais leve para de noite.");

          printLine();
          print("Quinoa com frango e legumes: A quinoa é rica em fibras, cálcio e ferro e também não contém glúten. Para quem gosta de pratos mais leves e saborosos, essa versão de quinoa com frango e legumes é a pedida perfeita. Uma dica bem legal: se você preferir, pode colocar na geladeira e servir como uma salada fresca!");
  
        } else if (usuario.getEscolha() == 3) {

          usuario.subFome();

          print("Você não estava com fome e se dirige de volta para o seu quarto e fica lá por um tempo.");
        }

      escolha121();

  }

  public void escolha121(){

   
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
