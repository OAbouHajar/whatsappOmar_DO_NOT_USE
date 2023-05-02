package com.mod.bomfab.colorpicker;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;

public class PaintBuilder {

    public static class PaintHolder {
        private Paint paint = new Paint(1);

        PaintHolder() {
        }

        public PaintHolder antiAlias(boolean z2) {
            this.paint.setAntiAlias(z2);
            return this;
        }

        public Paint build() {
            return this.paint;
        }

        public PaintHolder color(int i2) {
            this.paint.setColor(i2);
            return this;
        }

        public PaintHolder mode(PorterDuff.Mode mode) {
            this.paint.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }

        public PaintHolder shader(Shader shader) {
            this.paint.setShader(shader);
            return this;
        }

        public PaintHolder stroke(float f2) {
            this.paint.setStrokeWidth(f2);
            return this;
        }

        public PaintHolder style(Paint.Style style) {
            this.paint.setStyle(style);
            return this;
        }

        public PaintHolder xPerMode(PorterDuff.Mode mode) {
            this.paint.setXfermode(new PorterDuffXfermode(mode));
            return this;
        }
    }

    private static Bitmap createAlphaBackgroundPattern(int i2) {
        Paint build = newPaint().build();
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        int round = Math.round(((float) i2) / 2.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            for (int i4 = 0; i4 < 2; i4++) {
                if ((i3 + i4) % 2 == 0) {
                    build.setColor(-1);
                } else {
                    build.setColor(-3092272);
                }
                canvas.drawRect((float) (i3 * round), (float) (i4 * round), (float) ((i3 + 1) * round), (float) ((i4 + 1) * round), build);
            }
        }
        return createBitmap;
    }

    public static Shader createAlphaPatternShader(int i2) {
        return new BitmapShader(createAlphaBackgroundPattern(Math.max(8, (i2 / 2) * 2)), Shader.TileMode.REPEAT, Shader.TileMode.REPEAT);
    }

    public static PaintHolder newPaint() {
        return new PaintHolder();
    }
}
