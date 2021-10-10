package ipn.cecyt9.graficos;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.opengl.Matrix;
import android.view.View;

public class DrawView extends View {
    Paint paint = new Paint();

    public DrawView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas) {
        //.drawRect(left, top, right, bottom, paint)
        paint.setColor(Color.BLUE);
        canvas.drawRect(30, 30, 80, 80, paint);
        paint.setColor(Color.MAGENTA);
        canvas.drawRect(33, 60, 77, 77, paint);
        paint.setColor(Color.YELLOW);
        canvas.drawRect(33, 33, 77, 60, paint);

        //.drawRectangle
        paint.setColor(Color.DKGRAY);
        canvas.drawRect(120, 180,30,220,paint);

        //.drawCircle(cx, cy, radius, paint);
        paint.setColor(Color.BLUE);
        canvas.drawCircle(100, 100, 20, paint);

        //.drawOval
        paint.setColor(Color.CYAN);
        canvas.drawOval(120, 130,30,170,paint);

        //.drawText(text, x, y, paint)
        canvas.drawText("Texto con CANVAS", 200, 30, paint);

        //.drawLine(startX, startY, stopX, stopY, paint)
        paint.setColor(Color.RED);
        canvas.drawLine(0, 0, 350, 100, paint);


        Path trazo = new Path();
        trazo.addCircle(150, 450, 100, Path.Direction.CCW);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(8);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(trazo, paint);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(20);
        paint.setTypeface(Typeface.SANS_SERIF);
        canvas.drawTextOnPath("Cecyt 9 \"Juan de Dios Bátiz\" graficos en Android ", trazo, 150, 40, paint);
    }
}
