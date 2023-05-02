package X;

import android.database.Cursor;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.1rA  reason: invalid class name and case insensitive filesystem */
public class C38631rA extends C16730tY implements C16850tk, C30081bi {
    public int A00;
    public String A01;

    public C38631rA(C16750ta r2, C28381Vw r3, C38631rA r4, byte b2, long j2, boolean z2) {
        super(r2, r3, r4, b2, j2, z2);
        this.A00 = r4.A00;
        this.A01 = r4.A01;
    }

    public C38631rA(C28381Vw r1, byte b2, long j2) {
        super(r1, b2, j2);
    }

    public C38631rA(C28381Vw r2, long j2) {
        super(r2, (byte) 9, j2);
    }

    public C38631rA(C445324l r2, C28381Vw r3, long j2, boolean z2, boolean z3) {
        super(r3, (byte) 63, j2);
        A1B(r2, z2, z3);
    }

    public C16870tm A0F() {
        C16870tm A0F = super.A0F();
        AnonymousClass00B.A06(A0F);
        return A0F;
    }

    public void A15(Cursor cursor, C16750ta r3) {
        super.A15(cursor, r3);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
        A1C(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
    }

    public void A16(Cursor cursor, C16750ta r3) {
        super.A16(cursor, r3);
        this.A00 = cursor.getInt(cursor.getColumnIndexOrThrow("page_count"));
        A1C(cursor.getString(cursor.getColumnIndexOrThrow("media_caption")));
    }

    public String A19() {
        if (TextUtils.isEmpty(this.A01)) {
            return A14();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(" ");
        sb.append(A14());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x027c, code lost:
        if (r8.A0U != null) goto L_0x0129;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1A(X.C16750ta r8, X.C68703dr r9, X.AnonymousClass1WV r10, X.C16870tm r11, X.AnonymousClass1GC r12, byte[] r13, boolean r14, boolean r15) {
        /*
            r7 = this;
            if (r14 == 0) goto L_0x000a
            java.lang.String r0 = r7.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0038
        L_0x000a:
            java.lang.String r2 = r7.A08
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 1
            r1.A00 = r0
            r1.A0J = r2
            if (r14 != 0) goto L_0x0038
            java.lang.String r0 = r7.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with url not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r7.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0038:
            java.lang.String r2 = r7.A06
            if (r2 == 0) goto L_0x004b
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 2
            r1.A00 = r0
            r1.A0G = r2
        L_0x004b:
            java.lang.String r2 = r7.A13()
            if (r2 == 0) goto L_0x0060
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 4
            r1.A00 = r0
            r1.A0I = r2
        L_0x0060:
            java.lang.String r0 = r7.A14()
            if (r0 == 0) goto L_0x0079
            java.lang.String r2 = r7.A14()
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.A00 = r0
            r1.A0F = r2
        L_0x0079:
            if (r14 == 0) goto L_0x007f
            int r0 = r7.A00
            if (r0 < 0) goto L_0x0090
        L_0x007f:
            int r2 = r7.A00
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 32
            r1.A00 = r0
            r1.A01 = r2
        L_0x0090:
            java.lang.String r3 = r7.A01
            if (r3 == 0) goto L_0x00a4
            r9.A03()
            X.1Wm r2 = r9.A00
            X.24l r2 = (X.C445324l) r2
            int r1 = r2.A00
            r0 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A0D = r3
        L_0x00a4:
            r2 = 0
            if (r14 == 0) goto L_0x00af
            java.lang.String r0 = r7.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c9
        L_0x00af:
            java.lang.String r0 = r7.A05
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r2, r0)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 8
            r1.A00 = r0
            r1.A07 = r3
        L_0x00c9:
            java.lang.String r0 = r7.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00eb
            java.lang.String r0 = r7.A04
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r2, r0)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 256(0x100, float:3.59E-43)
            r1.A00 = r0
            r1.A06 = r3
        L_0x00eb:
            r5 = 0
            if (r14 == 0) goto L_0x00f5
            long r0 = r7.A01
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x027a
        L_0x00f5:
            long r0 = r7.A01
            r9.A03()
            X.1Wm r4 = r9.A00
            X.24l r4 = (X.C445324l) r4
            int r3 = r4.A00
            r3 = r3 | 16
            r4.A00 = r3
            r4.A04 = r0
            if (r14 != 0) goto L_0x027a
            long r0 = r7.A01
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x0129
            java.lang.String r4 = "FMessageDocument/buildE2eMessage/sending document with media size not set, size="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = "; message.key="
            r3.append(r0)
            X.1Vw r0 = r7.A11
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0129:
            byte[] r1 = r8.A0U
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r2, r0)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 64
            r1.A00 = r0
            r1.A09 = r3
        L_0x013f:
            long r0 = r8.A0B
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0157
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r9.A03()
            X.1Wm r4 = r9.A00
            X.24l r4 = (X.C445324l) r4
            int r3 = r4.A00
            r3 = r3 | 1024(0x400, float:1.435E-42)
            r4.A00 = r3
            r4.A05 = r0
        L_0x0157:
            X.1cv r5 = r7.A0U
            if (r5 == 0) goto L_0x0277
            java.lang.String r0 = r5.A04
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = r5.A07
            if (r0 == 0) goto L_0x0277
            java.lang.String r0 = r5.A05
            if (r0 == 0) goto L_0x0277
            byte[] r0 = r5.A0A
            if (r0 == 0) goto L_0x0277
            byte[] r1 = r5.A09
            byte[] r0 = r8.A0U
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0277
            long r3 = r5.A02
            long r0 = r8.A0B
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0277
            r4 = 1
            java.lang.String r3 = r5.A04
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 4096(0x1000, float:5.74E-42)
            r1.A00 = r0
            r1.A0H = r3
            java.lang.String r0 = r5.A07
            byte[] r1 = android.util.Base64.decode(r0, r2)
            int r0 = r1.length
            X.1Ww r3 = X.C28631Ww.A01(r1, r2, r0)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 8192(0x2000, float:1.14794E-41)
            r1.A00 = r0
            r1.A0B = r3
            java.lang.String r0 = r5.A05
            byte[] r2 = android.util.Base64.decode(r0, r2)
            int r1 = r2.length
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 16384(0x4000, float:2.2959E-41)
            r1.A00 = r0
            r1.A0A = r2
            int r3 = r5.A01
            if (r3 <= 0) goto L_0x01ee
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x01ee
            r9.A03()
            X.1Wm r2 = r9.A00
            X.24l r2 = (X.C445324l) r2
            int r1 = r2.A00
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A03 = r3
            int r3 = r5.A00
            r9.A03()
            X.1Wm r2 = r9.A00
            X.24l r2 = (X.C445324l) r2
            int r1 = r2.A00
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A02 = r3
        L_0x01ee:
            if (r15 != 0) goto L_0x020f
            if (r4 == 0) goto L_0x026c
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x026c
            byte[] r2 = r5.A0A
        L_0x01f8:
            int r1 = r2.length
            r0 = 0
            X.1Ww r3 = X.C28631Ww.A01(r2, r0, r1)
            r9.A03()
            X.1Wm r2 = r9.A00
            X.24l r2 = (X.C445324l) r2
            int r1 = r2.A00
            r0 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r0
            r2.A00 = r1
            r2.A08 = r3
        L_0x020f:
            boolean r0 = X.C41071vB.A0O(r10, r7, r13)
            if (r0 == 0) goto L_0x0229
            X.21S r0 = r12.A00(r10, r7, r13, r15)
            r9.A03()
            X.1Wm r2 = r9.A00
            X.24l r2 = (X.C445324l) r2
            r2.A0C = r0
            int r1 = r2.A00
            r0 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 | r0
            r2.A00 = r1
        L_0x0229:
            java.lang.String r0 = r8.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0258
            java.lang.String r2 = r8.A0G
            r9.A03()
            X.1Wm r1 = r9.A00
            X.24l r1 = (X.C445324l) r1
            int r0 = r1.A00
            r0 = r0 | 512(0x200, float:7.175E-43)
            r1.A00 = r0
            r1.A0E = r2
        L_0x0242:
            int r1 = r7.A08
            r0 = 7
            if (r1 != r0) goto L_0x0257
            r9.A03()
            X.1Wm r2 = r9.A00
            X.24l r2 = (X.C445324l) r2
            r1 = 1
            int r0 = r2.A00
            r0 = r0 | 2048(0x800, float:2.87E-42)
            r2.A00 = r0
            r2.A0K = r1
        L_0x0257:
            return
        L_0x0258:
            java.lang.String r0 = "FMessageDocument/buildE2eMessage/sending document with directPath not set; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r7.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0242
        L_0x026c:
            byte[] r0 = r11.A07()
            if (r0 == 0) goto L_0x020f
            byte[] r2 = r11.A07()
            goto L_0x01f8
        L_0x0277:
            r4 = 0
            goto L_0x01ee
        L_0x027a:
            byte[] r0 = r8.A0U
            if (r0 == 0) goto L_0x013f
            goto L_0x0129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38631rA.A1A(X.0ta, X.3dr, X.1WV, X.0tm, X.1GC, byte[], boolean, boolean):void");
    }

    public void A1B(C445324l r12, boolean z2, boolean z3) {
        C16750ta r5 = new C16750ta();
        this.A02 = r5;
        if ((r12.A00 & 64) == 64) {
            C42941yx.A00(r5, this, r12.A09.A04());
        } else if (!z2) {
            StringBuilder sb = new StringBuilder("FMessageDocument/missing media key; message.key=");
            sb.append(this.A11);
            Log.w(sb.toString());
            throw new AnonymousClass23S(16);
        }
        boolean z4 = false;
        if ((r12.A00 & 1024) == 1024) {
            z4 = true;
        }
        if (z4) {
            r5.A0B = r12.A05 * 1000;
        }
        byte[] A04 = r12.A08.A04();
        if (A04.length > 0) {
            this.A02 = 1;
            A0F().A03(A04, z3);
        }
        if (!z2 || (r12.A00 & 16) == 16) {
            long j2 = r12.A04;
            if (j2 >= 0) {
                this.A01 = j2;
            } else {
                StringBuilder sb2 = new StringBuilder("FMessageDocument/bogus media size received; file_length=");
                sb2.append(j2);
                sb2.append("; message.key=");
                sb2.append(this.A11);
                Log.w(sb2.toString());
                throw new AnonymousClass23S(13);
            }
        }
        if (!z2 || (r12.A00 & 8) == 8) {
            byte[] A042 = r12.A07.A04();
            int length = A042.length;
            if (length == 32) {
                this.A05 = Base64.encodeToString(A042, 2);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("FMessageDocument/bogus sha-256 hash received; length=");
                sb3.append(length);
                sb3.append("; message.key=");
                sb3.append(this.A11);
                Log.w(sb3.toString());
                throw new AnonymousClass23S(14);
            }
        }
        if ((r12.A00 & 256) == 256) {
            byte[] A043 = r12.A06.A04();
            int length2 = A043.length;
            if (length2 == 32) {
                this.A04 = Base64.encodeToString(A043, 2);
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("FMessageDocument/bogus sha-256 hash received; length=");
                sb4.append(length2);
                sb4.append("; message.key=");
                sb4.append(this.A11);
                Log.w(sb4.toString());
                throw new AnonymousClass23S(14);
            }
        }
        if (!z2 || (r12.A00 & 1) == 1) {
            A17(r12.A0J);
        }
        if (!TextUtils.isEmpty(r12.A0I)) {
            this.A03 = AnonymousClass1ZW.A04(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, r12.A0I);
        }
        this.A00 = r12.A01;
        if (!TextUtils.isEmpty(r12.A0D)) {
            A1C(r12.A0D);
        }
        if (!TextUtils.isEmpty(r12.A0F)) {
            this.A07 = AnonymousClass1ZW.A04(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, r12.A0F);
        }
        if (!z2 || (r12.A00 & 512) == 512) {
            r5.A0G = r12.A0E;
        } else {
            StringBuilder sb5 = new StringBuilder("FMessageAudio/message without direct path received; message.key=");
            sb5.append(this.A11);
            sb5.append("; message.senderJid=");
            sb5.append(this.A0M);
            Log.w(sb5.toString());
        }
        int i2 = r12.A00;
        if ((i2 & 4096) == 4096 && (i2 & 16384) == 16384 && (i2 & 8192) == 8192 && (i2 & 64) == 64) {
            C30771cv r3 = new C30771cv();
            r3.A04 = r12.A0H;
            r3.A07 = Base64.encodeToString(r12.A0B.A04(), 2);
            r3.A05 = Base64.encodeToString(r12.A0A.A04(), 2);
            r3.A09 = r12.A09.A04();
            int i3 = r12.A00;
            if ((i3 & 1024) == 1024) {
                r3.A02 = r12.A05 * 1000;
            }
            if ((i3 & 32768) == 32768) {
                r3.A0A = r12.A08.A04();
            }
            int i4 = r12.A00;
            if ((i4 & AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START) == 262144) {
                r3.A01 = r12.A03;
            }
            if ((i4 & 131072) == 131072) {
                r3.A00 = r12.A02;
            }
            A0h(r3);
        }
        this.A06 = r12.A0G;
        if (r12.A0K) {
            this.A08 = 7;
        }
    }

    public void A1C(String str) {
        this.A01 = AnonymousClass1ZW.A04(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED, str);
    }

    public void A5j(AnonymousClass21Q r15, AnonymousClass1GC r16) {
        StringBuilder sb;
        byte b2;
        boolean z2;
        String str;
        boolean z3;
        AnonymousClass1GC r10 = r16;
        if (this instanceof C38911rc) {
            C38911rc r5 = (C38911rc) this;
            C16750ta r6 = r5.A02;
            C16870tm A0F = r5.A0F();
            if (r6 == null || (!(z3 = r15.A09) && r6.A0U == null)) {
                sb = new StringBuilder("FMessageTemplateDocument/unable to send encrypted media message due to missing mediaKey; message.key=");
                sb.append(r5.A11);
                str = "; media_wa_type=";
            } else {
                C33221iE r4 = r15.A04;
                C69633fM r3 = (C69633fM) r4.A05().A0U();
                C59032uZ r2 = r4.A05().A03;
                if (r2 == null) {
                    r2 = C59032uZ.A07;
                }
                C68703dr r7 = (C68703dr) (r2.A01 == 1 ? (C28541Wm) r2.A03 : C445324l.A0L).A0U();
                r5.A1A(r6, r7, r15.A05, A0F, r10, r15.A0A, z3, r15.A07);
                C30611cf r0 = r5.A00;
                if (r0 != null) {
                    C69583fH A002 = AnonymousClass38C.A00(r4, r0);
                    A002.A03();
                    C59032uZ r1 = (C59032uZ) A002.A00;
                    r1.A03 = r7.A02();
                    r1.A01 = 1;
                    r3.A06(A002);
                    r3.A05(A002);
                    r4.A0D(r3);
                    return;
                }
                sb = new StringBuilder();
                str = "MessageTemplateDocument: cannot send encrypted document message, ";
            }
            sb.append(str);
            b2 = r5.A10;
        } else {
            C16750ta r62 = this.A02;
            C16870tm A0F2 = A0F();
            if (r62 == null || (!(z2 = r15.A09) && r62.A0U == null)) {
                sb = new StringBuilder("FMessageDocument/unable to send encrypted media message due to missing mediaKey; message.key=");
                sb.append(this.A11);
                sb.append("; media_wa_type=");
                b2 = this.A10;
            } else {
                C33221iE r22 = r15.A04;
                C445324l r02 = ((C33211iD) r22.A00).A0C;
                if (r02 == null) {
                    r02 = C445324l.A0L;
                }
                C68703dr r72 = (C68703dr) r02.A0U();
                A1A(r62, r72, r15.A05, A0F2, r10, r15.A0A, z2, r15.A07);
                if (C42551xz.A04(this)) {
                    C58852uG r03 = ((C33211iD) r22.A00).A03;
                    if (r03 == null) {
                        r03 = C58852uG.A08;
                    }
                    C69503f9 r32 = (C69503f9) r03.A0U();
                    C42551xz.A03(r32, A0E().A00);
                    r32.A03();
                    C58852uG r12 = (C58852uG) r32.A00;
                    r12.A05 = r72.A02();
                    r12.A01 = 2;
                    r32.A05(AnonymousClass438.A01);
                    r22.A06((C58852uG) r32.A02());
                    return;
                } else if (!TextUtils.isEmpty(this.A01)) {
                    C52992en r04 = ((C33211iD) r22.A00).A0F;
                    if (r04 == null) {
                        r04 = C52992en.A02;
                    }
                    C69513fA r42 = (C69513fA) r04.A0U();
                    C33211iD r05 = ((C52992en) r42.A00).A01;
                    if (r05 == null) {
                        r05 = C33211iD.A0o;
                    }
                    C28581Wr A0U = r05.A0U();
                    A0U.A03();
                    C33211iD r13 = (C33211iD) A0U.A00;
                    r13.A0C = (C445324l) r72.A02();
                    r13.A00 |= 64;
                    r42.A05((C33211iD) A0U.A02());
                    r22.A03();
                    C33211iD r14 = (C33211iD) r22.A00;
                    r14.A0F = (C52992en) r42.A02();
                    r14.A01 |= 512;
                    return;
                } else {
                    r22.A03();
                    C33211iD r17 = (C33211iD) r22.A00;
                    r17.A0C = (C445324l) r72.A02();
                    r17.A00 |= 64;
                    return;
                }
            }
        }
        sb.append(b2);
        Log.w(sb.toString());
    }

    public C16740tZ A6M(C28381Vw r9) {
        C28381Vw r2 = r9;
        if (this instanceof C38911rc) {
            C38911rc r3 = (C38911rc) this;
            return new C38911rc(r3.A02, r2, r3, r3.A0I);
        } else if (this instanceof C39151s0) {
            C39151s0 r32 = (C39151s0) this;
            return new C39151s0(r32.A02, r2, r32, r32.A0I, true);
        } else {
            return new C38631rA(this.A02, r2, this, this.A10, this.A0I, true);
        }
    }
}
