package X;

import java.lang.ref.WeakReference;

/* renamed from: X.36H  reason: invalid class name */
public class AnonymousClass36H extends C16690tT {
    public final C16460t6 A00;
    public final C15830rv A01;
    public final C25981Lw A02;
    public final AnonymousClass4FQ A03;

    public AnonymousClass36H(C16460t6 r2, C15830rv r3, C108995Qh r4, C25981Lw r5) {
        this.A00 = r2;
        this.A02 = r5;
        AnonymousClass00B.A06(r4);
        this.A03 = new AnonymousClass4FQ(r4);
        this.A01 = r3;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0066 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r8) {
        /*
            r7 = this;
            X.1Lw r2 = r7.A02
            X.0rv r1 = r7.A01
            java.lang.String r0 = "Jid cannot be null"
            X.AnonymousClass00B.A07(r1, r0)
            java.io.File r5 = r2.A01(r1)
            if (r5 == 0) goto L_0x006b
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x006b
            java.io.File r4 = r2.A02(r1)
            java.io.File r1 = r2.A03(r1)
            if (r1 == 0) goto L_0x0074
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0074
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0067 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0067 }
            java.io.DataInputStream r6 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0067 }
            r6.<init>(r0)     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0067 }
            long r1 = r1.length()     // Catch:{ all -> 0x0062 }
            int r0 = (int) r1     // Catch:{ all -> 0x0062 }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0062 }
            r6.readFully(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x0062 }
            r1.<init>(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = ":;:"
            java.lang.String[] r1 = r1.split(r0)     // Catch:{ all -> 0x0062 }
            r0 = 0
            r0 = r1[r0]     // Catch:{ all -> 0x0062 }
            X.0rv r3 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0062 }
            r0 = 1
            r0 = r1[r0]     // Catch:{ all -> 0x0062 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0062 }
            boolean r2 = r0.booleanValue()     // Catch:{ all -> 0x0062 }
            r0 = 2
            r1 = r1[r0]     // Catch:{ all -> 0x0062 }
            X.1Vw r0 = new X.1Vw     // Catch:{ all -> 0x0062 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x0062 }
            r6.close()     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0067 }
            goto L_0x0075
        L_0x0062:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0066 }
        L_0x0066:
            throw r0     // Catch:{ FileNotFoundException -> 0x006e, IOException -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            java.lang.String r0 = "draftvoicenotecache/getquotedmessagekey/"
            goto L_0x0071
        L_0x006b:
            r2 = 0
            r1 = 0
            goto L_0x0082
        L_0x006e:
            r1 = move-exception
            java.lang.String r0 = "draftvoicenotecache/getquotedmessagekey/ "
        L_0x0071:
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0074:
            r0 = 0
        L_0x0075:
            X.4LA r2 = new X.4LA
            r2.<init>(r0, r5, r4)
            X.0t6 r1 = r7.A00
            X.1Vw r0 = r2.A01
            X.0tZ r1 = X.C16460t6.A00(r1, r0)
        L_0x0082:
            X.4J3 r0 = new X.4J3
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36H.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass4J3 r2 = (AnonymousClass4J3) obj;
        WeakReference weakReference = this.A03.A00;
        AnonymousClass00B.A06(weakReference);
        C108995Qh r0 = (C108995Qh) weakReference.get();
        if (r0 != null) {
            r0.AWN(r2);
        }
    }
}
