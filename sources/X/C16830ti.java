package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0ti  reason: invalid class name and case insensitive filesystem */
public class C16830ti extends C16740tZ implements C16840tj, C16850tk, C16860tl {
    public C16880tn A00;

    public C16830ti(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public C16830ti(C28381Vw r8, C16830ti r9, long j2, boolean z2) {
        super(r9, r8, j2, z2);
        this.A00 = r9.A00;
        A12();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16830ti(C59042ua r25, C28381Vw r26, byte b2, long j2) {
        this(r26, b2, j2);
        C35171lU r1;
        AnonymousClass1XE<C58682tt> r12;
        C59042ua r9 = r25;
        if (!TextUtils.isEmpty(r9.A06) && (r9.A00 & 8) == 8 && (!TextUtils.isEmpty(r9.A05) || r9.A0c() != AnonymousClass42U.A02)) {
            AnonymousClass42U A0c = r9.A0c();
            if (A0c == AnonymousClass42U.A02) {
                AnonymousClass1XE r3 = r9.A02;
                if (!(r3 == null || r3.size() == 0)) {
                    int i2 = 0;
                    while (i2 < r3.size()) {
                        C58442tV r13 = (C58442tV) r3.get(i2);
                        if (!((i2 != 0 && TextUtils.isEmpty(r13.A02)) || (r12 = r13.A01) == null || r12.size() == 0)) {
                            for (C58682tt r0 : r12) {
                                if (TextUtils.isEmpty(r0.A03)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
            } else if (A0c == AnonymousClass42U.A01) {
                C58672ts r14 = r9.A04;
                r14 = r14 == null ? C58672ts.A04 : r14;
                AnonymousClass1XE r02 = r14.A01;
                if (r02 != null && r02.size() != 0) {
                    loop2:
                    for (C58432tU r15 : r14.A01) {
                        AnonymousClass1XE r03 = r15.A01;
                        if (r03 != null && r03.size() != 0) {
                            Iterator it = r15.A01.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (TextUtils.isEmpty(((C58232tA) it.next()).A01)) {
                                        break loop2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C35201lX r7 = new C35201lX(r9.A08, (String) null, (byte[]) null);
            String str = r9.A06;
            String str2 = r9.A07;
            String str3 = r9.A05;
            AnonymousClass1XE<C58442tV> r04 = r9.A02;
            ArrayList arrayList = new ArrayList();
            if (r04 != null) {
                for (C58442tV r05 : r04) {
                    String str4 = r05.A02;
                    AnonymousClass1XE<C58682tt> r06 = r05.A01;
                    ArrayList arrayList2 = new ArrayList();
                    for (C58682tt r07 : r06) {
                        arrayList2.add(new C35111lO(r07.A02, r07.A03, r07.A01));
                    }
                    arrayList.add(new C35121lP(str4, arrayList2));
                }
            }
            C58672ts r122 = r9.A04;
            r122 = r122 == null ? C58672ts.A04 : r122;
            C58422tT r08 = r122.A02;
            byte[] A04 = (r08 == null ? C58422tT.A03 : r08).A01.A04();
            C58422tT r09 = r122.A02;
            C35151lS r11 = new C35151lS((r09 == null ? C58422tT.A03 : r09).A02, A04, false);
            String str5 = r122.A03;
            try {
                AnonymousClass1XE<C58432tU> r010 = r122.A01;
                ArrayList arrayList3 = new ArrayList();
                if (r010 != null) {
                    for (C58432tU r011 : r010) {
                        String str6 = r011.A02;
                        AnonymousClass1XE<C58232tA> r012 = r011.A01;
                        ArrayList arrayList4 = new ArrayList();
                        if (r012 != null) {
                            for (C58232tA r013 : r012) {
                                arrayList4.add(new C35161lT(r013.A01));
                            }
                        }
                        arrayList3.add(new C35141lR(str6, arrayList4));
                    }
                }
                r1 = new C35171lU(UserJid.get(str5), r11, arrayList3);
            } catch (AnonymousClass1W4 e2) {
                StringBuilder sb = new StringBuilder("FMessageMultiElement/parseE2EProductListInfo/Invalid jid: ");
                sb.append(str5);
                Log.e(sb.toString(), e2);
                r1 = null;
            }
            this.A00 = new C16880tn((C35251lc) null, r7, r1, str, str2, str3, arrayList, r9.A0c().value);
            A12();
            return;
        }
        StringBuilder sb2 = new StringBuilder("FMessageMultiElement/parseE2EMessage/invalid message; message.key=");
        sb2.append(this.A11);
        Log.w(sb2.toString());
        throw new AnonymousClass23S(26);
    }

    public final void A12() {
        C16870tm A0F = A0F();
        AnonymousClass00B.A06(A0F);
        byte[] A13 = A13();
        if (A13 != null) {
            A0F.A03(A13, true);
        } else {
            A0F.A02((byte[]) null);
        }
    }

    public byte[] A13() {
        byte[] bArr;
        C16880tn r3 = this.A00;
        if (r3 == null) {
            return null;
        }
        C35171lU r2 = r3.A04;
        if (r2 != null && r3.A00 == 2) {
            return r2.A01.A02;
        }
        C35251lc r22 = r3.A01;
        if (r22 != null && r3.A00 == 3) {
            return r22.A0E;
        }
        C35201lX r0 = r3.A02;
        if (r0 == null || (bArr = r0.A02) == null) {
            return null;
        }
        return bArr;
    }

    public /* bridge */ /* synthetic */ C16740tZ A6L(C28381Vw r7, long j2) {
        return new C16830ti(r7, this, j2, false);
    }

    public C16740tZ A6M(C28381Vw r7) {
        return new C16830ti(r7, this, this.A0I, true);
    }

    public C16880tn AAt() {
        return this.A00;
    }

    public void Adh(C16880tn r1) {
        this.A00 = r1;
        A12();
    }
}
