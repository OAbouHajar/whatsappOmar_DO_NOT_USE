package X;

import android.database.Cursor;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
public class C38841rV extends C30901d9 implements C16850tk, C30081bi {
    public int A00;
    public long A01;
    public C39721sx A02;
    public String A03;

    public C38841rV(C28381Vw r2, long j2) {
        super(r2, (byte) 16, j2);
    }

    public C38841rV(C28381Vw r10, C38841rV r11, long j2) {
        super(r10, r11, r11.A10, j2, true);
        this.A00 = r11.A00;
        this.A01 = r11.A01;
        this.A03 = r11.A03;
        this.A02 = r11.A02;
    }

    public void A13(Cursor cursor, C16040sK r11) {
        UserJid A0C;
        super.A13(cursor, r11);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("live_location_share_duration"));
        this.A01 = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_sequence_number"));
        double d2 = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_latitude"));
        double d3 = cursor.getDouble(cursor.getColumnIndexOrThrow("live_location_final_longitude"));
        long j2 = cursor.getLong(cursor.getColumnIndexOrThrow("live_location_final_timestamp"));
        if (d2 != 0.0d || d3 != 0.0d || j2 != 0) {
            if (this.A11.A02) {
                r11.A0B();
                A0C = r11.A05;
            } else {
                A0C = A0C();
            }
            AnonymousClass00B.A06(A0C);
            C39721sx r0 = new C39721sx(A0C);
            r0.A00 = d2;
            r0.A01 = d3;
            r0.A05 = j2;
            this.A02 = r0;
        }
    }

    public void A5j(AnonymousClass21Q r8, AnonymousClass1GC r9) {
        C16870tm A0F = A0F();
        C33221iE r5 = r8.A04;
        C438621v r0 = ((C33211iD) r5.A00).A0T;
        if (r0 == null) {
            r0 = C438621v.A0B;
        }
        C28581Wr A0U = r0.A0U();
        double d2 = this.A00;
        A0U.A03();
        C438621v r3 = (C438621v) A0U.A00;
        r3.A04 |= 1;
        r3.A00 = d2;
        double d3 = this.A01;
        A0U.A03();
        C438621v r32 = (C438621v) A0U.A00;
        r32.A04 |= 2;
        r32.A01 = d3;
        boolean z2 = r8.A07;
        if (!z2 && A0F.A07() != null) {
            byte[] A07 = A0F.A07();
            C28631Ww A012 = C28631Ww.A01(A07, 0, A07.length);
            A0U.A03();
            C438621v r1 = (C438621v) A0U.A00;
            r1.A04 |= 256;
            r1.A08 = A012;
        }
        AnonymousClass1WV r2 = r8.A05;
        byte[] bArr = r8.A0A;
        if (C41071vB.A0O(r2, this, bArr)) {
            AnonymousClass21S A002 = r9.A00(r2, this, bArr, z2);
            A0U.A03();
            C438621v r12 = (C438621v) A0U.A00;
            r12.A09 = A002;
            r12.A04 |= 512;
        }
        if (!TextUtils.isEmpty(this.A03)) {
            String str = this.A03;
            A0U.A03();
            C438621v r13 = (C438621v) A0U.A00;
            r13.A04 |= 32;
            r13.A0A = str;
        }
        long j2 = this.A01;
        A0U.A03();
        C438621v r14 = (C438621v) A0U.A00;
        r14.A04 |= 64;
        r14.A07 = j2;
        r5.A03();
        C33211iD r22 = (C33211iD) r5.A00;
        r22.A0T = (C438621v) A0U.A02();
        r22.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
    }

    public C16740tZ A6M(C28381Vw r4) {
        return new C38841rV(r4, this, this.A0I);
    }
}
