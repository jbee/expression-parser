package org.hisp.dhis.lib.expression.math;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Zubair Asghar (original in rule engine)
 * @author Jan Bernitt (imported into expression parser)
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ZScoreTable
{
    /**
     * @author Zubair Asghar.
     */
    @Value
    public static class Key
    {
        int gender;

        float parameter;
    }

    @Value
    public static class Entry {
        Map<Float, Integer> sdMap;
        float min;
        float max;
        List<Float> sortedKeys;
    }

    public static final Map<Key, Entry> Z_SCORE_WFA_TABLE_GIRL = newZScoreWFATableGirl();
    public static final Map<Key, Entry> Z_SCORE_WFA_TABLE_BOY = newZScoreWFATableBoy();
    public static final Map<Key, Entry> Z_SCORE_HFA_TABLE_GIRL = newZScoreHFATableGirl();
    public static final Map<Key, Entry> Z_SCORE_HFA_TABLE_BOY = newZScoreHFATableBoy();
    public static final Map<Key, Entry> Z_SCORE_WFH_TABLE_GIRL = newZScoreWFHTableGirl();
    public static final Map<Key, Entry> Z_SCORE_WFH_TABLE_BOY = newZScoreWFHTableBoy();

    private static Map<Key, Entry> newZScoreWFATableGirl()
    {
        Map<Key, Entry> res = new HashMap<>();

        addEntry(res, 1,  0, newSDMap(2.0f, 2.4f, 2.8f, 3.2f, 3.7f, 4.2f, 4.8f));
        addEntry(res, 1,  1, newSDMap(2.7f, 3.2f, 3.6f, 4.2f, 4.8f, 5.5f, 6.2f));
        addEntry(res, 1,  2, newSDMap(3.4f, 3.9f, 4.5f, 5.1f, 5.8f, 6.6f, 7.5f));
        addEntry(res, 1,  3, newSDMap(4.0f, 4.5f, 5.2f, 5.8f, 6.6f, 7.5f, 8.5f));
        addEntry(res, 1,  4, newSDMap(4.4f, 5.0f, 5.7f, 6.4f, 7.3f, 8.2f, 9.3f));
        addEntry(res, 1,  5, newSDMap(4.8f, 5.4f, 6.1f, 6.9f, 7.8f, 8.8f, 10.0f));
        addEntry(res, 1,  6, newSDMap(5.1f, 5.7f, 6.5f, 7.3f, 8.2f, 9.3f, 10.6f));
        addEntry(res, 1,  7, newSDMap(5.3f, 6.0f, 6.8f, 7.6f, 8.6f, 9.8f, 11.1f));
        addEntry(res, 1,  8, newSDMap(5.6f, 6.3f, 7.0f, 7.9f, 9.0f, 10.2f, 11.6f));
        addEntry(res, 1,  9, newSDMap(5.8f, 6.5f, 7.3f, 8.2f, 9.3f, 10.5f, 12.0f));
        addEntry(res, 1,  10, newSDMap(5.9f, 6.7f, 7.5f, 8.5f, 9.6f, 10.9f, 12.4f));
        addEntry(res, 1,  11, newSDMap(6.1f, 6.9f, 7.7f, 8.7f, 9.9f, 11.2f, 12.8f));
        addEntry(res, 1,  12, newSDMap(6.3f, 7.0f, 7.9f, 8.9f, 10.1f, 11.5f, 13.1f));
        addEntry(res, 1,  13, newSDMap(6.4f, 7.2f, 8.1f, 9.2f, 10.4f, 11.8f, 13.5f));
        addEntry(res, 1,  14, newSDMap(6.6f, 7.4f, 8.3f, 9.4f, 10.6f, 12.1f, 13.8f));
        addEntry(res, 1,  15, newSDMap(6.7f, 7.6f, 8.5f, 9.6f, 10.9f, 12.4f, 14.1f));
        addEntry(res, 1,  16, newSDMap(6.9f, 7.7f, 8.7f, 9.8f, 11.1f, 12.6f, 14.5f));
        addEntry(res, 1,  17, newSDMap(7.0f, 7.9f, 8.9f, 10.0f, 11.4f, 12.9f, 14.8f));
        addEntry(res, 1,  18, newSDMap(7.2f, 8.1f, 9.1f, 10.2f, 11.6f, 13.2f, 15.1f));
        addEntry(res, 1,  19, newSDMap(7.3f, 8.2f, 9.2f, 10.4f, 11.8f, 13.5f, 15.4f));
        addEntry(res, 1,  20, newSDMap(7.5f, 8.4f, 9.4f, 10.6f, 12.1f, 13.7f, 15.7f));
        addEntry(res, 1,  21, newSDMap(7.6f, 8.6f, 9.6f, 10.9f, 12.3f, 14.0f, 16.0f));
        addEntry(res, 1,  22, newSDMap(7.8f, 8.7f, 9.8f, 11.1f, 12.5f, 14.3f, 16.4f));
        addEntry(res, 1,  23, newSDMap(7.9f, 8.9f, 10.0f, 11.3f, 12.8f, 14.6f, 16.7f));
        addEntry(res, 1,  24, newSDMap(8.1f, 9.0f, 10.2f, 11.5f, 13.0f, 14.8f, 17.0f));
        addEntry(res, 1,  25, newSDMap(8.2f, 9.2f, 10.3f, 11.7f, 13.3f, 15.1f, 17.3f));
        addEntry(res, 1,  26, newSDMap(8.4f, 9.4f, 10.5f, 11.9f, 13.5f, 15.4f, 17.7f));
        addEntry(res, 1,  27, newSDMap(8.5f, 9.5f, 10.7f, 12.1f, 13.7f, 15.7f, 18.0f));
        addEntry(res, 1,  28, newSDMap(8.6f, 9.7f, 10.9f, 12.3f, 14.0f, 16.0f, 18.3f));
        addEntry(res, 1,  29, newSDMap(8.8f, 9.8f, 11.1f, 12.5f, 14.2f, 16.2f, 18.7f));
        addEntry(res, 1,  30, newSDMap(8.9f, 10.0f, 11.2f, 12.7f, 14.4f, 16.5f, 19.0f));
        addEntry(res, 1,  31, newSDMap(9.0f, 10.1f, 11.4f, 12.9f, 14.7f, 16.8f, 19.3f));
        addEntry(res, 1,  32, newSDMap(9.1f, 10.3f, 11.6f, 13.1f, 14.9f, 17.1f, 19.6f));
        addEntry(res, 1,  33, newSDMap(9.3f, 10.4f, 11.7f, 13.3f, 15.1f, 17.3f, 20.0f));
        addEntry(res, 1,  34, newSDMap(9.4f, 10.5f, 11.9f, 13.5f, 15.4f, 17.6f, 20.3f));
        addEntry(res, 1,  35, newSDMap(9.5f, 10.7f, 12.0f, 13.7f, 15.6f, 17.9f, 20.6f));
        addEntry(res, 1,  36, newSDMap(9.6f, 10.8f, 12.2f, 13.9f, 15.8f, 18.1f, 20.9f));
        addEntry(res, 1,  37, newSDMap(9.7f, 10.9f, 12.4f, 14.0f, 16.0f, 18.4f, 21.3f));
        addEntry(res, 1,  38, newSDMap(9.8f, 11.1f, 12.5f, 14.2f, 16.3f, 18.7f, 21.6f));
        addEntry(res, 1,  39, newSDMap(9.9f, 11.2f, 12.7f, 14.4f, 16.5f, 19.0f, 22.0f));
        addEntry(res, 1,  40, newSDMap(10.1f, 11.3f, 12.8f, 14.6f, 16.7f, 19.2f, 22.3f));
        addEntry(res, 1,  41, newSDMap(10.2f, 11.5f, 13.0f, 14.8f, 16.9f, 19.5f, 22.7f));
        addEntry(res, 1,  42, newSDMap(10.3f, 11.6f, 13.1f, 15.0f, 17.2f, 19.8f, 23.0f));
        addEntry(res, 1,  43, newSDMap(10.4f, 11.7f, 13.3f, 15.2f, 17.4f, 20.1f, 23.4f));
        addEntry(res, 1,  44, newSDMap(10.5f, 11.8f, 13.4f, 15.3f, 17.6f, 20.4f, 23.7f));
        addEntry(res, 1,  45, newSDMap(10.6f, 12.0f, 13.6f, 15.5f, 17.8f, 20.7f, 24.1f));
        addEntry(res, 1,  46, newSDMap(10.7f, 12.1f, 13.7f, 15.7f, 18.1f, 20.9f, 24.5f));
        addEntry(res, 1,  47, newSDMap(10.8f, 12.2f, 13.9f, 15.9f, 18.3f, 21.2f, 24.8f));
        addEntry(res, 1,  48, newSDMap(10.9f, 12.3f, 14.0f, 16.1f, 18.5f, 21.5f, 25.2f));
        addEntry(res, 1,  49, newSDMap(11.0f, 12.4f, 14.2f, 16.3f, 18.8f, 21.8f, 25.5f));
        addEntry(res, 1,  50, newSDMap(11.1f, 12.6f, 14.3f, 16.4f, 19.0f, 22.1f, 25.9f));
        addEntry(res, 1,  51, newSDMap(11.2f, 12.7f, 14.5f, 16.6f, 19.2f, 22.4f, 26.3f));
        addEntry(res, 1,  52, newSDMap(11.3f, 12.8f, 14.6f, 16.8f, 19.4f, 22.6f, 26.6f));
        addEntry(res, 1,  53, newSDMap(11.4f, 12.9f, 14.8f, 17.0f, 19.7f, 22.9f, 27.0f));
        addEntry(res, 1,  54, newSDMap(11.5f, 13.0f, 14.9f, 17.2f, 19.9f, 23.2f, 27.4f));
        addEntry(res, 1,  55, newSDMap(11.6f, 13.2f, 15.1f, 17.3f, 20.1f, 23.5f, 27.7f));
        addEntry(res, 1,  56, newSDMap(11.7f, 13.3f, 15.2f, 17.5f, 20.3f, 23.8f, 28.1f));
        addEntry(res, 1,  57, newSDMap(11.8f, 13.4f, 15.3f, 17.7f, 20.6f, 24.1f, 28.5f));
        addEntry(res, 1,  58, newSDMap(11.9f, 13.5f, 15.5f, 17.9f, 20.8f, 24.4f, 28.8f));
        addEntry(res, 1,  59, newSDMap(12.0f, 13.6f, 15.6f, 18.0f, 21.0f, 24.6f, 29.2f));
        addEntry(res, 1,  60, newSDMap(12.1f, 13.7f, 15.8f, 18.2f, 21.2f, 24.9f, 29.5f));

        return Map.copyOf(res);
    }

    private static Map<Key, Entry> newZScoreWFATableBoy()
    {
        Map<Key, Entry> res = new HashMap<>();

        addEntry(res, 0,  0, newSDMap(2.1f, 2.5f, 2.9f, 3.3f, 3.9f, 4.4f, 5.0f));
        addEntry(res, 0,  1, newSDMap(2.9f, 3.4f, 3.9f, 4.5f, 5.1f, 5.8f, 6.6f));
        addEntry(res, 0,  2, newSDMap(3.8f, 4.3f, 4.9f, 5.6f, 6.3f, 7.1f, 8.0f));
        addEntry(res, 0,  3, newSDMap(4.4f, 5.0f, 5.7f, 6.4f, 7.2f, 8.0f, 9.0f));
        addEntry(res, 0,  4, newSDMap(4.9f, 5.6f, 6.2f, 7.0f, 7.8f, 8.7f, 9.7f));
        addEntry(res, 0,  5, newSDMap(5.3f, 6.0f, 6.7f, 7.5f, 8.4f, 9.3f, 10.4f));
        addEntry(res, 0,  6, newSDMap(5.7f, 6.4f, 7.1f, 7.9f, 8.8f, 9.8f, 10.9f));
        addEntry(res, 0,  7, newSDMap(5.9f, 6.7f, 7.4f, 8.3f, 9.2f, 10.3f, 11.4f));
        addEntry(res, 0,  8, newSDMap(6.2f, 6.9f, 7.7f, 8.6f, 9.6f, 10.7f, 11.9f));
        addEntry(res, 0,  9, newSDMap(6.4f, 7.1f, 8.0f, 8.9f, 9.9f, 11.0f, 12.3f));
        addEntry(res, 0,  10, newSDMap(6.6f, 7.4f, 8.2f, 9.2f, 10.2f, 11.4f, 12.7f));
        addEntry(res, 0,  11, newSDMap(6.8f, 7.6f, 8.4f, 9.4f, 10.5f, 11.7f, 13.0f));
        addEntry(res, 0,  12, newSDMap(6.9f, 7.7f, 8.6f, 9.6f, 10.8f, 12.0f, 13.3f));
        addEntry(res, 0,  13, newSDMap(7.1f, 7.9f, 8.8f, 9.9f, 11.0f, 12.3f, 13.7f));
        addEntry(res, 0,  14, newSDMap(7.2f, 8.1f, 9.0f, 10.1f, 11.3f, 12.6f, 14.0f));
        addEntry(res, 0,  15, newSDMap(7.4f, 8.3f, 9.2f, 10.3f, 11.5f, 12.8f, 14.3f));
        addEntry(res, 0,  16, newSDMap(7.5f, 8.4f, 9.4f, 10.5f, 11.7f, 13.1f, 14.6f));
        addEntry(res, 0,  17, newSDMap(7.7f, 8.6f, 9.6f, 10.7f, 12.0f, 13.4f, 14.9f));
        addEntry(res, 0,  18, newSDMap(7.8f, 8.8f, 9.8f, 10.9f, 12.2f, 13.7f, 15.3f));
        addEntry(res, 0,  19, newSDMap(8.0f, 8.9f, 10.0f, 11.1f, 12.5f, 13.9f, 15.6f));
        addEntry(res, 0,  20, newSDMap(8.1f, 9.1f, 10.1f, 11.3f, 12.7f, 14.2f, 15.9f));
        addEntry(res, 0,  21, newSDMap(8.2f, 9.2f, 10.3f, 11.5f, 12.9f, 14.5f, 16.2f));
        addEntry(res, 0,  22, newSDMap(8.4f, 9.4f, 10.5f, 11.8f, 13.2f, 14.7f, 16.5f));
        addEntry(res, 0,  23, newSDMap(8.5f, 9.5f, 10.7f, 12.0f, 13.4f, 15.0f, 16.8f));
        addEntry(res, 0,  24, newSDMap(8.6f, 9.7f, 10.8f, 12.2f, 13.6f, 15.3f, 17.1f));
        addEntry(res, 0,  25, newSDMap(8.8f, 9.8f, 11.0f, 12.4f, 13.9f, 15.5f, 17.5f));
        addEntry(res, 0,  26, newSDMap(8.9f, 10.0f, 11.2f, 12.5f, 14.1f, 15.8f, 17.8f));
        addEntry(res, 0,  27, newSDMap(9.0f, 10.1f, 11.3f, 12.7f, 14.3f, 16.1f, 18.1f));
        addEntry(res, 0,  29, newSDMap(9.2f, 10.4f, 11.7f, 13.1f, 14.8f, 16.6f, 18.7f));
        addEntry(res, 0,  30, newSDMap(9.4f, 10.5f, 11.8f, 13.3f, 15.0f, 16.9f, 19.0f));
        addEntry(res, 0,  31, newSDMap(9.5f, 10.7f, 12.0f, 13.5f, 15.2f, 17.1f, 19.3f));
        addEntry(res, 0,  32, newSDMap(9.6f, 10.8f, 12.1f, 13.7f, 15.4f, 17.4f, 19.6f));
        addEntry(res, 0,  33, newSDMap(9.7f, 10.9f, 12.3f, 13.8f, 15.6f, 17.6f, 19.9f));
        addEntry(res, 0,  34, newSDMap(9.8f, 11.0f, 12.4f, 14.0f, 15.8f, 17.8f, 20.2f));
        addEntry(res, 0,  35, newSDMap(9.9f, 11.2f, 12.6f, 14.2f, 16.0f, 18.1f, 20.4f));
        addEntry(res, 0,  36, newSDMap(10.0f, 11.3f, 12.7f, 14.3f, 16.2f, 18.3f, 20.7f));
        addEntry(res, 0,  37, newSDMap(10.1f, 11.4f, 12.9f, 14.5f, 16.4f, 18.6f, 21.0f));
        addEntry(res, 0,  38, newSDMap(10.2f, 11.5f, 13.0f, 14.7f, 16.6f, 18.8f, 21.3f));
        addEntry(res, 0,  39, newSDMap(10.3f, 11.6f, 13.1f, 14.8f, 16.8f, 19.0f, 21.6f));
        addEntry(res, 0,  40, newSDMap(10.4f, 11.8f, 13.3f, 15.0f, 17.0f, 19.3f, 21.9f));
        addEntry(res, 0,  41, newSDMap(10.5f, 11.9f, 13.4f, 15.2f, 17.2f, 19.5f, 22.1f));
        addEntry(res, 0,  42, newSDMap(10.6f, 12.0f, 13.6f, 15.3f, 17.4f, 19.7f, 22.4f));
        addEntry(res, 0,  43, newSDMap(10.7f, 12.1f, 13.7f, 15.5f, 17.6f, 20.0f, 22.7f));
        addEntry(res, 0,  44, newSDMap(10.8f, 12.2f, 13.8f, 15.7f, 17.8f, 20.2f, 23.0f));
        addEntry(res, 0,  45, newSDMap(10.9f, 12.4f, 14.0f, 15.8f, 18.0f, 20.5f, 23.3f));
        addEntry(res, 0,  46, newSDMap(11.0f, 12.5f, 14.1f, 16.0f, 18.2f, 20.7f, 23.6f));
        addEntry(res, 0,  47, newSDMap(11.1f, 12.6f, 14.3f, 16.2f, 18.4f, 20.9f, 23.9f));
        addEntry(res, 0,  48, newSDMap(11.2f, 12.7f, 14.4f, 16.3f, 18.6f, 21.2f, 24.2f));
        addEntry(res, 0,  49, newSDMap(11.3f, 12.8f, 14.5f, 16.5f, 18.8f, 21.4f, 24.5f));
        addEntry(res, 0,  50, newSDMap(11.4f, 12.9f, 14.7f, 16.7f, 19.0f, 21.7f, 24.8f));
        addEntry(res, 0,  51, newSDMap(11.5f, 13.1f, 14.8f, 16.8f, 19.2f, 21.9f, 25.1f));
        addEntry(res, 0,  52, newSDMap(11.6f, 13.2f, 15.0f, 17.0f, 19.4f, 22.2f, 25.4f));
        addEntry(res, 0,  53, newSDMap(11.7f, 13.3f, 15.1f, 17.2f, 19.6f, 22.4f, 25.7f));
        addEntry(res, 0,  54, newSDMap(11.8f, 13.4f, 15.2f, 17.3f, 19.8f, 22.7f, 26.0f));
        addEntry(res, 0,  55, newSDMap(11.9f, 13.5f, 15.4f, 17.5f, 20.0f, 22.9f, 26.3f));
        addEntry(res, 0,  56, newSDMap(12.0f, 13.6f, 15.5f, 17.7f, 20.2f, 23.2f, 26.6f));
        addEntry(res, 0,  57, newSDMap(12.1f, 13.7f, 15.6f, 17.8f, 20.4f, 23.4f, 26.9f));
        addEntry(res, 0,  58, newSDMap(12.2f, 13.8f, 15.8f, 18.0f, 20.6f, 23.7f, 27.2f));
        addEntry(res, 0,  59, newSDMap(12.3f, 14.0f, 15.9f, 18.2f, 20.8f, 23.9f, 27.6f));
        addEntry(res, 0,  60, newSDMap(12.4f, 14.1f, 16.0f, 18.3f, 21.0f, 24.2f, 27.9f));

        return Map.copyOf(res);
    }

    private static Map<Key, Entry> newZScoreHFATableGirl()
    {
        Map<Key, Entry> res = new HashMap<>();

        addEntry(res, 1,  0, newSDMap(43.6f, 45.4f, 47.3f, 49.1f, 51.0f, 52.9f, 54.7f));
        addEntry(res, 1,  1, newSDMap(47.8f, 49.8f, 51.7f, 53.7f, 55.6f, 57.6f, 59.5f));
        addEntry(res, 1,  2, newSDMap(51.0f, 53.0f, 55.0f, 57.1f, 59.1f, 61.1f, 63.2f));
        addEntry(res, 1,  3, newSDMap(53.5f, 55.6f, 57.7f, 59.8f, 61.9f, 64.0f, 66.1f));
        addEntry(res, 1,  4, newSDMap(55.6f, 57.8f, 59.9f, 62.1f, 64.3f, 66.4f, 68.6f));
        addEntry(res, 1,  5, newSDMap(57.4f, 59.6f, 61.8f, 64.0f, 66.2f, 68.5f, 70.7f));
        addEntry(res, 1,  6, newSDMap(58.9f, 61.2f, 63.5f, 65.7f, 68.0f, 70.3f, 72.5f));
        addEntry(res, 1,  7, newSDMap(60.3f, 62.7f, 65.0f, 67.3f, 69.6f, 71.9f, 74.2f));
        addEntry(res, 1,  8, newSDMap(61.7f, 64.0f, 66.4f, 68.7f, 71.1f, 73.5f, 75.8f));
        addEntry(res, 1,  9, newSDMap(62.9f, 65.3f, 67.7f, 70.1f, 72.6f, 75.0f, 77.4f));
        addEntry(res, 1,  10, newSDMap(64.1f, 66.5f, 69.0f, 71.5f, 73.9f, 76.4f, 78.9f));
        addEntry(res, 1,  11, newSDMap(65.2f, 67.7f, 70.3f, 72.8f, 75.3f, 77.8f, 80.3f));
        addEntry(res, 1,  12, newSDMap(66.3f, 68.9f, 71.4f, 74.0f, 76.6f, 79.2f, 81.7f));
        addEntry(res, 1,  13, newSDMap(67.3f, 70.0f, 72.6f, 75.2f, 77.8f, 80.5f, 83.1f));
        addEntry(res, 1,  14, newSDMap(68.3f, 71.0f, 73.7f, 76.4f, 79.1f, 81.7f, 84.4f));
        addEntry(res, 1,  15, newSDMap(69.3f, 72.0f, 74.8f, 77.5f, 80.2f, 83.0f, 85.7f));
        addEntry(res, 1,  16, newSDMap(70.2f, 73.0f, 75.8f, 78.6f, 81.4f, 84.2f, 87.0f));
        addEntry(res, 1,  17, newSDMap(71.1f, 74.0f, 76.8f, 79.7f, 82.5f, 85.4f, 88.2f));
        addEntry(res, 1,  18, newSDMap(72.0f, 74.9f, 77.8f, 80.7f, 83.6f, 86.5f, 89.4f));
        addEntry(res, 1,  19, newSDMap(72.8f, 75.8f, 78.8f, 81.7f, 84.7f, 87.6f, 90.6f));
        addEntry(res, 1,  20, newSDMap(73.7f, 76.7f, 79.7f, 82.7f, 85.7f, 88.7f, 91.7f));
        addEntry(res, 1,  21, newSDMap(74.5f, 77.5f, 80.6f, 83.7f, 86.7f, 89.8f, 92.9f));
        addEntry(res, 1,  22, newSDMap(75.2f, 78.4f, 81.5f, 84.6f, 87.7f, 90.8f, 94.0f));
        addEntry(res, 1,  23, newSDMap(76.0f, 79.2f, 82.3f, 85.5f, 88.7f, 91.9f, 95.0f));
        addEntry(res, 1,  24, newSDMap(76.7f, 80.0f, 83.2f, 86.4f, 89.6f, 92.9f, 96.1f));
        addEntry(res, 1,  25, newSDMap(76.8f, 80.0f, 83.3f, 86.6f, 89.9f, 93.1f, 96.4f));
        addEntry(res, 1,  26, newSDMap(77.5f, 80.8f, 84.1f, 87.4f, 90.8f, 94.1f, 97.4f));
        addEntry(res, 1,  27, newSDMap(78.1f, 81.5f, 84.9f, 88.3f, 91.7f, 95.0f, 98.4f));
        addEntry(res, 1,  28, newSDMap(78.8f, 82.2f, 85.7f, 89.1f, 92.5f, 96.0f, 99.4f));
        addEntry(res, 1,  29, newSDMap(79.5f, 82.9f, 86.4f, 89.9f, 93.4f, 96.9f, 100.3f));
        addEntry(res, 1,  30, newSDMap(80.1f, 83.6f, 87.1f, 90.7f, 94.2f, 97.7f, 101.3f));
        addEntry(res, 1,  31, newSDMap(80.7f, 84.3f, 87.9f, 91.4f, 95.0f, 98.6f, 102.2f));
        addEntry(res, 1,  32, newSDMap(81.3f, 84.9f, 88.6f, 92.2f, 95.8f, 99.4f, 103.1f));
        addEntry(res, 1,  33, newSDMap(81.9f, 85.6f, 89.3f, 92.9f, 96.6f, 100.3f, 103.9f));
        addEntry(res, 1,  34, newSDMap(82.5f, 86.2f, 89.9f, 93.6f, 97.4f, 101.1f, 104.8f));
        addEntry(res, 1,  35, newSDMap(83.1f, 86.8f, 90.6f, 94.4f, 98.1f, 101.9f, 105.6f));
        addEntry(res, 1,  36, newSDMap(83.6f, 87.4f, 91.2f, 95.1f, 98.9f, 102.7f, 106.5f));
        addEntry(res, 1,  37, newSDMap(84.2f, 88.0f, 91.9f, 95.7f, 99.6f, 103.4f, 107.3f));
        addEntry(res, 1,  38, newSDMap(84.7f, 88.6f, 92.5f, 96.4f, 100.3f, 104.2f, 108.1f));
        addEntry(res, 1,  39, newSDMap(85.3f, 89.2f, 93.1f, 97.1f, 101.0f, 105.0f, 108.9f));
        addEntry(res, 1,  40, newSDMap(85.8f, 89.8f, 93.8f, 97.7f, 101.7f, 105.7f, 109.7f));
        addEntry(res, 1,  41, newSDMap(86.3f, 90.4f, 94.4f, 98.4f, 102.4f, 106.4f, 110.5f));
        addEntry(res, 1,  42, newSDMap(86.8f, 90.9f, 95.0f, 99.0f, 103.1f, 107.2f, 111.2f));
        addEntry(res, 1,  43, newSDMap(87.4f, 91.5f, 95.6f, 99.7f, 103.8f, 107.9f, 112.0f));
        addEntry(res, 1,  44, newSDMap(87.9f, 92.0f, 96.2f, 100.3f, 104.5f, 108.6f, 112.7f));
        addEntry(res, 1,  45, newSDMap(88.4f, 92.5f, 96.7f, 100.9f, 105.1f, 109.3f, 113.5f));
        addEntry(res, 1,  46, newSDMap(88.9f, 93.1f, 97.3f, 101.5f, 105.8f, 110.0f, 114.2f));
        addEntry(res, 1,  47, newSDMap(89.3f, 93.6f, 97.9f, 102.1f, 106.4f, 110.7f, 114.9f));
        addEntry(res, 1,  48, newSDMap(89.8f, 94.1f, 98.4f, 102.7f, 107.0f, 111.3f, 115.7f));
        addEntry(res, 1,  49, newSDMap(90.3f, 94.6f, 99.0f, 103.3f, 107.7f, 112.0f, 116.4f));
        addEntry(res, 1,  50, newSDMap(90.7f, 95.1f, 99.5f, 103.9f, 108.3f, 112.7f, 117.1f));
        addEntry(res, 1,  51, newSDMap(91.2f, 95.6f, 100.1f, 104.5f, 108.9f, 113.3f, 117.7f));
        addEntry(res, 1,  52, newSDMap(91.7f, 96.1f, 100.6f, 105.0f, 109.5f, 114.0f, 118.4f));
        addEntry(res, 1,  53, newSDMap(92.1f, 96.6f, 101.1f, 105.6f, 110.1f, 114.6f, 119.1f));
        addEntry(res, 1,  54, newSDMap(92.6f, 97.1f, 101.6f, 106.2f, 110.7f, 115.2f, 119.8f));
        addEntry(res, 1,  55, newSDMap(93.0f, 97.6f, 102.2f, 106.7f, 111.3f, 115.9f, 120.4f));
        addEntry(res, 1,  56, newSDMap(93.4f, 98.1f, 102.7f, 107.3f, 111.9f, 116.5f, 121.1f));
        addEntry(res, 1,  57, newSDMap(93.9f, 98.5f, 103.2f, 107.8f, 112.5f, 117.1f, 121.8f));
        addEntry(res, 1,  58, newSDMap(94.3f, 99.0f, 103.7f, 108.4f, 113.0f, 117.7f, 122.4f));
        addEntry(res, 1,  59, newSDMap(94.7f, 99.5f, 104.2f, 108.9f, 113.6f, 118.3f, 123.1f));
        addEntry(res, 1,  60, newSDMap(95.2f, 99.9f, 104.7f, 109.4f, 114.2f, 118.9f, 123.7f));

        return Map.copyOf(res);
    }

    private static Map<Key, Entry> newZScoreHFATableBoy()
    {
        Map<Key, Entry> res = new HashMap<>();

        addEntry(res, 0,  0, newSDMap(44.2f, 46.1f, 48.0f, 49.9f, 51.8f, 53.7f, 55.6f));
        addEntry(res, 0,  1, newSDMap(48.9f, 50.8f, 52.8f, 54.7f, 56.7f, 58.6f, 60.6f));
        addEntry(res, 0,  2, newSDMap(52.4f, 54.4f, 56.4f, 58.4f, 60.4f, 62.4f, 64.4f));
        addEntry(res, 0,  3, newSDMap(55.3f, 57.3f, 59.4f, 61.4f, 63.5f, 65.5f, 67.6f));
        addEntry(res, 0,  4, newSDMap(57.6f, 59.7f, 61.8f, 63.9f, 66.0f, 68.0f, 70.1f));
        addEntry(res, 0,  5, newSDMap(59.6f, 61.7f, 63.8f, 65.9f, 68.0f, 70.1f, 72.2f));
        addEntry(res, 0,  6, newSDMap(61.2f, 63.3f, 65.5f, 67.6f, 69.8f, 71.9f, 74.0f));
        addEntry(res, 0,  7, newSDMap(62.7f, 64.8f, 67.0f, 69.2f, 71.3f, 73.5f, 75.7f));
        addEntry(res, 0,  8, newSDMap(64.0f, 66.2f, 68.4f, 70.6f, 72.8f, 75.0f, 77.2f));
        addEntry(res, 0,  9, newSDMap(65.2f, 67.5f, 69.7f, 72.0f, 74.2f, 76.5f, 78.7f));
        addEntry(res, 0,  10, newSDMap(66.4f, 68.7f, 71.0f, 73.3f, 75.6f, 77.9f, 80.1f));
        addEntry(res, 0,  11, newSDMap(67.6f, 69.9f, 72.2f, 74.5f, 76.9f, 79.2f, 81.5f));
        addEntry(res, 0,  12, newSDMap(68.6f, 71.0f, 73.4f, 75.7f, 78.1f, 80.5f, 82.9f));
        addEntry(res, 0,  13, newSDMap(69.6f, 72.1f, 74.5f, 76.9f, 79.3f, 81.8f, 84.2f));
        addEntry(res, 0,  14, newSDMap(70.6f, 73.1f, 75.6f, 78.0f, 80.5f, 83.0f, 85.5f));
        addEntry(res, 0,  15, newSDMap(71.6f, 74.1f, 76.6f, 79.1f, 81.7f, 84.2f, 86.7f));
        addEntry(res, 0,  16, newSDMap(72.5f, 75.0f, 77.6f, 80.2f, 82.8f, 85.4f, 88.0f));
        addEntry(res, 0,  17, newSDMap(73.3f, 76.0f, 78.6f, 81.2f, 83.9f, 86.5f, 89.2f));
        addEntry(res, 0,  18, newSDMap(74.2f, 76.9f, 79.6f, 82.3f, 85.0f, 87.7f, 90.4f));
        addEntry(res, 0,  19, newSDMap(75.0f, 77.7f, 80.5f, 83.2f, 86.0f, 88.8f, 91.5f));
        addEntry(res, 0,  20, newSDMap(75.8f, 78.6f, 81.4f, 84.2f, 87.0f, 89.8f, 92.6f));
        addEntry(res, 0,  21, newSDMap(76.5f, 79.4f, 82.3f, 85.1f, 88.0f, 90.9f, 93.8f));
        addEntry(res, 0,  22, newSDMap(77.2f, 80.2f, 83.1f, 86.0f, 89.0f, 91.9f, 94.9f));
        addEntry(res, 0,  23, newSDMap(78.0f, 81.0f, 83.9f, 86.9f, 89.9f, 92.9f, 95.9f));
        addEntry(res, 0,  24, newSDMap(78.0f, 81.0f, 84.1f, 87.1f, 90.2f, 93.2f, 96.3f));
        addEntry(res, 0,  25, newSDMap(78.6f, 81.7f, 84.9f, 88.0f, 91.1f, 94.2f, 97.3f));
        addEntry(res, 0,  26, newSDMap(79.3f, 82.5f, 85.6f, 88.8f, 92.0f, 95.2f, 98.3f));
        addEntry(res, 0,  27, newSDMap(79.9f, 83.1f, 86.4f, 89.6f, 92.9f, 96.1f, 99.3f));
        addEntry(res, 0,  28, newSDMap(80.5f, 83.8f, 87.1f, 90.4f, 93.7f, 97.0f, 100.3f));
        addEntry(res, 0,  29, newSDMap(81.1f, 84.5f, 87.8f, 91.2f, 94.5f, 97.9f, 101.2f));
        addEntry(res, 0,  30, newSDMap(81.7f, 85.1f, 88.5f, 91.9f, 95.3f, 98.7f, 102.1f));
        addEntry(res, 0,  31, newSDMap(82.3f, 85.7f, 89.2f, 92.7f, 96.1f, 99.6f, 103.0f));
        addEntry(res, 0,  32, newSDMap(82.8f, 86.4f, 89.9f, 93.4f, 96.9f, 100.4f, 103.9f));
        addEntry(res, 0,  33, newSDMap(83.4f, 86.9f, 90.5f, 94.1f, 97.6f, 101.2f, 104.8f));
        addEntry(res, 0,  34, newSDMap(83.9f, 87.5f, 91.1f, 94.8f, 98.4f, 102.0f, 105.6f));
        addEntry(res, 0,  35, newSDMap(84.4f, 88.1f, 91.8f, 95.4f, 99.1f, 102.7f, 106.4f));
        addEntry(res, 0,  36, newSDMap(85.0f, 88.7f, 92.4f, 96.1f, 99.8f, 103.5f, 107.2f));
        addEntry(res, 0,  37, newSDMap(85.5f, 89.2f, 93.0f, 96.7f, 100.5f, 104.2f, 108.0f));
        addEntry(res, 0,  38, newSDMap(86.0f, 89.8f, 93.6f, 97.4f, 101.2f, 105.0f, 108.8f));
        addEntry(res, 0,  39, newSDMap(86.5f, 90.3f, 94.2f, 98.0f, 101.8f, 105.7f, 109.5f));
        addEntry(res, 0,  40, newSDMap(87.0f, 90.9f, 94.7f, 98.6f, 102.5f, 106.4f, 110.3f));
        addEntry(res, 0,  41, newSDMap(87.5f, 91.4f, 95.3f, 99.2f, 103.2f, 107.1f, 111.0f));
        addEntry(res, 0,  42, newSDMap(88.0f, 91.9f, 95.9f, 99.9f, 103.8f, 107.8f, 111.7f));
        addEntry(res, 0,  43, newSDMap(88.4f, 92.4f, 96.4f, 100.4f, 104.5f, 108.5f, 112.5f));
        addEntry(res, 0,  44, newSDMap(88.9f, 93.0f, 97.0f, 101.0f, 105.1f, 109.1f, 113.2f));
        addEntry(res, 0,  45, newSDMap(89.4f, 93.5f, 97.5f, 101.6f, 105.7f, 109.8f, 113.9f));
        addEntry(res, 0,  46, newSDMap(89.8f, 94.0f, 98.1f, 102.2f, 106.3f, 110.4f, 114.6f));
        addEntry(res, 0,  47, newSDMap(90.3f, 94.4f, 98.6f, 102.8f, 106.9f, 111.1f, 115.2f));
        addEntry(res, 0,  48, newSDMap(90.7f, 94.9f, 99.1f, 103.3f, 107.5f, 111.7f, 115.9f));
        addEntry(res, 0,  49, newSDMap(91.2f, 95.4f, 99.7f, 103.9f, 108.1f, 112.4f, 116.6f));
        addEntry(res, 0,  50, newSDMap(91.6f, 95.9f, 100.2f, 104.4f, 108.7f, 113.0f, 117.3f));
        addEntry(res, 0,  51, newSDMap(92.1f, 96.4f, 100.7f, 105.0f, 109.3f, 113.6f, 117.9f));
        addEntry(res, 0,  52, newSDMap(92.5f, 96.9f, 101.2f, 105.6f, 109.9f, 114.2f, 118.6f));
        addEntry(res, 0,  53, newSDMap(93.0f, 97.4f, 101.7f, 106.1f, 110.5f, 114.9f, 119.2f));
        addEntry(res, 0,  54, newSDMap(93.4f, 97.8f, 102.3f, 106.7f, 111.1f, 115.5f, 119.9f));
        addEntry(res, 0,  55, newSDMap(93.9f, 98.3f, 102.8f, 107.2f, 111.7f, 116.1f, 120.6f));
        addEntry(res, 0,  56, newSDMap(94.3f, 98.8f, 103.3f, 107.8f, 112.3f, 116.7f, 121.2f));
        addEntry(res, 0,  57, newSDMap(94.7f, 99.3f, 103.8f, 108.3f, 112.8f, 117.4f, 121.9f));
        addEntry(res, 0,  58, newSDMap(95.2f, 99.7f, 104.3f, 108.9f, 113.4f, 118.0f, 122.6f));
        addEntry(res, 0,  59, newSDMap(95.6f, 100.2f, 104.8f, 109.4f, 114.0f, 118.6f, 123.2f));
        addEntry(res, 0,  60, newSDMap(96.1f, 100.7f, 105.3f, 110.0f, 114.6f, 119.2f, 123.9f));

        return Map.copyOf(res);
    }

    private static Map<Key, Entry> newZScoreWFHTableGirl()
    {
        Map<Key, Entry> res = new HashMap<>();

        addEntry(res, 1,  45, newSDMap(1.9f, 2.1f, 2.3f, 2.5f, 2.7f, 3.0f, 3.3f));
        addEntry(res, 1,  45.5, newSDMap(2.0f, 2.1f, 2.3f, 2.5f, 2.8f, 3.1f, 3.4f));
        addEntry(res, 1,  46, newSDMap(2.0f, 2.2f, 2.4f, 2.6f, 2.9f, 3.2f, 3.5f));
        addEntry(res, 1,  46.5, newSDMap(2.1f, 2.3f, 2.5f, 2.7f, 3.0f, 3.3f, 3.6f));
        addEntry(res, 1,  47, newSDMap(2.2f, 2.4f, 2.6f, 2.8f, 3.1f, 3.4f, 3.7f));
        addEntry(res, 1,  47.5, newSDMap(2.2f, 2.4f, 2.6f, 2.9f, 3.2f, 3.5f, 3.8f));
        addEntry(res, 1,  48, newSDMap(2.3f, 2.5f, 2.7f, 3.0f, 3.3f, 3.6f, 4.0f));
        addEntry(res, 1,  48.5, newSDMap(2.4f, 2.6f, 2.8f, 3.1f, 3.4f, 3.7f, 4.1f));
        addEntry(res, 1,  49, newSDMap(2.4f, 2.6f, 2.9f, 3.2f, 3.5f, 3.8f, 4.2f));
        addEntry(res, 1,  49.5, newSDMap(2.5f, 2.7f, 3.0f, 3.3f, 3.6f, 3.9f, 4.3f));
        addEntry(res, 1,  50, newSDMap(2.6f, 2.8f, 3.1f, 3.4f, 3.7f, 4.0f, 4.5f));
        addEntry(res, 1,  50.5, newSDMap(2.7f, 2.9f, 3.2f, 3.5f, 3.8f, 4.2f, 4.6f));
        addEntry(res, 1,  51, newSDMap(2.8f, 3.0f, 3.3f, 3.6f, 3.9f, 4.3f, 4.8f));
        addEntry(res, 1,  51.5, newSDMap(2.8f, 3.1f, 3.4f, 3.7f, 4.0f, 4.4f, 4.9f));
        addEntry(res, 1,  52, newSDMap(2.9f, 3.2f, 3.5f, 3.8f, 4.2f, 4.6f, 5.1f));
        addEntry(res, 1,  52.5, newSDMap(3.0f, 3.3f, 3.6f, 3.9f, 4.3f, 4.7f, 5.2f));
        addEntry(res, 1,  53, newSDMap(3.1f, 3.4f, 3.7f, 4.0f, 4.4f, 4.9f, 5.4f));
        addEntry(res, 1,  53.5, newSDMap(3.2f, 3.5f, 3.8f, 4.2f, 4.6f, 5.0f, 5.5f));
        addEntry(res, 1,  54, newSDMap(3.3f, 3.6f, 3.9f, 4.3f, 4.7f, 5.2f, 5.7f));
        addEntry(res, 1,  54.5, newSDMap(3.4f, 3.7f, 4.0f, 4.4f, 4.8f, 5.3f, 5.9f));
        addEntry(res, 1,  55, newSDMap(3.5f, 3.8f, 4.2f, 4.5f, 5.0f, 5.5f, 6.1f));
        addEntry(res, 1,  55.5, newSDMap(3.6f, 3.9f, 4.3f, 4.7f, 5.1f, 5.7f, 6.3f));
        addEntry(res, 1,  56, newSDMap(3.7f, 4.0f, 4.4f, 4.8f, 5.3f, 5.8f, 6.4f));
        addEntry(res, 1,  56.5, newSDMap(3.8f, 4.1f, 4.5f, 5.0f, 5.4f, 6.0f, 6.6f));
        addEntry(res, 1,  57, newSDMap(3.9f, 4.3f, 4.6f, 5.1f, 5.6f, 6.1f, 6.8f));
        addEntry(res, 1,  57.5, newSDMap(4.0f, 4.4f, 4.8f, 5.2f, 5.7f, 6.3f, 7.0f));
        addEntry(res, 1,  58, newSDMap(4.1f, 4.5f, 4.9f, 5.4f, 5.9f, 6.5f, 7.1f));
        addEntry(res, 1,  58.5, newSDMap(4.2f, 4.6f, 5.0f, 5.5f, 6.0f, 6.6f, 7.3f));
        addEntry(res, 1,  59, newSDMap(4.3f, 4.7f, 5.1f, 5.6f, 6.2f, 6.8f, 7.5f));
        addEntry(res, 1,  59.5, newSDMap(4.4f, 4.8f, 5.3f, 5.7f, 6.3f, 6.9f, 7.7f));
        addEntry(res, 1,  60, newSDMap(4.5f, 4.9f, 5.4f, 5.9f, 6.4f, 7.1f, 7.8f));
        addEntry(res, 1,  60.5, newSDMap(4.6f, 5.0f, 5.5f, 6.0f, 6.6f, 7.3f, 8.0f));
        addEntry(res, 1,  61, newSDMap(4.7f, 5.1f, 5.6f, 6.1f, 6.7f, 7.4f, 8.2f));
        addEntry(res, 1,  61.5, newSDMap(4.8f, 5.2f, 5.7f, 6.3f, 6.9f, 7.6f, 8.4f));
        addEntry(res, 1,  62, newSDMap(4.9f, 5.3f, 5.8f, 6.4f, 7.0f, 7.7f, 8.5f));
        addEntry(res, 1,  62.5, newSDMap(5.0f, 5.4f, 5.9f, 6.5f, 7.1f, 7.8f, 8.7f));
        addEntry(res, 1,  63, newSDMap(5.1f, 5.5f, 6.0f, 6.6f, 7.3f, 8.0f, 8.8f));
        addEntry(res, 1,  63.5, newSDMap(5.2f, 5.6f, 6.2f, 6.7f, 7.4f, 8.1f, 9.0f));
        addEntry(res, 1,  64, newSDMap(5.3f, 5.7f, 6.3f, 6.9f, 7.5f, 8.3f, 9.1f));
        addEntry(res, 1,  64.5, newSDMap(5.4f, 5.8f, 6.4f, 7.0f, 7.6f, 8.4f, 9.3f));
        addEntry(res, 1,  65, newSDMap(5.5f, 5.9f, 6.5f, 7.1f, 7.8f, 8.6f, 9.5f));
        addEntry(res, 1,  65.5, newSDMap(5.5f, 6.0f, 6.6f, 7.2f, 7.9f, 8.7f, 9.6f));
        addEntry(res, 1,  66, newSDMap(5.6f, 6.1f, 6.7f, 7.3f, 8.0f, 8.8f, 9.8f));
        addEntry(res, 1,  66.5, newSDMap(5.7f, 6.2f, 6.8f, 7.4f, 8.1f, 9.0f, 9.9f));
        addEntry(res, 1,  67, newSDMap(5.8f, 6.3f, 6.9f, 7.5f, 8.3f, 9.1f, 10.0f));
        addEntry(res, 1,  67.5, newSDMap(5.9f, 6.4f, 7.0f, 7.6f, 8.4f, 9.2f, 10.2f));
        addEntry(res, 1,  68, newSDMap(6.0f, 6.5f, 7.1f, 7.7f, 8.5f, 9.4f, 10.3f));
        addEntry(res, 1,  68.5, newSDMap(6.1f, 6.6f, 7.2f, 7.9f, 8.6f, 9.5f, 10.5f));
        addEntry(res, 1,  69, newSDMap(6.1f, 6.7f, 7.3f, 8.0f, 8.7f, 9.6f, 10.6f));
        addEntry(res, 1,  69.5, newSDMap(6.2f, 6.8f, 7.4f, 8.1f, 8.8f, 9.7f, 10.7f));
        addEntry(res, 1,  70, newSDMap(6.3f, 6.9f, 7.5f, 8.2f, 9.0f, 9.9f, 10.9f));
        addEntry(res, 1,  70.5, newSDMap(6.4f, 6.9f, 7.6f, 8.3f, 9.1f, 10.0f, 11.0f));
        addEntry(res, 1,  71, newSDMap(6.5f, 7.0f, 7.7f, 8.4f, 9.2f, 10.1f, 11.1f));
        addEntry(res, 1,  71.5, newSDMap(6.5f, 7.1f, 7.7f, 8.5f, 9.3f, 10.2f, 11.3f));
        addEntry(res, 1,  72, newSDMap(6.6f, 7.2f, 7.8f, 8.6f, 9.4f, 10.3f, 11.4f));
        addEntry(res, 1,  72.5, newSDMap(6.7f, 7.3f, 7.9f, 8.7f, 9.5f, 10.5f, 11.5f));
        addEntry(res, 1,  73, newSDMap(6.8f, 7.4f, 8.0f, 8.8f, 9.6f, 10.6f, 11.7f));
        addEntry(res, 1,  73.5, newSDMap(6.9f, 7.4f, 8.1f, 8.9f, 9.7f, 10.7f, 11.8f));
        addEntry(res, 1,  74, newSDMap(6.9f, 7.5f, 8.2f, 9.0f, 9.8f, 10.8f, 11.9f));
        addEntry(res, 1,  74.5, newSDMap(7.0f, 7.6f, 8.3f, 9.1f, 9.9f, 10.9f, 12.0f));
        addEntry(res, 1,  75, newSDMap(7.1f, 7.7f, 8.4f, 9.1f, 10.0f, 11.0f, 12.2f));
        addEntry(res, 1,  75.5, newSDMap(7.1f, 7.8f, 8.5f, 9.2f, 10.1f, 11.1f, 12.3f));
        addEntry(res, 1,  76, newSDMap(7.2f, 7.8f, 8.5f, 9.3f, 10.2f, 11.2f, 12.4f));
        addEntry(res, 1,  76.5, newSDMap(7.3f, 7.9f, 8.6f, 9.4f, 10.3f, 11.4f, 12.5f));
        addEntry(res, 1,  77, newSDMap(7.4f, 8.0f, 8.7f, 9.5f, 10.4f, 11.5f, 12.6f));
        addEntry(res, 1,  77.5, newSDMap(7.4f, 8.1f, 8.8f, 9.6f, 10.5f, 11.6f, 12.8f));
        addEntry(res, 1,  78, newSDMap(7.5f, 8.2f, 8.9f, 9.7f, 10.6f, 11.7f, 12.9f));
        addEntry(res, 1,  78.5, newSDMap(7.6f, 8.2f, 9.0f, 9.8f, 10.7f, 11.8f, 13.0f));
        addEntry(res, 1,  79, newSDMap(7.7f, 8.3f, 9.1f, 9.9f, 10.8f, 11.9f, 13.1f));
        addEntry(res, 1,  79.5, newSDMap(7.7f, 8.4f, 9.1f, 10.0f, 10.9f, 12.0f, 13.3f));
        addEntry(res, 1,  80, newSDMap(7.8f, 8.5f, 9.2f, 10.1f, 11.0f, 12.1f, 13.4f));
        addEntry(res, 1,  80.5, newSDMap(7.9f, 8.6f, 9.3f, 10.2f, 11.2f, 12.3f, 13.5f));
        addEntry(res, 1,  81, newSDMap(8.0f, 8.7f, 9.4f, 10.3f, 11.3f, 12.4f, 13.7f));
        addEntry(res, 1,  81.5, newSDMap(8.1f, 8.8f, 9.5f, 10.4f, 11.4f, 12.5f, 13.8f));
        addEntry(res, 1,  82, newSDMap(8.1f, 8.8f, 9.6f, 10.5f, 11.5f, 12.6f, 13.9f));
        addEntry(res, 1,  82.5, newSDMap(8.2f, 8.9f, 9.7f, 10.6f, 11.6f, 12.8f, 14.1f));
        addEntry(res, 1,  83, newSDMap(8.3f, 9.0f, 9.8f, 10.7f, 11.8f, 12.9f, 14.2f));
        addEntry(res, 1,  83.5, newSDMap(8.4f, 9.1f, 9.9f, 10.9f, 11.9f, 13.1f, 14.4f));
        addEntry(res, 1,  84, newSDMap(8.5f, 9.2f, 10.1f, 11.0f, 12.0f, 13.2f, 14.5f));
        addEntry(res, 1,  84.5, newSDMap(8.6f, 9.3f, 10.2f, 11.1f, 12.1f, 13.3f, 14.7f));
        addEntry(res, 1,  85, newSDMap(8.7f, 9.4f, 10.3f, 11.2f, 12.3f, 13.5f, 14.9f));
        addEntry(res, 1,  85.5, newSDMap(8.8f, 9.5f, 10.4f, 11.3f, 12.4f, 13.6f, 15.0f));
        addEntry(res, 1,  86, newSDMap(8.9f, 9.7f, 10.5f, 11.5f, 12.6f, 13.8f, 15.2f));
        addEntry(res, 1,  86.5, newSDMap(9.0f, 9.8f, 10.6f, 11.6f, 12.7f, 13.9f, 15.4f));
        addEntry(res, 1,  87, newSDMap(9.1f, 9.9f, 10.7f, 11.7f, 12.8f, 14.1f, 15.5f));
        addEntry(res, 1,  87.5, newSDMap(9.2f, 10.0f, 10.9f, 11.8f, 13.0f, 14.2f, 15.7f));
        addEntry(res, 1,  88, newSDMap(9.3f, 10.1f, 11.0f, 12.0f, 13.1f, 14.4f, 15.9f));
        addEntry(res, 1,  88.5, newSDMap(9.4f, 10.2f, 11.1f, 12.1f, 13.2f, 14.5f, 16.0f));
        addEntry(res, 1,  89, newSDMap(9.5f, 10.3f, 11.2f, 12.2f, 13.4f, 14.7f, 16.2f));
        addEntry(res, 1,  89.5, newSDMap(9.6f, 10.4f, 11.3f, 12.3f, 13.5f, 14.8f, 16.4f));
        addEntry(res, 1,  90, newSDMap(9.7f, 10.5f, 11.4f, 12.5f, 13.7f, 15.0f, 16.5f));
        addEntry(res, 1,  90.5, newSDMap(9.8f, 10.6f, 11.5f, 12.6f, 13.8f, 15.1f, 16.7f));
        addEntry(res, 1,  91, newSDMap(9.9f, 10.7f, 11.7f, 12.7f, 13.9f, 15.3f, 16.9f));
        addEntry(res, 1,  91.5, newSDMap(10.0f, 10.8f, 11.8f, 12.8f, 14.1f, 15.5f, 17.0f));
        addEntry(res, 1,  92, newSDMap(10.1f, 10.9f, 11.9f, 13.0f, 14.2f, 15.6f, 17.2f));
        addEntry(res, 1,  92.5, newSDMap(10.1f, 11.0f, 12.0f, 13.1f, 14.3f, 15.8f, 17.4f));
        addEntry(res, 1,  93, newSDMap(10.2f, 11.1f, 12.1f, 13.2f, 14.5f, 15.9f, 17.5f));
        addEntry(res, 1,  93.5, newSDMap(10.3f, 11.2f, 12.2f, 13.3f, 14.6f, 16.1f, 17.7f));
        addEntry(res, 1,  94, newSDMap(10.4f, 11.3f, 12.3f, 13.5f, 14.7f, 16.2f, 17.9f));
        addEntry(res, 1,  94.5, newSDMap(10.5f, 11.4f, 12.4f, 13.6f, 14.9f, 16.4f, 18.0f));
        addEntry(res, 1,  95, newSDMap(10.6f, 11.5f, 12.6f, 13.7f, 15.0f, 16.5f, 18.2f));
        addEntry(res, 1,  95.5, newSDMap(10.7f, 11.6f, 12.7f, 13.8f, 15.2f, 16.7f, 18.4f));
        addEntry(res, 1,  96, newSDMap(10.8f, 11.7f, 12.8f, 14.0f, 15.3f, 16.8f, 18.6f));
        addEntry(res, 1,  96.5, newSDMap(10.9f, 11.8f, 12.9f, 14.1f, 15.4f, 17.0f, 18.7f));
        addEntry(res, 1,  97, newSDMap(11.0f, 12.0f, 13.0f, 14.2f, 15.6f, 17.1f, 18.9f));
        addEntry(res, 1,  97.5, newSDMap(11.1f, 12.1f, 13.1f, 14.4f, 15.7f, 17.3f, 19.1f));
        addEntry(res, 1,  98, newSDMap(11.2f, 12.2f, 13.3f, 14.5f, 15.9f, 17.5f, 19.3f));
        addEntry(res, 1,  98.5, newSDMap(11.3f, 12.3f, 13.4f, 14.6f, 16.0f, 17.6f, 19.5f));
        addEntry(res, 1,  99, newSDMap(11.4f, 12.4f, 13.5f, 14.8f, 16.2f, 17.8f, 19.6f));
        addEntry(res, 1,  99.5, newSDMap(11.5f, 12.5f, 13.6f, 14.9f, 16.3f, 18.0f, 19.8f));
        addEntry(res, 1,  100, newSDMap(11.6f, 12.6f, 13.7f, 15.0f, 16.5f, 18.1f, 20.0f));
        addEntry(res, 1,  100.5, newSDMap(11.7f, 12.7f, 13.9f, 15.2f, 16.6f, 18.3f, 20.2f));
        addEntry(res, 1,  101, newSDMap(11.8f, 12.8f, 14.0f, 15.3f, 16.8f, 18.5f, 20.4f));
        addEntry(res, 1,  101.5, newSDMap(11.9f, 13.0f, 14.1f, 15.5f, 17.0f, 18.7f, 20.6f));
        addEntry(res, 1,  102, newSDMap(12.0f, 13.1f, 14.3f, 15.6f, 17.1f, 18.9f, 20.8f));
        addEntry(res, 1,  102.5, newSDMap(12.1f, 13.2f, 14.4f, 15.8f, 17.3f, 19.0f, 21.0f));
        addEntry(res, 1,  103, newSDMap(12.3f, 13.3f, 14.5f, 15.9f, 17.5f, 19.2f, 21.3f));
        addEntry(res, 1,  103.5, newSDMap(12.4f, 13.5f, 14.7f, 16.1f, 17.6f, 19.4f, 21.5f));
        addEntry(res, 1,  104, newSDMap(12.5f, 13.6f, 14.8f, 16.2f, 17.8f, 19.6f, 21.7f));
        addEntry(res, 1,  104.5, newSDMap(12.6f, 13.7f, 15.0f, 16.4f, 18.0f, 19.8f, 21.9f));
        addEntry(res, 1,  105, newSDMap(12.7f, 13.8f, 15.1f, 16.5f, 18.2f, 20.0f, 22.2f));
        addEntry(res, 1,  105.5, newSDMap(12.8f, 14.0f, 15.3f, 16.7f, 18.4f, 20.2f, 22.4f));
        addEntry(res, 1,  106, newSDMap(13.0f, 14.1f, 15.4f, 16.9f, 18.5f, 20.5f, 22.6f));
        addEntry(res, 1,  106.5, newSDMap(13.1f, 14.3f, 15.6f, 17.1f, 18.7f, 20.7f, 22.9f));
        addEntry(res, 1,  107, newSDMap(13.2f, 14.4f, 15.7f, 17.2f, 18.9f, 20.9f, 23.1f));
        addEntry(res, 1,  107.5, newSDMap(13.3f, 14.5f, 15.9f, 17.4f, 19.1f, 21.1f, 23.4f));
        addEntry(res, 1,  108, newSDMap(13.5f, 14.7f, 16.0f, 17.6f, 19.3f, 21.3f, 23.6f));
        addEntry(res, 1,  108.5, newSDMap(13.6f, 14.8f, 16.2f, 17.8f, 19.5f, 21.6f, 23.9f));
        addEntry(res, 1,  109, newSDMap(13.7f, 15.0f, 16.4f, 18.0f, 19.7f, 21.8f, 24.2f));
        addEntry(res, 1,  109.5, newSDMap(13.9f, 15.1f, 16.5f, 18.1f, 20.0f, 22.0f, 24.4f));
        addEntry(res, 1,  110, newSDMap(14.0f, 15.3f, 16.7f, 18.3f, 20.2f, 22.3f, 24.7f));
        addEntry(res, 1,  110.5, newSDMap(14.4f, 15.7f, 17.1f, 18.8f, 20.7f, 22.9f, 25.4f));
        addEntry(res, 1,  111, newSDMap(14.5f, 15.8f, 17.3f, 19.0f, 20.9f, 23.1f, 25.7f));
        addEntry(res, 1,  111.5, newSDMap(14.7f, 16.0f, 17.5f, 19.2f, 21.2f, 23.4f, 26.0f));
        addEntry(res, 1,  112, newSDMap(0.09507f, 14.8f, 16.2f, 17.7f, 19.4f, 21.4f, 23.6f));
        addEntry(res, 1,  112.5, newSDMap(15.0f, 16.3f, 17.9f, 19.6f, 21.6f, 23.9f, 26.5f));
        addEntry(res, 1,  113, newSDMap(15.1f, 16.5f, 18.0f, 19.8f, 21.8f, 24.2f, 26.8f));
        addEntry(res, 1,  113.5, newSDMap(15.3f, 16.7f, 18.2f, 20.0f, 22.1f, 24.4f, 27.1f));
        addEntry(res, 1,  114, newSDMap(15.4f, 16.8f, 18.4f, 20.2f, 22.3f, 24.7f, 27.4f));
        addEntry(res, 1,  114.5, newSDMap(15.6f, 17.0f, 18.6f, 20.5f, 22.6f, 25.0f, 27.8f));
        addEntry(res, 1,  115, newSDMap(15.7f, 17.2f, 18.8f, 20.7f, 22.8f, 25.2f, 28.1f));
        addEntry(res, 1,  115.5, newSDMap(15.9f, 17.3f, 19.0f, 20.9f, 23.0f, 25.5f, 28.4f));
        addEntry(res, 1,  116, newSDMap(16.0f, 17.5f, 19.2f, 21.1f, 23.3f, 25.8f, 28.7f));
        addEntry(res, 1,  116.5, newSDMap(16.2f, 17.7f, 19.4f, 21.3f, 23.5f, 26.1f, 29.0f));
        addEntry(res, 1,  117, newSDMap(16.3f, 17.8f, 19.6f, 21.5f, 23.8f, 26.3f, 29.3f));
        addEntry(res, 1,  117.5, newSDMap(16.5f, 18.0f, 19.8f, 21.7f, 24.0f, 26.6f, 29.6f));
        addEntry(res, 1,  118, newSDMap(16.6f, 18.2f, 19.9f, 22.0f, 24.2f, 26.9f, 29.9f));
        addEntry(res, 1,  118.5, newSDMap(16.8f, 18.4f, 20.1f, 22.2f, 24.5f, 27.2f, 30.3f));
        addEntry(res, 1,  119, newSDMap(16.9f, 18.5f, 20.3f, 22.4f, 24.7f, 27.4f, 30.6f));
        addEntry(res, 1,  119.5, newSDMap(17.1f, 18.7f, 20.5f, 22.6f, 25.0f, 27.7f, 30.9f));
        addEntry(res, 1,  120, newSDMap(17.3f, 18.9f, 20.7f, 22.8f, 25.2f, 28.0f, 31.2f));

        return Map.copyOf(res);
    }

    private static Map<Key, Entry> newZScoreWFHTableBoy()
    {
        Map<Key, Entry> res = new HashMap<>();

        addEntry(res, 0,  45, newSDMap(1.9f, 2f, 2.2f, 2.4f, 2.7f, 3f, 3.3f));
        addEntry(res, 0,  45.5, newSDMap(1.9f, 2.1f, 2.3f, 2.5f, 2.8f, 3.1f, 3.4f));
        addEntry(res, 0,  46, newSDMap(2f, 2.2f, 2.4f, 2.6f, 2.9f, 3.1f, 3.5f));
        addEntry(res, 0,  46.5, newSDMap(2.1f, 2.3f, 2.5f, 2.7f, 3f, 3.2f, 3.6f));
        addEntry(res, 0,  47, newSDMap(2.1f, 2.3f, 2.5f, 2.8f, 3f, 3.3f, 3.7f));
        addEntry(res, 0,  47.5, newSDMap(2.2f, 2.4f, 2.6f, 2.9f, 3.1f, 3.4f, 3.8f));
        addEntry(res, 0,  48, newSDMap(2.3f, 2.5f, 2.7f, 2.9f, 3.2f, 3.6f, 3.9f));
        addEntry(res, 0,  48.5, newSDMap(2.3f, 2.6f, 2.8f, 3f, 3.3f, 3.7f, 4f));
        addEntry(res, 0,  49, newSDMap(2.4f, 2.6f, 2.9f, 3.1f, 3.4f, 3.8f, 4.2f));
        addEntry(res, 0,  49.5, newSDMap(2.5f, 2.7f, 3f, 3.2f, 3.5f, 3.9f, 4.3f));
        addEntry(res, 0,  50, newSDMap(2.6f, 2.8f, 3f, 3.3f, 3.6f, 4f, 4.4f));
        addEntry(res, 0,  50.5, newSDMap(2.7f, 2.9f, 3.1f, 3.4f, 3.8f, 4.1f, 4.5f));
        addEntry(res, 0,  51, newSDMap(2.7f, 3f, 3.2f, 3.5f, 3.9f, 4.2f, 4.7f));
        addEntry(res, 0,  51.5, newSDMap(2.8f, 3.1f, 3.3f, 3.6f, 4f, 4.4f, 4.8f));
        addEntry(res, 0,  52, newSDMap(2.9f, 3.2f, 3.5f, 3.8f, 4.1f, 4.5f, 5f));
        addEntry(res, 0,  52.5, newSDMap(3f, 3.3f, 3.6f, 3.9f, 4.2f, 4.6f, 5.1f));
        addEntry(res, 0,  53, newSDMap(3.1f, 3.4f, 3.7f, 4f, 4.4f, 4.8f, 5.3f));
        addEntry(res, 0,  53.5, newSDMap(3.2f, 3.5f, 3.8f, 4.1f, 4.5f, 4.9f, 5.4f));
        addEntry(res, 0,  54, newSDMap(3.3f, 3.6f, 3.9f, 4.3f, 4.7f, 5.1f, 5.6f));
        addEntry(res, 0,  54.5, newSDMap(3.4f, 3.7f, 4f, 4.4f, 4.8f, 5.3f, 5.8f));
        addEntry(res, 0,  55, newSDMap(3.6f, 3.8f, 4.2f, 4.5f, 5f, 5.4f, 6f));
        addEntry(res, 0,  55.5, newSDMap(3.7f, 4f, 4.3f, 4.7f, 5.1f, 5.6f, 6.1f));
        addEntry(res, 0,  56, newSDMap(3.8f, 4.1f, 4.4f, 4.8f, 5.3f, 5.8f, 6.3f));
        addEntry(res, 0,  56.5, newSDMap(3.9f, 4.2f, 4.6f, 5f, 5.4f, 5.9f, 6.5f));
        addEntry(res, 0,  57, newSDMap(4f, 4.3f, 4.7f, 5.1f, 5.6f, 6.1f, 6.7f));
        addEntry(res, 0,  57.5, newSDMap(4.1f, 4.5f, 4.9f, 5.3f, 5.7f, 6.3f, 6.9f));
        addEntry(res, 0,  58, newSDMap(4.3f, 4.6f, 5f, 5.4f, 5.9f, 6.4f, 7.1f));
        addEntry(res, 0,  58.5, newSDMap(4.4f, 4.7f, 5.1f, 5.6f, 6.1f, 6.6f, 7.2f));
        addEntry(res, 0,  59, newSDMap(4.5f, 4.8f, 5.3f, 5.7f, 6.2f, 6.8f, 7.4f));
        addEntry(res, 0,  59.5, newSDMap(4.6f, 5f, 5.4f, 5.9f, 6.4f, 7f, 7.6f));
        addEntry(res, 0,  60, newSDMap(4.7f, 5.1f, 5.5f, 6f, 6.5f, 7.1f, 7.8f));
        addEntry(res, 0,  60.5, newSDMap(4.8f, 5.2f, 5.6f, 6.1f, 6.7f, 7.3f, 8f));
        addEntry(res, 0,  61, newSDMap(4.9f, 5.3f, 5.8f, 6.3f, 6.8f, 7.4f, 8.1f));
        addEntry(res, 0,  61.5, newSDMap(5f, 5.4f, 5.9f, 6.4f, 7f, 7.6f, 8.3f));
        addEntry(res, 0,  62, newSDMap(5.1f, 5.6f, 6f, 6.5f, 7.1f, 7.7f, 8.5f));
        addEntry(res, 0,  62.5, newSDMap(5.2f, 5.7f, 6.1f, 6.7f, 7.2f, 7.9f, 8.6f));
        addEntry(res, 0,  63, newSDMap(5.3f, 5.8f, 6.2f, 6.8f, 7.4f, 8f, 8.8f));
        addEntry(res, 0,  63.5, newSDMap(5.4f, 5.9f, 6.4f, 6.9f, 7.5f, 8.2f, 8.9f));
        addEntry(res, 0,  64, newSDMap(5.5f, 6f, 6.5f, 7f, 7.6f, 8.3f, 9.1f));
        addEntry(res, 0,  64.5, newSDMap(5.6f, 6.1f, 6.6f, 7.1f, 7.8f, 8.5f, 9.3f));
        addEntry(res, 0,  65, newSDMap(5.7f, 6.2f, 6.7f, 7.3f, 7.9f, 8.6f, 9.4f));
        addEntry(res, 0,  65.5, newSDMap(5.8f, 6.3f, 6.8f, 7.4f, 8f, 8.7f, 9.6f));
        addEntry(res, 0,  66, newSDMap(5.9f, 6.4f, 6.9f, 7.5f, 8.2f, 8.9f, 9.7f));
        addEntry(res, 0,  66.5, newSDMap(6f, 6.5f, 7f, 7.6f, 8.3f, 9f, 9.9f));
        addEntry(res, 0,  67, newSDMap(6.1f, 6.6f, 7.1f, 7.7f, 8.4f, 9.2f, 10f));
        addEntry(res, 0,  67.5, newSDMap(6.2f, 6.7f, 7.2f, 7.9f, 8.5f, 9.3f, 10.2f));
        addEntry(res, 0,  68, newSDMap(6.3f, 6.8f, 7.3f, 8f, 8.7f, 9.4f, 10.3f));
        addEntry(res, 0,  68.5, newSDMap(6.4f, 6.9f, 7.5f, 8.1f, 8.8f, 9.6f, 10.5f));
        addEntry(res, 0,  69, newSDMap(6.5f, 7f, 7.6f, 8.2f, 8.9f, 9.7f, 10.6f));
        addEntry(res, 0,  69.5, newSDMap(6.6f, 7.1f, 7.7f, 8.3f, 9f, 9.8f, 10.8f));
        addEntry(res, 0,  70, newSDMap(6.6f, 7.2f, 7.8f, 8.4f, 9.2f, 10f, 10.9f));
        addEntry(res, 0,  70.5, newSDMap(6.7f, 7.3f, 7.9f, 8.5f, 9.3f, 10.1f, 11.1f));
        addEntry(res, 0,  71, newSDMap(6.8f, 7.4f, 8f, 8.6f, 9.4f, 10.2f, 11.2f));
        addEntry(res, 0,  71.5, newSDMap(6.9f, 7.5f, 8.1f, 8.8f, 9.5f, 10.4f, 11.3f));
        addEntry(res, 0,  72, newSDMap(7f, 7.6f, 8.2f, 8.9f, 9.6f, 10.5f, 11.5f));
        addEntry(res, 0,  72.5, newSDMap(7.1f, 7.6f, 8.3f, 9f, 9.8f, 10.6f, 11.6f));
        addEntry(res, 0,  73, newSDMap(7.2f, 7.7f, 8.4f, 9.1f, 9.9f, 10.8f, 11.8f));
        addEntry(res, 0,  73.5, newSDMap(7.2f, 7.8f, 8.5f, 9.2f, 10f, 10.9f, 11.9f));
        addEntry(res, 0,  74, newSDMap(7.3f, 7.9f, 8.6f, 9.3f, 10.1f, 11f, 12.1f));
        addEntry(res, 0,  74.5, newSDMap(7.4f, 8f, 8.7f, 9.4f, 10.2f, 11.2f, 12.2f));
        addEntry(res, 0,  75, newSDMap(7.5f, 8.1f, 8.8f, 9.5f, 10.3f, 11.3f, 12.3f));
        addEntry(res, 0,  75.5, newSDMap(7.6f, 8.2f, 8.8f, 9.6f, 10.4f, 11.4f, 12.5f));
        addEntry(res, 0,  76, newSDMap(7.6f, 8.3f, 8.9f, 9.7f, 10.6f, 11.5f, 12.6f));
        addEntry(res, 0,  76.5, newSDMap(7.7f, 8.3f, 9f, 9.8f, 10.7f, 11.6f, 12.7f));
        addEntry(res, 0,  77, newSDMap(7.8f, 8.4f, 9.1f, 9.9f, 10.8f, 11.7f, 12.8f));
        addEntry(res, 0,  77.5, newSDMap(7.9f, 8.5f, 9.2f, 10f, 10.9f, 11.9f, 13f));
        addEntry(res, 0,  78, newSDMap(7.9f, 8.6f, 9.3f, 10.1f, 11f, 12f, 13.1f));
        addEntry(res, 0,  78.5, newSDMap(8f, 8.7f, 9.4f, 10.2f, 11.1f, 12.1f, 13.2f));
        addEntry(res, 0,  79, newSDMap(8.1f, 8.7f, 9.5f, 10.3f, 11.2f, 12.2f, 13.3f));
        addEntry(res, 0,  79.5, newSDMap(8.2f, 8.8f, 9.5f, 10.4f, 11.3f, 12.3f, 13.4f));
        addEntry(res, 0,  80, newSDMap(8.2f, 8.9f, 9.6f, 10.4f, 11.4f, 12.4f, 13.6f));
        addEntry(res, 0,  80.5, newSDMap(8.3f, 9f, 9.7f, 10.5f, 11.5f, 12.5f, 13.7f));
        addEntry(res, 0,  81, newSDMap(8.4f, 9.1f, 9.8f, 10.6f, 11.6f, 12.6f, 13.8f));
        addEntry(res, 0,  81.5, newSDMap(8.5f, 9.1f, 9.9f, 10.7f, 11.7f, 12.7f, 13.9f));
        addEntry(res, 0,  82, newSDMap(8.5f, 9.2f, 10f, 10.8f, 11.8f, 12.8f, 14f));
        addEntry(res, 0,  82.5, newSDMap(8.6f, 9.3f, 10.1f, 10.9f, 11.9f, 13f, 14.2f));
        addEntry(res, 0,  83, newSDMap(8.7f, 9.4f, 10.2f, 11f, 12f, 13.1f, 14.3f));
        addEntry(res, 0,  83.5, newSDMap(8.8f, 9.5f, 10.3f, 11.2f, 12.1f, 13.2f, 14.4f));
        addEntry(res, 0,  84, newSDMap(8.9f, 9.6f, 10.4f, 11.3f, 12.2f, 13.3f, 14.6f));
        addEntry(res, 0,  84.5, newSDMap(9f, 9.7f, 10.5f, 11.4f, 12.4f, 13.5f, 14.7f));
        addEntry(res, 0,  85, newSDMap(9.1f, 9.8f, 10.6f, 11.5f, 12.5f, 13.6f, 14.9f));
        addEntry(res, 0,  85.5, newSDMap(9.2f, 9.9f, 10.7f, 11.6f, 12.6f, 13.7f, 15f));
        addEntry(res, 0,  86, newSDMap(9.3f, 10f, 10.8f, 11.7f, 12.8f, 13.9f, 15.2f));
        addEntry(res, 0,  86.5, newSDMap(9.4f, 10.1f, 11f, 11.9f, 12.9f, 14f, 15.3f));
        addEntry(res, 0,  87, newSDMap(9.5f, 10.2f, 11.1f, 12f, 13f, 14.2f, 15.5f));
        addEntry(res, 0,  87.5, newSDMap(9.6f, 10.4f, 11.2f, 12.1f, 13.2f, 14.3f, 15.6f));
        addEntry(res, 0,  88, newSDMap(9.7f, 10.5f, 11.3f, 12.2f, 13.3f, 14.5f, 15.8f));
        addEntry(res, 0,  88.5, newSDMap(9.8f, 10.6f, 11.4f, 12.4f, 13.4f, 14.6f, 15.9f));
        addEntry(res, 0,  89, newSDMap(9.9f, 10.7f, 11.5f, 12.5f, 13.5f, 14.7f, 16.1f));
        addEntry(res, 0,  89.5, newSDMap(10f, 10.8f, 11.6f, 12.6f, 13.7f, 14.9f, 16.2f));
        addEntry(res, 0,  90, newSDMap(10.1f, 10.9f, 11.8f, 12.7f, 13.8f, 15f, 16.4f));
        addEntry(res, 0,  90.5, newSDMap(10.2f, 11f, 11.9f, 12.8f, 13.9f, 15.1f, 16.5f));
        addEntry(res, 0,  91, newSDMap(10.3f, 11.1f, 12f, 13f, 14.1f, 15.3f, 16.7f));
        addEntry(res, 0,  91.5, newSDMap(10.4f, 11.2f, 12.1f, 13.1f, 14.2f, 15.4f, 16.8f));
        addEntry(res, 0,  92, newSDMap(10.5f, 11.3f, 12.2f, 13.2f, 14.3f, 15.6f, 17f));
        addEntry(res, 0,  92.5, newSDMap(10.6f, 11.4f, 12.3f, 13.3f, 14.4f, 15.7f, 17.1f));
        addEntry(res, 0,  93, newSDMap(10.7f, 11.5f, 12.4f, 13.4f, 14.6f, 15.8f, 17.3f));
        addEntry(res, 0,  93.5, newSDMap(10.7f, 11.6f, 12.5f, 13.5f, 14.7f, 16f, 17.4f));
        addEntry(res, 0,  94, newSDMap(10.8f, 11.7f, 12.6f, 13.7f, 14.8f, 16.1f, 17.6f));
        addEntry(res, 0,  94.5, newSDMap(10.9f, 11.8f, 12.7f, 13.8f, 14.9f, 16.3f, 17.7f));
        addEntry(res, 0,  95, newSDMap(11f, 11.9f, 12.8f, 13.9f, 15.1f, 16.4f, 17.9f));
        addEntry(res, 0,  95.5, newSDMap(11.1f, 12f, 12.9f, 14f, 15.2f, 16.5f, 18f));
        addEntry(res, 0,  96, newSDMap(11.2f, 12.1f, 13.1f, 14.1f, 15.3f, 16.7f, 18.2f));
        addEntry(res, 0,  96.5, newSDMap(11.3f, 12.2f, 13.2f, 14.3f, 15.5f, 16.8f, 18.4f));
        addEntry(res, 0,  97, newSDMap(11.4f, 12.3f, 13.3f, 14.4f, 15.6f, 17f, 18.5f));
        addEntry(res, 0,  97.5, newSDMap(11.5f, 12.4f, 13.4f, 14.5f, 15.7f, 17.1f, 18.7f));
        addEntry(res, 0,  98, newSDMap(11.6f, 12.5f, 13.5f, 14.6f, 15.9f, 17.3f, 18.9f));
        addEntry(res, 0,  98.5, newSDMap(11.7f, 12.6f, 13.6f, 14.8f, 16f, 17.5f, 19.1f));
        addEntry(res, 0,  99, newSDMap(11.8f, 12.7f, 13.7f, 14.9f, 16.2f, 17.6f, 19.2f));
        addEntry(res, 0,  99.5, newSDMap(11.9f, 12.8f, 13.9f, 15f, 16.3f, 17.8f, 19.4f));
        addEntry(res, 0,  100, newSDMap(12f, 12.9f, 14f, 15.2f, 16.5f, 18f, 19.6f));
        addEntry(res, 0,  100.5, newSDMap(12.1f, 13f, 14.1f, 15.3f, 16.6f, 18.1f, 19.8f));
        addEntry(res, 0,  101, newSDMap(12.2f, 13.2f, 14.2f, 15.4f, 16.8f, 18.3f, 20f));
        addEntry(res, 0,  101.5, newSDMap(12.3f, 13.3f, 14.4f, 15.6f, 16.9f, 18.5f, 20.2f));
        addEntry(res, 0,  102, newSDMap(12.4f, 13.4f, 14.5f, 15.7f, 17.1f, 18.7f, 20.4f));
        addEntry(res, 0,  102.5, newSDMap(12.5f, 13.5f, 14.6f, 15.9f, 17.3f, 18.8f, 20.6f));
        addEntry(res, 0,  103, newSDMap(12.6f, 13.6f, 14.8f, 16f, 17.4f, 19f, 20.8f));
        addEntry(res, 0,  103.5, newSDMap(12.7f, 13.7f, 14.9f, 16.2f, 17.6f, 19.2f, 21f));
        addEntry(res, 0,  104, newSDMap(12.8f, 13.9f, 15f, 16.3f, 17.8f, 19.4f, 21.2f));
        addEntry(res, 0,  104.5, newSDMap(12.9f, 14f, 15.2f, 16.5f, 17.9f, 19.6f, 21.5f));
        addEntry(res, 0,  105, newSDMap(13f, 14.1f, 15.3f, 16.6f, 18.1f, 19.8f, 21.7f));
        addEntry(res, 0,  105.5, newSDMap(13.2f, 14.2f, 15.4f, 16.8f, 18.3f, 20f, 21.9f));
        addEntry(res, 0,  106, newSDMap(13.3f, 14.4f, 15.6f, 16.9f, 18.5f, 20.2f, 22.1f));
        addEntry(res, 0,  106.5, newSDMap(13.4f, 14.5f, 15.7f, 17.1f, 18.6f, 20.4f, 22.4f));
        addEntry(res, 0,  107, newSDMap(13.5f, 14.6f, 15.9f, 17.3f, 18.8f, 20.6f, 22.6f));
        addEntry(res, 0,  107.5, newSDMap(13.6f, 14.7f, 16f, 17.4f, 19f, 20.8f, 22.8f));
        addEntry(res, 0,  108, newSDMap(13.7f, 14.9f, 16.2f, 17.6f, 19.2f, 21f, 23.1f));
        addEntry(res, 0,  108.5, newSDMap(13.8f, 15f, 16.3f, 17.8f, 19.4f, 21.2f, 23.3f));
        addEntry(res, 0,  109, newSDMap(14f, 15.1f, 16.5f, 17.9f, 19.6f, 21.4f, 23.6f));
        addEntry(res, 0,  109.5, newSDMap(14.1f, 15.3f, 16.6f, 18.1f, 19.8f, 21.7f, 23.8f));
        addEntry(res, 0,  110, newSDMap(14.2f, 15.4f, 16.8f, 18.3f, 20f, 21.9f, 24.1f));
        addEntry(res, 0,  110.5, newSDMap(14.5f, 15.8f, 17.1f, 18.7f, 20.4f, 22.4f, 24.7f));
        addEntry(res, 0,  111, newSDMap(14.6f, 15.9f, 17.3f, 18.9f, 20.7f, 22.7f, 25.0f));
        addEntry(res, 0,  111.5, newSDMap(14.8f, 16.0f, 17.5f, 19.1f, 20.9f, 22.9f, 25.2f));
        addEntry(res, 0,  112, newSDMap(14.9f, 16.2f, 17.6f, 19.2f, 21.1f, 23.1f, 25.5f));
        addEntry(res, 0,  112.5, newSDMap(15.0f, 16.3f, 17.8f, 19.4f, 21.3f, 23.4f, 25.8f));
        addEntry(res, 0,  113, newSDMap(15.2f, 16.5f, 18.0f, 19.6f, 21.5f, 23.6f, 26.0f));
        addEntry(res, 0,  113.5, newSDMap(15.3f, 16.6f, 18.1f, 19.8f, 21.7f, 23.9f, 26.3f));
        addEntry(res, 0,  114, newSDMap(15.4f, 16.8f, 18.3f, 20.0f, 21.9f, 24.1f, 26.6f));
        addEntry(res, 0,  114.5, newSDMap(15.6f, 16.9f, 18.5f, 20.2f, 22.1f, 24.4f, 26.9f));
        addEntry(res, 0,  115, newSDMap(15.7f, 17.1f, 18.6f, 20.4f, 22.4f, 24.6f, 27.2f));
        addEntry(res, 0,  115.5, newSDMap(15.8f, 17.2f, 18.8f, 20.6f, 22.6f, 24.9f, 27.5f));
        addEntry(res, 0,  116, newSDMap(16.0f, 17.4f, 19.0f, 20.8f, 22.8f, 25.1f, 27.8f));
        addEntry(res, 0,  116.5, newSDMap(16.1f, 17.5f, 19.2f, 21.0f, 23.0f, 25.4f, 28.0f));
        addEntry(res, 0,  117, newSDMap(16.2f, 17.7f, 19.3f, 21.2f, 23.3f, 25.6f, 28.3f));
        addEntry(res, 0,  117.5, newSDMap(16.4f, 17.9f, 19.5f, 21.4f, 23.5f, 25.9f, 28.6f));
        addEntry(res, 0,  118, newSDMap(16.5f, 18.0f, 19.7f, 21.6f, 23.7f, 26.1f, 28.9f));
        addEntry(res, 0,  118.5, newSDMap(16.7f, 18.2f, 19.9f, 21.8f, 23.9f, 26.4f, 29.2f));
        addEntry(res, 0,  119, newSDMap(16.8f, 18.3f, 20.0f, 22.0f, 24.1f, 26.6f, 29.5f));
        addEntry(res, 0,  119.5, newSDMap(16.9f, 18.5f, 20.2f, 22.2f, 24.4f, 26.9f, 29.8f));
        addEntry(res, 0,  120, newSDMap(17.1f, 18.6f, 20.4f, 22.4f, 24.6f, 27.2f, 30.1f));

        return Map.copyOf(res);
    }

    private static void addEntry(Map<Key, Entry> res, int gender, double parameter, Entry sdMap) {
        res.put( new Key( gender, (float) parameter), sdMap);
    }

    private static Entry newSDMap(float sd3neg, float sd2neg, float sd1neg, float sd0, float sd1, float sd2, float sd3 )
    {
        Map<Float, Integer> sdMap = Map.of(
                sd3neg, 3,
                sd2neg, 2,
                sd1neg, 1,
                sd0, 0,
                sd1, 1,
                sd2, 2,
                sd3, 3);
        List<Float> list = new ArrayList<>( sdMap.keySet() );
        Collections.sort( list );
        return new Entry( sdMap, Collections.min(list), Collections.max(list), List.copyOf(list));
    }
}
