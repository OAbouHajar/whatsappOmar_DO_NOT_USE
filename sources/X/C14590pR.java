package X;

import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;

/* renamed from: X.0pR  reason: invalid class name and case insensitive filesystem */
public abstract class C14590pR extends C000900k implements AnonymousClass006 {
    public boolean A00 = false;
    public final Object A01 = new Object();
    public volatile AnonymousClass2Re A02;

    public C14590pR() {
        A1b();
    }

    private void A1b() {
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 12));
    }

    /* renamed from: A1d */
    public final AnonymousClass2Re A1f() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A02;
    }

    public void A1e() {
        new AnonymousClass2Re(this);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            generatedComponent();
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        return A1f().generatedComponent();
    }
}
