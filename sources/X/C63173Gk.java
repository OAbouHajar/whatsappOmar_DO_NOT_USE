package X;

import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.facebook.redex.RunnableRunnableShape1S0101000_I1;
import com.whatsapp.util.Log;

/* renamed from: X.3Gk  reason: invalid class name and case insensitive filesystem */
public class C63173Gk implements C19550yc {
    public C18950xW A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final C14870pt A03;
    public final C16600tK A04;
    public final AnonymousClass4RZ A05;
    public final C17190ug A06;
    public final C16320sq A07;

    public C63173Gk(C14870pt r2, C16600tK r3, AnonymousClass4RZ r4, C17190ug r5, C16320sq r6) {
        this.A03 = r2;
        this.A07 = r6;
        this.A06 = r5;
        this.A04 = r3;
        this.A05 = r4;
    }

    public static final String A00(C28371Vv r0, String str) {
        C28371Vv A0J = r0.A0J(str);
        if (A0J == null) {
            return null;
        }
        return A0J.A0L();
    }

    public void APb(String str) {
        if (!this.A01) {
            this.A03.Acq(new RunnableRunnableShape18S0100000_I1_1(this.A05, 22));
        }
    }

    public void AQe(C28371Vv r5, String str) {
        if (!this.A01) {
            Log.e("GetCTWAContextIQ/response-error");
            C28371Vv A0J = r5.A0J("error");
            if (A0J != null) {
                this.A03.Acq(new RunnableRunnableShape1S0101000_I1((Object) this, A0J.A0A("code", 0), 4));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: X.4Ho} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v3 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r16, java.lang.String r17) {
        /*
            r15 = this;
            boolean r0 = r15.A01
            if (r0 != 0) goto L_0x0112
            java.lang.String r0 = "context"
            r1 = r16
            X.1Vv r3 = r1.A0J(r0)
            if (r3 == 0) goto L_0x00fb
            java.lang.String r0 = "headline"
            java.lang.String r10 = A00(r3, r0)
            java.lang.String r0 = "body"
            java.lang.String r11 = A00(r3, r0)
            java.lang.String r0 = "clickId"
            java.lang.String r13 = A00(r3, r0)
            java.lang.String r0 = "source"
            X.1Vv r2 = r3.A0J(r0)
            if (r2 == 0) goto L_0x00fb
            java.lang.String r0 = "id"
            java.lang.String r5 = A00(r2, r0)
            java.lang.String r0 = "type"
            java.lang.String r4 = A00(r2, r0)
            java.lang.String r1 = "url"
            java.lang.String r2 = A00(r2, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00fb
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x00fb
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00fb
            X.4KY r7 = new X.4KY
            r7.<init>(r5, r4, r2)
            java.lang.String r0 = "thumbnail"
            X.1Vv r4 = r3.A0J(r0)
            r8 = 0
            if (r4 == 0) goto L_0x0078
            java.lang.String r2 = A00(r4, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "bytes"
            X.1Vv r0 = r4.A0J(r0)
            if (r0 == 0) goto L_0x0072
            byte[] r8 = r0.A01
        L_0x0072:
            X.4Ho r0 = new X.4Ho
            r0.<init>(r2, r8)
            r8 = r0
        L_0x0078:
            java.lang.String r0 = "welcome_message"
            X.1Vv r0 = r3.A0J(r0)
            if (r0 == 0) goto L_0x00ce
            java.lang.String r12 = r0.A0L()
        L_0x0085:
            java.lang.String r0 = "icebreaker"
            java.util.List r0 = r3.A0O(r0)
            java.util.ArrayList r14 = X.AnonymousClass000.A0u()
            if (r0 == 0) goto L_0x00d0
            java.util.Iterator r6 = r0.iterator()
        L_0x0095:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00d0
            X.1Vv r5 = X.C13690nt.A0S(r6)
            java.lang.String r0 = "question"
            X.1Vv r2 = r5.A0J(r0)
            if (r2 == 0) goto L_0x0095
            java.lang.String r0 = r2.A0L()
            if (r0 == 0) goto L_0x0095
            java.lang.String r4 = r2.A0L()
            java.lang.String r0 = "response"
            X.1Vv r2 = r5.A0J(r0)
            if (r2 == 0) goto L_0x00cc
            java.lang.String r0 = r2.A0L()
            if (r0 == 0) goto L_0x00cc
            java.lang.String r2 = r2.A0L()
        L_0x00c3:
            X.4TW r0 = new X.4TW
            r0.<init>(r4, r2)
            r14.add(r0)
            goto L_0x0095
        L_0x00cc:
            r2 = 0
            goto L_0x00c3
        L_0x00ce:
            r12 = 0
            goto L_0x0085
        L_0x00d0:
            java.lang.String r0 = "video"
            X.1Vv r0 = r3.A0J(r0)
            r9 = 0
            if (r0 == 0) goto L_0x00e9
            java.lang.String r1 = A00(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00e9
            X.4EF r9 = new X.4EF
            r9.<init>(r1)
        L_0x00e9:
            X.4OW r6 = new X.4OW
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            X.0pt r2 = r15.A03
            r1 = 13
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2
            r0.<init>(r15, r1, r6)
            r2.Acq(r0)
            return
        L_0x00fb:
            java.lang.String r0 = "GetCTWAContextIQ/onSuccess corrupted-response context iq="
            r1 = r17
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0pt r2 = r15.A03
            r1 = 23
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r0.<init>((java.lang.Object) r15, (int) r1)
            r2.Acq(r0)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63173Gk.AYG(X.1Vv, java.lang.String):void");
    }
}
