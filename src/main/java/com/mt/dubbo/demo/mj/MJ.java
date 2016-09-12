package com.mt.dubbo.demo.mj;

import java.util.Arrays;

public class MJ {
    private final static String[] mahjong = { "1T", "2T", "3T", "4T", "5T", "6T", "7T", "8T", "9T", "1S", "2S", "3S",
            "4S", "5S", "6S", "7S", "8S", "9S", "1W", "2W", "3W", "4W", "5W", "6W", "7W", "8W", "9W", "DONG", "NAN",
            "XI", "BEI", "ZHONG", "FA", "BAI" };

    public static void main(String[] args) {
        String[] shoupai = { "1T", "1T", "1T", "9T", "9T", "9T", "2T", "3T", "4T", "5T", "6T", "7T", "8T", "" };
        int[] c = new int[36];
        int[] cc = new int[36];

        int shunzi = 0;

        StringBuilder tingpai = new StringBuilder();

        for (int p = 0; p < mahjong.length; p++) {
            System.out.println("=====");
            System.out.println("=====" + mahjong[p]);
            boolean win = false;
            shoupai[13] = mahjong[p];
            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < 34; j++) {
                    if (mahjong[j].equals(shoupai[i])) {
                        int position = j;
                        cc[j]++;
                        break;
                    }
                }
            }

            for (int k = 0; k < c.length; k++) {
                if (win)
                    break;
                shunzi = 0;
                c = java.util.Arrays.copyOf(cc, 36);
                if (c[k] > 2) {
                    c[k] = c[k] - 2;
                    System.out.println("对子===>" + mahjong[k]);
                } else {
                    continue;
                }
                for (int i = 0; i <= 3; i++) {
                    int start = i * 8 + 1;
                    int end = (i + 1) * 8;
                    for (int j = start; j < end; j++) {
                        int result = 0;
                        if (c[j - 1] != 0) {
                            if (c[j - 1] >= 3) {
                                shunzi++;
                                c[j - 1] = c[j - 1] - 3;
                                System.out.println("暗刻==>" + mahjong[j - 1]);
                                continue;
                            }
                            if (--c[j - 1] >= 0 && --c[j] >= 0 && --c[j + 1] >= 0 && ((j + 1) <= (end - 1))) {
                                System.out.println(
                                        "顺子===>" + mahjong[j - 1] + "===" + mahjong[j] + "===>" + mahjong[j + 1]);
                                shunzi++;
                            } else {
                                result = 1;
                                c[j]++;
                                c[j + 1]++;
                                c[j + 2]++;
                                break;
                            }
                        }
                        /*
                         * if (result == 1) { System.out.println("not ready "); break; } else { }
                         */
                    }
                }
                if (shunzi == 4) {
                    System.out.println("win=====》");
                    tingpai.append(shoupai[13]).append(",");
                    System.out.println("听牌===>" + shoupai[13]);
                    win = true;
                    break;
                } else {
                    c[k] = c[k] + 2;
                }
                System.out.println("===============分割线================");
            }
            Arrays.fill(cc, 0);
        }
        System.out.println("听牌==>" + tingpai);
    }
}
