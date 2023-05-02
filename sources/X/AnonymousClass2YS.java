package X;

import com.facebook.redex.IDxFactoryShape55S0200000_2_I0;

/* renamed from: X.2YS  reason: invalid class name */
public final class AnonymousClass2YS implements AnonymousClass007 {
    public final C006602z A00;
    public final Object A01 = new Object();
    public volatile AnonymousClass2YT A02;

    public AnonymousClass2YS(C001100m r3) {
        this.A00 = new C006602z((AnonymousClass04o) new IDxFactoryShape55S0200000_2_I0(r3, 3, this), (C001500q) r3);
    }

    public /* bridge */ /* synthetic */ Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = ((C50112Ya) this.A00.A01(C50112Ya.class)).A00;
                }
            }
        }
        return this.A02;
    }
}
