package com.aze.easyrule.demo.config.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.springframework.stereotype.Component;

/**
 * @author : guoxinze
 * @classname : NotFindRule
 * @description :
 * @date : 2020/8/8
 */

@Rule
@Component
public class NotFindRule {

  @Condition
  public boolean check(@Fact("number") Integer number) {
    // can return true, because this is the latest rule to trigger according to assigned priorities
    // and in which case, the number is not fizz nor buzz
    return number % 5 != 0 || number % 7 != 0;
  }

  @Action
  public void print(@Fact("number") Integer number) {
    System.out.println(number);
  }

  @Priority
  public int getPriority() {
    return 3;
  }
}
