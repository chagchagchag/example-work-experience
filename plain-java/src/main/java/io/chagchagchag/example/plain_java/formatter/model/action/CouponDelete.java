package io.chagchagchag.example.plain_java.formatter.model.action;

import lombok.Builder;
import lombok.Getter;

@Getter
public class CouponDelete {
  private final Long id;
  @Builder(builderClassName = "AllArgs")
  public CouponDelete(Long id){
    this.id = id;
  }
}
