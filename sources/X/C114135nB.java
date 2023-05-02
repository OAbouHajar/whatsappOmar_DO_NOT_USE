package X;

import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5nB  reason: invalid class name and case insensitive filesystem */
public class C114135nB extends C114625o5 {
    public final /* synthetic */ C110755em A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C114135nB(C110755em r1, C28381Vw r2, String str, boolean z2) {
        super(r1, r2, str, z2);
        this.A00 = r1;
    }

    public C117415sx A0B() {
        C16830ti r5;
        AnonymousClass1Vt r2;
        int i2;
        UserJid userJid;
        int i3;
        List list;
        String str;
        C110755em r4 = this.A00;
        C28381Vw r8 = r4.A08;
        AnonymousClass00B.A06(r8);
        C15830rv r7 = r8.A00;
        C111785hP r15 = null;
        if (r7 != null) {
            r5 = r4.A0S.A00(r8.A01);
            if (r5 != null) {
                C16880tn r0 = r5.A00;
                AnonymousClass00B.A06(r0);
                C35251lc r02 = r0.A01;
                AnonymousClass00B.A06(r02);
                C35211lY r1 = r02.A06;
                AnonymousClass00B.A06(r02);
                C28411Vz r11 = r02.A04;
                AnonymousClass00B.A06(r1);
                int i4 = r1.A00;
                AnonymousClass00B.A06(r1);
                long j2 = r1.A01;
                if (i4 <= 0) {
                    i4 = 1;
                }
                C35431lv r3 = new C35431lv(r11, i4, j2);
                UserJid A0C = r5.A0C();
                AnonymousClass00B.A06(A0C);
                boolean z2 = r8.A02;
                if (z2) {
                    i2 = 200;
                    userJid = (UserJid) r7;
                } else {
                    i2 = 100;
                    userJid = A0C;
                    A0C = (UserJid) r7;
                }
                AnonymousClass00B.A06(r11);
                String str2 = ((C35491m1) r11).A04;
                BigDecimal bigDecimal = r3.A02.A00;
                AnonymousClass00B.A06(r02);
                long j3 = r02.A00 * 1000;
                String str3 = r02.A01;
                String str4 = "confirm";
                if (str4.equals(str3)) {
                    boolean equals = "captured".equals(r02.A02);
                    if (z2) {
                        i3 = 903;
                        if (equals) {
                            i3 = 904;
                        }
                    } else {
                        i3 = 803;
                        if (equals) {
                            i3 = 804;
                        }
                    }
                } else if ("payment_instruction".equals(str3)) {
                    boolean equals2 = "captured".equals(r02.A02);
                    if (z2) {
                        i3 = 901;
                        if (equals2) {
                            i3 = 902;
                        }
                    } else {
                        i3 = 801;
                        if (equals2) {
                            i3 = 802;
                        }
                    }
                } else {
                    i3 = 401;
                    if (z2) {
                        i3 = 101;
                    }
                }
                r2 = AnonymousClass1W1.A02(r11, userJid, A0C, str2, (String) null, (String) null, (String) null, (String) null, "BR", bigDecimal, (byte[]) null, i2, i3, 1, 0, 0, j3, j3);
                AnonymousClass1W2 AI7 = r4.A05().AI7();
                if (AI7 != null) {
                    C35421lu r12 = new C35421lu(r02.A09, r5.A11.A01, (String) null, 0);
                    synchronized (r2) {
                        AnonymousClass1W2 r32 = r2.A0A;
                        if (r32 == null) {
                            r2.A0A = AI7;
                            r32 = AI7;
                        }
                        r32.A02 = r12;
                    }
                }
                String str5 = r02.A01;
                if (str4.equals(str5)) {
                    str = r4.A0P.A00.getString(R.string.str1111);
                } else {
                    str4 = "payment_instruction";
                    if (str4.equals(str5) && (list = r02.A0C) != null) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            str = ((C35231la) it.next()).A00;
                            if (!TextUtils.isEmpty(str)) {
                                break;
                            }
                        }
                    }
                }
                r15 = new C111785hP(str4, str);
            } else {
                r2 = null;
            }
        } else {
            r2 = null;
            r5 = null;
        }
        return new C117415sx(r15, r2, (C16740tZ) null, r5, true);
    }
}
