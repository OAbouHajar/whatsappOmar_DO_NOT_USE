package X;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Vibrator;
import android.view.ViewGroup;
import com.obwhatsapp.R;

/* renamed from: X.3un  reason: invalid class name and case insensitive filesystem */
public class C76853un extends C615539j {
    public final int A00;
    public final Path A01;

    public C76853un(RectF rectF, Handler handler, Vibrator vibrator, ViewGroup viewGroup, int i2) {
        super(rectF, handler, vibrator, viewGroup);
        float f2;
        float centerY;
        float f3;
        float centerY2;
        this.A00 = i2;
        RectF rectF2 = this.A03;
        if (i2 != 1) {
            f2 = rectF2.centerX();
            centerY = rectF2.top;
            f3 = rectF2.centerX();
            centerY2 = rectF2.bottom;
        } else {
            f2 = rectF2.left;
            centerY = rectF2.centerY();
            f3 = rectF2.right;
            centerY2 = rectF2.centerY();
        }
        Path path = new Path();
        path.rewind();
        path.moveTo(f2, centerY);
        path.lineTo(f3, centerY2);
        this.A01 = path;
    }

    public int A00() {
        return R.color.color0745;
    }

    public int A01() {
        return this.A00;
    }

    public Path A02() {
        return this.A01;
    }
}
