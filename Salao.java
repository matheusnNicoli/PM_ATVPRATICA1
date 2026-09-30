package model;
import java.util.ArrayList;
public class Salao {
    private int numero;
    private int capacidade;
    private String local;
    private String tipo;
    private Organizador organizador;
    private ArrayList<Reserva> reservas;

    public Salao (int numero,int capacidade, String local, String tipos){
        this.numero = numero;
        this.capacidade = capacidade;
        this.local = local;
        this.tipo = tipo;
        
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }
    
    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getCApacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public String getLocal(){
        return local;
    }
    public void setLocal(String local){
        this.local = local;
    }


    public String getTipo(){
        return tipo;
    }
   
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public Organizador getOrganizador(){
        return organizador;
    }
    public void setOrganizador(Organizador organizador){
        this.organizador = organizador;
    }

}
