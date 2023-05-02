package X;

import com.obwhatsapp.ui.media.MediaCard;
import java.lang.ref.WeakReference;

/* renamed from: X.36x  reason: invalid class name and case insensitive filesystem */
public class C609936x extends C16690tT {
    public final AnonymousClass024 A00 = new AnonymousClass024();
    public final AnonymousClass013 A01;
    public final C25711Kv A02;
    public final AnonymousClass17N A03;
    public final C16480t8 A04;
    public final C15830rv A05;
    public final WeakReference A06;

    public C609936x(AnonymousClass013 r2, C25711Kv r3, AnonymousClass17N r4, C16480t8 r5, C15830rv r6, MediaCard mediaCard) {
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A02 = r3;
        this.A06 = C13690nt.A0h(mediaCard);
        this.A05 = r6;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0071 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r11) {
        /*
            r10 = this;
            X.0t8 r2 = r10.A04
            X.0rv r7 = r10.A05
            r0 = 2
            com.facebook.redex.IDxSCallbackShape334S0100000_2_I1 r1 = new com.facebook.redex.IDxSCallbackShape334S0100000_2_I1
            r1.<init>(r10, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r9 = r2.A01(r1, r7, r0)
            X.17N r8 = r10.A03
            X.024 r6 = r10.A00
            X.11I r3 = r8.A04
            java.lang.String r2 = "links_ready"
            r0 = 0
            long r4 = r3.A01(r2, r0)
            r2 = 2
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0027
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x003a
            int r0 = r8.A01(r6, r7)
        L_0x002d:
            int r9 = r9 + r0
            X.1Kv r0 = r10.A02
            int r0 = r0.A00(r6, r7)
            int r9 = r9 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            return r0
        L_0x003a:
            java.lang.String r5 = r7.getRawString()
            X.0tq r0 = r8.A03
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0072 }
            java.lang.String r2 = "SELECT COUNT(*) as count FROM messages_links WHERE key_remote_jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0072 }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x0072 }
            android.database.Cursor r1 = r3.A07(r6, r2, r1)     // Catch:{ all -> 0x0072 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "count"
            int r0 = X.C13690nt.A02(r1, r0)     // Catch:{ all -> 0x006d }
            r1.close()     // Catch:{ all -> 0x0072 }
            r4.close()
            goto L_0x002d
        L_0x0065:
            r1.close()     // Catch:{ all -> 0x0072 }
            r4.close()
            r0 = 0
            goto L_0x002d
        L_0x006d:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0071 }
        L_0x0071:
            throw r0     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0076 }
        L_0x0076:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609936x.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C448425v r1 = (C448425v) this.A06.get();
        if (r1 != null) {
            r1.setMediaInfo(this.A01.A0K().format(obj));
        }
    }
}
