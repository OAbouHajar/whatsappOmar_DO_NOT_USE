package X;

import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.obwhatsapp.storage.StorageUsageActivity;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1wb  reason: invalid class name and case insensitive filesystem */
public class C41751wb implements C41761wc {
    public final /* synthetic */ StorageUsageActivity A00;

    public C41751wb(StorageUsageActivity storageUsageActivity) {
        this.A00 = storageUsageActivity;
    }

    public void AOJ(AnonymousClass4EG r5) {
        Log.i("storage-usage-activity/fetch chats/completed");
        StorageUsageActivity storageUsageActivity = this.A00;
        ArrayList arrayList = r5.A00;
        storageUsageActivity.A0M = arrayList;
        StorageUsageActivity.A03(storageUsageActivity, arrayList, (List) null, true);
        storageUsageActivity.A05.A0K(new RunnableRunnableShape15S0100000_I0_14(this, 20));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        r3.add(r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AOK(X.AnonymousClass4EH r12) {
        /*
            r11 = this;
            com.obwhatsapp.storage.StorageUsageActivity r6 = r11.A00
            X.1YJ r0 = r6.A0G
            if (r0 == 0) goto L_0x0119
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r0 = r6.A0M
            java.util.Iterator r7 = r0.iterator()
        L_0x0011:
            boolean r0 = r7.hasNext()
            r5 = 1
            if (r0 == 0) goto L_0x0049
            java.lang.Object r5 = r7.next()
            X.1Xg r5 = (X.C28711Xg) r5
            java.util.List r0 = r12.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x0024:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r4.next()
            X.1Xg r2 = (X.C28711Xg) r2
            X.0rv r1 = r2.A01()
            X.0rv r0 = r5.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            int r0 = r5.compareTo(r2)
            if (r0 == 0) goto L_0x0045
            goto L_0x0011
        L_0x0045:
            r3.add(r5)
            goto L_0x0011
        L_0x0049:
            java.util.ArrayList r0 = r6.A0M
            int r1 = r0.size()
            int r0 = r3.size()
            if (r1 != r0) goto L_0x0056
            r5 = 0
        L_0x0056:
            r6.A0M = r3
            java.util.List r7 = r12.A00
            java.util.Collections.sort(r7)
            r9 = 0
            java.lang.Object r1 = r7.get(r9)
            X.1Xg r1 = (X.C28711Xg) r1
            boolean r0 = X.C24841Hm.A00(r1)
            if (r0 != 0) goto L_0x0119
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.01Q r4 = new X.01Q
            r4.<init>(r2, r0)
            r3 = 0
        L_0x007a:
            java.lang.Object r2 = r4.A00
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            int r0 = r8.size()
            if (r9 >= r0) goto L_0x00f0
            java.lang.Object r0 = r8.get(r9)
            X.1Xg r0 = (X.C28711Xg) r0
            X.0rv r10 = r0.A01()
            X.0rv r0 = r1.A01()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00bd
            int r3 = r3 + 1
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00ad
            java.lang.Object r1 = r7.get(r3)
            X.1Xg r1 = (X.C28711Xg) r1
            boolean r0 = X.C24841Hm.A00(r1)
            if (r0 == 0) goto L_0x00bd
        L_0x00ad:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r6.A0M = r2
            if (r5 == 0) goto L_0x00b8
            r0 = 0
        L_0x00b4:
            com.obwhatsapp.storage.StorageUsageActivity.A03(r6, r2, r0, r5)
            return
        L_0x00b8:
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            goto L_0x00b4
        L_0x00bd:
            java.lang.Object r0 = r8.get(r9)
            X.1Xg r0 = (X.C28711Xg) r0
            int r0 = r1.compareTo(r0)
            if (r0 >= 0) goto L_0x00ed
            r8.add(r9, r1)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1.add(r0)
            int r3 = r3 + 1
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00ad
            java.lang.Object r1 = r7.get(r3)
            X.1Xg r1 = (X.C28711Xg) r1
            boolean r0 = X.C24841Hm.A00(r1)
            if (r0 != 0) goto L_0x00ad
            int r9 = r9 + -1
        L_0x00ed:
            int r9 = r9 + 1
            goto L_0x007a
        L_0x00f0:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00ad
            java.lang.Object r1 = r7.get(r3)
            X.1Xg r1 = (X.C28711Xg) r1
            boolean r0 = X.C24841Hm.A00(r1)
            if (r0 != 0) goto L_0x00ad
            r8.add(r1)
            java.lang.Object r1 = r4.A01
            java.util.List r1 = (java.util.List) r1
            int r0 = r8.size()
            int r0 = r0 + -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.add(r0)
            int r3 = r3 + 1
            goto L_0x00f0
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41751wb.AOK(X.4EH):void");
    }

    public void APV(C28701Xf r4, C15830rv r5) {
        this.A00.A05.A0K(new RunnableRunnableShape2S0300000_I0_2(this, r5, r4, 17));
    }
}
