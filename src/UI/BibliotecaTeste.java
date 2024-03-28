package UI;
import Model.Livro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BibliotecaTeste {
    private List<Livro>listaLivros = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BibliotecaTeste gerenciar = new BibliotecaTeste();

        int opcao = 0;
        do{
            System.out.println("Menu");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar todos os livros");
            System.out.println("5. Consultar Disponibilidade do livro");
            System.out.println("7. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch(opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execEmprestar();
                    break;
                case 3:
                    gerenciar.execDevolver();
                    break;
                case 4:
                    gerenciar.execListarLivros();
                    break;
                case 5:
                    gerenciar.execConsultarDisponibilidade();
                    break;
                case 7:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao inválida");
            }
        }while(opcao!=9);


    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o titulo do livro: ");
        String titulo = sc.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autor = sc.nextLine();
        while (titulo.isEmpty() || autor.isEmpty()) {
            System.out.println("Titulo ou Autor invalidos, digite novamente");
            System.out.println("Digite o Título:");
            titulo = sc.nextLine();
            System.out.println("Digite o autor:");
            autor = sc.nextLine();
        }
        Livro liv = new Livro(titulo, autor);
        listaLivros.add(liv);
        System.out.println("Cadastrado com sucesso...");
    }
    public void execConsultarDisponibilidade(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Titulo do livro: ");
        String tituloProc = sc.nextLine();
        for(Livro l: listaLivros){
            if(l.getLivro().equals(tituloProc)){
                System.out.println(l);
            }else
                System.out.println("Livro nao cadastrado");
        }

    }
    public void execEmprestar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Titulo do livro a ser emprestado: ");
        String tituloProc = sc.nextLine();
        for(Livro l: listaLivros){
            if(l.getLivro().equals(tituloProc)){
                l.emprestar();
            }

        }
        System.out.println("Livro emprestado");
    }
    public void execDevolver(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Titulo do livro a ser devolvido: ");
        String tituloProc = sc.nextLine();
        for(Livro l: listaLivros){
            if(l.getLivro().equals(tituloProc)){
                l.devolver();
            }
        }
        System.out.println("Livro devolvido");

    }
    public void execListarLivros(){
        for(Livro l : listaLivros){
            System.out.println(l);
        }

    }
}
