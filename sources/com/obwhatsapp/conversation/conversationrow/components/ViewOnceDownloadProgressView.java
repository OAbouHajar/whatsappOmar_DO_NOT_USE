package com.obwhatsapp.conversation.conversationrow.components;

import X.AnonymousClass006;
import X.AnonymousClass1HE;
import X.AnonymousClass2SR;
import X.C13690nt;
import X.C33741j5;
import X.C52652eD;
import X.C52662eE;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.redex.IDxIListenerShape257S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class ViewOnceDownloadProgressView extends FrameLayout implements AnonymousClass006 {
    public AnonymousClass1HE A00;
    public C52662eE A01;
    public boolean A02;
    public final WaImageView A03;
    public final C33741j5 A04;

    public ViewOnceDownloadProgressView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewOnceDownloadProgressView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = (AnonymousClass1HE) C52652eD.A00(generatedComponent()).ALb.get();
        }
        FrameLayout.inflate(context, R.layout.layout05e0, this);
        this.A03 = C13690nt.A0R(this, R.id.view_once_control_icon);
        C33741j5 A002 = C33741j5.A00(this, R.id.view_once_progressbar);
        this.A04 = A002;
        A002.A05(new IDxIListenerShape257S0100000_2_I1(this, 3));
    }

    public void A00(int i2, int i3, int i4) {
        WaImageView waImageView = this.A03;
        Drawable drawable = null;
        if (i3 != -1) {
            drawable = AnonymousClass2SR.A06(C13690nt.A0C(getContext(), i3), getResources().getColor(i4));
        }
        waImageView.setBackgroundDrawable(drawable);
        waImageView.setImageDrawable(AnonymousClass2SR.A06(C13690nt.A0C(getContext(), i2), getResources().getColor(i4)));
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }
}
