public class Fila {
    private Elemento primeiro;
    private Elemento ultimo;

    public Fila(int v) {
        primeiro = new Elemento(v);
        ultimo = primeiro;
    }
/*  @construtores
    public Fila(int v):​ constrói uma fila com um único valor v. */ 
    public void elemento (int v) {

    }

    // public Fila(Fila fila):​ constrói uma fila a partir de outra fila.
    public Fila fila(Fila fila) {
        return fila;
    }
    // public Fila(int[] v):​ constrói uma fila a partir de um array. 
    public int fila(int [] v){
        return -1;
    }
    /* @Metodos
    public void enfileirar (int v): ​insere um elemento na cauda da fila. */ 
    public void enfileirar(int v){

    }
    //public int desenfileirar (): ​remove um elemento da cabeça da fila e retorna seu valor. 
    public int desenfileirar() {
        return -1;
    }
    //public void inserirPosicao(int v, int p):​ insere o valor v na posição p da fila. Posição p = 0 é a cabeça da fila. 
    public void inserirPosicao(int v, int p){

    } 
    //public int valorPosicao(int p):​ retorna o valor do elemento na posição p da fila.
    public int valorPosicao(int p){
        return -1; 
    }
    //public void concatenar(Fila fila):​ concatena a fila passada como parâmetro com a instância da sua classe fila. 
    public void concatenar(Fila fila){
        
    }
    //public void inserirAposPosicao(int v, int p):​ insere o valor v logo após a posição p. 
    public void inserirAposPosicao(int v, int p){

    }
    //public void inverter():​ inverte a fila encadeada. 
    public void inverter(){

    }
    //public void ordenar():​ ordena a fila em ordem crescente de valores. 
    public void ordenar(){

    }
    //public void remover(int p): ​remove o elemento na posição p.
    public void remover(int p){

    }
    //public void esvaziar():​ remove todos os elementos da fila.
    public void esvaziar (){ 
        this.primeiro.setProximo(null);
    }
    //public Elemento clonar():​ retorna uma cópia superficial da fila. 
    public Elemento clonar(){
        return primeiro;
        
    }
    //public int indice(int v):​ retorna a posição do primeiro elemento com o valor v. 
    public int indice(int v){
        return v;

    }
    //public int tamanho(): ​retorna a quantidade de elementos na fila. 
    public int tamanho(){
        int cont = 0;
        Elemento aux = this.primeiro;
        while(aux != null){
            cont ++; 
            aux = aux.getProximo();
        }
        return cont;
    }
    //public int[] array(): ​retorna um array com todos os valores da fila. 
    public int [] array() {
        return null;

    }
    //public bool pertence(int v)​: retorna true se o valor v pertence à fila, false em caso negativo. 
    public boolean pertence(int v){
        return false;

    }
    //public void appendArray(int[] v):​ adiciona os valores do array v no final da fila e na ordem do mesmo. 
    public void appendArray(int[] v ){
       
    }
    //public void prependArray(int[] v):​ adiciona os valores do array v no começo da fila, mantendo a ordem dos elementos de ambos. 
    public void prependArray(int[] v){

    }
    //public inserirFilaPosicao(Fila fila, int p):​ insere os elementos da fila passada como parâmetro depois da posição 
    public void inserirFilaPosicao(Fila fila, int p){

    }
    //public inserirArrayPosicao(int[] v, int p):​ insere os valores do array v depois da posição p.
    public void inserirArrayPosicao(int[] v, int p){

    }
    //public int contar(int v):​ retorna quantas vezes o valor v aparece na fila.
    public int contar(int v) {
        return v;
    }
}


