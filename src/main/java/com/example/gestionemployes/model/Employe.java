package com.example.gestionemployes.model;


import lombok.*;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "T_EMPLOYE")
@Getter
@Setter
@DiscriminatorValue("employe")
public class Employe extends AbstractUser {

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "file_url", columnDefinition = "TEXT")
    private String fileUrl;
}
