package X;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.TextureView;

/* renamed from: X.3Mi  reason: invalid class name and case insensitive filesystem */
public class C63993Mi extends TextureView implements AnonymousClass006 {
    public int A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;

    public C63993Mi(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.A03) {
            setTransform((Matrix) null);
        } else {
            int i6 = this.A00;
            if (i6 == 90 || i6 == 270) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Matrix matrix = new Matrix();
                float f2 = (float) i6;
                float f3 = (float) measuredWidth;
                float f4 = f3 / 2.0f;
                float f5 = (float) measuredHeight;
                float f6 = f5 / 2.0f;
                matrix.postRotate(f2, f4, f6);
                matrix.postScale(f3 / f5, f5 / f3, f4, f6);
                setTransform(matrix);
            }
        }
        this.A03 = false;
        super.onLayout(z2, i2, i3, i4, i5);
    }

    public void setRotationAngle(int i2) {
        if (this.A00 != i2) {
            this.A00 = i2;
            if (!(i2 == 90 || i2 == 270)) {
                this.A00 = 0;
                this.A03 = true;
            }
            requestLayout();
        }
    }
}
