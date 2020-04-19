package lms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(value = "com.eomcs.lms")
public class AppConfig {

  static Logger logger = LogManager.getLogger(AppConfig.class);

  public AppConfig() {
    logger.debug("AppConfig 객체 생성!");
  }

  // Spring IoC 컨테이너에 수동으로 객체를 등록하고 싶다면,
  // 그 객체를 만들어 주는 팩토리 메서드를 정의해야 한다.
  // => 단 메서드 선언부에 @Bean 애노테이션을 붙여야 한다.
  // => 그래야만 Spring IoC 컨테이너는
  // 이 메서드를 호출하고 그 리턴 값을 보관한다.
}