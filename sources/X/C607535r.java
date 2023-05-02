package X;

import java.util.Collection;

/* renamed from: X.35r  reason: invalid class name and case insensitive filesystem */
public class C607535r extends C16690tT {
    public final /* synthetic */ AnonymousClass01Y A00;

    public C607535r(AnonymousClass01Y r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r12) {
        /*
            r11 = this;
            X.01Y r0 = r11.A00
            X.15K r0 = r0.A0B
            java.lang.String r1 = "jid"
            java.util.HashSet r3 = X.C13680ns.A0o()
            X.11X r0 = r0.A00
            X.0tf r4 = r0.get()
            java.lang.String r5 = "wa_block_list"
            r0 = 1
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x0050 }
            r0 = 0
            r9[r0] = r1     // Catch:{ all -> 0x0050 }
            r6 = 0
            java.lang.String r8 = "CONTACT_BLOCK_LIST"
            r10 = r6
            r7 = r6
            android.database.Cursor r2 = X.AnonymousClass15L.A03(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x002a
            java.lang.String r0 = "contact-mgr-db/unable to get block list"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x0045
        L_0x002a:
            int r1 = r2.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0049 }
        L_0x002e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0049 }
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x002e
            r3.add(r0)     // Catch:{ all -> 0x0049 }
            goto L_0x002e
        L_0x0042:
            r2.close()     // Catch:{ all -> 0x0050 }
        L_0x0045:
            r4.close()
            return r3
        L_0x0049:
            r0 = move-exception
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ all -> 0x004f }
        L_0x004f:
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C607535r.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        boolean z2;
        Collection collection = (Collection) obj;
        AnonymousClass01Y r3 = this.A00;
        synchronized (r3) {
            z2 = false;
            r3.A02 = false;
            if (!r3.A01) {
                r3.A0Z.addAll(collection);
                r3.A01 = true;
                z2 = true;
            }
        }
        if (z2) {
            r3.A0P(r3.A08());
        }
    }
}
