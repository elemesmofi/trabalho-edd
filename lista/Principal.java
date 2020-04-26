class Principal {
  public static int gerarNumero()
  {
    Random rand = new Random();
    int limite = 100;
    int int_random = rand.nextInt(limite);
    return int_random;
  }
  public static void main(String[] args) {
    Lista lista = new Lista(-1);
   
    for(int i = 0; i < 10;i++)
    {
        lista.append(new Elemento(gerarNumero()));
 
    }
    lista.imprime();
 
  }
}