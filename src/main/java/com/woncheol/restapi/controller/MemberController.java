package com.woncheol.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.woncheol.restapi.model.Member;
import com.woncheol.restapi.service.MemberService;
import java.util.Date;
import java.util.HashMap;
import java.util.ArrayList;

@RequestMapping("/member")
@RestController
public class MemberController {
	@Autowired
	 MemberService memberService;
	   
	@RequestMapping("test")
	public Member memberTest() {
		
		Member m1 = new Member("fornew21c", "woncheol", 30, "gimpo", new Date(), "X");
		
		System.out.println("Member name: " + m1.getName());
		
		return m1;
	}

	@RequestMapping("/test2")
	public ArrayList<Member> memberTest2()
	 {
		 ArrayList<Member> memberArray = new ArrayList();
		
		 memberArray.add(new Member("kimth1357", "김태훈 ", 38, "서울 창동 ", new Date(), "x"));
		 memberArray.add(new Member("yk1004", "최양헌 ", 36, "서울 신길 ", new Date(), "x"));
		 memberArray.add(new Member("tarzan111", "배성식 ", 36, "경기 하남 미사 ", new Date(), "x"));
		 memberArray.add(new Member("dk1117", "이덕용 ", 36, "경기 수원 호매실 ", new Date(), "x"));
		 memberArray.add(new Member("lnk0517", "이남규 ", 35, "서울 서강 ", new Date(), "x"));

		 return memberArray;
	 }
	
//	@RequestMapping("/memberList")
//	public ArrayList<Member> memberList()
//	 {
//		 ArrayList<Member> memberArray = new ArrayList();
//		
//		 memberArray.add(new Member("kimth1357", "김태훈 ", 38, "서울 창동 ", new Date(), "x"));
//		 memberArray.add(new Member("yk1004", "최양헌 ", 36, "서울 신길 ", new Date(), "x"));
//		 memberArray.add(new Member("tarzan111", "배성식 ", 36, "경기 하남 미사 ", new Date(), "x"));
//		 memberArray.add(new Member("dk1117", "이덕용 ", 36, "경기 수원 호매실 ", new Date(), "x"));
//		 memberArray.add(new Member("lnk0517", "이남규 ", 35, "서울 서강 ", new Date(), "x"));
//
//		 return memberArray;
//	 }
	
	   @RequestMapping(value="/memberList", method=RequestMethod.GET)
	    public ResponseEntity<?> getMemberList() {
	        HashMap<String, Object> result = new HashMap<>();

	        result.put("data", memberService.getMemberList());

	        return new ResponseEntity<>(result, HttpStatus.OK);
	    }
}
