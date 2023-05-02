package com.facebook.redex;

import X.AnonymousClass289;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.IDxLAdapterShape2S0300000_2_I1;
import com.obwhatsapp.components.CircularRevealView;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxTListenerShape32S0300000_2_I0 implements View.OnTouchListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxTListenerShape32S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        AlphaAnimation alphaAnimation;
        TextView textView;
        switch (this.A03) {
            case 0:
                AnonymousClass289 r3 = (AnonymousClass289) this.A00;
                if (motionEvent.getAction() != 4) {
                    if (motionEvent.getAction() != 0) {
                        return false;
                    }
                    float y2 = motionEvent.getY();
                    FrameLayout frameLayout = r3.A08;
                    if (y2 >= ((float) frameLayout.getTop()) && motionEvent.getY() <= ((float) frameLayout.getBottom())) {
                        float x2 = motionEvent.getX();
                        CircularRevealView circularRevealView = r3.A0B;
                        if (x2 >= ((float) circularRevealView.getLeft()) && motionEvent.getX() <= ((float) circularRevealView.getRight())) {
                            return false;
                        }
                    }
                }
                r3.dismiss();
                return true;
            case 1:
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                View view2 = (View) this.A01;
                View view3 = (View) this.A02;
                int action = motionEvent.getAction();
                if (action == 0 || action == 5) {
                    voipActivityV2.A0c.setVisibility(0);
                    voipActivityV2.showView(view2);
                    alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(1000);
                    alphaAnimation.setStartOffset(1000);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(new IDxLAdapterShape2S0300000_2_I1(view3, view2, voipActivityV2, 0));
                    textView = voipActivityV2.A0c;
                    break;
                } else {
                    return false;
                }
            default:
                VoipActivityV2 voipActivityV22 = (VoipActivityV2) this.A00;
                View view4 = (View) this.A01;
                View view5 = (View) this.A02;
                int action2 = motionEvent.getAction();
                if (action2 == 0 || action2 == 5) {
                    voipActivityV22.A0a.setVisibility(0);
                    voipActivityV22.showView(view4);
                    alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                    alphaAnimation.setDuration(1000);
                    alphaAnimation.setStartOffset(1000);
                    alphaAnimation.setFillAfter(true);
                    alphaAnimation.setAnimationListener(new IDxLAdapterShape2S0300000_2_I1(view5, view4, voipActivityV22, 1));
                    textView = voipActivityV22.A0a;
                    break;
                } else {
                    return false;
                }
                break;
        }
        textView.startAnimation(alphaAnimation);
        return false;
    }
}
