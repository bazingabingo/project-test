package com.bazinga.test.algo;

/**
 * @author wangquan2564
 * @date 2021/2/19 17:00
 * @Description 与钱相关的算法问题
 */
public class MoneyTest {

    public static void main(String[] args) {
        // constitute100Money1();
        //constitute100Money2();
        System.out.println(Long.MAX_VALUE);
    }

    /** 假设有任意多张面额为 2 元、3 元、7 元的货币，现要用它们凑出 100 元，求总共有多少种可能性 */
    private static void constitute100Money1() {
        //思路一：时间复杂度 O(n^3)
        int size = 0 ;
        for (int i = 0; i <= 100/2; i++) {
            for (int j = 0; j <= 100/3; j++) {
                for (int k = 0; k <= 100/7 ; k++) {
                    if (2*i + 3*j + 7*k == 100) {
                        size++;
                        System.out.println("第" + size + "种组合：" + "2*" + i + " + 3*" + j + " + 7*" + k + " = 100");
                    }
                }
            }
        }
    }

    /** 假设有任意多张面额为 2 元、3 元、7 元的货币，现要用它们凑出 100 元，求总共有多少种可能性 */
    private static void constitute100Money2() {
        // 优化思路：减少时间复杂度为 O(n^2),当第二次for循环时，判断3和7能否凑齐剩余额度
        int size = 0 ;
        for (int i = 0; i <= 100/2; i++) {
            for (int j = 0; j <= 100/3; j++) {
                if ((100 - 2*i - 3*j >= 0) && ((100 - 2*i - 3*j) % 7 == 0)) {
                    size++;
                    System.out.println("第" + size + "种组合：" + "2*" + i + " + 3*" + j + " + 7*" + ((100 - 2*i - 3*j) / 7) + " = 100");
                }
            }
        }
    }

}
