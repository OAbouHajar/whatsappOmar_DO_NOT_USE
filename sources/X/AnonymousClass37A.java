package X;

import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.facebook.redex.IDxSCallbackShape222S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.contentprovider.MediaProvider;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.io.IOUtils;

/* renamed from: X.37A  reason: invalid class name */
public class AnonymousClass37A extends C16690tT {
    public long A00;
    public String A01;
    public final Pair A02;
    public final C32301g2 A03 = new IDxSCallbackShape222S0100000_2_I1(this, 3);
    public final AnonymousClass12W A04;
    public final C14730pf A05;
    public final AnonymousClass1Y3 A06;
    public final C16050sL A07;
    public final AnonymousClass4NU A08;
    public final C23251Bb A09;
    public final AnonymousClass1Bc A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;

    public AnonymousClass37A(Pair pair, AnonymousClass12W r4, C14730pf r5, AnonymousClass1Y3 r6, C16050sL r7, AnonymousClass4NU r8, C23251Bb r9, AnonymousClass1Bc r10, String str, String str2, List list, boolean z2) {
        this.A05 = r5;
        this.A09 = r9;
        this.A04 = r4;
        this.A0A = r10;
        this.A08 = r8;
        this.A0B = str;
        this.A0C = str2;
        this.A02 = pair;
        this.A0D = list;
        this.A0E = z2;
        this.A06 = r6;
        this.A07 = r7;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0097 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r33) {
        /*
            r32 = this;
            r9 = r32
            X.4NU r0 = r9.A08
            X.0pN r15 = r0.A00
            r1 = 0
            boolean r0 = r15.isFinishing()
            if (r0 != 0) goto L_0x0122
            boolean r0 = r9.A0E
            if (r0 == 0) goto L_0x011c
            X.0pf r2 = r9.A05
            long r28 = r2.A02()
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r9.A01 = r0
            X.12W r1 = r9.A04
            X.1g2 r0 = r9.A03
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x002d
            long r0 = r2.A01()
            r9.A00 = r0
        L_0x002d:
            X.1Bc r11 = r9.A0A
            java.lang.String r14 = r9.A0B
            java.lang.String r12 = r9.A0C
            long r2 = r9.A00
            java.lang.String r10 = r9.A01
            android.util.Pair r7 = r9.A02
            java.util.List r6 = r9.A0D
            X.0sL r5 = r9.A07
            monitor-enter(r11)
            X.1Bb r8 = r11.A04     // Catch:{ all -> 0x0119 }
            r8.A06()     // Catch:{ all -> 0x0119 }
            r4 = 0
            r1 = 1
            r0 = 0
            r30 = 1
            r31 = 0
            r22 = r4
            r23 = r10
            r24 = r6
            r25 = r4
            r26 = r2
            r18 = r7
            r19 = r5
            r20 = r14
            r21 = r12
            r16 = r8
            r17 = r15
            java.lang.String r13 = r16.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31)     // Catch:{ all -> 0x0119 }
            com.whatsapp.util.Log.i((java.lang.String) r13)     // Catch:{ all -> 0x0119 }
            java.io.File r3 = r15.getFilesDir()     // Catch:{ all -> 0x0119 }
            java.lang.String r2 = "debuginfo.json"
            java.io.File r10 = X.C13700nu.A0C(r3, r2)     // Catch:{ all -> 0x0119 }
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0119 }
            if (r2 == 0) goto L_0x0083
            boolean r2 = r10.delete()     // Catch:{ all -> 0x0119 }
            if (r2 != 0) goto L_0x0083
            java.lang.String r2 = "debug-builder/infofile/error"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0119 }
            goto L_0x009e
        L_0x0083:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0098 }
            r3.<init>(r10, r1)     // Catch:{ IOException -> 0x0098 }
            byte[] r2 = r13.getBytes()     // Catch:{ all -> 0x0093 }
            r3.write(r2)     // Catch:{ all -> 0x0093 }
            r3.close()     // Catch:{ IOException -> 0x0098 }
            goto L_0x009f
        L_0x0093:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x0097 }
        L_0x0097:
            throw r2     // Catch:{ IOException -> 0x0098 }
        L_0x0098:
            r3 = move-exception
            java.lang.String r2 = "debug-builder/infofile/skip"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x0119 }
        L_0x009e:
            r10 = r4
        L_0x009f:
            com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x0119 }
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x0119 }
            boolean r2 = r11.A00()     // Catch:{ all -> 0x0119 }
            java.io.File r1 = r8.A02(r10, r1, r1, r2)     // Catch:{ all -> 0x0119 }
            if (r1 == 0) goto L_0x00bc
            long r18 = r1.length()     // Catch:{ all -> 0x0119 }
            r16 = 5242880(0x500000, double:2.590327E-317)
            int r2 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x00bc
            r0 = 0
            goto L_0x00c8
        L_0x00bc:
            boolean r1 = r11.A00()     // Catch:{ all -> 0x0119 }
            java.io.File r1 = r8.A02(r10, r0, r0, r1)     // Catch:{ all -> 0x0119 }
            java.lang.String r0 = r8.A05(r4)     // Catch:{ all -> 0x0119 }
        L_0x00c8:
            android.util.Pair r0 = X.C13690nt.A0I(r1, r0)     // Catch:{ all -> 0x0119 }
            monitor-exit(r11)
            java.lang.Object r10 = r0.first
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r8 = r0.second
            java.lang.String r8 = (java.lang.String) r8
            X.1Bb r3 = r9.A09
            long r0 = r9.A00
            java.lang.String r2 = r9.A01
            X.1Y3 r13 = r9.A06
            if (r13 == 0) goto L_0x00fd
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()
            java.lang.String r11 = r13.A01
            if (r11 == 0) goto L_0x00f0
            java.lang.String r9 = "Entry point"
            android.util.Pair r9 = X.C13690nt.A0I(r9, r11)
            r4.add(r9)
        L_0x00f0:
            java.lang.String r11 = r13.A00
            if (r11 == 0) goto L_0x00fd
            java.lang.String r9 = "Cms ids"
            android.util.Pair r9 = X.C13690nt.A0I(r9, r11)
            r4.add(r9)
        L_0x00fd:
            r30 = 0
            r22 = r8
            r23 = r2
            r25 = r4
            r26 = r0
            r18 = r7
            r19 = r5
            r16 = r3
            r17 = r15
            java.lang.String r0 = r16.A03(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r28, r30, r31)
            X.4Iv r1 = new X.4Iv
            r1.<init>(r10, r0)
            return r1
        L_0x0119:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x011c:
            X.4Iv r0 = new X.4Iv
            r0.<init>(r1, r1)
            return r0
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass37A.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        boolean z2;
        String str;
        C83994Iv r2 = (C83994Iv) obj;
        AnonymousClass4NU r0 = this.A08;
        if (r0 != null && r2 != null) {
            File file = r2.A00;
            String str2 = r2.A01;
            C14550pN r13 = r0.A00;
            AnonymousClass1BY r22 = r0.A01;
            C23241Ba r12 = r22.A01;
            String str3 = r0.A02;
            ArrayList arrayList = r0.A04;
            String str4 = r0.A03;
            String string = r13.getString(R.string.str0777);
            StringBuilder A0o = AnonymousClass000.A0o();
            if (str3 != null) {
                A0o.append(str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                A0o.append(str2);
            } else {
                A0o.append(IOUtils.LINE_SEPARATOR_UNIX);
            }
            StringBuilder A0r = AnonymousClass000.A0r(A0o.toString());
            if (arrayList == null || arrayList.isEmpty()) {
                z2 = false;
                str = "android.intent.action.SEND";
            } else {
                z2 = true;
                str = "android.intent.action.SEND_MULTIPLE";
            }
            Intent A022 = C13700nu.A02(str);
            if (file == null) {
                A022.setType("plain/text");
                A0r.append("No log file to attach.\n");
            } else {
                A022.setType(z2 ? "*/*" : "application/zip");
                A022.setFlags(1);
                Uri A032 = r12.A03.A00() ? MediaProvider.A03("support", "logs") : AnonymousClass1XI.A01(r13, file);
                if (z2) {
                    arrayList.add(A032);
                } else {
                    A022.putExtra("android.intent.extra.STREAM", A032);
                }
            }
            String[] strArr = new String[1];
            if (str4 == null) {
                str4 = "android@support.whatsapp.com";
            }
            strArr[0] = str4;
            A022.putExtra("android.intent.extra.EMAIL", strArr);
            A022.putExtra("android.intent.extra.SUBJECT", string);
            A022.putExtra("android.intent.extra.TEXT", A0r.toString());
            if (r12.A01.A0E(C16620tM.A02, 1664)) {
                A022.putExtra("android.intent.extra.CC", new String[]{"bugs@whatsapp.com"});
            }
            if (z2) {
                A022.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                ArrayList A0n = C13680ns.A0n(arrayList);
                ClipData clipData = new ClipData(string, new String[]{"application/zip", "image/*"}, new ClipData.Item((Uri) A0n.get(0)));
                A0n.remove(0);
                Iterator it = A0n.iterator();
                while (it.hasNext()) {
                    clipData.addItem(new ClipData.Item((Uri) it.next()));
                }
                A022.setClipData(clipData);
                A022.setFlags(1);
            }
            boolean A002 = r12.A00(r13, A022, r13, r13.getString(R.string.str0598), true);
            r13.Ac1();
            if (r13 instanceof AnonymousClass1Y2) {
                ((AnonymousClass1Y2) r13).AW9(A002);
            }
            r22.A00 = null;
        }
    }
}
