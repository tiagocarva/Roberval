
package model;


public class Edificio {
    
    private int id;
    private String nome;
    //... fazer os outros atributos

    public Edificio() {
    }

    public Edificio(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
    
    
}
