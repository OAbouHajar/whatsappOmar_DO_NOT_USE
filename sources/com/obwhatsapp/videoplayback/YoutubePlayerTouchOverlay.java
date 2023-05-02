package com.obwhatsapp.videoplayback;

import X.AnonymousClass006;
import X.C46202Cw;
import X.C52662eE;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class YoutubePlayerTouchOverlay extends RelativeLayout implements AnonymousClass006 {
    public int A00;
    public C46202Cw A01;
    public C52662eE A02;
    public boolean A03;

    public YoutubePlayerTouchOverlay(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A00 = 400;
        A00();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        this.A00 = 400;
        A00();
    }

    public YoutubePlayerTouchOverlay(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void A00() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        layoutParams.setMargins(0, 0, 0, 0);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -1));
        } else {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A00);
            layoutParams.addRule(13);
            setLayoutParams(layoutParams);
        }
        requestLayout();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (action == 3) {
            motionEvent.setAction(1);
            childAt.onTouchEvent(motionEvent);
        } else if (action != 2) {
            childAt.onTouchEvent(motionEvent);
            C46202Cw r0 = this.A01;
            if (r0 != null) {
                r0.A0L();
                return true;
            }
        }
        return true;
    }

    public boolean performClick() {
        return super.performClick();
    }

    public void setInlineVideoPlaybackControlView(C46202Cw r1) {
        this.A01 = r1;
    }

    public void setVideoHeight(int i2) {
        this.A00 = i2;
    }
}
