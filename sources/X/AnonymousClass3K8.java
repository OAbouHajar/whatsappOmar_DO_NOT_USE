package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.obwhatsapp.components.SegmentedProgressBar;

/* renamed from: X.3K8  reason: invalid class name */
public class AnonymousClass3K8 extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;
    public final /* synthetic */ float[] A02;

    public AnonymousClass3K8(SegmentedProgressBar segmentedProgressBar, float[] fArr, int i2) {
        this.A01 = segmentedProgressBar;
        this.A02 = fArr;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        SegmentedProgressBar segmentedProgressBar = this.A01;
        segmentedProgressBar.A08 = null;
        float[] fArr = this.A02;
        int i2 = this.A00;
        segmentedProgressBar.A0D = fArr;
        segmentedProgressBar.A02 = i2;
    }
}
