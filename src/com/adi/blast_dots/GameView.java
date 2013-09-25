package com.adi.blast_dots;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.Log;
import android.view.View;

public class GameView extends View {

	Paint dotsPaint;
	
	int width = 420;
	int height = 800;
	int gap = 30;
	int dotRadius = 10;
	
	
	public GameView(Context context) {
		super(context);
		
		/* Set Backgorund color */
		this.setBackgroundColor(Color.GRAY);
		
		/* Set dots paint color  */
		dotsPaint = new Paint();
		dotsPaint.setColor(Color.RED);
		dotsPaint.setStyle(Style.FILL);
		
		
		
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		// TODO Auto-generated method stub
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
		
		/* get Width Height */
		width = this.getWidth();
		height = this.getHeight();
		
		gap = width / 5;
		dotRadius = gap / 5;
		
		invalidate();
		
	}
	
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		canvas.translate(gap/2, gap/2);
		
		
		for (int row = 0; row < 6; row++)
			for (int col = 0; col < 5; col++)
			{
				canvas.drawText(Integer.toString(row), col*gap, row*gap, dotsPaint);

				canvas.drawCircle( col*gap, row*gap, dotRadius, dotsPaint);
			}
		
		
		
	}
	
	
}
