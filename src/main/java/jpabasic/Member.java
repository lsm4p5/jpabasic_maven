package jpabasic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;

@Entity
@Getter @Setter
@Slf4j
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long id;
    private String name;


    public Member(String name) {
        this.name = name;
        log.info("Member{}", getName());
    }


}
