package com.healthgroup.explorehealthtoday.repository;

import com.healthgroup.explorehealthtoday.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long>{
}