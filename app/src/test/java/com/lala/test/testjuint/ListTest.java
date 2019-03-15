package com.lala.test.testjuint;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    public void testGet() throws Exception{
        //创建mock对象,mock具体的类或者接口
        List mockedList = Mockito.mock(List.class);

        //设置mock对象的行为，设置桩，这是具体返回的值
        when(mockedList.get(0)).thenReturn("one");
        //when(mockedList)

        //使用mock对象
        String str = (String)mockedList.get(0);

        Assert.assertTrue("one".equals(str));
        Assert.assertTrue(mockedList.size() == 0);

        Mockito.verify(mockedList).get(0);
    }
/**
    @Test
    public void testSpy(){
        List list = new LinkedList();
        List spy = Mockito.spy(list);

        when(spy.get(0)).thenReturn("foo");

        doReturn("foo").when(spy).get(0);
    }
    **/
}
