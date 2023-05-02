package X;

import com.facebook.redex.IDxProviderShape156S0100000_2_I0;

/* renamed from: X.1Ra  reason: invalid class name and case insensitive filesystem */
public class C27251Ra {
    public C43371zt A00;
    public C43371zt A01 = new C43371zt(this.A03, new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(this.A02, 33)));
    public final AnonymousClass1V0 A02;
    public final AnonymousClass1RZ A03;

    public C27251Ra(AnonymousClass1RZ r6, C16320sq r7) {
        this.A03 = r6;
        AnonymousClass1V0 r2 = new AnonymousClass1V0(r7);
        this.A02 = r2;
        this.A00 = new C43371zt(r6, new AnonymousClass01T((Object) null, new IDxProviderShape156S0100000_2_I0(r2, 32)));
    }

    public final C43371zt A00(AnonymousClass1XK r2) {
        return (r2 == AnonymousClass1XK.A0B || r2 == AnonymousClass1XK.A0Z || r2 == AnonymousClass1XK.A0G || r2 == AnonymousClass1XK.A0R || r2 == AnonymousClass1XK.A06 || r2 == AnonymousClass1XK.A0L || r2 == AnonymousClass1XK.A07) ? this.A00 : this.A01;
    }

    public void A01(C43381zu r3, AnonymousClass1XK r4) {
        A00(r4).A01(r3.A02, r3);
    }
}
