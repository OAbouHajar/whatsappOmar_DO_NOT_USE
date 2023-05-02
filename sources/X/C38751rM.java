package X;

import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1rM  reason: invalid class name and case insensitive filesystem */
public class C38751rM extends C30901d9 implements C16850tk, C16860tl, C30081bi {
    public String A00;
    public String A01;
    public String A02;

    public C38751rM(C28381Vw r2, byte b2, long j2) {
        super(r2, (byte) 30, j2);
    }

    public C38751rM(C28381Vw r2, long j2) {
        super(r2, (byte) 5, j2);
    }

    public C38751rM(C28381Vw r2, C38751rM r3, byte b2, long j2, boolean z2) {
        super(r2, r3, b2, j2, z2);
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
    }

    public void A12(Cursor cursor) {
        super.A12(cursor);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    public void A13(Cursor cursor, C16040sK r3) {
        super.A13(cursor, r3);
        this.A01 = cursor.getString(cursor.getColumnIndexOrThrow("place_name"));
        this.A00 = cursor.getString(cursor.getColumnIndexOrThrow("place_address"));
        this.A02 = cursor.getString(cursor.getColumnIndexOrThrow("url"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r1.startsWith(r2) != false) goto L_0x001d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A14() {
        /*
            r4 = this;
            java.lang.String r2 = r4.A01
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006c
            if (r1 == 0) goto L_0x005e
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x001d
            X.AnonymousClass00B.A06(r2)
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L_0x005e
        L_0x001d:
            java.lang.String r3 = r4.A00
        L_0x001f:
            X.AnonymousClass00B.A06(r3)
        L_0x0022:
            r1 = 300(0x12c, float:4.2E-43)
            int r0 = r3.length()
            if (r0 <= r1) goto L_0x002f
            r0 = 0
            java.lang.String r3 = r3.substring(r0, r1)
        L_0x002f:
            java.lang.String r0 = "https://maps.google.com/maps?q="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r1 = "\\s+"
            java.lang.String r0 = "+"
            java.lang.String r0 = r3.replaceAll(r1, r0)
            java.lang.String r0 = android.net.Uri.encode(r0)
            r2.append(r0)
            java.lang.String r0 = "&sll="
            r2.append(r0)
            double r0 = r4.A00
            r2.append(r0)
            java.lang.String r0 = ","
            r2.append(r0)
            double r0 = r4.A01
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        L_0x005e:
            java.lang.String r0 = r4.A15()
            if (r0 == 0) goto L_0x0069
            java.lang.String r3 = r4.A15()
            goto L_0x001f
        L_0x0069:
            java.lang.String r3 = ""
            goto L_0x0022
        L_0x006c:
            java.lang.String r0 = r4.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38751rM.A14():java.lang.String");
    }

    public String A15() {
        String str = this.A01;
        String str2 = this.A00;
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
        sb.append(str2);
        return sb.toString();
    }

    public void A16(C69013eM r6, AnonymousClass1WV r7, AnonymousClass1GC r8, byte[] bArr, boolean z2) {
        C16870tm A0F = A0F();
        double d2 = this.A00;
        r6.A03();
        C58982uT r3 = (C58982uT) r6.A00;
        r3.A04 |= 1;
        r3.A00 = d2;
        double d3 = this.A01;
        r6.A03();
        C58982uT r32 = (C58982uT) r6.A00;
        r32.A04 |= 2;
        r32.A01 = d3;
        if (!TextUtils.isEmpty(this.A02)) {
            String str = this.A02;
            r6.A03();
            C58982uT r1 = (C58982uT) r6.A00;
            r1.A04 |= 16;
            r1.A0B = str;
        }
        if (!TextUtils.isEmpty(this.A01)) {
            String str2 = this.A01;
            r6.A03();
            C58982uT r12 = (C58982uT) r6.A00;
            r12.A04 |= 4;
            r12.A0A = str2;
        }
        if (!TextUtils.isEmpty(this.A00)) {
            String str3 = this.A00;
            r6.A03();
            C58982uT r13 = (C58982uT) r6.A00;
            r13.A04 |= 8;
            r13.A08 = str3;
        }
        if (!z2 && A0F.A07() != null) {
            byte[] A07 = A0F.A07();
            C28631Ww A012 = C28631Ww.A01(A07, 0, A07.length);
            r6.A03();
            C58982uT r14 = (C58982uT) r6.A00;
            r14.A04 |= 1024;
            r14.A06 = A012;
        }
        if (C41071vB.A0O(r7, this, bArr)) {
            AnonymousClass21S A002 = r8.A00(r7, this, bArr, z2);
            r6.A03();
            C58982uT r15 = (C58982uT) r6.A00;
            r15.A07 = A002;
            r15.A04 |= 2048;
        }
    }

    public void A17(C58982uT r4, boolean z2) {
        this.A00 = r4.A00;
        this.A01 = r4.A01;
        int i2 = r4.A04;
        if ((i2 & 16) == 16) {
            this.A02 = r4.A0B;
        }
        if ((i2 & 4) == 4) {
            this.A01 = r4.A0A;
        }
        if ((i2 & 8) == 8) {
            this.A00 = r4.A08;
        }
        if ((i2 & 1024) == 1024) {
            A0F().A03(r4.A06.A04(), z2);
            this.A02 = 2;
        }
    }

    public void A5j(AnonymousClass21Q r12, AnonymousClass1GC r13) {
        C30611cf r0;
        AnonymousClass1GC r8 = r13;
        if (this instanceof C38941rf) {
            C38941rf r5 = (C38941rf) this;
            C33221iE r4 = r12.A04;
            C69633fM r3 = (C69633fM) r4.A05().A0U();
            C59032uZ r2 = r4.A05().A03;
            if (r2 == null) {
                r2 = C59032uZ.A07;
            }
            C69013eM r6 = (C69013eM) (r2.A01 == 5 ? (C28541Wm) r2.A03 : C58982uT.A0D).A0U();
            r5.A16(r6, r12.A05, r8, r12.A0A, r12.A07);
            if (r6 == null || (r0 = r5.A00) == null) {
                StringBuilder sb = new StringBuilder("FMessageTemplateLocation/buildE2eMessage/Error: cannot send encrypted template location message, ");
                sb.append(r5.A10);
                Log.w(sb.toString());
                return;
            }
            C69583fH A002 = AnonymousClass38C.A00(r4, r0);
            A002.A03();
            C59032uZ r1 = (C59032uZ) A002.A00;
            r1.A03 = r6.A02();
            r1.A01 = 5;
            r3.A06(A002);
            r3.A05(A002);
            r4.A0D(r3);
            return;
        }
        C33221iE r32 = r12.A04;
        C58982uT r02 = ((C33211iD) r32.A00).A0U;
        if (r02 == null) {
            r02 = C58982uT.A0D;
        }
        C69013eM r62 = (C69013eM) r02.A0U();
        A16(r62, r12.A05, r8, r12.A0A, r12.A07);
        if (C42551xz.A04(this)) {
            C58852uG r03 = ((C33211iD) r32.A00).A03;
            if (r03 == null) {
                r03 = C58852uG.A08;
            }
            C69503f9 r22 = (C69503f9) r03.A0U();
            C42551xz.A03(r22, A0E().A00);
            r22.A03();
            C58852uG r14 = (C58852uG) r22.A00;
            r14.A05 = r62.A02();
            r14.A01 = 5;
            r22.A05(AnonymousClass438.A04);
            r32.A06((C58852uG) r22.A02());
            return;
        }
        r32.A03();
        C33211iD r15 = (C33211iD) r32.A00;
        r15.A0U = (C58982uT) r62.A02();
        r15.A00 |= 16;
    }

    public /* bridge */ /* synthetic */ C16740tZ A6L(C28381Vw r8, long j2) {
        return new C38751rM(r8, this, this instanceof C38941rf ? 5 : this.A10, j2, false);
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r10) {
        C28381Vw r3 = r10;
        if (this instanceof C38941rf) {
            C38941rf r4 = (C38941rf) this;
            return new C38941rf(r10, r4, r4.A0I);
        }
        return new C38751rM(r3, this, this.A10, this.A0I, true);
    }
}
