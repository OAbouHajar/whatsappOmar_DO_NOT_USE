package X;

import com.whatsapp.util.Log;

/* renamed from: X.1j0  reason: invalid class name and case insensitive filesystem */
public class C33701j0 extends C20380zx {
    public final C16040sK A00;
    public final AnonymousClass19D A01;
    public final AnonymousClass19E A02;
    public final AnonymousClass17Z A03;
    public final C15800rs A04;
    public final C222417e A05;
    public final C16440t3 A06;
    public final C15860rz A07;
    public final C16920ts A08;
    public final C15810rt A09;

    public C33701j0(C16040sK r1, AnonymousClass19D r2, AnonymousClass19E r3, AnonymousClass17Z r4, C15800rs r5, C222417e r6, C16440t3 r7, C15860rz r8, C16920ts r9, C15810rt r10, C20360zv r11) {
        super(r11);
        this.A06 = r7;
        this.A08 = r9;
        this.A00 = r1;
        this.A09 = r10;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A04 = r5;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x011f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A() {
        /*
            r14 = this;
            X.0sK r0 = r14.A00
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "unarchive-chats-setting-handler/Companion should not create Unarchive Chats Setting mutation"
            X.AnonymousClass00B.A08(r0)
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        L_0x0013:
            java.lang.String r0 = "unarchive-chats-setting-handler/onUnarchiveChatsSettingChanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0rs r0 = r14.A04
            java.util.List r0 = r0.A06()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r0)
            X.0zv r0 = r14.A00
            java.lang.String r1 = "archive"
            r13 = 0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.19K r0 = r0.A01
            X.0tf r6 = r0.get()
            X.0tg r8 = r6.A02     // Catch:{ all -> 0x0120 }
            java.lang.String r7 = "SELECT chat_jid FROM syncd_mutations WHERE mutation_name = ? AND are_dependencies_missing = ?"
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0120 }
            r3[r13] = r1     // Catch:{ all -> 0x0120 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0120 }
            r3[r1] = r0     // Catch:{ all -> 0x0120 }
            android.database.Cursor r3 = r8.A08(r7, r3)     // Catch:{ all -> 0x0120 }
            java.lang.String r0 = "chat_jid"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0119 }
        L_0x0053:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0119 }
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x0119 }
            X.0rv r0 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0119 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0119 }
            r4.add(r0)     // Catch:{ all -> 0x0119 }
            goto L_0x0053
        L_0x0068:
            r3.close()     // Catch:{ all -> 0x0120 }
            r6.close()
            java.util.ListIterator r1 = r4.listIterator()
            X.0rz r3 = r14.A07
            boolean r0 = r3.A1c()
            if (r0 == 0) goto L_0x00c6
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r1.next()
            boolean r0 = r5.contains(r0)
            if (r0 != 0) goto L_0x007a
            r1.remove()
            goto L_0x007a
        L_0x008e:
            java.util.Iterator r6 = r4.iterator()
        L_0x0092:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r9 = r6.next()
            X.0rv r9 = (X.C15830rv) r9
            X.19E r1 = r14.A02
            r0 = 1
            r1.A06(r0)
            X.0t3 r5 = r14.A06
            long r0 = r5.A00()
            X.1on r4 = new X.1on
            r4.<init>(r9, r0, r13)
            r2.add(r4)
            r12 = 1
            long r10 = r5.A00()
            X.19D r0 = r14.A01
            X.1o8 r8 = r0.A04(r9, r13)
            X.1ol r7 = new X.1ol
            r7.<init>(r8, r9, r10, r12)
            r2.add(r7)
            goto L_0x0092
        L_0x00c6:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r0 = r1.next()
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L_0x00c6
            r1.remove()
            goto L_0x00c6
        L_0x00da:
            java.util.Iterator r1 = r4.iterator()
        L_0x00de:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ff
            java.lang.Object r10 = r1.next()
            X.0rv r10 = (X.C15830rv) r10
            X.0t3 r0 = r14.A06
            long r11 = r0.A00()
            X.19D r0 = r14.A01
            X.1o8 r9 = r0.A04(r10, r13)
            X.1ol r8 = new X.1ol
            r8.<init>(r9, r10, r11, r13)
            r2.add(r8)
            goto L_0x00de
        L_0x00ff:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r2)
            r4 = 0
            X.0t3 r0 = r14.A06
            long r6 = r0.A00()
            boolean r8 = r3.A1c()
            X.1oN r3 = new X.1oN
            r5 = r4
            r3.<init>(r4, r5, r6, r8)
            r1.add(r3)
            return r1
        L_0x0119:
            r0 = move-exception
            if (r3 == 0) goto L_0x011f
            r3.close()     // Catch:{ all -> 0x011f }
        L_0x011f:
            throw r0     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0124 }
        L_0x0124:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33701j0.A0A():java.util.List");
    }

    public final void A0B(C15830rv r4, boolean z2) {
        C15840rx A062 = this.A09.A06(r4);
        if (A062 != null && A062.A0e != z2) {
            StringBuilder sb = new StringBuilder("UnarchiveChatsSettingsHAndler/setArchive -");
            sb.append(z2);
            Log.i(sb.toString());
            A062.A0e = z2;
            this.A08.A0A(A062);
            this.A03.A00();
        }
    }
}
