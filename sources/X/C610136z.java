package X;

import android.app.ProgressDialog;
import java.lang.ref.WeakReference;

/* renamed from: X.36z  reason: invalid class name and case insensitive filesystem */
public class C610136z extends C16690tT {
    public ProgressDialog A00;
    public final C17130ua A01;
    public final AnonymousClass1KQ A02;
    public final C19950zG A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public C610136z(C14550pN r2, C17130ua r3, AnonymousClass1KQ r4, C19950zG r5, String str, String str2) {
        super(r2, true);
        this.A06 = C13690nt.A0h(r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = str;
        this.A04 = str2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0088 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r16) {
        /*
            r15 = this;
            java.lang.String r7 = r15.A05     // Catch:{ Exception -> 0x0095 }
            r8 = 0
            X.0zG r5 = r15.A03     // Catch:{ Exception -> 0x008e }
            r0 = 20
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x008e }
            X.16H r5 = (X.AnonymousClass16H) r5     // Catch:{ Exception -> 0x008e }
            r11 = 0
            r10 = r8
            r12 = 0
            r9 = r8
            X.1pl r2 = r5.A00(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x008e }
            X.0ua r0 = r15.A01     // Catch:{ all -> 0x0089 }
            java.io.InputStream r0 = r2.A9k(r0, r8, r6)     // Catch:{ all -> 0x0089 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0089 }
            r3.<init>(r0)     // Catch:{ all -> 0x0089 }
            r7 = 2048(0x800, float:2.87E-42)
            char[] r6 = new char[r7]     // Catch:{ all -> 0x0084 }
            int r5 = r3.read(r6, r11, r7)     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0084 }
            r1 = 0
        L_0x002d:
            r0 = -1
            if (r5 == r0) goto L_0x0045
            int r1 = r1 + r5
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 > r0) goto L_0x003d
            r4.append(r6, r11, r5)     // Catch:{ all -> 0x0084 }
            int r5 = r3.read(r6, r11, r7)     // Catch:{ all -> 0x0084 }
            goto L_0x002d
        L_0x003d:
            java.lang.String r1 = "The response from server is too big."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0084 }
            r0.<init>(r1)     // Catch:{ all -> 0x0084 }
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0045:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0084 }
            org.json.JSONObject r4 = X.C13700nu.A0K(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "title"
            java.lang.String r10 = r4.optString(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "platform"
            r4.optString(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "lang"
            r4.optString(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "url"
            java.lang.String r11 = r4.optString(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "id"
            java.lang.String r12 = r4.optString(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "description"
            java.lang.String r13 = r4.optString(r0)     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "open_flow"
            r0 = 1
            boolean r14 = r4.optBoolean(r1, r0)     // Catch:{ all -> 0x0084 }
            X.4NV r9 = new X.4NV     // Catch:{ all -> 0x0084 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0084 }
            r3.close()     // Catch:{ all -> 0x0089 }
            r2.close()     // Catch:{ Exception -> 0x008e }
            return r9
        L_0x0084:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x008d }
        L_0x008d:
            throw r0     // Catch:{ Exception -> 0x008e }
        L_0x008e:
            r1 = move-exception
            java.lang.String r0 = "http/get-help/httperror"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0095 }
            return r8
        L_0x0095:
            r1 = move-exception
            java.lang.String r0 = "Could not fetch help response"
            com.whatsapp.util.Log.e(r0, r1)
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610136z.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0A(java.lang.Object r12) {
        /*
            r11 = this;
            X.4NV r12 = (X.AnonymousClass4NV) r12
            if (r12 == 0) goto L_0x007f
            java.lang.String r10 = r12.A02
            if (r10 == 0) goto L_0x007f
            java.lang.String r8 = r12.A03
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x007f
            java.lang.String r7 = r12.A01
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x007f
            java.lang.String r9 = r12.A00
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x007f
            java.lang.ref.WeakReference r0 = r11.A06
            java.lang.Object r3 = r0.get()
            X.0pN r3 = (X.C14550pN) r3
            if (r3 == 0) goto L_0x006f
            r6 = 0
            boolean r5 = r12.A04
            java.lang.String r4 = r11.A04
            android.content.Intent r2 = X.C13680ns.A09()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.support.faq.FaqItemActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "title"
            r2.putExtra(r0, r10)
            java.lang.String r0 = "content"
            r2.putExtra(r0, r9)
            java.lang.String r0 = "url"
            r2.putExtra(r0, r8)
            java.lang.String r0 = "article_id"
            r2.putExtra(r0, r7)
            java.lang.String r0 = "show_contact_support_button"
            r2.putExtra(r0, r5)
            java.lang.String r0 = "contact_us_context"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "describe_problem_fields"
            r2.putExtra(r0, r6)
            r0 = 0
            r3.A2X(r2, r0)
            r1 = 2130772030(0x7f01003e, float:1.7147167E38)
            r0 = 2130772032(0x7f010040, float:1.714717E38)
            r3.overridePendingTransition(r1, r0)
        L_0x006f:
            android.app.ProgressDialog r0 = r11.A00
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.isShowing()
            if (r0 == 0) goto L_0x007e
            android.app.ProgressDialog r0 = r11.A00
            r0.cancel()
        L_0x007e:
            return
        L_0x007f:
            java.lang.ref.WeakReference r0 = r11.A06
            java.lang.Object r4 = r0.get()
            X.0pN r4 = (X.C14550pN) r4
            if (r4 == 0) goto L_0x006f
            X.1KQ r3 = r11.A02
            java.lang.String r2 = r11.A04
            r1 = 0
            r0 = 0
            r3.A00(r0, r4, r2, r1)
            goto L_0x006f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610136z.A0A(java.lang.Object):void");
    }
}
