package io.chagchagchag.example.plain_java.formatter.model.action;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CouponExpired {
  private final Long id;

  @Builder(builderClassName = "AllArgs")
  public CouponExpired(Long id){
    this.id = id;
  }
}
