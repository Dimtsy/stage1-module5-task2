package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (t) -> {
            List<Integer> list = new ArrayList<>();
            for (Integer value : t) {
                list.add(value / divider);
            }
            return list;
        };
    }
}
