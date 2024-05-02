package com.mfsr.clearfriendships.repositories;

import com.mfsr.clearfriendships.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
