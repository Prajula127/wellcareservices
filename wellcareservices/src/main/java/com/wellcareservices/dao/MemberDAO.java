package com.wellcareservices.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wellcareservices.modal.Member;

@Repository
	public class MemberDAO {

		@Autowired
		private SessionFactory sessionfactory;

		public SessionFactory getSessionfactory() {
			return sessionfactory;
		}
		public void setSessionfactory(SessionFactory sessionfactory) {
			this.sessionfactory = sessionfactory;
		}

		//get member by id from db
		public Member getMember(int id) {
			Session session=this.sessionfactory.getCurrentSession();
			Member mem = (Member) session.get(Member.class, id);
			return  mem;
		}
		//get all members 
		@SuppressWarnings("unchecked")
		public List<Member> getAllMembers(){
			Session session=this.sessionfactory.getCurrentSession();
			List<Member> memberslist = session.createQuery("from Member").list();
			return memberslist;	
		}
		//add member
		public void addMember(Member mem) {
			Session session=this.sessionfactory.getCurrentSession();
	          session.persist(mem);
		}
		//update member
		public void updateMember(Member mem) {
			Session session=this.sessionfactory.getCurrentSession();
	         session.update(mem);
		}
		//delete member by id
		public void deleteMember(int id) {
			Session session=this.sessionfactory.getCurrentSession();
	          Member mem = (Member) session.get(Member.class, id);;
	          session.delete(mem);
		}
	}






