package X;

import android.view.View;
import com.whatsapp.util.ViewOnClickCListenerShape5S0100000_I1_1;

/* renamed from: X.3Fe  reason: invalid class name and case insensitive filesystem */
public class C62853Fe implements C108745Pe {
    public C47582Jo A00;
    public AnonymousClass4SE A01;
    public C85434Ok A02;
    public AnonymousClass3R7 A03;
    public AnonymousClass3H7 A04;
    public final AnonymousClass1MH A05;
    public final C25841Li A06;
    public final C25861Lk A07;
    public final C34331k5 A08 = new ViewOnClickCListenerShape5S0100000_I1_1(this, 26);

    public C62853Fe(AnonymousClass1MH r3, C25841Li r4, C25861Lk r5) {
        this.A06 = r4;
        this.A07 = r5;
        this.A05 = r3;
    }

    public void A00() {
        View view = this.A01.A02;
        if (view != null && view.getVisibility() == 0) {
            AnonymousClass3R7 r1 = this.A03;
            if (r1 == null) {
                r1 = new C76273te(this);
                this.A03 = r1;
            }
            this.A01.A00(r1);
            this.A03.A0F(this.A07.A01());
        }
    }

    public void ARt(C93544jN r2) {
        C42751yc r0;
        this.A00.AcT();
        C85434Ok r02 = this.A02;
        if (r02 != null && (r0 = r02.A05.A00) != null) {
            r0.ARt(r2);
        }
    }
}
