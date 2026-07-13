package com.example.be.entity.base;

import com.example.be.core.constant.EntityProperties;
import com.example.be.core.constant.EntityStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass

public abstract class PrimaryEntity extends AudiEntity implements IsIdentified {

    @Id
    @Column(length = EntityProperties.LENGTH_ID, updatable = false)
    private String id;

    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private EntityStatus status;

}
