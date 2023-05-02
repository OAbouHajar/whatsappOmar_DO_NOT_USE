package X;

import android.os.SystemClock;

/* renamed from: X.52u  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1038052u implements AnonymousClass1WE {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Integer A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ C1038052u(Integer num, String str, int i2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = num;
    }

    public final void accept(Object obj) {
        String str = this.A02;
        int i2 = this.A00;
        Integer num = this.A01;
        AnonymousClass1S5 r10 = (AnonymousClass1S5) obj;
        AnonymousClass4OG r5 = (AnonymousClass4OG) r10.A03.get(str);
        if (r5 != null && r5.A05 == 0) {
            r5.A05 = SystemClock.uptimeMillis();
            r5.A01 = Integer.valueOf(i2);
            r5.A02 = num;
            C31081dR r2 = r10.A02;
            int hashCode = str.hashCode();
            r2.A01(hashCode, "iq_send");
            r2.A02(hashCode, "iq_processing");
        }
    }
}
