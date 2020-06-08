package com.demo.arnaldi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="GITHUB_REPOSITORY")
public class GitHubRepoEntity implements Serializable {

	@Id
	private Integer id;
	
	private String nodeId;
	
	private String name;
	
	private String fullName;
	
	private Boolean _private;
	
	@ManyToOne
	@JoinColumn(name="github_repo_id")
	private OwnerEntity owner;
	
	private String htmlUrl;
	
	private String description;
	
	private Boolean fork;
	
	private String url;
	
	private String forksUrl;
	
	private String keysUrl;
	
	private String collaboratorsUrl;
	
	private String teamsUrl;
	
	private String hooksUrl;
	
	private String issueEventsUrl;
	
	private String eventsUrl;
	
	private String assigneesUrl;
	
	private String branchesUrl;
	
	private String tagsUrl;
	
	private String blobsUrl;
	
	private String gitTagsUrl;
	
	private String gitRefsUrl;
	
	private String treesUrl;
	
	private String statusesUrl;
	
	private String languagesUrl;
	
	private String stargazersUrl;
	
	private String contributorsUrl;
	
	private String subscribersUrl;
	
	private String subscriptionUrl;
	
	private String commitsUrl;
	
	private String gitCommitsUrl;
	
	private String commentsUrl;
	
	private String issueCommentUrl;
	
	private String contentsUrl;
	
	private String compareUrl;
	
	private String mergesUrl;
	
	private String archiveUrl;
	
	private String downloadsUrl;
	
	private String issuesUrl;
	
	private String pullsUrl;
	
	private String milestonesUrl;
	
	private String notificationsUrl;
	
	private String labelsUrl;
	
	private String releasesUrl;
	
	private String deploymentsUrl;
	
	private String createdAt;
	
	private String updatedAt;
	
	private String pushedAt;
	
	private String gitUrl;
	
	private String sshUrl;
	
	private String cloneUrl;
	
	private String svnUrl;
	
	private String homepage;
	
	private Integer size;
	
	private Integer stargazersCount;
	
	private Integer watchersCount;
	
	private String language;
	
	private Boolean hasIssues;
	
	private Boolean hasProjects;
	
	private Boolean hasDownloads;
	
	private Boolean hasWiki;
	
	private Boolean hasPages;
	
	private Integer forksCount;
	
	private String mirrorUrl;
	
	private Boolean archived;
	
	private Boolean disabled;
	
	private Integer openIssuesCount;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private LicenseEntity license;
	
	@ElementCollection
	@CollectionTable(name="TOPICS")
	@Column(name = "TOPIC")
	@GenericGenerator(name="seqGenerator",strategy="sequence")
	@CollectionId(columns = @Column(name = "TOPIC_ID"),
			type = @Type(type = "long"),
			generator = "seqGenerator")
	private Collection<String> topics = new ArrayList<>();
	
	private Integer forks;
	
	private Integer openIssues;
	
	private Integer watchers;
	
	private String defaultBranch;
	
	private Double score;
	
	@ManyToMany(mappedBy= "items")
	private Set<GitHubRepoResponseEntity> gitHubRepoResponse = new HashSet<GitHubRepoResponseEntity>();
	
	
	
	private final static long serialVersionUID = -1425077232694712104L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GitHubRepoEntity() {
	}

