package com.mfsr.clearfriendships;

import com.mfsr.clearfriendships.models.FriendGroup;
import com.mfsr.clearfriendships.models.Member;
import com.mfsr.clearfriendships.models.Membership;
import com.mfsr.clearfriendships.repositories.GroupRepository;
import com.mfsr.clearfriendships.repositories.MemberRepository;
import com.mfsr.clearfriendships.repositories.MembershipRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClearfriendshipsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClearfriendshipsApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(MemberRepository memberRepository, GroupRepository groupRepository, MembershipRepository membershipRepository){
		return args -> {
			Member member = new Member("Martin", "mfsr@me.com", "password", "12345678901234567890123456789012");

			FriendGroup friendGroup = new FriendGroup("Test FriendGroup", "This is a test friendGroup", 0.0, member);

			Membership membership = new Membership(friendGroup, member);

			member.addGroupMembership(membership);
			/*memberRepository.save(member);*/

			memberRepository.save(member);
			groupRepository.save(friendGroup);
			membershipRepository.save(membership);

			System.out.println(member);
			System.out.println(friendGroup);
			System.out.println(membership);

		};
	}
}
