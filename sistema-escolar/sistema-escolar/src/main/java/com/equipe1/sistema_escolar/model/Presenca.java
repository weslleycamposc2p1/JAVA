package com.equipe1.sistema_escolar.model;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id_presenca")
    private Long id;

    @ManyToOne
    private Aluno aluno;

    @ManyToOne
    private Sala sala;


    @Column(name = "data_presenca")
    private Date dataPresenca;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataPresenca() {
        return dataPresenca;
    }

    public void setDataPresenca(Date dataPresenca) {
        this.dataPresenca = dataPresenca;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }


}
