package com.example.simpleBoard.repository;

import com.example.simpleBoard.domain.Member;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class MemberRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public Member save(Member member) throws Exception {
        entityManager.persist(member);
        return member;
    }

    public List<Member> findAll() throws Exception {
        return entityManager.createQuery("select m from Member m", Member.class).getResultList();
    }

    public Member findById(Long id) throws Exception {
        return entityManager.find(Member.class, id);
    }

    public Member findByLoginID(String loginId) throws Exception {
        List<Member> result = entityManager.createQuery("select m from Member m where m.loginId = :loginId", Member.class)
                .setParameter("loginId", loginId)
                .getResultList();
        if (result.isEmpty()) return null;
        else return result.get(0);
    }

    public Member findByName(String name) throws Exception {
        List<Member> result = entityManager.createQuery("select m from Member m where m.name = :name", Member.class)
                .setParameter("name", name)
                .getResultList();
        if (result.isEmpty()) return null;
        else return result.get(0);
    }

    @Transactional
    public Member update(Member member) throws Exception {
        Member target = entityManager.find(Member.class, member.getId());
        if (member.getPassword() != null) target.setPassword(member.getPassword());
        if (member.getName() != null) target.setName(member.getName());
        return target;
    }

    @Transactional
    public Member delete(Member member) throws Exception {
        entityManager.remove(member);
        return member;
    }
}
