package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.0CY  reason: invalid class name */
public class AnonymousClass0CY extends PopupWindow {
    public static final boolean A01;
    public boolean A00;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 21) {
            z2 = true;
        }
        A01 = z2;
    }

    public AnonymousClass0CY(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        AnonymousClass07T A002 = AnonymousClass07T.A00(context, attributeSet, AnonymousClass05L.A0H, i2, i3);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(2)) {
            boolean z2 = typedArray.getBoolean(2, false);
            if (A01) {
                this.A00 = z2;
            } else {
                AnonymousClass0Vw.A02(this, z2);
            }
        }
        setBackgroundDrawable(A002.A02(0));
        A002.A04();
    }

    public void showAsDropDown(View view, int i2, int i3) {
        if (A01 && this.A00) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3);
    }

    public void showAsDropDown(View view, int i2, int i3, int i4) {
        if (A01 && this.A00) {
            i3 -= view.getHeight();
        }
        super.showAsDropDown(view, i2, i3, i4);
    }

    public void update(View view, int i2, int i3, int i4, int i5) {
        if (A01 && this.A00) {
            i3 -= view.getHeight();
        }
        super.update(view, i2, i3, i4, i5);
    }
}
