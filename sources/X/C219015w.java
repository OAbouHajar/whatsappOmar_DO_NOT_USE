package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.15w  reason: invalid class name and case insensitive filesystem */
public class C219015w {
    public final C16300so A00;
    public final C14870pt A01;
    public final C17150uc A02;
    public final AnonymousClass13V A03;
    public final C16000sG A04;
    public final C17030uP A05;
    public final C16460t6 A06;
    public final C17640vP A07;
    public final C16490t9 A08;

    public C219015w(C16300so r1, C14870pt r2, C17150uc r3, AnonymousClass13V r4, C16000sG r5, C17030uP r6, C16460t6 r7, C17640vP r8, C16490t9 r9) {
        this.A01 = r2;
        this.A00 = r1;
        this.A08 = r9;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A05 = r6;
        this.A02 = r3;
        this.A03 = r4;
    }

    public void A00(DeviceJid deviceJid, List list, Map map) {
        int i2;
        int i3;
        String str;
        C40111ta r3;
        int i4;
        C28331Vq r2 = (C28331Vq) map.get(deviceJid.getUserJid());
        C28331Vq A002 = this.A05.A00(deviceJid.getUserJid());
        String str2 = null;
        C40111ta A003 = A002 != null ? A002.A00() : null;
        int A004 = C32441gM.A00(A002);
        if (A002 != null) {
            i2 = A002.A03;
            str2 = A002.A08;
        } else {
            i2 = 0;
        }
        if (r2 != null) {
            i3 = r2.A03;
            str = r2.A08;
            r3 = r2.A00();
            i4 = C32441gM.A00(r2);
        } else {
            i3 = i2;
            str = str2;
            r3 = A003;
            i4 = A004;
        }
        list.add(deviceJid.getUserJid());
        this.A06.A0R(deviceJid.getUserJid(), new C28341Vr(r3, A003, str, str2, i3, i2, i4, A004).A01());
    }
}
