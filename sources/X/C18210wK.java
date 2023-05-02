package X;

import android.net.Uri;
import android.text.TextUtils;
import com.obwhatsapp.InteractiveAnnotation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0wK  reason: invalid class name and case insensitive filesystem */
public class C18210wK {
    public final AnonymousClass10M A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final C14870pt A03;
    public final C16040sK A04;
    public final AnonymousClass01Z A05;
    public final C15900s5 A06;
    public final C17130ua A07;
    public final C16440t3 A08;
    public final C16980tz A09;
    public final C16480t8 A0A;
    public final AnonymousClass17J A0B;
    public final C14710pd A0C;
    public final C17690vU A0D;
    public final C20330zs A0E;
    public final C17680vT A0F;
    public final AnonymousClass1AO A0G;
    public final AnonymousClass1QV A0H;
    public final C215514n A0I;
    public final AnonymousClass1OJ A0J;
    public final AnonymousClass1QU A0K;
    public final AnonymousClass1QX A0L;
    public final AnonymousClass1QW A0M;
    public final C17020u3 A0N;
    public final C222617g A0O;
    public final C19040xf A0P;
    public final C16320sq A0Q;
    public final C18980xZ A0R;

    public C18210wK(AnonymousClass10M r2, C16300so r3, C16180sb r4, C14870pt r5, C16040sK r6, AnonymousClass01Z r7, C15900s5 r8, C17130ua r9, C16440t3 r10, C16980tz r11, C16480t8 r12, AnonymousClass17J r13, C14710pd r14, C17690vU r15, C20330zs r16, C17680vT r17, AnonymousClass1AO r18, AnonymousClass1QV r19, C215514n r20, AnonymousClass1OJ r21, AnonymousClass1QU r22, AnonymousClass1QX r23, AnonymousClass1QW r24, C17020u3 r25, C222617g r26, C19040xf r27, C16320sq r28, C18980xZ r29) {
        this.A09 = r11;
        this.A08 = r10;
        this.A0C = r14;
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A0Q = r28;
        this.A02 = r4;
        this.A07 = r9;
        this.A00 = r2;
        this.A06 = r8;
        this.A0R = r29;
        this.A0P = r27;
        this.A0G = r18;
        this.A0O = r26;
        this.A0I = r20;
        this.A0L = r23;
        this.A0J = r21;
        this.A0A = r12;
        this.A0M = r24;
        this.A0B = r13;
        this.A0H = r19;
        this.A0F = r17;
        this.A0D = r15;
        this.A0E = r16;
        this.A0N = r25;
        this.A0K = r22;
        this.A05 = r7;
    }

    public C43241zg A00(Uri uri, C16750ta r20, C35541m6 r21, C16740tZ r22, String str, List list, List list2, List list3, byte b2, int i2, int i3, boolean z2) {
        String str2;
        ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            byte[] A012 = C224718b.A01(this.A04, this.A08, false);
            if (A012 != null) {
                str2 = C004101u.A04(A012);
            } else {
                throw new IllegalStateException("multicast id could not be created");
            }
        } else {
            str2 = null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri2 = uri;
            arrayList.add(A03(uri2, r20.A02(), r21, (C15830rv) it.next(), r22, str, str2, list2, list3, b2, i2, i3, z2));
        }
        return new C43241zg(arrayList);
    }

    public C31781f1 A01(String str) {
        C31781f1 r0;
        if (str == null) {
            return null;
        }
        AnonymousClass1OJ r3 = this.A0J;
        synchronized (r3) {
            AnonymousClass03L r1 = r3.A00;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(1);
            if (r1.A02(sb.toString()) != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(1);
                r0 = (C31781f1) r1.A02(sb2.toString());
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public AnonymousClass1XP A02(AnonymousClass1XL r6, boolean z2) {
        AnonymousClass1OJ r1;
        C31781f1 A022;
        String str = r6.A03;
        if (str == null || (A022 = r1.A02(str, 0)) == null) {
            return null;
        }
        C43251zh r2 = new C43251zh(A022, (r1 = this.A0J), this.A0Q, z2);
        C38231qS r0 = r6.A00;
        AnonymousClass1XK r12 = r0.A05;
        return new AnonymousClass1XP(r0.A0A ? new C43261zi(r12) : new C43271zj(r12), A022, r2, r6);
    }

    public C16730tY A03(Uri uri, C16750ta r12, C35541m6 r13, C15830rv r14, C16740tZ r15, String str, String str2, List list, List list2, byte b2, int i2, int i3, boolean z2) {
        C222617g r8 = this.A0O;
        byte b3 = b2;
        C16740tZ A012 = r8.A01(r8.A05.A02(r14, true), b3, this.A08.A00());
        if (A012 instanceof C16730tY) {
            C16730tY r4 = (C16730tY) A012;
            r4.A02 = r12;
            r4.A02 = 0;
            r4.A0W(1);
            r4.A07 = null;
            r4.A01 = 0;
            r4.A08 = i2;
            r8.A05(r4, r15);
            if (str != null) {
                r4.A03 = str.trim();
                if (TextUtils.isEmpty(r4.A13())) {
                    r4.A03 = null;
                }
            }
            File file = r12.A0F;
            if (file == null) {
                AnonymousClass00B.A06(uri);
                r4.A07 = uri.toString();
                r4.A01 = 0;
            } else {
                r4.A07 = file.getName();
                r4.A01 = r12.A0F.length();
            }
            if (b3 == 2 || b3 == 3 || b3 == 43 || b3 == 13) {
                long j2 = r12.A0D;
                if (j2 > 0 || r12.A0E > 0) {
                    r4.A00 = (int) ((r12.A0E - j2) / 1000);
                } else {
                    r4.A00 = C17970vw.A03(r12.A0F);
                }
            }
            r4.A0u(list);
            r12.A0A = r4.A01;
            r12.A0L = true;
            r4.A0l(str2);
            if (z2) {
                r4.A0S(4);
            }
            List list3 = list2;
            if (list2 != null && !list3.isEmpty()) {
                r12.A0V = (InteractiveAnnotation[]) list3.toArray(new InteractiveAnnotation[0]);
            }
            int i4 = i3;
            if (i3 > 0) {
                r4.A0S(1);
                r4.A05 = i4;
            }
            if (this.A0C.A0E(C16620tM.A01, 815) && r13 != null) {
                r4.A0K = r13;
            }
            return r4;
        }
        StringBuilder sb = new StringBuilder("FMessageFactory/newFMessageMedia/wrong message type; mediaWaType=");
        sb.append(b3);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A04() {
        /*
            r3 = this;
            X.0pd r2 = r3.A0C
            r1 = 147(0x93, float:2.06E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0019
            X.0xZ r2 = r3.A0R
            monitor-enter(r2)
            boolean r1 = r2.A01     // Catch:{ all -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0015:
            monitor-exit(r2)
            r0 = 1
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18210wK.A04():java.lang.Boolean");
    }
}
