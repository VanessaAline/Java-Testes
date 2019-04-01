
public class Lista {
    //atributos
    private NoLista cabeca;
    private NoLista calda;
    private int tamanho;
    
    //construtor
    public Lista(){
        this.cabeca = null;
        this.calda = null;
        this.tamanho = 0;
    }
    
    //verifica se está vazia
    public boolean estaVazia(){
        return this.calda == null;
    }
    
    //gets e sets
    public NoLista getCabeca(){
        return this.cabeca;
    }
    private void setCabeca(NoLista cabeca){
        this.cabeca = cabeca;
    }
    public NoLista getCalda(){
        return this.calda;
    }
    private void setCalda(NoLista calda){
        this.calda = calda;
    }
    public int gettamanho(){
        return this.tamanho;
    }
    
    //Metodo adicionar valores
    public void adicionar(int valor){
        NoLista no = new NoLista(valor);
        
        if(!this.estaVazia()){
            this.calda.setNextNoLista(no);
            this.calda = no;
            this.tamanho++;
        }else{
            this.setCabeca(no);
            this.setCalda(no);
            this.tamanho++;
        }
    }
    
  //Metodo remover valores
    public void remove(int valor){
        NoLista atual = cabeca;
        
        if(!this.estaVazia()){
            do{
                if(atual.getValor() == valor){
                    break;
                }else{
                	atual = atual.getNextNoLista();
                }
            }while(atual != null);
            
            //se o valor a ser removido estiver na lista
            if(atual != null){
                //se a lista so tiver um elemento
                if(atual == this.calda && atual == this.cabeca){
                    this.cabeca = this.calda = null;
                    this.tamanho--;
                //se o elemento for o primeiro
                }else if(atual == this.cabeca){
                    this.cabeca = this.cabeca.getNextNoLista();
                    this.tamanho--;
                //se o elemento for o ultimo
                }else if(atual == this.calda){
                	atual = cabeca;
                    for(; atual.getNextNoLista() != this.calda;){
                    	atual = atual.getNextNoLista();
                    }
                    atual.setNextNoLista(null);
                    this.setCalda(atual);
                    this.tamanho--;
                //se o elemento tiver no meio da lista
                }/*else{
                    NoLista temp = cabeca;
                    for(; temp.getNextNoLista() != atual;){
                        temp = temp.getNextNoLista();
                    }
                    temp.setNextNoLista(atual.getNextNoLista());
                    this.tamanho--;
                }
            */}else {
            	System.out.println("O valor informado não esta na Lista");
            }
        }
    }   
    //printar lista
    public void print(){
        NoLista atual = this.cabeca;
        
        if(!this.estaVazia()){
            do{
                System.out.print(atual.getValor() + " ");
                atual = atual.getNextNoLista();
            }while(atual != null);
            System.out.println("");
        }
    }
}