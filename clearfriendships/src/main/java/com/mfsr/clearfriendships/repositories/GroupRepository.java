package com.mfsr.clearfriendships.repositories;

import com.mfsr.clearfriendships.models.FriendGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<FriendGroup, Long> {
}
