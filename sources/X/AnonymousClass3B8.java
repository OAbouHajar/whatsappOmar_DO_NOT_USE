package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.3B8  reason: invalid class name */
public class AnonymousClass3B8 {
    public final C16040sK A00;
    public final AnonymousClass16V A01;
    public final AnonymousClass137 A02;
    public final C18030w2 A03;

    public AnonymousClass3B8(C16040sK r1, AnonymousClass16V r2, AnonymousClass137 r3, C18030w2 r4) {
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static C33211iD A00(C33211iD r5, int i2) {
        C28581Wr A0U = C33211iD.A0o.A0U();
        A0U.A04(r5);
        AnonymousClass21R r0 = ((C33211iD) A0U.A00).A0m;
        if (r0 == null) {
            r0 = AnonymousClass21R.A05;
        }
        C28581Wr A0U2 = r0.A0U();
        byte[] bArr = new byte[i2];
        C003601p.A00().nextBytes(bArr);
        C28631Ww A012 = C28631Ww.A01(bArr, 0, i2);
        AnonymousClass21R r1 = (AnonymousClass21R) C28581Wr.A00(A0U2);
        r1.A00 |= 8;
        r1.A03 = A012;
        C33211iD r2 = (C33211iD) C28581Wr.A00(A0U);
        r2.A0m = (AnonymousClass21R) A0U2.A02();
        r2.A00 |= 67108864;
        return (C33211iD) A0U.A02();
    }

    public static C33211iD A01(C33211iD r5, String str, String str2) {
        C28581Wr A0U = C58612tm.A04.A0U();
        if (r5 != null) {
            C58612tm r1 = (C58612tm) C28581Wr.A00(A0U);
            r1.A01 = r5;
            r1.A00 |= 2;
        }
        if (str != null) {
            C58612tm r12 = (C58612tm) C28581Wr.A00(A0U);
            r12.A00 |= 1;
            r12.A02 = str;
        }
        if (str2 != null) {
            C58612tm r13 = (C58612tm) C28581Wr.A00(A0U);
            r13.A00 |= 4;
            r13.A03 = str2;
        }
        C28581Wr A0U2 = C33211iD.A0o.A0U();
        C33211iD r2 = (C33211iD) C28581Wr.A00(A0U2);
        r2.A0B = (C58612tm) A0U.A02();
        r2.A00 |= 33554432;
        return (C33211iD) A0U2.A02();
    }

    public C33211iD A02(DeviceJid deviceJid, C33211iD r7, C28381Vw r8, String str) {
        String str2;
        C16040sK r4 = this.A00;
        if (!r4.A0I(deviceJid.getUserJid())) {
            return r7;
        }
        if (C16030sJ.A0H(r8.A00)) {
            Set<DeviceJid> A002 = this.A01.A00(r8);
            HashSet A0o = C13680ns.A0o();
            for (DeviceJid userJid : A002) {
                UserJid userJid2 = userJid.getUserJid();
                if (!r4.A0I(userJid2)) {
                    A0o.add(userJid2.getPrimaryDevice());
                }
            }
            str2 = C37431p9.A00(A0o);
        } else {
            str2 = null;
        }
        return A01(r7, str, str2);
    }
}
