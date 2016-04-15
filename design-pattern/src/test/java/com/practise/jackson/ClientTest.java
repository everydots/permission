package com.practise.jackson;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.Test;

public class ClientTest {

    @Test
    public void whenSerializingUsingJacksonReferenceAnnotation_thenCorrect() throws Exception {
        Client client = new Client("firstName", "lastName");

        String result = new ObjectMapper().writeValueAsString(client);

        System.out.printf(result);
    }


    @Test
    public void testUseJsonAnyGetterInMap() throws Exception {
        ExtensibleBean extensibleBean = new ExtensibleBean("my Bean");
        extensibleBean.add("attr1", "val1");
        extensibleBean.add("attr2", "val2");

        String result = new ObjectMapper().writeValueAsString(extensibleBean);
        System.out.println(result);
    }

    @Test
    public void testUseJsonAnySetterInMap() throws Exception {

        String json = "{\"name\":\"My bean\",\"attr2\":\"val2\",\"attr1\":\"val1\"," +
                "\"user\":\"{\"userName\":\"aa\",\"userPass\":\"bb\"}\"}";
        ExtensibleBean bean = new ObjectMapper().reader(ExtensibleBean.class).readValue(json);

        System.out.println(new ObjectMapper().writeValueAsString(bean));

    }
}