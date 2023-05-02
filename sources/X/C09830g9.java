package X;

import java.util.ArrayList;

/* renamed from: X.0g9  reason: invalid class name and case insensitive filesystem */
public class C09830g9 implements Runnable {
    public final /* synthetic */ AnonymousClass0S3 A00;
    public final /* synthetic */ AnonymousClass0V5 A01;

    public C09830g9(AnonymousClass0S3 r1, AnonymousClass0V5 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void run() {
        ArrayList arrayList = this.A01.A03;
        AnonymousClass0S3 r2 = this.A00;
        if (arrayList.contains(r2)) {
            r2.A01.A02(r2.A04.A0A);
        }
    }
}
