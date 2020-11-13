class Finais{
      
   Main m = new Main();
  Avatar usuario = new Avatar();
  //Scanner resposta = new Scanner(System.in);
  
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

  public void calculos(){
    if(usuario.getFome() == 10){
        finalAnorex();
    }
    
    if(usuario.getSaude() >= usuario.bom){
      final1();
    }else if(usuario.getSaude() >= usuario.mediano1 && usuario.getSaude() <= usuario.mediano2){
      finalMedio();
    }else if(usuario.getSaude() <= usuario.ruim){
      final2();
    }
  }

  public void final1(){
    m.pausa(3000);
    printEmptyLine();
    print("Depois desse dia você segue essa mesma rotina por um tempo,\n mas sempre buscando melhorar, com dias mais saudáveis e mais cheios de vida,\n noites calmas e com um bom descanso, alimentação saudável e praticando suas atividades diariamente.");

  }

  public void final2(){
    m.pausa(3000);
    printEmptyLine();
    print("Depois desse dia você segue essa mesma rotina por um tempo, sua alimentação e sua saúde não estão boas, você se sente cansado todos os dias e se sente sem disposição para as coisas, sua vida se torna mais lenta e seus dias mais difíceis, e ao perceber essas dificuldades, você decide melhorar, se esforçando, pois sempre é possível, você segue em busca de aprimorar sua rotina e poder deixar essa má disposição.");
  }
  public void finalMedio(){
    m.pausa(3000);
    printEmptyLine();
    print("Depois desse dia você segue essa mesma rotina por um tempo, nem muito boa, nem muito ruim. Mas ao notar sua mediocridade você percebe que tem muitas coisas a melhorar e por isso busca sempre o melhor para sua saúde, você segue tentando, sempre é possível melhorar e você busca essa melhora.");
  }
  public void finalAnorex(){
    m.pausa(3000);
    printEmptyLine();
    print("Depois desse dia você segue essa mesma rotina por um tempo, até que acaba desmaiando e indo parar no hospital, ficar sem comer é algo gravíssimo e pode causar diversos efeitos destrutivos para sua saúde. Após esse acontecimento você e seus pais buscam acompanhamento profissional, uma nutricionista e uma psicóloga. Ao notar os problemas graves você decide tentar melhorar, pois nunca é tarde para uma mudança de hábitos.");

  }

}