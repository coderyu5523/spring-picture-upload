package shop.mtcoding.fileapp.example;


import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUIDTest {
    @Test
    public void rolling_test(){
        UUID uuid = UUID.randomUUID();
        String value = uuid.toString();
        System.out.println(value);
    }
}
