package androidx.appcompat.widget;

import X.AnonymousClass08P;
import X.AnonymousClass0D4;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.obwhatsapp.R;

public class AppCompatSeekBar extends SeekBar {
    public final AnonymousClass0D4 A00;

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.attr0442);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        AnonymousClass08P.A03(getContext(), this);
        AnonymousClass0D4 r0 = new AnonymousClass0D4(this);
        this.A00 = r0;
        r0.A01(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        AnonymousClass0D4 r1 = this.A00;
        Drawable drawable = r1.A02;
        if (drawable != null && drawable.isStateful()) {
            SeekBar seekBar = r1.A05;
            if (drawable.setState(seekBar.getDrawableState())) {
                seekBar.invalidateDrawable(drawable);
            }
        }
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.A00.A02;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AnonymousClass0D4 r5 = this.A00;
        if (r5.A02 != null) {
            SeekBar seekBar = r5.A05;
            int max = seekBar.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = r5.A02.getIntrinsicWidth();
                int intrinsicHeight = r5.A02.getIntrinsicHeight();
                int i3 = 1;
                if (intrinsicWidth >= 0) {
                    i3 = intrinsicWidth >> 1;
                }
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight >> 1;
                }
                r5.A02.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) seekBar.getPaddingLeft(), (float) (seekBar.getHeight() >> 1));
                int i4 = 0;
                do {
                    r5.A02.draw(canvas);
                    canvas.translate(width, 0.0f);
                    i4++;
                } while (i4 <= max);
                canvas.restoreToCount(save);
            }
        }
    }
}
