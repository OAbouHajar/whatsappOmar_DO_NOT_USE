package X;

import android.util.Log;
import com.facebook.rendercore.RootHostView;
import com.obwhatsapp.bloks.ui.BloksDialogFragment;

/* renamed from: X.5zk  reason: invalid class name and case insensitive filesystem */
public class C119865zk implements AnonymousClass5RZ {
    public final /* synthetic */ C110285do A00;

    public C119865zk(C110285do r1) {
        this.A00 = r1;
    }

    public void AOz(AnonymousClass2Wa r4) {
        AnonymousClass22A r1;
        C110285do r2 = this.A00;
        RootHostView rootHostView = r2.A03;
        if (rootHostView != null) {
            rootHostView.setVisibility(0);
        }
        C49852We r0 = r2.A04;
        if (r0 != null) {
            r0.A04();
        }
        C1221968q r12 = r2.A08;
        if (r12 != null) {
            ((BloksDialogFragment) r12).A07 = new C115925qX(r4);
        }
        AnonymousClass01A r02 = r2.A02;
        if (!(r02 == null || (r1 = r2.A06) == null)) {
            r2.A04 = C49852We.A00(r02.A0D(), r4, r1).A00();
        }
        r2.A00();
        AnonymousClass68F r03 = r2.A07;
        if (r03 != null) {
            ((C120005zy) r03).A00.A05();
        }
    }

    public void AQb(String str) {
        Log.e("Whatsapp", str);
        AnonymousClass68F r0 = this.A00.A07;
        if (r0 != null) {
            ((C120005zy) r0).A00.A05();
        }
    }
}
