package com.one.proj.demo.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.one.proj.demo.entity.Entry;
import com.one.proj.demo.entity.Feed;
import com.one.proj.demo.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
public class LoadController {

	@Autowired
	private EntryRepository entryRepository;

	@PostMapping()
	public ResponseEntity insert(@RequestParam("file") MultipartFile file) throws IOException {
		System.out.println("Start processing request");
		JacksonXmlModule xmlModule = new JacksonXmlModule();
		xmlModule.setDefaultUseWrapper(false);
		ObjectMapper mapper = new XmlMapper(xmlModule);
		Feed entries = mapper.readValue(file.getInputStream(), Feed.class);
		entryRepository.saveAll(entries.getEntry());
		final long count = entryRepository.count();
		final HashMap<Object, Object> res = new HashMap<>();
		res.put("totalItemsProcessed", count);
		return ResponseEntity.ok(res);
	}

	@GetMapping
	public ResponseEntity getAll() {
		return ResponseEntity.of(Optional.ofNullable(entryRepository.findAll()));
	}

	@PostMapping(value = "/clean")
	public void clean() {
		System.out.println("Start cleaning");
		entryRepository.deleteAll();
	}

}
