package com.example.instagramapi.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "posts")
@Getter
@NoArgsConstructor
public class Post extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 2000)
    private String content;

    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)  // user 정보를 사용 할 때만 가져오도록
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Builder
    public Post(String content, String imageUrl, User user) {
        this.content = content;
        this.imageUrl = imageUrl;
        this.user = user;
    }
}
