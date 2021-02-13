package com.example.sensor;

import android.content.Context;
import android.graphics.Canvas;
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

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        width = canvas.getWidth() - OFFSET_X;
        height = canvas.getHeight() - OFFSET_Y;

        if(ball_X < 0){
            ball_X = 0;
        }
        if((width - DIAMETER) < ball_X){
            ball_X = width - DIAMETER;
        }
        if(ball_Y < 0){
            ball_Y = 0;
        }
        if((height - DIAMETER) < ball_Y){
            ball_Y = height - DIAMETER;
        }
        
        ball.setBounds(ball_X, ball_Y,ball_X + DIAMETER, ball_Y + DIAMETER);
        ball.draw(canvas);
    }
}
