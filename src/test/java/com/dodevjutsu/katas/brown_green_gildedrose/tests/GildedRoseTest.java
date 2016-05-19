package com.dodevjutsu.katas.brown_green_gildedrose.tests;

import com.dodevjutsu.katas.brown_green_gildedrose.GildedRose;
import com.dodevjutsu.katas.brown_green_gildedrose.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GildedRoseTest {
    @Test
    public void a_regular_item_quality_decreases_by_one() {
        int initialQuality = 5;
        Item item = new Item("any regular item", 6, initialQuality);
        GildedRose gildedRose = new GildedRose(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality - 1));
    }

    @Test
    public void a_regular_item_days_to_be_sold_decreases_by_one() {
        int initialDaysToBeSold = 10;
        Item item = new Item("a regular item", initialDaysToBeSold, 7);
        GildedRose gildedRose = new GildedRose(item);

        gildedRose.updateInventory();

        assertThat(item.sellIn, is(initialDaysToBeSold - 1));
    }

    @Test
    public void once_the_sell_date_has_passed_the_quality_decreases_by_two() {
        int initialQuality = 6;
        Item item = new Item("a regular item", 0, initialQuality);
        GildedRose gildedRose = new GildedRose(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality - 2));
    }

    @Test
    public void the_quality_of_an_item_is_never_negative() {
        int initialQuality = 0;
        Item item = new Item("a regular item", 1, initialQuality);
        GildedRose gildedRose = new GildedRose(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality));
    }

    @Test
    public void aged_brie_increases_in_quality_the_older_it_gets() {
        int initialQuality = 10;
        Item item = new Item("Aged Brie", 5, initialQuality);
        GildedRose gildedRose = new GildedRose(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality + 1));
    }
}
