package io.chagchagchag.example.plain_java.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// jpa 라이브러리는 현재 프로젝트에서는 사용하지 않고 순수 java 라이브러리만 보관할 것이기에
// @Entity 객체라고만 가정
@AllArgsConstructor
@Getter
@Setter
public class Member {
  private Long id;
  private String name;
  private String email;
}
