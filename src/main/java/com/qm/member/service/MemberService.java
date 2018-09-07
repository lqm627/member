package com.qm.member.service;

import com.qm.member.dao.MemberRepository;
import com.qm.member.model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    public Member save(Member member) throws Exception {
        Member memberDB=memberRepository.findByPhone(member.getPhone());
        if(memberDB!=null){
            throw new Exception("手机号已被使用！");
        }
        member.setCreateTime(new Date());
        member.setModifyTime(new Date());
        return  memberRepository.save(member);
    }
}
