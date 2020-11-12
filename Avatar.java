import java.util.Scanner;
public class Avatar{
  //Atributos e variáveis:
  
  //Componentes:
  Scanner resposta = new Scanner(System.in);

  //Dados:
  private String nome;
  private int idade = 0;
  private float peso = 0;
  private float altura = 0;

  //Fatores de saúde
  private float imcVal = 0;
  private int fome = 50;
  private int psico = 50;
  private int fisico = 50;
  private int saude = 50;

  //Valores para a saúde final:
  private final double ruim = 34.9;
  private final double mediano1 = 35.0;
  private final double mediano2 = 59.0;
  private final double bom = 60; 

  //Variáveis das escolhas:
  private int escolha = 0;

  //Funções:

  //Getters:
  //Retorna o valor da variavél privada nome:
  public String getNome(){
      return this.nome;
  }

  //Retorna o valor da variavél privada idade:
  public int getIdade(){
      return this.idade;
  }

  //Retorna o valor da variavél peso:
  public float getPeso(){
      return this.peso;
  }

  //Retorna o valor da variavél altura:
  public float getAltura(){
      return this.altura;
  }

  //Retorna o valor da variavél ImcVal:
  public float getImcVal(){
    return this.imcVal;
  }

  //Retorna o valor da variavél escolha:
  public int getEscolha(){
    return this.escolha;
  }

  //Retorna o valor da variavél fome:
  public int getFome(){
    return this.fome;
  }

  //Retorna o valor da variavél sede:
  public int getFisico(){
    return this.fisico;
  }

  //Retorna o valor da variavél ImcVal:
  public int getSaude(){
    return this.saude;
  }

  //Retorna o valor da variavél privada psico:
  public int getPsico(){
    return this.psico;
  }

  //Setters:

  //Atribui um valor à variável nome:
  public void setNome(String name){
      this.nome = name;
  }

  //Atribui um valor à variável idade:
  public void setIdade(int age){
      this.idade = age;
  }

  //Atribui um valor à variável peso:
  public void setPeso(float weight){
      this.peso = weight;
  }

  //Atribui um valor à variável altura:
  public void setAltura(float height){
      this.altura = height;
  }

  //Atribui um valor à variável altura:
  public void setFisico(int thirst){
    this.fisico = thirst;
  }

  //Atribui um valor à variável altura:
  public void setFome(int hunger){
    this.fome = hunger;
  }

  //Atribui um valor à variável altura:
  public void setPsico(int psicologic){
    this.psico = psicologic;
  }

  //Atribui um valor à variável altura:
  public void setSaude(int health){
    this.saude = health;
  }

  //Atribui um valor à variável altura:
  public void setImcVal(int bmiValue){
    this.imcVal = bmiValue;
  }

  //Atribui um valor à variável escolha:
  public void setEscolha(int choice){
    while(choice != 1 && choice != 2 && choice != 3){
      System.out.println("Você deve digitar 1, 2 ou 3 para fazer a escolha:");
      choice = resposta.nextInt();
    }
    this.escolha = choice;
  }

  //Caso o usuário escolha digite um número inválido:
  public void escolhaErrada(){
    int choice;
    do{
       System.out.println("Este número é inválido, para esta questão você deve digitar 1 ou 2 para fazer a escolha:");
       choice = resposta.nextInt();
    }
    while(choice != 1 && choice != 2);
     this.escolha = choice;
  }

  //Funções de soma e subtração:

  //fome:
  public void somaFome(){
    this.setFome(this.getFome() + 10);
  }
  public void subFome(){
    this.setFome(this.getFome() - 10);
  }

  //psicologico:
  public void somaPsico(){
    this.setPsico(this.getPsico() + 10);
  }
  public void subPsico(){
    this.setPsico(this.getPsico() - 10);
  }

  //físco:
   public void somaFisico(){
    this.setFisico(this.getFisico() + 10);
  }
  public void subFisico(){
    this.setFisico(this.getFisico() - 10);
  }


  //Função da saúde do Avatar
  public int Saude(int fome,int psico,int fisico){

    this.saude = (fome + psico + fisico) / 3;
    return saude;
  }
  //Função do Indice de Massa Corporal
  public void IMC(float peso, float altura){

    this.imcVal = peso/(altura*altura);

    if(imcVal < 17)
    {
      //Anorexia:
      this.saude -= 15;
    }
    else if(imcVal < 18.5)
    {
      //Abaixo do peso ideal:
      this.saude -= 10;
    }
    else if(imcVal > 18.5 && imcVal < 24.9)
    {
      //Peso ideal:
      this.saude += 15;
    }
    else if(imcVal > 25.0 && imcVal < 29.9)
    {
      //Sobrepeso:
      this.saude -= 5;
    }
    else if(imcVal > 30.0 && imcVal < 39.9)
    {
      //Obesidade:
      this.saude -= 10;
    }
    else if(imcVal > 40)
    {
      //Obesidade grave:
      this.saude -= 15;
    }
    
  }

}