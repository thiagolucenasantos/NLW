package br.com.thiago.certification_nlw.modules.students.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Data // indserindo os getter e setter com a dependência Lombok
@AllArgsConstructor // inserindo todos os construtores com Lombok
@NoArgsConstructor // inserindo construtores vazios com Lombok
@Entity(name = "students") // inserido para mostrar ao banco que esta classe é uma tabela
public class StudentEntity {

    @Id // definindo a chave primária
    @GeneratedValue(strategy = GenerationType.UUID)// geração de UUID automático
    private UUID id;

    @Column(unique = true, nullable = false ) // definindo essa coluna como unica e que não pode ser nula
    private String email;

    @OneToMany(mappedBy = "studentEntity") // um estudante para muitas certificações
    private List<CertificationStudentEntity> certificationStudentEntities;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
