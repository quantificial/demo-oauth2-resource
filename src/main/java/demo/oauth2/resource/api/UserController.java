package demo.oauth2.resource.api;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	// curl localhost:9100/api/me -H "Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiYXBpIl0sInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJleHAiOjE1NjY0NzE1MTAsImF1dGhvcml0aWVzIjpbIlJPTEVfQ0xJRU5UIl0sImp0aSI6IjM5NTYxNTI3LTNiMTAtNDY3Ni1hZTFlLTJkMjA0MGI3MmU4ZSIsImNsaWVudF9pZCI6ImFwcGFsb25lIn0.NGahaMblVZaJVm3a_bC-fX15d-w5-O7UwILOYCd385OmYmDLJfsD-yivDdX6IP3QGlqAdNR1iNUmbtVPRdHiMtJETI4_u2U-_Wh1y28qBO8c3Ein0zosTMrL6pNPjV6_RSe_ByQzgC_QnKCm54VuE38l0F3dy7O3Ovpdr8bKe-l5SFQJ0k2Z1NsGwCLxPOVZWMKPX8DSfW23xrtn9hleFe4TkdgzYsiN3Ad0JnTlj6zjh807NQybNWJ9lcmmZBeHmSzOllikVIEcIFMM8zZffYyX_6BkLHR3Pco31ATNbU8psgL4joNyKSGDbPwqYvl9gB-eXzTrspOv6fzzWof8DQ"

    @GetMapping("/me")
    //@PreAuthorize("hasRole('ROLE_USER')")
    @PreAuthorize("#oauth2.hasScope('read')")
    //#oauth2.hasScope('read')
    //@PreAuthorize("hasRole('ROLE_CLIENT')")    
    public ResponseEntity<Principal> me(final Principal principal) {
        return ResponseEntity.ok(principal);
    }
    

    // curl localhost:9100/api/secret -H "Authorization: Bearer eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsiYXBpIl0sInNjb3BlIjpbInJlYWQiLCJ3cml0ZSJdLCJleHAiOjE1NjY0NzE1MTAsImF1dGhvcml0aWVzIjpbIlJPTEVfQ0xJRU5UIl0sImp0aSI6IjM5NTYxNTI3LTNiMTAtNDY3Ni1hZTFlLTJkMjA0MGI3MmU4ZSIsImNsaWVudF9pZCI6ImFwcGFsb25lIn0.NGahaMblVZaJVm3a_bC-fX15d-w5-O7UwILOYCd385OmYmDLJfsD-yivDdX6IP3QGlqAdNR1iNUmbtVPRdHiMtJETI4_u2U-_Wh1y28qBO8c3Ein0zosTMrL6pNPjV6_RSe_ByQzgC_QnKCm54VuE38l0F3dy7O3Ovpdr8bKe-l5SFQJ0k2Z1NsGwCLxPOVZWMKPX8DSfW23xrtn9hleFe4TkdgzYsiN3Ad0JnTlj6zjh807NQybNWJ9lcmmZBeHmSzOllikVIEcIFMM8zZffYyX_6BkLHR3Pco31ATNbU8psgL4joNyKSGDbPwqYvl9gB-eXzTrspOv6fzzxWof8DQ"
    
    @GetMapping("/secret")
    @PreAuthorize("#oauth2.hasScope('read')")
    public ResponseEntity<String> secret () {
    	
    	String secret = "this is secret message";
    	
    	return ResponseEntity.ok(secret);
    	
    }

}
