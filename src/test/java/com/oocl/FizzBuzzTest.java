package com.oocl;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_raw_number_is_normal() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);
        //then
        assertThat(result, is(1));
    }
}
