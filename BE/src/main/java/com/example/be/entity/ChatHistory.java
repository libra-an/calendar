package com.example.be.entity;

import com.example.be.entity.base.PrimaryEntity;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "chat_histories")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatHistory extends PrimaryEntity implements Serializable {


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(nullable = false, length = 20)
    private String role;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

}