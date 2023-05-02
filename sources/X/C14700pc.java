package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.snackbar.WaSnackbar$$ExternalSyntheticLambda0;
import java.util.List;

/* renamed from: X.0pc  reason: invalid class name and case insensitive filesystem */
public class C14700pc implements ViewTreeObserver.OnGlobalLayoutListener {
    public final C009704q A00;
    public final AnonymousClass05T A01;
    public final C67563bv A02 = new C67543bt(this);
    public final C32291fz A03;
    public final AnonymousClass01V A04;
    public final List A05;
    public final boolean A06;

    public C14700pc(C001300o r6, C32291fz r7, AnonymousClass01V r8, List list, boolean z2) {
        WaSnackbar$$ExternalSyntheticLambda0 waSnackbar$$ExternalSyntheticLambda0 = new WaSnackbar$$ExternalSyntheticLambda0(this);
        this.A01 = waSnackbar$$ExternalSyntheticLambda0;
        C009704q lifecycle = r6.getLifecycle();
        this.A00 = lifecycle;
        AnonymousClass00B.A0G(((C009604p) lifecycle).A02 != C011005f.DESTROYED);
        this.A03 = r7;
        this.A04 = r8;
        this.A05 = list;
        this.A06 = z2;
        lifecycle.A00(waSnackbar$$ExternalSyntheticLambda0);
    }

    public void A00() {
        this.A03.A04(3);
        this.A00.A01(this.A01);
    }

    public void A01() {
        if (((C009604p) this.A00).A02.A00(C011005f.STARTED)) {
            C32291fz r1 = this.A03;
            r1.A05.getViewTreeObserver().addOnGlobalLayoutListener(this);
            r1.A05(this.A02);
            r1.A03();
        }
    }

    public final void A02(int i2) {
        for (View view : this.A05) {
            if (view != null) {
                view.animate().translationY((float) i2).setDuration(250).setInterpolator(new C018508q()).start();
            }
        }
    }

    public void A03(Runnable runnable) {
        this.A03.A05(new C67553bu(this, runnable));
    }

    public void onGlobalLayout() {
        C34341k6 r1 = this.A03.A05;
        r1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        A02(-r1.getHeight());
        if (this.A06) {
            C41631wI.A01(r1, this.A04);
        }
    }
}
