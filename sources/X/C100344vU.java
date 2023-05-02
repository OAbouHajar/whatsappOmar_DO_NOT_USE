package X;

/* renamed from: X.4vU  reason: invalid class name and case insensitive filesystem */
public class C100344vU implements C449926n {
    public final /* synthetic */ AnonymousClass1KA A00;
    public final /* synthetic */ AnonymousClass4KQ A01;
    public final /* synthetic */ String A02;

    public C100344vU(AnonymousClass1KA r1, AnonymousClass4KQ r2, String str) {
        this.A02 = str;
        this.A01 = r2;
        this.A00 = r1;
    }

    public void ARA(String str, int i2) {
        if (this.A02.equals(str)) {
            AnonymousClass4KQ r3 = this.A01;
            C35171lU r0 = r3.A02.A04;
            if (r0 != null) {
                C35151lS r1 = r0.A01;
                if (!r1.A00) {
                    r1.A00 = true;
                    r3.A00.A02.A0e(r3.A01, -1);
                }
            }
            this.A00.A0M.remove(this);
        }
    }

    public void ARB(AnonymousClass26S r5, String str) {
        if (this.A02.equals(str)) {
            AnonymousClass4KQ r3 = this.A01;
            C35171lU r0 = r3.A02.A04;
            if (r0 != null) {
                C35151lS r1 = r0.A01;
                if (r1.A00) {
                    r1.A00 = false;
                    r3.A00.A02.A0e(r3.A01, -1);
                }
            }
            this.A00.A0M.remove(this);
        }
    }
}
