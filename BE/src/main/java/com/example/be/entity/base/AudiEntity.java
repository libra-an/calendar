package com.example.be.entity.base;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class AudiEntity {

    @Column(name = "create_date", updatable = false)
    private long createDate;

    @Column(name = "lastmodified_date")
    private long lastmodifiedDate;

}
