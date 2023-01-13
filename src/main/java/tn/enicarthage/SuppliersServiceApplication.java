package tn.enicarthage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SuppliersServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuppliersServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(SupplierRepository supplierRepository) {
	return args->{
		supplierRepository.save(new Supplier(Long.valueOf(11),Long.valueOf(1144),"f1","charguia 2","Mr Foulen1"));
		supplierRepository.save(new Supplier(Long.valueOf(12),Long.valueOf(1875),"f2","charguia 1","Mr Foulen2"));
		supplierRepository.save(new Supplier(Long.valueOf(13),Long.valueOf(9541),"f3","Aouina","Mr Foulen3"));
	};
	}
}
