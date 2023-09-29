package com.enigma.controller;

import java.nio.file.AccessDeniedException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.enigma.entity.AssetDefinition;
import com.enigma.services.IAssetDefService;

@CrossOrigin
@RestController //@Controller+@Configuration
@RequestMapping("/api")
public class AssetDefController {
	@Autowired
	private IAssetDefService assetService;
	
	
	    //list
		@GetMapping("/asset_definition")
		public List<AssetDefinition> getEmployee(@RequestHeader(value="authorization",defaultValue="")String auth) throws AccessDeniedException{
			return assetService.getAssetDefinition();

}
}
