package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.common.APIResponse;
import com.enigma.entity.AssetDefinition;
import com.enigma.entity.AssetType;
import com.enigma.services.IAssetDefinitionService;
import com.enigma.services.IAssetTypeService;

@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")

public class AssetTypeController {
	
	@Autowired
	private IAssetTypeService assetTypeService;
	
	@Autowired
	private APIResponse apiResponse;
	
	//list
		@GetMapping("/assettypeid")
		public List<AssetType> getAsset(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
			//jwtUtil.verify(auth);
			return assetTypeService.getAsset();
		}

}
