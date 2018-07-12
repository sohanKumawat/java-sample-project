package com.mb.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mb.demo.entity.common.metaData.AssetMedaDataEntity;
import com.mb.demo.service.AssetDataService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/v1/asset/metadata/")
@Api(value = "onlinestore", description = "Operations pertaining to products in Online Store")
public class AssetDataController implements BasePickerController {

	@Autowired
	AssetDataService service;

	@PostMapping("/")
	public ResponseEntity<String> save(@RequestBody AssetMedaDataEntity entity) {
		service.add(entity);
		return new ResponseEntity<>("Added successFulle", HttpStatus.OK);
	}

	@PutMapping("/")
	public ResponseEntity<String> update(@RequestBody AssetMedaDataEntity entity) {
		service.add(entity);
		return new ResponseEntity<>("Added successFulle", HttpStatus.OK);
	}

	@GetMapping("/{Id}")
	public void findById(@PathVariable String id) {
		service.getById(Long.parseLong(id));
	}
}
