package X;

import com.whatsapp.jid.GroupJid;
import java.util.Set;

/* renamed from: X.1DI  reason: invalid class name */
public final class AnonymousClass1DI implements C19400yN {
    public final C14870pt A00;
    public final C15860rz A01;
    public final C15810rt A02;
    public final AnonymousClass11A A03;
    public final C16070sO A04;
    public final C14710pd A05;
    public final AnonymousClass18N A06;
    public final AnonymousClass18R A07;
    public final AnonymousClass1DH A08;
    public final AnonymousClass1DG A09;
    public final C16220sf A0A;
    public final C16320sq A0B;

    public AnonymousClass1DI(C14870pt r2, C15860rz r3, C15810rt r4, AnonymousClass11A r5, C16070sO r6, C14710pd r7, AnonymousClass18N r8, AnonymousClass18R r9, AnonymousClass1DH r10, AnonymousClass1DG r11, C16220sf r12, C16320sq r13) {
        C18450wi.A0H(r7, 1);
        C18450wi.A0H(r12, 2);
        C18450wi.A0H(r3, 4);
        C18450wi.A0H(r8, 5);
        C18450wi.A0H(r9, 6);
        C18450wi.A0H(r6, 7);
        C18450wi.A0H(r13, 8);
        C18450wi.A0H(r2, 9);
        C18450wi.A0H(r5, 10);
        C18450wi.A0H(r4, 12);
        this.A05 = r7;
        this.A0A = r12;
        this.A09 = r11;
        this.A01 = r3;
        this.A06 = r8;
        this.A07 = r9;
        this.A04 = r6;
        this.A0B = r13;
        this.A00 = r2;
        this.A03 = r5;
        this.A08 = r10;
        this.A02 = r4;
    }

    public final void A00(C15830rv r12, int i2, int i3) {
        int i4;
        if (r12 instanceof GroupJid) {
            GroupJid groupJid = (GroupJid) r12;
            if (AnonymousClass1JA.A0R(0, 2).contains(Integer.valueOf(this.A02.A02(groupJid)))) {
                C16220sf r6 = this.A0A;
                AnonymousClass1WS A072 = r6.A07(r12.getRawString());
                if (i2 >= 256 && !A072.A09() && (i4 = A072.A00) != 2 && i4 != 1 && this.A05.A0E(C16620tM.A02, 2363)) {
                    AnonymousClass1DG r10 = this.A09;
                    Integer num = -1;
                    C18930xU r5 = r10.A00;
                    Set A0B2 = r5.A0B(r12, num.longValue(), true);
                    C18450wi.A0B(A0B2);
                    if (r10.A02.A0S(r12, -1, false)) {
                        r5.A0V(A0B2);
                        r6.A0H(r12, 1);
                        this.A08.A00(groupJid, i3);
                        return;
                    }
                    r5.A0U(A0B2);
                }
            }
        }
    }

    public String AGT() {
        return new AnonymousClass2BO(AnonymousClass1DI.class).toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00c8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AMc() {
        /*
            r14 = this;
            X.0pd r8 = r14.A05
            r7 = 2481(0x9b1, float:3.477E-42)
            X.0tM r6 = X.C16620tM.A02
            boolean r0 = r8.A0E(r6, r7)
            if (r0 == 0) goto L_0x00d9
            X.0rz r10 = r14.A01
            java.lang.String r9 = "has_muted_existing_large_groups"
            X.01D r0 = r10.A01
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            r0 = 0
            boolean r0 = r1.getBoolean(r9, r0)
            if (r0 != 0) goto L_0x00d9
            X.0sO r1 = r14.A04
            r5 = 256(0x100, float:3.59E-43)
            X.0tq r0 = r1.A06
            r0.A04()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x004b
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0030:
            X.C18450wi.A0B(r4)
            java.util.Iterator r2 = r4.iterator()
        L_0x0037:
            boolean r0 = r2.hasNext()
            r1 = 1
            if (r0 == 0) goto L_0x00ce
            java.lang.Object r0 = r2.next()
            X.0rv r0 = (X.C15830rv) r0
            X.C18450wi.A09(r0)
            r14.A00(r0, r5, r1)
            goto L_0x0037
        L_0x004b:
            X.0us r12 = r1.A07
            java.lang.String r1 = "participant-user-store/getGroupsWithMinParticipantCount/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            X.0tq r0 = r12.A09
            X.0tf r3 = r0.get()
            X.0tg r13 = r3.A02     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = "SELECT group_jid_row_id, CAST (COUNT(*) AS INTEGER) as count FROM group_participant_user GROUP BY group_jid_row_id HAVING count >= ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00c9 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c9 }
            r2[r1] = r0     // Catch:{ all -> 0x00c9 }
            android.database.Cursor r2 = r13.A08(r11, r2)     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x00c2 }
            r11.<init>()     // Catch:{ all -> 0x00c2 }
        L_0x0080:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "group_jid_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c2 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x00c2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00c2 }
            r11.add(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x0080
        L_0x0098:
            X.14v r1 = r12.A08     // Catch:{ all -> 0x00c2 }
            java.lang.Class<X.0sN> r0 = X.C16060sN.class
            java.util.Map r0 = r1.A09(r0, r11)     // Catch:{ all -> 0x00c2 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00c2 }
        L_0x00a8:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00c2 }
            X.0sN r0 = (X.C16060sN) r0     // Catch:{ all -> 0x00c2 }
            if (r0 == 0) goto L_0x00a8
            r4.add(r0)     // Catch:{ all -> 0x00c2 }
            goto L_0x00a8
        L_0x00ba:
            r2.close()     // Catch:{ all -> 0x00c9 }
            r3.close()
            goto L_0x0030
        L_0x00c2:
            r0 = move-exception
            if (r2 == 0) goto L_0x00c8
            r2.close()     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            throw r0     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r0
        L_0x00ce:
            android.content.SharedPreferences$Editor r0 = r10.A0K()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r9, r1)
            r0.apply()
        L_0x00d9:
            boolean r0 = r8.A0E(r6, r7)
            if (r0 == 0) goto L_0x0102
            X.18N r2 = r14.A06
            r1 = 2
            com.obwhatsapp.group.IDxCObserverShape80S0100000_2_I0 r0 = new com.obwhatsapp.group.IDxCObserverShape80S0100000_2_I0
            r0.<init>(r14, r1)
            r2.A02(r0)
            X.0pt r2 = r14.A00
            r1 = 39
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10
            r0.<init>((java.lang.Object) r14, (int) r1)
            r2.A0K(r0)
            X.11A r2 = r14.A03
            r1 = 14
            com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0 r0 = new com.obwhatsapp.data.IDxCObserverShape72S0100000_2_I0
            r0.<init>(r14, r1)
            r2.A02(r0)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1DI.AMc():void");
    }
}
