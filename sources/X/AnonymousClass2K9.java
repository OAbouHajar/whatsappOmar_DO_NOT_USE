package X;

import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.2K9  reason: invalid class name */
public class AnonymousClass2K9 extends C16690tT {
    public final Uri A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final C16760tb A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final AnonymousClass013 A06;
    public final C14710pd A07;
    public final C16490t9 A08;
    public final C18210wK A09;
    public final C16740tZ A0A;
    public final C18820xJ A0B;
    public final AnonymousClass1A9 A0C;
    public final File A0D;
    public final String A0E;
    public final WeakReference A0F;
    public final List A0G;
    public final List A0H;
    public final boolean A0I;

    public AnonymousClass2K9(Uri uri, C14600pS r3, C16180sb r4, C14870pt r5, C16760tb r6, AnonymousClass01V r7, C16980tz r8, AnonymousClass013 r9, C14710pd r10, C16490t9 r11, C18210wK r12, C16740tZ r13, C18820xJ r14, AnonymousClass1A9 r15, File file, String str, List list, List list2, boolean z2) {
        this.A07 = r10;
        this.A02 = r5;
        this.A05 = r8;
        this.A01 = r4;
        this.A08 = r11;
        this.A03 = r6;
        this.A09 = r12;
        this.A0B = r14;
        this.A0C = r15;
        this.A04 = r7;
        this.A06 = r9;
        this.A0G = list;
        this.A00 = uri;
        this.A0D = file;
        this.A0A = r13;
        this.A0F = new WeakReference(r3);
        this.A0I = z2;
        this.A0E = str;
        this.A0H = list2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r9 != null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r26) {
        /*
            r25 = this;
            r4 = r25
            X.01V r2 = r4.A04
            android.net.Uri r1 = r4.A00
            android.content.ContentResolver r0 = r2.A0C()
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "media-file-utils/get-media-mime cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0011:
            java.lang.String r0 = X.C17970vw.A0I(r1)
            java.lang.String r9 = X.C17970vw.A0J(r0)
            goto L_0x0020
        L_0x001a:
            java.lang.String r9 = r0.getType(r1)
            if (r9 == 0) goto L_0x0011
        L_0x0020:
            X.0xJ r12 = r4.A0B     // Catch:{ Exception -> 0x0172 }
            X.0pd r14 = r4.A07     // Catch:{ Exception -> 0x0172 }
            X.0sb r11 = r4.A01     // Catch:{ Exception -> 0x0172 }
            X.0t9 r10 = r4.A08     // Catch:{ Exception -> 0x0172 }
            X.0wK r0 = r4.A09     // Catch:{ Exception -> 0x0172 }
            r24 = r0
            X.1A9 r3 = r4.A0C     // Catch:{ Exception -> 0x0172 }
            java.util.List r0 = r4.A0G     // Catch:{ Exception -> 0x0172 }
            r23 = r0
            java.io.File r8 = r4.A0D     // Catch:{ Exception -> 0x0172 }
            X.0tZ r0 = r4.A0A     // Catch:{ Exception -> 0x0172 }
            r22 = r0
            boolean r7 = r4.A0I     // Catch:{ Exception -> 0x0172 }
            java.lang.String r6 = r4.A0E     // Catch:{ Exception -> 0x0172 }
            java.util.List r5 = r4.A0H     // Catch:{ Exception -> 0x0172 }
            if (r8 != 0) goto L_0x0044
            java.io.File r8 = r3.A0Z(r1)     // Catch:{ Exception -> 0x0172 }
        L_0x0044:
            long r3 = r8.length()     // Catch:{ Exception -> 0x0172 }
            java.lang.String r15 = X.C17970vw.A0I(r1)     // Catch:{ Exception -> 0x0172 }
            java.lang.String r2 = X.C18820xJ.A04(r1, r2)     // Catch:{ Exception -> 0x0172 }
            if (r2 == 0) goto L_0x005c
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r15 = X.AnonymousClass1XI.A08(r2)     // Catch:{ Exception -> 0x0172 }
        L_0x005c:
            X.3r1 r13 = new X.3r1     // Catch:{ Exception -> 0x0172 }
            r13.<init>()     // Catch:{ Exception -> 0x0172 }
            double r0 = (double) r3     // Catch:{ Exception -> 0x0172 }
            r16 = 4716133919349538816(0x417312d000000000, double:2.0E7)
            double r0 = r0 / r16
            double r16 = java.lang.Math.ceil(r0)     // Catch:{ Exception -> 0x0172 }
            r0 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r16 = r16 * r0
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r0
            java.lang.Double r0 = java.lang.Double.valueOf(r16)     // Catch:{ Exception -> 0x0172 }
            r13.A00 = r0     // Catch:{ Exception -> 0x0172 }
            boolean r0 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x0086
            r0 = 0
            goto L_0x00cc
        L_0x0086:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ Exception -> 0x0172 }
            java.lang.String r1 = r15.toLowerCase(r0)     // Catch:{ Exception -> 0x0172 }
            java.util.Set r0 = X.C18820xJ.A09     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x0096
            r1 = 2
            goto L_0x00c8
        L_0x0096:
            java.util.Set r0 = X.C18820xJ.A0A     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x00a0
            r1 = 3
            goto L_0x00c8
        L_0x00a0:
            java.util.Set r0 = X.C18820xJ.A05     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x00aa
            r1 = 4
            goto L_0x00c8
        L_0x00aa:
            java.util.Set r0 = X.C18820xJ.A07     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x00b4
            r1 = 5
            goto L_0x00c8
        L_0x00b4:
            java.util.Set r0 = X.C18820xJ.A06     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x00be
            r1 = 6
            goto L_0x00c8
        L_0x00be:
            java.util.Set r0 = X.C18820xJ.A08     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0172 }
            r1 = 1
            if (r0 == 0) goto L_0x00c8
            r1 = 7
        L_0x00c8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x0172 }
        L_0x00cc:
            r13.A01 = r0     // Catch:{ Exception -> 0x0172 }
            r1 = 542(0x21e, float:7.6E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ Exception -> 0x0172 }
            int r0 = r14.A03(r0, r1)     // Catch:{ Exception -> 0x0172 }
            long r0 = (long) r0     // Catch:{ Exception -> 0x0172 }
            r14 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r14
            int r14 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x0167
            r10.A06(r13)     // Catch:{ Exception -> 0x0172 }
            r0 = 1065353216(0x3f800000, float:1.0)
            byte[] r1 = r12.A0A(r8, r9, r0)     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r11.A0U(r8)     // Catch:{ Exception -> 0x0172 }
            if (r0 != 0) goto L_0x015f
            java.util.UUID r0 = java.util.UUID.randomUUID()     // Catch:{ Exception -> 0x0172 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0172 }
            java.io.File r3 = r11.A0N(r0)     // Catch:{ Exception -> 0x0172 }
            X.0tB r0 = r11.A04     // Catch:{ Exception -> 0x0172 }
            X.AnonymousClass1XI.A0B(r0, r8, r3)     // Catch:{ Exception -> 0x0172 }
        L_0x00ff:
            X.0ta r0 = new X.0ta     // Catch:{ Exception -> 0x0172 }
            r0.<init>()     // Catch:{ Exception -> 0x0172 }
            r0.A0F = r3     // Catch:{ Exception -> 0x0172 }
            r4 = 0
            r20 = 0
            r19 = 9
            r13 = r4
            r17 = r4
            r18 = r4
            r21 = 0
            r10 = r24
            r11 = r4
            r12 = r0
            r14 = r22
            r15 = r2
            r16 = r23
            r22 = r7
            X.1zg r10 = r10.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0172 }
            int r8 = X.C18820xJ.A00(r8, r9)     // Catch:{ Exception -> 0x0172 }
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.A01     // Catch:{ Exception -> 0x0172 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ Exception -> 0x0172 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x0172 }
        L_0x012f:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x0161
            java.lang.Object r3 = r7.next()     // Catch:{ Exception -> 0x0172 }
            X.0tY r3 = (X.C16730tY) r3     // Catch:{ Exception -> 0x0172 }
            boolean r0 = r3 instanceof X.C38631rA     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x012f
            X.1rA r3 = (X.C38631rA) r3     // Catch:{ Exception -> 0x0172 }
            r3.A00 = r8     // Catch:{ Exception -> 0x0172 }
            r3.A06 = r9     // Catch:{ Exception -> 0x0172 }
            r3.A07 = r2     // Catch:{ Exception -> 0x0172 }
            if (r6 == 0) goto L_0x015b
            java.lang.String r0 = r6.trim()     // Catch:{ Exception -> 0x0172 }
            r3.A1C(r0)     // Catch:{ Exception -> 0x0172 }
            java.lang.String r0 = r3.A01     // Catch:{ Exception -> 0x0172 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0172 }
            if (r0 == 0) goto L_0x015b
            r3.A1C(r4)     // Catch:{ Exception -> 0x0172 }
        L_0x015b:
            r3.A0u(r5)     // Catch:{ Exception -> 0x0172 }
            goto L_0x012f
        L_0x015f:
            r3 = r8
            goto L_0x00ff
        L_0x0161:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ Exception -> 0x0172 }
            r0.<init>(r10, r1)     // Catch:{ Exception -> 0x0172 }
            return r0
        L_0x0167:
            X.00F r0 = X.C18820xJ.A03     // Catch:{ Exception -> 0x0172 }
            r10.A0A(r13, r0)     // Catch:{ Exception -> 0x0172 }
            X.43U r0 = new X.43U     // Catch:{ Exception -> 0x0172 }
            r0.<init>()     // Catch:{ Exception -> 0x0172 }
            throw r0     // Catch:{ Exception -> 0x0172 }
        L_0x0172:
            r0 = move-exception
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2K9.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0A(Object obj) {
        C14870pt r1;
        int i2;
        Object obj2 = obj;
        C14600pS r4 = (C14600pS) this.A0F.get();
        if (r4 != null) {
            r4.Ac1();
        }
        Context context = this.A05.A00;
        if (obj2 instanceof C41941wu) {
            r1 = this.A02;
            i2 = R.string.str083f;
        } else if (obj2 instanceof AnonymousClass43U) {
            int A032 = this.A07.A03(C16620tM.A02, 542);
            this.A02.A0G(r4, context.getString(R.string.str08e5, new Object[]{this.A06.A0I(new Object[]{String.format(context.getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(A032)})}, 280, (long) A032)}));
            return;
        } else if (obj2 instanceof IOException) {
            Throwable th = (Throwable) obj2;
            StringBuilder sb = new StringBuilder("sendmedia/senddocumentasync/ioerror ");
            sb.append(th);
            Log.e(sb.toString());
            if (th.getMessage() == null || !th.getMessage().contains("No space")) {
                this.A02.A09(R.string.str15fd, 0);
                return;
            } else {
                r1 = this.A02;
                i2 = R.string.str0852;
            }
        } else if (obj2 instanceof Pair) {
            Pair pair = (Pair) obj2;
            this.A03.A07((C43241zg) pair.first, (byte[]) pair.second, false, false);
            return;
        } else {
            return;
        }
        r1.A0G(r4, context.getString(i2));
    }
}
