package com.arturfrimu;

import com.arturfrimu.ws.client.MyFirstClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT)
public class MyFirstClientSpringWsTests {

  @Autowired
  private MyFirstClient myFirstClient;

  @Test
  public void testSayHello() {
    assertThat(myFirstClient.sayHello("John", "Doe")).isEqualTo("Hello John Doe!");
  }
}
