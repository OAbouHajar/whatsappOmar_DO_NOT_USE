package X;

import android.text.TextUtils;
import com.obwhatsapp.TextData;
import java.util.ArrayList;

/* renamed from: X.1cc  reason: invalid class name and case insensitive filesystem */
public class C30581cc extends C16740tZ implements C16850tk {
    public int A00;
    public int A01 = 0;
    public TextData A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public byte[] A08;

    public C30581cc(C28381Vw r2, byte b2, long j2) {
        super(r2, b2, j2);
    }

    public C30581cc(C28381Vw r2, long j2) {
        super(r2, (byte) 0, j2);
    }

    public C30581cc(C28381Vw r8, C30581cc r9, long j2, boolean z2) {
        super(r9, r8, j2, z2);
        this.A06 = r9.A06;
        this.A04 = r9.A04;
        this.A07 = r9.A07;
        this.A02 = r9.A02;
        this.A08 = r9.A08;
        this.A01 = r9.A01;
        this.A00 = r9.A00;
    }

    public C30581cc A12(C28381Vw r11, long j2) {
        C30581cc r1;
        TextData textData;
        if (this instanceof C39241s9) {
            throw new AnonymousClass2K2("ViewOnce messages can not be forwarded");
        }
        C28381Vw r5 = r11;
        long j3 = j2;
        if (this instanceof C30571cb) {
            C30571cb r6 = (C30571cb) this;
            r1 = new C30581cc(r11, j2);
            r1.A0k(C16030sJ.A0Q(r11.A00) ? r6.A13() : r6.A18());
            if (r6.A02 != null) {
                r1.A02 = null;
                textData = r6.A02;
            }
            return r1;
        } else if (this instanceof C38961rh) {
            r1 = new C30581cc(r11, j2);
            r1.A0k(A0I());
            if (this.A02 != null) {
                r1.A02 = null;
                textData = this.A02;
            }
            return r1;
        } else {
            C30581cc r4 = new C30581cc(r5, this, j3, false);
            C39261sB r0 = A0E().A00;
            if (r0 != null) {
                r4.A0f(new C39261sB(r0.A00, r0.A01, new ArrayList()));
            }
            if (this.A02 != null) {
                r4.A02 = null;
                r4.A16(this.A02.thumbnail);
            }
            return r4;
        }
        r1.A16(textData.thumbnail);
        return r1;
    }

