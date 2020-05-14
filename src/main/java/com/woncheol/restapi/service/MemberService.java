package com.woncheol.restapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.woncheol.restapi.model.Member;
import com.woncheol.restapi.dao.MemberDao;

@Service
public class MemberService {
	@Autowired
	MemberDao memberDao;
	
    public List<Member> getMemberList() {

        List<Member> memberList = memberDao.getMemberList();


        return memberList;
    }
}
