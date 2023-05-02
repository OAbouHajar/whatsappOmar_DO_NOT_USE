package X;

import com.facebook.redex.IDxFactoryShape404S0100000_1_I0;
import com.obwhatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.ViewOnClickCListenerShape0S0201000_I1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.2Z2  reason: invalid class name */
public class AnonymousClass2Z2 implements C16710tV {
    public AnonymousClass32L A00;
    public C102284yh A01;
    public C102264yf A02;
    public C102294yi A03;
    public C102274yg A04;
    public C62883Fh A05;
    public C62903Fj A06;
    public C109195Rb A07;
    public C109205Rc A08;
    public C109215Rd A09;
    public AnonymousClass3FG A0A;
    public AnonymousClass4HM A0B;
    public C84794Lx A0C;
    public BusinessDirectoryContextualSearchViewModel A0D;
    public final C17180uf A0E;
    public final AnonymousClass2Z1 A0F;
    public final AnonymousClass2Yy A0G;
    public final AnonymousClass2Yx A0H;
    public final AnonymousClass2Yz A0I;
    public final AnonymousClass2Z0 A0J;
    public final C50312Yv A0K;
    public final AnonymousClass2Yw A0L;
    public final C25591Kj A0M;
    public final C16000sG A0N;
    public final C18110wA A0O;
    public final C18120wB A0P;
    public final Set A0Q = new HashSet();

    public AnonymousClass2Z2(C17180uf r2, AnonymousClass2Z1 r3, AnonymousClass2Yy r4, AnonymousClass2Yx r5, AnonymousClass2Yz r6, AnonymousClass2Z0 r7, C50312Yv r8, AnonymousClass2Yw r9, C25601Kk r10, C16000sG r11, C18110wA r12, C18120wB r13) {
        this.A0N = r11;
        this.A0E = r2;
        this.A0O = r12;
        this.A0I = r6;
        this.A0K = r8;
        this.A0L = r9;
        this.A0H = r5;
        this.A0P = r13;
        this.A0G = r4;
        this.A0J = r7;
        this.A0F = r3;
        this.A0M = r10.A00;
    }

    public void A00() {
        Set<C16650tP> set = this.A0Q;
        for (C16650tP r0 : set) {
            C16690tT r2 = r0.A06;
            if (r2.A03() != 2 && !r2.A02.isCancelled()) {
                r2.A06(true);
            }
        }
        set.clear();
    }

    public final void A01() {
        AnonymousClass32L r0 = this.A00;
        if (r0 != null && r0.A06.A03() != 2 && !this.A00.A06.A02.isCancelled()) {
            this.A00.A06.A06(true);
            this.A00 = null;
        }
    }

    public void A02(AnonymousClass4HF r13, AnonymousClass4R9 r14, AnonymousClass26B r15, Jid jid, String str) {
        A01();
        Jid jid2 = jid;
        if (this.A0E.A03()) {
            C102294yi r6 = new C102294yi(r15, this, jid2);
            this.A03 = r6;
            C59772yv A7C = this.A0G.A7C(r13, r14, r15, (C31241dn) null, r6, this.A0O.A00, "all_descendents", "all_descendents", str, "chaining");
            A7C.A04();
            this.A00 = A7C;
            return;
        }
        C102264yf r2 = new C102264yf(this);
        this.A02 = r2;
        C59712yp A7A = this.A0H.A7A(r2, this.A0O.A00, jid2);
        A7A.A04();
        this.A00 = A7A;
    }

    public void A03(AnonymousClass4HF r13, AnonymousClass4R9 r14, AnonymousClass26B r15, String str) {
        if (!(this.A00 instanceof C59742ys)) {
            A01();
        }
        C102294yi r6 = new C102294yi(r15, this, (Jid) null);
        this.A03 = r6;
        C59772yv A7C = this.A0G.A7C(r13, r14, r15, (C31241dn) null, r6, this.A0O.A00, "all_descendents", "all_descendents", str, "nearby");
        A7C.A04();
        this.A00 = A7C;
    }

