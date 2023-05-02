package com.obwhatsapp.contact.picker;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass5PF;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class SharedTextPreviewScrollView extends ScrollView implements AnonymousClass006 {
    public AnonymousClass5PF A00;
    public C52662eE A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public SharedTextPreviewScrollView(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public SharedTextPreviewScrollView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public void fling(int i2) {
        super.fling(i2);
        this.A03 = true;
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass5PF getOnEndScrollListener() {
        return this.A00;
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        if (!this.A03 && this.A04) {
            return;
        }
        if (((float) AnonymousClass000.A09(i3, i5)) < 1.0f || i3 >= getMeasuredHeight() || i3 == 0) {
            AnonymousClass5PF r0 = this.A00;
            if (r0 != null) {
                r0.AQN();
            }
            this.A03 = false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            this.A04 = false;
            if (!this.A03) {
                this.A00.AQN();
            }
        } else if (motionEvent.getActionMasked() == 2) {
            this.A04 = true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public void setOnEndScrollListener(AnonymousClass5PF r1) {
        this.A00 = r1;
    }
}
