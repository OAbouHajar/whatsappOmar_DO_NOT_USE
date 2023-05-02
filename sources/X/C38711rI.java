package X;

import com.whatsapp.util.Log;

/* renamed from: X.1rI  reason: invalid class name and case insensitive filesystem */
public class C38711rI extends C38721rJ implements C16850tk, C30081bi {
    public C38711rI(C16750ta r9, C28381Vw r10, C38711rI r11, long j2) {
        super(r9, r10, (C16730tY) r11, (byte) 3, j2, false);
    }

    public C38711rI(C16750ta r9, C28381Vw r10, C38711rI r11, long j2, boolean z2) {
        super(r9, r10, (C16730tY) r11, r11.A10, j2, z2);
    }

    public C38711rI(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public C38711rI(C28381Vw r2, long j2) {
        super(r2, (byte) 3, j2);
    }

    public C38711rI(C445524n r2, C28381Vw r3, byte b2, long j2, boolean z2, boolean z3) {
        super(r2, r3, (byte) 62, j2, z2, z3);
        A1B(r2);
    }

    public C38711rI(C445524n r9, C28381Vw r10, long j2, boolean z2, boolean z3) {
        super(r9, r10, (byte) 3, j2, z2, z3);
        A1B(r9);
    }

    public void A5j(AnonymousClass21Q r15, AnonymousClass1GC r16) {
        StringBuilder sb;
        String str;
        AnonymousClass1GC r10 = r16;
        if (this instanceof C38921rd) {
            C38921rd r7 = (C38921rd) this;
            C33221iE r4 = r15.A04;
            C69633fM r3 = (C69633fM) r4.A05().A0U();
            C59032uZ r2 = r4.A05().A03;
            if (r2 == null) {
                r2 = C59032uZ.A07;
            }
            C28541Wm r0 = r2.A01 == 4 ? (C28541Wm) r2.A03 : C445524n.A0O;
            boolean z2 = r15.A09;
            C69593fI A19 = r7.A19((C69593fI) r0.A0U(), r15.A05, r10, r15.A0A, z2, r15.A07);
            C16750ta r02 = r7.A02;
            if (r02 == null || ((!z2 && r02.A0U == null) || A19 == null)) {
                sb = new StringBuilder();
                str = "FMessageTemplateVideo/unable to send encrypted media message due to missing; media_wa_type=";
            } else {
                C42591y4 A12 = r7.A12();
                AnonymousClass00B.A06(A12);
                byte[] A05 = A12.A05();
                if (A05 != null) {
                    C28631Ww A01 = C28631Ww.A01(A05, 0, A05.length);
                    A19.A03();
                    C445524n r22 = (C445524n) A19.A00;
                    r22.A00 |= 32768;
                    r22.A0B = A01;
                }
                C30611cf r03 = r7.A00;
                if (r03 != null) {
                    C69583fH A00 = AnonymousClass38C.A00(r4, r03);
                    A00.A03();
                    C59032uZ r1 = (C59032uZ) A00.A00;
                    r1.A03 = A19.A02();
                    r1.A01 = 4;
                    r3.A06(A00);
                    r3.A05(A00);
                    r4.A0D(r3);
                    return;
                }
                sb = new StringBuilder();
                str = "MessageTemplateVideo: cannot send encrypted media message, ";
            }
            sb.append(str);
            sb.append(r7.A10);
            Log.w(sb.toString());
            return;
        }
        C33221iE r32 = r15.A04;
        C445524n r04 = ((C33211iD) r32.A00).A0l;
        if (r04 == null) {
            r04 = C445524n.A0O;
        }
        C69593fI r42 = (C69593fI) r04.A0U();
        A1A(r42, r15, r10);
        if (!A0x() || A0E().A00 == null) {
            r32.A03();
            C33211iD r12 = (C33211iD) r32.A00;
            r12.A0l = (C445524n) r42.A02();
            r12.A00 |= 256;
            return;
        }
        C58852uG r05 = ((C33211iD) r32.A00).A03;
        if (r05 == null) {
            r05 = C58852uG.A08;
        }
        C69503f9 r23 = (C69503f9) r05.A0U();
        C42551xz.A03(r23, A0E().A00);
        r23.A03();
        C58852uG r13 = (C58852uG) r23.A00;
        r13.A05 = r42.A02();
        r13.A01 = 4;
        r23.A05(AnonymousClass438.A07);
        r32.A06((C58852uG) r23.A02());
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r8) {
        C28381Vw r2 = r8;
        if (this instanceof C39141rz) {
            C39141rz r3 = (C39141rz) this;
            return new C39141rz(r3.A02, r2, r3, r3.A0I);
        } else if (this instanceof C38921rd) {
            C38921rd r32 = (C38921rd) this;
            return new C38921rd(r32.A02, r2, r32, r32.A0I);
        } else {
            return new C38711rI(this.A02, r2, this, this.A0I, true);
        }
    }
}
