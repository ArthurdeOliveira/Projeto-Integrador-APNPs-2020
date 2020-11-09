public class Avatar{

  //Atributos e variáveis:
  
  //Dados:
  private String nome;
  private int idade = 0;
  private float peso = 0;
  private float altura = 0;

  //Fatores de saúde
  private int fome = 0;
  private int psico = 0;
  private int sede = 0;
  private float imcVal = 0;
  private int saude = 0;

  //Valores para a saúde final:
  private final double ruim = 34.9;
  private final double mediano1 = 35.0;
  private final double mediano2 = 59.0;
  private final double bom = 60; 

  //Variáveis das escolhas:
  private int escolha = 0;


  //Funções:

  //Getters:
  public String getNome(){
      return this.nome;
  }
  public int getIdade(){
      return this.idade;
  }
  public float getPeso(){
      return this.peso;
  }
  public float getAltura(){
      return this.altura;
  }

  //Setters:
  public void setNome(String name){
      this.nome = name;
  }
  public void setIdade(int age){
      this.idade = age;
  }
  public void setPeso(float weight){
      this.peso = weight;
  }
  public void setAltura(float height){
      this.altura = height;
  }

  //Função da saude do Avatar
  public int Saude(int fome,int psico,int sede){

    this.saude = fome + psico + sede/3;
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