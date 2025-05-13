import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception{
        ArrayList<Aluno> alunos = new ArrayList<Aluno>();
        int java = 0;

        Scanner ler = new Scanner(System.in);
        int op;
        do{
    
            System.out.println("--------------------------------------");
            System.out.println("Menu Principal");
            System.out.println("--------------------------------------");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Cadastrar notas");
            System.out.println("3 - Calcular Medias");
            System.out.println("4 - Informar Situacoes");
            System.out.println("5 - Informar dados de um aluno");
            System.out.println("6 - Alterar nota");
            System.out.println("7 - Sair");

            op = ler.nextInt();    
        
            switch(op){
                case 1:
                    int i = 0;
                    Aluno a = new Aluno();
                    System.out.print("Nome: ");
                    a.setNome(ler.nextLine());
                    if(i == 0)
                        ler.nextLine();
                    System.out.print("Matrícula: ");
                    a.setMatricula(ler.nextLine());
                    alunos.add(a);
                    i++;

                break;
                case 2:
                    Float n1, n2, n3;
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nota 1, 2 e 3 de " + alunos.get(i).getNome() + ": ");
                        if(i == 0)
                        ler.nextLine();
                        n1 = (ler.nextFloat());
                        n2 = (ler.nextFloat());
                        n3 = (ler.nextFloat());
                        alunos.get(i).setNotas(n1, n2, n3);

                    }
                break;
            }
        }while(java == 0);
    }
}
