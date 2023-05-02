package X;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.obwhatsapp.contentprovider.MediaProvider;
import java.lang.ref.WeakReference;

/* renamed from: X.36p  reason: invalid class name and case insensitive filesystem */
public class C609136p extends C16690tT {
    public final C16180sb A00;
    public final C16440t3 A01;
    public final AnonymousClass2DS A02;
    public final WeakReference A03;

    public C609136p(C14550pN r2, C16180sb r3, C16440t3 r4, AnonymousClass2DS r5) {
        super(r2, true);
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = C13690nt.A0h(r2);
        this.A02 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r7) {
        /*
            r6 = this;
            X.0sb r3 = r6.A00
            java.io.File r2 = r3.A09()
            r0 = 0
            X.AnonymousClass1XI.A0E(r2, r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r5 = r0.toString()
            X.0tz r0 = r3.A03
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "gdpr.zip"
            java.io.File r0 = X.C13700nu.A0C(r1, r0)
            java.io.File r4 = r3.A0L(r5)
            r3 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0056 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0056 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0051 }
            r1.<init>(r4)     // Catch:{ all -> 0x0051 }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x004c }
            r1.close()     // Catch:{ all -> 0x0051 }
            r2.close()     // Catch:{ IOException -> 0x0056 }
            X.0t3 r0 = r6.A01
            long r0 = r0.A00()
            boolean r0 = r4.setLastModified(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "gdprreportactivity/failed to update report file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r3
        L_0x004b:
            return r5
        L_0x004c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            throw r0     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            r1 = move-exception
            java.lang.String r0 = "gdprreportactivity/can't prepare report file"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609136p.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str = (String) obj;
        C14550pN r0 = (C14550pN) this.A03.get();
        if (r0 != null && !r0.AIm()) {
            AnonymousClass2DS r3 = this.A02;
            r3.Ac1();
            if (str != null) {
                Intent intent = new Intent("android.intent.action.SEND", Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.STREAM", MediaProvider.A03("gdpr_report", str));
                intent.setType("application/zip");
                intent.addFlags(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                ((C001100m) r3).startActivityForResult(Intent.createChooser(intent, (CharSequence) null), 0);
            }
        }
    }
}
