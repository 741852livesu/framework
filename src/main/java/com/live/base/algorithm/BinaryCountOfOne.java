package com.live.base.algorithm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @ClassName BinaryCount1
 * @Description 统计二级制中一的个数
 * @Author sulh
 * @Date 2020/7/6 14:22
 * @ModifyDate 2020/7/6 14:22
 * @Version 1.0
 */
public class BinaryCountOfOne {

    /**
     * @description:逐位判断 向右位移
     * 时间复杂度：O(log n)  n代表 最高位 1 的所在位数
     * 空间复杂度: O(1)
     * @author: sulh
     * @date: 2020/7/6 14:25
     * @param: nums
     * @return: int
     */
    public static int positionMove(int n) {
        int result = 0;
        while (n > 0) {
            result += n & 1;
            n = n >>> 1;//java中无符号位移
        }
        return result;
    }

    /**
     * @description: 巧用n &= n - 1 消除N最右边的1
     * @author:  sulh
     * @date: 2020/7/6 14:45
     * @param: null
     * @return:
     */
    public static int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res++;
            n &= n - 1;//
        }
        return res;
    }


}