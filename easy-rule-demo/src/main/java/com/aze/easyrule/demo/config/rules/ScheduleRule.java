package com.aze.easyrule.demo.config.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Priority;
import org.jeasy.rules.annotation.Rule;
import org.springframework.stereotype.Component;

/**
 * @author : guoxinze
 * @classname : ScheduleRule
 * @description :
 * @date : 2020/8/8
 */

@Rule
@Component
public class ScheduleRule {

  @Condition
  public boolean isFizz(@Fact("number") Integer number) {
    return number % 5 == 0;
  }

  @Action
  public void printFizz() {
    System.out.print("fizz");
  }

  @Priority
  public int getPriority() {
    return 1;
  }
}
