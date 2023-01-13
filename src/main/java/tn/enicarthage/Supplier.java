package tn.enicarthage;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Supplier {

	@Id
	private Long id;
	private Long codeTva;
	private String name;
	private String adresse;
	private String responsable;
	
}
