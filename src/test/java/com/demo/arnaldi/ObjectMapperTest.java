package com.demo.arnaldi;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import com.demo.arnaldi.model.GitHubRepoResponse;
import com.demo.arnaldi.model.GitHubRepoResponseEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperTest {
	
	private static String gitHubRepoResponseJson;
	
	@BeforeAll
	public static void init() {
		gitHubRepoResponseJson = "{\r\n" + 
				"\"total_count\": 127,\r\n" + 
				"  \"incomplete_results\": false,\r\n" + 
				"  \"items\": [\r\n" + 
				"    {\r\n" + 
				"      \"id\": 21330705,\r\n" + 
				"      \"node_id\": \"MDEwOlJlcG9zaXRvcnkyMTMzMDcwNQ==\",\r\n" + 
				"      \"name\": \"JavaFX-Tetris-Clone\",\r\n" + 
				"      \"full_name\": \"javafx-dev/JavaFX-Tetris-Clone\",\r\n" + 
				"      \"private\": false,\r\n" + 
				"      \"owner\": {\r\n" + 
				"        \"login\": \"javafx-dev\",\r\n" + 
				"        \"id\": 8020348,\r\n" + 
				"        \"node_id\": \"MDQ6VXNlcjgwMjAzNDg=\",\r\n" + 
				"        \"avatar_url\": \"https://avatars2.githubusercontent.com/u/8020348?v=4\",\r\n" + 
				"        \"gravatar_id\": \"\",\r\n" + 
				"        \"url\": \"https://api.github.com/users/javafx-dev\",\r\n" + 
				"        \"html_url\": \"https://github.com/javafx-dev\",\r\n" + 
				"        \"followers_url\": \"https://api.github.com/users/javafx-dev/followers\",\r\n" + 
				"        \"following_url\": \"https://api.github.com/users/javafx-dev/following{/other_user}\",\r\n" + 
				"        \"gists_url\": \"https://api.github.com/users/javafx-dev/gists{/gist_id}\",\r\n" + 
				"        \"starred_url\": \"https://api.github.com/users/javafx-dev/starred{/owner}{/repo}\",\r\n" + 
				"        \"subscriptions_url\": \"https://api.github.com/users/javafx-dev/subscriptions\",\r\n" + 
				"        \"organizations_url\": \"https://api.github.com/users/javafx-dev/orgs\",\r\n" + 
				"        \"repos_url\": \"https://api.github.com/users/javafx-dev/repos\",\r\n" + 
				"        \"events_url\": \"https://api.github.com/users/javafx-dev/events{/privacy}\",\r\n" + 
				"        \"received_events_url\": \"https://api.github.com/users/javafx-dev/received_events\",\r\n" + 
				"        \"type\": \"User\",\r\n" + 
				"        \"site_admin\": false\r\n" + 
				"      },\r\n" + 
				"      \"html_url\": \"https://github.com/javafx-dev/JavaFX-Tetris-Clone\",\r\n" + 
				"      \"description\": \"JavaFX Tetris game clone written in Java 8\",\r\n" + 
				"      \"fork\": false,\r\n" + 
				"      \"url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone\",\r\n" + 
				"      \"forks_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/forks\",\r\n" + 
				"      \"keys_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/keys{/key_id}\",\r\n" + 
				"      \"collaborators_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/collaborators{/collaborator}\",\r\n" + 
				"      \"teams_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/teams\",\r\n" + 
				"      \"hooks_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/hooks\",\r\n" + 
				"      \"issue_events_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/issues/events{/number}\",\r\n" + 
				"      \"events_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/events\",\r\n" + 
				"      \"assignees_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/assignees{/user}\",\r\n" + 
				"      \"branches_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/branches{/branch}\",\r\n" + 
				"      \"tags_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/tags\",\r\n" + 
				"      \"blobs_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/git/blobs{/sha}\",\r\n" + 
				"      \"git_tags_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/git/tags{/sha}\",\r\n" + 
				"      \"git_refs_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/git/refs{/sha}\",\r\n" + 
				"      \"trees_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/git/trees{/sha}\",\r\n" + 
				"      \"statuses_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/statuses/{sha}\",\r\n" + 
				"      \"languages_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/languages\",\r\n" + 
				"      \"stargazers_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/stargazers\",\r\n" + 
				"      \"contributors_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/contributors\",\r\n" + 
				"      \"subscribers_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/subscribers\",\r\n" + 
				"      \"subscription_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/subscription\",\r\n" + 
				"      \"commits_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/commits{/sha}\",\r\n" + 
				"      \"git_commits_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/git/commits{/sha}\",\r\n" + 
				"      \"comments_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/comments{/number}\",\r\n" + 
				"      \"issue_comment_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/issues/comments{/number}\",\r\n" + 
				"      \"contents_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/contents/{+path}\",\r\n" + 
				"      \"compare_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/compare/{base}...{head}\",\r\n" + 
				"      \"merges_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/merges\",\r\n" + 
				"      \"archive_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/{archive_format}{/ref}\",\r\n" + 
				"      \"downloads_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/downloads\",\r\n" + 
				"      \"issues_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/issues{/number}\",\r\n" + 
				"      \"pulls_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/pulls{/number}\",\r\n" + 
				"      \"milestones_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/milestones{/number}\",\r\n" + 
				"      \"notifications_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/notifications{?since,all,participating}\",\r\n" + 
				"      \"labels_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/labels{/name}\",\r\n" + 
				"      \"releases_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/releases{/id}\",\r\n" + 
				"      \"deployments_url\": \"https://api.github.com/repos/javafx-dev/JavaFX-Tetris-Clone/deployments\",\r\n" + 
				"      \"created_at\": \"2014-06-29T19:37:13Z\",\r\n" + 
				"      \"updated_at\": \"2020-05-18T14:31:09Z\",\r\n" + 
				"      \"pushed_at\": \"2014-06-30T07:11:06Z\",\r\n" + 
				"      \"git_url\": \"git://github.com/javafx-dev/JavaFX-Tetris-Clone.git\",\r\n" + 
				"      \"ssh_url\": \"git@github.com:javafx-dev/JavaFX-Tetris-Clone.git\",\r\n" + 
				"      \"clone_url\": \"https://github.com/javafx-dev/JavaFX-Tetris-Clone.git\",\r\n" + 
				"      \"svn_url\": \"https://github.com/javafx-dev/JavaFX-Tetris-Clone\",\r\n" + 
				"      \"homepage\": null,\r\n" + 
				"      \"size\": 208,\r\n" + 
				"      \"stargazers_count\": 33,\r\n" + 
				"      \"watchers_count\": 33,\r\n" + 
				"      \"language\": \"Java\",\r\n" + 
				"      \"has_issues\": true,\r\n" + 
				"      \"has_projects\": true,\r\n" + 
				"      \"has_downloads\": true,\r\n" + 
				"      \"has_wiki\": true,\r\n" + 
				"      \"has_pages\": false,\r\n" + 
				"      \"forks_count\": 20,\r\n" + 
				"      \"mirror_url\": null,\r\n" + 
				"      \"archived\": false,\r\n" + 
				"      \"disabled\": false,\r\n" + 
				"      \"open_issues_count\": 0,\r\n" + 
				"      \"license\": null,\r\n" + 
				"      \"topics\": [\r\n" + 
				"        \"game\",\r\n" + 
				"        \"java\",\r\n" + 
				"        \"javfx\",\r\n" + 
				"        \"tetris\",\r\n" + 
				"        \"tetris-game\"\r\n" + 
				"      ],\r\n" + 
				"      \"forks\": 20,\r\n" + 
				"      \"open_issues\": 0,\r\n" + 
				"      \"watchers\": 33,\r\n" + 
				"      \"default_branch\": \"master\",\r\n" + 
				"      \"score\": 1.0\r\n" + 
				"    }\r\n" + 
				" ]  \r\n" + 
				"}";
		
		
	}
	
	@Test
	public void givenJsonStringWhenMappedToGitHubRepoResponseThenValuesMappedCorrectly() {
		ObjectMapper objMapper = new ObjectMapper();
		GitHubRepoResponse gitHubRepoResponse = null;
		try {
			 gitHubRepoResponse = objMapper.readValue(gitHubRepoResponseJson, GitHubRepoResponse.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GitHubRepoResponse expectedGitHubRepoResponse= new GitHubRepoResponse(100, false, new ArrayList<>());
		assertThat( expectedGitHubRepoResponse.getIncompleteResults(), is( gitHubRepoResponse.getIncompleteResults() ) );
	}

	@Test
	public void givenGitHubRepoResponseWithValueWhenMappedToGitHubRepoResponseEntityThenValuesMappedCorrectly() {
		ModelMapper modelMapper = new ModelMapper();
		ObjectMapper objMapper = new ObjectMapper();
		GitHubRepoResponse gitHubRepoResponse = null;
		try {
			 gitHubRepoResponse = objMapper.readValue(gitHubRepoResponseJson, GitHubRepoResponse.class);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		GitHubRepoResponseEntity gitHubRepoResponseEntity = modelMapper.map(gitHubRepoResponse, GitHubRepoResponseEntity.class); 
		
		assertThat( gitHubRepoResponseEntity.getIncompleteResults(), is( gitHubRepoResponse.getIncompleteResults() ) );
		
		
	}
}
