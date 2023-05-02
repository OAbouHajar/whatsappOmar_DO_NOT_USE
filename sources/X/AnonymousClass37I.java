package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.37I  reason: invalid class name */
public class AnonymousClass37I extends C16690tT {
    public final AnonymousClass177 A00;
    public final AnonymousClass128 A01;
    public final AnonymousClass184 A02;
    public final AnonymousClass11G A03;
    public final C16220sf A04;
    public final AnonymousClass1L1 A05;
    public final C23631Ct A06;
    public final AnonymousClass01D A07;

    public AnonymousClass37I(AnonymousClass177 r2, AnonymousClass128 r3, AnonymousClass184 r4, AnonymousClass11G r5, C16220sf r6, AnonymousClass1L1 r7, C34661kf r8, C23631Ct r9, AnonymousClass01D r10) {
        super(r8, true);
        this.A03 = r5;
        this.A06 = r9;
        this.A04 = r6;
        this.A01 = r3;
        this.A05 = r7;
        this.A02 = r4;
        this.A00 = r2;
        this.A07 = r10;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        AnonymousClass17S r3 = this.A05.A0B;
        r3.ALF(453128091, 2);
        r3.AL9(453128091, "REFRESH_TASK_START", 2);
        List<C30991dI> A072 = this.A03.A07();
        ArrayList A0u = AnonymousClass000.A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        ArrayList A0u3 = AnonymousClass000.A0u();
        HashMap A0x = AnonymousClass000.A0x();
        HashMap A0x2 = AnonymousClass000.A0x();
        HashMap A0x3 = AnonymousClass000.A0x();
        C30991dI r16 = null;
        for (C30991dI r2 : A072) {
            AnonymousClass128 r10 = this.A01;
            UserJid userJid = r2.A0B;
            C16740tZ A002 = r10.A00(userJid);
            if (A002 instanceof C38701rH) {
                this.A00.A01((C38701rH) A002);
            }
            if (r2.A0B()) {
                r16 = r2;
            } else if (this.A04.A0R(userJid)) {
                A0u3.add(r2);
            } else if (r2.A02() > 0) {
                A0u.add(r2);
            } else {
                A0u2.add(r2);
            }
            if (C16030sJ.A0P(userJid)) {
                Iterator it = r10.A01(userJid).iterator();
                while (it.hasNext()) {
                    C16740tZ A0V = C13680ns.A0V(it);
                    String str = this.A02.A00(A0V).A04;
                    if (str != null) {
                        String str2 = A0V.A11.A01;
                        if (A0x2.get(str2) == null) {
                            Number A0X = C13680ns.A0X();
                            if (A0x3.containsKey(str)) {
                                A0X = (Number) A0x3.get(str);
                                i2 = Integer.valueOf(A0X != null ? A0X.intValue() + 1 : 1);
                            } else {
                                i2 = 1;
                            }
                            A0x3.put(str, i2);
                            A0x2.put(str2, A0X);
                        }
                        boolean containsKey = A0x.containsKey(str);
                        int A0D = r2.A0D(A0V);
                        if (containsKey) {
                            if (A0D != 0) {
                                A0D = AnonymousClass000.A0D(A0x.get(str)) + 1;
                            }
                        }
                        C13680ns.A1X(str, A0x, A0D);
                    }
                }
            }
        }
        return new C45782Ay(r16, A0u, A0u2, A0u3, A0x, A0x2);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C45782Ay r5 = (C45782Ay) obj;
        AnonymousClass17S r3 = this.A05.A0B;
        r3.AL9(453128091, "REFRESH_TASK_END", 2);
        C34661kf r0 = (C34661kf) A04(C34661kf.class);
        if (r0 != null) {
            r0.AXj(r5);
        }
        r3.AL9(453128091, "REFRESH_TASK_POPULATED", 2);
        r3.AKy(453128091, 2, 2);
    }
}
