package com.aze.easyrule.demo;

import com.aze.easyrule.demo.config.rules.FiveAndSevenRule;
import com.aze.easyrule.demo.config.rules.FiveRule;
import com.aze.easyrule.demo.config.rules.NotFindRule;
import com.aze.easyrule.demo.config.rules.SevenRule;
import javax.annotation.PostConstruct;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EasyRuleApplication {

  private final FiveRule fiveRule;
  private final FiveAndSevenRule fiveAndSevenRule;
  private final SevenRule sevenRule;
  private final NotFindRule notFindRule;

  public EasyRuleApplication(FiveRule fiveRule,
      FiveAndSevenRule fiveAndSevenRule, SevenRule sevenRule, NotFindRule notFindRule) {
    this.fiveRule = fiveRule;
    this.fiveAndSevenRule = fiveAndSevenRule;
    this.sevenRule = sevenRule;
    this.notFindRule = notFindRule;
  }

  public static void main(String[] args) {
    SpringApplication.run(EasyRuleApplication.class, args);
  }

  @PostConstruct
  public void init() {
    // 注册所有的rules
    DefaultRulesEngine engine = new DefaultRulesEngine();
    Rules rules = new Rules();
    rules.register(fiveRule);
    rules.register(fiveAndSevenRule);
    rules.register(sevenRule);
    rules.register(notFindRule);
    // fire rules
    Facts facts = new Facts();
    for (int i = 1; i <= 100; i++) {
      facts.put("number", i);
      engine.fire(rules, facts);
    }
  }
}
