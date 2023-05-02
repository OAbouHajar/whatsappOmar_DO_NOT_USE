package X;

import com.whatsapp.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.UnknownHostException;

/* renamed from: X.1ni  reason: invalid class name and case insensitive filesystem */
public class C36541ni {
    public C36031mt A00;

    public C36541ni() {
        this.A00 = (C36031mt) C36031mt.A0E.A0U().A02();
    }

    public C36541ni(C36031mt r1) {
        this.A00 = r1;
    }

    public C36541ni(C36541ni r2) {
        this.A00 = (C36031mt) r2.A00.A0U().A02();
    }

    public static void A00(Throwable th) {
        String str = "";
        Throwable th2 = th;
        while (true) {
            if (!(th2 instanceof UnknownHostException)) {
                th2 = th2.getCause();
                if (th2 == null) {
                    StringWriter stringWriter = new StringWriter();
                    PrintWriter printWriter = new PrintWriter(stringWriter);
                    th.printStackTrace(printWriter);
                    printWriter.flush();
                    str = stringWriter.toString();
                    break;
                }
            } else {
                break;
            }
        }
        if (C33541ik.A00 != null) {
            StringBuilder sb = new StringBuilder("SignalProtocolLogger (");
            sb.append("SessionRecordV2");
            sb.append("): ");
            sb.append(str);
            Log.w(sb.toString());
        }
    }

    public C36341nO A01() {
        try {
            return new C36341nO(this.A00.A06.A04());
        } catch (C36291nJ e2) {
            throw new AssertionError(e2);
        }
    }

    public C36341nO A02() {
        try {
            C36031mt r2 = this.A00;
            if ((r2.A00 & 4) == 4) {
                return new C36341nO(r2.A07.A04());
            }
            return null;
        } catch (C36291nJ e2) {
            A00(e2);
            return null;
        }
    }

    public C36251nF A03() {
        try {
            AnonymousClass2L8 r0 = this.A00.A0A;
            if (r0 == null) {
                r0 = AnonymousClass2L8.A05;
            }
            return C36241nE.A00(r0.A02.A04());
        } catch (C36291nJ e2) {
            throw new AssertionError(e2);
        }
    }

    public C36601no A04() {
        C36031mt r2 = this.A00;
        AnonymousClass2L8 r0 = r2.A0A;
        if (r0 == null) {
            r0 = AnonymousClass2L8.A05;
        }
        AnonymousClass2L9 r1 = r0.A04;
        if (r1 == null) {
            r1 = AnonymousClass2L9.A03;
        }
        int i2 = r2.A04;
        if (i2 == 0) {
            i2 = 2;
        }
        return new C36601no(C36571nl.A00(i2), r1.A02.A04(), r1.A01);
    }

    public final C36611np A05(C36251nF r6) {
        int i2 = 0;
        for (AnonymousClass2L8 r2 : this.A00.A09) {
            try {
                if (C36241nE.A00(r2.A02.A04()).equals(r6)) {
                    return new C36611np(r2, Integer.valueOf(i2));
                }
                i2++;
            } catch (C36291nJ e2) {
                A00(e2);
            }
        }
        return null;
    }

    public void A06() {
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        C36031mt r2 = (C36031mt) A0U.A00;
        r2.A00 |= 1;
        r2.A04 = 3;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A07(int i2) {
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        C36031mt r1 = (C36031mt) A0U.A00;
        r1.A00 |= 512;
        r1.A01 = i2;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A08(int i2) {
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        C36031mt r1 = (C36031mt) A0U.A00;
        r1.A00 |= 256;
        r1.A03 = i2;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A09(C36341nO r5) {
        C28581Wr A0U = this.A00.A0U();
        byte[] A002 = r5.A00.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        C36031mt r1 = (C36031mt) A0U.A00;
        r1.A00 |= 2;
        r1.A06 = A01;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A0A(C36341nO r5) {
        C28581Wr A0U = this.A00.A0U();
        byte[] A002 = r5.A00.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        C36031mt r1 = (C36031mt) A0U.A00;
        r1.A00 |= 4;
        r1.A07 = A01;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A0B(C36251nF r6, C36601no r7) {
        AnonymousClass2LB r3 = (AnonymousClass2LB) AnonymousClass2L9.A03.A0U();
        byte[] bArr = r7.A02;
        r3.A06(C28631Ww.A01(bArr, 0, bArr.length));
        r3.A05(r7.A00);
        AnonymousClass2LC r32 = (AnonymousClass2LC) AnonymousClass2L8.A05.A0U();
        r32.A05((AnonymousClass2L9) r3.A02());
        byte[] A002 = r6.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        r32.A03();
        AnonymousClass2L8 r1 = (AnonymousClass2L8) r32.A00;
        r1.A00 |= 1;
        r1.A02 = A01;
        C28541Wm A02 = r32.A02();
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        C36031mt r2 = (C36031mt) A0U.A00;
        AnonymousClass1XE r12 = r2.A09;
        if (!((AnonymousClass1XF) r12).A00) {
            r12 = C28541Wm.A0G(r12);
            r2.A09 = r12;
        }
        r12.add(A02);
        C36031mt r0 = (C36031mt) A0U.A02();
        this.A00 = r0;
        if (r0.A09.size() > 5) {
            C28581Wr A0U2 = this.A00.A0U();
            A0U2.A03();
            C36031mt r33 = (C36031mt) A0U2.A00;
            AnonymousClass1XE r13 = r33.A09;
            if (!((AnonymousClass1XF) r13).A00) {
                r13 = C28541Wm.A0G(r13);
                r33.A09 = r13;
            }
            r13.remove(0);
            this.A00 = (C36031mt) A0U2.A02();
        }
    }

    public void A0C(C36491nd r6, C36601no r7) {
        AnonymousClass2LB r3 = (AnonymousClass2LB) AnonymousClass2L9.A03.A0U();
        byte[] bArr = r7.A02;
        r3.A06(C28631Ww.A01(bArr, 0, bArr.length));
        r3.A05(r7.A00);
        AnonymousClass2LC r32 = (AnonymousClass2LC) AnonymousClass2L8.A05.A0U();
        byte[] A002 = r6.A01.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        r32.A03();
        AnonymousClass2L8 r1 = (AnonymousClass2L8) r32.A00;
        r1.A00 |= 1;
        r1.A02 = A01;
        byte[] bArr2 = r6.A00.A00;
        C28631Ww A012 = C28631Ww.A01(bArr2, 0, bArr2.length);
        r32.A03();
        AnonymousClass2L8 r12 = (AnonymousClass2L8) r32.A00;
        r12.A00 |= 2;
        r12.A01 = A012;
        r32.A05((AnonymousClass2L9) r3.A02());
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        C36031mt r13 = (C36031mt) A0U.A00;
        r13.A0A = (AnonymousClass2L8) r32.A02();
        r13.A00 |= 32;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A0D(C36591nn r5) {
        C28581Wr A0U = this.A00.A0U();
        byte[] bArr = r5.A01;
        C28631Ww A01 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        C36031mt r1 = (C36031mt) A0U.A00;
        r1.A00 |= 8;
        r1.A08 = A01;
        this.A00 = (C36031mt) A0U.A02();
    }

    public void A0E(byte[] bArr) {
        C28581Wr A0U = this.A00.A0U();
        C28631Ww A01 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        C36031mt r1 = (C36031mt) A0U.A00;
        r1.A00 |= 2048;
        r1.A05 = A01;
        this.A00 = (C36031mt) A0U.A02();
    }
}