	/**
	 *
	 * @param sshUrl
	 * @param archiveUrl
	 * @param languagesUrl
	 * @param language
	 * @param assigneesUrl
	 * @param commitsUrl
	 * @param openIssues
	 * @param cloneUrl
	 * @param forksCount
	 * @param subscribersUrl
	 * @param createdAt
	 * @param score
	 * @param forksUrl
	 * @param watchersCount
	 * @param _private
	 * @param issueCommentUrl
	 * @param statusesUrl
	 * @param id
	 * @param collaboratorsUrl
	 * @param updatedAt
	 * @param forks
	 * @param labelsUrl
	 * @param defaultBranch
	 * @param keysUrl
	 * @param downloadsUrl
	 * @param contentsUrl
	 * @param pushedAt
	 * @param tagsUrl
	 * @param license
	 * @param commentsUrl
	 * @param size
	 * @param treesUrl
	 * @param name
	 * @param mergesUrl
	 * @param nodeId
	 * @param teamsUrl
	 * @param blobsUrl
	 * @param issueEventsUrl
	 * @param hasPages
	 * @param milestonesUrl
	 * @param issuesUrl
	 * @param releasesUrl
	 * @param description
	 * @param watchers
	 * @param branchesUrl
	 * @param contributorsUrl
	 * @param gitRefsUrl
	 * @param hooksUrl
	 * @param openIssuesCount
	 * @param archived
	 * @param stargazersCount
	 * @param disabled
	 * @param hasIssues
	 * @param owner
	 * @param hasWiki
	 * @param compareUrl
	 * @param gitCommitsUrl
	 * @param topics
	 * @param htmlUrl
	 * @param stargazersUrl
	 * @param fullName
	 * @param svnUrl
	 * @param url
	 * @param pullsUrl
	 * @param mirrorUrl
	 * @param hasDownloads
	 * @param fork
	 * @param hasProjects
	 * @param deploymentsUrl
	 * @param eventsUrl
	 * @param gitTagsUrl
	 * @param notificationsUrl
	 * @param gitUrl
	 * @param subscriptionUrl
	 * @param homepage
	 */
	public GitHubRepoEntity(Integer id, String nodeId, String name, String fullName, Boolean _private, OwnerEntity owner,
			String htmlUrl, String description, Boolean fork, String url, String forksUrl, String keysUrl,
			String collaboratorsUrl, String teamsUrl, String hooksUrl, String issueEventsUrl, String eventsUrl,
			String assigneesUrl, String branchesUrl, String tagsUrl, String blobsUrl, String gitTagsUrl,
			String gitRefsUrl, String treesUrl, String statusesUrl, String languagesUrl, String stargazersUrl,
			String contributorsUrl, String subscribersUrl, String subscriptionUrl, String commitsUrl,
			String gitCommitsUrl, String commentsUrl, String issueCommentUrl, String contentsUrl, String compareUrl,
			String mergesUrl, String archiveUrl, String downloadsUrl, String issuesUrl, String pullsUrl,
			String milestonesUrl, String notificationsUrl, String labelsUrl, String releasesUrl, String deploymentsUrl,
			String createdAt, String updatedAt, String pushedAt, String gitUrl, String sshUrl, String cloneUrl,
			String svnUrl, String homepage, Integer size, Integer stargazersCount, Integer watchersCount,
			String language, Boolean hasIssues, Boolean hasProjects, Boolean hasDownloads, Boolean hasWiki,
			Boolean hasPages, Integer forksCount, String mirrorUrl, Boolean archived, Boolean disabled,
			Integer openIssuesCount, LicenseEntity license, List<String> topics, Integer forks, Integer openIssues,
			Integer watchers, String defaultBranch, Double score) {
		super();
		this.id = id;
		this.nodeId = nodeId;
		this.name = name;
		this.fullName = fullName;
		this._private = _private;
		this.owner = owner;
		this.htmlUrl = htmlUrl;
		this.description = description;
		this.fork = fork;
		this.url = url;
		this.forksUrl = forksUrl;
		this.keysUrl = keysUrl;
		this.collaboratorsUrl = collaboratorsUrl;
		this.teamsUrl = teamsUrl;
		this.hooksUrl = hooksUrl;
		this.issueEventsUrl = issueEventsUrl;
		this.eventsUrl = eventsUrl;
		this.assigneesUrl = assigneesUrl;
		this.branchesUrl = branchesUrl;
		this.tagsUrl = tagsUrl;
		this.blobsUrl = blobsUrl;
		this.gitTagsUrl = gitTagsUrl;
		this.gitRefsUrl = gitRefsUrl;
		this.treesUrl = treesUrl;
		this.statusesUrl = statusesUrl;
		this.languagesUrl = languagesUrl;
		this.stargazersUrl = stargazersUrl;
		this.contributorsUrl = contributorsUrl;
		this.subscribersUrl = subscribersUrl;
		this.subscriptionUrl = subscriptionUrl;
		this.commitsUrl = commitsUrl;
		this.gitCommitsUrl = gitCommitsUrl;
		this.commentsUrl = commentsUrl;
		this.issueCommentUrl = issueCommentUrl;
		this.contentsUrl = contentsUrl;
		this.compareUrl = compareUrl;
		this.mergesUrl = mergesUrl;
		this.archiveUrl = archiveUrl;
		this.downloadsUrl = downloadsUrl;
		this.issuesUrl = issuesUrl;
		this.pullsUrl = pullsUrl;
		this.milestonesUrl = milestonesUrl;
		this.notificationsUrl = notificationsUrl;
		this.labelsUrl = labelsUrl;
		this.releasesUrl = releasesUrl;
		this.deploymentsUrl = deploymentsUrl;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.pushedAt = pushedAt;
		this.gitUrl = gitUrl;
		this.sshUrl = sshUrl;
		this.cloneUrl = cloneUrl;
		this.svnUrl = svnUrl;
		this.homepage = homepage;
		this.size = size;
		this.stargazersCount = stargazersCount;
		this.watchersCount = watchersCount;
		this.language = language;
		this.hasIssues = hasIssues;
		this.hasProjects = hasProjects;
		this.hasDownloads = hasDownloads;
		this.hasWiki = hasWiki;
		this.hasPages = hasPages;
		this.forksCount = forksCount;
		this.mirrorUrl = mirrorUrl;
		this.archived = archived;
		this.disabled = disabled;
		this.openIssuesCount = openIssuesCount;
		this.license = license;
		this.topics = topics;
		this.forks = forks;
		this.openIssues = openIssues;
		this.watchers = watchers;
		this.defaultBranch = defaultBranch;
		this.score = score;
	}

	
	
