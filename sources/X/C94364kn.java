package X;

import android.os.Build;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationSet;
import com.obwhatsapp.components.CircularRevealView;

/* renamed from: X.4kn  reason: invalid class name and case insensitive filesystem */
public class C94364kn implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass289 A01;
    public final /* synthetic */ boolean A02;

    public C94364kn(AnonymousClass289 r1, int i2, boolean z2) {
        this.A01 = r1;
        this.A02 = z2;
        this.A00 = i2;
    }

    public void onGlobalLayout() {
        boolean z2;
        AnonymousClass289 r5 = this.A01;
        CircularRevealView circularRevealView = r5.A0B;
        AnonymousClass3K2.A0z(circularRevealView, this);
        r5.A06();
        if (Build.VERSION.SDK_INT >= 18 || !(z2 = this.A02)) {
            circularRevealView.A00();
            return;
        }
        int[] iArr = new int[2];
        r5.A06.getLocationOnScreen(iArr);
        AnimationSet A002 = AnonymousClass289.A00(r5.A00 + iArr[0], z2, true);
        A002.setDuration((long) this.A00);
        circularRevealView.A01(A002);
    }
}
