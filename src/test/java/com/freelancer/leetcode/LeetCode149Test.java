package com.freelancer.leetcode;

import com.freelancer.leetcode.support.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Soyee on 2016/7/27.
 */
public class LeetCode149Test {

    @Test
    public void testEmptyMaxPoints() {
        LeetCode149 leetCode149 = new LeetCode149();
        Assert.assertEquals(0, leetCode149.maxPoints(null));
        Assert.assertEquals(0, leetCode149.maxPoints(new Point[0]));
    }

    @Test
    public void testMaxPointsLt2() {
        LeetCode149 leetCode149 = new LeetCode149();
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Assert.assertEquals(1, leetCode149.maxPoints(new Point[]{ point1 }));
        Assert.assertEquals(2, leetCode149.maxPoints(new Point[]{ point1, point2}));
    }

    @Test
    public void testMaxPointsByZero() {
        LeetCode149 leetCode149 = new LeetCode149();
        Point point1 = new Point(1, 1);
        Point point2 = new Point(1, 1);
        Point point3 = new Point(2, 2);
        Point point4 = new Point(2, 2);
        Assert.assertEquals(4, leetCode149.maxPoints(new Point[]{ point1, point2, point3, point4}));
    }

    @Test
    public void testMaxPointsGt2() {
        LeetCode149 leetCode149 = new LeetCode149();
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);
        Point point4 = new Point(8, 9);
        Assert.assertEquals(4, leetCode149.maxPoints(new Point[]{ point1, point2, point3, point4}));
    }

    @Test
    public void testMaxPoints() {
        LeetCode149 leetCode149 = new LeetCode149();
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);
        Point point4 = new Point(8, 9);
        Point point5 = new Point(10, 12);
        Point point6 = new Point(12, 15);
        Point point7 = new Point(14, 18);
        Point point8 = new Point(16, 21);
        Assert.assertEquals(5, leetCode149.maxPoints(new Point[]{ point1, point2, point3, point4, point5, point6, point7, point8}));
    }

    @Test
    public void testMaxPointsWA1() {
        LeetCode149 leetCode149 = new LeetCode149();
        Point point1 = new Point(-4, -4);
        Point point2 = new Point(-8, -582);
        Point point3 = new Point(-3, 3);
        Point point4 = new Point(-9, -651);
        Point point5 = new Point(9, 591);
        Assert.assertEquals(3, leetCode149.maxPoints(new Point[]{ point1, point2, point3, point4, point5}));
    }

    @Test
    public void testMaxPointsWA2SuperLong() {
        LeetCode149 leetCode149 = new LeetCode149();
        Point[] pa = constructPA();
        Assert.assertEquals(24, leetCode149.maxPoints(pa));
    }

    private Point[] constructPA() {
        int[][] rawdata = new int[][] {{40,-23},{9,138},{429,115},{50,-17},{-3,80},{-10,33},{5,-21},{-3,80},{-6,-65},{-18,26},{-6,-65},{5,72},{0,77},{-9,86},{10,-2},{-8,85},{21,130},{18,-6},{-18,26},{-1,-15},{10,-2},{8,69},{-4,63},{0,3},{-4,40},{-7,84},{-8,7},{30,154},{16,-5},{6,90},{18,-6},{5,77},{-4,77},{7,-13},{-1,-45},{16,-5},{-9,86},{-16,11},{-7,84},{1,76},{3,77},{10,67},{1,-37},{-10,-81},{4,-11},{-20,13},{-10,77},{6,-17},{-27,2},{-10,-81},{10,-1},{-9,1},{-8,43},{2,2},{2,-21},{3,82},{8,-1},{10,-1},{-9,1},{-12,42},{16,-5},{-5,-61},{20,-7},{9,-35},{10,6},{12,106},{5,-21},{-5,82},{6,71},{-15,34},{-10,87},{-14,-12},{12,106},{-5,82},{-46,-45},{-4,63},{16,-5},{4,1},{-3,-53},{0,-17},{9,98},{-18,26},{-9,86},{2,77},{-2,-49},{1,76},{-3,-38},{-8,7},{-17,-37},{5,72},{10,-37},{-4,-57},{-3,-53},{3,74},{-3,-11},{-8,7},{1,88},{-12,42},{1,-37},{2,77},{-6,77},{5,72},{-4,-57},{-18,-33},{-12,42},{-9,86},{2,77},{-8,77},{-3,77},{9,-42},{16,41},{-29,-37},{0,-41},{-21,18},{-27,-34},{0,77},{3,74},{-7,-69},{-21,18},{27,146},{-20,13},{21,130},{-6,-65},{14,-4},{0,3},{9,-5},{6,-29},{-2,73},{-1,-15},{1,76},{-4,77},{6,-29}};
        List<Point> pl = new ArrayList<>();
        for(int[] each : rawdata) {
            pl.add(new Point(each[0], each[1]));
        }
        return pl.toArray(new Point[pl.size()]);
    }

}
