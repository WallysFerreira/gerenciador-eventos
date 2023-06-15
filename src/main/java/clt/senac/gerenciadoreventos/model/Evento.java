package clt.senac.gerenciadoreventos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Calendar;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String titulo;
    private String descricao;
    private String local;
    private int andar;
    private int quantidade_maxima;
    private Calendar data;
    private String responsavel;
}
