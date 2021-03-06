package com.demo.arnaldi.model;

import java.io.Serializable;
import java.util.HashMap;
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
@JsonPropertyOrder({ "key", "name", "spdx_id", "url", "node_id" })
public class License implements Serializable {

	@JsonProperty("key")
	private String key;
	@JsonProperty("name")
	private String name;
	@JsonProperty("spdx_id")
	private String spdxId;
	@JsonProperty("url")
	private String url;
	@JsonProperty("node_id")
	private String nodeId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -2718162754398272817L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public License() {
	}

	/**
	 *
	 * @param name
	 * @param spdxId
	 * @param nodeId
	 * @param key
	 * @param url
	 */
	public License(String key, String name, String spdxId, String url, String nodeId) {
		super();
		this.key = key;
		this.name = name;
		this.spdxId = spdxId;
		this.url = url;
		this.nodeId = nodeId;
	}

	@JsonProperty("key")
	public String getKey() {
		return key;
	}

	@JsonProperty("key")
	public void setKey(String key) {
		this.key = key;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("spdx_id")
	public String getSpdxId() {
		return spdxId;
	}

	@JsonProperty("spdx_id")
	public void setSpdxId(String spdxId) {
		this.spdxId = spdxId;
	}

	@JsonProperty("url")
	public String getUrl() {
		return url;
	}

	@JsonProperty("url")
	public void setUrl(String url) {
		this.url = url;
	}

	@JsonProperty("node_id")
	public String getNodeId() {
		return nodeId;
	}

	@JsonProperty("node_id")
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
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
		return new ToStringBuilder(this).append("key", key).append("name", name).append("spdxId", spdxId)
				.append("url", url).append("nodeId", nodeId).append("additionalProperties", additionalProperties)
				.toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(name).append(spdxId).append(additionalProperties).append(nodeId).append(key)
				.append(url).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof License) == false) {
			return false;
		}
		License rhs = ((License) other);
		return new EqualsBuilder().append(name, rhs.name).append(spdxId, rhs.spdxId)
				.append(additionalProperties, rhs.additionalProperties).append(nodeId, rhs.nodeId).append(key, rhs.key)
				.append(url, rhs.url).isEquals();
	}

}
