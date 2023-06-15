package clt.senac.gerenciadoreventos.model;

import jakarta.persistence.*;

import java.util.Calendar;

@Entity
public class Evento {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(nullable = false, length = 30)
    private String titulo;
    private String descricao;
    @Column(nullable = false)
    private String local;
    private int andar;
    private int quantidade_maxima;
    @Column(nullable = false)
    private Calendar data;
    @Column(nullable = false)
    private String responsavel;

    public long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLocal() {
        return local;
    }

    public int getAndar() {
        return andar;
    }

    public int getQuantidade_maxima() {
        return quantidade_maxima;
    }

    public Calendar getData() {
        return data;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public void setQuantidade_maxima(int quantidade_maxima) {
        this.quantidade_maxima = quantidade_maxima;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }
}
