package X;

import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.1QZ  reason: invalid class name */
public class AnonymousClass1QZ {
    public final AnonymousClass1G1 A00;
    public final C14870pt A01;
    public final C17150uc A02;
    public final C16000sG A03;
    public final AnonymousClass01V A04;
    public final C16980tz A05;
    public final AnonymousClass013 A06;
    public final C16510tB A07;

    public AnonymousClass1QZ(AnonymousClass1G1 r1, C14870pt r2, C17150uc r3, C16000sG r4, AnonymousClass01V r5, C16980tz r6, AnonymousClass013 r7, C16510tB r8) {
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r7;
        this.A00 = r1;
        this.A07 = r8;
        this.A02 = r3;
    }

    public AnonymousClass25P A00(String str) {
        String str2 = null;
        AnonymousClass25L r6 = new AnonymousClass25L();
        try {
            for (String split : AnonymousClass25M.A00(str)) {
                AnonymousClass25M.A01(Arrays.asList(AnonymousClass25M.A00.split(split)), r6);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List<AnonymousClass25N> list = r6.A02;
            if (list.size() <= 257) {
                StringBuilder sb = new StringBuilder("contactpicker/contact array separation (size: ");
                sb.append(list.size());
                sb.append(")");
                C28921Zf r7 = new C28921Zf(sb.toString());
                for (AnonymousClass25N r8 : list) {
                    try {
                        C16980tz r2 = this.A05;
                        C16000sG r0 = this.A03;
                        AnonymousClass013 r62 = this.A06;
                        C39681st r1 = new C39681st(r0, r2, r62);
                        r1.A07(r8);
                        r1.A05(this.A02);
                        C39701sv r22 = r1.A03;
                        try {
                            C39691su r02 = new C39691su(new AnonymousClass25O(this.A00, r62).A00(r22), r22);
                            arrayList2.add(r02);
                            arrayList.add(r02.A00);
                        } catch (AnonymousClass25G e2) {
                            Log.e((Throwable) new AnonymousClass25H(e2));
                            throw new AnonymousClass25K();
                        }
                    } catch (AnonymousClass25G e3) {
                        Log.e("Failed to generate VCard data, skip it.", e3);
                    }
                }
                r7.A01();
                if (arrayList2.size() == 1) {
                    str2 = ((C39691su) arrayList2.get(0)).A01.A02();
                }
                return new AnonymousClass25P(str2, arrayList, arrayList2);
            }
            StringBuilder sb2 = new StringBuilder("Too many vCards for a contact array message: ");
            sb2.append(list.size());
            Log.w(sb2.toString());
            throw new AnonymousClass25J();
        } catch (AnonymousClass25G unused) {
            throw new AnonymousClass25I();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x003f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0046 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0064 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x0064=Splitter:B:38:0x0064, B:18:0x0037=Splitter:B:18:0x0037} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(android.net.Uri r7) {
        /*
            r6 = this;
            X.01V r0 = r6.A04
            android.content.ContentResolver r2 = r0.A0C()
            if (r2 == 0) goto L_0x006c
            X.0tB r1 = r6.A07
            r1.A01(r7)
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r5 = r2.openAssetFileDescriptor(r7, r0)     // Catch:{ SecurityException -> 0x0065 }
            if (r5 == 0) goto L_0x0047
            android.os.ParcelFileDescriptor r0 = r5.getParcelFileDescriptor()     // Catch:{ all -> 0x005e }
            r1.A02(r0)     // Catch:{ all -> 0x005e }
            java.io.FileInputStream r4 = r5.createInputStream()     // Catch:{ all -> 0x005e }
            r2 = 10000000(0x989680, double:4.9406565E-317)
            X.1q7 r1 = new X.1q7     // Catch:{ all -> 0x0040 }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = X.C30311c8.A00(r1)     // Catch:{ all -> 0x003b }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x003b }
            r1.close()     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x0037
            r4.close()     // Catch:{ all -> 0x005e }
        L_0x0037:
            r5.close()     // Catch:{ SecurityException -> 0x0065 }
            return r0
        L_0x003b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            if (r4 == 0) goto L_0x0046
            r4.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0     // Catch:{ all -> 0x005e }
        L_0x0047:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r1.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "Unable to open uri="
            r1.append(r0)     // Catch:{ all -> 0x005e }
            r1.append(r7)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x005e }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x005e }
            r0.<init>(r1)     // Catch:{ all -> 0x005e }
            throw r0     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0064
            r5.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ SecurityException -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        L_0x006c:
            java.lang.String r1 = "Unable to open uri; cr=null"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1QZ.A01(android.net.Uri):java.lang.String");
    }

    public void A02(AnonymousClass25G r9) {
        C14870pt r1;
        int i2;
        Log.e("vcardloader/exception", new AnonymousClass25H(r9));
        if (r9 instanceof AnonymousClass25I) {
            r1 = this.A01;
            i2 = R.string.str197b;
        } else if (r9 instanceof AnonymousClass25J) {
            this.A01.A0H(this.A06.A0J(new Object[]{257}, R.plurals.plurals0024, 257), 0);
            return;
        } else if (r9 instanceof AnonymousClass25K) {
            r1 = this.A01;
            i2 = R.string.str0d9e;
        } else {
            return;
        }
        r1.A09(i2, 0);
    }
}
