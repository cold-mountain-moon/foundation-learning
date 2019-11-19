package com.fly.learn.algorithm.devideandconquer;

/**
 * 分治算法之: 汉诺塔问题
 */
public class HanoTower {

    public static void main(String[] args) {
        hanoTowerProcess(4, 'A', 'B', 'C');

    }

    /**
     * 汉诺塔的移动过程， 表示有 towerNumber 个塔，从 a 移动到 c, 中间需要用到 b
     * 思路：利用分治思想，将塔总是可以分成 上面的n-1个  和 下面的1个
     * @param towerNumber 汉诺塔的数量
     * @param a 柱子A
     * @param b 柱子B
     * @param c 柱子C
     */
    public static void hanoTowerProcess(int towerNumber, char a, char b, char c) {
        if(towerNumber == 1) {
            System.out.println("从 " + a + " -> " + c);
        } else if(towerNumber >= 2) {
            // 总是把塔的数量分成下面的一个 和 上面的所有，
            // 1. 先将上面的 towerNumber - 1 个移动到 b, 中间用到 c
            hanoTowerProcess(towerNumber - 1, a, c, b);
            // 2. 再将最下面的直接移动到 C
            System.out.println("从 " + a + " -> " + c);
            // 3. 最后将上面的 towerNumber - 1 个从 b 移动到 c, 中间用到 a
            hanoTowerProcess(towerNumber - 1, b, a, c);

        }
    }
}
