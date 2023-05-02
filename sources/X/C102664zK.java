package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.4zK  reason: invalid class name and case insensitive filesystem */
public class C102664zK implements C38331qc {
    public final /* synthetic */ C16730tY A00;
    public final /* synthetic */ AnonymousClass1BM A01;

    public C102664zK(C16730tY r1, AnonymousClass1BM r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
        Log.i("statusdownload/status-cancelled");
        AnonymousClass1BM r1 = this.A01;
        r1.A00 = null;
        r1.A01 = null;
        C16730tY r3 = this.A00;
        C31701et r2 = AnonymousClass1BM.A06;
        ConcurrentHashMap concurrentHashMap = r1.A05;
        AnonymousClass4FF r0 = (AnonymousClass4FF) concurrentHashMap.get(r3);
        if (r0 != null) {
            r0.A00.A00 = r2;
            concurrentHashMap.remove(r3);
        }
    }

    public void AQ4(C31701et r6, C30761cu r7) {
        C16730tY r3;
        C16750ta r0;
        Log.i("statusdownload/status-completed");
        AnonymousClass1BM r4 = this.A01;
        while (true) {
            ArrayList arrayList = r4.A04;
            if (arrayList.size() <= 0) {
                r3 = null;
                break;
            }
            r3 = (C16730tY) arrayList.remove(0);
            C16730tY r02 = r4.A00;
            if ((r02 == null || !r3.A11.equals(r02.A11)) && (r0 = r3.A02) != null && !r0.A0P) {
                break;
            }
        }
        r4.A00 = null;
        r4.A01 = null;
        C16730tY r2 = this.A00;
        ConcurrentHashMap concurrentHashMap = r4.A05;
        AnonymousClass4FF r03 = (AnonymousClass4FF) concurrentHashMap.get(r2);
        if (r03 != null) {
            r03.A00.A00 = r6;
            concurrentHashMap.remove(r2);
        }
        if (r3 != null) {
            int i2 = 0;
            if (AnonymousClass20C.A01(r4.A02, r3)) {
                i2 = 3;
            }
            r4.A00(r3, i2);
        }
    }
}
