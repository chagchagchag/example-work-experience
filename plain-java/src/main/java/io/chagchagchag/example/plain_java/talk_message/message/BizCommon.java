package io.chagchagchag.example.plain_java.talk_message.message;

import io.chagchagchag.example.plain_java.talk_message.entity.Deposit;
import io.chagchagchag.example.plain_java.talk_message.entity.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BizCommon {
  private Member member;
  private Deposit deposit;
}
