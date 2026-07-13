package com.example.be.infrastructure.listener;

import com.example.be.entity.base.AudiEntity;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

import java.util.Calendar;

public class AuditEntityListener {

    @PrePersist
    private void onCreate(AudiEntity entity){
        long now = System.currentTimeMillis();
         entity.setCreateDate(now);
         entity.setLastmodifiedDate(now);
    }

    @PreUpdate
    private void onUpdate(AudiEntity entity){
        entity.setLastmodifiedDate(System.currentTimeMillis());
    }


}
