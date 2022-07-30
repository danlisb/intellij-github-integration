import model.Gato;

public class helloWorld {
    public static void main(String[] args) {
//            int a = 2;
//            int b = 4;
//            System.out.println("Hello World!");
//            System.out.println("A soma é " + (a + b));
//            command + / para comentar linha(s) selecionada(s) com o mouse

        Gato gato = new Gato();
//            alt+enter para importar dependências
//            control+alt+o para excluir imports não usados

        System.out.println(gato);
//            command+delete para deletar linha
//            command+alt+L para formatar texto

        Livro livro1 = new Livro("O problema dos três corpos", 350);
        System.out.println(livro1);

    }
}

// command + n para estruturas feitas
class Livro {
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}