    public void A04(AnonymousClass4HF r24, AnonymousClass4R9 r25, AnonymousClass26B r26, String str, String str2, int i2, int i3) {
        AnonymousClass33J r0;
        AnonymousClass26B r6 = r26;
        String str3 = str;
        int i4 = i2;
        int i5 = i3;
        C62923Fl r10 = new C62923Fl(r6, this, str3, i4, i5);
        AnonymousClass4HF r4 = r24;
        AnonymousClass4R9 r5 = r25;
        String str4 = str2;
        if (i2 == 0) {
            AnonymousClass2Yz r3 = this.A0I;
            C25551Kf r8 = this.A0O.A00;
            r3.A7D(r4, r5, r6, r10, r8, str3, str4, 2, true, false).A04();
            r3.A7D(r4, r5, r6, r10, r8, str3, str4, 1, true, false).A04();
            int i6 = r10.A02;
            if (i6 == 0 || i6 == 2) {
                r0 = this.A0P.A7B(r10, r8, str3);
            } else {
                return;
            }
        } else if (i4 == 1) {
            if (i5 == 1 || i3 == 0) {
                this.A0I.A7D(r4, r5, r6, r10, this.A0O.A00, str3, str4, 3, true, true).A04();
                if (i3 != 0) {
                    return;
                }
            } else if (i5 != 2) {
                return;
            }
            r0 = this.A0P.A7B(r10, this.A0O.A00, str3);
        } else {
            return;
        }
        r0.A04();
    }

    public void A05(AnonymousClass26B r15) {
        if (!(this.A00 instanceof C59772yv)) {
            A01();
        }
        C102274yg r11 = new C102274yg(this);
        this.A04 = r11;
        C50312Yv r2 = this.A0K;
        C25551Kf r12 = this.A0O.A00;
        IDxFactoryShape404S0100000_1_I0 iDxFactoryShape404S0100000_1_I0 = (IDxFactoryShape404S0100000_1_I0) r2;
        int i2 = iDxFactoryShape404S0100000_1_I0.A01;
        Object obj = iDxFactoryShape404S0100000_1_I0.A00;
        C16150sX r1 = i2 != 0 ? ((AnonymousClass2FC) obj).A02 : ((C50212Yk) obj).A03;
        C16300so r22 = (C16300so) r1.A5p.get();
        C16980tz r7 = (C16980tz) r1.AQB.get();
        AnonymousClass013 r9 = (AnonymousClass013) r1.AR8.get();
        C16670tR A072 = C16150sX.A07(r1);
        C17120uZ r8 = (C17120uZ) r1.AQT.get();
        C59742ys r13 = new C59742ys(r22, A072, (C25531Kd) r1.A2q.get(), (C17210ui) r1.A73.get(), r15, r7, r8, r9, (C14710pd) r1.A05.get(), r11, r12, (C16320sq) r1.ARB.get());
        r13.A04();
        this.A00 = r13;
    }

    public void AQR(int i2) {
        AnonymousClass4HM r2 = this.A0B;
        if (r2 != null) {
            C84784Lw r1 = r2.A01;
            r1.A01 = 4;
            r1.A00 = i2;
            r2.A00.A09(r1);
        }
    }

    public /* bridge */ /* synthetic */ void AYB(Object obj) {
        C84784Lw r1;
        List list = (List) obj;
        AnonymousClass4HM r7 = this.A0B;
        if (r7 != null) {
            if (list.isEmpty()) {
                r1 = r7.A01;
                r1.A01 = 3;
            } else {
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (i2 < list.size()) {
                    C31241dn r4 = (C31241dn) list.get(i2);
                    i2++;
                    arrayList.add(new C72113la(new ViewOnClickCListenerShape0S0201000_I1(r7, i2, r4, 0), r4.A00, r4.A01));
                }
                r1 = r7.A01;
                r1.A01 = 1;
                List list2 = r1.A03;
                list2.clear();
                list2.addAll(arrayList);
            }
            r7.A00.A09(r1);
        }
    }
}
