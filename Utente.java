/**
 * 
 * @author Fatima Leal hjhhjhjhjh
 */
public class Utente {
    /**
     *  Nome do utente
     */
    private String nome;
    /**
     *  Genero do utente
     */
    private String genero;
    /**
     * Idade do utente
     */
    private int idade;
    /**
     * Altura do utente
     */
    private float altura;
    /**
     * Peso do utente
     */
    private int peso;
    /**
     * Valores por omissão
     */
    
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final String GENERO_POR_OMISSAO = "sem género";
    
    private static final int IDADE_POR_OMISSAO = 0;
    private static final int ALTURA_POR_OMISSAO = 0;
    private static final int PESO_POR_OMISSAO = 0;
    
    /**
     * Limite inferior do IMC
     */
    private static int minIMC = 18;
    /**
     * Limite superior do IMC
     */
    private static int maxIMC = 25;
    /**
     * Contador de instancias da classe
     */
    private static int totalUtentes = 0;
    
    /**
     * Construtor completo
     * 
     * @param nome nome do utente
     * @param genero genero do utente
     * @param idade idade do utente
     * @param altura altura do utente
     * @param peso peso do utente
     */
    public Utente(String nome, String genero, int idade, float altura, int peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        totalUtentes++;
    }
    /**
     * Construtor com dois parâmetros: nome e idade
     * 
     * @param nome nome do utente
     * @param idade idade do utente
     */
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }
 
    /**
     * Construtor vazio
     */
    public Utente() {
        nome = NOME_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }
 /**
     * Retorna o nome do utente
     * 
     * @return nome do utente
     */
    public String getNome() {
        return nome;
    }
    /**
     * Retorna o género do utente
     * 
     * @return género do utente
     */
    public String getGenero() {
        return genero;
    }
    /**
     * Retorna a idade do utente
     * 
     * @return idade do utente
     */
    public int getIdade() {
        return idade;
    }
    /**
     * Retorna a altura do utente
     * 
     * @return altura do utente
     */
    public float getAltura() {
        return altura;
    }
    /**
     * Retorna o peso do utente
     * 
     * @return o peso do utente
     */
    public int getPeso() {
        return peso;
    }
    /**
     * Altera o nome do utente
     * 
     * @param nome nome do utente
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    /**
     * Altera o género do utente
     * 
     * @param genero género do utente
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    /**
     * Altera a idade do utente
     * 
     * @param idade idade do utente
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }
    /**
     * Altera a altura do utente
     * 
     * @param altura altura do utente
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    /**
     * Altera o peso do utente
     * 
     * @param peso peso do utente
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    
}
