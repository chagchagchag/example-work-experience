package io.chagchagchag.example.plain_java.talk_message.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Deposit {
  private final BigDecimal totalAmount;
}
