package X;

import android.os.SystemClock;
import com.whatsapp.jid.GroupJid;
import java.net.URL;

/* renamed from: X.3GX  reason: invalid class name */
public class AnonymousClass3GX implements C19550yc {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C109335Rq A01;
    public final GroupJid A02;
    public final String A03;
    public final String A04;

    public AnonymousClass3GX(C109335Rq r3, GroupJid groupJid, GroupJid groupJid2, String str, String str2) {
        this.A01 = r3;
        if (groupJid == null) {
            this.A02 = groupJid2;
        } else {
            this.A02 = groupJid;
        }
        this.A04 = str;
        this.A03 = str2;
    }

    public void APb(String str) {
    }

    public void AQe(C28371Vv r11, String str) {
        GroupJid groupJid = this.A02;
        if (groupJid != null) {
            int A002 = C34451kH.A00(r11);
            if (A002 == 404) {
                this.A01.AVK(new AnonymousClass277(groupJid, (String) null, (URL) null, (byte[]) null, -1, C13690nt.A00("preview".equals(this.A04) ? 1 : 0)), this.A00);
            } else {
                this.A01.AVJ(groupJid, this.A04, A002, this.A00);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r9v4, types: [java.net.URL] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AYG(X.C28371Vv r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "picture"
            X.1Vv r5 = r13.A0J(r0)
            java.lang.String r3 = r12.A03
            com.whatsapp.jid.GroupJid r6 = r12.A02
            java.lang.String r4 = r12.A04
            r9 = 0
            if (r5 == 0) goto L_0x003f
            java.lang.String r0 = "id"
            java.lang.String r3 = r5.A0N(r0, r9)
            java.lang.String r0 = "type"
            java.lang.String r4 = r5.A0N(r0, r9)
            java.lang.String r0 = "linked_group_jid"
            java.lang.String r2 = r5.A0N(r0, r9)
            java.lang.String r0 = "url"
            java.lang.String r1 = r5.A0N(r0, r9)
            java.lang.String r0 = "direct_path"
            java.lang.String r7 = r5.A0N(r0, r9)
            if (r1 == 0) goto L_0x0042
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0037 }
            r9.<init>(r1)     // Catch:{ MalformedURLException -> 0x0037 }
            goto L_0x0042
        L_0x0037:
            java.lang.String r1 = "Malformed picture url"
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x003f:
            r8 = r9
            r7 = r9
            goto L_0x004a
        L_0x0042:
            byte[] r0 = r5.A01
            X.0sL r6 = X.C16050sL.A05(r2)
            r8 = r9
            r9 = r0
        L_0x004a:
            if (r3 != 0) goto L_0x0050
            r10 = -1
        L_0x004d:
            if (r4 == 0) goto L_0x006b
            goto L_0x0055
        L_0x0050:
            int r10 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x006c }
            goto L_0x004d
        L_0x0055:
            X.5Rq r2 = r12.A01     // Catch:{ NumberFormatException -> 0x006c }
            java.lang.String r0 = "preview"
            boolean r0 = r0.equals(r4)     // Catch:{ NumberFormatException -> 0x006c }
            int r11 = X.C13690nt.A00(r0)
            X.277 r5 = new X.277     // Catch:{ NumberFormatException -> 0x006c }
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ NumberFormatException -> 0x006c }
            long r0 = r12.A00     // Catch:{ NumberFormatException -> 0x006c }
            r2.AVK(r5, r0)     // Catch:{ NumberFormatException -> 0x006c }
        L_0x006b:
            return
        L_0x006c:
            java.lang.String r0 = "Malformed photo id="
            java.lang.String r1 = X.C13680ns.A0h(r0, r3)
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3GX.AYG(X.1Vv, java.lang.String):void");
    }
}
