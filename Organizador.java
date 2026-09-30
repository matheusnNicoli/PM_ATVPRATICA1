package model;

public class Organizador {
    private String nome;
    private int cpf;
    private int telefone;
    private String areaAtuacao;


    public Organizador ( String nome, int cpf, int telefone,String areaAtuacao){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.areaAtuacao = areaAtuacao;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public int getCpf(){
        return cpf;
    }
    public void setCpg(int cpf){
        this.cpf = cpf;
    }


    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }

    public String getArea(){
        return areaAtuacao;
    }
    public void setArea(String areaAtuacao){
        this.areaAtuacao = areaAtuacao;
    }


}
