package com.example.instagramapi.repository;

import com.example.instagramapi.entity.Post;
import com.example.instagramapi.entity.PostLike;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PostLikeRepository extends JpaRepository<PostLike, Long> {

    // 좋아요 조회
    Optional<PostLike> findByUserIdAndPostId(Long userID, Long postId);

    // 좋아요 여부 확인
    boolean existsByUserIdAndPostId(Long userId, Long postId);

    // 게시물의 좋아요 수
    long countByPostId(Long postId);


}
