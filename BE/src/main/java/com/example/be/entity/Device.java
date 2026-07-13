package com.example.be.entity;

import com.example.be.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "devices")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Device extends PrimaryEntity implements Serializable {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "device_token", nullable = false, unique = true, length = 500)
    private String deviceToken;

    @Column(name = "device_name", length = 100)
    private String deviceName;

    @Column(name = "is_active")
    private Boolean isActive = true;


}