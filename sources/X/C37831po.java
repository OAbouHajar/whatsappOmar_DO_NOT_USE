package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.1po  reason: invalid class name and case insensitive filesystem */
public class C37831po {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public GroupJid A04;
    public C38601r3 A05;
    public C38571r0 A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public final long A0A;
    public final DeviceJid A0B;
    public final C35011lE A0C;
    public final Map A0D = new LinkedHashMap();
    public final boolean A0E;
    public final boolean A0F;
    public volatile C38591r2 A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public transient boolean A0J;

    public C37831po(C38591r2 r5, DeviceJid deviceJid, GroupJid groupJid, C38601r3 r8, C35011lE r9, C38571r0 r10, String str, Collection collection, int i2, int i3, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0C = r9;
        this.A05 = r8;
        this.A03 = j2;
        this.A0A = j3;
        this.A0I = z2;
        this.A01 = i2;
        this.A00 = i3;
        this.A09 = z3;
        this.A02 = j4;
        this.A0F = z4;
        this.A0E = z5;
        this.A04 = groupJid;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C38581r1 r2 = (C38581r1) it.next();
            this.A0D.put(r2.A02, r2);
        }
        this.A0H = z6;
        this.A0B = deviceJid;
        this.A07 = str;
        this.A06 = r10;
        this.A0G = r5;
    }

    public static C37831po A00(GroupJid groupJid, C38601r3 r25, List list, int i2, int i3, int i4, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5) {
        C38601r3 r8 = r25;
        C28381Vw r4 = r8.A11;
        C15830rv r3 = r4.A00;
        UserJid of = UserJid.of(r3);
        if (!C16030sJ.A0O(of)) {
            StringBuilder sb = new StringBuilder("CallLog/fromFMessage V1 bad UserJid: ");
            sb.append(r3);
            Log.e(sb.toString());
            return null;
        }
        return new C37831po((C38591r2) null, (DeviceJid) null, groupJid, r8, new C35011lE(i2, of, r4.A01, r4.A02), (C38571r0) null, (String) null, list, i3, i4, j2, j3, j4, z2, z3, false, z4, z5);
    }

    public static C37831po A01(C38601r3 r21, int i2, int i3, long j2, boolean z2, boolean z3) {
        C38601r3 r4 = r21;
        C28381Vw r1 = r4.A11;
        C15830rv r2 = r1.A00;
        UserJid of = UserJid.of(r2);
        if (!C16030sJ.A0O(of)) {
            StringBuilder sb = new StringBuilder("CallLog/fromFMessage Legacy bad UserJid: ");
            sb.append(r2);
            Log.e(sb.toString());
            return null;
        }
        C35011lE r5 = new C35011lE(-1, of, r1.A01, r1.A02);
        long j3 = r4.A0I;
        return new C37831po((C38591r2) null, DeviceJid.of(of), (GroupJid) null, r4, r5, (C38571r0) null, (String) null, Collections.emptyList(), i2, i3, -1, j3, j2, z2, false, true, z3, false);
    }

    public synchronized long A02() {
        return this.A03;
    }

    public C35011lE A03() {
        C35011lE r0 = this.A0C;
        UserJid userJid = r0.A01;
        boolean z2 = r0.A03;
        return new C35011lE(r0.A00, userJid, r0.A02, z2);
    }

    public synchronized List A04() {
        return new ArrayList(this.A0D.values());
    }

    public synchronized void A05() {
        this.A0J = false;
    }

    public synchronized void A06(long j2) {
        this.A03 = j2;
    }

    public synchronized void A07(UserJid userJid, int i2) {
        Map map = this.A0D;
        C38581r1 r1 = (C38581r1) map.get(userJid);
        if (r1 != null) {
            synchronized (r1) {
                r1.A00 = i2;
                r1.A03 = true;
            }
        } else {
            C38581r1 r12 = new C38581r1(userJid, i2, -1);
            map.put(r12.A02, r12);
            this.A0J = true;
        }
    }

    public synchronized void A08(C38571r0 r2) {
        this.A08 = true;
        this.A0J = true;
        this.A06 = r2;
    }

    public synchronized void A09(boolean z2) {
        if (this.A0I != z2) {
            this.A0J = true;
        }
        this.A0I = z2;
    }

    public boolean A0A() {
        return this.A0D.size() >= 2 || this.A0G != null;
    }

    public boolean A0B() {
        return !this.A0C.A03 && this.A00 == 2;
    }

    public boolean A0C() {
        return A0B() && !A0A() && this.A09;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0D() {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.A0J     // Catch:{ all -> 0x0030 }
            r5 = 1
            if (r0 != 0) goto L_0x002e
            long r3 = r6.A03     // Catch:{ all -> 0x0030 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            java.util.Map r0 = r6.A0D     // Catch:{ all -> 0x0030 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0030 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0018:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0030 }
            X.1r1 r0 = (X.C38581r1) r0     // Catch:{ all -> 0x0030 }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0018
            goto L_0x002e
        L_0x002b:
            r0 = 0
            monitor-exit(r6)
            return r0
        L_0x002e:
            monitor-exit(r6)
            return r5
        L_0x0030:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37831po.A0D():boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C37831po r7 = (C37831po) obj;
            if (!(this.A03 == r7.A03 && this.A0C.equals(r7.A0C) && this.A0A == r7.A0A && this.A0I == r7.A0I && this.A01 == r7.A01 && this.A02 == r7.A02 && this.A00 == r7.A00 && this.A09 == r7.A09 && this.A0F == r7.A0F && this.A0E == r7.A0E && C34901l3.A00(this.A04, r7.A04) && this.A0H == r7.A0H && this.A0D.equals(r7.A0D) && C34901l3.A00(this.A0B, r7.A0B) && C34901l3.A00(this.A07, r7.A07) && C34901l3.A00(this.A0G, r7.A0G))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.A03), this.A0C, Long.valueOf(this.A0A), Boolean.valueOf(this.A0I), Integer.valueOf(this.A01), Long.valueOf(this.A02), Integer.valueOf(this.A00), Boolean.valueOf(this.A09), Boolean.valueOf(this.A0F), Boolean.valueOf(this.A0E), this.A0D, this.A04, Boolean.valueOf(this.A0H), this.A0B, this.A07, this.A06, this.A0G});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CallLog[rowId=");
        sb.append(this.A03);
        sb.append(", key=");
        sb.append(this.A0C);
        sb.append(", timestamp=");
        sb.append(this.A0A);
        sb.append(", videoCall=");
        sb.append(this.A0I);
        sb.append(", duration=");
        sb.append(this.A01);
        sb.append(", bytesTransferred=");
        sb.append(this.A02);
        sb.append(", callResult=");
        sb.append(this.A00);
        sb.append(", isDNDModeOn=");
        sb.append(this.A09);
        sb.append(", isLegacy=");
        sb.append(this.A0F);
        sb.append(", fromMissedCall=");
        sb.append(this.A0E);
        sb.append(", groupJid=");
        sb.append(this.A04);
        sb.append(", isJoinableGroupCall=");
        sb.append(this.A0H);
        sb.append(", participants.size=");
        sb.append(this.A0D.size());
        sb.append(", callCreatorDeviceJid=");
        sb.append(this.A0B);
        sb.append(", callRandomId=");
        sb.append(this.A07);
        sb.append(", joinableData=");
        sb.append(this.A06);
        sb.append(", callLinkData=");
        sb.append(this.A0G);
        sb.append("]");
        return sb.toString();
    }
}
