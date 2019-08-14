package com.hiscox.demo.quotebind.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/*
 * Product
 */

@Entity
public class Product {

	@Id
	@JsonProperty("id")
	private String id = null;

	@JsonProperty("name")
	private String name = null;
	
	@OneToMany(targetEntity=IndustrySector.class,fetch=FetchType.EAGER)
	@JsonProperty("availableIndustries")
	@Valid
	private List<IndustrySector> availableIndustries = null;

	public Product id(String id) {
		this.id = id;
		return this;
	}

	/**
	 * Get id
	 * 
	 * @return id
	 **/
	@ApiModelProperty(example = "SCR", value = "")

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Product name(String name) {
		this.name = name;
		return this;
	}

	/**
	 * Get name
	 * 
	 * @return name
	 **/
	@ApiModelProperty(example = "Spain Cyber", value = "")

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Product availableIndustries(List<IndustrySector> availableIndustries) {
		this.availableIndustries = availableIndustries;
		return this;
	}

	public Product addAvailableIndustriesItem(IndustrySector availableIndustriesItem) {
		if (this.availableIndustries == null) {
			this.availableIndustries = new ArrayList<IndustrySector>();
		}
		this.availableIndustries.add(availableIndustriesItem);
		return this;
	}

	/**
	 * Get availableIndustries
	 * 
	 * @return availableIndustries
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public List<IndustrySector> getAvailableIndustries() {
		return availableIndustries;
	}

	public void setAvailableIndustries(List<IndustrySector> availableIndustries) {
		this.availableIndustries = availableIndustries;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Product product = (Product) o;
		return Objects.equals(this.id, product.id) && Objects.equals(this.name, product.name)
				&& Objects.equals(this.availableIndustries, product.availableIndustries);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, availableIndustries);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Product {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    name: ").append(toIndentedString(name)).append("\n");
		sb.append("    availableIndustries: ").append(toIndentedString(availableIndustries)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
