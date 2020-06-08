package com.demo.arnaldi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.arnaldi.model.GitHubRepoResponseEntity;

public interface GitHubRepoResponseRepository extends JpaRepository<GitHubRepoResponseEntity, Long> {

}
