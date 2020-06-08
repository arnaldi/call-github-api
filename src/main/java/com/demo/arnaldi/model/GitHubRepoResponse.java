package com.demo.arnaldi.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "total_count", "incomplete_results", "items" })
public class GitHubRepoResponse implements Serializable {

	@JsonProperty("total_count")
	private Integer totalCount;
	@JsonProperty("incomplete_results")
	private Boolean incompleteResults;
	@JsonProperty("items")
	private List<GitHubRepo> items = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 8492569238233507272L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public GitHubRepoResponse() {
	}

	/**
	 *
	 * @param incompleteResults
	 * @param totalCount
	 * @param items
	 */
	public GitHubRepoResponse(Integer totalCount, Boolean incompleteResults, List<GitHubRepo> items) {
		super();
		this.totalCount = totalCount;
		this.incompleteResults = incompleteResults;
		this.items = items;
	}

	@JsonProperty("total_count")
	public Integer getTotalCount() {
		return totalCount;
	}

	@JsonProperty("total_count")
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	@JsonProperty("incomplete_results")
	public Boolean getIncompleteResults() {
		return incompleteResults;
	}

	@JsonProperty("incomplete_results")
	public void setIncompleteResults(Boolean incompleteResults) {
		this.incompleteResults = incompleteResults;
	}

	@JsonProperty("items")
	public List<GitHubRepo> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<GitHubRepo> items) {
		this.items = items;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("totalCount", totalCount).append("incompleteResults", incompleteResults)
				.append("items", items).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(incompleteResults).append(additionalProperties).append(totalCount)
				.append(items).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof GitHubRepoResponse) == false) {
			return false;
		}
		GitHubRepoResponse rhs = ((GitHubRepoResponse) other);
		return new EqualsBuilder().append(incompleteResults, rhs.incompleteResults)
				.append(additionalProperties, rhs.additionalProperties).append(totalCount, rhs.totalCount)
				.append(items, rhs.items).isEquals();
	}

}
