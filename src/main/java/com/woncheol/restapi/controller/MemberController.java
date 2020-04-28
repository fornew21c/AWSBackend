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
		
		 memberArray.add(new Member("1", "Wickies", 20, "제주", new Date()));
		 memberArray.add(new Member("2", "마동석", 40, "전주", new Date()));
		 memberArray.add(new Member("3", "조승우", 22, "무주", new Date()));
		 memberArray.add(new Member("4", "박보영", 20, "제주", new Date()));
		 memberArray.add(new Member("5", "엄복동", 20, "제주", new Date()));

		 return memberArray;
		 
	 }
}
