class For{
    public static void main(String[] args){        

        //Conta de 0 a 5
        for(int i = 0; i <= 5; i++){
            System.out.println("O valor de i é: " + i);
        }

        //Conta de 5 a 0
        for(int i = 5; i >= 0; i--){
            System.out.println("O valor do i é: " + i);
        }

        //For com mais de uma varievel
        for(int i = 0, j = 10; i <= j; i++, j--){
            System.out.println("Valor de i: " + i + " Valor de j: " + j);
        }

        //For com partes ausentes
        int i = 0;

        for( ; i <= 5; ){
            System.out.println("Valor de i: " + i);
            i++;
        }

        //For sem corpo
        int soma = 0;

        for(int count = 1; count < 5; soma += count++);

        System.out.println("Valor da soma é: " + soma);
        
    }
}