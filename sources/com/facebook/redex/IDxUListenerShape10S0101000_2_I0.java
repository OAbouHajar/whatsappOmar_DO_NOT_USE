package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2V7;
import X.C004601z;
import X.C15540rI;
import X.C34341k6;
import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.camera.DragGalleryStripIndicator;
import com.obwhatsapp.components.SegmentedProgressBar;

public class IDxUListenerShape10S0101000_2_I0 implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxUListenerShape10S0101000_2_I0(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A02) {
            case 0:
                int A0D = AnonymousClass000.A0D(valueAnimator.getAnimatedValue());
                boolean z2 = C15540rI.A09;
                C34341k6 r1 = ((C15540rI) this.A01).A05;
                if (z2) {
                    C004601z.A0b(r1, A0D - this.A00);
                } else {
                    r1.setTranslationY((float) A0D);
                }
                this.A00 = A0D;
                return;
            case 1:
                AnonymousClass2V7 r4 = (AnonymousClass2V7) this.A01;
                int i2 = this.A00;
                float A03 = AnonymousClass000.A03(valueAnimator);
                RecyclerView recyclerView = r4.A0A;
                recyclerView.getLayoutParams().height = (int) (((float) i2) * A03);
                recyclerView.requestLayout();
                DragGalleryStripIndicator dragGalleryStripIndicator = r4.A03;
                if (dragGalleryStripIndicator != null) {
                    dragGalleryStripIndicator.setOffset(A03);
                    return;
                }
                return;
            default:
                SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) this.A01;
                segmentedProgressBar.A0D[this.A00] = AnonymousClass000.A03(valueAnimator);
                segmentedProgressBar.postInvalidate();
                return;
        }
    }
}
