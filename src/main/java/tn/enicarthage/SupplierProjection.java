package tn.enicarthage;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullSupplier",types=Supplier.class)

public interface SupplierProjection {

	public Long getId();
	public Long getCodeTva();
	public String getName();
	public String getAdresse();
	public String getResponsable();
}

