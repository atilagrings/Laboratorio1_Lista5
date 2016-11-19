 public class TesteConjuntoDeNumerosPositivos{
     public static void  main (String[] args){
         Teclado t = new Teclado();
         ConjuntoDeNumerosPositivos C = new ConjuntoDeNumerosPositivos();
         int num;
         
         do{
            num = t.leInt("\fDigite um numero para adiciona-lo ao conjunto.\n\nDigite 0 para finalizar a entrada de números");           
            C.incluiUmNumero(num);
        }
         while (num !=0);
           
         System.out.println ("\fTotal de números do conjunto: "+C.getQtdNumeros()+
                             "\nMédia dos números digitados: "+C.getMedia()+
                             "\nMaior número do conjunto: "+C.getMaior());
         
     }
 }
    