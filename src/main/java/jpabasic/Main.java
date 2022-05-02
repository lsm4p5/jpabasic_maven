package jpabasic;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


@Slf4j
public class Main {
    public static void main(String[] args) {

        System.out.println("Main.main + 시작");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin(); // [트랜잭션] 시작


        Member member = new Member("memberA");
        em.persist(member);
        Member findMember = em.find(Member.class, member.getId());
        System.out.println("findMember = " + findMember.getName());

        transaction.commit();



        System.out.println("Main.main + 끝.");
        log.info("Main.main + 끝.");

    }
}