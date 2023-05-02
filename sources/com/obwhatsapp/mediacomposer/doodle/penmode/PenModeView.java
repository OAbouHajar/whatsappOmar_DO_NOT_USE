package com.obwhatsapp.mediacomposer.doodle.penmode;

import X.AnonymousClass000;
import X.C004601z;
import X.C108095Mq;
import X.C108855Pt;
import X.C13680ns;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.redex.IDxHClickShape37S0000000_2_I1;
import com.obwhatsapp.R;
import java.util.List;

public class PenModeView extends FrameLayout {
    public C108095Mq A00;
    public final List A01 = AnonymousClass000.A0u();

    public PenModeView(Context context) {
        super(context);
        A00();
    }

    public PenModeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public PenModeView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public final void A00() {
        FrameLayout.inflate(getContext(), R.layout.layout048c, this);
        A01(new IDxHClickShape37S0000000_2_I1(3), R.id.pen_mode_thin);
        A01(new IDxHClickShape37S0000000_2_I1(1), R.id.pen_mode_medium);
        A01(new IDxHClickShape37S0000000_2_I1(2), R.id.pen_mode_thick);
        A01(new IDxHClickShape37S0000000_2_I1(0), R.id.pen_mode_blur);
    }

    public final void A01(C108855Pt r3, int i2) {
        View A0E = C004601z.A0E(this, i2);
        this.A01.add(A0E);
        C13680ns.A1C(A0E, this, r3, 37);
    }

    public void setOnSelectedListener(C108095Mq r1) {
        this.A00 = r1;
    }
}
