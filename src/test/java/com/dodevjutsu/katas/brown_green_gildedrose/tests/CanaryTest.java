package com.dodevjutsu.katas.brown_green_gildedrose.tests;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class CanaryTest {
    @Test
    public void shouldFail() {
        assertThat(false, is(true));
    }
}
