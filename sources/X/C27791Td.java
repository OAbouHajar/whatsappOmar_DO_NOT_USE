package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1Td  reason: invalid class name and case insensitive filesystem */
public class C27791Td implements C19420yP {
    public final C16300so A00;
    public final C16000sG A01;
    public final C16440t3 A02;
    public final C15810rt A03;
    public final AnonymousClass18S A04;
    public final C14710pd A05;
    public final C17240ul A06;
    public final C17780vd A07;
    public final AnonymousClass124 A08;
    public final C207811o A09;

    public C27791Td(C16300so r1, C16000sG r2, C16440t3 r3, C15810rt r4, AnonymousClass18S r5, C14710pd r6, C17240ul r7, C17780vd r8, AnonymousClass124 r9, C207811o r10) {
        this.A02 = r3;
        this.A05 = r6;
        this.A00 = r1;
        this.A03 = r4;
        this.A08 = r9;
        this.A01 = r2;
        this.A06 = r7;
        this.A07 = r8;
        this.A09 = r10;
        this.A04 = r5;
    }

    public final Set A00(C28371Vv r14, int i2) {
        long j2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        r14.A0N("link_type", (String) null);
        for (C28371Vv r5 : r14.A0O("group")) {
            GroupJid groupJid = (GroupJid) r5.A0F(this.A00, C16050sL.class, "jid");
            String str = "";
            try {
                str = r5.A0N("subject", (String) null);
                j2 = ((long) r5.A0A("subject_ts", 0)) * 1000;
            } catch (AnonymousClass1W9 e2) {
                Log.e("cannot get group subject from notification", e2);
                j2 = 0;
            }
            if (groupJid != null && !TextUtils.isEmpty(str)) {
                linkedHashSet.add(new C39461sW(groupJid, str, i2, j2));
            }
        }
        return linkedHashSet;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:34|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x008b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0090 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071 A[SYNTHETIC, Splitter:B:24:0x0071] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:37:0x0090=Splitter:B:37:0x0090, B:26:0x0074=Splitter:B:26:0x0074} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01(X.C16050sL r14, X.C28371Vv r15) {
        /*
            r13 = this;
            X.0pd r2 = r13.A05
            r1 = 2334(0x91e, float:3.27E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = "prev_v_id"
            r1 = 0
            long r11 = r15.A0D(r0, r1)
            java.lang.String r0 = "v_id"
            long r9 = r15.A0D(r0, r1)
            X.18S r0 = r13.A04
            X.191 r7 = r0.A00
            java.util.Map r5 = r7.A03
            monitor-enter(r5)
            boolean r0 = r5.containsKey(r14)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r5.get(r14)     // Catch:{ all -> 0x0093 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0093 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0093 }
        L_0x0032:
            monitor-exit(r5)     // Catch:{ all -> 0x0093 }
            goto L_0x0096
        L_0x0034:
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0091 }
            r6 = 0
            X.14v r0 = r7.A00     // Catch:{ all -> 0x0091 }
            long r3 = r0.A01(r14)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0091 }
            r8[r6] = r0     // Catch:{ all -> 0x0091 }
            X.0tq r0 = r7.A01     // Catch:{ all -> 0x0091 }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x0091 }
            X.0tg r3 = r7.A02     // Catch:{ all -> 0x008c }
            java.lang.String r0 = "SELECT participant_version FROM group_notification_version WHERE group_jid_row_id = ?"
            android.database.Cursor r6 = r3.A08(r0, r8)     // Catch:{ all -> 0x008c }
            if (r6 == 0) goto L_0x0055
            goto L_0x0058
        L_0x0055:
            r3 = 0
            goto L_0x0068
        L_0x0058:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0085 }
            if (r0 == 0) goto L_0x0055
            java.lang.String r0 = "participant_version"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0085 }
            long r3 = r6.getLong(r0)     // Catch:{ all -> 0x0085 }
        L_0x0068:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0085 }
            r5.put(r14, r0)     // Catch:{ all -> 0x0085 }
            if (r6 == 0) goto L_0x0074
            r6.close()     // Catch:{ all -> 0x008c }
        L_0x0074:
            r7.close()     // Catch:{ all -> 0x0091 }
            java.lang.Object r0 = r5.get(r14)     // Catch:{ all -> 0x0091 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0091 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0091 }
            long r3 = r0.longValue()     // Catch:{ all -> 0x0091 }
            goto L_0x0032
        L_0x0085:
            r0 = move-exception
            if (r6 == 0) goto L_0x008b
            r6.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            throw r0     // Catch:{ all -> 0x008c }
        L_0x008c:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00a3
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto L_0x00a4
        L_0x00a3:
            r1 = 1
        L_0x00a4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27791Td.A01(X.0sL, X.1Vv):boolean");
    }

    public int[] ACW() {
        return new int[]{209};
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v166, resolved type: X.1sD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v169, resolved type: X.1sV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v170, resolved type: X.1th} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v210, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v407, resolved type: X.1sD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v408, resolved type: X.1sD} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v409, resolved type: X.1sD} */
    /* JADX WARNING: type inference failed for: r5v20, types: [X.1sE, X.1u9, X.1u5] */
    /* JADX WARNING: type inference failed for: r0v208 */
    /* JADX WARNING: type inference failed for: r0v230, types: [com.whatsapp.jid.UserJid] */
    /* JADX WARNING: type inference failed for: r7v36, types: [X.1tx, X.1sX] */
    /* JADX WARNING: type inference failed for: r0v537 */
    /* JADX WARNING: type inference failed for: r0v538 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:898|899) */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x04ba, code lost:
        if (r1.containsKey(r0.A05) != false) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x07e1, code lost:
        if (r1 == false) goto L_0x07e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x07f7, code lost:
        if (r14.containsKey(r4) == false) goto L_0x07f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010c, code lost:
        if (r7.containsKey(r0.A05) == false) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0af2, code lost:
        if (r4 == 1) goto L_0x0af4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0c3d, code lost:
        if (r14.A0N(r13.A08) != false) goto L_0x0c3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x014a, code lost:
        if (r12.A0A(r10) == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x0c66, code lost:
        if (r6 == 1) goto L_0x0c68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x1003, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x1005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x1602, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:?, code lost:
        X.C41191vO.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x1606, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:826:0x1959, code lost:
        if (r30.containsKey(r8.A00()) != false) goto L_0x195b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:899:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:934:0x1c99, code lost:
        if (r4.A13 == false) goto L_0x1c9d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:970:0x1df4, code lost:
        if (r30.containsKey(r78.A03()) != false) goto L_0x1df6;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1005:0x1ee1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1014:0x1eeb */
    /* JADX WARNING: Missing exception handler attribute for start block: B:880:0x1ba2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:885:0x1ba7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:893:0x1bb1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:898:0x1bb6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0be6  */
    /* JADX WARNING: Removed duplicated region for block: B:825:0x194d A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:830:0x198b A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:836:0x19a5 A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:839:0x19ad A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:843:0x19be A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:900:0x1bb7 A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:908:0x1c14 A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:909:0x1c1b A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:969:0x1dea A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:976:0x1e19 A[Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:982:0x1e47 A[ADDED_TO_REGION, Catch:{ 1W4 -> 0x1ecd }] */
    /* JADX WARNING: Removed duplicated region for block: B:996:0x1eaf A[Catch:{ 1W4 -> 0x1ecd }, LOOP:14: B:994:0x1ea9->B:996:0x1eaf, LOOP_END] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AHS(android.os.Message r80, int r81) {
        /*
            r79 = this;
            r37 = 0
            r3 = 0
            r0 = 209(0xd1, float:2.93E-43)
            r1 = r81
            if (r1 == r0) goto L_0x000a
            return r3
        L_0x000a:
            r2 = r80
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r8 = r1.getParcelable(r0)
            X.1ci r8 = (X.C30641ci) r8
            java.lang.String r0 = "stanzaKey is null"
            X.AnonymousClass00B.A07(r8, r0)
            com.whatsapp.jid.UserJid r0 = r8.A00()
            java.lang.Object r6 = r2.obj
            X.1Vv r6 = (X.C28371Vv) r6
            X.1Vv r1 = r6.A0H()
            r2 = r79
            X.11o r9 = r2.A09
            long r4 = r8.A00
            r7 = 2
            X.1d2 r5 = r9.A00(r7, r4)
            X.2dU r5 = (X.C52282dU) r5
            if (r5 == 0) goto L_0x0042
            java.lang.String r4 = r1.A00
            r5.A00 = r4
            r4 = 3
            r5.A00(r4)
        L_0x0042:
            java.lang.String r7 = "t"
            r9 = 0
            long r23 = r6.A0D(r7, r9)
            r4 = 1000(0x3e8, double:4.94E-321)
            long r23 = r23 * r4
            int r4 = (r23 > r9 ? 1 : (r23 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0059
            X.0t3 r4 = r2.A02
            long r23 = r4.A00()
        L_0x0059:
            java.lang.String r4 = "add"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            r9 = 1
            if (r4 == 0) goto L_0x021d
            X.0so r0 = r2.A00
            java.util.Map r7 = X.C53262fQ.A06(r0, r1)
            int r0 = r7.size()
            if (r0 <= 0) goto L_0x145a
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r0)
            X.0sL r20 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r20)
            r4 = r20
            boolean r4 = r2.A01(r4, r1)
            if (r4 == 0) goto L_0x0d7f
            java.lang.String r6 = "v_id"
            r4 = 0
            long r16 = r1.A0D(r6, r4)
            X.0ul r4 = r2.A06
            r5 = r20
            boolean r5 = r4.A0o(r5)
            if (r5 == 0) goto L_0x145a
            java.lang.String r6 = "reason"
            r5 = r37
            java.lang.String r32 = r1.A0N(r6, r5)
            java.lang.String r1 = "groupmgr/onGroupAddUsers/"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r8)
            java.lang.String r1 = "/"
            r5.append(r1)
            java.util.Collection r1 = r7.values()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r10 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r10)
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r4.A0p(r10, r7)
            if (r0 == 0) goto L_0x00e1
            r0 = 3
            r4.A0E(r0, r9, r3)
        L_0x00d7:
            X.18S r3 = r2.A04
            r1 = r16
            r0 = r20
            r3.A02(r0, r1)
        L_0x00e0:
            return r9
        L_0x00e1:
            X.0vL r0 = r4.A0u
            r0.A00(r7)
        L_0x00e6:
            X.0sP r0 = r4.A0G
            r0.A0P(r10)
            X.0sG r0 = r4.A0E
            X.0sH r13 = r0.A09(r10)
            X.0sO r12 = r4.A0a
            X.0us r0 = r12.A07
            X.1cE r6 = r0.A04(r10)
            if (r13 == 0) goto L_0x010e
            X.0sK r0 = r4.A08
            boolean r5 = r6.A0M(r0)
            if (r5 != 0) goto L_0x0126
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x0126
        L_0x010e:
            java.lang.String r0 = "groupmgr/onGroupAddUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vd r5 = r4.A0l
            r3 = 2
            r0 = r37
            r5.A0A(r10, r0, r3)
            X.12B r0 = r4.A0v
            if (r13 == 0) goto L_0x0121
            int r1 = r13.A05
        L_0x0121:
            r0.A01(r10, r1, r3)
            goto L_0x0630
        L_0x0126:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r7.size()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r0)
            X.0pd r5 = r4.A0f
            r1 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r5.A0E(r0, r1)
            if (r0 == 0) goto L_0x014c
            boolean r0 = r13.A0k
            if (r0 == 0) goto L_0x014c
            boolean r0 = r12.A0A(r10)
            r19 = 1
            if (r0 != 0) goto L_0x014e
        L_0x014c:
            r19 = 0
        L_0x014e:
            java.util.Collection r0 = r7.values()
            java.util.Iterator r18 = r0.iterator()
        L_0x0156:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r1 = r18.next()
            X.2Bb r1 = (X.AnonymousClass2Bb) r1
            com.whatsapp.jid.UserJid r13 = r1.A01
            java.lang.String r5 = r1.A03
            r11.add(r13)
            java.lang.String r0 = "admin"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x01aa
            r5 = 1
        L_0x0172:
            X.0z2 r0 = r4.A0e
            r21 = r0
            java.util.Set r0 = r0.A0D(r13)
            java.util.Set r0 = X.C30361cE.A01(r0)
            X.1ck r15 = new X.1ck
            r15.<init>(r13, r0, r5, r3)
            r14.add(r15)
            boolean r0 = r1.A00()
            if (r0 == 0) goto L_0x01a2
            X.1ZX r1 = r1.A00
            if (r1 == 0) goto L_0x01a2
            r0 = r21
            java.util.Set r0 = r0.A0D(r1)
            java.util.Set r0 = X.C30361cE.A01(r0)
            X.1ck r15 = new X.1ck
            r15.<init>(r1, r0, r5, r3)
            r14.add(r15)
        L_0x01a2:
            if (r19 == 0) goto L_0x0156
            X.18U r0 = r4.A0W
            r0.A03(r10, r13)
            goto L_0x0156
        L_0x01aa:
            java.lang.String r0 = "superadmin"
            boolean r0 = r0.equals(r5)
            r5 = 0
            if (r0 == 0) goto L_0x0172
            r5 = 2
            goto L_0x0172
        L_0x01b6:
            X.16U r5 = r4.A0J
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r3]
            java.lang.Object[] r1 = r11.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            r0 = 2
            r5.A01(r1, r0)
            X.0sq r3 = r4.A10
            r1 = 40
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r4, r1, r11)
            r3.Acl(r0)
            r6.A0J(r14)
            boolean r0 = r4.A0k(r10)
            if (r0 == 0) goto L_0x01de
            r0 = r16
            r12.A05(r6, r0)
        L_0x01de:
            r1 = 15
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r4, r10, r7, r1)
            r3.Acl(r0)
            java.util.List r33 = r4.A09(r10, r11)
            boolean r0 = r33.isEmpty()
            if (r0 != 0) goto L_0x0217
            com.whatsapp.jid.UserJid r30 = r8.A00()
            r28 = r37
            r25 = r4
            r26 = r6
            r27 = r37
            r29 = r10
            r31 = r8
            r34 = r23
            r36 = r16
            r25.A0F(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
        L_0x0209:
            X.0pt r3 = r4.A07
            r1 = 14
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r0.<init>(r4, r10, r6, r1)
            r3.A0K(r0)
            goto L_0x00d7
        L_0x0217:
            X.124 r0 = r4.A0s
            r0.A02(r8)
            goto L_0x0209
        L_0x021d:
            java.lang.String r4 = "create"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x023e
            X.1Vv r6 = r1.A0H()
            java.lang.String r10 = "type"
            java.lang.String r29 = ""
            r0 = r29
            java.lang.String r11 = r1.A0N(r10, r0)
            java.lang.String r0 = "group"
            boolean r0 = X.C28371Vv.A07(r6, r0)
            if (r0 == 0) goto L_0x145a
            goto L_0x1750
        L_0x023e:
            java.lang.String r4 = "delete"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x0412
            java.lang.String r5 = "reason"
            r4 = r37
            java.lang.String r4 = r1.A0N(r5, r4)
            java.lang.String r1 = "delete_parent"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0333
            r5 = 1
        L_0x0257:
            X.0ul r4 = r2.A06
            java.lang.String r2 = "groupmgr/onGroupDelete/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.jid.Jid r1 = r8.A01
            X.0rv r1 = X.C16030sJ.A00(r1)
            X.0sL r2 = X.C16050sL.A03(r1)
            if (r2 == 0) goto L_0x040e
            X.11J r1 = r4.A0Z
            java.util.concurrent.ConcurrentHashMap r1 = r1.A03
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x040e
            r7 = 2
            if (r5 != r7) goto L_0x0295
            X.0rt r5 = r4.A0R
            int r6 = r5.A03(r2)
            r1 = 3
            r13 = 0
            if (r6 == r9) goto L_0x033f
            if (r6 == r1) goto L_0x040e
            java.lang.String r1 = "groupmgr/onGroupDelete/Integrity Deactivate notification received for non-CAG"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            r5 = 0
        L_0x0295:
            r4.A0N(r2)
            X.124 r1 = r4.A0s
            r1.A02(r8)
            if (r5 != r9) goto L_0x00e0
            X.0uk r5 = r4.A0B
            boolean r1 = r5.A0A()
            if (r1 == 0) goto L_0x02da
            X.0rt r1 = r4.A0R
            int r1 = r1.A03(r2)
            if (r1 == r9) goto L_0x02da
            X.18M r6 = r4.A0g
            X.122 r8 = r4.A0y
            X.0sP r3 = r4.A0G
            X.0sL r1 = r5.A02(r2)
            java.lang.String r3 = r3.A0J(r1)
            X.18b r1 = r8.A03
            X.1Vw r11 = r1.A02(r2, r9)
            X.0so r1 = r8.A00
            r13 = 87
            r10 = r1
            r12 = r37
            r14 = r23
            X.1WU r1 = X.AnonymousClass122.A00(r10, r11, r12, r13, r14)
            X.1sU r1 = (X.C39441sU) r1
            r1.A00 = r3
            r1.A0b(r0)
            r6.A00(r1, r7)
        L_0x02da:
            X.0rt r3 = r4.A0R
            int r0 = r3.A03(r2)
            if (r0 != r9) goto L_0x02f6
            r5.A06(r2)
            java.lang.String r1 = "groupmgr/onGroupDelete/deletedParentGroup/jid = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x02f6:
            int r1 = r3.A03(r2)
            r0 = 3
            if (r1 != r0) goto L_0x00e0
            X.0sG r3 = r4.A0E
            X.0sH r1 = r3.A0A(r2)
            int r0 = r1.A02
            if (r0 == r9) goto L_0x0313
            r1.A02 = r9
            X.18c r0 = r3.A06
            r0.A0J(r1)
            X.1kv r0 = r3.A04
            r0.A00(r1)
        L_0x0313:
            java.lang.String r1 = "groupmgr/onGroupDelete/updated group state to deactivated/jid = "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.126 r3 = r4.A0Q
            r0 = 32
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r1 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r1.<init>(r4, r0, r2)
            r0 = 47
            r3.A01(r1, r0)
            return r9
        L_0x0333:
            java.lang.String r1 = "integrity_delete_parent"
            boolean r1 = r1.equals(r4)
            r5 = 0
            if (r1 == 0) goto L_0x0257
            r5 = 2
            goto L_0x0257
        L_0x033f:
            X.0uk r12 = r4.A0B
            X.1sW r6 = r12.A01(r2)
            X.28n r0 = r12.A03
            java.util.List r11 = r0.A00(r2)
            java.util.Iterator r10 = r11.iterator()
        L_0x034f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0364
            java.lang.Object r0 = r10.next()
            X.1sW r0 = (X.C39461sW) r0
            int r0 = r0.A00
            if (r0 != r1) goto L_0x034f
            r10.remove()
            r13 = 1
            goto L_0x034f
        L_0x0364:
            java.util.List r10 = r12.A03(r2)
            X.0sG r1 = r4.A0E
            r1.A0Q(r2, r9)
            r4.A0N(r2)
            if (r13 == 0) goto L_0x039a
            if (r6 == 0) goto L_0x039a
            com.whatsapp.jid.GroupJid r0 = r6.A02
            X.0sL r6 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r6)
            r4.A0N(r6)
            r1.A0Q(r6, r9)
            X.18M r1 = r4.A0g
            X.122 r0 = r4.A0y
            r17 = 17
            r16 = r37
            r20 = 0
            r13 = r0
            r14 = r6
            r15 = r37
            r18 = r23
            X.1sE r0 = r13.A07(r14, r15, r16, r17, r18, r20)
            r1.A00(r0, r7)
        L_0x039a:
            r12.A07(r2, r11)
            r12.A07(r2, r10)
            java.util.Iterator r12 = r11.iterator()
        L_0x03a4:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x040e
            java.lang.Object r0 = r12.next()
            X.1sW r0 = (X.C39461sW) r0
            X.18M r6 = r4.A0g
            com.whatsapp.jid.GroupJid r0 = r0.A02
            X.0sL r7 = X.C16050sL.A03(r0)
            java.lang.String r0 = r5.A09(r2)
            X.1sY r11 = new X.1sY
            r11.<init>(r2, r0, r9)
            X.0pd r10 = r4.A0f
            r1 = 2857(0xb29, float:4.004E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r1 = r10.A0E(r0, r1)
            X.122 r0 = r4.A0y
            if (r1 == 0) goto L_0x03f5
            X.18b r0 = r0.A03
            X.1Vw r10 = r0.A02(r7, r9)
            X.1tx r7 = new X.1tx
            r0 = r23
            r7.<init>(r10, r0)
            com.whatsapp.jid.GroupJid r10 = r11.A01
            java.lang.String r1 = r11.A02
            X.1sY r0 = new X.1sY
            r0.<init>(r10, r1, r9)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            X.C18450wi.A0B(r0)
            r7.A17(r0)
        L_0x03ef:
            r0 = 3010(0xbc2, float:4.218E-42)
            r6.A00(r7, r0)
            goto L_0x03a4
        L_0x03f5:
            com.whatsapp.jid.GroupJid r1 = r11.A01
            X.18b r0 = r0.A03
            X.1Vw r14 = r0.A02(r7, r9)
            r16 = 98
            X.1sT r7 = new X.1sT
            r13 = r7
            r15 = r37
            r17 = r23
            r13.<init>(r14, r15, r16, r17)
            r7.A00 = r3
            r7.A01 = r1
            goto L_0x03ef
        L_0x040e:
            X.124 r0 = r4.A0s
            goto L_0x102d
        L_0x0412:
            java.lang.String r4 = "demote"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x0470
            X.0so r0 = r2.A00
            java.util.Map r0 = X.C53262fQ.A06(r0, r1)
            boolean r4 = r0.isEmpty()
            if (r4 != 0) goto L_0x145a
            com.whatsapp.jid.Jid r6 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r6)
            X.0sL r20 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r20)
            r4 = r20
            boolean r4 = r2.A01(r4, r1)
            if (r4 == 0) goto L_0x0d7f
            java.lang.String r7 = "v_id"
            r4 = 0
            long r16 = r1.A0D(r7, r4)
            X.0ul r13 = r2.A06
            java.lang.String r1 = "groupmgr/onGroupDemoteUsers/"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r8)
            java.lang.String r1 = "/"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rv r1 = X.C16030sJ.A00(r6)
            X.0sL r12 = X.C16050sL.A03(r1)
            if (r12 != 0) goto L_0x0add
            X.124 r0 = r13.A0s
        L_0x046b:
            r0.A02(r8)
            goto L_0x00d7
        L_0x0470:
            java.lang.String r4 = "linked_group_demote"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x04e7
            X.0so r0 = r2.A00
            java.util.Map r1 = X.C53262fQ.A06(r0, r1)
            X.124 r0 = r2.A08
            r0.A02(r8)
            X.0ul r5 = r2.A06
            boolean r0 = r5.A0c()
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e0
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r3 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r3)
            X.0rt r0 = r2.A03
            int r2 = r0.A02(r3)
            r0 = 3
            if (r2 != r0) goto L_0x00e0
            X.0sO r0 = r5.A0a
            boolean r0 = r0.A0A(r3)
            if (r0 != 0) goto L_0x04bc
            X.0sK r0 = r5.A08
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x00e0
        L_0x04bc:
            X.0vL r0 = r5.A0u
            r0.A00(r1)
            X.18M r4 = r5.A0g
            X.122 r2 = r5.A0y
            r16 = 82
            com.whatsapp.jid.UserJid r13 = r8.A00()
            java.util.Set r1 = r1.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r19 = 0
            r10 = r2
            r11 = r37
            r12 = r3
            r14 = r8
            r15 = r0
            r17 = r23
            X.1sE r1 = r10.A05(r11, r12, r13, r14, r15, r16, r17, r19)
        L_0x04e2:
            r0 = 2
            r4.A00(r1, r0)
            return r9
        L_0x04e7:
            java.lang.String r4 = "modify"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x0637
            X.0so r3 = r2.A00
            java.util.Map r19 = X.C53262fQ.A06(r3, r1)
            boolean r3 = r19.isEmpty()
            if (r3 != 0) goto L_0x145a
            com.whatsapp.jid.Jid r5 = r8.A01
            X.0rv r3 = X.C16030sJ.A00(r5)
            X.0sL r20 = X.C16050sL.A03(r3)
            X.AnonymousClass00B.A06(r20)
            r3 = r20
            boolean r3 = r2.A01(r3, r1)
            if (r3 == 0) goto L_0x0d7f
            java.lang.String r6 = "v_id"
            r3 = 0
            long r16 = r1.A0D(r6, r3)
            java.util.Set r1 = r19.keySet()
            java.util.Iterator r1 = r1.iterator()
            java.lang.Object r10 = r1.next()
            X.0ul r4 = r2.A06
            X.AnonymousClass00B.A06(r0)
            X.AnonymousClass00B.A06(r10)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.String r1 = "groupmgr/onGroupParticipantChangedNumber/"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r8)
            java.lang.String r1 = "/oldjid:"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = "/newjid:"
            r3.append(r1)
            r3.append(r10)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rv r1 = X.C16030sJ.A00(r5)
            X.0sL r12 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r12)
            X.0sG r1 = r4.A0E
            X.0sH r11 = r1.A09(r12)
            X.0sO r7 = r4.A0a
            X.0us r1 = r7.A07
            X.1cE r6 = r1.A04(r12)
            X.1ck r5 = r6.A05(r0)
            r6.A06(r0)
            X.0sK r1 = r4.A08
            boolean r3 = r1.A0I(r10)
            if (r3 == 0) goto L_0x057b
            r6.A06(r10)
        L_0x057b:
            X.0z2 r3 = r4.A0e
            java.util.Set r27 = r3.A0D(r10)
            r18 = 0
            if (r5 == 0) goto L_0x0634
            int r3 = r5.A01
        L_0x0587:
            r29 = 0
            r30 = 1
            r28 = r3
            r25 = r6
            r26 = r10
            r25.A07(r26, r27, r28, r29, r30)
            X.0yQ r13 = r4.A0p
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r13.A0Q(r12, r3)
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r4.A0J(r12, r3)
            r3 = 2
            if (r11 == 0) goto L_0x05af
            boolean r13 = r6.A0M(r1)
            if (r13 == 0) goto L_0x05af
            if (r5 != 0) goto L_0x05f0
        L_0x05af:
            java.lang.String r13 = "groupmgr/onGroupParticipantChangedNumber/sendgetgroupinfo/"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r13)
            r14 = 1
            r13 = 0
            if (r11 != 0) goto L_0x05bb
            r13 = 1
        L_0x05bb:
            r15.append(r13)
            java.lang.String r13 = "/"
            r15.append(r13)
            boolean r1 = r6.A0M(r1)
            r1 = r1 ^ 1
            r15.append(r1)
            r15.append(r13)
            if (r5 == 0) goto L_0x05d2
            r14 = 0
        L_0x05d2:
            r15.append(r14)
            java.lang.String r1 = r15.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0vd r1 = r4.A0l
            r5 = r37
            r1.A0A(r12, r5, r3)
            X.12B r5 = r4.A0v
            if (r11 == 0) goto L_0x05eb
            int r1 = r11.A05
            r18 = r1
        L_0x05eb:
            r1 = r18
            r5.A01(r12, r1, r3)
        L_0x05f0:
            X.0vL r5 = r4.A0u
            r1 = r19
            r5.A00(r1)
            X.0rt r1 = r4.A0R
            int r5 = r1.A02(r12)
            r1 = 3
            if (r5 != r1) goto L_0x060c
            boolean r1 = r7.A0A(r12)
            if (r1 != 0) goto L_0x060c
            boolean r1 = r7.A0F(r12, r10)
            if (r1 == 0) goto L_0x0630
        L_0x060c:
            X.18M r6 = r4.A0g
            X.122 r1 = r4.A0y
            X.18b r5 = r1.A03
            X.1Vw r27 = r5.A02(r12, r9)
            X.0so r1 = r1.A00
            r28 = 10
            X.1WT r5 = new X.1WT
            r25 = r5
            r26 = r1
            r29 = r23
            r25.<init>(r26, r27, r28, r29)
            r5.A01 = r0
            r5.A00 = r10
            r0 = r16
            r5.A02 = r0
            r6.A00(r5, r3)
        L_0x0630:
            X.124 r0 = r4.A0s
            goto L_0x046b
        L_0x0634:
            r3 = 0
            goto L_0x0587
        L_0x0637:
            java.lang.String r4 = "promote"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x0692
            X.0so r0 = r2.A00
            java.util.Map r0 = X.C53262fQ.A06(r0, r1)
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x145a
            com.whatsapp.jid.Jid r6 = r8.A01
            X.0rv r3 = X.C16030sJ.A00(r6)
            X.0sL r20 = X.C16050sL.A03(r3)
            X.AnonymousClass00B.A06(r20)
            r3 = r20
            boolean r3 = r2.A01(r3, r1)
            if (r3 == 0) goto L_0x0d7f
            java.lang.String r5 = "v_id"
            r3 = 0
            long r16 = r1.A0D(r5, r3)
            X.0ul r5 = r2.A06
            java.lang.String r1 = "groupmgr/onGroupPromoteUsers/"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r3.append(r8)
            java.lang.String r1 = "/"
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rv r1 = X.C16030sJ.A00(r6)
            X.0sL r4 = X.C16050sL.A03(r1)
            if (r4 != 0) goto L_0x0c53
            X.124 r0 = r5.A0s
            goto L_0x046b
        L_0x0692:
            java.lang.String r4 = "linked_group_promote"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x070c
            X.0so r0 = r2.A00
            java.util.Map r1 = X.C53262fQ.A06(r0, r1)
            X.124 r0 = r2.A08
            r0.A02(r8)
            X.0ul r5 = r2.A06
            boolean r0 = r5.A0c()
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00e0
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r4 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r4)
            X.0rt r0 = r2.A03
            int r2 = r0.A02(r4)
            r0 = 3
            if (r2 != r0) goto L_0x00e0
            X.0uk r6 = r5.A0B
            X.0sL r2 = r6.A02(r4)
            if (r2 == 0) goto L_0x06e1
            X.0sK r0 = r5.A08
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x06e1
            r6.A08(r2, r3)
        L_0x06e1:
            X.0vL r0 = r5.A0u
            r0.A00(r1)
            X.18M r3 = r5.A0g
            X.122 r2 = r5.A0y
            r16 = 81
            com.whatsapp.jid.UserJid r13 = r8.A00()
            java.util.Set r1 = r1.keySet()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            r19 = 0
            r10 = r2
            r11 = r37
            r12 = r4
            r14 = r8
            r15 = r0
            r17 = r23
            X.1sE r1 = r10.A05(r11, r12, r13, r14, r15, r16, r17, r19)
            r0 = 2
            r3.A00(r1, r0)
            return r9
        L_0x070c:
            java.lang.String r4 = "remove"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            java.lang.String r5 = "subject"
            if (r4 == 0) goto L_0x0a47
            r4 = r37
            java.lang.String r28 = r1.A0N(r5, r4)
            X.0so r4 = r2.A00
            java.util.Map r14 = X.C53262fQ.A06(r4, r1)
            boolean r4 = r14.isEmpty()
            if (r4 != 0) goto L_0x145a
            com.whatsapp.jid.Jid r7 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r7)
            X.0sL r27 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r27)
            r4 = r27
            boolean r4 = r2.A01(r4, r1)
            if (r4 == 0) goto L_0x0d77
            X.0ul r6 = r2.A06
            r4 = r27
            boolean r4 = r6.A0o(r4)
            if (r4 == 0) goto L_0x145a
            java.lang.String r10 = "v_id"
            r4 = 0
            long r16 = r1.A0D(r10, r4)
            java.lang.String r5 = "reason"
            r4 = r37
            java.lang.String r26 = r1.A0N(r5, r4)
            java.lang.String r1 = "groupmgr/onGroupRemoveUsers/"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r8)
            java.lang.String r1 = "jids:"
            r4.append(r1)
            java.util.Set r1 = r14.keySet()
            java.lang.Object[] r1 = r1.toArray()
            java.lang.String r1 = java.util.Arrays.deepToString(r1)
            r4.append(r1)
            java.lang.String r1 = "/removedBy:"
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rv r1 = X.C16030sJ.A00(r7)
            X.0sL r7 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r7)
            boolean r1 = r14.isEmpty()
            r12 = 0
            r25 = 1
            if (r1 != 0) goto L_0x07ae
            boolean r1 = r6.A0p(r7, r14)
            if (r1 == 0) goto L_0x07ae
            r0 = 3
            r6.A0E(r0, r9, r3)
        L_0x07a4:
            X.18S r3 = r2.A04
            r2 = r27
            r0 = r16
            r3.A02(r2, r0)
            return r9
        L_0x07ae:
            X.0sP r1 = r6.A0G
            r1.A0P(r7)
            X.0sK r10 = r6.A08
            r10.A0B()
            X.1ZT r11 = r10.A05
            X.AnonymousClass00B.A06(r11)
            X.1ZX r4 = r10.A03()
            X.0sG r1 = r6.A0E
            r47 = r1
            X.0sH r5 = r1.A09(r7)
            X.0vL r1 = r6.A0u
            r1.A00(r14)
            if (r0 == 0) goto L_0x07d6
            boolean r1 = r0.equals(r11)
            if (r1 == 0) goto L_0x07e3
        L_0x07d6:
            int r1 = r14.size()
            if (r1 != r9) goto L_0x07e3
            boolean r1 = r14.containsKey(r11)
            r11 = 1
            if (r1 != 0) goto L_0x07e4
        L_0x07e3:
            r11 = 0
        L_0x07e4:
            if (r0 == 0) goto L_0x07ec
            boolean r1 = r0.equals(r4)
            if (r1 == 0) goto L_0x07f9
        L_0x07ec:
            int r1 = r14.size()
            if (r1 != r9) goto L_0x07f9
            boolean r4 = r14.containsKey(r4)
            r1 = 1
            if (r4 != 0) goto L_0x07fa
        L_0x07f9:
            r1 = 0
        L_0x07fa:
            if (r11 != 0) goto L_0x0969
            if (r1 != 0) goto L_0x0969
            if (r5 == 0) goto L_0x0950
            X.0sO r13 = r6.A0a
            boolean r1 = r13.A09(r7)
            if (r1 == 0) goto L_0x0950
            X.0us r1 = r13.A07
            r30 = r1
            X.1cE r12 = r1.A04(r7)
            X.0pd r1 = r6.A0f
            r29 = r1
            r11 = 1108(0x454, float:1.553E-42)
            X.0tM r22 = X.C16620tM.A02
            r4 = r1
            r1 = r22
            boolean r1 = r4.A0E(r1, r11)
            if (r1 == 0) goto L_0x08ff
            java.util.Set r1 = r14.keySet()
            boolean r1 = r12.A0P(r1)
            if (r1 != 0) goto L_0x08ff
            r25 = 0
        L_0x082d:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.util.ArrayList r20 = new java.util.ArrayList
            r20.<init>()
            java.util.Set r1 = r14.entrySet()
            java.util.Iterator r19 = r1.iterator()
        L_0x0844:
            boolean r1 = r19.hasNext()
            java.lang.String r18 = "default_sub_group_demote"
            if (r1 == 0) goto L_0x0904
            java.lang.Object r1 = r19.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r14 = r1.getKey()
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14
            java.lang.Object r15 = r1.getValue()
            X.2Bb r15 = (X.AnonymousClass2Bb) r15
            X.1ck r1 = r12.A06(r14)
            if (r1 == 0) goto L_0x088c
            r11.add(r14)
            boolean r1 = X.C16030sJ.A0M(r14)
            if (r1 == 0) goto L_0x088c
            boolean r1 = r10.A0I(r14)
            if (r1 == 0) goto L_0x088c
            r10.A0B()
            X.1ZT r1 = r10.A05
            X.AnonymousClass00B.A06(r1)
            X.1ck r1 = r12.A06(r1)
            if (r1 == 0) goto L_0x088c
            r10.A0B()
            X.1ZT r1 = r10.A05
            X.AnonymousClass00B.A06(r1)
            r11.add(r1)
        L_0x088c:
            r4 = r26
            r1 = r18
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x08ca
            boolean r1 = r15.A00()
            if (r1 == 0) goto L_0x08ca
            java.lang.String r4 = r15.A03
            java.lang.String r1 = "superadmin"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x08ca
            java.lang.String r1 = "admin"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x08ca
            X.1ZX r15 = r15.A00
            X.0z2 r1 = r6.A0e
            java.util.Set r1 = r1.A0D(r15)
            java.util.Set r1 = X.C30361cE.A01(r1)
            X.1ck r4 = new X.1ck
            r4.<init>(r15, r1, r3, r3)
            r1 = r20
            r1.add(r14)
            r1 = r21
            r1.add(r4)
        L_0x08ca:
            boolean r1 = r10.A0I(r14)
            if (r1 == 0) goto L_0x0844
            X.0pt r14 = r6.A07
            r4 = 37
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r1 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r1.<init>(r6, r4, r7)
            r14.A0K(r1)
            X.0yQ r4 = r6.A0p
            java.lang.Class<X.0sL> r1 = X.C16050sL.class
            com.whatsapp.jid.Jid r1 = r5.A08(r1)
            X.AnonymousClass00B.A06(r1)
            X.0sL r1 = (X.C16050sL) r1
            r4.A0R(r1)
            r14 = 1728(0x6c0, float:2.421E-42)
            r4 = r29
            r1 = r22
            boolean r1 = r4.A0E(r1, r14)
            if (r1 == 0) goto L_0x0844
            X.18U r1 = r6.A0W
            r1.A02(r7)
            goto L_0x0844
        L_0x08ff:
            r13.A04(r12)
            goto L_0x082d
        L_0x0904:
            r3 = r26
            r1 = r18
            boolean r14 = r1.equals(r3)
            if (r14 == 0) goto L_0x0979
            r1 = r21
            r12.A0J(r1)
            X.0tq r1 = r13.A06
            X.0tf r13 = r1.A02()
            X.1cj r12 = r13.A00()     // Catch:{ all -> 0x1eec }
            java.util.Iterator r4 = r20.iterator()     // Catch:{ all -> 0x1ee7 }
        L_0x0921:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x1ee7 }
            if (r1 == 0) goto L_0x0933
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x1ee7 }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ all -> 0x1ee7 }
            r1 = r30
            r1.A0G(r7, r3)     // Catch:{ all -> 0x1ee7 }
            goto L_0x0921
        L_0x0933:
            java.util.Iterator r4 = r21.iterator()     // Catch:{ all -> 0x1ee7 }
        L_0x0937:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x1ee7 }
            if (r1 == 0) goto L_0x0949
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x1ee7 }
            X.1ck r3 = (X.C30661ck) r3     // Catch:{ all -> 0x1ee7 }
            r1 = r30
            r1.A08(r3, r7)     // Catch:{ all -> 0x1ee7 }
            goto L_0x0937
        L_0x0949:
            r12.A00()     // Catch:{ all -> 0x1ee7 }
            r12.close()     // Catch:{ all -> 0x1eec }
            goto L_0x0976
        L_0x0950:
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/requerygroupinfo"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vd r1 = r6.A0l
            r3 = 2
            r0 = r37
            r1.A0A(r7, r0, r3)
            X.12B r1 = r6.A0v
            if (r5 != 0) goto L_0x0966
            r0 = 0
        L_0x0962:
            r1.A01(r7, r0, r3)
            goto L_0x09d7
        L_0x0966:
            int r0 = r5.A05
            goto L_0x0962
        L_0x0969:
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/me leaving"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.List r0 = java.util.Collections.singletonList(r7)
            r6.A0a(r0, r9)
            goto L_0x09d7
        L_0x0976:
            r13.close()
        L_0x0979:
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x0987
            X.0yQ r1 = r6.A0p
            r1.A0Q(r7, r11)
            r6.A0J(r7, r11)
        L_0x0987:
            java.util.List r4 = r6.A09(r7, r11)
            if (r0 == 0) goto L_0x0a43
            boolean r1 = r4.contains(r0)
            if (r1 == 0) goto L_0x0a43
            r4.remove(r0)
            X.122 r1 = r6.A0y
            r42 = 5
            r3 = 7
            r38 = r1
            r39 = r7
            r40 = r0
            r41 = r8
            r43 = r23
            r45 = r16
            X.1sE r11 = r38.A07(r39, r40, r41, r42, r43, r45)
            X.18M r1 = r6.A0g
            r1.A00(r11, r3)
            r12 = 1
        L_0x09b1:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x09d7
            if (r14 == 0) goto L_0x0a3b
            r35 = 94
        L_0x09bb:
            X.122 r1 = r6.A0y
            r29 = r1
            r30 = r37
            r31 = r7
            r32 = r0
            r33 = r8
            r34 = r4
            r36 = r23
            r38 = r16
            X.1sE r1 = r29.A05(r30, r31, r32, r33, r34, r35, r36, r38)
            X.18M r0 = r6.A0g
            r0.A00(r1, r3)
            r12 = 1
        L_0x09d7:
            r24 = r12 ^ 1
            if (r25 == 0) goto L_0x0a33
            r10.A0B()
            X.1Za r3 = r10.A04
            X.AnonymousClass00B.A06(r3)
            X.16P r0 = r6.A0P
            r23 = 2
            com.facebook.redex.RunnableRunnableShape0S0410000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0410000_I0
            r18 = r1
            r19 = r6
            r20 = r7
            r21 = r3
            r22 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.submit(r1)
        L_0x09fb:
            if (r5 == 0) goto L_0x07a4
            boolean r0 = android.text.TextUtils.isEmpty(r28)
            if (r0 != 0) goto L_0x07a4
            java.lang.String r0 = r5.A09()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x07a4
            java.lang.String r0 = "groupmgr/onGroupRemoveUsers/subjectchanged"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r47
            X.0sH r1 = r0.A0A(r7)
            r0 = r28
            r1.A0L = r0
            r0 = r47
            X.18c r0 = r0.A06
            r0.A0J(r1)
            r0 = r47
            X.1kv r0 = r0.A04
            r0.A00(r1)
            X.11H r1 = r6.A0U
            r0 = r28
            r1.A00(r7, r0)
            goto L_0x07a4
        L_0x0a33:
            if (r24 == 0) goto L_0x09fb
            X.124 r0 = r6.A0s
            r0.A02(r8)
            goto L_0x09fb
        L_0x0a3b:
            r35 = 14
            if (r0 != 0) goto L_0x09bb
            r35 = 13
            goto L_0x09bb
        L_0x0a43:
            r3 = 7
            r12 = 0
            goto L_0x09b1
        L_0x0a47:
            boolean r4 = X.C28371Vv.A07(r1, r5)
            if (r4 == 0) goto L_0x0a83
            r0 = r37
            java.lang.String r0 = r1.A0N(r5, r0)
            java.lang.String r5 = "s_t"
            java.lang.String r4 = r1.A0M(r5)
            long r16 = r1.A0E(r4, r5)
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            X.0so r5 = r2.A00
            java.lang.String r4 = "s_o"
            com.whatsapp.jid.Jid r6 = r1.A0F(r5, r6, r4)
            X.0rv r6 = (X.C15830rv) r6
            com.whatsapp.jid.Jid r7 = r8.A01
            X.0rv r1 = X.C16030sJ.A00(r7)
            X.0sL r18 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r18)
            X.18S r1 = r2.A04
            r35 = r1
            X.191 r4 = r1.A00
            java.util.Map r10 = r4.A02
            monitor-enter(r10)
            goto L_0x0d8b
        L_0x0a83:
            java.lang.String r4 = "invite"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x0f67
            java.lang.String r3 = "code"
            r0 = r37
            java.lang.String r4 = r1.A0N(r3, r0)
            X.0ul r3 = r2.A06
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.AnonymousClass00B.A06(r0)
            X.0sL r2 = X.C16050sL.A03(r0)
            if (r2 == 0) goto L_0x1ef7
            java.util.Map r0 = r3.A11
            r0.put(r2, r4)
            r1 = 6
            X.2Bd r0 = new X.2Bd
            r0.<init>(r2, r4)
            X.C17240ul.A01(r1, r0)
            X.18M r4 = r3.A0g
            X.122 r2 = r3.A0y
            java.lang.String r1 = "SystemMessageFactory/newInviteLinkRevokedMessage/stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = 21
            r12 = r37
            r10 = r2
            r11 = r12
            r13 = r8
            r15 = r23
            X.1sE r1 = r10.A06(r11, r12, r13, r14, r15)
            com.whatsapp.jid.UserJid r0 = r8.A00()
            r1.A0b(r0)
            goto L_0x04e2
        L_0x0add:
            X.0sO r1 = r13.A0a
            r26 = r1
            X.0us r15 = r1.A07
            X.1cE r14 = r15.A04(r12)
            X.0rt r5 = r13.A0R
            int r4 = r5.A02(r12)
            r1 = 3
            if (r4 == r1) goto L_0x0af4
            r25 = 1
            if (r4 != r9) goto L_0x0af6
        L_0x0af4:
            r25 = 0
        L_0x0af6:
            boolean r22 = r5.A0H(r12)
            boolean r21 = r13.A0k(r12)
            X.0vL r1 = r13.A0u
            r1.A00(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r19 = r0.iterator()
            r18 = 0
        L_0x0b1c:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x0b74
            java.lang.Object r0 = r19.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            X.2Bb r1 = (X.AnonymousClass2Bb) r1
            boolean r4 = r1.A00()
            if (r4 == 0) goto L_0x0b6c
            X.1ZX r0 = r1.A00
            com.whatsapp.jid.UserJid r4 = r1.A01
            if (r21 == 0) goto L_0x0b3d
            r7.add(r4)
        L_0x0b3d:
            X.1ck r6 = r13.A06(r14, r4, r3)
            X.AnonymousClass00B.A06(r6)
            if (r21 == 0) goto L_0x0b6a
            X.1ck r5 = r13.A06(r14, r0, r3)
        L_0x0b4a:
            X.0sK r0 = r13.A08
            r1 = r0
            com.whatsapp.jid.UserJid r0 = r6.A03
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0b57
            r18 = 1
        L_0x0b57:
            boolean r0 = X.C16030sJ.A0M(r4)
            if (r0 == 0) goto L_0x0b66
            r10.add(r6)
        L_0x0b60:
            if (r5 == 0) goto L_0x0b1c
            r10.add(r5)
            goto L_0x0b1c
        L_0x0b66:
            r11.add(r6)
            goto L_0x0b60
        L_0x0b6a:
            r5 = 0
            goto L_0x0b4a
        L_0x0b6c:
            java.lang.Object r4 = r0.getKey()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            r0 = 0
            goto L_0x0b3d
        L_0x0b74:
            if (r22 == 0) goto L_0x0bd8
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            if (r18 == 0) goto L_0x0b9b
            X.0uz r0 = r14.A04()
            X.1Ub r4 = r0.iterator()
        L_0x0b85:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0bac
            java.lang.Object r3 = r4.next()
            X.1ck r3 = (X.C30661ck) r3
            int r0 = r3.A01
            if (r0 != 0) goto L_0x0b85
            com.whatsapp.jid.UserJid r0 = r3.A03
            r1.add(r0)
            goto L_0x0b85
        L_0x0b9b:
            X.0sK r0 = r13.A08
            boolean r0 = r14.A0N(r0)
            if (r0 != 0) goto L_0x0bac
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0bac
            r1.addAll(r7)
        L_0x0bac:
            r14.A0K(r1)
            r0 = r26
            X.0tq r0 = r0.A06
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x1ee2 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x1edd }
        L_0x0bbf:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x1edd }
            if (r0 == 0) goto L_0x0bcf
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x1edd }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x1edd }
            r15.A0G(r12, r0)     // Catch:{ all -> 0x1edd }
            goto L_0x0bbf
        L_0x0bcf:
            r3.A00()     // Catch:{ all -> 0x1edd }
            r3.close()     // Catch:{ all -> 0x1ee2 }
            r4.close()
        L_0x0bd8:
            if (r18 == 0) goto L_0x0c43
            if (r25 == 0) goto L_0x0c43
            r1 = 0
        L_0x0bdd:
            if (r22 == 0) goto L_0x0c3f
            if (r21 == 0) goto L_0x0c37
            r13.A0L(r12, r1, r10)
        L_0x0be4:
            if (r18 == 0) goto L_0x0c48
            X.0pt r3 = r13.A07
            r1 = 45
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r13, r1, r12)
            r3.A0K(r0)
            X.0pd r3 = r13.A0f
            r1 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r3.A0E(r0, r1)
            if (r0 == 0) goto L_0x0c0a
            X.0sq r3 = r13.A10
            r1 = 46
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r13, r1, r12)
            r3.Acl(r0)
        L_0x0c0a:
            if (r25 == 0) goto L_0x0c48
            X.18M r1 = r13.A0g
            X.122 r0 = r13.A0y
            r31 = 16
            com.whatsapp.jid.UserJid r28 = r8.A00()
            X.0sK r3 = r13.A08
            r3.A0B()
            X.1ZT r3 = r3.A05
            java.util.List r30 = java.util.Collections.singletonList(r3)
            r25 = r0
            r26 = r37
            r27 = r12
            r29 = r8
            r32 = r23
            r34 = r16
            X.1sE r3 = r25.A05(r26, r27, r28, r29, r30, r31, r32, r34)
            r0 = 2
            r1.A00(r3, r0)
            goto L_0x00d7
        L_0x0c37:
            X.0sK r0 = r13.A08
            boolean r0 = r14.A0N(r0)
            if (r0 == 0) goto L_0x0be4
        L_0x0c3f:
            r13.A0L(r12, r1, r11)
            goto L_0x0be4
        L_0x0c43:
            java.lang.Long r1 = java.lang.Long.valueOf(r16)
            goto L_0x0bdd
        L_0x0c48:
            X.124 r0 = r13.A0s
            r0.A02(r8)
            r0 = 5
            X.C17240ul.A01(r0, r12)
            goto L_0x00d7
        L_0x0c53:
            X.0sO r1 = r5.A0a
            X.0us r1 = r1.A07
            X.1cE r7 = r1.A04(r4)
            X.0rt r1 = r5.A0R
            int r6 = r1.A02(r4)
            r1 = 3
            if (r6 == r1) goto L_0x0c68
            r18 = 1
            if (r6 != r9) goto L_0x0c6a
        L_0x0c68:
            r18 = 0
        L_0x0c6a:
            boolean r15 = r5.A0k(r4)
            X.0vL r1 = r5.A0u
            r1.A00(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r14 = r0.iterator()
            r13 = 0
        L_0x0c86:
            boolean r1 = r14.hasNext()
            r0 = 0
            if (r1 == 0) goto L_0x0cb9
            java.lang.Object r1 = r14.next()
            X.2Bb r1 = (X.AnonymousClass2Bb) r1
            com.whatsapp.jid.UserJid r11 = r1.A01
            boolean r12 = r1.A00()
            if (r12 == 0) goto L_0x0c9d
            X.1ZX r0 = r1.A00
        L_0x0c9d:
            X.1ck r1 = r5.A06(r7, r11, r9)
            if (r15 == 0) goto L_0x0cac
            X.1ck r0 = r5.A06(r7, r0, r9)
            if (r0 == 0) goto L_0x0cac
            r3.add(r0)
        L_0x0cac:
            r10.add(r1)
            X.0sK r0 = r5.A08
            boolean r0 = r0.A0I(r11)
            if (r0 == 0) goto L_0x0c86
            r13 = 1
            goto L_0x0c86
        L_0x0cb9:
            if (r15 == 0) goto L_0x0cbc
            r10 = r3
        L_0x0cbc:
            if (r18 == 0) goto L_0x0d71
            if (r13 == 0) goto L_0x0d71
        L_0x0cc0:
            r5.A0L(r4, r0, r10)
            X.0sG r0 = r5.A0E
            X.0sH r3 = r0.A09(r4)
            if (r13 == 0) goto L_0x0d6c
            X.0pt r10 = r5.A07
            r1 = 35
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r5, r1, r4)
            r10.A0K(r0)
            if (r3 == 0) goto L_0x0d13
            boolean r0 = r3.A0Y
            if (r0 == 0) goto L_0x0d13
            X.0uz r0 = r7.A04()
            int r1 = r0.size()
            if (r6 == r9) goto L_0x0d13
            X.0pd r7 = r5.A0f
            r0 = 934(0x3a6, float:1.309E-42)
            X.0tM r6 = X.C16620tM.A02
            int r0 = r7.A03(r6, r0)
            if (r1 < r0) goto L_0x0d13
            r0 = 1946(0x79a, float:2.727E-42)
            int r0 = r7.A03(r6, r0)
            if (r1 > r0) goto L_0x0d13
            X.0t6 r10 = r5.A0T
            X.17g r6 = r5.A0x
            X.0t3 r0 = r5.A0L
            long r0 = r0.A00()
            X.18b r6 = r6.A05
            X.1Vw r7 = r6.A02(r4, r9)
            X.1rx r6 = new X.1rx
            r6.<init>(r7, r0)
            r10.A0W(r6)
        L_0x0d13:
            if (r18 == 0) goto L_0x0d6c
            X.18M r1 = r5.A0g
            X.122 r0 = r5.A0y
            r31 = 15
            com.whatsapp.jid.UserJid r28 = r8.A00()
            X.0sK r6 = r5.A08
            r6.A0B()
            X.1ZT r6 = r6.A05
            java.util.List r30 = java.util.Collections.singletonList(r6)
            r25 = r0
            r26 = r37
            r27 = r4
            r29 = r8
            r32 = r23
            r34 = r16
            X.1sE r6 = r25.A05(r26, r27, r28, r29, r30, r31, r32, r34)
            r0 = 2
            r1.A00(r6, r0)
        L_0x0d3e:
            X.124 r0 = r5.A0s
            r0.A02(r8)
            if (r13 == 0) goto L_0x00d7
            X.0pd r6 = r5.A0f
            r1 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r6.A0E(r0, r1)
            if (r0 == 0) goto L_0x00d7
            if (r3 == 0) goto L_0x00d7
            boolean r0 = r3.A0k
            if (r0 == 0) goto L_0x00d7
            X.18V r3 = r5.A0X
            java.lang.String r0 = r4.getRawString()
            X.C18450wi.A0B(r0)
            X.2BT r1 = new X.2BT
            r1.<init>(r0)
            X.0xb r0 = r3.A00
            r0.A00(r1)
            goto L_0x00d7
        L_0x0d6c:
            r0 = 5
            X.C17240ul.A01(r0, r4)
            goto L_0x0d3e
        L_0x0d71:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            goto L_0x0cc0
        L_0x0d77:
            X.0vd r4 = r2.A07
            java.lang.String r3 = "participant_change_recovery"
            r1 = 2
            r0 = r27
            goto L_0x0d86
        L_0x0d7f:
            X.0vd r4 = r2.A07
            java.lang.String r3 = "participant_change_recovery"
            r1 = 2
            r0 = r20
        L_0x0d86:
            r4.A0A(r0, r3, r1)
            goto L_0x145a
        L_0x0d8b:
            r1 = r18
            java.lang.Object r1 = r10.get(r1)     // Catch:{ all -> 0x1ef4 }
            X.1sl r1 = (X.C39611sl) r1     // Catch:{ all -> 0x1ef4 }
            if (r1 != 0) goto L_0x0d9b
            r1 = r18
            X.1sl r1 = r4.A00(r1)     // Catch:{ all -> 0x1ef4 }
        L_0x0d9b:
            long r4 = r1.A01     // Catch:{ all -> 0x1ef4 }
            monitor-exit(r10)     // Catch:{ all -> 0x1ef4 }
            int r1 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r1 > 0) goto L_0x0f52
            X.0ul r2 = r2.A06
            r10 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r16
            java.lang.String r1 = "groupmgr/onGroupNewSubject/"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            r4.append(r8)
            java.lang.String r1 = "/"
            r4.append(r1)
            r4.append(r0)
            r4.append(r1)
            r4.append(r6)
            r4.append(r1)
            r4.append(r10)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0rv r1 = X.C16030sJ.A00(r7)
            X.0sL r1 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r1)
            X.0rt r4 = r2.A0R
            int r5 = r4.A03(r1)
            r15 = 0
            r4 = 3
            if (r5 != r4) goto L_0x0f4b
            r7 = 1
            X.0uk r4 = r2.A0B
            X.0sL r12 = r4.A02(r1)
        L_0x0de9:
            X.0sG r4 = r2.A0E
            X.0sH r13 = r4.A09(r1)
            if (r13 == 0) goto L_0x0ee1
            X.0sP r5 = r2.A0G
            java.lang.String r5 = r5.A08(r13)
            boolean r13 = r5.equals(r0)
            if (r13 != 0) goto L_0x0ed5
            r2.A0R(r1, r12, r0, r7)
            java.lang.String r13 = "groupmgr/onGroupNewSubject/changed"
            com.whatsapp.util.Log.i((java.lang.String) r13)
            X.0sH r13 = r4.A0A(r1)
            r13.A0L = r0
            X.18c r14 = r4.A06
            r14.A0J(r13)
            X.1kv r4 = r4.A04
            r4.A00(r13)
            if (r15 == 0) goto L_0x0e2d
            X.0pt r4 = r2.A07
            r3 = 44
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r2, r3, r1)
            r4.A0K(r0)
        L_0x0e23:
            r3 = r35
            r1 = r16
            r0 = r18
            r3.A03(r0, r1)
            return r9
        L_0x0e2d:
            r4 = 4
            if (r7 == 0) goto L_0x0eb6
            X.0pd r14 = r2.A0f
            X.0tM r13 = X.C16620tM.A02
            r7 = 982(0x3d6, float:1.376E-42)
            boolean r7 = r14.A0E(r13, r7)
            if (r7 == 0) goto L_0x0eb6
            X.18M r7 = r2.A0g
            r15 = 2857(0xb29, float:4.004E-42)
            boolean r14 = r14.A0E(r13, r15)
            X.122 r13 = r2.A0y
            X.18b r2 = r13.A03
            if (r14 == 0) goto L_0x0e79
            X.1Vw r2 = r2.A02(r1, r9)
            X.1th r1 = new X.1th
            r1.<init>(r2, r8, r10)
            r1.A18(r12, r0)
            X.C18450wi.A0H(r12, r3)
            java.util.List r0 = r1.A16(r4)
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0e68
            java.lang.String r0 = "FMessageSystemParentGroupNameChanged/setOldParentInfo/old parent info should only be set once"
            X.AnonymousClass00B.A08(r0)
        L_0x0e68:
            java.util.List r2 = r1.A00
            X.1sY r0 = new X.1sY
            r0.<init>(r12, r5, r4)
            r2.add(r0)
            r1.A0b(r6)
        L_0x0e75:
            r7.A00(r1, r4)
            goto L_0x0e23
        L_0x0e79:
            X.1Vw r20 = r2.A02(r1, r9)
            X.0so r1 = r13.A00
            r22 = 100
            r19 = r1
            r21 = r8
            r23 = r10
            X.1WU r1 = X.AnonymousClass122.A00(r19, r20, r21, r22, r23)
            X.1sV r1 = (X.C39451sV) r1
            java.lang.Object r2 = r1.A12
            monitor-enter(r2)
            r1.A02 = r0     // Catch:{ all -> 0x1ef1 }
            monitor-exit(r2)     // Catch:{ all -> 0x1ef1 }
            r1.A01 = r12
            java.util.Set r2 = r1.A03
            r2.clear()
            X.1Vw r0 = r1.A11
            X.0rv r0 = r0.A00
            com.whatsapp.jid.GroupJid r11 = com.whatsapp.jid.GroupJid.of(r0)
            X.AnonymousClass00B.A06(r11)
            X.1sW r0 = new X.1sW
            r13 = 1
            r14 = 0
            r10 = r0
            r12 = r5
            r10.<init>(r11, r12, r13, r14)
            r2.add(r0)
            r1.A0b(r6)
            goto L_0x0e75
        L_0x0eb6:
            X.18M r7 = r2.A0g
            X.122 r2 = r2.A0y
            r23 = 1
            r19 = r2
            r20 = r37
            r21 = r1
            r22 = r8
            r24 = r10
            X.1sE r1 = r19.A06(r20, r21, r22, r23, r24)
            X.1sD r1 = (X.C39281sD) r1
            r1.A14(r0)
            r1.A01 = r5
            r1.A0b(r6)
            goto L_0x0e75
        L_0x0ed5:
            java.lang.String r0 = "groupmgr/onGroupNewSubject/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.124 r0 = r2.A0s
            r0.A02(r8)
            goto L_0x0e23
        L_0x0ee1:
            r2.A0R(r1, r12, r0, r7)
            java.lang.String r3 = "groupmgr/onGroupNewSubject/new group"
            com.whatsapp.util.Log.i((java.lang.String) r3)
            boolean r5 = r2.A0k(r1)
            X.1cE r3 = new X.1cE
            r3.<init>(r1, r5)
            X.0sH r5 = new X.0sH
            r5.<init>(r1)
            X.1cF r22 = X.C30371cF.A04
            r24 = 0
            r25 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r19 = r4
            r20 = r5
            r21 = r37
            r23 = r0
            r26 = r10
            r19.A0P(r20, r21, r22, r23, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34)
            X.11J r4 = r2.A0Z
            X.AnonymousClass00B.A06(r1)
            java.util.concurrent.ConcurrentHashMap r4 = r4.A03
            r4.put(r1, r3)
            if (r15 != 0) goto L_0x0f41
            X.18M r4 = r2.A0g
            X.122 r3 = r2.A0y
            r23 = 11
            r19 = r3
            r20 = r37
            r21 = r1
            r22 = r8
            r24 = r10
            X.1sE r3 = r19.A06(r20, r21, r22, r23, r24)
            r3.A0k(r0)
            r3.A0b(r6)
            r4.A00(r3, r9)
        L_0x0f41:
            X.0vd r3 = r2.A0l
            r2 = 2
            r0 = r37
            r3.A0A(r1, r0, r2)
            goto L_0x0e23
        L_0x0f4b:
            r7 = 0
            if (r5 != r9) goto L_0x0f4f
            r15 = 1
        L_0x0f4f:
            r12 = 0
            goto L_0x0de9
        L_0x0f52:
            java.lang.String r0 = "GroupNotificationHandler/handleSubject/old timestamp, gjid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r18
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x145a
        L_0x0f67:
            java.lang.String r4 = "description"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1052
            X.0so r0 = r2.A00
            X.1cF r6 = X.C53262fQ.A04(r0, r6, r6)
            X.0ul r10 = r2.A06
            java.lang.String r0 = "groupmgr/onGroupNewDescription/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r7 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r7)
            X.0sG r2 = r10.A0E
            X.0sH r0 = r2.A09(r7)
            if (r0 == 0) goto L_0x1efd
            X.1cF r0 = r0.A0H
            java.lang.String r0 = r0.A02
            java.lang.String r5 = r6.A02
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 != 0) goto L_0x104c
            java.lang.String r0 = "groupmgr/onGroupNewDescription/changed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sH r1 = r2.A0A(r7)
            if (r5 == 0) goto L_0x0fbe
            r1.A0H = r6
        L_0x0fbe:
            X.18c r0 = r2.A06
            r0.A0J(r1)
            X.1kv r0 = r2.A04
            r0.A00(r1)
            X.0yz r0 = r10.A0c
            X.0tZ r11 = r0.A01(r7)
            boolean r0 = r11 instanceof X.AnonymousClass1WU
            r4 = 3006(0xbbe, float:4.212E-42)
            if (r0 == 0) goto L_0x1033
            r12 = r11
            X.1WU r12 = (X.AnonymousClass1WU) r12
            long r2 = r12.A0I
            long r0 = r6.A00
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r13
            boolean r18 = X.C42681yF.A0A(r2, r0)
            long r2 = r12.A0I
            long r13 = r0 - r2
            long r16 = java.lang.Math.abs(r13)
            r13 = 90000(0x15f90, double:4.4466E-319)
            r15 = 1
            int r2 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            r14 = 0
            if (r2 > 0) goto L_0x0ff4
            r14 = 1
        L_0x0ff4:
            java.lang.String r2 = r12.A0I()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x1005
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r13 = 1
            if (r2 == 0) goto L_0x1006
        L_0x1005:
            r13 = 0
        L_0x1006:
            int r3 = r12.A00
            r2 = 27
            if (r3 != r2) goto L_0x1031
            X.0rv r3 = r12.A0B()
            if (r3 == 0) goto L_0x1031
            com.whatsapp.jid.UserJid r2 = r6.A01
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x1031
        L_0x101a:
            if (r18 == 0) goto L_0x1033
            if (r14 == 0) goto L_0x1033
            if (r13 == 0) goto L_0x1033
            if (r15 == 0) goto L_0x1033
            r11.A0I = r0
            r11.A0g = r5
            r0 = 3015(0xbc7, float:4.225E-42)
            X.C17240ul.A01(r0, r11)
        L_0x102b:
            X.124 r0 = r10.A0s
        L_0x102d:
            r0.A02(r8)
            return r9
        L_0x1031:
            r15 = 0
            goto L_0x101a
        L_0x1033:
            X.122 r10 = r10.A0y
            long r0 = r6.A00
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r14 = 27
            r11 = r37
            r12 = r7
            r13 = r8
            r15 = r0
            X.1sE r1 = r10.A06(r11, r12, r13, r14, r15)
            r1.A0k(r5)
            com.whatsapp.jid.UserJid r0 = r6.A01
            goto L_0x1734
        L_0x104c:
            java.lang.String r0 = "groupmgr/onGroupNewSubject/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x102b
        L_0x1052:
            java.lang.String r4 = "locked"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x10c4
            X.0ul r5 = r2.A06
            r3 = 1
        L_0x105d:
            java.lang.String r1 = "groupmgr/onGroupRestrictModeToggled/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.jid.Jid r1 = r8.A01
            X.0rv r1 = X.C16030sJ.A00(r1)
            X.0sL r4 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r4)
            X.0sG r6 = r5.A0E
            X.0sH r1 = r6.A09(r4)
            if (r1 == 0) goto L_0x2031
            boolean r1 = r1.A0l
            if (r1 == r3) goto L_0x1153
            java.lang.String r1 = "groupmgr/onGroupRestrictModeToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0sH r2 = r6.A0A(r4)
            boolean r1 = r2.A0l
            if (r1 == r3) goto L_0x10a8
            r2.A0l = r3
            X.18c r1 = r6.A06
            r1.A0J(r2)
            X.1kv r1 = r6.A04
            r1.A00(r2)
        L_0x10a8:
            r2 = 3008(0xbc0, float:4.215E-42)
            X.122 r1 = r5.A0y
            r14 = 30
            if (r3 == 0) goto L_0x10b2
            r14 = 29
        L_0x10b2:
            r10 = r1
            r11 = r37
            r12 = r4
            r13 = r8
            r15 = r23
            X.1sE r1 = r10.A06(r11, r12, r13, r14, r15)
            r1.A0b(r0)
            X.C17240ul.A01(r2, r1)
            return r9
        L_0x10c4:
            java.lang.String r4 = "unlocked"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x10d0
            X.0ul r5 = r2.A06
            goto L_0x105d
        L_0x10d0:
            java.lang.String r4 = "announcement"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x10dc
            r12 = 1
        L_0x10d9:
            monitor-enter(r2)
            goto L_0x1f01
        L_0x10dc:
            java.lang.String r4 = "not_announcement"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x10e6
            r12 = 0
            goto L_0x10d9
        L_0x10e6:
            java.lang.String r4 = "no_frequently_forwarded"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1148
            X.0ul r5 = r2.A06
            r3 = 1
        L_0x10f1:
            java.lang.String r1 = "groupmgr/onGroupNoFrequentlyForwardedToggled/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.jid.Jid r1 = r8.A01
            X.0rv r1 = X.C16030sJ.A00(r1)
            X.0sL r4 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r4)
            X.0sG r6 = r5.A0E
            X.0sH r1 = r6.A09(r4)
            if (r1 == 0) goto L_0x2014
            boolean r1 = r1.A0j
            if (r1 == r3) goto L_0x1156
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0sH r2 = r6.A0A(r4)
            boolean r1 = r2.A0j
            if (r1 == r3) goto L_0x113c
            r2.A0j = r3
            X.18c r1 = r6.A06
            r1.A0J(r2)
            X.1kv r1 = r6.A04
            r1.A00(r2)
        L_0x113c:
            r2 = 3016(0xbc8, float:4.226E-42)
            X.122 r1 = r5.A0y
            r14 = 54
            if (r3 == 0) goto L_0x10b2
            r14 = 53
            goto L_0x10b2
        L_0x1148:
            java.lang.String r4 = "frequently_forwarded_ok"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x115f
            X.0ul r5 = r2.A06
            goto L_0x10f1
        L_0x1153:
            java.lang.String r0 = "groupmgr/onGroupRestrictModeToggled/did not change"
            goto L_0x1158
        L_0x1156:
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/did not change"
        L_0x1158:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.124 r0 = r5.A0s
            goto L_0x102d
        L_0x115f:
            java.lang.String r4 = "revoke"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1213
            java.lang.String r0 = "participant"
            java.util.List r0 = r1.A0O(r0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.Iterator r7 = r0.iterator()
        L_0x1177:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x119f
            java.lang.Object r6 = r7.next()
            X.1Vv r6 = (X.C28371Vv) r6
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.0so r1 = r2.A00
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r5 = r6.A0F(r1, r3, r0)
            if (r5 == 0) goto L_0x1177
            java.lang.String r3 = "expiration"
            r0 = 0
            long r0 = r6.A0D(r3, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r5, r0)
            goto L_0x1177
        L_0x119f:
            X.0ul r2 = r2.A06
            java.lang.String r1 = "groupmgr/onGroupInvitesRevoked/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r7 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r7)
            com.whatsapp.jid.UserJid r3 = r8.A00()
            X.AnonymousClass00B.A06(r3)
            X.0sK r1 = r2.A08
            boolean r0 = r1.A0I(r3)
            if (r0 == 0) goto L_0x11e2
            X.18P r2 = r2.A0V
            X.0sq r1 = r2.A05
            r15 = 21
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0
            r10 = r0
            r11 = r2
            r12 = r4
            r13 = r8
            r14 = r7
            r10.<init>(r11, r12, r13, r14, r15)
            r1.Acl(r0)
            return r9
        L_0x11e2:
            r1.A0B()
            X.1ZT r1 = r1.A05
            boolean r0 = r4.containsKey(r1)
            if (r0 == 0) goto L_0x120a
            X.18P r2 = r2.A0V
            java.lang.Object r0 = r4.get(r1)
            X.AnonymousClass00B.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r10 = r0.longValue()
            X.0sq r1 = r2.A05
            com.facebook.redex.RunnableRunnableShape0S0400100_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0400100_I0
            r4 = r0
            r5 = r3
            r6 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r1.Acl(r0)
            return r9
        L_0x120a:
            java.lang.String r0 = "GroupChatManager/onGroupInvitesRevoked invalid notification received"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.124 r0 = r2.A0s
            goto L_0x102d
        L_0x1213:
            java.lang.String r4 = "not_ephemeral"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1226
            X.0ul r1 = r2.A06
            r4 = 0
        L_0x121e:
            r2 = r0
            r3 = r8
            r5 = r23
            r1.A0W(r2, r3, r4, r5)
            return r9
        L_0x1226:
            java.lang.String r4 = "ephemeral"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x123b
            java.lang.String r4 = "expiration"
            java.lang.String r3 = r1.A0M(r4)
            int r4 = r1.A0B(r3, r4)
            X.0ul r1 = r2.A06
            goto L_0x121e
        L_0x123b:
            java.lang.String r4 = "suspended"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x124a
            X.0ul r0 = r2.A06
            r0.A0Z(r8, r9)
            return r9
        L_0x124a:
            java.lang.String r4 = "unsuspended"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1259
            X.0ul r0 = r2.A06
            r0.A0Z(r8, r3)
            return r9
        L_0x1259:
            java.lang.String r4 = "link"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1291
            com.whatsapp.jid.Jid r4 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r4)
            X.0sL r11 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r11)
            java.lang.String r5 = "link_type"
            r4 = r37
            java.lang.String r6 = r1.A0N(r5, r4)
            java.lang.String r4 = "sub_group"
            boolean r4 = r4.equals(r6)
            r5 = 2
            if (r4 == 0) goto L_0x12eb
            java.util.Set r14 = r2.A00(r1, r5)
            X.0ul r1 = r2.A06
            r17 = 1
            r10 = r1
        L_0x1289:
            r12 = r0
            r13 = r8
            r15 = r23
            r10.A0U(r11, r12, r13, r14, r15, r17)
            return r9
        L_0x1291:
            java.lang.String r4 = "unlink"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1438
            com.whatsapp.jid.Jid r4 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r4)
            X.0sL r5 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r5)
            java.lang.String r6 = "unlink_type"
            r4 = r37
            java.lang.String r6 = r1.A0N(r6, r4)
            java.lang.String r7 = "unlink_reason"
            java.lang.String r7 = r1.A0N(r7, r4)
            java.lang.String r4 = "unlink_group"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x12d6
            r13 = 1
        L_0x12c1:
            java.lang.String r4 = "sub_group"
            boolean r4 = r4.equals(r6)
            r10 = 2
            if (r4 == 0) goto L_0x1332
            java.util.Set r14 = r2.A00(r1, r10)
            X.0ul r1 = r2.A06
            r17 = 0
            r10 = r1
            r11 = r5
            goto L_0x1289
        L_0x12d6:
            java.lang.String r4 = "delete_parent"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto L_0x12e0
            r13 = 2
            goto L_0x12c1
        L_0x12e0:
            java.lang.String r4 = "integrity_delete_parent"
            boolean r4 = r4.equals(r7)
            r13 = 0
            if (r4 == 0) goto L_0x12c1
            r13 = 3
            goto L_0x12c1
        L_0x12eb:
            java.lang.String r4 = "parent_group"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x1406
            java.util.Set r6 = r2.A00(r1, r9)
            X.0ul r5 = r2.A06
            int r1 = r6.size()
            if (r1 != r9) goto L_0x132e
            java.util.List r1 = java.util.Collections.singletonList(r11)
            java.util.List r4 = r5.A0A(r1)
            int r1 = r4.size()
            if (r1 != r9) goto L_0x132e
            java.util.Iterator r1 = r6.iterator()
            java.lang.Object r2 = r1.next()
            X.1sW r2 = (X.C39461sW) r2
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            r16 = 75
            java.lang.Object r1 = r4.get(r3)
            X.1sW r1 = (X.C39461sW) r1
            r10 = r5
            r11 = r1
            r12 = r2
            r13 = r0
            r14 = r8
            r17 = r23
            r10.A0I(r11, r12, r13, r14, r15, r16, r17)
            return r9
        L_0x132e:
            X.124 r0 = r5.A0s
            goto L_0x102d
        L_0x1332:
            java.lang.String r4 = "parent_group"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x13f2
            java.util.Set r4 = r2.A00(r1, r9)
            X.0ul r7 = r2.A06
            int r1 = r4.size()
            if (r1 != r9) goto L_0x13ee
            r1 = 3
            if (r13 == r1) goto L_0x13ee
            java.util.Iterator r1 = r4.iterator()
            java.lang.Object r12 = r1.next()
            X.1sW r12 = (X.C39461sW) r12
            java.util.List r1 = java.util.Collections.singletonList(r5)
            java.util.List r2 = r7.A0A(r1)
            X.0uk r11 = r7.A0B
            com.whatsapp.jid.GroupJid r6 = r12.A02
            X.0sL r1 = X.C16050sL.A03(r6)
            r11.A07(r1, r2)
            boolean r1 = r11.A0A()
            r4 = 3010(0xbc2, float:4.218E-42)
            r14 = 2
            if (r1 == 0) goto L_0x139d
            if (r13 != r10) goto L_0x139d
            java.lang.String r1 = "groupChatManager/unlink due to delete parent group"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.18M r10 = r7.A0g
            X.122 r1 = r7.A0y
            X.0sP r2 = r7.A0G
            java.lang.String r2 = r2.A0J(r6)
            X.18b r13 = r1.A03
            X.1Vw r16 = r13.A02(r5, r9)
            X.0so r1 = r1.A00
            r18 = 87
            r15 = r1
            r17 = r37
            r19 = r23
            X.1WU r1 = X.AnonymousClass122.A00(r15, r16, r17, r18, r19)
            X.1sU r1 = (X.C39441sU) r1
            r1.A00 = r2
            r1.A0b(r0)
            r10.A00(r1, r4)
        L_0x139d:
            boolean r1 = r11.A0A()
            if (r1 == 0) goto L_0x13ee
            X.0pd r10 = r7.A0f
            r2 = 2857(0xb29, float:4.004E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r10.A0E(r1, r2)
            X.122 r10 = r7.A0y
            if (r1 == 0) goto L_0x13cc
            java.lang.String r12 = r12.A03
            X.18b r1 = r10.A03
            X.1Vw r11 = r1.A02(r5, r9)
            X.1u9 r5 = new X.1u9
            r1 = r23
            r5.<init>(r11, r8, r1)
            r5.A18(r6, r12)
            r10.A0B(r0, r5, r3)
        L_0x13c6:
            X.18M r0 = r7.A0g
            r0.A00(r5, r4)
            return r9
        L_0x13cc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            X.18b r1 = r10.A03
            X.1Vw r12 = r1.A02(r5, r9)
            r14 = 75
            X.0so r1 = r10.A00
            r11 = r1
            r13 = r8
            r15 = r23
            X.1WU r5 = X.AnonymousClass122.A00(r11, r12, r13, r14, r15)
            X.1sT r5 = (X.C39431sT) r5
            r5.A02 = r2
            r5.A00 = r3
            r5.A01 = r6
            r10.A0B(r0, r5, r3)
            goto L_0x13c6
        L_0x13ee:
            X.124 r0 = r7.A0s
            goto L_0x102d
        L_0x13f2:
            java.lang.String r3 = "sibling_group"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x1423
            java.util.Set r14 = r2.A00(r1, r10)
            X.0ul r1 = r2.A06
            r17 = 0
            r10 = r1
            r11 = r5
            goto L_0x1418
        L_0x1406:
            java.lang.String r3 = "sibling_group"
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x1420
            java.util.Set r14 = r2.A00(r1, r5)
            X.0ul r1 = r2.A06
            r17 = 1
            r10 = r1
        L_0x1418:
            r12 = r0
            r13 = r8
            r15 = r23
            r10.A0T(r11, r12, r13, r14, r15, r17)
            return r9
        L_0x1420:
            java.lang.String r1 = "GroupNotificationHandler/handleGroupLinked/incorrect link type = "
            goto L_0x1425
        L_0x1423:
            java.lang.String r1 = "GroupNotificationHandler/handleGroupUnlinked/incorrect link type = "
        L_0x1425:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.124 r0 = r2.A08
            goto L_0x102d
        L_0x1438:
            java.lang.String r4 = "growth_locked"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1464
            X.1jl r5 = X.C53262fQ.A05(r6)
            if (r5 == 0) goto L_0x145e
            X.0ul r4 = r2.A06
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r3 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r3)
            r0 = r23
            r4.A0V(r3, r5, r0)
        L_0x145a:
            X.124 r0 = r2.A08
            goto L_0x102d
        L_0x145e:
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/null growth lock, ignoring"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x145a
        L_0x1464:
            java.lang.String r4 = "growth_unlocked"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1488
            X.0ul r6 = r2.A06
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r5 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r5)
            r0 = 0
            X.1jl r4 = new X.1jl
            r4.<init>(r3, r0)
            r0 = r23
            r6.A0V(r5, r4, r0)
            goto L_0x145a
        L_0x1488:
            java.lang.String r4 = "membership_approval_mode"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1553
            X.0pd r6 = r2.A05
            r5 = 1727(0x6bf, float:2.42E-42)
            X.0tM r4 = X.C16620tM.A02
            boolean r4 = r6.A0E(r4, r5)
            if (r4 == 0) goto L_0x145a
            com.whatsapp.jid.Jid r4 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r4)
            X.0sL r5 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r5)
            java.lang.String r4 = "group_join"
            java.util.List r7 = r1.A0O(r4)
            java.lang.String r6 = "triggered"
            r4 = r37
            java.lang.String r4 = r1.A0N(r6, r4)
            java.lang.String r1 = "server"
            boolean r6 = r1.equalsIgnoreCase(r4)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x145a
            int r4 = r7.size()
            r1 = 1
            if (r4 == r9) goto L_0x14cd
            r1 = 0
        L_0x14cd:
            X.AnonymousClass00B.A0G(r1)
            java.lang.Object r3 = r7.get(r3)
            X.1Vv r3 = (X.C28371Vv) r3
            java.lang.String r1 = "state"
            java.lang.String r3 = r3.A0M(r1)
            if (r6 == 0) goto L_0x14e0
            r0 = 0
        L_0x14e0:
            java.lang.String r1 = "on"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x1547
            X.0ul r3 = r2.A06
            r10 = 1
        L_0x14eb:
            X.0sO r1 = r3.A0a
            boolean r1 = r1.A0A(r5)
            if (r1 == 0) goto L_0x1544
            java.lang.String r7 = "admin"
        L_0x14f5:
            X.0sG r6 = r3.A0E
            X.0sH r4 = r6.A0A(r5)
            boolean r1 = r4.A0k
            if (r1 == r10) goto L_0x150b
            r4.A0k = r10
            X.18c r1 = r6.A06
            r1.A0J(r4)
            X.1kv r1 = r6.A04
            r1.A00(r4)
        L_0x150b:
            if (r10 != 0) goto L_0x1512
            X.18U r1 = r3.A0W
            r1.A02(r5)
        L_0x1512:
            r6 = 3021(0xbcd, float:4.233E-42)
            X.122 r4 = r3.A0y
            java.lang.String r3 = "SystemMessageFactory/newGroupMembershipApprovalModeChangeSystemMessage/gjid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r14 = 85
            if (r10 == 0) goto L_0x152d
            r14 = 84
        L_0x152d:
            r13 = r37
            r10 = r4
            r11 = r13
            r12 = r5
            r15 = r23
            X.1sE r1 = r10.A06(r11, r12, r13, r14, r15)
            X.1sF r1 = (X.C39301sF) r1
            r1.A0b(r0)
            r1.A00 = r7
            X.C17240ul.A01(r6, r1)
            goto L_0x145a
        L_0x1544:
            java.lang.String r7 = "regular"
            goto L_0x14f5
        L_0x1547:
            java.lang.String r1 = "off"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x2017
            X.0ul r3 = r2.A06
            r10 = 0
            goto L_0x14eb
        L_0x1553:
            java.lang.String r4 = "membership_approval_request"
            boolean r4 = X.C28371Vv.A07(r1, r4)
            if (r4 == 0) goto L_0x1654
            java.lang.String r5 = "notify"
            r4 = r37
            java.lang.String r6 = r6.A0N(r5, r4)
            X.0pd r7 = r2.A05
            r4 = 1727(0x6bf, float:2.42E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r4 = r7.A0E(r5, r4)
            if (r4 == 0) goto L_0x145a
            com.whatsapp.jid.Jid r4 = r8.A01
            X.0rv r4 = X.C16030sJ.A00(r4)
            X.0sL r12 = X.C16050sL.A03(r4)
            X.AnonymousClass00B.A06(r12)
            java.lang.String r4 = "request_method"
            java.lang.String r4 = r1.A0M(r4)
            java.lang.String r10 = "invite_link"
            boolean r1 = r10.equals(r4)
            if (r1 != 0) goto L_0x15a6
            java.lang.String r10 = "linked_group_join"
            boolean r1 = r10.equals(r4)
            if (r1 != 0) goto L_0x15a6
            java.lang.String r1 = "GroupNotificationHandler/handleGroupMembershipApprovalRequest/incorrect membership_approval_request.requestMethod="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x15a6:
            X.AnonymousClass00B.A06(r0)
            X.2BN r4 = new X.2BN
            r11 = r4
            r13 = r0
            r14 = r10
            r15 = r23
            r11.<init>(r12, r13, r14, r15)
            r1 = 1728(0x6c0, float:2.421E-42)
            boolean r1 = r7.A0E(r5, r1)
            if (r1 == 0) goto L_0x15d4
            r1 = 2376(0x948, float:3.33E-42)
            boolean r1 = r7.A0E(r5, r1)
            if (r1 == 0) goto L_0x15d4
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x15d4
            X.0sG r1 = r2.A01
            X.0sH r0 = r1.A0A(r0)
            r0.A0W = r6
            r1.A0L(r0)
        L_0x15d4:
            X.0ul r7 = r2.A06
            X.0sO r0 = r7.A0a
            X.0sL r6 = r4.A05
            boolean r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x145a
            X.0pd r1 = r7.A0f
            r0 = 1728(0x6c0, float:2.421E-42)
            boolean r0 = r1.A0E(r5, r0)
            if (r0 == 0) goto L_0x1621
            X.18U r1 = r7.A0W
            X.11X r0 = r1.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x1607 }
            X.0tf r5 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x1607 }
            X.AnonymousClass18U.A00(r4, r5)     // Catch:{ all -> 0x1600 }
            X.18N r0 = r1.A00     // Catch:{ all -> 0x1600 }
            r0.A04(r6)     // Catch:{ all -> 0x1600 }
            r0 = r37
            X.C41191vO.A00(r5, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x1607 }
            goto L_0x160b
        L_0x1600:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x1602 }
        L_0x1602:
            r0 = move-exception
            X.C41191vO.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x1607 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x1607 }
        L_0x1607:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x160b:
            X.0sG r5 = r7.A0E
            X.0sH r1 = r5.A0A(r6)
            boolean r0 = r1.A0e
            if (r0 == r3) goto L_0x1621
            r1.A0e = r3
            X.18c r0 = r5.A06
            r0.A0J(r1)
            X.1kv r0 = r5.A04
            r0.A00(r1)
        L_0x1621:
            r5 = 3020(0xbcc, float:4.232E-42)
            X.122 r3 = r7.A0y
            java.lang.String r1 = "SystemMessageFactory/newGroupMembershipApprovalRequestSystemMessage/groupjid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            long r0 = r4.A04
            r14 = 83
            r13 = r37
            r10 = r3
            r11 = r13
            r12 = r6
            r15 = r0
            X.1sE r1 = r10.A06(r11, r12, r13, r14, r15)
            X.1tk r1 = (X.C40211tk) r1
            com.whatsapp.jid.UserJid r0 = r4.A06
            r1.A0b(r0)
            java.lang.String r0 = r4.A07
            r1.A00 = r0
            X.C17240ul.A01(r5, r1)
            goto L_0x145a
        L_0x1654:
            java.lang.String r3 = "revoked_membership_requests"
            boolean r3 = X.C28371Vv.A07(r1, r3)
            if (r3 == 0) goto L_0x16a0
            X.0pd r4 = r2.A05
            r3 = 1728(0x6c0, float:2.421E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r4.A0E(r0, r3)
            if (r0 == 0) goto L_0x145a
            com.whatsapp.jid.Jid r0 = r8.A01
            X.0rv r0 = X.C16030sJ.A00(r0)
            X.0sL r5 = X.C16050sL.A03(r0)
            X.AnonymousClass00B.A06(r5)
            X.0so r0 = r2.A00
            java.util.Map r1 = X.C53262fQ.A06(r0, r1)
            X.0ul r4 = r2.A06
            X.0sO r0 = r4.A0a
            boolean r0 = r0.A0A(r5)
            if (r0 == 0) goto L_0x145a
            java.util.Set r0 = r1.keySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x168e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x145a
            java.lang.Object r1 = r3.next()
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.18U r0 = r4.A0W
            r0.A03(r5, r1)
            goto L_0x168e
        L_0x16a0:
            java.lang.String r3 = "member_add_mode"
            boolean r3 = X.C28371Vv.A07(r1, r3)
            if (r3 == 0) goto L_0x173b
            X.124 r3 = r2.A08
            r3.A02(r8)
            X.0pd r5 = r2.A05
            r4 = 1881(0x759, float:2.636E-42)
            X.0tM r3 = X.C16620tM.A02
            boolean r3 = r5.A0E(r3, r4)
            if (r3 == 0) goto L_0x00e0
            X.0ul r3 = r2.A06
            java.lang.String r2 = r1.A0L()
            java.lang.String r1 = "all_member_add"
            boolean r6 = r1.equals(r2)
            java.lang.String r1 = "groupmgr/onGroupMemberAddModeToggled/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r8)
            java.lang.String r1 = "/"
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            com.whatsapp.jid.Jid r1 = r8.A01
            X.0rv r1 = X.C16030sJ.A00(r1)
            X.0sL r5 = X.C16050sL.A03(r1)
            X.AnonymousClass00B.A06(r5)
            X.0sG r3 = r3.A0E
            X.0sH r1 = r3.A09(r5)
            if (r1 == 0) goto L_0x202e
            int r1 = r1.A03
            if (r1 == r6) goto L_0x202b
            java.lang.String r1 = "groupmgr/onGroupMemberAddModeToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0sH r2 = r3.A0A(r5)
            r2.A03 = r6
            X.18c r1 = r3.A06
            r1.A0J(r2)
            X.1kv r1 = r3.A04
            r1.A00(r2)
            r4 = 3022(0xbce, float:4.235E-42)
            r3 = 0
            if (r6 != r9) goto L_0x1712
            r3 = 1
        L_0x1712:
            java.lang.String r2 = "SystemMessageFactory/newGroupMemberAddModeModeChangeSystemMessage/gjid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r13 = 92
            if (r3 == 0) goto L_0x1729
            r13 = 91
        L_0x1729:
            X.1sE r1 = new X.1sE
            r10 = r1
            r11 = r37
            r12 = r8
            r14 = r23
            r10.<init>((X.C30361cE) r11, (X.C30641ci) r12, (int) r13, (long) r14)
        L_0x1734:
            r1.A0b(r0)
            X.C17240ul.A01(r4, r1)
            return r9
        L_0x173b:
            java.lang.String r0 = "GroupNotificationHandler/handleXmppMessage: unknown tag="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r1.A00
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x145a
        L_0x1750:
            java.lang.String r4 = "id"
            r0 = r37
            java.lang.String r0 = r6.A0N(r4, r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.AnonymousClass00B.A06(r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.0sL r7 = X.C16030sJ.A01(r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.AnonymousClass00B.A06(r7)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.lang.String r4 = "creator"
            X.0so r0 = r2.A00     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.jid.Jid r27 = r6.A0F(r0, r5, r4)     // Catch:{ 1W4 -> 0x1ecd }
            r4 = r27
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ 1W4 -> 0x1ecd }
            r27 = r4
            java.lang.String r4 = "creation"
            r5 = r37
            java.lang.String r12 = r6.A0N(r4, r5)     // Catch:{ 1W4 -> 0x1ecd }
            r4 = 0
            long r20 = X.C29501aj.A01(r12, r4)     // Catch:{ 1W4 -> 0x1ecd }
            r18 = 1000(0x3e8, double:4.94E-321)
            long r20 = r20 * r18
            java.lang.String r5 = "reason"
            r4 = r37
            java.lang.String r35 = r1.A0N(r5, r4)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "key"
            java.lang.String r14 = r1.A0N(r5, r4)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r4 = "new"
            boolean r26 = r4.equalsIgnoreCase(r11)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "subject"
            r4 = r37
            java.lang.String r28 = r6.A0N(r5, r4)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "s_t"
            java.lang.String r11 = r6.A0N(r5, r4)     // Catch:{ 1W4 -> 0x1ecd }
            r4 = 0
            long r16 = X.C29501aj.A01(r11, r4)     // Catch:{ 1W4 -> 0x1ecd }
            long r16 = r16 * r18
            java.lang.String r11 = "p_v_id"
            long r33 = r6.A0D(r11, r4)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r11 = "a_v_id"
            long r31 = r6.A0D(r11, r4)     // Catch:{ 1W4 -> 0x1ecd }
            r4 = r37
            java.lang.String r10 = r6.A0N(r10, r4)     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Map r30 = X.C53262fQ.A06(r0, r6)     // Catch:{ 1W4 -> 0x1ecd }
            int r22 = X.C53262fQ.A01(r6)     // Catch:{ 1W4 -> 0x1ecd }
            X.1jl r73 = X.C53262fQ.A05(r6)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "size"
            java.lang.String r4 = "0"
            java.lang.String r4 = r6.A0N(r5, r4)     // Catch:{ 1W4 -> 0x1ecd }
            X.AnonymousClass00B.A06(r4)     // Catch:{ 1W4 -> 0x1ecd }
            int r12 = java.lang.Integer.parseInt(r4)     // Catch:{ 1W4 -> 0x1ecd }
            X.0ul r4 = r2.A06     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "description"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            X.1cF r15 = X.C53262fQ.A04(r0, r6, r5)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "support"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r13 = 0
            if (r5 == 0) goto L_0x17f5
            r13 = 1
        L_0x17f5:
            java.lang.String r5 = "locked"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r11 = 0
            if (r5 == 0) goto L_0x17ff
            r11 = 1
        L_0x17ff:
            java.lang.String r5 = "announcement"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r47 = 0
            if (r5 == 0) goto L_0x180b
            r47 = 1
        L_0x180b:
            java.lang.String r5 = "no_frequently_forwarded"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r63 = 0
            if (r5 == 0) goto L_0x1817
            r63 = 1
        L_0x1817:
            java.lang.String r5 = "suspended"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r64 = 0
            if (r5 == 0) goto L_0x1824
            r64 = 1
        L_0x1824:
            int r5 = r30.size()     // Catch:{ 1W4 -> 0x1ecd }
            int r50 = java.lang.Math.max(r12, r5)     // Catch:{ 1W4 -> 0x1ecd }
            int r38 = X.C53262fQ.A02(r6)     // Catch:{ 1W4 -> 0x1ecd }
            X.0sL r67 = X.C53262fQ.A03(r0, r6)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "incognito"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r49 = 0
            if (r5 == 0) goto L_0x1840
            r49 = 1
        L_0x1840:
            boolean r12 = X.C53262fQ.A08(r6)     // Catch:{ 1W4 -> 0x1ecd }
            int r48 = X.C53262fQ.A00(r6)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "member_add_mode"
            X.1Vv r5 = r6.A0J(r5)     // Catch:{ 1W4 -> 0x1ecd }
            if (r5 == 0) goto L_0x1942
            java.lang.String r6 = r5.A0L()     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "all_member_add"
            boolean r57 = r5.equals(r6)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x185a:
            java.lang.Class<com.whatsapp.jid.GroupJid> r6 = com.whatsapp.jid.GroupJid.class
            java.lang.String r5 = "context_group_jid"
            com.whatsapp.jid.Jid r25 = r1.A0F(r0, r6, r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r25
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0     // Catch:{ 1W4 -> 0x1ecd }
            r25 = r0
            java.lang.String r36 = "groupmgr/onGroupNewGroup/"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r36
            r6.<init>(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r8)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "/"
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r14)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r27
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r20
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r28
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r16
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r10)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r33
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r35
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r13)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r11)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r47
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r22
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r38
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r49
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r12)     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r48
            r6.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r6.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r1.<init>()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r36
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r30
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r1.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r1.<init>()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r36
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r1.append(r15)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r1.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.0rt r0 = r4.A0R     // Catch:{ 1W4 -> 0x1ecd }
            r68 = r0
            boolean r0 = r0.A0F(r7)     // Catch:{ 1W4 -> 0x1ecd }
            r40 = r0 ^ 1
            X.0sK r0 = r4.A08     // Catch:{ 1W4 -> 0x1ecd }
            r78 = r0
            r1 = r0
            r0 = r27
            boolean r0 = r1.A0I(r0)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1946
            com.whatsapp.jid.UserJid r1 = r8.A00()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r78
            boolean r0 = r0.A0I(r1)     // Catch:{ 1W4 -> 0x1ecd }
            r10 = 1
            if (r0 != 0) goto L_0x1947
            goto L_0x1946
        L_0x1942:
            r57 = 0
            goto L_0x185a
        L_0x1946:
            r10 = 0
        L_0x1947:
            com.whatsapp.jid.UserJid r0 = r8.A00()     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x195b
            com.whatsapp.jid.UserJid r1 = r8.A00()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r30
            boolean r0 = r0.containsKey(r1)     // Catch:{ 1W4 -> 0x1ecd }
            r39 = 1
            if (r0 == 0) goto L_0x195d
        L_0x195b:
            r39 = 0
        L_0x195d:
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ new:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r1.<init>(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r40
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " mecreator:"
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r1.append(r10)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " numberchange:"
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r39
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r1.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.util.HashMap r46 = new java.util.HashMap     // Catch:{ 1W4 -> 0x1ecd }
            r46.<init>()     // Catch:{ 1W4 -> 0x1ecd }
            r70 = 0
            if (r10 == 0) goto L_0x19a5
            boolean r0 = android.text.TextUtils.isEmpty(r14)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x199d
            X.AnonymousClass00B.A06(r28)     // Catch:{ 1W4 -> 0x1ecd }
            r1 = r78
            r0 = r28
            X.1WP r6 = X.AnonymousClass1WP.A03(r1, r0)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x19a1
        L_0x199d:
            X.1WP r6 = X.AnonymousClass1WP.A04(r14)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x19a1:
            if (r6 != 0) goto L_0x19a7
            r6 = 0
            goto L_0x19a7
        L_0x19a5:
            r6 = r37
        L_0x19a7:
            boolean r0 = r30.isEmpty()     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != 0) goto L_0x19b4
            X.0vL r1 = r4.A0u     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r30
            r1.A00(r0)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x19b4:
            if (r6 == 0) goto L_0x1bb7
            r0 = r68
            boolean r0 = r0.A0F(r6)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1bb7
            X.0sO r0 = r4.A0a     // Catch:{ 1W4 -> 0x1ecd }
            r43 = r0
            X.0us r12 = r0.A07     // Catch:{ 1W4 -> 0x1ecd }
            X.1cE r45 = r12.A04(r6)     // Catch:{ 1W4 -> 0x1ecd }
            X.11H r0 = r4.A0U     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r15 = "_id IN (   SELECT _id   FROM deleted_messages_ids_view   WHERE chat_row_id = ?)"
            java.lang.String[] r11 = new java.lang.String[r9]     // Catch:{ 1W4 -> 0x1ecd }
            X.0ts r14 = r0.A01     // Catch:{ 1W4 -> 0x1ecd }
            long r41 = r14.A02(r6)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r1 = java.lang.String.valueOf(r41)     // Catch:{ 1W4 -> 0x1ecd }
            r11[r3] = r1     // Catch:{ 1W4 -> 0x1ecd }
            X.0tq r0 = r0.A05     // Catch:{ 1W4 -> 0x1ecd }
            r42 = r0
            X.0tf r13 = r42.A02()     // Catch:{ 1W4 -> 0x1ecd }
            X.1cj r41 = r13.A00()     // Catch:{ all -> 0x1bb2 }
            X.0tg r1 = r13.A02     // Catch:{ all -> 0x1bad }
            java.lang.String r0 = "message"
            r1.A01(r0, r15, r11)     // Catch:{ all -> 0x1bad }
            r42.A04()     // Catch:{ all -> 0x1bad }
            r0 = r42
            X.1jC r0 = r0.A04     // Catch:{ all -> 0x1bad }
            boolean r0 = r0.A0D(r13)     // Catch:{ all -> 0x1bad }
            if (r0 == 0) goto L_0x19ff
            java.lang.String r0 = "messages"
            r1.A01(r0, r15, r11)     // Catch:{ all -> 0x1bad }
        L_0x19ff:
            r14.A0F(r6)     // Catch:{ all -> 0x1bad }
            r41.A00()     // Catch:{ all -> 0x1bad }
            r41.close()     // Catch:{ all -> 0x1bb2 }
            r13.close()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r43
            X.0tq r0 = r0.A06     // Catch:{ 1W4 -> 0x1ecd }
            X.0tf r44 = r0.A02()     // Catch:{ 1W4 -> 0x1ecd }
            X.1cj r43 = r44.A00()     // Catch:{ all -> 0x1ba8 }
            java.lang.String r1 = "participant-user-store/updateTempGroup/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ba3 }
            r0.<init>(r1)     // Catch:{ all -> 0x1ba3 }
            r0.append(r6)     // Catch:{ all -> 0x1ba3 }
            r0.append(r5)     // Catch:{ all -> 0x1ba3 }
            r0.append(r7)     // Catch:{ all -> 0x1ba3 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x1ba3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1ba3 }
            X.0tq r0 = r12.A09     // Catch:{ all -> 0x1ba3 }
            X.0tf r13 = r0.A02()     // Catch:{ all -> 0x1ba3 }
            X.14v r0 = r12.A08     // Catch:{ all -> 0x1b9e }
            long r41 = r0.A01(r6)     // Catch:{ all -> 0x1b9e }
            long r14 = r0.A01(r7)     // Catch:{ all -> 0x1b9e }
            java.lang.String[] r11 = new java.lang.String[r9]     // Catch:{ all -> 0x1b9e }
            java.lang.String r0 = java.lang.Long.toString(r41)     // Catch:{ all -> 0x1b9e }
            r11[r3] = r0     // Catch:{ all -> 0x1b9e }
            r0 = 2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x1b9e }
            r5.<init>(r0)     // Catch:{ all -> 0x1b9e }
            java.lang.String r1 = "group_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x1b9e }
            r5.put(r1, r0)     // Catch:{ all -> 0x1b9e }
            java.lang.String r0 = "pending"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x1b9e }
            r5.put(r0, r1)     // Catch:{ all -> 0x1b9e }
            X.0tg r3 = r13.A02     // Catch:{ all -> 0x1b9e }
            java.lang.String r1 = "group_participant_user"
            java.lang.String r0 = "group_jid_row_id = ?"
            r3.A00(r1, r5, r0, r11)     // Catch:{ all -> 0x1b9e }
            r13.close()     // Catch:{ all -> 0x1ba3 }
            X.11J r0 = r12.A07     // Catch:{ all -> 0x1ba3 }
            java.util.concurrent.ConcurrentHashMap r0 = r0.A03     // Catch:{ all -> 0x1ba3 }
            r0.remove(r6)     // Catch:{ all -> 0x1ba3 }
            r43.A00()     // Catch:{ all -> 0x1ba3 }
            r43.close()     // Catch:{ all -> 0x1ba8 }
            r44.close()     // Catch:{ 1W4 -> 0x1ecd }
            android.os.Handler r3 = X.C17240ul.A15     // Catch:{ 1W4 -> 0x1ecd }
            r1 = 43
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5     // Catch:{ 1W4 -> 0x1ecd }
            r0.<init>(r4, r1, r6)     // Catch:{ 1W4 -> 0x1ecd }
            r3.post(r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.0sG r3 = r4.A0E     // Catch:{ 1W4 -> 0x1ecd }
            X.0sH r11 = r3.A0A(r6)     // Catch:{ 1W4 -> 0x1ecd }
            r78.A0B()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r78
            X.1ZT r0 = r0.A05     // Catch:{ 1W4 -> 0x1ecd }
            r11.A0F = r0     // Catch:{ 1W4 -> 0x1ecd }
            X.18c r5 = r3.A06     // Catch:{ 1W4 -> 0x1ecd }
            X.1Zf r13 = new X.1Zf     // Catch:{ 1W4 -> 0x1ecd }
            r13.<init>((boolean) r9)     // Catch:{ 1W4 -> 0x1ecd }
            r13.A03()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = 3
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ 1W4 -> 0x1ecd }
            r1.<init>(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r12 = r7.getRawString()     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = "jid"
            r1.put(r0, r12)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r12 = "display_name"
            r0 = r28
            r1.put(r12, r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r12 = java.lang.Long.toString(r20)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = "phone_label"
            r1.put(r0, r12)     // Catch:{ 1W4 -> 0x1ecd }
            X.0rv r0 = r11.A0E     // Catch:{ 1W4 -> 0x1ecd }
            r5.A0D(r1, r0)     // Catch:{ 1W4 -> 0x1ecd }
            r5.A0L(r11, r7)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = "updated temp group subject="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r5.<init>(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r28
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " creationTime="
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r20
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " oldJid="
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.0rv r0 = r11.A0E     // Catch:{ 1W4 -> 0x1ecd }
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " newJid="
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r5.append(r7)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " | time: "
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            long r0 = r13.A00()     // Catch:{ 1W4 -> 0x1ecd }
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r5.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            X.1kv r0 = r3.A04     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Class<X.1WP> r1 = X.AnonymousClass1WP.class
            com.whatsapp.jid.Jid r1 = r11.A08(r1)     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Map r0 = r0.A01     // Catch:{ 1W4 -> 0x1ecd }
            r0.remove(r1)     // Catch:{ 1W4 -> 0x1ecd }
            r0.remove(r7)     // Catch:{ 1W4 -> 0x1ecd }
            r3.A0A(r7)     // Catch:{ 1W4 -> 0x1ecd }
            X.0rs r5 = r4.A0K     // Catch:{ 1W4 -> 0x1ecd }
            X.0rt r0 = r5.A00     // Catch:{ 1W4 -> 0x1ecd }
            r0.A0C()     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = "conversationsmgr/replacecontact:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r1.<init>(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r1.append(r6)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = " -> "
            r1.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r1.append(r7)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r1.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r23
            r5.A0D(r6, r7, r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Set r0 = r30.entrySet()     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1b42:
            boolean r0 = r6.hasNext()     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1c0f
            java.lang.Object r1 = r6.next()     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r5 = r1.getKey()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r45
            X.1ck r0 = r0.A05(r5)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != 0) goto L_0x1b42
            java.lang.Object r5 = r1.getKey()     // Catch:{ 1W4 -> 0x1ecd }
            X.0rv r5 = (X.C15830rv) r5     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r78
            boolean r0 = r0.A0I(r5)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != 0) goto L_0x1b42
            java.lang.String r0 = "groupmgr/onGroupNewGroup/ identified new participant:"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r5.<init>(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r0 = r1.getKey()     // Catch:{ 1W4 -> 0x1ecd }
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r5.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r0 = r1.getValue()     // Catch:{ 1W4 -> 0x1ecd }
            X.2Bb r0 = (X.AnonymousClass2Bb) r0     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r0.A03     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1b42
            java.lang.Object r5 = r1.getKey()     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r0 = r1.getValue()     // Catch:{ 1W4 -> 0x1ecd }
            X.2Bb r0 = (X.AnonymousClass2Bb) r0     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r1 = r0.A03     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r46
            r0.put(r5, r1)     // Catch:{ 1W4 -> 0x1ecd }
            r6.remove()     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1b42
        L_0x1b9e:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x1ba2 }
        L_0x1ba2:
            throw r0     // Catch:{ all -> 0x1ba3 }
        L_0x1ba3:
            r0 = move-exception
            r43.close()     // Catch:{ all -> 0x1ba7 }
        L_0x1ba7:
            throw r0     // Catch:{ all -> 0x1ba8 }
        L_0x1ba8:
            r0 = move-exception
            r44.close()     // Catch:{ all -> 0x1bb6 }
            goto L_0x1bb6
        L_0x1bad:
            r0 = move-exception
            r41.close()     // Catch:{ all -> 0x1bb1 }
        L_0x1bb1:
            throw r0     // Catch:{ all -> 0x1bb2 }
        L_0x1bb2:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x1bb6 }
        L_0x1bb6:
            throw r0     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1bb7:
            X.0sG r3 = r4.A0E     // Catch:{ 1W4 -> 0x1ecd }
            X.0sH r5 = r3.A08(r7)     // Catch:{ 1W4 -> 0x1ecd }
            if (r5 != 0) goto L_0x1be0
            X.0sH r0 = new X.0sH     // Catch:{ 1W4 -> 0x1ecd }
            r0.<init>(r7)     // Catch:{ 1W4 -> 0x1ecd }
            r51 = r3
            r52 = r0
            r53 = r27
            r54 = r15
            r55 = r28
            r56 = r22
            r58 = r20
            r60 = r13
            r61 = r11
            r62 = r47
            r65 = r49
            r66 = r12
            r51.A0P(r52, r53, r54, r55, r56, r57, r58, r60, r61, r62, r63, r64, r65, r66)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1c0f
        L_0x1be0:
            X.12B r6 = r4.A0v     // Catch:{ 1W4 -> 0x1ecd }
            int r1 = r5.A05     // Catch:{ 1W4 -> 0x1ecd }
            r0 = 2
            r6.A01(r7, r1, r0)     // Catch:{ 1W4 -> 0x1ecd }
            r51 = r4
            r52 = r5
            r53 = r27
            r54 = r15
            r55 = r28
            r56 = r20
            r58 = r13
            r59 = r11
            r60 = r47
            r61 = r63
            r62 = r64
            r63 = r49
            r64 = r12
            boolean r0 = r51.A0i(r52, r53, r54, r55, r56, r58, r59, r60, r61, r62, r63, r64)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1c0f
            r0 = r22
            r5.A01 = r0     // Catch:{ 1W4 -> 0x1ecd }
            r3.A0M(r5)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1c0f:
            r1 = 3
            r0 = r38
            if (r0 != r1) goto L_0x1c1b
            r0 = 1
            r1 = r50
            r4.A0O(r7, r1)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1c4d
        L_0x1c1b:
            r0 = 0
            r11 = 1
            r1 = r38
            if (r1 != r9) goto L_0x1c4d
            r1 = r68
            X.0rx r1 = r1.A06(r7)     // Catch:{ 1W4 -> 0x1ecd }
            if (r1 == 0) goto L_0x1c39
            X.0uk r6 = r4.A0B     // Catch:{ 1W4 -> 0x1ecd }
            r1 = r68
            X.0rx r5 = r1.A06(r7)     // Catch:{ 1W4 -> 0x1ecd }
            if (r5 == 0) goto L_0x1c4d
            r1 = r48
            if (r1 == r9) goto L_0x1c46
            r11 = 0
            goto L_0x1c46
        L_0x1c39:
            if (r40 == 0) goto L_0x1c4d
            r1 = r48
            if (r1 == r9) goto L_0x1c40
            r11 = 0
        L_0x1c40:
            X.17D r1 = r4.A0C     // Catch:{ 1W4 -> 0x1ecd }
            r1.A02(r7, r11)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1c4d
        L_0x1c46:
            r5.A0g = r11     // Catch:{ 1W4 -> 0x1ecd }
            X.15m r1 = r6.A07     // Catch:{ 1W4 -> 0x1ecd }
            r1.A00(r5)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1c4d:
            r50 = r4
            r51 = r67
            r52 = r7
            r53 = r28
            r54 = r38
            r55 = r16
            r57 = r0
            r50.A0Q(r51, r52, r53, r54, r55, r57)     // Catch:{ 1W4 -> 0x1ecd }
            X.0sO r1 = r4.A0a     // Catch:{ 1W4 -> 0x1ecd }
            X.0us r1 = r1.A07     // Catch:{ 1W4 -> 0x1ecd }
            X.1cE r1 = r1.A04(r7)     // Catch:{ 1W4 -> 0x1ecd }
            boolean r5 = r1.A05     // Catch:{ 1W4 -> 0x1ecd }
            if (r5 != 0) goto L_0x1c70
            if (r0 == 0) goto L_0x1c70
            if (r49 == 0) goto L_0x1c70
            r1.A05 = r9     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1c70:
            java.lang.String r5 = "groupmgr/onGroupNewGroup oldparticipants:"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r6.<init>(r5)     // Catch:{ 1W4 -> 0x1ecd }
            X.0uz r5 = r1.A02()     // Catch:{ 1W4 -> 0x1ecd }
            r6.append(r5)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = r6.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 1W4 -> 0x1ecd }
            r5 = r78
            boolean r15 = r1.A0M(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r51 = 2
            if (r47 == 0) goto L_0x1c95
            boolean r5 = r1.A0N(r5)     // Catch:{ 1W4 -> 0x1ecd }
            if (r5 == 0) goto L_0x1c9b
        L_0x1c95:
            boolean r5 = r4.A13     // Catch:{ 1W4 -> 0x1ecd }
            r57 = 1
            if (r5 == 0) goto L_0x1c9d
        L_0x1c9b:
            r57 = 0
        L_0x1c9d:
            r54 = 0
            r55 = 0
            r56 = 1
            r47 = r4
            r48 = r1
            r49 = r37
            r50 = r30
            r52 = r33
            r47.A02(r48, r49, r50, r51, r52, r54, r55, r56, r57)     // Catch:{ 1W4 -> 0x1ecd }
            X.0sP r5 = r4.A0G     // Catch:{ 1W4 -> 0x1ecd }
            r5.A0P(r7)     // Catch:{ 1W4 -> 0x1ecd }
            if (r40 == 0) goto L_0x1d48
            boolean r0 = r4.A0q(r7, r0)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1cd6
            X.18M r0 = r4.A0g     // Catch:{ 1W4 -> 0x1ecd }
            X.122 r5 = r4.A0y     // Catch:{ 1W4 -> 0x1ecd }
            r51 = 99
            r50 = r37
            r47 = r5
            r48 = r37
            r49 = r7
            r52 = r23
            X.1sE r5 = r47.A06(r48, r49, r50, r51, r52)     // Catch:{ 1W4 -> 0x1ecd }
            X.0t6 r0 = r0.A01     // Catch:{ 1W4 -> 0x1ecd }
            r0.A0W(r5)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1cd6:
            X.18M r5 = r4.A0g     // Catch:{ 1W4 -> 0x1ecd }
            X.122 r0 = r4.A0y     // Catch:{ 1W4 -> 0x1ecd }
            r51 = 11
            r54 = r37
            r47 = r0
            r48 = r37
            r49 = r7
            r50 = r8
            r52 = r20
            X.1sE r6 = r47.A06(r48, r49, r50, r51, r52)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r28
            r6.A0k(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r27
            r6.A0b(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r5.A00(r6, r9)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r5 = "linked_group_join"
            r0 = r35
            boolean r6 = r5.equals(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r5 = 79
            r0 = 75
            if (r6 == 0) goto L_0x1d09
            r0 = 79
        L_0x1d09:
            if (r67 == 0) goto L_0x1d1a
            X.1sW r54 = new X.1sW     // Catch:{ 1W4 -> 0x1ecd }
            r50 = 1
            r51 = 0
            r47 = r54
            r48 = r67
            r49 = r29
            r47.<init>(r48, r49, r50, r51)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1d1a:
            X.1sW r53 = new X.1sW     // Catch:{ 1W4 -> 0x1ecd }
            r47 = r53
            r48 = r7
            r49 = r28
            r50 = r38
            r51 = r16
            r47.<init>(r48, r49, r50, r51)     // Catch:{ 1W4 -> 0x1ecd }
            r52 = r4
            r55 = r27
            r56 = r0
            r57 = r20
            r52.A0H(r53, r54, r55, r56, r57)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != r5) goto L_0x1d45
            X.11H r0 = r4.A0U     // Catch:{ 1W4 -> 0x1ecd }
            r71 = r0
            r72 = r7
            r74 = r28
            r75 = r38
            r76 = r20
            r71.A01(r72, r73, r74, r75, r76)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1d45:
            if (r10 == 0) goto L_0x1dd8
            goto L_0x1d55
        L_0x1d48:
            if (r10 != 0) goto L_0x1d55
            r0 = r68
            X.0rx r0 = r0.A06(r7)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != 0) goto L_0x1daa
            r5 = r37
            goto L_0x1dac
        L_0x1d55:
            boolean r0 = r46.isEmpty()     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != 0) goto L_0x1dd8
            java.util.Set r0 = r46.entrySet()     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1d63:
            boolean r0 = r14.hasNext()     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1d92
            java.lang.Object r0 = r14.next()     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r13 = r0.getKey()     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r12 = r0.getKey()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Object r11 = r0.getValue()     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ 1W4 -> 0x1ecd }
            X.AnonymousClass00B.A06(r12)     // Catch:{ 1W4 -> 0x1ecd }
            X.AnonymousClass00B.A06(r11)     // Catch:{ 1W4 -> 0x1ecd }
            r6 = r37
            X.2Bb r5 = new X.2Bb     // Catch:{ 1W4 -> 0x1ecd }
            r5.<init>(r6, r12, r11, r6)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r30
            r0.put(r13, r5)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1d63
        L_0x1d92:
            r45 = 2
            r48 = 1
            r49 = 0
            r50 = 0
            r51 = 0
            r41 = r4
            r42 = r1
            r43 = r37
            r44 = r30
            r46 = r33
            r41.A02(r42, r43, r44, r45, r46, r48, r49, r50, r51)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1dd8
        L_0x1daa:
            X.1jl r5 = r0.A0a     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1dac:
            X.16n r0 = r4.A0o     // Catch:{ 1W4 -> 0x1ecd }
            X.0t3 r6 = r4.A0L     // Catch:{ 1W4 -> 0x1ecd }
            long r45 = r6.A00()     // Catch:{ 1W4 -> 0x1ecd }
            r41 = r0
            r42 = r7
            r43 = r5
            r44 = r73
            X.1WU r6 = r41.A00(r42, r43, r44, r45)     // Catch:{ 1W4 -> 0x1ecd }
            if (r6 == 0) goto L_0x1dc9
            X.18M r5 = r4.A0g     // Catch:{ 1W4 -> 0x1ecd }
            r0 = 8
            r5.A00(r6, r0)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1dc9:
            X.11H r0 = r4.A0U     // Catch:{ 1W4 -> 0x1ecd }
            r71 = r0
            r72 = r7
            r74 = r28
            r75 = r38
            r76 = r20
            r71.A01(r72, r73, r74, r75, r76)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1dd8:
            r78.A0B()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r78
            X.1ZT r5 = r0.A05     // Catch:{ 1W4 -> 0x1ecd }
            X.AnonymousClass00B.A06(r5)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r30
            boolean r0 = r0.containsKey(r5)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 != 0) goto L_0x1df6
            X.1ZX r5 = r78.A03()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r30
            boolean r0 = r0.containsKey(r5)     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1e3c
        L_0x1df6:
            if (r10 != 0) goto L_0x1e3c
            if (r15 != 0) goto L_0x1e3c
            if (r39 != 0) goto L_0x1e3c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 1W4 -> 0x1ecd }
            r5.<init>()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r36
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r78.A0B()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r78
            X.1ZT r0 = r0.A05     // Catch:{ 1W4 -> 0x1ecd }
            r5.append(r0)     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.String r0 = r5.toString()     // Catch:{ 1W4 -> 0x1ecd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1W4 -> 0x1ecd }
            if (r40 != 0) goto L_0x1e1b
            r70 = r8
        L_0x1e1b:
            com.whatsapp.jid.UserJid r69 = r8.A00()     // Catch:{ 1W4 -> 0x1ecd }
            r78.A0B()     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r78
            X.1ZT r0 = r0.A05     // Catch:{ 1W4 -> 0x1ecd }
            java.util.List r72 = java.util.Collections.singletonList(r0)     // Catch:{ 1W4 -> 0x1ecd }
            r75 = 0
            r64 = r4
            r65 = r37
            r66 = r25
            r68 = r7
            r71 = r35
            r73 = r23
            r64.A0F(r65, r66, r67, r68, r69, r70, r71, r72, r73, r75)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1e43
        L_0x1e3c:
            if (r40 != 0) goto L_0x1e43
            X.124 r0 = r4.A0s     // Catch:{ 1W4 -> 0x1ecd }
            r0.A02(r8)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1e43:
            r0 = 3017(0xbc9, float:4.228E-42)
            if (r22 <= 0) goto L_0x1e6c
            if (r26 == 0) goto L_0x1e6c
            if (r10 == 0) goto L_0x1e85
            if (r39 != 0) goto L_0x1e9f
            r5 = r22
            r3.A0R(r7, r5)     // Catch:{ 1W4 -> 0x1ecd }
            X.122 r5 = r4.A0y     // Catch:{ 1W4 -> 0x1ecd }
            r78.A0B()     // Catch:{ 1W4 -> 0x1ecd }
            r3 = r78
            X.1ZT r3 = r3.A05     // Catch:{ 1W4 -> 0x1ecd }
            r38 = r5
            r39 = r7
            r40 = r3
            r41 = r37
            r42 = r22
            r43 = r23
            X.1WU r3 = r38.A04(r39, r40, r41, r42, r43)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1e9c
        L_0x1e6c:
            if (r10 != 0) goto L_0x1e9f
            if (r22 <= 0) goto L_0x1e9f
            if (r15 != 0) goto L_0x1e9f
            if (r39 != 0) goto L_0x1e9f
            X.122 r3 = r4.A0y     // Catch:{ 1W4 -> 0x1ecd }
            r38 = r37
            r35 = r3
            r36 = r7
            r39 = r22
            r40 = r23
            X.1WU r3 = r35.A04(r36, r37, r38, r39, r40)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1e9c
        L_0x1e85:
            r5 = r22
            r3.A0R(r7, r5)     // Catch:{ 1W4 -> 0x1ecd }
            X.122 r3 = r4.A0y     // Catch:{ 1W4 -> 0x1ecd }
            r38 = r3
            r39 = r7
            r40 = r27
            r41 = r37
            r42 = r5
            r43 = r23
            X.1WU r3 = r38.A04(r39, r40, r41, r42, r43)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1e9c:
            X.C17240ul.A01(r0, r3)     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1e9f:
            X.18N r0 = r4.A0i     // Catch:{ 1W4 -> 0x1ecd }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ 1W4 -> 0x1ecd }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ 1W4 -> 0x1ecd }
        L_0x1ea9:
            boolean r0 = r3.hasNext()     // Catch:{ 1W4 -> 0x1ecd }
            if (r0 == 0) goto L_0x1eb9
            java.lang.Object r0 = r3.next()     // Catch:{ 1W4 -> 0x1ecd }
            X.2fR r0 = (X.C53272fR) r0     // Catch:{ 1W4 -> 0x1ecd }
            r0.A00(r1, r7)     // Catch:{ 1W4 -> 0x1ecd }
            goto L_0x1ea9
        L_0x1eb9:
            X.18S r3 = r2.A04     // Catch:{ 1W4 -> 0x1ecd }
            long r16 = r16 / r18
            r0 = r16
            r3.A03(r7, r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r31
            r3.A00(r7, r0)     // Catch:{ 1W4 -> 0x1ecd }
            r0 = r33
            r3.A02(r7, r0)     // Catch:{ 1W4 -> 0x1ecd }
            return r9
        L_0x1ecd:
            r1 = move-exception
            java.lang.String r0 = "GroupNotificationHandler/handleCreate/invalid-jid"
            com.whatsapp.util.Log.w(r0, r1)
            X.0so r2 = r2.A00
            java.lang.String r1 = "GroupNotificationHandler/handleCreate"
            java.lang.String r0 = "invalid-jid-received"
            r2.AcB(r1, r0, r9)
            return r9
        L_0x1edd:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x1ee1 }
        L_0x1ee1:
            throw r0     // Catch:{ all -> 0x1ee2 }
        L_0x1ee2:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x1ef0 }
            throw r0
        L_0x1ee7:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x1eeb }
        L_0x1eeb:
            throw r0     // Catch:{ all -> 0x1eec }
        L_0x1eec:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x1ef0 }
        L_0x1ef0:
            throw r0
        L_0x1ef1:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x1ef1 }
            throw r0
        L_0x1ef4:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x1ef4 }
            throw r0
        L_0x1ef7:
            java.lang.String r0 = "GroupChatManager/onGroupNewInviteCode received invite code for non-permanent group jid"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r9
        L_0x1efd:
            java.lang.String r0 = "groupmgr/onGroupNewDescription/new group"
            goto L_0x2033
        L_0x1f01:
            com.whatsapp.jid.Jid r11 = r8.A01     // Catch:{ all -> 0x2011 }
            X.0rv r3 = X.C16030sJ.A00(r11)     // Catch:{ all -> 0x2011 }
            X.0sL r10 = X.C16050sL.A03(r3)     // Catch:{ all -> 0x2011 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x2011 }
            java.lang.String r5 = "v_id"
            r3 = 0
            long r3 = r1.A0D(r5, r3)     // Catch:{ all -> 0x2011 }
            X.18S r7 = r2.A04     // Catch:{ all -> 0x2011 }
            X.191 r6 = r7.A00     // Catch:{ all -> 0x2011 }
            java.util.Map r1 = r6.A02     // Catch:{ all -> 0x2011 }
            monitor-enter(r1)     // Catch:{ all -> 0x2011 }
            java.lang.Object r5 = r1.get(r10)     // Catch:{ all -> 0x200e }
            X.1sl r5 = (X.C39611sl) r5     // Catch:{ all -> 0x200e }
            if (r5 != 0) goto L_0x1f2a
            X.1sl r5 = r6.A00(r10)     // Catch:{ all -> 0x200e }
        L_0x1f2a:
            long r5 = r5.A00     // Catch:{ all -> 0x200e }
            monitor-exit(r1)     // Catch:{ all -> 0x200e }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x1feb
            X.0ul r6 = r2.A06     // Catch:{ all -> 0x2011 }
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled/"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x2011 }
            r5.<init>(r1)     // Catch:{ all -> 0x2011 }
            r5.append(r8)     // Catch:{ all -> 0x2011 }
            java.lang.String r1 = "/"
            r5.append(r1)     // Catch:{ all -> 0x2011 }
            r5.append(r12)     // Catch:{ all -> 0x2011 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x2011 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x2011 }
            X.0rv r1 = X.C16030sJ.A00(r11)     // Catch:{ all -> 0x2011 }
            X.0sL r5 = X.C16050sL.A03(r1)     // Catch:{ all -> 0x2011 }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x2011 }
            X.0sG r13 = r6.A0E     // Catch:{ all -> 0x2011 }
            X.0sH r1 = r13.A09(r5)     // Catch:{ all -> 0x2011 }
            if (r1 == 0) goto L_0x1fd7
            boolean r1 = r1.A0Y     // Catch:{ all -> 0x2011 }
            if (r1 == r12) goto L_0x1fdd
            java.lang.String r1 = "groupmgr/onGroupAnnouncementsToggled/changed"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x2011 }
            X.0sH r11 = r13.A0A(r5)     // Catch:{ all -> 0x2011 }
            boolean r1 = r11.A0Y     // Catch:{ all -> 0x2011 }
            if (r1 == r12) goto L_0x1f7c
            r11.A0Y = r12     // Catch:{ all -> 0x2011 }
            X.18c r1 = r13.A06     // Catch:{ all -> 0x2011 }
            r1.A0J(r11)     // Catch:{ all -> 0x2011 }
            X.1kv r1 = r13.A04     // Catch:{ all -> 0x2011 }
            r1.A00(r11)     // Catch:{ all -> 0x2011 }
        L_0x1f7c:
            X.18M r11 = r6.A0g     // Catch:{ all -> 0x2011 }
            X.122 r1 = r6.A0y     // Catch:{ all -> 0x2011 }
            r17 = 32
            if (r12 == 0) goto L_0x1f86
            r17 = 31
        L_0x1f86:
            r13 = r1
            r14 = r37
            r15 = r5
            r16 = r8
            r18 = r23
            X.1sE r1 = r13.A06(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x2011 }
            r1.A0b(r0)     // Catch:{ all -> 0x2011 }
            r0 = 3009(0xbc1, float:4.217E-42)
            r11.A00(r1, r0)     // Catch:{ all -> 0x2011 }
            if (r12 != 0) goto L_0x1fe7
            X.0sO r0 = r6.A0a     // Catch:{ all -> 0x2011 }
            int r12 = r0.A01(r5)     // Catch:{ all -> 0x2011 }
            X.0rt r0 = r6.A0R     // Catch:{ all -> 0x2011 }
            int r11 = r0.A02(r5)     // Catch:{ all -> 0x2011 }
            X.0pd r8 = r6.A0f     // Catch:{ all -> 0x2011 }
            r0 = 934(0x3a6, float:1.309E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x2011 }
            int r0 = r8.A03(r1, r0)     // Catch:{ all -> 0x2011 }
            if (r12 < r0) goto L_0x1fe7
            r0 = 1946(0x79a, float:2.727E-42)
            int r0 = r8.A03(r1, r0)     // Catch:{ all -> 0x2011 }
            if (r12 > r0) goto L_0x1fe7
            if (r11 == r9) goto L_0x1fe7
            X.0t6 r11 = r6.A0T     // Catch:{ all -> 0x2011 }
            X.17g r8 = r6.A0x     // Catch:{ all -> 0x2011 }
            X.0t3 r0 = r6.A0L     // Catch:{ all -> 0x2011 }
            long r0 = r0.A00()     // Catch:{ all -> 0x2011 }
            X.18b r6 = r8.A05     // Catch:{ all -> 0x2011 }
            X.1Vw r6 = r6.A02(r5, r9)     // Catch:{ all -> 0x2011 }
            X.1rx r5 = new X.1rx     // Catch:{ all -> 0x2011 }
            r5.<init>(r6, r0)     // Catch:{ all -> 0x2011 }
            r11.A0W(r5)     // Catch:{ all -> 0x2011 }
            goto L_0x1fe7
        L_0x1fd7:
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/new group"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2011 }
            goto L_0x1fe7
        L_0x1fdd:
            java.lang.String r0 = "groupmgr/onGroupAnnouncementsToggled/did not change"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x2011 }
            X.124 r0 = r6.A0s     // Catch:{ all -> 0x2011 }
            r0.A02(r8)     // Catch:{ all -> 0x2011 }
        L_0x1fe7:
            r7.A00(r10, r3)     // Catch:{ all -> 0x2011 }
            goto L_0x200c
        L_0x1feb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x2011 }
            r1.<init>()     // Catch:{ all -> 0x2011 }
            java.lang.String r0 = "GroupNotificationHandler/handleAnnouncement/old version, gjid="
            r1.append(r0)     // Catch:{ all -> 0x2011 }
            r1.append(r10)     // Catch:{ all -> 0x2011 }
            java.lang.String r0 = "; version="
            r1.append(r0)     // Catch:{ all -> 0x2011 }
            r1.append(r3)     // Catch:{ all -> 0x2011 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x2011 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x2011 }
            X.124 r0 = r2.A08     // Catch:{ all -> 0x2011 }
            r0.A02(r8)     // Catch:{ all -> 0x2011 }
        L_0x200c:
            monitor-exit(r2)
            return r9
        L_0x200e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x200e }
            throw r0     // Catch:{ all -> 0x2011 }
        L_0x2011:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x2014:
            java.lang.String r0 = "groupmgr/onGroupNoFrequentlyForwardedToggled/new group"
            goto L_0x2033
        L_0x2017:
            java.lang.String r1 = "GroupNotificationHandler/handleGroupMembershipApprovalModeChange/incorrect group_join.state="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            X.1W9 r0 = new X.1W9
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x202b:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/did not change"
            goto L_0x2033
        L_0x202e:
            java.lang.String r0 = "groupmgr/onGroupMemberAddModeToggled/new group"
            goto L_0x2033
        L_0x2031:
            java.lang.String r0 = "groupmgr/onGroupRestrictModeToggled/new group"
        L_0x2033:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27791Td.AHS(android.os.Message, int):boolean");
    }
}
