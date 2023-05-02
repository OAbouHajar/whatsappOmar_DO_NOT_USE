package com.mod.bomfab.colorpicker;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class AlphaPatternDrawable extends Drawable {
    private Bitmap mBitmap;
    private Paint mPaint = new Paint();
    private Paint mPaintGray = new Paint();
    private Paint mPaintWhite = new Paint();
    private int mRectangleSize = 10;
    private int numRectanglesHorizontal;
    private int numRectanglesVertical;

    public AlphaPatternDrawable(int i2) {
        this.mRectangleSize = i2;
        this.mPaintWhite.setColor(-1);
        this.mPaintGray.setColor(-3421237);
    }

    private void generatePatternBitmap() {
        if (getBounds().width() > 0 && getBounds().height() > 0) {
            this.mBitmap = Bitmap.createBitmap(getBounds().width(), getBounds().height(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.mBitmap);
            Rect rect = new Rect();
            boolean z2 = true;
            for (int i2 = 0; i2 <= this.numRectanglesVertical; i2++) {
                boolean z3 = z2;
                for (int i3 = 0; i3 <= this.numRectanglesHorizontal; i3++) {
                    rect.top = this.mRectangleSize * i2;
                    rect.left = this.mRectangleSize * i3;
                    rect.bottom = rect.top + this.mRectangleSize;
                    rect.right = rect.left + this.mRectangleSize;
                    canvas.drawRect(rect, z3 ? this.mPaintWhite : this.mPaintGray);
                    z3 = !z3;
                }
                z2 = !z2;
            }
        }
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawBitmap(this.mBitmap, (Rect) null, getBounds(), this.mPaint);
    }

    @Override
    public int getOpacity() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int height = rect.height();
        this.numRectanglesHorizontal = (int) Math.ceil((double) (rect.width() / this.mRectangleSize));
        this.numRectanglesVertical = (int) Math.ceil((double) (height / this.mRectangleSize));
        generatePatternBitmap();
    }

    @Override
    public void setAlpha(int i2) {
        throw new UnsupportedOperationException("Alpha is not supported by this drawwable.");
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException("ColorFilter is not supported by this drawwable.");
    }
}
