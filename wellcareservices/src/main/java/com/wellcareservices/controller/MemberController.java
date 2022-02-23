package com.wellcareservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wellcareservices.modal.Member;
import com.wellcareservices.services.MemberServices;

@RestController
	public class MemberController {
	
	@Autowired
  MemberServices memservice;
	
	@RequestMapping(value = "/getMember/{id}" , method = RequestMethod.GET)
	public Member getMemberById(@PathVariable int id) {
		return memservice.getMember(id);
		
	}
	@RequestMapping(value = "/getAllMember" , method = RequestMethod.GET)
	public List<Member> getMembers(){
		List<Member> listOfMem = memservice.getAllMembers();
		return listOfMem;
	}
	@RequestMapping(value = "/addMember", method = RequestMethod.POST )
	public void addMember(@RequestBody Member mem) {
		memservice.addMember(mem);
	}
	@RequestMapping(value = "/updateMember", method = RequestMethod.PUT)
	public void updateMember(@RequestBody Member mem) {
		memservice.updateMember(mem);
	}
	@RequestMapping(value = "/deleteMember/{id}", method = RequestMethod.DELETE)
	public void deleteMember(@PathVariable("id") int id) {
		memservice.deleteMember(id);
	}
}