package com.yousuf.shorty.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yousuf.shorty.model.LinkVisit;

@Repository
public interface LinkVisitRepo extends JpaRepository<LinkVisit, Integer>  {
	long countByLinkId(String linkId);
	//String add(String linkId);
}
