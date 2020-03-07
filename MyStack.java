﻿

public class MyStack {
    // 使用一个数组来表示栈
    // 先不考虑扩容
    private int[] array = new int[100];
    private int size = 0;

    // 核心操作就只有三个
    // 1. 入栈
    public void push(int x) {
        array[size] = x;
        size++;
    }

    // 2. 出栈, 出栈的这个元素的值
    public Integer pop() {
        if (size == 0) {
            return null;
        }
        int ret = array[size - 1];
        size--;
        return ret;
    }

    // 3. 取栈顶元素
    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return array[size - 1];
    }

    // 4. 判定栈为空
    public boolean isEmpty() {
        return size == 0;
    }

    // 5. 栈的大小
    public int size() {
        return size;
    }
}
