package com.dodevjutsu.katas.brown_green_gildedrose.tests;

import com.dodevjutsu.katas.brown_green_gildedrose.GildedRose;
import com.dodevjutsu.katas.brown_green_gildedrose.Item;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ItemsTest {
    @Test
    public void a_regular_item_quality_decreases_by_one() {
        int initialQuality =  5;
        Item item = new Item("any regular item", 6, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality - 1));
    }

    @Test
    public void a_regular_item_days_to_be_sold_decreases_by_one() {
        int initialDaysToBeSold = 10;
        Item item = new Item("a regular item", initialDaysToBeSold, 7);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.sellIn, is(initialDaysToBeSold - 1));
    }

    @Test
    public void once_the_sell_date_has_passed_the_quality_decreases_by_two() {
        int initialQuality = 6;
        Item item = new Item("a regular item", 0, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality - 2));
    }

    @Test
    public void the_quality_of_an_item_is_never_negative() {
        int minimumQuality = 0;
        Item item = new Item("a regular item", 1, minimumQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(minimumQuality));
    }

    @Test
    public void aged_brie_increases_in_quality_the_older_it_gets() {
        int initialQuality = 10;
        Item item = new Item("Aged Brie", 5, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality + 1));
    }

    @Test
    public void the_quality_of_an_item_is_never_more_than_50() {
        int maximumQuality = 50;
        Item item = new Item("Aged Brie", 8, maximumQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(maximumQuality));
    }

    @Test
    public void sulfuras_is_immutable() {
        int initialQuality = 80;
        int daysToBeSold = 0;
        Item item = new Item("Sulfuras", daysToBeSold, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(item);

        gildedRose.updateInventory();

        assertThat(item.quality, is(initialQuality));
        assertThat(item.sellIn, is(daysToBeSold));
    }

    @Test
    public void backstage_passes_quality_increases_by_1_each_day_when_concert_is_more_than_10_days_away() {
        int initialQuality = 8;
        Item backstagePasses = new Item("Backstage passes", 20, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(backstagePasses);

        gildedRose.updateInventory();

        assertThat(backstagePasses.quality, is(initialQuality + 1));
    }

    @Test
    public void backstage_passes_quality_increases_by_2_each_day_when_concert_is_10_or_less_than_10_days_away() {
        int initialQuality = 8;
        Item backstagePasses = new Item("Backstage passes", 10, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(backstagePasses);

        gildedRose.updateInventory();

        assertThat(backstagePasses.quality, is(initialQuality + 2));
    }

    @Test
    public void backstage_passes_quality_increases_by_3_each_day_when_concert_is_5_or_less_than_10_days_away() {
        int initialQuality = 8;
        Item backstagePasses = new Item("Backstage passes", 5, initialQuality);
        GildedRose gildedRose = GildedRose.witCatalogHaving(backstagePasses);

        gildedRose.updateInventory();

        assertThat(backstagePasses.quality, is(initialQuality + 3));
    }

    @Test
    public void backstage_passes_quality_drops_to_zero_after_the_concert() {
        Item backstagePasses = new Item("Backstage passes", 0, 20);
        GildedRose gildedRose = GildedRose.witCatalogHaving(backstagePasses);

        gildedRose.updateInventory();

        assertThat(backstagePasses.quality, is(0));
    }
}
