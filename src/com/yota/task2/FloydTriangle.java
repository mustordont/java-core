package com.yota.task2;

enum ERow {
    FIRST(5),
    SECOND(10),
    THIRD(100);

    private final int code;

    ERow(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

public class FloydTriangle {
    public static void main(String[] args) {
        ERow[] rows = ERow.values();
        for (ERow row: rows) {
            switch (row) {
                case FIRST:
                case SECOND:
                    triangle(row.getCode());
                    break;
                default:
                    continue;
            }
            System.out.println();
        }

    }

    static void triangle(int rows) {
        int counter = 0;
        for (int row = 1; row <= rows; row++) {
            StringBuilder rowResult = new StringBuilder();
            for (int index = 0; index < row; index++) {
                rowResult.append(++counter).append(' ');
            }
            System.out.println(rowResult.toString());
        }
    }
}
