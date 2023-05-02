package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0wS  reason: invalid class name and case insensitive filesystem */
public class C18290wS {
    public C42511xv A00;
    public AnonymousClass1GR A01;
    public C42501xu A02;
    public boolean A03;
    public final C16300so A04;
    public final C15900s5 A05;
    public final C16980tz A06;
    public final AnonymousClass013 A07;
    public final C221116r A08;
    public final AnonymousClass160 A09;
    public final AnonymousClass175 A0A;
    public final AnonymousClass17P A0B;
    public final AnonymousClass17O A0C;
    public final AnonymousClass174 A0D;
    public final C18090w8 A0E;
    public final AnonymousClass17Q A0F;
    public final AnonymousClass1Vo A0G = AnonymousClass1Vo.A00("PaymentsManager", "infra", "COMMON");
    public final C16320sq A0H;

    public C18290wS(C16300so r4, C15900s5 r5, C16980tz r6, AnonymousClass013 r7, C221116r r8, AnonymousClass160 r9, AnonymousClass175 r10, AnonymousClass17P r11, AnonymousClass17O r12, AnonymousClass174 r13, C18090w8 r14, AnonymousClass17Q r15, C16320sq r16) {
        this.A04 = r4;
        this.A06 = r6;
        this.A0H = r16;
        this.A09 = r9;
        this.A05 = r5;
        this.A07 = r7;
        this.A0A = r10;
        this.A0F = r15;
        this.A0E = r14;
        this.A0D = r13;
        this.A0B = r11;
        this.A08 = r8;
        this.A0C = r12;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.1xt} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.1m3] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C42481xs r3, X.C38531qw r4, com.whatsapp.jid.UserJid r5) {
        /*
            X.0wS r0 = r3.A0K
            r0.A06()
            X.17Q r1 = r0.A0F
            java.lang.String r3 = r4.A0L
            X.1GR r0 = r1.A00
            X.19r r2 = r0.AFy()
            r0 = 0
            if (r2 == 0) goto L_0x0020
            java.util.Map r1 = r1.A01
            if (r1 == 0) goto L_0x001c
            java.lang.Object r0 = r1.get(r5)
            X.1m3 r0 = (X.C35511m3) r0
        L_0x001c:
            X.1xt r0 = r2.AGq(r0, r5, r3)
        L_0x0020:
            r4.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18290wS.A00(X.1xs, X.1qw, com.whatsapp.jid.UserJid):void");
    }

    public C42511xv A01() {
        A06();
        C42511xv r0 = this.A00;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public synchronized C28391Vx A02(String str) {
        AnonymousClass1GR r0;
        A06();
        r0 = this.A01;
        return r0 == null ? null : r0.AIM(str);
    }

    @Deprecated
    public synchronized C228919r A03() {
        C42501xu r0;
        A06();
        r0 = this.A02;
        AnonymousClass00B.A06(r0);
        return r0;
    }

    public C228919r A04(String str) {
        A06();
        AnonymousClass1GR r0 = this.A01;
        if (r0 != null) {
            return r0.AEr(str);
        }
        return null;
    }

    public C228919r A05(String str) {
        C228919r A042 = A04(str);
        AnonymousClass00B.A06(A042);
        return A042;
    }

    public final synchronized void A06() {
        if (!this.A03) {
            AnonymousClass1GR r0 = this.A01;
            if (r0 == null) {
                r0 = (AnonymousClass1GR) ((C16150sX) ((AnonymousClass01F) AnonymousClass01I.A00(this.A06.A00, AnonymousClass01F.class))).AHK.get();
                this.A01 = r0;
            }
            this.A01 = r0;
            if (r0 == null) {
                this.A0G.A05("initialize/paymentConfig is null");
            } else {
                this.A02 = new C42501xu(this.A05, this.A07, this.A0D, r0.AFy());
                AnonymousClass160 r4 = this.A09;
                AnonymousClass1GR r02 = this.A01;
                synchronized (r4) {
                    r4.A01 = r02;
                    C42521xw r1 = new C42521xw(r4);
                    if (!r4.A08) {
                        r4.A00 = new C39861tB(r4.A04.A00, r4.A02, r4.A06, r4.A07, Collections.singleton(r1));
                        r4.A08 = true;
                    }
                }
                C221116r r3 = this.A08;
                AnonymousClass1GR r2 = this.A01;
                r3.A00 = r2;
                this.A0F.A00 = r2;
                this.A00 = new C42511xv(r3, r4, r2, this.A0H);
                this.A03 = true;
                this.A0G.A06("initialized");
            }
        }
    }

    public void A07(AnonymousClass1TV r7) {
        Map map;
        boolean z2;
        A06();
        AnonymousClass17P r5 = this.A0B;
        if (r5 != null) {
            synchronized (r5) {
                map = r5.A00;
                z2 = false;
                if (map.size() > 0) {
                    z2 = true;
                }
            }
            if (z2) {
                synchronized (r5) {
                    HashSet hashSet = new HashSet();
                    for (String str : map.keySet()) {
                        if (map.get(str) == r7) {
                            hashSet.add(str);
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        map.remove((String) it.next());
                    }
                }
            }
        }
    }

    public synchronized void A08(boolean z2, boolean z3) {
        this.A0G.A06("reset");
        A06();
        this.A03 = false;
        AnonymousClass174 r3 = this.A0D;
        synchronized (r3) {
            try {
                r3.A05.A03((String) null, "reset country");
                r3.A00 = null;
                r3.A01 = false;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        }
        if (this.A09.A08 && !z3) {
            C42511xv r0 = this.A00;
            r0.A03.Ack(new C42531xx(r0), new Void[0]);
        }
        this.A0B.A00();
        if (z2) {
            this.A0A.A05();
        } else {
            this.A0A.A06();
        }
        C227719f AEO = A03().AEO();
        if (AEO != null) {
            synchronized (AEO) {
                try {
                    if (AEO.A02(C23851Dp.A00)) {
                        AEO.A01.clear();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        C227219a AB3 = this.A02.AB3();
        if (AB3 != null) {
            AB3.A7m();
        }
        C227519d AB4 = this.A02.AB4();
        if (AB4 != null) {
            AB4.clear();
            AB4.Aee();
        }
    }
}
