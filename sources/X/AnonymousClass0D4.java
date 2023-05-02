package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: X.0D4  reason: invalid class name */
public class AnonymousClass0D4 extends C06160Un {
    public ColorStateList A00 = null;
    public PorterDuff.Mode A01 = null;
    public Drawable A02;
    public boolean A03 = false;
    public boolean A04 = false;
    public final SeekBar A05;

    public AnonymousClass0D4(SeekBar seekBar) {
        super(seekBar);
        this.A05 = seekBar;
    }

    public void A01(AttributeSet attributeSet, int i2) {
        super.A01(attributeSet, i2);
        SeekBar seekBar = this.A05;
        Context context = seekBar.getContext();
        int[] iArr = AnonymousClass05L.A06;
        AnonymousClass07T A002 = AnonymousClass07T.A00(context, attributeSet, iArr, i2, 0);
        Context context2 = seekBar.getContext();
        TypedArray typedArray = A002.A02;
        C004601z.A0N(context2, typedArray, attributeSet, seekBar, iArr, i2);
        Drawable A032 = A002.A03(0);
        if (A032 != null) {
            seekBar.setThumb(A032);
        }
        Drawable A022 = A002.A02(1);
        Drawable drawable = this.A02;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.A02 = A022;
        if (A022 != null) {
            A022.setCallback(seekBar);
            C018208n.A0D(C004601z.A06(seekBar), A022);
            if (A022.isStateful()) {
                A022.setState(seekBar.getDrawableState());
            }
            A02();
        }
        seekBar.invalidate();
        if (typedArray.hasValue(3)) {
            this.A01 = C015307j.A00(this.A01, typedArray.getInt(3, -1));
            this.A04 = true;
        }
        if (typedArray.hasValue(2)) {
            this.A00 = A002.A01(2);
            this.A03 = true;
        }
        A002.A04();
        A02();
    }

    public final void A02() {
        Drawable drawable = this.A02;
        if (drawable == null) {
            return;
        }
        if (this.A03 || this.A04) {
            Drawable A032 = C018208n.A03(drawable.mutate());
            this.A02 = A032;
            if (this.A03) {
                C018208n.A04(this.A00, A032);
            }
            if (this.A04) {
                C018208n.A07(this.A01, this.A02);
            }
            if (this.A02.isStateful()) {
                this.A02.setState(this.A05.getDrawableState());
            }
        }
    }
}
