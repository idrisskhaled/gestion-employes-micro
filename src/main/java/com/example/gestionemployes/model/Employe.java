package com.example.gestionemployes.model;


import lombok.*;

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
}
