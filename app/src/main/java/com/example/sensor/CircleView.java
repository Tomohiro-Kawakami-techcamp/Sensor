package com.example.sensor;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;

public class CircleView extends View {

    private static final int DIAMETER = 200;
    private static final int OFFSET_X = 0;
    private static final int OFFSET_Y = 100;

    private ShapeDrawable ball;

    private int ball_X;
    private int ball_Y;

    private int width;
    private int height;

    public CircleView(Context context) {
        super(context);

        ball = new ShapeDrawable(new OvalShape());
        ball.getPaint().setColor(Color.RED);

        ball_X = 200;
        ball_Y = 200;
    }
}
