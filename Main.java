public class Main {
  public static void main (String [] args) {

    
    
   Carro carro1 = new Carro ("Fordk", "astra", "eclipse", 2015);
  
    Carro carro2 = new Carro("lamborghini", "dodge", "amarelo", 2020);

   System.out.println("Carro 1:");  
    
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());

        System.out.println("Carro 2:");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());

}

}