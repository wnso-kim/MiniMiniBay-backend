package com.mmbay.mmbay.domain.chatMessage.entity;


import com.mmbay.mmbay.domain.chatRoom.entity.ChatRoom;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chat_message_id")
    private Long id;
    private String message;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chat_room_id")
    private ChatRoom chatRoom;
    private LocalDateTime createdAt;
    @Enumerated(EnumType.STRING)
    private IsRead isRead;
}
