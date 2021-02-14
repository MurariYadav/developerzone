/**
 * 
 */
package com.app.mk.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Murari
 *
 */
@Getter
@Setter
@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="ACCOUNT_TYPE",discriminatorType = DiscriminatorType.INTEGER)
public abstract class UserAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer accountId;
	
	private String accountName;
}
