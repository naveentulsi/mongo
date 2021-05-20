package com.one.proj.demo.repository;

import com.one.proj.demo.entity.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntryRepository extends MongoRepository<Entry, String> {

}


