package com.demo.arnaldi.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@Entity
@Table(name="GITHUB_REPOSITORY_RESPONSE")
public class GitHubRepoResponseEntity implements Serializable {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private Integer totalCount;
	
	private Boolean incompleteResults;
	
	@ManyToMany(cascade=CascadeType.PERSIST)
	@JoinTable(
			name="GITHUB_REPOSITORY_RESPONSE_ITEM"			
			)
	private Set<GitHubRepoEntity> items = new HashSet<>();
	
	private final static long serialVersionUID = 8492569238233507272L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GitHubRepoResponseEntity() {
	}

	/**
	 *
	 * @param incompleteResults
	 * @param totalCount
	 * @param items
	 */
	public GitHubRepoResponseEntity(Integer totalCount, Boolean incompleteResults, Set<GitHubRepoEntity> items) {
		super();
		this.totalCount = totalCount;
		this.incompleteResults = incompleteResults;
		this.items = items;
	}

	
	public Integer getTotalCount() {
		return totalCount;
	}

	
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	
	public Boolean getIncompleteResults() {
		return incompleteResults;
	}

	
	public void setIncompleteResults(Boolean incompleteResults) {
		this.incompleteResults = incompleteResults;
	}

	
	public Set<GitHubRepoEntity> getItems() {
		return items;
	}

	
	public void setItems(Set<GitHubRepoEntity> items) {
		this.items = items;
	}

	

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("totalCount", totalCount).append("incompleteResults", incompleteResults)
				.append("items", items).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(incompleteResults).append(totalCount)
				.append(items).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GitHubRepoResponseEntity) == false) {
			return false;
		}
		GitHubRepoResponseEntity rhs = ((GitHubRepoResponseEntity) other);
		return new EqualsBuilder().append(incompleteResults, rhs.incompleteResults)
				.append(totalCount, rhs.totalCount)
				.append(items, rhs.items).isEquals();
	}

}
