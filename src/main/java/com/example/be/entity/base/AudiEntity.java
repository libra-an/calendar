package com.example.be.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AudiEntity {

    @Column(updatable = false)
    private long createDate;

    @Column
    private long lastmodifiedDate;

}
