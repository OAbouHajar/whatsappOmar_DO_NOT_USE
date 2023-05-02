package X;

import java.util.HashMap;

/* renamed from: X.2C5  reason: invalid class name */
public class AnonymousClass2C5 implements C38331qc {
    public final /* synthetic */ C209212c A00;
    public final /* synthetic */ String A01;

    public AnonymousClass2C5(C209212c r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
        HashMap hashMap = this.A00.A0s;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }

    public void AQ4(C31701et r3, C30761cu r4) {
        HashMap hashMap = this.A00.A0s;
        synchronized (hashMap) {
            hashMap.remove(this.A01);
        }
    }
}
