package com.obwhatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass3GA;
import X.AnonymousClass3GB;
import X.AnonymousClass3K4;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

public class IDxPViewShape89S0100000_2_I1 extends PhotoView {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxPViewShape89S0100000_2_I1(Context context, Object obj, int i2) {
        super(context);
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A01) {
            case 0:
                mediaViewBaseFragment = ((AnonymousClass3GA) this.A00).A00;
                break;
            case 1:
                mediaViewBaseFragment = ((AnonymousClass3GB) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1P(AnonymousClass000.A1O((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1))), true);
        return super.onDoubleTap(motionEvent);
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        switch (this.A01) {
            case 0:
                mediaViewBaseFragment = ((AnonymousClass3GA) this.A00).A00;
                break;
            case 1:
                mediaViewBaseFragment = ((AnonymousClass3GB) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1P(false, true);
        return super.onScaleBegin(scaleGestureDetector);
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        MediaViewBaseFragment mediaViewBaseFragment;
        int i2 = this.A01;
        super.onScaleEnd(scaleGestureDetector);
        switch (i2) {
            case 0:
                mediaViewBaseFragment = ((AnonymousClass3GA) this.A00).A00;
                break;
            case 1:
                mediaViewBaseFragment = ((AnonymousClass3GB) this.A00).A00;
                break;
            default:
                mediaViewBaseFragment = (MediaViewBaseFragment) this.A00;
                break;
        }
        mediaViewBaseFragment.A1P(AnonymousClass3K4.A18((this.A00 > this.A04 ? 1 : (this.A00 == this.A04 ? 0 : -1))), true);
    }
}
