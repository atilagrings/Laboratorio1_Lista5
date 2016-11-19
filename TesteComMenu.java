public class TesteComMenu {
    public static void main (String[] args){
    int numeroEscolhido = 0;
    Teclado t = new Teclado();
    System.out.println("\f");
    
    while (numeroEscolhido!=7){
    numeroEscolhido = t.leInt("Escolha a opção desejada de acordo com a lista abaixo:\n1 - Gera e exibe inteiros\n2 - Gera e exibe pares\n3 - Gera e exibe múltiplos comuns de 3 e 5\n4 - Exibe a média aritmética dos múltiplos\n5 - Gera e exibe divisores\n6 - Gera e exibe primos\n7 - Sair");
    while (numeroEscolhido >7){
        System.out.println ("\fO número digitado é inválido.");
        numeroEscolhido = t.leInt("\fEscolha a opção desejada de acordo com a lista abaixo:\n1 - Gera e exibe inteiros\n2 - Gera e exibe pares\n3 - Gera e exibe múltiplos comuns de 3 e 5\n4 - Exibe a média aritmética dos múltiplos\n5 - Gera e exibe divisores\n6 - Gera e exibe primos\n7 - Sair");
    }
    
    int a1,a2;
    GeraExibeSequenciaInteiros teste1;
    if (numeroEscolhido!=7 ){
        a1 = t.leInt("Digite o primeiro número");
        a2 = t.leInt("Digite o segundo número");
        teste1 = new GeraExibeSequenciaInteiros(a1,a2);
    
    if (numeroEscolhido ==1) teste1.geraExibeInt();
    if (numeroEscolhido ==2) teste1.geraExibePares();
    if (numeroEscolhido ==3) teste1.geraExibeMultiplos3e5();
    if (numeroEscolhido ==4) teste1.geraExibeMultiplosCalcMed(t.leInt("Indique o valor para exibir os múltiplos"));
    if (numeroEscolhido ==5) teste1.geraExibeDivisores();
    if (numeroEscolhido ==6) teste1.exibePrimos();
    System.out.println("\n");
    }
    
    if (numeroEscolhido ==7) System.out.println("\fMetodo encerrado pelo usuário");
    }
    
}
}
