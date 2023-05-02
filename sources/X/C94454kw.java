package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.TranslateAnimation;
import com.obwhatsapp.IDxLAdapterShape52S0100000_2_I1;

/* renamed from: X.4kw  reason: invalid class name and case insensitive filesystem */
public class C94454kw implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewGroup A02;
    public final /* synthetic */ C42821yj A03;
    public final /* synthetic */ boolean A04;

    public C94454kw(View view, ViewGroup viewGroup, C42821yj r3, int i2, boolean z2) {
        this.A03 = r3;
        this.A02 = viewGroup;
        this.A04 = z2;
        this.A01 = view;
        this.A00 = i2;
    }

    public void onGlobalLayout() {
        ViewGroup viewGroup = this.A02;
        AnonymousClass3K3.A16(viewGroup, this);
        int height = viewGroup.getHeight();
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) height, 0.0f);
        translateAnimation.setDuration(250);
        if (this.A04) {
            this.A03.A1n.startAnimation(translateAnimation);
        }
        C42821yj r6 = this.A03;
        if (viewGroup == r6.A0N && r6.A0K.getVisibility() == 0) {
            r6.A0K.startAnimation(translateAnimation);
        }
        if (r6.A37.A0H) {
            r6.A0O.startAnimation(translateAnimation);
        }
        this.A01.startAnimation(translateAnimation);
        Drawable background = r6.A08.getBackground();
        if (!(background instanceof AnonymousClass3LG)) {
            AnonymousClass3LG.A00(new AnonymousClass3LG(background), r6.A08);
        }
        AnonymousClass3LG r0 = (AnonymousClass3LG) r6.A08.getBackground();
        r0.A00 = height;
        r0.invalidateSelf();
        AnonymousClass3NR r2 = new AnonymousClass3NR(background, this, height);
        r2.setStartTime(-1);
        r2.setDuration(250);
        r2.setAnimationListener(new IDxLAdapterShape52S0100000_2_I1(this, 1));
        r6.A08.startAnimation(r2);
    }
}
