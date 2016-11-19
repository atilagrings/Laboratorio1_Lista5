
public class ConjuntoDeNumerosPositivos {
    private int somaDosNumeros;
    private int qtdDeNumeros;
    private int maiorNumero;
    
    public void incluiUmNumero(int a){
        if (a>0) {
            somaDosNumeros+=a;
            qtdDeNumeros++;
            if (a>maiorNumero) maiorNumero =a;
        }
    }
    
    public int getQtdNumeros(){
        return qtdDeNumeros;
    }
    
    public double getMedia (){
        if (somaDosNumeros==0) return 0;
        return (double) somaDosNumeros/qtdDeNumeros;
    }
    
    public int getMaior(){
        return maiorNumero;
    }
    
    
}


    