package com.slissner.springbootgelf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
class ExampleLogger implements CommandLineRunner {

  private static final Logger LOGGER = LoggerFactory.getLogger(ExampleLogger.class);

  @Override
  public void run(String... args) {
    LOGGER
        .atInfo()
        .setMessage("Hello structured logging!")
        .addKeyValue("userId", "1")
        .addKeyValue("testkey_testmessage", "test")
        .log();
  }
}
