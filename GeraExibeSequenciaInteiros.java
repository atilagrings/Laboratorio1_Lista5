public class GeraExibeSequenciaInteiros {
    private int limiteUm;
    private int limiteDois;
    
    //Construtor
    public GeraExibeSequenciaInteiros(int limiteUm, int limiteDois){
          if (limiteUm > limiteDois) {
            this.limiteDois = limiteUm;
            this.limiteUm = limiteDois;}
          else{
            this.limiteDois = limiteDois;
            this.limiteUm = limiteUm;}
    }
    
    //Gera e exibe os inteiros de  limiteUm a limiteDois.
    public void geraExibeInt(){ 
        System.out.println ("\f");  // para limpar a tela
          
        while (this.limiteUm <= this.limiteDois){
            System.out.println (this.limiteUm);
            this.limiteUm++;
        }      
        }
        
    //Gera e exibe os pares de limiteUm a limiteDois    
    public void geraExibePares(){
        System.out.println ("\f");  // para limpar a tela
          
        while (this.limiteUm <= this.limiteDois){
            if (this.limiteUm%2==0){
                System.out.println (this.limiteUm);
            }
            this.limiteUm++;
        }      
    }     
    
    //Gera e exibe os múltiplos comuns de 3 e 5, de  limiteUm a limiteDois.  
    public void geraExibeMultiplos3e5(){
        System.out.println ("\f");  // para limpar a tela
         
        while (this.limiteUm <= this.limiteDois){
            if (this.limiteUm%3==0 && this.limiteUm%5==0){
                System.out.println (this.limiteUm);
            }           
            this.limiteUm++;
        }      
    }    
    
    //Gera e exibe os múltiplos de m (recebido como parâmetro) de limiteUm a limiteDois. 
    //Devolve a média aritmética dos múltiplos gerados. 
    public void geraExibeMultiplosCalcMed(int m){
        int contador=0;
        int soma=0;
        System.out.println ("\f");  // para limpar a tela
          
        while (this.limiteUm <= this.limiteDois){
            if (this.limiteUm%m==0){
                System.out.println (this.limiteUm);
                contador++;
                soma+=this.limiteUm;
            }
            this.limiteUm++;
        }      
        System.out.println("A média dos números gerados é: "+(double) soma/contador);
    }    
    
    //Gera e exibe os divisores de limiteDois.
    public void geraExibeDivisores(){
        System.out.println ("\f");  // para limpar a tela
        int a = 1;
        for (int x = limiteDois; a <= x; a++){
            if (x%a ==0) System.out.println (a);
        } 
    }
    
    //Gera e exibe os números primos, de  limiteUm a limiteDois.  
    public  void exibePrimos ( ) {
         boolean ehPrimo ;  
         int num, inicio ;  
         inicio = this.limiteUm; 
 
         System.out.println("\f Primos de "+this.limiteUm +" até "+ this.limiteDois +" :");  

         for (num = inicio; num<=this.limiteDois; num++){       
             ehPrimo = true;  
             for(int i=2; i<= Math.sqrt(num)&& ehPrimo; i++)  
              if (num%i == 0) ehPrimo = false;  

              if (ehPrimo) System.out.println( num );  
         } 
    }
}
    
