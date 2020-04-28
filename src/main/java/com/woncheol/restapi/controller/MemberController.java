package com.woncheol.restapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.woncheol.restapi.model.Member;
import java.util.Date;
import java.util.ArrayList;

@RequestMapping("/member")
@RestController
public class MemberController {
	@GetMapping("test")
	public Member memberTest() {
		
		Member m1 = new Member("fornew21c", "woncheol", 30, "gimpo", new Date());
		
		System.out.println("Member name: " + m1.getName());
		
		return m1;
	}

	 @GetMapping("/test2")
	 public ArrayList<Member> memberTest2()
	 {
		 ArrayList<Member> memberArray = new ArrayList();
		
		 memberArray.add(new Member("kimth1357", "김태훈 ", 38, "서울 창동 ", new Date()));
		 memberArray.add(new Member("yk1004", "최양헌 ", 36, "서울 신길 ", new Date()));
		 memberArray.add(new Member("tarzan111", "배성식 ", 36, "경기 하남 미사 ", new Date()));
		 memberArray.add(new Member("dk1117", "이덕용 ", 36, "경기 수원 호매실 ", new Date()));
		 memberArray.add(new Member("lnk0517", "이남규 ", 35, "서울 서강 ", new Date()));

		 return memberArray;
		 
	 }
}
