package demo.oauth2.resource.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

/**
 * this is the sample api policy controller used to illustrate how to return the policy information
 * 
 * the api/codeTables is un-protected 
 *
 */
@RestController
@RequestMapping("/api")
public class PolicyController {
	
    @GetMapping("/policies")
    @PreAuthorize("#oauth2.hasScope("+"'read'"+")")
    @ApiImplicitParams(
    		@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer <access_token>")    		  
    		)
    public ResponseEntity<List<String>> getPolicyList () {
    	
    	ArrayList<String> arr = new ArrayList<String>();
    	
    	arr.add("00100010");
    	arr.add("00100012");
    	arr.add("00100015");
    	arr.add("00200015");
    	
    	return ResponseEntity.ok(arr);
    	
    }
    
//    @ApiImplicitParams(
//    		@ApiImplicitParam(name = "Authorization", value = "Access Token", required = true, allowEmptyValue = false, paramType = "header", dataTypeClass = String.class, example = "Bearer <access_token>")    		  
//    		)    
//    @PreAuthorize("#oauth2.hasScope('special')")
    @GetMapping("/codeTables")
    public ResponseEntity<List<String>> getCodeTable () {
    	
    	ArrayList<String> arr = new ArrayList<String>();
    	arr.add("C1001");
    	arr.add("C1002");
    	arr.add("C1003");
    	arr.add("C1004");
    	arr.add("C1020");
    	
    	return ResponseEntity.ok(arr);
    }
}
