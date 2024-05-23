package io.chagchagchag.example.plain_java.formatter.model;

import static io.chagchagchag.example.plain_java.formatter.type.category.ModelCategory.MEMBER_JOIN;
import static io.chagchagchag.example.plain_java.formatter.type.category.ModelCategory.COUPON_WELCOME;

import io.chagchagchag.example.plain_java.formatter.type.category.ModelCategory;
import java.util.List;

public class CouponPpurio extends AbstractPpurio {
  List<ModelCategory> types = List.of(COUPON_WELCOME, MEMBER_JOIN);

  // 아 몰랑 아침에 고고
}
