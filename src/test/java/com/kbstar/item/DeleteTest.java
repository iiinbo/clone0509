package com.kbstar.item;

import com.kbstar.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DeleteTest {
    @Autowired
    ItemService service;
    @Test
    void contextLoads(){

        try {
            service.remove(104);
            log.info("------- item 상품 삭제 완료 -------");
        } catch (Exception e) {
            log.info("에러...");
            e.printStackTrace();
        }
    }
}
