package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.obwhatsapp.storage.SizeTickerView;

/* renamed from: X.3KB  reason: invalid class name */
public class AnonymousClass3KB extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ SizeTickerView A02;

    public AnonymousClass3KB(SizeTickerView sizeTickerView, int i2, long j2) {
        this.A02 = sizeTickerView;
        this.A01 = j2;
        this.A00 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        SizeTickerView sizeTickerView = this.A02;
        sizeTickerView.A06 = null;
        long j2 = this.A01;
        int i2 = this.A00;
        sizeTickerView.A05 = j2;
        sizeTickerView.A02 = i2;
        sizeTickerView.A0A();
    }
}
