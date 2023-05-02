package X;

import java.util.ArrayList;

/* renamed from: X.4R4  reason: invalid class name */
public abstract class AnonymousClass4R4 {
    public Object A00;
    public boolean A01 = false;
    public final /* synthetic */ C15770rp A02;

    public AnonymousClass4R4(C15770rp r2, Object obj) {
        this.A02 = r2;
        this.A00 = obj;
    }

    public final void A00() {
        synchronized (this) {
            this.A00 = null;
        }
        ArrayList arrayList = this.A02.A0P;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
