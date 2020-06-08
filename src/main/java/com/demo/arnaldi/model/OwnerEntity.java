package com.demo.arnaldi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name = "OWNER")
public class OwnerEntity implements Serializable {

	
	private String login;
	
	@Id
	private Long id;
	
	private String nodeId;
	
	private String avatarUrl;
	
	private String gravatarId;
	
	private String url;
	
	private String htmlUrl;
	
	private String followersUrl;
	
	private String followingUrl;
	
	private String gistsUrl;
	
	private String starredUrl;
	
	private String subscriptionsUrl;
	
	private String organizationsUrl;
	
	private String reposUrl;
	
	private String eventsUrl;
	
	private String receivedEventsUrl;
	
	private String type;
	
	private Boolean siteAdmin;
	
	@OneToMany(cascade = CascadeType.ALL , mappedBy="owner", orphanRemoval = true)	
	private List<GitHubRepoEntity> gitHubRepos = new ArrayList<>();
	
	private final static long serialVersionUID = -7016781267252968117L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public OwnerEntity() {
	}

	/**
	 *
	 * @param receivedEventsUrl
	 * @param siteAdmin
	 * @param followingUrl
	 * @param gistsUrl
	 * @param avatarUrl
	 * @param organizationsUrl
	 * @param reposUrl
	 * @param htmlUrl
	 * @param subscriptionsUrl
	 * @param login
	 * @param type
	 * @param url
	 * @param starredUrl
	 * @param gravatarId
	 * @param followersUrl
	 * @param id
	 * @param eventsUrl
	 * @param nodeId
	 */
	public OwnerEntity(String login, Long id, String nodeId, String avatarUrl, String gravatarId, String url,
			String htmlUrl, String followersUrl, String followingUrl, String gistsUrl, String starredUrl,
			String subscriptionsUrl, String organizationsUrl, String reposUrl, String eventsUrl,
			String receivedEventsUrl, String type, Boolean siteAdmin) {
		super();
		this.login = login;
		this.id = id;
		this.nodeId = nodeId;
		this.avatarUrl = avatarUrl;
		this.gravatarId = gravatarId;
		this.url = url;
		this.htmlUrl = htmlUrl;
		this.followersUrl = followersUrl;
		this.followingUrl = followingUrl;
		this.gistsUrl = gistsUrl;
		this.starredUrl = starredUrl;
		this.subscriptionsUrl = subscriptionsUrl;
		this.organizationsUrl = organizationsUrl;
		this.reposUrl = reposUrl;
		this.eventsUrl = eventsUrl;
		this.receivedEventsUrl = receivedEventsUrl;
		this.type = type;
		this.siteAdmin = siteAdmin;
	}

	
	
	public List<GitHubRepoEntity> getGitHubRepos() {
		return gitHubRepos;
	}

	public void setGitHubRepos(List<GitHubRepoEntity> gitHubRepos) {
		this.gitHubRepos = gitHubRepos;
	}

	public String getLogin() {
		return login;
	}

	
	public void setLogin(String login) {
		this.login = login;
	}

	
	public Long getId() {
		return id;
	}

	
	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNodeId() {
		return nodeId;
	}

	
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	
	public String getAvatarUrl() {
		return avatarUrl;
	}

	
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	
	public String getGravatarId() {
		return gravatarId;
	}

	
	public void setGravatarId(String gravatarId) {
		this.gravatarId = gravatarId;
	}

	
	public String getUrl() {
		return url;
	}

	
	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getHtmlUrl() {
		return htmlUrl;
	}

	
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	
	public String getFollowersUrl() {
		return followersUrl;
	}

	
	public void setFollowersUrl(String followersUrl) {
		this.followersUrl = followersUrl;
	}

	
	public String getFollowingUrl() {
		return followingUrl;
	}

	
	public void setFollowingUrl(String followingUrl) {
		this.followingUrl = followingUrl;
	}

	
	public String getGistsUrl() {
		return gistsUrl;
	}

	
	public void setGistsUrl(String gistsUrl) {
		this.gistsUrl = gistsUrl;
	}

	
	public String getStarredUrl() {
		return starredUrl;
	}

	
	public void setStarredUrl(String starredUrl) {
		this.starredUrl = starredUrl;
	}

	
	public String getSubscriptionsUrl() {
		return subscriptionsUrl;
	}

	
	public void setSubscriptionsUrl(String subscriptionsUrl) {
		this.subscriptionsUrl = subscriptionsUrl;
	}

	
	public String getOrganizationsUrl() {
		return organizationsUrl;
	}

	
	public void setOrganizationsUrl(String organizationsUrl) {
		this.organizationsUrl = organizationsUrl;
	}

	
	public String getReposUrl() {
		return reposUrl;
	}

	
	public void setReposUrl(String reposUrl) {
		this.reposUrl = reposUrl;
	}

	
	public String getEventsUrl() {
		return eventsUrl;
	}

	
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	
	public String getReceivedEventsUrl() {
		return receivedEventsUrl;
	}

	
	public void setReceivedEventsUrl(String receivedEventsUrl) {
		this.receivedEventsUrl = receivedEventsUrl;
	}

	
	public String getType() {
		return type;
	}

	
	public void setType(String type) {
		this.type = type;
	}

	
	public Boolean getSiteAdmin() {
		return siteAdmin;
	}

	
	public void setSiteAdmin(Boolean siteAdmin) {
		this.siteAdmin = siteAdmin;
	}

	

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("login", login).append("id", id).append("nodeId", nodeId)
				.append("avatarUrl", avatarUrl).append("gravatarId", gravatarId).append("url", url)
				.append("htmlUrl", htmlUrl).append("followersUrl", followersUrl).append("followingUrl", followingUrl)
				.append("gistsUrl", gistsUrl).append("starredUrl", starredUrl)
				.append("subscriptionsUrl", subscriptionsUrl).append("organizationsUrl", organizationsUrl)
				.append("reposUrl", reposUrl).append("eventsUrl", eventsUrl)
				.append("receivedEventsUrl", receivedEventsUrl).append("type", type).append("siteAdmin", siteAdmin)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(receivedEventsUrl).append(siteAdmin).append(followingUrl).append(gistsUrl)
				.append(avatarUrl).append(organizationsUrl).append(reposUrl).append(htmlUrl).append(subscriptionsUrl)
				.append(login).append(type).append(url).append(starredUrl).append(gravatarId).append(followersUrl)
				.append(id).append(eventsUrl).append(nodeId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof OwnerEntity) == false) {
			return false;
		}
		OwnerEntity rhs = ((OwnerEntity) other);
		return new EqualsBuilder().append(receivedEventsUrl, rhs.receivedEventsUrl).append(siteAdmin, rhs.siteAdmin)
				.append(followingUrl, rhs.followingUrl).append(gistsUrl, rhs.gistsUrl).append(avatarUrl, rhs.avatarUrl)
				.append(organizationsUrl, rhs.organizationsUrl).append(reposUrl, rhs.reposUrl)
				.append(htmlUrl, rhs.htmlUrl).append(subscriptionsUrl, rhs.subscriptionsUrl).append(login, rhs.login)
				.append(type, rhs.type).append(url, rhs.url).append(starredUrl, rhs.starredUrl)
				.append(gravatarId, rhs.gravatarId).append(followersUrl, rhs.followersUrl).append(id, rhs.id)
				.append(eventsUrl, rhs.eventsUrl)
				.append(nodeId, rhs.nodeId).isEquals();
	}

}
