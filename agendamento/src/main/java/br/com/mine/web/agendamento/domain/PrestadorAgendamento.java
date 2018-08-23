package br.com.mine.web.agendamento.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Entity
public class PrestadorAgendamento {

    @Id
    @GeneratedValue
    private long id;

    @NotEmpty
    @Column(name = "nome_prestador")
    private String nome;

    @Column(name = "cpf_prestador")
    private String cpf;

    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private LocalDateTime dtAdmissao;

}
