package com.company.MultiAdapterMultiAdaptee;

/**
 * Created by phompang on 11/26/2016 AD.
 */
public class LegacyLine {
    public double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));
    }
}
