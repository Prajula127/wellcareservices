package com.wellcareservices.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wellcareservices.dao.MemberDAO;
import com.wellcareservices.modal.Member;

@Service
	public class MemberServices {

		@Autowired
		MemberDAO memdao;
		
		@Transactional
		public Member getMember(int id) {
			return memdao.getMember(id);
		}
		@Transactional
		public List<Member> getAllMembers(){
			return memdao.getAllMembers();
		}
		@Transactional
		public void addMember(Member mem) {
			memdao.addMember(mem);
		}
		@Transactional
		public void updateMember(Member mem) {
			memdao.updateMember(mem);
		}
		@Transactional
		public void deleteMember(int id) {
			memdao.deleteMember(id);
		}
}
