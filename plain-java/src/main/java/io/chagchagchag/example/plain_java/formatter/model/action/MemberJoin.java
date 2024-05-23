package io.chagchagchag.example.plain_java.formatter.model.action;

import java.util.Objects;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberJoin {
  private final Long id;
  private String name;
  private String email;

  @Builder(builderClassName = "AllArgs")
  public MemberJoin(Long id, String name, String email){
    Objects.requireNonNull(id);
    Objects.requireNonNull(name);

    this.id = id;
    this.name = name;
    this.email = email;
  }
}
