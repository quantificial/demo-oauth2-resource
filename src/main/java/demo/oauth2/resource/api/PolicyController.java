package demo.oauth2.resource.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.oauth2.resource.model.Policy;
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
    //@PreAuthorize("#oauth2.hasScope('read')")
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
    
    
    @GetMapping("/policyPages")
    public ResponseEntity<List<Policy>> getPolicyPages() {
    	
    	ArrayList<Policy> arr = new ArrayList<Policy>();
    	
    	Policy p;
    	
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("1ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c2cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c31cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("cc4c").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c123cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("cc1c").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c132cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c51cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c5cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c5cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("cg cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c	5cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("cc44tc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("cafqcc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("23cqcc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("4ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("51ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("634ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("53ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("412ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("643ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("431ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("gdsccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("b terccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("cc345c").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("c543cc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("5314ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("gdsccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("irtyccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("accc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("afaccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("tateccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("zfccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("5rccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("hhaccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("23rccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("auaccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("234ccc").build(); arr.add(p);
    	p = Policy.builder().applicationNumber("aaa").clientNumber("bbb").policyNumber("ttccc").build(); arr.add(p);
    	    	
    	
    	
    	return ResponseEntity.ok(arr);    	
    	
    }
}
