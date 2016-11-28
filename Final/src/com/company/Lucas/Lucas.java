package com.company.Lucas;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by phompang on 11/28/2016 AD.
 */
public class Lucas {
    public int getLucas(final int n) {
        Map<Integer, Integer> lucasMap = new HashMap<>();
        lucasMap.put(0, 2);
        lucasMap.put(1, 1);
        for (int i=2; i<=n; i++) {
            lucasMap.put(i, lucasMap.get(i-1) + lucasMap.get(i-2));
        }
        return lucasMap.get(n);
    }

    public int getLucusRec(final int n) {
//        if (n == 0) {
//            return 2;
//        } else if (n == 1) {
//            return 1;
//        }
//        return getLucusRec(n-1) + getLucusRec(n-2);
        return n == 1 ? 1: n == 0 ? 2 : getLucusRec(n-1) + getLucusRec(n-2);
    }
}
