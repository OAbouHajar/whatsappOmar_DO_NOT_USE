package X;

import android.view.MenuItem;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.yo.yo;
import java.util.LinkedHashMap;

/* renamed from: X.36g  reason: invalid class name and case insensitive filesystem */
public class C608236g extends C16690tT {
    public final /* synthetic */ CallsHistoryFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C608236g(CallsHistoryFragment callsHistoryFragment) {
        super(callsHistoryFragment, true);
        this.A00 = callsHistoryFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r13.A06 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        if (r6.A06 != null) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r11 = 0
            r10 = r18
            com.facebook.redex.IDxSCallbackShape334S0100000_2_I1 r9 = new com.facebook.redex.IDxSCallbackShape334S0100000_2_I1
            r9.<init>(r10, r11)
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r8 = r10.A00
            X.1SN r0 = r8.A0E
            r0.A00()
            X.1D0 r0 = r8.A0T
            r6 = 100
            java.util.ArrayList r17 = r0.A05(r9, r11, r6)
            X.0tU r3 = r10.A02
            boolean r0 = r3.isCancelled()
            r16 = 0
            if (r0 != 0) goto L_0x0141
            java.lang.String r0 = "calls/RefreshCallsTask/doInBackground"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            X.0t3 r7 = r8.A0R
            X.0pd r2 = r8.A0W
            X.0sG r1 = r8.A0J
            X.0sP r0 = r8.A0L
            X.39v r4 = new X.39v
            r4.<init>(r1, r0, r7, r2)
            X.1lE r7 = X.C30341cC.A07()     // Catch:{ UnsatisfiedLinkError -> 0x003d }
            goto L_0x0043
        L_0x003d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            r7 = r16
        L_0x0043:
            java.util.Iterator r15 = r17.iterator()
        L_0x0047:
            boolean r0 = r15.hasNext()
            r2 = 1
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r13 = r15.next()
            X.1po r13 = (X.C37831po) r13
            com.whatsapp.jid.GroupJid r14 = r13.A04
            X.0sG r12 = r8.A0J
            X.14s r1 = r8.A0a
            X.0ul r0 = r8.A0X
            X.0sH r0 = X.C30341cC.A02(r12, r0, r14, r1)
            if (r0 != 0) goto L_0x0063
            r2 = 0
        L_0x0063:
            X.1lE r0 = r13.A0C
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x007b
            boolean r0 = r13.A0A()
            if (r0 == 0) goto L_0x0080
            java.util.List r0 = r13.A04()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0080
        L_0x007b:
            X.1r0 r1 = r13.A06
            r0 = 0
            if (r1 == 0) goto L_0x0081
        L_0x0080:
            r0 = 1
        L_0x0081:
            if (r0 == 0) goto L_0x0047
            boolean r1 = r4.A09(r13, r2)
            if (r1 == 0) goto L_0x008e
            java.util.ArrayList r0 = r4.A04
            r0.add(r13)
        L_0x008e:
            if (r1 != 0) goto L_0x0047
            java.lang.String r0 = r4.A05()
            r5.put(r0, r4)
            X.0t3 r12 = r8.A0R
            X.0pd r2 = r8.A0W
            X.0sG r1 = r8.A0J
            X.0sP r0 = r8.A0L
            X.39v r4 = new X.39v
            r4.<init>(r1, r0, r12, r2)
            java.util.ArrayList r0 = r4.A04
            r0.add(r13)
            goto L_0x0047
        L_0x00aa:
            int r0 = r17.size()
            if (r0 < r6) goto L_0x0131
            java.util.LinkedHashMap[] r1 = new java.util.LinkedHashMap[r2]
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r5)
            r1[r11] = r0
            r10.A07(r1)
            X.1D0 r1 = r8.A0T
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r1 = r1.A05(r9, r6, r0)
            boolean r0 = r3.isCancelled()
            if (r0 != 0) goto L_0x0141
            java.util.Iterator r9 = r1.iterator()
        L_0x00ce:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0131
            java.lang.Object r6 = r9.next()
            X.1po r6 = (X.C37831po) r6
            com.whatsapp.jid.GroupJid r3 = r6.A04
            X.0sG r2 = r8.A0J
            X.14s r1 = r8.A0a
            X.0ul r0 = r8.A0X
            X.0sH r0 = X.C30341cC.A02(r2, r0, r3, r1)
            boolean r2 = X.AnonymousClass000.A1V(r0)
            X.1lE r0 = r6.A0C
            boolean r0 = r0.equals(r7)
            if (r0 != 0) goto L_0x0102
            boolean r0 = r6.A0A()
            if (r0 == 0) goto L_0x0107
            java.util.List r0 = r6.A04()
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0107
        L_0x0102:
            X.1r0 r1 = r6.A06
            r0 = 0
            if (r1 == 0) goto L_0x0108
        L_0x0107:
            r0 = 1
        L_0x0108:
            if (r0 == 0) goto L_0x00ce
            boolean r1 = r4.A09(r6, r2)
            if (r1 == 0) goto L_0x0115
            java.util.ArrayList r0 = r4.A04
            r0.add(r6)
        L_0x0115:
            if (r1 != 0) goto L_0x00ce
            java.lang.String r0 = r4.A05()
            r5.put(r0, r4)
            X.0t3 r3 = r8.A0R
            X.0pd r2 = r8.A0W
            X.0sG r1 = r8.A0J
            X.0sP r0 = r8.A0L
            X.39v r4 = new X.39v
            r4.<init>(r1, r0, r3, r2)
            java.util.ArrayList r0 = r4.A04
            r0.add(r6)
            goto L_0x00ce
        L_0x0131:
            java.util.ArrayList r0 = r4.A04
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = r4.A05()
            r5.put(r0, r4)
        L_0x0140:
            return r5
        L_0x0141:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C608236g.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        CallsHistoryFragment callsHistoryFragment = this.A00;
        callsHistoryFragment.A0C = null;
        if (linkedHashMap != null) {
            yo.H5CallsN(linkedHashMap);
            callsHistoryFragment.A0h = linkedHashMap;
            callsHistoryFragment.A0B.getFilter().filter(callsHistoryFragment.A0e);
        }
        MenuItem menuItem = callsHistoryFragment.A00;
        if (menuItem != null) {
            menuItem.setVisible(!callsHistoryFragment.A0h.isEmpty());
        }
        callsHistoryFragment.A1F();
        callsHistoryFragment.A1D();
    }
}
