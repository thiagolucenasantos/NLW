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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Data // indserindo os getter e setter com a dependência Lombok
@AllArgsConstructor // inserindo todos os construtores com Lombok
@NoArgsConstructor // inserindo construtores vazios com Lombok
@Entity(name = "certifications")
public class CertificationStudentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(length = 100)
    private String technology;

    @Column(length = 10)
    private int grate;

    @JoinColumn(name = "student_id")
    private UUID studentID;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false )
    private StudentEntity studentEntity;

    @ManyToOne
    @JoinColumn(name = "answer_certification_id", insertable = false, updatable = false)
    List<AnswerCertificationEntity> answerCertificationEntities;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
