package com.oocl;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {
    @Test
    public void should_return_number_when_raw_number_is_normal() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(1);
        //then
        assertThat(result, is("1"));
    }

    @Test
    public void should_return_Fizz_when_raw_number_is_divisible_by_3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(3);
        //then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_raw_number_is_divisible_by_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(5);
        //then
        assertThat(result, is("Buzz"));
    }

    @Test
    public void should_return_Buzz_when_raw_number_is_divisible_by_both_3_and_5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        //when
        String result = fizzBuzz.say(15);
        //then
        assertThat(result, is("FizzBuzz"));
    }

    @Test
    public void should_play_the_game_correctly_from_firstPlayerNum_to_lastPlayerNum() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();
        int firstPlayerNum = 1;
        int lastPlayerNum = 20;
        String result = "";
        //when
        for(int playerNum = firstPlayerNum; playerNum <= lastPlayerNum; playerNum++)
            result += fizzBuzz.say(playerNum) + "\n";
        //then
        assertThat(result,
                is(
                "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n"
                )
        );
    }
}
