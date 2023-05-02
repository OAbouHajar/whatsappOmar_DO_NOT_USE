package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.redex.IDxFListenerShape2S0200000_I1;
import com.obwhatsapp.R;

/* renamed from: X.0D3  reason: invalid class name */
public class AnonymousClass0D3 extends C006002o implements C12960lF {
    public final /* synthetic */ AnonymousClass0ZV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0D3(Context context, AnonymousClass0ZV r4) {
        super(context, (AttributeSet) null, R.attr.attr0023);
        this.A00 = r4;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AnonymousClass0L5.A00(this, getContentDescription());
        setOnTouchListener(new IDxFListenerShape2S0200000_I1(this, this, r4, 0));
    }

    public boolean ALg() {
        return false;
    }

    public boolean ALh() {
        return false;
    }

    public boolean performClick() {
        if (!super.performClick()) {
            playSoundEffect(0);
            this.A00.A03();
        }
        return true;
    }

    public boolean setFrame(int i2, int i3, int i4, int i5) {
        boolean frame = super.setFrame(i2, i3, i4, i5);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (!(drawable == null || background == null)) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) >> 1;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) >> 1;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) >> 1;
            C018208n.A0B(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
