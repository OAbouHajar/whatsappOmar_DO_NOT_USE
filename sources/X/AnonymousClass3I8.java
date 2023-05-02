package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3I8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I8 implements Runnable {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ AnonymousClass1L1 A01;
    public final /* synthetic */ Integer A02;
    public final /* synthetic */ Long A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3I8(UserJid userJid, AnonymousClass1L1 r2, Integer num, Long l2, String str, String str2, String str3, boolean z2) {
        this.A01 = r2;
        this.A02 = num;
        this.A04 = str;
        this.A03 = l2;
        this.A05 = str2;
        this.A06 = str3;
        this.A00 = userJid;
        this.A07 = z2;
    }

    public final void run() {
        AnonymousClass1L1 r6 = this.A01;
        Integer num = this.A02;
        String str = this.A04;
        Long l2 = this.A03;
        String str2 = this.A05;
        String str3 = this.A06;
        UserJid userJid = this.A00;
        boolean z2 = this.A07;
        AnonymousClass320 r3 = new AnonymousClass320();
        r3.A02 = num;
        C47502Jf r10 = r6.A01;
        if (r10 != null) {
            r3.A03 = C13680ns.A0Z();
            r3.A06 = Long.valueOf(r10.A02);
            r3.A07 = Long.valueOf(r10.A03);
            r3.A08 = str;
            r3.A09 = r10.A07;
            if (str != null) {
                r3.A05 = l2;
                Number number = (Number) r6.A0H.get(str2);
                r3.A04 = C13690nt.A0W(number != null ? number.intValue() : 0);
            }
        } else {
            r3.A03 = 1;
            C47482Jd r0 = r6.A00;
            r3.A06 = Long.valueOf(r0 == null ? 0 : r0.A05);
            r3.A09 = str3;
        }
        C16010sH A08 = r6.A03.A08(userJid);
        if (A08 != null) {
            r3.A00 = Boolean.valueOf(A08.A0H());
            r3.A01 = Boolean.valueOf(A08.A0G());
        }
        boolean isEmpty = TextUtils.isEmpty(r3.A09);
        C16490t9 r1 = r6.A09;
        if (isEmpty) {
            r1.A05(r3);
        } else {
            r1.A0B(r3, AnonymousClass3B1.A00, true);
        }
        C47502Jf r02 = r6.A01;
        if (r02 != null) {
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator A0q = C13680ns.A0q(r02.A0D);
            while (A0q.hasNext()) {
                A0u.addAll(((C85384Of) A0q.next()).A08.values());
            }
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                AnonymousClass4PH r9 = (AnonymousClass4PH) it.next();
                String str4 = r9.A0K;
                if (str4.equals(str2)) {
                    Long valueOf = Long.valueOf(r9.A09);
                    Boolean valueOf2 = Boolean.valueOf(r9.A0M);
                    UserJid userJid2 = r9.A0A;
                    int intValue = r9.A0F.intValue();
                    Boolean valueOf3 = (intValue == 4 || intValue == 3) ? Boolean.valueOf(C13700nu.A0f((r9.A08 > r9.A06 ? 1 : (r9.A08 == r9.A06 ? 0 : -1)))) : Boolean.TRUE;
                    Integer valueOf4 = Integer.valueOf(C27691St.A00(r9.A02));
                    C27691St r11 = r6.A0E;
                    boolean z3 = z2;
                    C14710pd r2 = r11.A01;
                    C16620tM r12 = C16620tM.A02;
                    if (!r2.A0E(r12, 2817)) {
                        z3 = r2.A0E(r12, 2062);
                    }
                    if (z3) {
                        AnonymousClass2TW A012 = r11.A01(userJid2, valueOf3, valueOf2, valueOf4, valueOf, str4);
                        A012.A05 = C13690nt.A0T();
                        C16490t9 r03 = r11.A02;
                        if (z2) {
                            r03.A04(A012);
                        } else {
                            r03.A06(A012);
                        }
                    }
                }
            }
        }
    }
}
