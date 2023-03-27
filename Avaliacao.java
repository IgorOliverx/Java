import java.util.Scanner;

public class Avaliacao {

    public void exercicio01() {

        Scanner sc = new Scanner(System.in);

        System.out.println(
                "Olá! Sou a Inteligência Artificial da empresa Millenniun Falcon e irei realizar cálculos aritméticos das 4 operações básicas!");

        System.out.println("Insira o Primeiro número ");
        Double numero1 = sc.nextDouble();

        System.out.println("Insira o Segundo número ");
        Double numero2 = sc.nextDouble();

        System.out.println(numero1);
        System.out.println(numero2);

        System.out.println("Qual operação você deseja realizar entre eles? - divisao=1 - multiplicacao=2 - soma=3 - subtracao=4. Lembre-se de selecionar o número correspondente a operação.");


        Double operacao = sc.nextDouble();

        Double divisao = numero1 / numero2;
        Double multiplicacao = numero1 * numero2;
        Double soma = numero1 + numero2;
        Double subtracao = numero1 - numero2;

        if (operacao==1) {

            System.out.println("A divisão entre os dois números é: "+ divisao);

        } if (operacao==2) {

            System.out.println("A multiplicação entre os dois números é: "+ multiplicacao);

        } if (operacao==3) {

            System.out.println("A soma entre os dois números é: "+ soma);
        } if (operacao==4) {

            System.out.println("A subtração entre os dois números é: "+ subtracao);
        } if (operacao>5) {
            System.out.println("Operação Inválida.");
        }
        

    }


    public void exercicio02() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! Eu determinei o time em que você estará de acordo com o Número de sua matrícula.");
        System.out.println("Por favor, insira o número de sua Matrícula.");
        int matricula = sc.nextInt();

        if (matricula % 4==0) {
            System.out.println("O time que você está inserido é o time do Chris");
        }if( matricula % 4==1) {
            System.out.println("O time que você está insrido é o time do Greg");
        } if(matricula % 4==2) {
            System.out.println("O time que você está inserido é o time do Caruso");
        }if(matricula % 4==3){
            System.out.println("O time que você está inserido é o time do Jerome");
        }
    }

    public void exercicio03() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá! A quitanda do seu madruga está repleta de promoções por KG, veja os preços:");
        System.out.println("Morangos --> R$3,50");
        System.out.println("Maçãs --> R$2,30");
        System.out.println("Bananas --> R$1,80");

        System.out.println("Por favor, informe em ordem, a quantidade de KG de cada tipo de fruta");
        Double morango = sc.nextDouble();
        Double maca = sc.nextDouble();
        Double banana = sc.nextDouble();


        Double morangoP = morango*3.50;
        Double macaP = maca*2.30;
        Double bananaP = banana*1.80;

        System.out.println("O preço dos morangos ficou em R$ "+morango*3.50);
        System.out.println("O preço dos morangos ficou em R$ "+maca*2.30);
        System.out.println("O preço dos morangos ficou em R$ "+banana*1.80);

        Double precoFinal = morangoP + macaP + bananaP;

        Double pesoFinal = morango + maca + banana;

System.out.println("O peso total da sua compra ficou em "+ pesoFinal + " Kg");
        System.out.println("O preço final ficou em R$ "+ precoFinal);

        Double precoComDesconto = precoFinal - (precoFinal*10/100);

        if (precoFinal >=30) { //Pensei em usar um Operador "OU" mas não consegui.

            System.out.println("Parabéns, por comprar conosco Você recebeu um desconto super especial de 10%. O valor da sua compra ficará em R$"+ precoComDesconto );
        } else if (pesoFinal >=15 ) {

            System.out.println("Parabéns, por comprar conosco Você recebeu um desconto super especial de 10%. O valor da sua compra ficará em R$"+ precoComDesconto);
        }else {

            System.out.println("Até Mais!");
        }

      





        
    }

}
