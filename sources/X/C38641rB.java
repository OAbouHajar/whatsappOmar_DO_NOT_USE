package X;

import android.database.Cursor;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.1rB  reason: invalid class name and case insensitive filesystem */
public class C38641rB extends C16730tY implements C16850tk, C30081bi {
    public boolean A00;
    public transient long A01;
    public transient AnonymousClass1XO A02;
    public transient Integer A03;

    public C38641rB(C16750ta r10, C28381Vw r11, C38641rB r12, long j2, boolean z2) {
        super(r10, r11, r12, r12.A10, j2, z2);
        this.A02 = r12.A02;
        this.A00 = r12.A00;
        this.A01 = j2;
    }

    public C38641rB(C28381Vw r2, long j2) {
        super(r2, (byte) 20, j2);
        this.A01 = j2;
    }

    public C38641rB(C37521pI r10, C28381Vw r11, long j2, boolean z2) {
        this(r11, j2);
        C28631Ww r0;
        int i2;
        C16750ta r6 = new C16750ta();
        this.A02 = r6;
        if ((r10.A00 & 8) == 8) {
            C42941yx.A00(r6, this, r10.A0A.A04());
        }
        int i3 = r10.A00;
        if ((i3 & 512) == 512) {
            r6.A0B = r10.A05 * 1000;
        }
        if (!z2 || (i3 & 2) == 2) {
            byte[] A04 = r10.A08.A04();
            int length = A04.length;
            if (length == 32) {
                this.A05 = Base64.encodeToString(A04, 2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("FMessageSticker/bogus sha-256 hash received; length=");
                sb.append(length);
                sb.append("; message.key=");
                sb.append(r11);
                Log.w(sb.toString());
                throw new AnonymousClass23S(14);
            }
        }
        if ((r10.A00 & 4) == 4) {
            byte[] A042 = r10.A07.A04();
            int length2 = A042.length;
            if (length2 == 32) {
                this.A04 = Base64.encodeToString(A042, 2);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("FMessageSticker/bogus sha-256 hash received; length=");
                sb2.append(length2);
                sb2.append("; message.key=");
                sb2.append(r11);
                Log.w(sb2.toString());
                throw new AnonymousClass23S(14);
            }
        }
        if (!z2 || (r10.A00 & 16) == 16) {
            String str = r10.A0E;
            if ("image/webp".equalsIgnoreCase(str)) {
                this.A06 = str;
            } else {
                StringBuilder sb3 = new StringBuilder("FMessageSticker/invalid sticker mime type; mimetype=");
                sb3.append(str);
                sb3.append("; message.key=");
                sb3.append(r11);
                Log.w(sb3.toString());
                throw new AnonymousClass23S(17);
            }
        }
        if ((r10.A00 & 1) == 1) {
            A17(r10.A0F);
        }
        int i4 = r10.A00;
        if ((i4 & 64) == 64 && (i4 & 32) == 32) {
            r6.A06 = r10.A02;
            r6.A08 = r10.A03;
        }
        if (!z2 || (i4 & 128) == 128) {
            r6.A0G = r10.A0D;
        }
        long j3 = 0;
        if ((i4 & 256) == 256) {
            long j4 = r10.A04;
            if (j4 >= 0) {
                this.A01 = j4;
            } else {
                StringBuilder sb4 = new StringBuilder("FMessageSticker/bogus media size received; fileLength=");
                sb4.append(j4);
                sb4.append("; message.key=");
                sb4.append(r11);
                Log.w(sb4.toString());
                throw new AnonymousClass23S(13);
            }
        }
        if ((i4 & 1024) == 1024 && (i2 = r10.A01) > 0) {
            r6.A04 = i2;
        }
        if ((i4 & 2048) == 2048 && (r0 = r10.A09) != null) {
            r6.A0R = r0.A04();
        }
        this.A00 = r10.A0G;
        this.A01 = (r10.A00 & 32768) == 32768 ? r10.A06 : j3;
    }

    public void A15(Cursor cursor, C16750ta r8) {
        super.A15(cursor, r8);
        boolean z2 = false;
        if (cursor.getLong(cursor.getColumnIndexOrThrow("is_animated_sticker")) == 1) {
            z2 = true;
        }
        this.A00 = z2;
    }

    public final C69573fG A19(AnonymousClass21Q r9, AnonymousClass1GC r10) {
        C16750ta r4 = this.A02;
        if (r4 == null || (!r9.A09 && r4.A0U == null)) {
            StringBuilder sb = new StringBuilder("FMessageSticker/unable to send encrypted media message due to missing mediaKey; message.key=");
            sb.append(this.A11);
            sb.append("; media_wa_type=");
            sb.append(this.A10);
            Log.w(sb.toString());
            return null;
        }
        C37521pI r0 = ((C33211iD) r9.A04.A00).A0i;
        if (r0 == null) {
            r0 = C37521pI.A0I;
        }
        C69573fG r5 = (C69573fG) r0.A0U();
        byte[] bArr = r4.A0U;
        if (bArr != null) {
            C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
            r5.A03();
            C37521pI r1 = (C37521pI) r5.A00;
            r1.A00 |= 8;
            r1.A0A = A012;
        } else {
            Log.w("FMessageSticker/buildE2eMessage/sticker media key missing");
        }
        long j2 = r4.A0B;
        if (j2 > 0) {
            r5.A03();
            C37521pI r3 = (C37521pI) r5.A00;
            r3.A00 |= 512;
            r3.A05 = j2 / 1000;
        }
        if (!TextUtils.isEmpty(this.A04)) {
            byte[] decode = Base64.decode(this.A04, 0);
            C28631Ww A013 = C28631Ww.A01(decode, 0, decode.length);
            r5.A03();
            C37521pI r12 = (C37521pI) r5.A00;
            r12.A00 |= 4;
            r12.A07 = A013;
        }
        if (!TextUtils.isEmpty(this.A05)) {
            byte[] decode2 = Base64.decode(this.A05, 0);
            r5.A05(C28631Ww.A01(decode2, 0, decode2.length));
        }
        int i2 = r4.A06;
        if (i2 > 0 && r4.A08 > 0) {
            r5.A03();
            C37521pI r13 = (C37521pI) r5.A00;
            r13.A00 |= 32;
            r13.A02 = i2;
            int i3 = r4.A08;
            r5.A03();
            C37521pI r14 = (C37521pI) r5.A00;
            r14.A00 |= 64;
            r14.A03 = i3;
        }
        AnonymousClass1WV r2 = r9.A05;
        byte[] bArr2 = r9.A0A;
        if (C41071vB.A0O(r2, this, bArr2)) {
            AnonymousClass21S A002 = r10.A00(r2, this, bArr2, r9.A07);
            r5.A03();
            C37521pI r15 = (C37521pI) r5.A00;
            r15.A0C = A002;
            r15.A00 |= 16384;
        }
        String str = this.A08;
        if (str != null) {
            r5.A03();
            C37521pI r16 = (C37521pI) r5.A00;
            r16.A00 |= 1;
            r16.A0F = str;
        }
        String str2 = this.A06;
        if (str2 != null) {
            r5.A03();
            C37521pI r17 = (C37521pI) r5.A00;
            r17.A00 |= 16;
            r17.A0E = str2;
        }
        if (!TextUtils.isEmpty(r4.A0G)) {
            String str3 = r4.A0G;
            r5.A03();
            C37521pI r18 = (C37521pI) r5.A00;
            r18.A00 |= 128;
            r18.A0D = str3;
        }
        long j3 = this.A01;
        if (j3 > 0) {
            r5.A03();
            C37521pI r19 = (C37521pI) r5.A00;
            r19.A00 |= 256;
            r19.A04 = j3;
        }
        int i4 = r4.A04;
        if (i4 > 0) {
            r5.A03();
            C37521pI r110 = (C37521pI) r5.A00;
            r110.A00 |= 1024;
            r110.A01 = i4;
        }
        byte[] bArr3 = r4.A0R;
        if (bArr3 != null) {
            C28631Ww A014 = C28631Ww.A01(bArr3, 0, bArr3.length);
            r5.A03();
            C37521pI r111 = (C37521pI) r5.A00;
            r111.A00 |= 2048;
            r111.A09 = A014;
        }
        boolean z2 = this.A00;
        r5.A03();
        C37521pI r112 = (C37521pI) r5.A00;
        r112.A00 |= 4096;
        r112.A0G = z2;
        long j4 = this.A01;
        r5.A03();
        C37521pI r22 = (C37521pI) r5.A00;
        r22.A00 |= 32768;
        r22.A06 = j4;
        boolean A1B = A1B();
        r5.A03();
        C37521pI r23 = (C37521pI) r5.A00;
        r23.A00 |= AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
        r23.A0H = A1B;
        return r5;
    }

    public C34151jm A1A() {
        C34151jm r2 = new C34151jm();
        C16750ta r3 = this.A02;
        if (r3 != null) {
            File file = r3.A0F;
            if (file != null && file.exists()) {
                r2.A09 = r3.A0F.getAbsolutePath();
                r2.A01 = 1;
            } else if (A14() != null) {
                r2.A09 = A14();
                r2.A01 = 3;
            }
            r2.A0D = this.A05;
            r2.A08 = this.A04;
            r2.A03 = r3.A08;
            r2.A02 = r3.A06;
            r2.A0C = this.A06;
            byte[] bArr = r3.A0U;
            if (bArr != null) {
                r2.A0B = Base64.encodeToString(bArr, 1);
            }
            String str = r3.A0G;
            if (str != null) {
                r2.A06 = str;
            }
        }
        C37711pb.A00(r2);
        return r2;
    }

    public boolean A1B() {
        AnonymousClass1XO r0 = this.A02;
        return r0 != null && r0.A06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0100, code lost:
        if (r10 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01a5, code lost:
        if (r1 != null) goto L_0x018c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5j(X.AnonymousClass21Q r13, X.AnonymousClass1GC r14) {
        /*
            r12 = this;
            X.1Vt r5 = r12.A0L
            if (r5 == 0) goto L_0x01a8
            boolean r0 = r5.A0E()
            if (r0 == 0) goto L_0x010c
            X.1Vy r0 = r5.A08
            X.AnonymousClass00B.A06(r0)
            java.math.BigDecimal r1 = r0.A00
            r0 = 3
            java.math.BigDecimal r0 = r1.scaleByPowerOfTen(r0)
            long r0 = r0.longValue()
            java.lang.String r9 = r5.A0I
            X.1W2 r2 = r5.A0A
            if (r2 != 0) goto L_0x0104
            r8 = 0
            r3 = 0
        L_0x0023:
            com.whatsapp.jid.UserJid r6 = r5.A0E
            X.1lo r11 = r5.A01()
            X.1iE r5 = r13.A04
            X.1Wm r2 = r5.A00
            X.1iD r2 = (X.C33211iD) r2
            X.2uI r2 = r2.A0d
            if (r2 != 0) goto L_0x0035
            X.2uI r2 = X.C58872uI.A08
        L_0x0035:
            X.1Wr r2 = r2.A0U()
            X.3fE r2 = (X.C69553fE) r2
            X.1iD r7 = X.C33211iD.A0o
            X.1Wr r10 = r7.A0U()
            X.1iE r10 = (X.C33221iE) r10
            X.3fG r7 = r12.A19(r13, r14)
            if (r7 == 0) goto L_0x0100
            r10.A0C(r7)
        L_0x004c:
            r2.A05(r10)
        L_0x004f:
            r2.A03()
            X.1Wm r10 = r2.A00
            X.2uI r10 = (X.C58872uI) r10
            int r7 = r10.A00
            r7 = r7 | 4
            r10.A00 = r7
            r10.A01 = r0
            r2.A03()
            X.1Wm r10 = r2.A00
            X.2uI r10 = (X.C58872uI) r10
            int r7 = r10.A00
            r7 = r7 | 2
            r10.A00 = r7
            r10.A06 = r9
            X.2tz r7 = r10.A04
            if (r7 != 0) goto L_0x0073
            X.2tz r7 = X.C58742tz.A04
        L_0x0073:
            X.1Wr r7 = r7.A0U()
            X.3fN r7 = (X.C69643fN) r7
            if (r8 == 0) goto L_0x0080
            int r0 = r8.A00()
            long r0 = (long) r0
        L_0x0080:
            r7.A06(r0)
            if (r8 == 0) goto L_0x00fd
            int r0 = r8.A00
        L_0x0087:
            r7.A05(r0)
            if (r8 == 0) goto L_0x0092
            X.1Vz r0 = r8.A01
            X.1m1 r0 = (X.C35491m1) r0
            java.lang.String r9 = r0.A04
        L_0x0092:
            r7.A07(r9)
            X.1Wm r0 = r7.A02()
            X.2tz r0 = (X.C58742tz) r0
            r2.A03()
            X.1Wm r1 = r2.A00
            X.2uI r1 = (X.C58872uI) r1
            r1.A04 = r0
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r0
            r2.A03()
            X.1Wm r1 = r2.A00
            X.2uI r1 = (X.C58872uI) r1
            int r0 = r1.A00
            r0 = r0 | 16
            r1.A00 = r0
            r1.A02 = r3
            if (r6 == 0) goto L_0x00d1
            java.lang.String r3 = r6.getRawString()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.2uI r1 = (X.C58872uI) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A07 = r3
        L_0x00d1:
            if (r11 == 0) goto L_0x00e6
            X.2uO r0 = r11.A01()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.2uI r1 = (X.C58872uI) r1
            r1.A05 = r0
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
        L_0x00e6:
            r5.A03()
            X.1Wm r3 = r5.A00
            X.1iD r3 = (X.C33211iD) r3
            X.1Wm r0 = r2.A02()
            X.2uI r0 = (X.C58872uI) r0
            r3.A0d = r0
            int r1 = r3.A00
            r0 = 131072(0x20000, float:1.83671E-40)
        L_0x00f9:
            r1 = r1 | r0
            r3.A00 = r1
        L_0x00fc:
            return
        L_0x00fd:
            r0 = 1000(0x3e8, float:1.401E-42)
            goto L_0x0087
        L_0x0100:
            if (r10 == 0) goto L_0x004f
            goto L_0x004c
        L_0x0104:
            X.1lv r8 = r2.A01
            long r3 = r2.A09()
            goto L_0x0023
        L_0x010c:
            java.lang.String r1 = r5.A0M
            com.whatsapp.jid.UserJid r6 = r5.A0D
            X.1lo r5 = r5.A01()
            X.1iE r3 = r13.A04
            X.1Wm r0 = r3.A00
            X.1iD r0 = (X.C33211iD) r0
            X.2ty r0 = r0.A0f
            if (r0 != 0) goto L_0x0120
            X.2ty r0 = X.C58732ty.A04
        L_0x0120:
            X.1Wr r2 = r0.A0U()
            X.3fF r2 = (X.C69563fF) r2
            if (r1 == 0) goto L_0x0166
            X.1iF r0 = X.C33231iF.A05
            X.1Wr r4 = r0.A0U()
            X.1iG r4 = (X.C33241iG) r4
            r4.A05(r1)
            r0 = 0
            r4.A08(r0)
            X.1Vw r0 = r12.A11
            X.0rv r1 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x014a
            if (r6 == 0) goto L_0x014a
            java.lang.String r0 = r6.getRawString()
            r4.A06(r0)
        L_0x014a:
            java.lang.String r0 = X.C16030sJ.A03(r1)
            r4.A07(r0)
            X.1Wm r0 = r4.A02()
            X.1iF r0 = (X.C33231iF) r0
            r2.A03()
            X.1Wm r1 = r2.A00
            X.2ty r1 = (X.C58732ty) r1
            r1.A03 = r0
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
        L_0x0166:
            if (r5 == 0) goto L_0x017b
            X.2uO r0 = r5.A01()
            r2.A03()
            X.1Wm r1 = r2.A00
            X.2ty r1 = (X.C58732ty) r1
            r1.A02 = r0
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
        L_0x017b:
            X.1iD r0 = X.C33211iD.A0o
            X.1Wr r1 = r0.A0U()
            X.1iE r1 = (X.C33221iE) r1
            X.3fG r0 = r12.A19(r13, r14)
            if (r0 == 0) goto L_0x01a5
            r1.A0C(r0)
        L_0x018c:
            r2.A05(r1)
        L_0x018f:
            r3.A03()
            X.1Wm r3 = r3.A00
            X.1iD r3 = (X.C33211iD) r3
            X.1Wm r0 = r2.A02()
            X.2ty r0 = (X.C58732ty) r0
            r3.A0f = r0
            int r1 = r3.A00
            r0 = 32768(0x8000, float:4.5918E-41)
            goto L_0x00f9
        L_0x01a5:
            if (r1 == 0) goto L_0x018f
            goto L_0x018c
        L_0x01a8:
            X.3fG r1 = r12.A19(r13, r14)
            if (r1 == 0) goto L_0x00fc
            X.1iE r0 = r13.A04
            r0.A0C(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38641rB.A5j(X.21Q, X.1GC):void");
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r8) {
        long j2 = this.A0I;
        return new C38641rB(this.A02, r8, this, j2, true);
    }
}
