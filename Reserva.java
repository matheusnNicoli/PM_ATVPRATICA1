package model;



public class Reserva {
   

    private int codigo;
    private String nome;
    private String data;
    private String horario;
    private int qntConvidados;
    private String status;
    private double valor;


    public Reserva (int codigo, String nome,String data, String horario, int qntConvidados, String status, double valor){
        this.codigo = codigo;
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.qntConvidados = qntConvidados;
        this.status = status;
        this.valor = valor;
    }
   
     public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
      
    public void setData(String data) {
        this.data = data;
    }
    public String getData() {
        return data;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    public String getHorario() {
        return horario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setQntConvidados(int qntConvidados) {
        this.qntConvidados = qntConvidados;
    }
    public int getQntConvidados() {
        return qntConvidados;
    }

   public void setStatus(String status) {
       this.status = status;
   }
   public String getStatus() {
       return status;
   }

   public void setValor(double valor) {
       this.valor = valor;
   }

   public double getValor() {
       return valor;
   }
}
