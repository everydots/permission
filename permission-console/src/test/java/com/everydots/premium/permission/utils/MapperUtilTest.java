package com.everydots.premium.permission.utils;

import com.everydots.premium.permission.beans.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@PrepareForTest(MapperUtil.class)
@RunWith(PowerMockRunner.class)
public class MapperUtilTest {

    @Test
    public void testMapAsUser() throws Exception {
        //given
        String content = "{\"username\":\"aa\",\"password\":\"aa\"}";
        //when
        User map = MapperUtil.mapAsUser(content);
        //then
        assertThat(map.getUsername(), is("aa"));
    }
}