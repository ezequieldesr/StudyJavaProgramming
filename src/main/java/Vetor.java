public class Vetor {

    // vetores = arrays

    //array string nomeada elementos
    private String[] elementos;

    public Vetor(int capacidade) {
        // inseri o limite da array atraves do parametro capacidade
        this.elementos = new String[capacidade];
    }

    public void adiciona(String elemento) {
        for(int i = 0; i < this.elementos.length; i++) {
            if(this.elementos[i] == null) {
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}
