package com.mfsr.clearfriendships.repositories;

import com.mfsr.clearfriendships.models.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembershipRepository extends JpaRepository<Membership, Long> {
}
