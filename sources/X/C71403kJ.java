package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.biz.catalog.view.AspectRatioFrameLayout;

/* renamed from: X.3kJ  reason: invalid class name and case insensitive filesystem */
public abstract class C71403kJ extends AspectRatioFrameLayout {
    public int A00;
    public C14710pd A01;
    public C16740tZ A02;

    public C71403kJ(Context context) {
        super(context, (AttributeSet) null);
    }

    public void A03() {
    }

    public void A04(View view, View view2) {
        C16740tZ r0 = this.A02;
        if (r0 != null) {
            if (r0.A0x) {
                view.setVisibility(0);
            } else {
                view.setVisibility(8);
            }
            if (!C34321k4.A03(this.A01) || 1 != this.A02.A06()) {
                view2.setVisibility(8);
            } else {
                view2.setVisibility(0);
            }
        }
    }

    public boolean A05() {
        return false;
    }

    public abstract void setMessage(C16730tY r1);

    public void setRadius(int i2) {
        this.A00 = i2;
    }

    public void setScrolling(boolean z2) {
    }

    public void setShouldPlay(boolean z2) {
    }
}
