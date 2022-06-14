public class media_alunos_vet{
    public static void main(String[] args){
        //Declara a variável i
        int i;
        //Declara a Array Q, e atribui a ela o tamanho 6
        double Q[] = new double[6]; 
        //Declara os valores de cada Array
        Q[0] = 35;
        Q[1] = 4;
        Q[2] = 22;
        Q[3] = 20;
        Q[4] = 36; 
        Q[5] = 30;
        //Processo que realiza o calculo da média
        double media = ((Q[0] + Q[1] + Q[2] + Q[3] + Q[4] + Q[5]) / 6);
        //Demonstra ao usuário a média de alunos da sala
        System.out.println("A media de alunos é: " + media);
        
        //Uso da estrutura de repetição For
        for (i=0; i<6; i++){
            //Condicional If para determinar informações pertinentes
            if (Q[i] > media)
            //Demonstra ao usuário qual sala tem a quantia de alunos acima da média, também informando o número de alunos da sala
            System.out.println("A sala " + (i+1) + " tem " + Q[i] + " alunos e tem mais alunos do que a media");
        }

    }
}