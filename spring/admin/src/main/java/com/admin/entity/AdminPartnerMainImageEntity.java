package com.admin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="partner_main_images")
@NoArgsConstructor
@Data
public class AdminPartnerMainImageEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	 
	@Column(nullable=false)
	private int partnerId;
	
	@Lob
	@Column(nullable=false, length=1000000)
	private String url;
}
