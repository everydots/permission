package com.everydots.premium.permission.filter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.modules.junit4.PowerMockRunner;

import javax.servlet.FilterChain;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;


@RunWith(PowerMockRunner.class)
public class CrosFilterTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private FilterChain filterChain;

    @Test
    public void testDoFilterInternal() throws Exception {
        //given
        CrosFilter crosFilter = Mockito.mock(CrosFilter.class);

        //when
        crosFilter.doFilterInternal(request, response, filterChain);

        //then
        verify(crosFilter, times(1)).doFilterInternal(request, response, filterChain);
    }
}