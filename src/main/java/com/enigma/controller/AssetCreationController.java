package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.common.APIResponse;
import com.enigma.entity.AssetCreation;
import com.enigma.entity.AssetDefinition;
import com.enigma.services.IAssetCreationService;

@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")
public class AssetCreationController {
	@Autowired
	private IAssetCreationService assetService;
	@Autowired
	private APIResponse apiResponse;

	
	
	    //list
		@GetMapping("/assetcreation")
		public List<AssetCreation> getAssetDefinition(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
			return assetService.getAssetDefinition();
		}
			
		//add
		@PostMapping("/assetcreation")
		public ResponseEntity<APIResponse> addAssetCreation(@RequestBody AssetCreation asset){
			if(assetService.saveAsset(asset)==null) {
				apiResponse.setData(("Name can have only alphabets"));
				apiResponse.setStatus(500);
				apiResponse.setError("Invalid name");
				return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
			}
			apiResponse.setData("Asset added sucessfully");
			apiResponse.setStatus(200);
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
				
		}
		
		
        //disable or delete asset
		@PutMapping("/deleteasset/{id}")
		public String deleteAssetCreation(@PathVariable int id) {
			assetService.deleteAssetCreation(id);
			String confirmationMessage = "Details deleted successfully";
	        return confirmationMessage;

}
		
		//update 
		@PutMapping("/assetcreation")
		public ResponseEntity<APIResponse> updateAsset(@RequestBody AssetCreation asset){
			if(assetService.saveAsset(asset)==null) {
				apiResponse.setData(("Name can have only alphabets"));
				apiResponse.setStatus(500);
				apiResponse.setError("Invalid name");
				return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
			}
			apiResponse.setData("Asset updated sucessfully");
			apiResponse.setStatus(200);
			return ResponseEntity.status(apiResponse.getStatus()).body(apiResponse);
			
		}
		
}

