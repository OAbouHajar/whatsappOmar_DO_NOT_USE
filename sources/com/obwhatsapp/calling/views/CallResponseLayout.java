package com.obwhatsapp.calling.views;

import X.AnonymousClass006;
import X.AnonymousClass01V;
import X.AnonymousClass0VE;
import X.AnonymousClass5PA;
import X.C004601z;
import X.C16150sX;
import X.C52652eD;
import X.C52662eE;
import X.C57132qB;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;

public class CallResponseLayout extends FrameLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public AnonymousClass5PA A02;
    public AnonymousClass01V A03;
    public C52662eE A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewConfiguration A08;
    public final AnonymousClass0VE A09;

    public CallResponseLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.A09 = new AnonymousClass0VE(getContext(), this, new C57132qB(this));
        this.A08 = ViewConfiguration.get(getContext());
    }

    public CallResponseLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        if (!this.A05) {
            this.A05 = true;
            this.A03 = C16150sX.A0T(C52652eD.A00(generatedComponent()));
        }
    }

    public void computeScroll() {
        super.computeScroll();
        if (this.A09.A0A()) {
            postInvalidateOnAnimation();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A04;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3 && actionMasked != 1) {
            return this.A09.A0E(motionEvent);
        }
        this.A09.A02();
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.A09.A07(motionEvent);
        return true;
    }

    public void onVisibilityChanged(View view, int i2) {
        int height;
        super.onVisibilityChanged(view, i2);
        if (this.A01 != null && i2 == 0 && (height = (getHeight() - this.A01.getHeight()) - ((int) this.A01.getY())) != 0) {
            C004601z.A0b(this.A01, height);
        }
    }

    public void setCallResponseSwipeUpHintView(View view) {
        this.A00 = view;
    }

    public void setCallResponseView(View view) {
        this.A01 = view;
    }

    public void setResponseListener(AnonymousClass5PA r1) {
        this.A02 = r1;
    }

    public void setShowSwipeUpHintByDefault(boolean z2) {
        this.A06 = z2;
    }

    public void setTouchDownAfterDrag(boolean z2) {
        this.A07 = z2;
    }
}
