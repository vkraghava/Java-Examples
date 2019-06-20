package me.example.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmazonTest {

    List<List<Integer>> optimalUtilization(int maxTravelDist,
                                           List<List<Integer>> forwardRouteList,
                                           List<List<Integer>> returnRouteList)
    {
        // WRITE YOUR CODE HERE

        Map<Integer, Integer> forwardRouteMap = new HashMap<>();
        Map<Integer, Integer> returnRouteMap = new HashMap<>();

        for(List<Integer> forwardRoute: forwardRouteList) {

            forwardRouteMap.put(forwardRoute.get(0), forwardRoute.get(1));
        }
        for(List<Integer> returnRoute: returnRouteList) {

            returnRouteMap.put(returnRoute.get(0), returnRoute.get(1));
        }
        List<List<Integer>> finalResult = new ArrayList<>();

        for(Integer forwardIndex : forwardRouteMap.keySet()) {
            List<Integer> indexes = null;
            for (Integer returnIndex : returnRouteMap.keySet()) {
                if(forwardRouteMap.get(forwardIndex) + returnRouteMap.get(returnIndex) == maxTravelDist) {
                    indexes = new ArrayList<Integer>();
                    indexes.add(forwardIndex);
                    indexes.add(returnIndex);
                }
            }

            finalResult.add(indexes);
        }

        return finalResult;
    }
}
