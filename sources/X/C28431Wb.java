package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1Wb  reason: invalid class name and case insensitive filesystem */
public class C28431Wb extends C20380zx {
    public Runnable A00;
    public List A01 = new ArrayList();
    public final C16040sK A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final C19230xz A05;
    public final AnonymousClass11R A06;
    public final C16440t3 A07;
    public final C16070sO A08;
    public final C17580vJ A09;
    public final C20360zv A0A;
    public final C16320sq A0B;

    public C28431Wb(C16040sK r2, C16000sG r3, C16080sP r4, C19230xz r5, AnonymousClass11R r6, C16440t3 r7, C16070sO r8, C17580vJ r9, C20360zv r10, C16320sq r11) {
        super(r10);
        this.A07 = r7;
        this.A02 = r2;
        this.A0B = r11;
        this.A03 = r3;
        this.A04 = r4;
        this.A09 = r9;
        this.A05 = r5;
        this.A0A = r10;
        this.A08 = r8;
        this.A06 = r6;
    }

    public static final void A00(Jid jid, UserJid userJid, List list, Map map) {
        UserJid of = UserJid.of(jid);
        if (of != null && !userJid.equals(jid) && map.containsKey(of)) {
            StringBuilder sb = new StringBuilder("contact-mutation-handler/populateJidList adding jid: ");
            sb.append(of);
            Log.i(sb.toString());
            list.add(of);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0155 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x015a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x01cc */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A09(X.AnonymousClass1WJ r15, X.AnonymousClass1WJ r16) {
        /*
            r14 = this;
            X.1oR r15 = (X.C36991oR) r15
            X.0sK r2 = r14.A02
            boolean r0 = r2.A0G()
            if (r0 == 0) goto L_0x002e
            com.whatsapp.jid.UserJid r3 = r15.A01
            X.1Wg r1 = r15.A05
            X.1Wg r0 = X.C28481Wg.A03
            if (r1 != r0) goto L_0x00d0
            boolean r0 = r2.A0I(r3)
            if (r0 == 0) goto L_0x0032
            X.11R r0 = r14.A06
            java.lang.String r2 = r15.A02
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "self_contact_name"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x002e:
            r14.A06(r15)
            return
        L_0x0032:
            X.0sG r2 = r14.A03
            r2.A0A(r3)
            java.lang.String r7 = r15.A03
            java.lang.String r6 = r15.A02
            java.lang.String r0 = r7.trim()
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = " "
            java.lang.String[] r1 = r6.split(r0)
            r0 = 0
            r7 = r1[r0]
        L_0x004e:
            java.lang.String r1 = r3.user
            X.0sH r5 = r2.A08(r3)
            if (r5 == 0) goto L_0x009c
            X.18c r4 = r2.A06
            r0 = 4
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>(r0)
            java.lang.String r0 = "number"
            r2.put(r0, r1)
            r0 = -3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "raw_contact_id"
            r2.put(r0, r1)
            java.lang.String r0 = "given_name"
            r2.put(r0, r7)
            java.lang.String r0 = "display_name"
            r2.put(r0, r6)
            X.0rv r0 = r5.A0E
            r4.A0D(r2, r0)
            X.1iU r1 = r4.A02
            java.util.Set r0 = java.util.Collections.singleton(r5)
            r1.A04(r0)
        L_0x0086:
            X.11R r0 = r14.A06
            android.content.SharedPreferences r2 = r0.A00()
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x002e
            r0 = 2
            if (r1 == r0) goto L_0x002e
            r5 = r14
            monitor-enter(r5)
            goto L_0x00ae
        L_0x009c:
            java.lang.String r1 = "ContactManager/updateContactSyncd attempting to update contact that is not in db with jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0086
        L_0x00ae:
            java.util.List r0 = r14.A01     // Catch:{ all -> 0x00cd }
            r0.add(r3)     // Catch:{ all -> 0x00cd }
            java.lang.Runnable r0 = r14.A00     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00ca
            X.0sq r4 = r14.A0B     // Catch:{ all -> 0x00cd }
            r0 = 32
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r3 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5     // Catch:{ all -> 0x00cd }
            r3.<init>(r14, r0)     // Catch:{ all -> 0x00cd }
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r0 = "ContactMutationHandler/syncNewContacts"
            java.lang.Runnable r0 = r4.Ad4(r3, r0, r1)     // Catch:{ all -> 0x00cd }
            r14.A00 = r0     // Catch:{ all -> 0x00cd }
        L_0x00ca:
            monitor-exit(r5)
            goto L_0x002e
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x00d0:
            X.1Wg r0 = X.C28481Wg.A02
            if (r1 != r0) goto L_0x01d2
            boolean r0 = r2.A0I(r3)
            if (r0 == 0) goto L_0x00f9
            X.11R r0 = r14.A06
            r2 = 0
            android.content.SharedPreferences r0 = r0.A00()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "self_contact_name"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
            r0.apply()
        L_0x00ef:
            X.0zv r0 = r14.A0A
            X.19K r0 = r0.A01
            X.0tf r3 = r0.A02()
            goto L_0x01ad
        L_0x00f9:
            X.0sG r4 = r14.A03
            X.0sH r7 = r4.A08(r3)
            if (r7 == 0) goto L_0x0193
            X.18c r6 = r4.A06
            r0 = 3
            android.content.ContentValues r11 = new android.content.ContentValues
            r11.<init>(r0)
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "raw_contact_id"
            r11.put(r0, r1)
            java.lang.String r0 = "given_name"
            r5 = 0
            r11.put(r0, r5)
            java.lang.String r0 = "display_name"
            r11.put(r0, r5)
            r13 = 0
            X.11X r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x015b }
            X.0tf r10 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x015b }
            X.1cj r12 = r10.A00()     // Catch:{ all -> 0x0156 }
            java.lang.String r9 = "wa_contacts"
            java.lang.String r8 = "wa_contacts._id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0151 }
            long r0 = r7.A05()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0151 }
            r2[r13] = r0     // Catch:{ all -> 0x0151 }
            long r8 = X.AnonymousClass15L.A01(r11, r10, r9, r8, r2)     // Catch:{ all -> 0x0151 }
            r1 = 1
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0147
            r13 = 1
        L_0x0147:
            r12.A00()     // Catch:{ all -> 0x0151 }
            r12.close()     // Catch:{ all -> 0x0156 }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x015b }
            goto L_0x016f
        L_0x0151:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0155 }
        L_0x0155:
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x015a }
        L_0x015a:
            throw r0     // Catch:{ IllegalArgumentException -> 0x015b }
        L_0x015b:
            r2 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to remove contact from syncd mutation "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r7.A0E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r2)
        L_0x016f:
            r7.A0L = r5
            r7.A0N = r5
            if (r13 == 0) goto L_0x01a4
            X.1iU r0 = r6.A02
            java.util.Set r2 = java.util.Collections.singleton(r7)
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0183:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r1.next()
            X.1iT r0 = (X.C33371iT) r0
            r0.A00(r2)
            goto L_0x0183
        L_0x0193:
            java.lang.String r1 = "ContactManager/removeContactSyncd attempting to remove contact that is not in db with jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x01a4:
            X.1kv r0 = r4.A04
            java.util.Map r0 = r0.A01
            r0.remove(r3)
            goto L_0x00ef
        L_0x01ad:
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x01cd }
            X.0tg r1 = r3.A02     // Catch:{ all -> 0x01c8 }
            java.util.Set r0 = java.util.Collections.singleton(r15)     // Catch:{ all -> 0x01c8 }
            java.lang.String[] r0 = X.AnonymousClass1XA.A02(r0)     // Catch:{ all -> 0x01c8 }
            X.C20360zv.A02(r1, r0)     // Catch:{ all -> 0x01c8 }
            r2.A00()     // Catch:{ all -> 0x01c8 }
            r2.close()     // Catch:{ all -> 0x01cd }
            r3.close()
            return
        L_0x01c8:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01cc }
        L_0x01cc:
            throw r0     // Catch:{ all -> 0x01cd }
        L_0x01cd:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x01d1 }
        L_0x01d1:
            throw r0
        L_0x01d2:
            java.lang.String r0 = "ContactMutationHandler/handleMutation received undefined SyncD operation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28431Wb.A09(X.1WJ, X.1WJ):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r5 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0A(X.C28481Wg r19, java.util.Collection r20) {
        /*
            r18 = this;
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            int r0 = r20.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r2 = r18
            X.0t3 r0 = r2.A07
            long r16 = r0.A00()
            java.util.Iterator r7 = r20.iterator()
        L_0x001a:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r12 = r7.next()
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            boolean r0 = r4.contains(r12)
            if (r0 != 0) goto L_0x001a
            X.1Wg r6 = X.C28481Wg.A03
            r9 = r19
            boolean r0 = r9.equals(r6)
            r10 = 0
            if (r0 == 0) goto L_0x0086
            X.0sG r1 = r2.A03
            r0 = 1
            X.0sH r5 = r1.A0B(r12, r0)
            if (r5 != 0) goto L_0x005d
        L_0x0040:
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "contact-sync-handler/create-contact-mutations given contact "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = " doesn't exist in DB but should"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x001a
        L_0x005d:
            boolean r0 = r12 instanceof X.AnonymousClass1ZT
            if (r0 == 0) goto L_0x0084
            X.0vJ r1 = r2.A09
            r0 = r12
            X.1ZT r0 = (X.AnonymousClass1ZT) r0
            X.1ZX r11 = r1.A00(r0)
        L_0x006a:
            if (r5 == 0) goto L_0x0081
            java.lang.String r14 = r5.A0N
            X.0sP r0 = r2.A04
            java.lang.String r15 = r0.A08(r5)
        L_0x0074:
            X.1oR r8 = new X.1oR
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r3.add(r8)
            r4.add(r12)
            goto L_0x001a
        L_0x0081:
            r14 = r10
            r15 = r10
            goto L_0x0074
        L_0x0084:
            r11 = r10
            goto L_0x006a
        L_0x0086:
            r5 = r10
            goto L_0x0040
        L_0x0088:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28431Wb.A0A(X.1Wg, java.util.Collection):java.util.List");
    }

    public List A0B(List list) {
        C16040sK r0 = this.A02;
        r0.A0B();
        AnonymousClass1ZT r8 = r0.A05;
        if (r8 == null) {
            Log.e("contact-mutation-handler/createBootstrapMutations me is null");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C16000sG r02 = this.A03;
        r02.A0U(arrayList);
        C16010sH A0B2 = r02.A0B(r8, false);
        if (A0B2 != null && C224818c.A08(A0B2) && !arrayList.contains(A0B2)) {
            arrayList.add(A0B2);
        }
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C16010sH r1 = (C16010sH) it.next();
            UserJid of = UserJid.of(r1.A0E);
            if (of != null) {
                hashMap.put(of, r1);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AnonymousClass1WX r2 = (AnonymousClass1WX) it2.next();
            C15830rv r9 = r2.A00.A06;
            if (C16030sJ.A0O(r9)) {
                Log.i("contact-mutation-handler/createBootstrapMutations attempting to add jid from 1:1 chat");
                A00(r9, r8, arrayList2, hashMap);
            } else if (C16030sJ.A0L(r9)) {
                StringBuilder sb = new StringBuilder("contact-mutation-handler/createBootstrapMutations attempting to add jids that messaged in group or were mentioned: ");
                sb.append(r9);
                Log.i(sb.toString());
                for (C16740tZ r12 : r2.A01) {
                    A00(r12.A0B(), r8, arrayList3, hashMap);
                    List<Jid> list2 = r12.A0q;
                    if (list2 != null) {
                        for (Jid A002 : list2) {
                            A00(A002, r8, arrayList3, hashMap);
                        }
                    }
                }
                C16070sO r03 = this.A08;
                GroupJid of2 = GroupJid.of(r9);
                AnonymousClass00B.A06(of2);
                C17380uz A032 = r03.A07.A04(of2).A03();
                StringBuilder sb2 = new StringBuilder("contact-mutation-handler/createBootstrapMutations attempting to add all participant jids for group: ");
                sb2.append(r9);
                Log.i(sb2.toString());
                C28031Ub it3 = A032.iterator();
                while (it3.hasNext()) {
                    A00((Jid) it3.next(), r8, arrayList4, hashMap);
                }
            }
        }
        List<Collection> asList = Arrays.asList(new Collection[]{arrayList2, arrayList3, arrayList4, hashMap.keySet()});
        ArrayList arrayList5 = new ArrayList();
        for (Collection addAll : asList) {
            arrayList5.addAll(addAll);
        }
        return A0A(C28481Wg.A03, arrayList5);
    }
}
