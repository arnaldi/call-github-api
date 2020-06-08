package com.demo.arnaldi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name="LICENSE")
public class LicenseEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String key;
	
	private String name;
	
	private String spdxId;
	
	private String url;
	
	private String nodeId;
	
	@OneToOne
	private GitHubRepoEntity gitHubRepoEntity;
	
	private final static long serialVersionUID = -2718162754398272817L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public LicenseEntity() {
	}

	/**
	 *
	 * @param name
	 * @param spdxId
	 * @param nodeId
	 * @param key
	 * @param url
	 */
	public LicenseEntity(String key, String name, String spdxId, String url, String nodeId) {
		super();
		this.key = key;
		this.name = name;
		this.spdxId = spdxId;
		this.url = url;
		this.nodeId = nodeId;
	}

	
	public Long getId() {
		return id;
	}

	
	public GitHubRepoEntity getGitHubRepoEntity() {
		return gitHubRepoEntity;
	}

	public void setGitHubRepoEntity(GitHubRepoEntity gitHubRepoEntity) {
		this.gitHubRepoEntity = gitHubRepoEntity;
	}

	public String getKey() {
		return key;
	}

	
	public void setKey(String key) {
		this.key = key;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public String getSpdxId() {
		return spdxId;
	}

	
	public void setSpdxId(String spdxId) {
		this.spdxId = spdxId;
	}

	
	public String getUrl() {
		return url;
	}

	
	public void setUrl(String url) {
		this.url = url;
	}

	
	public String getNodeId() {
		return nodeId;
	}

	
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("key", key).append("name", name).append("spdxId", spdxId)
				.append("url", url).append("nodeId", nodeId)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).append(spdxId).append(nodeId).append(key)
				.append(url).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof LicenseEntity) == false) {
			return false;
		}
		LicenseEntity rhs = ((LicenseEntity) other);
		return new EqualsBuilder().append(name, rhs.name).append(spdxId, rhs.spdxId)
				.append(nodeId, rhs.nodeId).append(key, rhs.key)
				.append(url, rhs.url).isEquals();
	}

}
