package com.example.springsample;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloControllerTest {

  private MockMvc mockMvc;

  @Autowired
  HelloController target;

  @Before
  public void setup() {
    mockMvc = MockMvcBuilders.standaloneSetup(target).build();
  }

  @Test
  public void ステータスコード200であること() throws Exception {
    mockMvc.perform(get("/hello")).andExpect(status().isOk());
  }

}
