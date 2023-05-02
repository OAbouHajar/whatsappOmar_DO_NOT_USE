package X;

import android.text.TextUtils;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1ra  reason: invalid class name and case insensitive filesystem */
public class C38891ra extends C38681rF implements C16850tk, C30081bi {
    public int A00;
    public UserJid A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public BigDecimal A0A;
    public BigDecimal A0B;

    public C38891ra(C16750ta r2, C28381Vw r3, C38891ra r4, long j2, boolean z2) {
        super(r2, r3, r4, j2, z2);
        this.A01 = r4.A01;
        this.A06 = r4.A06;
        this.A09 = r4.A09;
        this.A04 = r4.A04;
        this.A03 = r4.A03;
        this.A0A = r4.A0A;
        this.A0B = r4.A0B;
        this.A08 = r4.A08;
        this.A07 = r4.A07;
        this.A00 = r4.A00;
        this.A02 = r4.A02;
        this.A05 = r4.A05;
    }

    public C38891ra(C28381Vw r2, long j2) {
        super(r2, (byte) 23, j2);
    }

    public String A1C() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.A09)) {
            sb.append(this.A09);
        }
        if (!TextUtils.isEmpty(this.A02)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb.append(this.A02);
        }
        if (!TextUtils.isEmpty(this.A05)) {
            if (!TextUtils.isEmpty(sb)) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            sb.append(this.A05);
        }
        return sb.toString();
    }

    public void A5j(AnonymousClass21Q r11, AnonymousClass1GC r12) {
        UserJid userJid;
        C33221iE r4 = r11.A04;
        AnonymousClass2uE r0 = ((C33211iD) r4.A00).A0a;
        if (r0 == null) {
            r0 = AnonymousClass2uE.A07;
        }
        C28581Wr A0U = r0.A0U();
        AnonymousClass2uE r02 = ((C33211iD) r4.A00).A0a;
        if (r02 == null) {
            r02 = AnonymousClass2uE.A07;
        }
        C58952uQ r03 = r02.A03;
        if (r03 == null) {
            r03 = C58952uQ.A0C;
        }
        C28581Wr A0U2 = r03.A0U();
        C445224k r04 = ((C58952uQ) A0U2.A00).A04;
        if (r04 == null) {
            r04 = C445224k.A0R;
        }
        boolean z2 = r11.A09;
        boolean z3 = r11.A07;
        C68803e1 A1A = A1A((C68803e1) r04.A0U(), z2, z3);
        if (A1A == null || (userJid = this.A01) == null) {
            StringBuilder sb = new StringBuilder("FMessageProduct/buildE2eMessage/unable to send encrypted media message due to missing mediaKey or businessOwnerJid; message.key=");
            sb.append(this.A11);
            sb.append("; media_wa_type=");
            sb.append(this.A10);
            sb.append("; business_owner_jid=");
            sb.append(this.A01);
            Log.w(sb.toString());
            return;
        }
        String rawString = userJid.getRawString();
        A0U.A03();
        AnonymousClass2uE r1 = (AnonymousClass2uE) A0U.A00;
        r1.A00 |= 2;
        r1.A05 = rawString;
        if (!TextUtils.isEmpty(this.A06)) {
            String str = this.A06;
            A0U2.A03();
            C58952uQ r13 = (C58952uQ) A0U2.A00;
            r13.A00 |= 2;
            r13.A08 = str;
        }
        if (!TextUtils.isEmpty(this.A04)) {
            String str2 = this.A04;
            A0U2.A03();
            C58952uQ r14 = (C58952uQ) A0U2.A00;
            r14.A00 |= 8;
            r14.A06 = str2;
        }
        if (!TextUtils.isEmpty(this.A09)) {
            String str3 = this.A09;
            A0U2.A03();
            C58952uQ r15 = (C58952uQ) A0U2.A00;
            r15.A00 |= 4;
            r15.A0A = str3;
        }
        if (!TextUtils.isEmpty(this.A02)) {
            String str4 = this.A02;
            A0U.A03();
            AnonymousClass2uE r16 = (AnonymousClass2uE) A0U.A00;
            r16.A00 |= 8;
            r16.A04 = str4;
        }
        if (!TextUtils.isEmpty(this.A05)) {
            String str5 = this.A05;
            A0U.A03();
            AnonymousClass2uE r17 = (AnonymousClass2uE) A0U.A00;
            r17.A00 |= 16;
            r17.A06 = str5;
        }
        if (!TextUtils.isEmpty(this.A03) && this.A0A != null) {
            String str6 = this.A03;
            A0U2.A03();
            C58952uQ r18 = (C58952uQ) A0U2.A00;
            r18.A00 |= 16;
            r18.A05 = str6;
            BigDecimal bigDecimal = this.A0A;
            BigDecimal bigDecimal2 = C39641sp.A00;
            long longValue = bigDecimal.multiply(bigDecimal2).longValue();
            A0U2.A03();
            C58952uQ r8 = (C58952uQ) A0U2.A00;
            r8.A00 |= 32;
            r8.A02 = longValue;
            BigDecimal bigDecimal3 = this.A0B;
            if (!(bigDecimal3 == null || BigDecimal.ZERO.compareTo(bigDecimal3) == 0)) {
                long longValue2 = this.A0B.multiply(bigDecimal2).longValue();
                A0U2.A03();
                C58952uQ r7 = (C58952uQ) A0U2.A00;
                r7.A00 |= 1024;
                r7.A03 = longValue2;
            }
        }
        if (!TextUtils.isEmpty(this.A08)) {
            String str7 = this.A08;
            A0U2.A03();
            C58952uQ r19 = (C58952uQ) A0U2.A00;
            r19.A00 |= 64;
            r19.A09 = str7;
        }
        if (!TextUtils.isEmpty(this.A07)) {
            String str8 = this.A07;
            A0U2.A03();
            C58952uQ r110 = (C58952uQ) A0U2.A00;
            r110.A00 |= 128;
            r110.A0B = str8;
        }
        int i2 = this.A00;
        A0U2.A03();
        C58952uQ r111 = (C58952uQ) A0U2.A00;
        r111.A00 |= 256;
        r111.A01 = i2;
        A0U2.A03();
        C58952uQ r112 = (C58952uQ) A0U2.A00;
        r112.A04 = (C445224k) A1A.A02();
        r112.A00 |= 1;
        A0U.A03();
        AnonymousClass2uE r113 = (AnonymousClass2uE) A0U.A00;
        r113.A03 = (C58952uQ) A0U2.A02();
        r113.A00 |= 1;
        AnonymousClass1WV r2 = r11.A05;
        byte[] bArr = r11.A0A;
        if (C41071vB.A0O(r2, this, bArr)) {
            AnonymousClass21S A002 = r12.A00(r2, this, bArr, z3);
            A0U.A03();
            AnonymousClass2uE r114 = (AnonymousClass2uE) A0U.A00;
            r114.A01 = A002;
            r114.A00 |= 32;
        }
        r4.A03();
        C33211iD r22 = (C33211iD) r4.A00;
        r22.A0a = (AnonymousClass2uE) A0U.A02();
        r22.A00 |= 16777216;
    }
}
