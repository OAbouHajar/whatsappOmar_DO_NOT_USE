package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.1s2  reason: invalid class name and case insensitive filesystem */
public class C39171s2 extends C16740tZ implements C16850tk, C39071rs, C30081bi {
    public int A00;
    public int A01;
    public long A02 = 0;
    public String A03 = "";
    public List A04;
    public final List A05 = new CopyOnWriteArrayList();

    public C39171s2(C14710pd r11, AnonymousClass2uC r12, C28381Vw r13, long j2, boolean z2) {
        super(r13, (byte) 66, j2);
        if ((r12.A00 & 2) == 2) {
            String str = r12.A05;
            if (z2) {
                this.A03 = str;
            } else if (TextUtils.isEmpty(str) || str.length() > 5000) {
                throw new AnonymousClass23S(34, "poll_creation_invalid_name");
            } else {
                this.A03 = str;
                if (r12.A03.size() > 0) {
                    AnonymousClass1XE<C58272tE> r3 = r12.A03;
                    int min = Math.min(r11.A03(C16620tM.A02, 1408), 12);
                    if (r3 == null || r3.size() < 2) {
                        throw new AnonymousClass23S(34, "poll_creation_invalid_options_count");
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (C58272tE r32 : r3) {
                        String str2 = (r32.A00 & 1) == 1 ? r32.A01 : null;
                        if (TextUtils.isEmpty(str2) || str2.length() > 2500) {
                            throw new AnonymousClass23S(34, "poll_creation_invalid_option");
                        }
                        C39631sn r1 = new C39631sn(str2);
                        if (!linkedHashSet.contains(r1)) {
                            linkedHashSet.add(r1);
                        }
                    }
                    if (linkedHashSet.size() < 2 || linkedHashSet.size() > min) {
                        throw new AnonymousClass23S(34, "poll_creation_invalid_options_count");
                    }
                    List list = this.A05;
                    list.clear();
                    list.addAll(linkedHashSet);
                    if ((r12.A00 & 4) == 4) {
                        int i2 = r12.A01;
                        if (i2 < 0 || i2 > this.A05.size()) {
                            throw new AnonymousClass23S(34, "poll_creation_invalid_selectable_options_count");
                        }
                        this.A01 = i2;
                        return;
                    }
                    throw new AnonymousClass23S(34, "poll_creation_missing_selectable_options_count");
                }
                throw new AnonymousClass23S(34, "poll_creation_missing_options");
            }
        } else {
            throw new AnonymousClass23S(34, "poll_creation_missing_name");
        }
    }

    public C39171s2(C28381Vw r3, long j2) {
        super(r3, (byte) 66, j2);
    }

    public C39171s2(C28381Vw r9, C39171s2 r10, long j2) {
        super(r10, r9, j2, true);
        this.A03 = r10.A03;
    }

    public void A0k(String str) {
        if (str == null) {
            str = "";
        }
        this.A03 = str;
    }

    public void A12(List list) {
        this.A04 = list;
        for (C39631sn r6 : this.A05) {
            int i2 = 0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C39181s3) ((C38541qx) it.next())).A05.contains(Long.valueOf(r6.A01))) {
                    i2++;
                }
            }
            r6.A00 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r2.A02((com.whatsapp.jid.GroupJid) r1) != 3) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5j(X.AnonymousClass21Q r9, X.AnonymousClass1GC r10) {
        /*
            r8 = this;
            X.0rt r2 = r10.A02
            X.1Vw r0 = r8.A11
            X.0rv r1 = r0.A00
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0014
            com.whatsapp.jid.GroupJid r1 = (com.whatsapp.jid.GroupJid) r1
            int r1 = r2.A02(r1)
            r0 = 3
            r7 = 1
            if (r1 == r0) goto L_0x0015
        L_0x0014:
            r7 = 0
        L_0x0015:
            X.1iE r4 = r9.A04
            X.1Wm r0 = r4.A00
            X.1iD r0 = (X.C33211iD) r0
            if (r7 == 0) goto L_0x00b6
            X.2uC r0 = r0.A0X
        L_0x001f:
            if (r0 != 0) goto L_0x0023
            X.2uC r0 = X.AnonymousClass2uC.A06
        L_0x0023:
            X.1Wr r5 = r0.A0U()
            java.lang.String r0 = r8.A03
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0040
            java.lang.String r2 = r8.A03
            r5.A03()
            X.1Wm r1 = r5.A00
            X.2uC r1 = (X.AnonymousClass2uC) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A05 = r2
        L_0x0040:
            X.1WV r2 = r9.A05
            byte[] r1 = r9.A0A
            boolean r0 = X.C41071vB.A0O(r2, r8, r1)
            if (r0 == 0) goto L_0x005f
            boolean r0 = r9.A07
            X.21S r0 = r10.A00(r2, r8, r1, r0)
            r5.A03()
            X.1Wm r1 = r5.A00
            X.2uC r1 = (X.AnonymousClass2uC) r1
            r1.A04 = r0
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
        L_0x005f:
            int r2 = r8.A01
            r5.A03()
            X.1Wm r1 = r5.A00
            X.2uC r1 = (X.AnonymousClass2uC) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A01 = r2
            r6 = 0
        L_0x0071:
            java.util.List r1 = r8.A05
            int r0 = r1.size()
            if (r6 >= r0) goto L_0x00ba
            X.2tE r0 = X.C58272tE.A02
            X.1Wr r3 = r0.A0U()
            java.lang.Object r0 = r1.get(r6)
            X.1sn r0 = (X.C39631sn) r0
            java.lang.String r2 = r0.A03
            r3.A03()
            X.1Wm r1 = r3.A00
            X.2tE r1 = (X.C58272tE) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A01 = r2
            X.1Wm r3 = r3.A02()
            r5.A03()
            X.1Wm r2 = r5.A00
            X.2uC r2 = (X.AnonymousClass2uC) r2
            X.1XE r1 = r2.A03
            r0 = r1
            X.1XF r0 = (X.AnonymousClass1XF) r0
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x00b0
            X.1XE r1 = X.C28541Wm.A0G(r1)
            r2.A03 = r1
        L_0x00b0:
            r1.add(r3)
            int r6 = r6 + 1
            goto L_0x0071
        L_0x00b6:
            X.2uC r0 = r0.A0Y
            goto L_0x001f
        L_0x00ba:
            X.1Wm r0 = r5.A02()
            X.2uC r0 = (X.AnonymousClass2uC) r0
            r4.A03()
            if (r7 == 0) goto L_0x00d4
            X.1Wm r2 = r4.A00
            X.1iD r2 = (X.C33211iD) r2
            r2.A0X = r0
            int r1 = r2.A01
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r2.A01 = r1
            return
        L_0x00d4:
            X.1Wm r1 = r4.A00
            X.1iD r1 = (X.C33211iD) r1
            r1.A0Y = r0
            int r0 = r1.A01
            r0 = r0 | 64
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39171s2.A5j(X.21Q, X.1GC):void");
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r4) {
        return new C39171s2(r4, this, this.A0I);
    }

    public List AGD() {
        return Collections.singletonList(new C28371Vv("meta", new C35081lL[]{new C35081lL("polltype", "creation")}));
    }
}
