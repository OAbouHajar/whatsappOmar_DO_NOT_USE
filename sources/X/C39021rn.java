package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;

/* renamed from: X.1rn  reason: invalid class name and case insensitive filesystem */
public class C39021rn extends C16730tY implements C16850tk, C30081bi {
    public int A00;
    public int A01;
    public int A02;
    public UserJid A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public BigDecimal A09;
    public final transient C16300so A0A;

    public C39021rn(C16300so r10, C16750ta r11, C28381Vw r12, C39021rn r13, long j2) {
        super(r11, r12, r13, r13.A10, j2, true);
        this.A0A = r10;
        this.A06 = r13.A06;
        this.A07 = r13.A07;
        this.A00 = r13.A00;
        this.A01 = r13.A01;
        this.A02 = r13.A02;
        this.A05 = r13.A05;
        this.A03 = r13.A03;
        this.A08 = r13.A08;
        this.A04 = r13.A04;
        this.A09 = r13.A09;
    }

    public C39021rn(C16300so r2, C28381Vw r3, long j2) {
        super(r3, (byte) 44, j2);
        this.A0A = r2;
    }

    public void A5j(AnonymousClass21Q r8, AnonymousClass1GC r9) {
        C33221iE r4 = r8.A04;
        C58992uU r0 = ((C33211iD) r4.A00).A0V;
        if (r0 == null) {
            r0 = C58992uU.A0D;
        }
        C28581Wr A0U = r0.A0U();
        String str = this.A06;
        if (str != null) {
            A0U.A03();
            C58992uU r1 = (C58992uU) A0U.A00;
            r1.A00 |= 1;
            r1.A08 = str;
        }
        String str2 = this.A07;
        if (str2 != null) {
            A0U.A03();
            C58992uU r12 = (C58992uU) A0U.A00;
            r12.A00 |= 64;
            r12.A09 = str2;
        }
        int i2 = this.A00;
        A0U.A03();
        C58992uU r13 = (C58992uU) A0U.A00;
        r13.A00 |= 4;
        r13.A01 = i2;
        String str3 = this.A05;
        if (str3 != null) {
            A0U.A03();
            C58992uU r14 = (C58992uU) A0U.A00;
            r14.A00 |= 32;
            r14.A07 = str3;
        }
        int i3 = this.A01;
        if (i3 != 1) {
            C16300so r2 = this.A0A;
            StringBuilder sb = new StringBuilder("status=");
            sb.append(i3);
            r2.AcB("FMessageOrder/setOrderStatus: Unexpected status", sb.toString(), true);
        } else {
            AnonymousClass42A r22 = AnonymousClass42A.A01;
            A0U.A03();
            C58992uU r15 = (C58992uU) A0U.A00;
            r15.A00 |= 8;
            r15.A02 = r22.value;
        }
        int i4 = this.A02;
        if (i4 != 1) {
            C16300so r23 = this.A0A;
            StringBuilder sb2 = new StringBuilder("surface=");
            sb2.append(i4);
            r23.AcB("FMessageOrder/setOrderSurface: Unexpected surface", sb2.toString(), true);
        } else {
            AnonymousClass42B r24 = AnonymousClass42B.A01;
            A0U.A03();
            C58992uU r16 = (C58992uU) A0U.A00;
            r16.A00 |= 16;
            r16.A03 = r24.value;
        }
        UserJid userJid = this.A03;
        if (userJid != null) {
            String rawString = userJid.getRawString();
            A0U.A03();
            C58992uU r17 = (C58992uU) A0U.A00;
            r17.A00 |= 128;
            r17.A0A = rawString;
        }
        String str4 = this.A08;
        if (str4 != null) {
            A0U.A03();
            C58992uU r18 = (C58992uU) A0U.A00;
            r18.A00 |= 256;
            r18.A0B = str4;
        }
        if (!TextUtils.isEmpty(this.A04) && this.A09 != null) {
            String str5 = this.A04;
            A0U.A03();
            C58992uU r19 = (C58992uU) A0U.A00;
            r19.A00 |= 1024;
            r19.A0C = str5;
            long longValue = this.A09.multiply(C39641sp.A00).longValue();
            A0U.A03();
            C58992uU r5 = (C58992uU) A0U.A00;
            r5.A00 |= 512;
            r5.A04 = longValue;
        }
        C16870tm A0F = A0F();
        if (!(A0F == null || A0F.A07() == null)) {
            byte[] A072 = A0F.A07();
            C28631Ww A012 = C28631Ww.A01(A072, 0, A072.length);
            A0U.A03();
            C58992uU r110 = (C58992uU) A0U.A00;
            r110.A00 |= 2;
            r110.A05 = A012;
        }
        AnonymousClass1WV r25 = r8.A05;
        byte[] bArr = r8.A0A;
        if (C41071vB.A0O(r25, this, bArr)) {
            AnonymousClass21S A002 = r9.A00(r25, this, bArr, r8.A07);
            A0U.A03();
            C58992uU r111 = (C58992uU) A0U.A00;
            r111.A06 = A002;
            r111.A00 |= 2048;
        }
        r4.A03();
        C33211iD r26 = (C33211iD) r4.A00;
        r26.A0V = (C58992uU) A0U.A02();
        r26.A00 |= 536870912;
    }

    public C16740tZ A6M(C28381Vw r8) {
        C16300so r1 = this.A0A;
        long j2 = this.A0I;
        return new C39021rn(r1, this.A02, r8, this, j2);
    }
}
