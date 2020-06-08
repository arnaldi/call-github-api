package com.demo.arnaldi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.arnaldi.model.GitHubRepoResponse;
import com.demo.arnaldi.model.Search;
import com.demo.arnaldi.services.GitHubRepoResponseService;



@Controller
public class SearchController {
	
	@Autowired
	GitHubRepoResponseService gitHubRepoResponseService;

	@RequestMapping(path="/search")
	public String search(Model model) {
        model.addAttribute("userForm", new Search());

        return "search";
    }
	
	
	@PostMapping(path="/postSearchData", consumes = "application/json;charset=UTF-8")
	public String postSearchData(@RequestBody GitHubRepoResponse gitHubRepoResponse) {
		gitHubRepoResponseService.save(gitHubRepoResponse);
		return "Success";
	}
	
	@RequestMapping(path="/report")
	public String report(Model model) {
        model.addAttribute("userForm", new Search());

        return "report";
    }
}
