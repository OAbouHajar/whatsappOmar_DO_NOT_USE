package X;

import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;

/* renamed from: X.2Up  reason: invalid class name and case insensitive filesystem */
public class C49652Up implements AnonymousClass2BH {
    public final /* synthetic */ AnonymousClass2AS A00;

    public C49652Up(AnonymousClass2AS r1) {
        this.A00 = r1;
    }

    public void AQR(int i2) {
        C16320sq r2;
        int i3;
        AnonymousClass2AS r3 = this.A00;
        if (i2 == 403) {
            r2 = r3.A0z;
            i3 = 43;
        } else if (i2 == 404 && !r3.A0i.A00(r3.A05)) {
            r2 = r3.A0z;
            i3 = 41;
        } else {
            return;
        }
        r2.Acl(new RunnableRunnableShape5S0100000_I0_4((Object) r3, i3));
        r3.A0v.A09(Integer.valueOf(i2));
    }

    public void onSuccess() {
        AnonymousClass2AS r0 = this.A00;
        C16050sL r5 = r0.A0j;
        C16300so r2 = r0.A0F;
        C16320sq r7 = r0.A0z;
        C17190ug r6 = r0.A0k;
        new C45792Bc(r2, r0.A0J, r0.A0Z, r5, r6, r7).A00();
        AnonymousClass12B r72 = r0.A0m;
        r72.A01.A0K(new C63383Hs(r5, (C16050sL) null, r72, r0.A05.A05, 2));
    }
}
