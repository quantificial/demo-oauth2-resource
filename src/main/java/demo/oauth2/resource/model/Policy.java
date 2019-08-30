package demo.oauth2.resource.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Policy {
	
	private String policyNumber;
	private String applicationNumber;
	private String clientNumber;
			
	
}
