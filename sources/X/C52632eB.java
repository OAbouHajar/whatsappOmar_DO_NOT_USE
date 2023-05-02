package X;

import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.2eB  reason: invalid class name and case insensitive filesystem */
public class C52632eB implements C38331qc {
    public final /* synthetic */ C30701co A00;
    public final /* synthetic */ C209212c A01;
    public final /* synthetic */ String A02;

    public C52632eB(C30701co r1, C209212c r2, String str) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = str;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
        C30701co r2;
        C209212c r5 = this.A01;
        HashMap hashMap = r5.A0t;
        synchronized (hashMap) {
            StringBuilder sb = new StringBuilder();
            sb.append("mediadownloadmanager/queueexpresspathdownload Download canceled for media job: ");
            r2 = this.A00;
            sb.append(r2);
            sb.append(" enc hash: ");
            String str = this.A02;
            sb.append(str);
            Log.i(sb.toString());
            hashMap.remove(str);
        }
        C209212c.A01(r5, r2.A0a);
    }

    public void AQ4(C31701et r6, C30761cu r7) {
        C30701co r1;
        C209212c r4 = this.A01;
        HashMap hashMap = r4.A0t;
        synchronized (hashMap) {
            StringBuilder sb = new StringBuilder();
            sb.append("mediadownloadmanager/queueexpresspathdownload Download finishes for media job: ");
            r1 = this.A00;
            sb.append(r1);
            Log.i(sb.toString());
            hashMap.remove(this.A02);
        }
        C209212c.A01(r4, r1.A0a);
    }
}
