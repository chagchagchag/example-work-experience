package io.chagchagchag.example.plain_java.talk_message.enums;

import io.chagchagchag.example.plain_java.talk_message.message.BizCommon;
import java.util.function.Function;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum MessageField {
  USER_NAME(bizCommon -> bizCommon.getMember().getName()),
  TOTAL_AMOUNT(bizCommon -> {
    // 조금 더 복잡한 포매팅이 필요하겠지만, 단순 예제이기에 아래와 같이 toString() 으로 표시
    return bizCommon.getDeposit().getTotalAmount().toString();
  });

  private final Function<BizCommon, String> function;

}
