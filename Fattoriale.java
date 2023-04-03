public class Fattoriale extends Thread {
    private int val;

    public Fattoriale(String nome, int val){
        super(nome);
        this.val = val;
    }

    public int getVal(){
        return val;
    }

    @Override 
    public void run(){
        for (int i = val-1; i > 0; i--){
            val = val*i;
        }
    }
}