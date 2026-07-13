package com.example.be.infrastructure.listener;

import com.example.be.core.constant.EntityStatus;
import com.example.be.entity.base.PrimaryEntity;
import jakarta.persistence.PrePersist;

import java.util.UUID;

public class CreatePrimaryEntityListener {

    @PrePersist
    private void onCreate(PrimaryEntity entity)
    {
        if (entity.getId() == null) {
        entity.setId(UUID.randomUUID().toString());
    }
        if (entity.getStatus() == null) {
            entity.setStatus(EntityStatus.ACTIVE);
        }
    }




}
