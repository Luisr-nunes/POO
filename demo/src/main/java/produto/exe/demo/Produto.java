
package produto.exe.demo;

//Crie uma subclasse de produto a classe livro
//essa classe deverá, assim como produto, conter um contrutor. metodos de acesso e um metodo tostring() que retorna
//um string que informa o nome da classe e o valor de seus atributos (tanto os da classe livro como da classe produto)
//atributos do livro: autor e editora

public class Produto {

    private int codigo;
    private String nome;
    private double preco;
    private double desconto;

    public Produto(int codigo, String nome, double preco, double desconto) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Eu sou um codigo de produto " + getCodigo() + ", nome = " + getNome() + ", preco=" + getPreco() +
                ", e desconto para pagamento a vista= " + getDesconto() + "%";
    }
}

class Livro extends Produto {
    private String autor;
    private String editora;

    public Livro(int codigo, String nome, double preco, double desconto, String autor, String editora) {
        super(codigo, nome, preco, desconto);
        this.autor = autor;
        this.editora = editora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Eu sou um livro com codigo de produto " + getCodigo() + ", nome=" + getNome() + ", preco=" + getPreco() +
                ", desconto para pagamento a vista= " + getDesconto() + "%, autor=" + autor + ", editora=" + editora;
    }
}