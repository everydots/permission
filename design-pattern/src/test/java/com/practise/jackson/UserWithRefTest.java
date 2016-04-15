package com.practise.jackson;

import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertThat;

/**
 * Created by mxxiao on 4/13/16.
 */
public class UserWithRefTest {
    @Test
    public void whenSerializingUsingJacksonReferenceAnnotation_thenCorrect() throws IOException {
        UserWithRef user = new UserWithRef(1, "John");
        ItemWithRef item = new ItemWithRef(2, "book", user);
        user.addItem(item);
        String result = new ObjectMapper().writeValueAsString(item);
        System.out.println(result);
    }
}