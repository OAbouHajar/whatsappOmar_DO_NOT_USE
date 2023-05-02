package X;

import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1pN  reason: invalid class name and case insensitive filesystem */
public class C37571pN extends C29861bL {
    public C37591pP A00;
    public boolean A01 = false;

    public C37571pN(C28381Vw r2, long j2) {
        super(r2, (byte) 38, j2);
    }

    public HashMap A12() {
        C37591pP r0 = this.A00;
        AnonymousClass00B.A06(r0);
        HashMap hashMap = new HashMap();
        for (C37581pO A002 : r0.A00) {
            Pair A003 = AnonymousClass1WY.A00(A002);
            hashMap.put(A003.first, A003.second);
        }
        return hashMap;
    }

    public void A13(HashMap hashMap) {
        C28581Wr A0U = C37591pP.A01.A0U();
        for (Map.Entry entry : hashMap.entrySet()) {
            AnonymousClass1WK r1 = (AnonymousClass1WK) entry.getKey();
            AnonymousClass1WY r0 = (AnonymousClass1WY) entry.getValue();
            C28511Wj r7 = r0 != null ? r0.A00 : null;
            C28581Wr A0U2 = C37581pO.A03.A0U();
            C37611pR A02 = r1.A02();
            A0U2.A03();
            C37581pO r12 = (C37581pO) A0U2.A00;
            r12.A02 = A02;
            r12.A00 |= 1;
            if (r7 != null) {
                C28581Wr A0U3 = C58582tj.A04.A0U();
                byte[] bArr = r7.A02;
                C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
                A0U3.A03();
                C58582tj r13 = (C58582tj) A0U3.A00;
                r13.A00 |= 1;
                r13.A02 = A012;
                long j2 = r7.A00;
                A0U3.A03();
                C58582tj r5 = (C58582tj) A0U3.A00;
                r5.A00 |= 4;
                r5.A01 = j2;
                C35741mQ A013 = r7.A01.A01();
                A0U3.A03();
                C58582tj r14 = (C58582tj) A0U3.A00;
                r14.A03 = A013;
                r14.A00 |= 2;
                A0U2.A03();
                C37581pO r15 = (C37581pO) A0U2.A00;
                r15.A01 = (C58582tj) A0U3.A02();
                r15.A00 |= 2;
            }
            C28541Wm A022 = A0U2.A02();
            A0U.A03();
            C37591pP r2 = (C37591pP) A0U.A00;
            AnonymousClass1XE r16 = r2.A00;
            if (!((AnonymousClass1XF) r16).A00) {
                r16 = C28541Wm.A0G(r16);
                r2.A00 = r16;
            }
            r16.add(A022);
        }
        this.A00 = (C37591pP) A0U.A02();
    }
}
