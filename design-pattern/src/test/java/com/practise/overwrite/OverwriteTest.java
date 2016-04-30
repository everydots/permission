package com.practise.overwrite;

import org.junit.Test;


/**
 * Created by mxxiao on 4/22/16.
 */
public class OverwriteTest {


    @Test
    public void shouldOverwriteParentField() throws Exception {
        ChildFieldA childFieldA = new ChildFieldA("childFieldA");
        ChildA childA = new ChildA();
        childA.setField(childFieldA);


        ChildFieldB childFieldB = new ChildFieldB("childFieldB");
        ChildB childB = new ChildB();
        childB.setField(childFieldB);
    }
}