    public String A13() {
        if (!(this instanceof C30571cb)) {
            return A0I();
        }
        C30571cb r4 = (C30571cb) this;
        if (TextUtils.isEmpty(r4.A0I())) {
            return r4.A00.A02;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("*");
        sb2.append(r4.A0I());
        sb2.append("*");
        sb.append(sb2.toString());
        sb.append("\n\n");
        sb.append(r4.A00.A02);
        return sb.toString();
    }

    public void A14(TextData textData) {
        byte[] bArr;
        if (!(textData == null || (bArr = this.A08) == null)) {
            textData.thumbnail = bArr;
            this.A08 = null;
        }
        this.A02 = textData;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        if ((r3 & 128) != 128) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A15(X.C53012ep r7) {
        /*
            r6 = this;
            java.lang.String r1 = r7.A0K
            r3 = 65536(0x10000, float:9.18355E-41)
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r3, r1)
            r6.A0k(r0)
            java.lang.String r4 = r7.A0J
            java.lang.String r1 = X.C30931dC.A02(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r2 = 2
            if (r0 != 0) goto L_0x001e
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0086
        L_0x001e:
            int r0 = r7.A01
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x002e
            java.lang.String r0 = r7.A0M
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r3, r0)
            r6.A06 = r0
        L_0x002e:
            int r0 = r7.A01
            r1 = 8
            r0 = r0 & 8
            if (r0 != r1) goto L_0x003e
            java.lang.String r0 = r7.A0H
            java.lang.String r0 = X.AnonymousClass1ZW.A04(r3, r0)
            r6.A04 = r0
        L_0x003e:
            int r4 = r7.A01
            r1 = 4
            r0 = r4 & 4
            if (r0 != r1) goto L_0x0049
            java.lang.String r0 = r7.A0G
            r6.A07 = r0
        L_0x0049:
            r1 = 256(0x100, float:3.59E-43)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0060
            int r1 = r7.A05
            if (r1 == 0) goto L_0x013f
            r0 = 1
            if (r1 != r0) goto L_0x013f
            X.42I r3 = X.AnonymousClass42I.A02
        L_0x0058:
            X.42I r1 = X.AnonymousClass42I.A02
            r0 = 0
            if (r3 != r1) goto L_0x005e
            r0 = 1
        L_0x005e:
            r6.A01 = r0
        L_0x0060:
            r0 = 512(0x200, float:7.175E-43)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x006e
            X.1Ww r0 = r7.A0B
            byte[] r0 = r0.A04()
            r6.A16(r0)
        L_0x006e:
            int r1 = r7.A01
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0086
            int r0 = r7.A03
            X.431 r3 = X.AnonymousClass431.A00(r0)
            if (r3 != 0) goto L_0x007f
            X.431 r3 = X.AnonymousClass431.A01
        L_0x007f:
            X.431 r0 = X.AnonymousClass431.A03
            if (r3 != r0) goto L_0x012f
            r1 = 1
        L_0x0084:
            r6.A00 = r1
        L_0x0086:
            int r3 = r7.A01
            r1 = 64
            r0 = r3 & 64
            r5 = 1
            if (r0 == r1) goto L_0x009c
            r5 = 0
            r1 = 32
            r0 = r3 & 32
            if (r0 == r1) goto L_0x009c
            r1 = 128(0x80, float:1.794E-43)
            r0 = r3 & r1
            if (r0 != r1) goto L_0x00c8
        L_0x009c:
            com.obwhatsapp.TextData r4 = new com.obwhatsapp.TextData
            r4.<init>()
            if (r5 == 0) goto L_0x00a7
            int r0 = r7.A00
            r4.backgroundColor = r0
        L_0x00a7:
            r1 = 32
            r0 = r3 & 32
            if (r0 != r1) goto L_0x00b1
            int r0 = r7.A06
            r4.textColor = r0
        L_0x00b1:
            r1 = 128(0x80, float:1.794E-43)
            r0 = r3 & r1
            if (r0 != r1) goto L_0x00c5
            int r0 = r7.A02
            X.435 r0 = X.AnonymousClass435.A00(r0)
            if (r0 != 0) goto L_0x00c1
            X.435 r0 = X.AnonymousClass435.A05
        L_0x00c1:
            int r0 = r0.value
            r4.fontStyle = r0
        L_0x00c5:
            r6.A14(r4)
        L_0x00c8:
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r3 & r1
            if (r0 != r1) goto L_0x012e
            r1 = 16384(0x4000, float:2.2959E-41)
            r0 = r3 & r1
            if (r0 != r1) goto L_0x012e
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = r3 & r1
            if (r0 != r1) goto L_0x012e
            r0 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            if (r3 != r0) goto L_0x012e
            X.1cv r5 = new X.1cv
            r5.<init>()
            java.lang.String r0 = r7.A0L
            r5.A04 = r0
            X.1Ww r0 = r7.A0E
            byte[] r0 = r0.A04()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)
            r5.A07 = r0
            X.1Ww r0 = r7.A0D
            byte[] r0 = r0.A04()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r2)
            r5.A05 = r0
            X.1Ww r0 = r7.A0C
            byte[] r0 = r0.A04()
            r5.A09 = r0
            int r4 = r7.A01
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0118
            long r2 = r7.A09
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            r5.A02 = r2
        L_0x0118:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r4 & r1
            if (r0 != r1) goto L_0x0122
            int r0 = r7.A08
            r5.A01 = r0
        L_0x0122:
            r0 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r0
            if (r4 != r0) goto L_0x012b
            int r0 = r7.A07
            r5.A00 = r0
        L_0x012b:
            r6.A0h(r5)
        L_0x012e:
            return
        L_0x012f:
            X.431 r0 = X.AnonymousClass431.A04
            if (r3 != r0) goto L_0x0137
            r6.A00 = r2
            goto L_0x0086
        L_0x0137:
            X.431 r0 = X.AnonymousClass431.A02
            r1 = 0
            if (r3 != r0) goto L_0x0084
            r1 = 3
            goto L_0x0084
        L_0x013f:
            X.42I r3 = X.AnonymousClass42I.A01
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30581cc.A15(X.2ep):void");
    }

    public void A16(byte[] bArr) {
        TextData textData = this.A02;
        if (textData != null) {
            textData.thumbnail = bArr;
        } else {
            this.A08 = bArr;
        }
    }

    public byte[] A17() {
        TextData textData = this.A02;
        return textData != null ? textData.thumbnail : this.A08;
    }

    public C16740tZ A6M(C28381Vw r9) {
        C28381Vw r3 = r9;
        if (this instanceof C39241s9) {
            C39241s9 r4 = (C39241s9) this;
            return new C39241s9(r9, r4, r4.A0I);
        } else if (this instanceof C30571cb) {
            C30571cb r42 = (C30571cb) this;
            return new C30571cb(r9, r42, r42.A0I);
        } else if (this instanceof C38961rh) {
            C38961rh r43 = (C38961rh) this;
            return new C38961rh(r9, r43, r43.A0I);
        } else if (this instanceof C39041rp) {
            C39041rp r44 = (C39041rp) this;
            return new C39041rp(r9, r44, r44.A0I);
        } else if (!(this instanceof C39051rq)) {
            return new C30581cc(r3, this, this.A0I, true);
        } else {
            C39051rq r45 = (C39051rq) this;
            return new C39051rq(r9, r45, r45.A0I);
        }
    }
}
