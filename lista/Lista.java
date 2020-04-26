class Lista
{
    private Elemento primeiro;
    private Elemento ultimo;
    public Lista(int v){

        primeiro = new Elemento(v);
        ultimo = primeiro;
    }
    public void append(Elemento e)  {
        this.ultimo.setProximo(e);
        this.ultimo = e;
    }
    public void imprime() {
        Elemento aux = this.primeiro;
        while(aux != null)  {
            aux.imprime();
            aux = aux.getProximo();
        }
    }

//2.1.public Lista(int v):​ constrói uma lista com um único valor v.
    public Lista(int v) {

    } 
//2.2.public Lista(Lista lista):​ constrói uma lista a partir de outra lista.
    public Lista(Lista lista) {

    }
//2.3.public Lista(int[] v):​ constrói uma lista a partir de um array
    public Lista(int[]v){

    }
//3.1.public void append(int v): ​inserção na cauda da lista.
    public void append(int v){
         if(this.primeiro == null){
            this.primeiro = v;
            this.ultimo = primeiro;
        } else {
            this.ultimo.setProximo(v);
            this.ultimo = v;
        }
    }
//3.2.public void prepend(int v):​ inserção na cabeça da lista.
    public void prepend(int v){

    }
/* 3.3.public void inserirPosicao(int v, int p):​ insere o valor v na posiçãop
 da lista. Posição p = 0 é a cabeça da lista. */
    public void inserirPosicao(int v, int p){

    }
// 3.4.public int valorPosicao(int p):​ retorna o valor do elemento naposição p da lista.
    public int valorPosicao(int p){

    }
/* 3.5.public void concatenar(Lista lista):​ concatena a lista passada 
comoparâmetro com a instância da sua classe lista. */ 
    public void concatenar(Lista lista){

    }
/* 3.6.public void inserirAposPosicao(int v, int p):​ insere o valor v logoapós a posição p. */
    public void inserirAposPosicao(int v, int p){

    }
//3.7.public void inverter():​ inverte a lista encadeada.
    public void inverter(){

    }
//3.8.public void ordenar():​ ordena a lista em ordem crescente devalores
    public void ordenar(){

    }
//3.9.public void remover(int p): ​remove o elemento na posição p.
    public void remover(int p){

    }
//3.10.public void esvaziar():​ remove todos os elementos da lista.
    public void esvaziar(){

    }
//3.11.public Elemento clonar():​ retorna uma cópia superficial da lista.
    public Elemento clonar(){

    }
//3.12.public int indice(int v):​ retorna a posição do primeiro elemento como valor v.
    public int indice(int v){

    }
//3.13.public int tamanho(): ​retorna a quantidade de elementos na lista.
    public int tamanho(){
        int cont = 0;
        Elemento aux = this.primeiro;
        while(aux != null){
            cont ++; 
            aux = aux.getProximo();
        }
        return cont;
    }
//3.14.public int[] array(): ​retorna um array com todos os valores da lista.
    public int[] array(){

    }
//3.15.public bool pertence(int v)​: retorna true se o valor v pertence àlista, false em caso negativo.
    public boolean pertence(int v){

    }
//3.16.public void appendArray(int[] v):​ adiciona os valores do array v nofinal da lista e na ordem do mesmo.
    public void appendArray(int[] v){
        
    }
/* 3.17.public void prependArray(int[] v):​ adiciona os valores do array v no
 começo da lista, mantendo a ordem dos elementos de ambos. */ 
    public void prependArray(int[] v ){
        
    }
/* 3.18.public inserirListaPosicao(Lista lista, int p):​ insere os elementosda lista
 passada como parâmetro depois da posição p. */
    public inserirListaPosicao(Lista lista, int p){

    }
/* 3.19.public inserirArrayPosicao(int[] v, int p):​ insere os valores doarray 
v depois da posição p. */ 
    public inserirArrayPosicao(int[] v, int p){
            
    }
//3.20.public int contar(int v):​ retorna quantas vezes o valor v aparece na lista.
    public int contar(int v){
        
    }

}
