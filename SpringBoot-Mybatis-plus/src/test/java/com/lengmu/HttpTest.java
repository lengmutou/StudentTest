package com.lengmu;

import com.lengmu.controller.ShopController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/*
 * @author  lengmu
 * @version 1.0
 */
@SpringBootTest
@WebMvcTest(ShopController.class)
public class HttpTest {
    @Autowired
    MockMvc mockMvc;
    @Test
    public void HttpTest01() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/test03")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }
}
