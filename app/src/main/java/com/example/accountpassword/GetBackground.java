package com.example.accountpassword;

public class GetBackground {

    private static int[] Img = new int[]{
            R.drawable.bg_0,
            R.drawable.bg_1,
            R.drawable.bg_2,
            R.drawable.bg_3,
            R.drawable.bg_4,
            R.drawable.bg_5,
            R.drawable.bg_6,
            R.drawable.bg_7,
            R.drawable.bg_8,
            R.drawable.bg_9,
            R.drawable.bg_10,
            R.drawable.bg_11,
            R.drawable.bg_12,
    };

    public static int getImg(int x){
        return Img[x%Img.length];
    }

}
