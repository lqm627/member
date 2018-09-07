package com.qm.member.dao;
import com.qm.member.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long>{
    public Member findByPhone(String phone);
}
