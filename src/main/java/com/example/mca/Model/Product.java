package com.example.mca.Model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "name",
            "domestic",
            "price",
            "weight",
            "description"
    })
    @Generated("jsonschema2pojo")
    public class Product {

        @JsonProperty("name")
        private String name;
        @JsonProperty("domestic")
        private Boolean domestic;
        @JsonProperty("price")
        private Double price;
        @JsonProperty("weight")
        private Integer weight;
        @JsonProperty("description")
        private String description;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String name) {
            this.name = name;
        }

        @JsonProperty("domestic")
        public Boolean getDomestic() {
            return domestic;
        }

        @JsonProperty("domestic")
        public void setDomestic(Boolean domestic) {
            this.domestic = domestic;
        }

        @JsonProperty("price")
        public Double getPrice() {
            return price;
        }

        @JsonProperty("price")
        public void setPrice(Double price) {
            this.price = price;
        }

        @JsonProperty("weight")
        public Integer getWeight() {
            return weight;
        }

        @JsonProperty("weight")
        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        @JsonProperty("description")
        public String getDescription() {
            return description;
        }

        @JsonProperty("description")
        public void setDescription(String description) {
            this.description = description;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

        public Product() {
        }

        public Product(String name, Boolean domestic, Double price, Integer weight, String description, Map<String, Object> additionalProperties) {
            this.name = name;
            this.domestic = domestic;
            this.price = price;
            this.weight = weight;
            this.description = description;
            this.additionalProperties = additionalProperties;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", domestic=" + domestic +
                    ", price=" + price +
                    ", weight=" + weight +
                    ", description='" + description + '\'' +
                    ", additionalProperties=" + additionalProperties +
                    '}';
        }
    }