	public Boolean get_private() {
		return _private;
	}

	public void set_private(Boolean _private) {
		this._private = _private;
	}

	public Set<GitHubRepoResponseEntity> getGitHubRepoResponse() {
		return gitHubRepoResponse;
	}

	public void setGitHubRepoResponse(Set<GitHubRepoResponseEntity> gitHubRepoResponse) {
		this.gitHubRepoResponse = gitHubRepoResponse;
	}

	public void setTopics(Collection<String> topics) {
		this.topics = topics;
	}

	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getNodeId() {
		return nodeId;
	}

	
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getFullName() {
		return fullName;
	}

	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	public Boolean getPrivate() {
		return _private;
	}

	
	public void setPrivate(Boolean _private) {
		this._private = _private;
	}

	
	public OwnerEntity getOwner() {
		return owner;
	}

	
	public void setOwner(OwnerEntity owner) {
		this.owner = owner;
	}

	
	public String getHtmlUrl() {
		return htmlUrl;
	}

	
	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	
	public Boolean getFork() {
		return fork;
	}

	
	public void setFork(Boolean fork) {
		this.fork = fork;
	}

	
	public String getUrl() {
		return url;
	}

	
	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getForksUrl() {
		return forksUrl;
	}

	
	public void setForksUrl(String forksUrl) {
		this.forksUrl = forksUrl;
	}

	
	public String getKeysUrl() {
		return keysUrl;
	}

	
	public void setKeysUrl(String keysUrl) {
		this.keysUrl = keysUrl;
	}

	
	public String getCollaboratorsUrl() {
		return collaboratorsUrl;
	}

	
	public void setCollaboratorsUrl(String collaboratorsUrl) {
		this.collaboratorsUrl = collaboratorsUrl;
	}

	
	public String getTeamsUrl() {
		return teamsUrl;
	}

	
	public void setTeamsUrl(String teamsUrl) {
		this.teamsUrl = teamsUrl;
	}

	
	public String getHooksUrl() {
		return hooksUrl;
	}

	
	public void setHooksUrl(String hooksUrl) {
		this.hooksUrl = hooksUrl;
	}

	
	public String getIssueEventsUrl() {
		return issueEventsUrl;
	}

	
	public void setIssueEventsUrl(String issueEventsUrl) {
		this.issueEventsUrl = issueEventsUrl;
	}

	
	public String getEventsUrl() {
		return eventsUrl;
	}

	
	public void setEventsUrl(String eventsUrl) {
		this.eventsUrl = eventsUrl;
	}

	
	public String getAssigneesUrl() {
		return assigneesUrl;
	}

	
	public void setAssigneesUrl(String assigneesUrl) {
		this.assigneesUrl = assigneesUrl;
	}

	
	public String getBranchesUrl() {
		return branchesUrl;
	}

	
	public void setBranchesUrl(String branchesUrl) {
		this.branchesUrl = branchesUrl;
	}

	
	public String getTagsUrl() {
		return tagsUrl;
	}

	
	public void setTagsUrl(String tagsUrl) {
		this.tagsUrl = tagsUrl;
	}

	
	public String getBlobsUrl() {
		return blobsUrl;
	}

	
	public void setBlobsUrl(String blobsUrl) {
		this.blobsUrl = blobsUrl;
	}

	
	public String getGitTagsUrl() {
		return gitTagsUrl;
	}

	
	public void setGitTagsUrl(String gitTagsUrl) {
		this.gitTagsUrl = gitTagsUrl;
	}

	
	public String getGitRefsUrl() {
		return gitRefsUrl;
	}

	
	public void setGitRefsUrl(String gitRefsUrl) {
		this.gitRefsUrl = gitRefsUrl;
	}

	
	public String getTreesUrl() {
		return treesUrl;
	}

	
	public void setTreesUrl(String treesUrl) {
		this.treesUrl = treesUrl;
	}

	
	public String getStatusesUrl() {
		return statusesUrl;
	}

	
	public void setStatusesUrl(String statusesUrl) {
		this.statusesUrl = statusesUrl;
	}

	
	public String getLanguagesUrl() {
		return languagesUrl;
	}

	
	public void setLanguagesUrl(String languagesUrl) {
		this.languagesUrl = languagesUrl;
	}

	
	public String getStargazersUrl() {
		return stargazersUrl;
	}

	
	public void setStargazersUrl(String stargazersUrl) {
		this.stargazersUrl = stargazersUrl;
	}

	
	public String getContributorsUrl() {
		return contributorsUrl;
	}

	
	public void setContributorsUrl(String contributorsUrl) {
		this.contributorsUrl = contributorsUrl;
	}

	
	public String getSubscribersUrl() {
		return subscribersUrl;
	}

	
	public void setSubscribersUrl(String subscribersUrl) {
		this.subscribersUrl = subscribersUrl;
	}

	
	public String getSubscriptionUrl() {
		return subscriptionUrl;
	}

	
	public void setSubscriptionUrl(String subscriptionUrl) {
		this.subscriptionUrl = subscriptionUrl;
	}

	
	public String getCommitsUrl() {
		return commitsUrl;
	}

	
	public void setCommitsUrl(String commitsUrl) {
		this.commitsUrl = commitsUrl;
	}

	
	public String getGitCommitsUrl() {
		return gitCommitsUrl;
	}

	
	public void setGitCommitsUrl(String gitCommitsUrl) {
		this.gitCommitsUrl = gitCommitsUrl;
	}

	
	public String getCommentsUrl() {
		return commentsUrl;
	}

	
	public void setCommentsUrl(String commentsUrl) {
		this.commentsUrl = commentsUrl;
	}

	
	public String getIssueCommentUrl() {
		return issueCommentUrl;
	}

	
	public void setIssueCommentUrl(String issueCommentUrl) {
		this.issueCommentUrl = issueCommentUrl;
	}

	
	public String getContentsUrl() {
		return contentsUrl;
	}

	
	public void setContentsUrl(String contentsUrl) {
		this.contentsUrl = contentsUrl;
	}

	
	public String getCompareUrl() {
		return compareUrl;
	}

	
	public void setCompareUrl(String compareUrl) {
		this.compareUrl = compareUrl;
	}

	
	public String getMergesUrl() {
		return mergesUrl;
	}

	
	public void setMergesUrl(String mergesUrl) {
		this.mergesUrl = mergesUrl;
	}

	
	public String getArchiveUrl() {
		return archiveUrl;
	}

	
	public void setArchiveUrl(String archiveUrl) {
		this.archiveUrl = archiveUrl;
	}

	
	public String getDownloadsUrl() {
		return downloadsUrl;
	}

	
	public void setDownloadsUrl(String downloadsUrl) {
		this.downloadsUrl = downloadsUrl;
	}

	
	public String getIssuesUrl() {
		return issuesUrl;
	}

	
	public void setIssuesUrl(String issuesUrl) {
		this.issuesUrl = issuesUrl;
	}

	
	public String getPullsUrl() {
		return pullsUrl;
	}

	
	public void setPullsUrl(String pullsUrl) {
		this.pullsUrl = pullsUrl;
	}

	
	public String getMilestonesUrl() {
		return milestonesUrl;
	}

	
	public void setMilestonesUrl(String milestonesUrl) {
		this.milestonesUrl = milestonesUrl;
	}

	
	public String getNotificationsUrl() {
		return notificationsUrl;
	}

	
	public void setNotificationsUrl(String notificationsUrl) {
		this.notificationsUrl = notificationsUrl;
	}

	
	public String getLabelsUrl() {
		return labelsUrl;
	}

	
	public void setLabelsUrl(String labelsUrl) {
		this.labelsUrl = labelsUrl;
	}

	
	public String getReleasesUrl() {
		return releasesUrl;
	}

	
	public void setReleasesUrl(String releasesUrl) {
		this.releasesUrl = releasesUrl;
	}

	
	public String getDeploymentsUrl() {
		return deploymentsUrl;
	}

	
	public void setDeploymentsUrl(String deploymentsUrl) {
		this.deploymentsUrl = deploymentsUrl;
	}

	
	public String getCreatedAt() {
		return createdAt;
	}

	
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	
	public String getUpdatedAt() {
		return updatedAt;
	}

	
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	
	public String getPushedAt() {
		return pushedAt;
	}

	
	public void setPushedAt(String pushedAt) {
		this.pushedAt = pushedAt;
	}

	
	public String getGitUrl() {
		return gitUrl;
	}

	
	public void setGitUrl(String gitUrl) {
		this.gitUrl = gitUrl;
	}

	
	public String getSshUrl() {
		return sshUrl;
	}

	
	public void setSshUrl(String sshUrl) {
		this.sshUrl = sshUrl;
	}

	
	public String getCloneUrl() {
		return cloneUrl;
	}

	
	public void setCloneUrl(String cloneUrl) {
		this.cloneUrl = cloneUrl;
	}

	
	public String getSvnUrl() {
		return svnUrl;
	}

	
	public void setSvnUrl(String svnUrl) {
		this.svnUrl = svnUrl;
	}

	
	public String getHomepage() {
		return homepage;
	}

	
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	
	public Integer getSize() {
		return size;
	}

	
	public void setSize(Integer size) {
		this.size = size;
	}

	
	public Integer getStargazersCount() {
		return stargazersCount;
	}

	
	public void setStargazersCount(Integer stargazersCount) {
		this.stargazersCount = stargazersCount;
	}

	
	public Integer getWatchersCount() {
		return watchersCount;
	}

	
	public void setWatchersCount(Integer watchersCount) {
		this.watchersCount = watchersCount;
	}

	
	public String getLanguage() {
		return language;
	}

	
	public void setLanguage(String language) {
		this.language = language;
	}

	
	public Boolean getHasIssues() {
		return hasIssues;
	}

	
	public void setHasIssues(Boolean hasIssues) {
		this.hasIssues = hasIssues;
	}

	
	public Boolean getHasProjects() {
		return hasProjects;
	}

	
	public void setHasProjects(Boolean hasProjects) {
		this.hasProjects = hasProjects;
	}

	
	public Boolean getHasDownloads() {
		return hasDownloads;
	}

	
	public void setHasDownloads(Boolean hasDownloads) {
		this.hasDownloads = hasDownloads;
	}

	
	public Boolean getHasWiki() {
		return hasWiki;
	}

	
	public void setHasWiki(Boolean hasWiki) {
		this.hasWiki = hasWiki;
	}

	
	public Boolean getHasPages() {
		return hasPages;
	}

	
	public void setHasPages(Boolean hasPages) {
		this.hasPages = hasPages;
	}

	
	public Integer getForksCount() {
		return forksCount;
	}

	
	public void setForksCount(Integer forksCount) {
		this.forksCount = forksCount;
	}

	
	public String getMirrorUrl() {
		return mirrorUrl;
	}

	
	public void setMirrorUrl(String mirrorUrl) {
		this.mirrorUrl = mirrorUrl;
	}

	
	public Boolean getArchived() {
		return archived;
	}

	
	public void setArchived(Boolean archived) {
		this.archived = archived;
	}

	
	public Boolean getDisabled() {
		return disabled;
	}

	
	public void setDisabled(Boolean disabled) {
		this.disabled = disabled;
	}

	
	public Integer getOpenIssuesCount() {
		return openIssuesCount;
	}

	
	public void setOpenIssuesCount(Integer openIssuesCount) {
		this.openIssuesCount = openIssuesCount;
	}

	
	public LicenseEntity getLicense() {
		return license;
	}

	
	public void setLicense(LicenseEntity license) {
		this.license = license;
	}

	
	public Collection<String> getTopics() {
		return topics;
	}

	
	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	
	public Integer getForks() {
		return forks;
	}

	
	public void setForks(Integer forks) {
		this.forks = forks;
	}

	
	public Integer getOpenIssues() {
		return openIssues;
	}

	
	public void setOpenIssues(Integer openIssues) {
		this.openIssues = openIssues;
	}

	
	public Integer getWatchers() {
		return watchers;
	}

	
	public void setWatchers(Integer watchers) {
		this.watchers = watchers;
	}

	
	public String getDefaultBranch() {
		return defaultBranch;
	}

	
	public void setDefaultBranch(String defaultBranch) {
		this.defaultBranch = defaultBranch;
	}

	
	public Double getScore() {
		return score;
	}

	
	public void setScore(Double score) {
		this.score = score;
	}

	

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("id", id).append("nodeId", nodeId).append("name", name)
				.append("fullName", fullName).append("_private", _private).append("owner", owner)
				.append("htmlUrl", htmlUrl).append("description", description).append("fork", fork).append("url", url)
				.append("forksUrl", forksUrl).append("keysUrl", keysUrl).append("collaboratorsUrl", collaboratorsUrl)
				.append("teamsUrl", teamsUrl).append("hooksUrl", hooksUrl).append("issueEventsUrl", issueEventsUrl)
				.append("eventsUrl", eventsUrl).append("assigneesUrl", assigneesUrl).append("branchesUrl", branchesUrl)
				.append("tagsUrl", tagsUrl).append("blobsUrl", blobsUrl).append("gitTagsUrl", gitTagsUrl)
				.append("gitRefsUrl", gitRefsUrl).append("treesUrl", treesUrl).append("statusesUrl", statusesUrl)
				.append("languagesUrl", languagesUrl).append("stargazersUrl", stargazersUrl)
				.append("contributorsUrl", contributorsUrl).append("subscribersUrl", subscribersUrl)
				.append("subscriptionUrl", subscriptionUrl).append("commitsUrl", commitsUrl)
				.append("gitCommitsUrl", gitCommitsUrl).append("commentsUrl", commentsUrl)
				.append("issueCommentUrl", issueCommentUrl).append("contentsUrl", contentsUrl)
				.append("compareUrl", compareUrl).append("mergesUrl", mergesUrl).append("archiveUrl", archiveUrl)
				.append("downloadsUrl", downloadsUrl).append("issuesUrl", issuesUrl).append("pullsUrl", pullsUrl)
				.append("milestonesUrl", milestonesUrl).append("notificationsUrl", notificationsUrl)
				.append("labelsUrl", labelsUrl).append("releasesUrl", releasesUrl)
				.append("deploymentsUrl", deploymentsUrl).append("createdAt", createdAt).append("updatedAt", updatedAt)
				.append("pushedAt", pushedAt).append("gitUrl", gitUrl).append("sshUrl", sshUrl)
				.append("cloneUrl", cloneUrl).append("svnUrl", svnUrl).append("homepage", homepage).append("size", size)
				.append("stargazersCount", stargazersCount).append("watchersCount", watchersCount)
				.append("language", language).append("hasIssues", hasIssues).append("hasProjects", hasProjects)
				.append("hasDownloads", hasDownloads).append("hasWiki", hasWiki).append("hasPages", hasPages)
				.append("forksCount", forksCount).append("mirrorUrl", mirrorUrl).append("archived", archived)
				.append("disabled", disabled).append("openIssuesCount", openIssuesCount).append("license", license)
				.append("topics", topics).append("forks", forks).append("openIssues", openIssues)
				.append("watchers", watchers).append("defaultBranch", defaultBranch).append("score", score)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(sshUrl).append(archiveUrl).append(languagesUrl).append(language)
				.append(assigneesUrl).append(commitsUrl).append(openIssues).append(cloneUrl).append(forksCount)
				.append(subscribersUrl).append(createdAt).append(score).append(forksUrl).append(watchersCount)
				.append(_private).append(issueCommentUrl).append(statusesUrl).append(id).append(collaboratorsUrl)
				.append(updatedAt).append(forks).append(labelsUrl).append(defaultBranch).append(keysUrl)
				.append(downloadsUrl).append(contentsUrl).append(pushedAt).append(tagsUrl).append(license)
				.append(commentsUrl).append(size).append(treesUrl).append(name)
				.append(mergesUrl).append(nodeId).append(teamsUrl).append(blobsUrl).append(issueEventsUrl)
				.append(hasPages).append(milestonesUrl).append(issuesUrl).append(releasesUrl).append(description)
				.append(watchers).append(branchesUrl).append(contributorsUrl).append(gitRefsUrl).append(hooksUrl)
				.append(openIssuesCount).append(archived).append(stargazersCount).append(disabled).append(hasIssues)
				.append(owner).append(hasWiki).append(compareUrl).append(gitCommitsUrl).append(topics).append(htmlUrl)
				.append(stargazersUrl).append(fullName).append(svnUrl).append(url).append(pullsUrl).append(mirrorUrl)
				.append(hasDownloads).append(fork).append(hasProjects).append(deploymentsUrl).append(eventsUrl)
				.append(gitTagsUrl).append(notificationsUrl).append(gitUrl).append(subscriptionUrl).append(homepage)
				.toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GitHubRepoEntity) == false) {
			return false;
		}
		GitHubRepoEntity rhs = ((GitHubRepoEntity) other);
		return new EqualsBuilder().append(sshUrl, rhs.sshUrl).append(archiveUrl, rhs.archiveUrl)
				.append(languagesUrl, rhs.languagesUrl).append(language, rhs.language)
				.append(assigneesUrl, rhs.assigneesUrl).append(commitsUrl, rhs.commitsUrl)
				.append(openIssues, rhs.openIssues).append(cloneUrl, rhs.cloneUrl).append(forksCount, rhs.forksCount)
				.append(subscribersUrl, rhs.subscribersUrl).append(createdAt, rhs.createdAt).append(score, rhs.score)
				.append(forksUrl, rhs.forksUrl).append(watchersCount, rhs.watchersCount).append(_private, rhs._private)
				.append(issueCommentUrl, rhs.issueCommentUrl).append(statusesUrl, rhs.statusesUrl).append(id, rhs.id)
				.append(collaboratorsUrl, rhs.collaboratorsUrl).append(updatedAt, rhs.updatedAt)
				.append(forks, rhs.forks).append(labelsUrl, rhs.labelsUrl).append(defaultBranch, rhs.defaultBranch)
				.append(keysUrl, rhs.keysUrl).append(downloadsUrl, rhs.downloadsUrl)
				.append(contentsUrl, rhs.contentsUrl).append(pushedAt, rhs.pushedAt).append(tagsUrl, rhs.tagsUrl)
				.append(license, rhs.license).append(commentsUrl, rhs.commentsUrl).append(size, rhs.size)
				.append(treesUrl, rhs.treesUrl).append(name, rhs.name)
				.append(mergesUrl, rhs.mergesUrl)
				.append(nodeId, rhs.nodeId).append(teamsUrl, rhs.teamsUrl).append(blobsUrl, rhs.blobsUrl)
				.append(issueEventsUrl, rhs.issueEventsUrl).append(hasPages, rhs.hasPages)
				.append(milestonesUrl, rhs.milestonesUrl).append(issuesUrl, rhs.issuesUrl)
				.append(releasesUrl, rhs.releasesUrl).append(description, rhs.description)
				.append(watchers, rhs.watchers).append(branchesUrl, rhs.branchesUrl)
				.append(contributorsUrl, rhs.contributorsUrl).append(gitRefsUrl, rhs.gitRefsUrl)
				.append(hooksUrl, rhs.hooksUrl).append(openIssuesCount, rhs.openIssuesCount)
				.append(archived, rhs.archived).append(stargazersCount, rhs.stargazersCount)
				.append(disabled, rhs.disabled).append(hasIssues, rhs.hasIssues).append(owner, rhs.owner)
				.append(hasWiki, rhs.hasWiki).append(compareUrl, rhs.compareUrl)
				.append(gitCommitsUrl, rhs.gitCommitsUrl).append(topics, rhs.topics).append(htmlUrl, rhs.htmlUrl)
				.append(stargazersUrl, rhs.stargazersUrl).append(fullName, rhs.fullName).append(svnUrl, rhs.svnUrl)
				.append(url, rhs.url).append(pullsUrl, rhs.pullsUrl).append(mirrorUrl, rhs.mirrorUrl)
				.append(hasDownloads, rhs.hasDownloads).append(fork, rhs.fork).append(hasProjects, rhs.hasProjects)
				.append(deploymentsUrl, rhs.deploymentsUrl).append(eventsUrl, rhs.eventsUrl)
				.append(gitTagsUrl, rhs.gitTagsUrl).append(notificationsUrl, rhs.notificationsUrl)
				.append(gitUrl, rhs.gitUrl).append(subscriptionUrl, rhs.subscriptionUrl).append(homepage, rhs.homepage)
				.isEquals();
	}

}
