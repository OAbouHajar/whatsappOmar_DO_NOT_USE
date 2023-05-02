package X;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;

/* renamed from: X.3Nt  reason: invalid class name and case insensitive filesystem */
public class C64343Nt extends FrameLayout {
    public int A00 = -1;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ AnonymousClass289 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64343Nt(Activity activity, Context context, AnonymousClass289 r4) {
        super(context);
        this.A02 = r4;
        this.A01 = activity;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int rotation = this.A01.getWindowManager().getDefaultDisplay().getRotation();
        int i6 = this.A00;
        if (!(i6 == -1 || i6 == rotation)) {
            AnonymousClass289 r2 = this.A02;
            if (!r2.A03 || r2.A04) {
                AnonymousClass289.A01(r2);
            } else {
                r2.A04 = true;
                r2.A08.getViewTreeObserver().addOnGlobalLayoutListener(r2.A02);
            }
        }
        this.A00 = rotation;
        super.onLayout(z2, i2, i3, i4, i5);
    }
}
