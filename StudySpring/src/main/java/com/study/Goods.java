package com.study;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Goods {
	@Id
	private String id;
	private String name;
	private Integer price;
}

