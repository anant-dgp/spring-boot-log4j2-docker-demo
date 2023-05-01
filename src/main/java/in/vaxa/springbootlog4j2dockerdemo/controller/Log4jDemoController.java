package in.vaxa.springbootlog4j2dockerdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Log4jDemoController {

  private static final Logger logger = LoggerFactory.getLogger(Log4jDemoController.class);

  @GetMapping(value = "/log-info")
  public String logInfo(){
    logger.info("Logging at level info");
    return "Logged successfully : INFO";
  }

  @GetMapping(value = "/log-debug")
  public String logDebug(){
    logger.debug("Logging at level debug");
    return "Logged successfully : DEBUG";
  }

  @GetMapping(value = "/log-error")
  public String logError(){
    logger.error("Logging at level error");
    return "Logged successfully : ERROR";
  }
}
