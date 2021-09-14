package it.softwareinside.airInside.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="captain")
public class Captain {
	
	
    public Captain(String name,int experience) {
    	Random rand = new Random();
		char[] chars= {'A','B','C','D','E','F','G','1','2','3','4'};
		for (int i = 0; i < 16; i++) {
			this.cf += chars[rand.nextInt(11)];
		}
		this.name = name;
		this.experience = experience;
	}

	@Size(min = 16, max = 16, message = "CF must be 16 chars")
	@NotNull(message = "cf cannot be null")
	@Id
	@Column(name="cf",length=16)
	private String cf;
	
    @NotNull(message = "name cannot be null")
    @Size(min=2, max=15, message="name cannot be too longer")
	@Column(name="name")
	private String name;
	
    
    @Min(value=2)
	@Column(name="experience")
	private int experience;

}
