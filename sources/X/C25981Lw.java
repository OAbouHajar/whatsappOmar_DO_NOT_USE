package X;

import android.content.Context;
import com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Locale;

/* renamed from: X.1Lw  reason: invalid class name and case insensitive filesystem */
public class C25981Lw {
    public final AnonymousClass12W A00;
    public final C16440t3 A01;
    public final C16980tz A02;
    public final C16260sj A03;
    public final AnonymousClass11A A04;
    public final C25971Lv A05;
    public final C25961Lu A06;

    public C25981Lw(AnonymousClass12W r3, C16440t3 r4, C16980tz r5, C16260sj r6, AnonymousClass11A r7, C25971Lv r8, C25961Lu r9) {
        this.A02 = r5;
        this.A01 = r4;
        this.A06 = r9;
        this.A00 = r3;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        r7.A02(new IDxCObserverShape72S0100000_2_I0(this, 17));
    }

    public final File A00() {
        String str;
        Context context = this.A02.A00;
        if (context.getExternalCacheDir() == null) {
            str = "draftvoicenotecache/getcachedvoicenotesdirectory/external cache directory could not be accessed";
        } else {
            File file = new File(context.getExternalCacheDir().getAbsolutePath(), "Cached Voice Notes");
            if (file.exists() || file.mkdir()) {
                return file;
            }
            str = "draftvoicenotecache/getcachedvoicenotefile/problem creating directory ";
        }
        Log.e(str);
        return null;
    }

    public final File A01(C15830rv r6) {
        File A002 = A00();
        if (A002 == null) {
            return null;
        }
        return new File(A002, String.format(Locale.US, "%s.%s", new Object[]{r6.getRawString(), "opus"}));
    }

    public final File A02(C15830rv r6) {
        File A002 = A00();
        if (A002 == null) {
            return null;
        }
        return new File(A002, String.format(Locale.US, "%s.%s", new Object[]{r6.getRawString(), "viz"}));
    }

    public final File A03(C15830rv r6) {
        File A002 = A00();
        if (A002 == null) {
            Log.i("draftvoicenotecache/getquotedmessagefile/cached voice note directory is null");
            return null;
        }
        return new File(A002, String.format(Locale.US, "%s.txt", new Object[]{r6.getRawString()}));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (X.AnonymousClass1XI.A0N(r0) == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C15830rv r6) {
        /*
            r5 = this;
            java.lang.String r0 = "Chat jid cannot be null"
            X.AnonymousClass00B.A07(r6, r0)
            java.io.File r0 = r5.A01(r6)
            java.io.File r1 = r5.A02(r6)
            if (r0 == 0) goto L_0x0016
            boolean r0 = X.AnonymousClass1XI.A0N(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            r2 = 0
        L_0x0017:
            if (r1 == 0) goto L_0x001c
            X.AnonymousClass1XI.A0N(r1)
        L_0x001c:
            java.io.File r1 = r5.A03(r6)
            if (r1 == 0) goto L_0x002b
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x002b
            r1.delete()
        L_0x002b:
            if (r2 == 0) goto L_0x005e
            X.1Lv r0 = r5.A05
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r4 = r0.iterator()
        L_0x0037:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r3 = r4.next()
            X.4E8 r3 = (X.AnonymousClass4E8) r3
            X.1yj r1 = r3.A00
            X.0rv r0 = r1.A33
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0037
            X.1yV r0 = r1.A22
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r2 = r0.A05
            r1 = 11
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.A0K(r0)
            goto L_0x0037
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25981Lw.A04(X.0rv):void");
    }
}
