package com.yousuf.shorty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousuf.shorty.model.LinkVisit;
import com.yousuf.shorty.repo.LinkVisitRepo;

@Service
public class LinkVisitSvc {

		@Autowired
		private LinkVisitRepo lvrep;
		
		
		public String add(LinkVisit lv) {
			lvrep.save(lv);
			return "Registered Successfully";
		}
		
}
