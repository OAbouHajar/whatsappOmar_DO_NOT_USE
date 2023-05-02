package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.whatsapp.jid.GroupJid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0uk  reason: invalid class name and case insensitive filesystem */
public class C17230uk {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C216815a A02;
    public final C454128n A03;
    public final C16000sG A04;
    public final C16440t3 A05;
    public final C15810rt A06;
    public final C218015m A07;
    public final C16070sO A08;
    public final C217315f A09;
    public final C217115d A0A;
    public final C217215e A0B;
    public final C217015c A0C;
    public final C14710pd A0D;
    public final C217415g A0E;
    public final C217915l A0F;
    public final C17800vf A0G;
    public final C16220sf A0H;
    public final AtomicBoolean A0I = new AtomicBoolean(false);

    public C17230uk(C14870pt r9, C16040sK r10, C216815a r11, C16000sG r12, C16440t3 r13, C15810rt r14, C218015m r15, AnonymousClass11H r16, C16070sO r17, C217315f r18, C217115d r19, C217815k r20, C217215e r21, C217015c r22, C14710pd r23, C217415g r24, C217915l r25, C17800vf r26, C16220sf r27, C16320sq r28) {
        this.A05 = r13;
        this.A0D = r23;
        this.A00 = r9;
        this.A01 = r10;
        this.A06 = r14;
        this.A04 = r12;
        this.A0G = r26;
        this.A0H = r27;
        this.A0F = r25;
        this.A07 = r15;
        C217415g r6 = r24;
        this.A0E = r6;
        this.A09 = r18;
        this.A0B = r21;
        C16070sO r4 = r17;
        this.A08 = r4;
        this.A0A = r19;
        this.A0C = r22;
        this.A02 = r11;
        this.A03 = new C454128n(r9, r15, r16, r4, r20, r6, r28);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0039=Splitter:B:15:0x0039, B:7:0x002c=Splitter:B:7:0x002c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C16050sL r6) {
        /*
            r5 = this;
            X.28n r0 = r5.A03
            X.15k r1 = r0.A04
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r0 = r6.getRawString()
            r3 = 0
            r4[r3] = r0
            X.11X r0 = r1.A00
            X.0tf r2 = r0.get()
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x003a }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM subgroup_info subgroups INNER JOIN group_relationship relationship ON subgroups.subgroup_raw_jid = relationship.subgroup_raw_id WHERE relationship.parent_raw_jid = ?"
            android.database.Cursor r1 = r1.A08(r0, r4)     // Catch:{ all -> 0x003a }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x002c
            java.lang.String r0 = "count"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0033 }
            int r3 = r1.getInt(r0)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            r1.close()     // Catch:{ all -> 0x003a }
            r2.close()
            return r3
        L_0x0033:
            r0 = move-exception
            if (r1 == 0) goto L_0x0039
            r1.close()     // Catch:{ all -> 0x0039 }
        L_0x0039:
            throw r0     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17230uk.A00(X.0sL):int");
    }

    public C39461sW A01(C16050sL r5) {
        for (C39461sW r2 : this.A03.A04.A01(r5)) {
            if (r2.A00 == 3) {
                return r2;
            }
        }
        return null;
    }

    public C16050sL A02(C16050sL r2) {
        return this.A03.A04.A00(r2);
    }

    public List A03(C16050sL r7) {
        C454128n r5 = this.A03;
        List<C39461sW> A012 = r5.A04.A01(r7);
        ArrayList arrayList = new ArrayList();
        for (C39461sW r2 : A012) {
            if (!r5.A03.A09(r2.A02)) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }

    public void A04(int i2) {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor editor;
        String str;
        SharedPreferences sharedPreferences;
        if (i2 != 0) {
            if (i2 != 1) {
                AtomicBoolean atomicBoolean = this.A0I;
                if (i2 == 2) {
                    atomicBoolean.set(false);
                    C217215e r1 = this.A0B;
                    editor = r1.A00().edit();
                    sharedPreferences = r1.A00();
                    str = "community_tab_group_navigation";
                } else if (atomicBoolean.getAndSet(false)) {
                    C217215e r12 = this.A0B;
                    putInt = r12.A00().edit().putInt("community_tab_no_action_view", Math.min(r12.A00().getInt("community_tab_no_action_view", 0), r12.A00().getInt("community_tab_daily_views", 0)) + 1);
                } else {
                    return;
                }
            } else {
                this.A0I.set(false);
                C217215e r13 = this.A0B;
                editor = r13.A00().edit();
                sharedPreferences = r13.A00();
                str = "community_tab_to_home_views";
            }
            putInt = editor.putInt(str, sharedPreferences.getInt(str, 0) + 1);
        } else {
            this.A0I.set(true);
            C217215e r14 = this.A0B;
            putInt = r14.A00().edit().putInt("community_tab_daily_views", r14.A00().getInt("community_tab_daily_views", 0) + 1);
        }
        putInt.apply();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a9 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x00a9=Splitter:B:28:0x00a9, B:21:0x009e=Splitter:B:21:0x009e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(com.whatsapp.jid.GroupJid r14, int r15) {
        /*
            r13 = this;
            r14.getRawString()
            X.15c r1 = r13.A0C
            java.lang.String r7 = "community_home_action_logging"
            X.14v r0 = r1.A00
            long r2 = r0.A01(r14)
            if (r15 == 0) goto L_0x0024
            r0 = 1
            if (r15 == r0) goto L_0x0021
            r0 = 2
            if (r15 == r0) goto L_0x001e
            java.lang.String r9 = "home_group_join_count"
        L_0x0017:
            X.15b r0 = r1.A01
            X.0tf r6 = r0.A02()
            goto L_0x0027
        L_0x001e:
            java.lang.String r9 = "home_group_discovery_count"
            goto L_0x0017
        L_0x0021:
            java.lang.String r9 = "home_group_navigation_count"
            goto L_0x0017
        L_0x0024:
            java.lang.String r9 = "home_view_count"
            goto L_0x0017
        L_0x0027:
            X.1cj r12 = r6.A00()     // Catch:{ all -> 0x00aa }
            X.0tg r8 = r6.A02     // Catch:{ all -> 0x00a5 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C33961jT.A00(r8, r0, r7)     // Catch:{ all -> 0x00a5 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00a5 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0045
            java.lang.String r0 = "CommunityHomeActionLoggingStore/incrementCount: table does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x009e
        L_0x0045:
            java.lang.String r0 = "UPDATE community_home_action_logging SET "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r1.<init>(r0)     // Catch:{ all -> 0x00a5 }
            r1.append(r9)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = " = "
            r1.append(r0)     // Catch:{ all -> 0x00a5 }
            r1.append(r9)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = " + ?"
            r1.append(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = "jid_row_id"
            r1.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a5 }
            X.1ou r11 = r8.A0A(r0)     // Catch:{ all -> 0x00a5 }
            r0 = 1
            r5 = 1
            r11.A01(r5, r0)     // Catch:{ all -> 0x00a5 }
            r4 = 2
            r11.A01(r4, r2)     // Catch:{ all -> 0x00a5 }
            android.database.sqlite.SQLiteStatement r0 = r11.A00     // Catch:{ all -> 0x00a5 }
            int r0 = r0.executeUpdateDelete()     // Catch:{ all -> 0x00a5 }
            if (r0 != 0) goto L_0x009b
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x00a5 }
            r1.<init>(r4)     // Catch:{ all -> 0x00a5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00a5 }
            r1.put(r10, r0)     // Catch:{ all -> 0x00a5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x00a5 }
            r1.put(r9, r0)     // Catch:{ all -> 0x00a5 }
            r8.A02(r1, r7)     // Catch:{ all -> 0x00a5 }
        L_0x009b:
            r12.A00()     // Catch:{ all -> 0x00a5 }
        L_0x009e:
            r12.close()     // Catch:{ all -> 0x00aa }
            r6.close()
            return
        L_0x00a5:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            throw r0     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17230uk.A05(com.whatsapp.jid.GroupJid, int):void");
    }

    public void A06(C16050sL r7) {
        C16010sH A082 = this.A04.A08(r7);
        C216815a r4 = this.A02;
        C18930xU r2 = r4.A01;
        Set A0E2 = r2.A0E(r7, true);
        r4.A04.A0T(r7, true);
        r2.A0V(A0E2);
        if (A082 != null) {
            this.A0A.A01(r7);
            this.A0H.A0I(r7, A082.A0J());
            r4.A00(A082);
            this.A03.A04.A03(r7, Collections.emptyList());
        }
    }

    public void A07(C16050sL r5, List list) {
        C454128n r3 = this.A03;
        r3.A06.Acl(new RunnableRunnableShape0S0300000_I0(r3, list, r5, 27));
    }

    public void A08(C16050sL r6, boolean z2) {
        boolean z3;
        C15840rx A062 = this.A06.A06(r6);
        if (A062 != null) {
            C217315f r3 = this.A09;
            synchronized (A062) {
                z3 = A062.A0f;
            }
            if (z3 != z2) {
                synchronized (A062) {
                    A062.A0f = z2;
                }
                r3.A00.A01(new RunnableRunnableShape6S0200000_I0_4(r3, 40, A062), 60);
            }
        }
    }

    public boolean A09() {
        C14710pd r5 = this.A0D;
        C16620tM r4 = C16620tM.A02;
        boolean A0E2 = r5.A0E(r4, 1173);
        boolean A0G2 = this.A01.A0G();
        boolean A0A2 = A0A();
        if (A0G2) {
            if (!A0A2 || !A0E2) {
                return false;
            }
            A0E2 = r5.A0E(r4, 2695);
        } else if (!A0A2) {
            return false;
        }
        return A0E2;
    }

    public boolean A0A() {
        C14710pd r3 = this.A0D;
        C16620tM r2 = C16620tM.A02;
        boolean A0E2 = r3.A0E(r2, 982);
        return this.A01.A0G() ? A0E2 && r3.A0E(r2, 2695) : A0E2;
    }

    public boolean A0B(C15830rv r5) {
        if (!(r5 instanceof C16050sL)) {
            return false;
        }
        GroupJid groupJid = (GroupJid) r5;
        if (this.A0G.A00(groupJid, "community_home")) {
            return false;
        }
        C15810rt r2 = this.A06;
        return r2.A02(groupJid) == 1 || r2.A02(groupJid) == 2 || r2.A02(groupJid) == 3;
    }

    public boolean A0C(C16050sL r3) {
        if (!A09() || !this.A08.A0A(r3)) {
            return false;
        }
        C217915l r1 = this.A0F;
        return r3 == null || !r1.A00(r1.A00.A0A(r3));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r4 = r6.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0D(X.C16050sL r7) {
        /*
            r6 = this;
            r5 = 0
            if (r7 == 0) goto L_0x0037
            X.0pd r2 = r6.A0D
            r1 = 1864(0x748, float:2.612E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0037
            X.0rt r4 = r6.A06
            X.0rx r3 = r4.A06(r7)
            r2 = 1
            if (r3 == 0) goto L_0x0037
            X.0sO r1 = r6.A08
            boolean r0 = r1.A0A(r7)
            if (r0 == 0) goto L_0x0037
            boolean r0 = r1.A0E(r7)
            if (r0 != 0) goto L_0x0037
            int r0 = r4.A02(r7)
            if (r0 != r2) goto L_0x0037
            monitor-enter(r3)
            boolean r0 = r3.A0f     // Catch:{ all -> 0x0034 }
            monitor-exit(r3)
            if (r0 != 0) goto L_0x0037
            r5 = 1
            return r5
        L_0x0034:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0037:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17230uk.A0D(X.0sL):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r5 == 3) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0E(X.C16050sL r4, int r5) {
        /*
            r3 = this;
            r2 = 0
            r0 = 2
            if (r5 == r0) goto L_0x0008
            r0 = 3
            r1 = 0
            if (r5 != r0) goto L_0x0009
        L_0x0008:
            r1 = 1
        L_0x0009:
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0025
            X.0sK r0 = r3.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0025
            if (r1 == 0) goto L_0x0025
            X.0sO r0 = r3.A08
            boolean r0 = r0.A09(r4)
            if (r0 == 0) goto L_0x0025
            r2 = 1
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17230uk.A0E(X.0sL, int):boolean");
    }
}
