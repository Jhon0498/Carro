class Carro {

   private int Ano;
   private String marca;
   private String modelo;
   private String cor;

  public Carro (String marca, String modelo, String cor, int Ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.cor = cor;
    this.Ano = Ano;
  }

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public String getCor() {
    return cor;  
  }
  public int getAno() {
    return Ano;  
}
}