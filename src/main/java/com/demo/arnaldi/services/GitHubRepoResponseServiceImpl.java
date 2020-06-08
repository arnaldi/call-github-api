package com.demo.arnaldi.services;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.arnaldi.model.GitHubRepoEntity;
import com.demo.arnaldi.model.GitHubRepoResponse;
import com.demo.arnaldi.model.GitHubRepoResponseEntity;
import com.demo.arnaldi.model.OwnerEntity;
import com.demo.arnaldi.repositories.GitHubRepoResponseRepository;
import com.demo.arnaldi.repositories.OwnerRepository;

@Service
public class GitHubRepoResponseServiceImpl implements GitHubRepoResponseService{
	
	@Autowired
	private GitHubRepoResponseRepository gitHubRepoResponseRepository;
	
	@Autowired
	private OwnerRepository ownerRepository;

	@Override
	public void save(GitHubRepoResponse gitHubRepoResponse) {
		ModelMapper modelMapper = new ModelMapper();
		GitHubRepoResponseEntity gitHubRepoResponseEntity = modelMapper.map(gitHubRepoResponse, GitHubRepoResponseEntity.class);
		for(GitHubRepoEntity gitHubRepoEntity : gitHubRepoResponseEntity.getItems()) {
			Optional<OwnerEntity> ownerById = ownerRepository.findById(gitHubRepoEntity.getOwner().getId());
			if(!ownerById.isPresent()) {
				ownerRepository.saveAndFlush(gitHubRepoEntity.getOwner());
			}
		}
		
		gitHubRepoResponseRepository.save(gitHubRepoResponseEntity);
		
	}

}
