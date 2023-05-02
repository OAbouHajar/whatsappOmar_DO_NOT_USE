package X;

import android.content.ContentValues;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.0sG  reason: invalid class name and case insensitive filesystem */
public class C16000sG {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C16040sK A01;
    public final C211212w A02;
    public final AnonymousClass19Y A03;
    public final C34821kv A04;
    public final C34831kw A05 = new C34831kw();
    public final C224818c A06;
    public final C17140ub A07;
    public final AnonymousClass120 A08;
    public final C220316j A09;
    public final C16440t3 A0A;
    public final C16980tz A0B;
    public final C15860rz A0C;
    public final AnonymousClass013 A0D;
    public final C19150xq A0E;
    public final AnonymousClass11G A0F;
    public final C17580vJ A0G;
    public final C17590vK A0H;

    public C16000sG(C16040sK r3, C211212w r4, AnonymousClass19Y r5, C224818c r6, C17140ub r7, AnonymousClass120 r8, C220316j r9, C16440t3 r10, C16980tz r11, C15860rz r12, AnonymousClass013 r13, C19150xq r14, AnonymousClass11G r15, C17580vJ r16, C17590vK r17) {
        this.A0A = r10;
        this.A02 = r4;
        this.A01 = r3;
        this.A0B = r11;
        this.A0F = r15;
        this.A0D = r13;
        this.A07 = r7;
        this.A0E = r14;
        this.A0G = r16;
        this.A08 = r8;
        this.A03 = r5;
        this.A0C = r12;
        this.A09 = r9;
        this.A06 = r6;
        this.A04 = new C34821kv(r11, r13);
        this.A0H = r17;
    }

    public static C16010sH A00(C16000sG r0, C15830rv r1) {
        AnonymousClass00B.A06(r1);
        return r0.A0A(r1);
    }

    public static void A01(C16000sG r1, AbstractCollection abstractCollection, List list, int i2) {
        C16010sH A082 = r1.A08((C15830rv) list.get(i2));
        if (A082 != null && i2 < 3) {
            abstractCollection.add(A082);
        }
    }

    public static void A02(String str, Collection collection) {
        int size = collection.size();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("/count ");
        sb.append(size);
        Log.i(sb.toString());
    }

    public static C16000sG A21() {
        return (C16000sG) yo.mSingletonC.A4x.get();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:31|32|33|34|35) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0075 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x007a */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:29:0x0075=Splitter:B:29:0x0075, B:21:0x0068=Splitter:B:21:0x0068} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:34:0x007a=Splitter:B:34:0x007a, B:23:0x006b=Splitter:B:23:0x006b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03() {
        /*
            r14 = this;
            X.18c r3 = r14.A06
            java.lang.Object r1 = r3.A07
            monitor-enter(r1)
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0098 }
            r2 = -1
            if (r0 != 0) goto L_0x007d
            X.0sK r0 = r3.A01     // Catch:{ all -> 0x0098 }
            r0.A0B()     // Catch:{ all -> 0x0098 }
            X.1ZT r5 = r0.A05     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x0085
            r0 = 1
            X.1Zf r4 = new X.1Zf     // Catch:{ all -> 0x007b }
            r4.<init>((boolean) r0)     // Catch:{ all -> 0x007b }
            r4.A03()     // Catch:{ all -> 0x007b }
            java.lang.String r9 = "is_whatsapp_user = 1 AND raw_contact_id NOT NULL AND raw_contact_id != -1 AND wa_contacts.jid != ?"
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x007b }
            java.lang.String r0 = r5.getRawString()     // Catch:{ all -> 0x007b }
            r6 = 0
            r13[r6] = r0     // Catch:{ all -> 0x007b }
            X.11X r0 = r3.A00     // Catch:{ all -> 0x007b }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x007b }
            java.lang.String r8 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r12 = X.C224818c.A09     // Catch:{ all -> 0x0076 }
            r10 = 0
            java.lang.String r11 = "initIndividualContactCount"
            android.database.Cursor r5 = X.AnonymousClass15L.A03(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0076 }
            if (r5 != 0) goto L_0x0047
            java.lang.String r0 = "contact-mgr-db/unable to get individual contact count"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x006f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x006f }
            r3.A00 = r0     // Catch:{ all -> 0x006f }
            goto L_0x006b
        L_0x0047:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "_count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006f }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x006f }
            r4.A00()     // Catch:{ all -> 0x006f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006f }
            r3.A00 = r0     // Catch:{ all -> 0x006f }
            goto L_0x0068
        L_0x0061:
            java.lang.String r0 = "contact-mgr-db/individual contact count missing cursor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x006f }
            r3.A00 = r10     // Catch:{ all -> 0x006f }
        L_0x0068:
            r5.close()     // Catch:{ all -> 0x0076 }
        L_0x006b:
            r7.close()     // Catch:{ all -> 0x007b }
            goto L_0x007d
        L_0x006f:
            r0 = move-exception
            if (r5 == 0) goto L_0x0075
            r5.close()     // Catch:{ all -> 0x0075 }
        L_0x0075:
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x007a }
        L_0x007a:
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x007d:
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0085
            int r2 = r0.intValue()     // Catch:{ all -> 0x0098 }
        L_0x0085:
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "indivcount/count "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0098:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0098 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A03():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[SYNTHETIC, Splitter:B:15:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri A04(android.content.ContentResolver r7, X.C16010sH r8) {
        /*
            r6 = this;
            r5 = 0
            if (r8 == 0) goto L_0x004e
            X.19Y r0 = r6.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x004e
            X.0sK r0 = r6.A01
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x004e
            X.1ko r0 = r8.A0D
            if (r0 == 0) goto L_0x002e
            long r1 = r0.A00
            r3 = -2
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x002e
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r0, r1)
        L_0x002b:
            if (r0 == 0) goto L_0x004e
            goto L_0x0030
        L_0x002e:
            r0 = 0
            goto L_0x002b
        L_0x0030:
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.getContactLookupUri(r7, r0)     // Catch:{ SecurityException -> 0x003c, NullPointerException -> 0x0035 }
            return r0
        L_0x0035:
            r1 = move-exception
            java.lang.String r0 = "contactmanager/NPE"
            com.whatsapp.util.Log.w(r0, r1)
            return r5
        L_0x003c:
            r2 = move-exception
            java.lang.String r1 = "contactmanager/permission problem:"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x004e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A04(android.content.ContentResolver, X.0sH):android.net.Uri");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:44|45|46|47|48) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r2 = r12.A06;
        r1 = new X.C28921Zf(true);
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r5 = r2.A00.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = X.AnonymousClass15L.A03(r5, "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)", "wa_contacts._id = ?", (java.lang.String) null, "CONTACT", X.C224818c.A08, new java.lang.String[]{java.lang.String.valueOf(r13)});
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r3 != null) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contact-mgr-db/unable to get contact by id ");
        r1.append(r13);
        X.AnonymousClass00B.A08(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r3.moveToNext() == false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r4 = X.C34761kp.A00(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007b, code lost:
        r3.getCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r4 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        r2.A0M(r4, X.AnonymousClass013.A00(r2.A05.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0091, code lost:
        r1.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0094, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0096, code lost:
        if (r3 != null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x009b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16010sH A05(long r13) {
        /*
            r12 = this;
            X.1kv r3 = r12.A04
            X.1ku r4 = r3.A00
            r1 = -2
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            java.util.Map r5 = r3.A01
            monitor-enter(r5)
            java.util.Collection r0 = r5.values()     // Catch:{ all -> 0x00a3 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00a3 }
        L_0x0015:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x002b
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00a3 }
            X.0sH r4 = (X.C16010sH) r4     // Catch:{ all -> 0x00a3 }
            long r1 = r4.A05()     // Catch:{ all -> 0x00a3 }
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0015
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            return r4
        L_0x002b:
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            X.18c r2 = r12.A06
            r0 = 1
            X.1Zf r1 = new X.1Zf
            r1.<init>((boolean) r0)
            r1.A03()
            X.11X r0 = r2.A00     // Catch:{ all -> 0x00a1 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x00a1 }
            java.lang.String r6 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r10 = X.C224818c.A08     // Catch:{ all -> 0x009c }
            java.lang.String r7 = "wa_contacts._id = ?"
            r0 = 1
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x009c }
            r3 = 0
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x009c }
            r11[r3] = r0     // Catch:{ all -> 0x009c }
            r8 = 0
            java.lang.String r9 = "CONTACT"
            android.database.Cursor r3 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x009c }
            r4 = 0
            if (r3 != 0) goto L_0x0071
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0095 }
            r1.<init>()     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "contact-mgr-db/unable to get contact by id "
            r1.append(r0)     // Catch:{ all -> 0x0095 }
            r1.append(r13)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0095 }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0095 }
            r5.close()     // Catch:{ all -> 0x00a1 }
            return r4
        L_0x0071:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x007b
            X.0sH r4 = X.C34761kp.A00(r3)     // Catch:{ all -> 0x0095 }
        L_0x007b:
            r3.getCount()     // Catch:{ all -> 0x0095 }
            r3.close()     // Catch:{ all -> 0x009c }
            r5.close()     // Catch:{ all -> 0x00a1 }
            if (r4 == 0) goto L_0x0091
            X.013 r0 = r2.A05
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            r2.A0M(r4, r0)
        L_0x0091:
            r1.A00()
            return r4
        L_0x0095:
            r0 = move-exception
            if (r3 == 0) goto L_0x009b
            r3.close()     // Catch:{ all -> 0x009b }
        L_0x009b:
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            throw r0     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            throw r0
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            throw r0
        L_0x00a6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A05(long):X.0sH");
    }

    public C16010sH A06(C34841kx r17, String str, long j2) {
        C16010sH r1 = new C16010sH(r17);
        A0P(r1, (UserJid) null, C30371cF.A04, str, 0, 0, j2, false, false, false, false, false, false, false);
        return r1;
    }

    public C16010sH A07(C15830rv r3) {
        C16040sK r1 = this.A01;
        if (r1.A0I(r3)) {
            r1.A0B();
            return r1.A01;
        }
        boolean A0P = C16030sJ.A0P(r3);
        C34821kv r0 = this.A04;
        return A0P ? r0.A00 : (C16010sH) r0.A01.get(r3);
    }

    public C16010sH A08(C15830rv r3) {
        C16040sK r1 = this.A01;
        if (!r1.A0I(r3)) {
            return A0B(r3, false);
        }
        r1.A0B();
        return r1.A01;
    }

    public C16010sH A09(C15830rv r5) {
        C34821kv r2 = this.A04;
        C16010sH r0 = C16030sJ.A0P(r5) ? r2.A00 : (C16010sH) r2.A01.get(r5);
        if (r0 != null) {
            A0O(r0, r5);
        } else {
            r0 = this.A06.A0A(r5);
            A0O(r0, r5);
            if (r0 != null) {
                Class<C15830rv> cls = C15830rv.class;
                if (r0.A08(cls) != null) {
                    Map map = r2.A01;
                    Jid A082 = r0.A08(cls);
                    AnonymousClass00B.A06(A082);
                    map.put(A082, r0);
                    return r0;
                }
            }
        }
        return r0;
    }

    public C16010sH A0A(C15830rv r3) {
        C16010sH A082 = A08(r3);
        if (A082 != null) {
            return A082;
        }
        C16010sH r1 = new C16010sH(r3);
        this.A06.A0I(r1);
        return r1;
    }

    public C16010sH A0B(C15830rv r2, boolean z2) {
        if (r2 == null) {
            return null;
        }
        if (C16030sJ.A0P(r2)) {
            return this.A04.A00;
        }
        if (z2) {
            this.A04.A01.remove(r2);
        }
        return A09(r2);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0106 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16010sH A0C(java.lang.String r15) {
        /*
            r14 = this;
            r10 = 0
            if (r15 == 0) goto L_0x0109
            java.lang.String r0 = r15.trim()
            java.lang.String r3 = android.telephony.PhoneNumberUtils.stripSeparators(r0)
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0021
            r0 = 0
            char r0 = r3.charAt(r0)
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L_0x0021
            r0 = 1
            java.lang.String r3 = r3.substring(r0)
        L_0x0021:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0109
            X.18c r5 = r14.A06
            r0 = 1
            X.1Zf r4 = new X.1Zf
            r4.<init>((boolean) r0)
            r4.A03()
            int r6 = r3.length()
            r0 = 5
            if (r6 >= r0) goto L_0x003b
            r6 = r3
            goto L_0x0057
        L_0x003b:
            java.lang.String r0 = "%"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r1 = r3
            r0 = 5
            if (r6 <= r0) goto L_0x0050
            int r6 = r6 - r0
            r0 = 3
            int r0 = java.lang.Math.min(r6, r0)
            java.lang.String r1 = r3.substring(r0)
        L_0x0050:
            r2.append(r1)
            java.lang.String r6 = r2.toString()
        L_0x0057:
            X.11X r0 = r5.A00     // Catch:{ all -> 0x0107 }
            X.0tf r7 = r0.get()     // Catch:{ all -> 0x0107 }
            java.lang.String r8 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r12 = X.C224818c.A08     // Catch:{ all -> 0x0102 }
            java.lang.String r9 = "wa_contacts.jid LIKE ?"
            r0 = 1
            java.lang.String[] r13 = new java.lang.String[r0]     // Catch:{ all -> 0x0102 }
            r2 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0102 }
            r1.<init>()     // Catch:{ all -> 0x0102 }
            r1.append(r6)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "@"
            r1.append(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "s.whatsapp.net"
            r1.append(r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0102 }
            r13[r2] = r0     // Catch:{ all -> 0x0102 }
            java.lang.String r11 = "CONTACTS"
            android.database.Cursor r2 = X.AnonymousClass15L.A03(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0102 }
            if (r2 != 0) goto L_0x00a6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r1.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "contact-mgr-db/unable to get contacts by phone number "
            r1.append(r0)     // Catch:{ all -> 0x00fb }
            r1.append(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00fb }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fb }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00fb }
            r7.close()     // Catch:{ all -> 0x0107 }
            goto L_0x00cc
        L_0x00a6:
            int r0 = r2.getCount()     // Catch:{ all -> 0x00fb }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x00fb }
            r1.<init>(r0)     // Catch:{ all -> 0x00fb }
        L_0x00af:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00bd
            X.0sH r0 = X.C34761kp.A00(r2)     // Catch:{ all -> 0x00fb }
            r1.add(r0)     // Catch:{ all -> 0x00fb }
            goto L_0x00af
        L_0x00bd:
            r2.close()     // Catch:{ all -> 0x0102 }
            r7.close()     // Catch:{ all -> 0x0107 }
            r5.A0P(r1)
            r1.size()
            r4.A00()
        L_0x00cc:
            r5 = 0
            java.util.Iterator r4 = r1.iterator()
            r6 = r10
        L_0x00d2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00f7
            java.lang.Object r2 = r4.next()
            X.0sH r2 = (X.C16010sH) r2
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A08(r0)
            if (r1 == 0) goto L_0x00d2
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r1.user
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00f3
            return r2
        L_0x00f3:
            int r5 = r5 + 1
            r6 = r2
            goto L_0x00d2
        L_0x00f7:
            r0 = 1
            if (r5 != r0) goto L_0x0109
            return r6
        L_0x00fb:
            r0 = move-exception
            if (r2 == 0) goto L_0x0101
            r2.close()     // Catch:{ all -> 0x0101 }
        L_0x0101:
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0106 }
        L_0x0106:
            throw r0     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            throw r0
        L_0x0109:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0C(java.lang.String):X.0sH");
    }

    public UserJid A0D(GroupJid groupJid) {
        UserJid userJid;
        String str;
        int indexOf;
        String substring;
        C16010sH A082;
        if (groupJid == null || (A082 = A08(groupJid)) == null || (userJid = A082.A0F) == null) {
            userJid = null;
            if (!(groupJid == null || (str = groupJid.user) == null || (indexOf = str.indexOf("-")) == -1 || (substring = str.substring(0, indexOf)) == null)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("@");
                    sb.append("s.whatsapp.net");
                    return UserJid.get(sb.toString());
                } catch (AnonymousClass1W4 unused) {
                    StringBuilder sb2 = new StringBuilder("jids/failed to get group creator jid from group jid: ");
                    sb2.append(groupJid.getRawString());
                    Log.w(sb2.toString());
                    return null;
                }
            }
        }
        return userJid;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0E() {
        /*
            r12 = this;
            X.18c r1 = r12.A06
            r0 = 1
            X.1Zf r4 = new X.1Zf
            r4.<init>((boolean) r0)
            r4.A03()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            X.11X r0 = r1.A00
            X.0tf r5 = r0.get()
            java.lang.String r6 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r10 = X.C224818c.A08     // Catch:{ all -> 0x0057 }
            java.lang.String r7 = "wa_contacts.jid LIKE '%@g.us' OR wa_contacts.jid LIKE '%@temp'"
            r8 = 0
            java.lang.String r9 = "CONTACTS"
            r11 = r8
            android.database.Cursor r2 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0057 }
            if (r2 != 0) goto L_0x0031
            java.lang.String r0 = "contact-mgr-db/unable to get all group chats"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0050 }
            r5.close()
            return r3
        L_0x0031:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0043
            X.0sH r1 = X.C34761kp.A00(r2)     // Catch:{ all -> 0x0050 }
            X.0rv r0 = r1.A0E     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x0050 }
            goto L_0x0031
        L_0x0043:
            r2.close()     // Catch:{ all -> 0x0057 }
            r5.close()
            r3.size()
            r4.A00()
            return r3
        L_0x0050:
            r0 = move-exception
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0E():java.util.ArrayList");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0F() {
        /*
            r12 = this;
            X.18c r4 = r12.A06
            r0 = 1
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r0)
            r3.A03()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0sK r0 = r4.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            java.lang.String r5 = X.C16030sJ.A03(r0)
            r0 = 5
            java.lang.String[] r11 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "broadcast"
            r11[r1] = r0
            r1 = 1
            java.lang.String r0 = "%@broadcast"
            r11[r1] = r0
            r1 = 2
            java.lang.String r0 = "%@g.us"
            r11[r1] = r0
            r1 = 3
            java.lang.String r0 = "%@temp"
            r11[r1] = r0
            if (r5 != 0) goto L_0x003a
            X.1ks r0 = X.C34791ks.A00
            java.lang.String r5 = r0.getRawString()
        L_0x003a:
            r0 = 4
            r11[r0] = r5
            X.11X r0 = r4.A00
            X.0tf r5 = r0.get()
            java.lang.String r6 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r10 = X.C224818c.A08     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = "is_whatsapp_user = 1 AND wa_contacts.jid != ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid != ?"
            r8 = 0
            java.lang.String r9 = "CONTACT"
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x005c
            java.lang.String r0 = "contact-mgr-db/unable to get all individual chats"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x007d }
            r5.close()
            return r2
        L_0x005c:
            r1.getCount()     // Catch:{ all -> 0x007d }
        L_0x005f:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x006d
            X.0sH r0 = X.C34761kp.A00(r1)     // Catch:{ all -> 0x007d }
            r2.add(r0)     // Catch:{ all -> 0x007d }
            goto L_0x005f
        L_0x006d:
            r1.close()     // Catch:{ all -> 0x0084 }
            r5.close()
            r4.A0P(r2)
            r2.size()
            r3.A00()
            return r2
        L_0x007d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ all -> 0x0083 }
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0F():java.util.ArrayList");
    }

    public Collection A0G(Set set) {
        long currentTimeMillis = System.currentTimeMillis();
        Collection<C16010sH> A0C2 = this.A06.A0C(false);
        ArrayList arrayList = new ArrayList();
        for (C16010sH r1 : A0C2) {
            if (r1.A0H() || set.contains(r1.A0E)) {
                arrayList.add(r1);
            }
        }
        StringBuilder sb = new StringBuilder("returned ");
        sb.append(arrayList.size());
        sb.append(" sidelist sync pending contacts | time: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        Log.i(sb.toString());
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r4.getMessage() == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005a, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contactmanagerdb/getAllDBContactsForSync/illegal-state-exception/cursor count=");
        r1.append(r5);
        r1.append("; partial map size=");
        r1.append(r2.size());
        X.AnonymousClass00B.A09(r1.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r6 != null) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0028, B:11:0x0033] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x007a=Splitter:B:24:0x007a, B:34:0x008e=Splitter:B:34:0x008e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A0H() {
        /*
            r14 = this;
            X.18c r1 = r14.A06
            r0 = 1
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r0)
            r3.A03()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.11X r0 = r1.A00
            X.0tf r7 = r0.get()
            java.lang.String r8 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r12 = X.C224818c.A08     // Catch:{ all -> 0x008f }
            r9 = 0
            java.lang.String r11 = "CONTACTS"
            r13 = r9
            r10 = r9
            android.database.Cursor r6 = X.AnonymousClass15L.A03(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x008f }
            if (r6 != 0) goto L_0x002f
            java.lang.String r0 = "contact-mgr-db/unable to get all db contacts for sync"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0088 }
            r7.close()
            return r2
        L_0x002f:
            int r5 = r6.getCount()     // Catch:{ all -> 0x0088 }
        L_0x0033:
            boolean r0 = r6.moveToNext()     // Catch:{ IllegalStateException -> 0x0047 }
            if (r0 == 0) goto L_0x007a
            X.0sH r1 = X.C34761kp.A00(r6)     // Catch:{ IllegalStateException -> 0x0047 }
            boolean r0 = X.C224818c.A08(r1)     // Catch:{ IllegalStateException -> 0x0047 }
            if (r0 == 0) goto L_0x0033
            r2.add(r1)     // Catch:{ IllegalStateException -> 0x0047 }
            goto L_0x0033
        L_0x0047:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0087
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "Make sure the Cursor is initialized correctly before accessing data from it"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0087
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r1.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "contactmanagerdb/getAllDBContactsForSync/illegal-state-exception/cursor count="
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            r1.append(r5)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "; partial map size="
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            int r0 = r2.size()     // Catch:{ all -> 0x0088 }
            r1.append(r0)     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0088 }
            X.AnonymousClass00B.A09(r0, r4)     // Catch:{ all -> 0x0088 }
        L_0x007a:
            r6.close()     // Catch:{ all -> 0x008f }
            r7.close()
            r2.size()
            r3.A00()
            return r2
        L_0x0087:
            throw r4     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            if (r6 == 0) goto L_0x008e
            r6.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0093 }
        L_0x0093:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0H():java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x0156 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x01b8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A0I(java.util.Set r20) {
        /*
            r19 = this;
            r3 = r20
            int r1 = r3.size()
            r0 = 1065353216(0x3f800000, float:1.0)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>(r1, r0)
            java.util.Iterator r4 = r3.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            r5 = r19
            if (r0 == 0) goto L_0x003d
            java.lang.Object r2 = r4.next()
            X.0rv r2 = (X.C15830rv) r2
            X.0sK r1 = r5.A01
            boolean r0 = r1.A0I(r2)
            if (r0 == 0) goto L_0x002f
            r1.A0B()
            X.1Zb r0 = r1.A01
            r6.put(r2, r0)
        L_0x002f:
            boolean r0 = X.C16030sJ.A0P(r2)
            if (r0 == 0) goto L_0x0011
            X.1kv r0 = r5.A04
            X.1ku r0 = r0.A00
            r6.put(r2, r0)
            goto L_0x0011
        L_0x003d:
            java.util.Set r0 = r6.keySet()
            r3.removeAll(r0)
            int r0 = r3.size()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r0, r1)
            int r0 = r3.size()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>(r0, r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x005c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.1kv r1 = r5.A04
            boolean r0 = X.C16030sJ.A0P(r2)
            if (r0 == 0) goto L_0x007c
            X.1ku r0 = r1.A00
        L_0x0072:
            if (r0 == 0) goto L_0x0078
            r4.put(r2, r0)
            goto L_0x005c
        L_0x0078:
            r9.add(r2)
            goto L_0x005c
        L_0x007c:
            java.util.Map r0 = r1.A01
            java.lang.Object r0 = r0.get(r2)
            goto L_0x0072
        L_0x0083:
            X.18c r8 = r5.A06
            r0 = 975(0x3cf, float:1.366E-42)
            int r10 = java.lang.Math.min(r0, r0)
            r2 = 1
            X.1Zf r7 = new X.1Zf
            r7.<init>((boolean) r2)
            r7.A03()
            int r1 = r9.size()
            r0 = 1065353216(0x3f800000, float:1.0)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r1, r0)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.String[] r9 = X.C16030sJ.A0T(r9)
            if (r10 < r2) goto L_0x01bb
            X.11X r0 = r8.A00     // Catch:{ all -> 0x01b9 }
            X.0tf r12 = r0.get()     // Catch:{ all -> 0x01b9 }
            X.1jh r2 = new X.1jh     // Catch:{ all -> 0x01b4 }
            r2.<init>(r9, r10)     // Catch:{ all -> 0x01b4 }
        L_0x00b5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x0126
            java.lang.Object r9 = r2.next()     // Catch:{ all -> 0x01b4 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x01b4 }
            int r11 = r9.length     // Catch:{ all -> 0x01b4 }
            r0 = 975(0x3cf, float:1.366E-42)
            r10 = 0
            if (r11 > r0) goto L_0x00c8
            r10 = 1
        L_0x00c8:
            java.lang.String r0 = "SQL param length exceeded"
            X.AnonymousClass00B.A0C(r0, r10)     // Catch:{ all -> 0x01b4 }
            java.lang.String[] r17 = X.C224818c.A08     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = "wa_contacts.jid IN "
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r10.<init>(r0)     // Catch:{ all -> 0x01b4 }
            java.lang.String r0 = X.C34111ji.A00(r11)     // Catch:{ all -> 0x01b4 }
            r10.append(r0)     // Catch:{ all -> 0x01b4 }
            java.lang.String r14 = r10.toString()     // Catch:{ all -> 0x01b4 }
            java.lang.String r13 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String r15 = "wa_contacts.jid"
            java.lang.String r16 = "CONTACTS_BULK"
            r18 = r9
            android.database.Cursor r11 = X.AnonymousClass15L.A03(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x01b4 }
            if (r11 != 0) goto L_0x00f8
            java.lang.String r0 = "contact-mgr-db/unable to get contacts by jids"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x011f }
            goto L_0x00b5
        L_0x00f8:
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x011f }
            if (r0 == 0) goto L_0x011b
            X.0sH r10 = X.C34761kp.A00(r11)     // Catch:{ all -> 0x011f }
            X.0rv r0 = r10.A0E     // Catch:{ all -> 0x011f }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x011f }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x011f }
            X.0sH r9 = X.C224818c.A06(r10, r0)     // Catch:{ all -> 0x011f }
            X.0rv r0 = r9.A0E     // Catch:{ all -> 0x011f }
            r3.put(r0, r9)     // Catch:{ all -> 0x011f }
            X.1ko r0 = r10.A0D     // Catch:{ all -> 0x011f }
            if (r0 != 0) goto L_0x00f8
            r1.add(r10)     // Catch:{ all -> 0x011f }
            goto L_0x00f8
        L_0x011b:
            r11.close()     // Catch:{ all -> 0x01b4 }
            goto L_0x00b5
        L_0x011f:
            r0 = move-exception
            if (r11 == 0) goto L_0x0156
            r11.close()     // Catch:{ all -> 0x0156 }
            goto L_0x0156
        L_0x0126:
            java.util.Collection r10 = r3.values()     // Catch:{ all -> 0x01b4 }
            int r0 = r1.size()     // Catch:{ all -> 0x01b4 }
            if (r0 == 0) goto L_0x015a
            X.1cj r9 = r12.A00()     // Catch:{ all -> 0x01b4 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x0152 }
        L_0x0138:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x014e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0152 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x0152 }
            boolean r0 = r10.contains(r1)     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x0138
            r8.A0K(r1)     // Catch:{ all -> 0x0152 }
            goto L_0x0138
        L_0x014e:
            r9.A00()     // Catch:{ all -> 0x0152 }
            goto L_0x0157
        L_0x0152:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0156 }
        L_0x0156:
            throw r0     // Catch:{ all -> 0x01b4 }
        L_0x0157:
            r9.close()     // Catch:{ all -> 0x01b4 }
        L_0x015a:
            r8.A0P(r10)     // Catch:{ all -> 0x01b4 }
            r12.close()     // Catch:{ all -> 0x01b9 }
            r7.A01()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r8 = r0.iterator()
        L_0x016b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01b0
            java.lang.Object r7 = r8.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r1 = r7.getKey()
            X.0rv r1 = (X.C15830rv) r1
            java.lang.Object r0 = r7.getValue()
            X.0sH r0 = (X.C16010sH) r0
            r5.A0O(r0, r1)
            X.1kv r1 = r5.A04
            java.lang.Object r3 = r7.getValue()
            X.0sH r3 = (X.C16010sH) r3
            if (r3 == 0) goto L_0x01a4
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r3.A08(r2)
            if (r0 == 0) goto L_0x01a4
            java.util.Map r1 = r1.A01
            com.whatsapp.jid.Jid r0 = r3.A08(r2)
            X.AnonymousClass00B.A06(r0)
            r1.put(r0, r3)
        L_0x01a4:
            java.lang.Object r1 = r7.getKey()
            java.lang.Object r0 = r7.getValue()
            r4.put(r1, r0)
            goto L_0x016b
        L_0x01b0:
            r6.putAll(r4)
            return r6
        L_0x01b4:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            throw r0     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            r0 = move-exception
            throw r0
        L_0x01bb:
            java.lang.String r1 = "Chunk size must be positive."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0I(java.util.Set):java.util.Map");
    }

    public void A0J() {
        byte[] bArr = new byte[12];
        new Random().nextBytes(bArr);
        this.A0C.A0K().putString("web_contact_checksum", Base64.encodeToString(bArr, 8)).apply();
    }

    public void A0K(C16010sH r6) {
        C224818c r2 = this.A06;
        C28921Zf r4 = new C28921Zf(true);
        r4.A03();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("status_autodownload_disabled", Integer.valueOf(r6.A0m ? 1 : 0));
        r2.A0D(contentValues, r6.A0E);
        StringBuilder sb = new StringBuilder("updated contact status autodownload jid=");
        sb.append(r6.A0E);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r4.A00());
        Log.i(sb.toString());
    }

    public void A0L(C16010sH r6) {
        C224818c r2 = this.A06;
        C28921Zf r4 = new C28921Zf(true);
        r4.A03();
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("wa_name", r6.A0W);
        r2.A0D(contentValues, r6.A0E);
        StringBuilder sb = new StringBuilder("updated whatsapp name for contact jid=");
        sb.append(r6.A0E);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r4.A00());
        Log.i(sb.toString());
        this.A04.A00(r6);
        A0J();
        this.A00.post(new RunnableRunnableShape4S0200000_I0_2(this, 28, r6));
    }

    public void A0M(C16010sH r4) {
        this.A06.A0J(r4);
        this.A04.A00(r4);
        this.A00.post(new RunnableRunnableShape6S0100000_I0_5(this, 47));
    }

    public void A0N(C16010sH r6) {
        C224818c r2 = this.A06;
        C28921Zf r3 = new C28921Zf(true);
        r3.A03();
        ContentValues contentValues = new ContentValues(3);
        contentValues.put("photo_ts", Integer.valueOf(r6.A04));
        contentValues.put("thumb_ts", Integer.valueOf(r6.A05));
        contentValues.put("photo_id_timestamp", Long.valueOf(r6.A0A));
        r2.A0D(contentValues, r6.A0E);
        StringBuilder sb = new StringBuilder("updated photo id for contact jid=");
        sb.append(r6.A0E);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r3.A00());
        Log.i(sb.toString());
        this.A04.A00(r6);
    }

    public final void A0O(C16010sH r4, C15830rv r5) {
        if (r4 != null && (r5 instanceof AnonymousClass1ZX)) {
            AnonymousClass1ZX r52 = (AnonymousClass1ZX) r5;
            AnonymousClass1ZT A012 = this.A0G.A01(r52);
            C16010sH A0A2 = this.A06.A0A(A012);
            if (A0A2 != null && A0A2.A0G()) {
                r4.A0L = A0A2.A09();
            } else if (A012 != null) {
                r4.A0L = C24561Gk.A00(C26071Mf.A00(), A012.user);
            } else if (A0A2 == null || A0A2.A09() == null) {
                String A002 = this.A0H.A00(r52);
                if (A002 == null) {
                    A002 = !AnonymousClass1ZW.A0E(r4.A0W) ? r4.A0W : this.A0B.A02(R.string.str0c1a);
                }
                r4.A0L = A002;
            } else {
                r4.A0L = A0A2.A09();
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x00ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P(X.C16010sH r7, com.whatsapp.jid.UserJid r8, X.C30371cF r9, java.lang.String r10, int r11, int r12, long r13, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21) {
        /*
            r6 = this;
            java.lang.String r0 = "addGroupChatContact"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r7.A0L = r10
            java.lang.String r0 = java.lang.Long.toString(r13)
            r7.A0R = r0
            r7.A0a = r15
            r0 = r16
            r7.A0l = r0
            r0 = r17
            r7.A0Y = r0
            r0 = r18
            r7.A0j = r0
            r7.A01 = r11
            r7.A0F = r8
            r0 = r19
            r7.A0c = r0
            if (r9 == 0) goto L_0x002b
            java.lang.String r0 = r9.A02
            if (r0 == 0) goto L_0x002b
            r7.A0H = r9
        L_0x002b:
            r0 = r20
            r7.A0b = r0
            r7.A03 = r12
            r0 = r21
            r7.A0k = r0
            X.18c r4 = r6.A06
            r0 = 1
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r0)
            r3.A03()
            X.0rv r0 = r7.A0E
            if (r0 != 0) goto L_0x004a
            java.lang.String r0 = "contact-mgr-db/unable to add group chat with null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x004a:
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "jid"
            r5.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r0 = "is_whatsapp_user"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0T
            java.lang.String r0 = "status"
            r5.put(r0, r1)
            long r0 = r7.A0B
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "status_timestamp"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A09()
            java.lang.String r0 = "display_name"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0R
            java.lang.String r0 = "phone_label"
            r5.put(r0, r1)
            java.lang.String r1 = r7.A0O
            java.lang.String r0 = "history_sync_initial_phash"
            r5.put(r0, r1)
            X.11X r0 = r4.A00     // Catch:{ IllegalArgumentException -> 0x00ae }
            X.0tf r2 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x00ae }
            java.lang.String r0 = "wa_contacts"
            long r0 = X.AnonymousClass15L.A00(r5, r2, r0)     // Catch:{ all -> 0x00a9 }
            r7.A0D(r0)     // Catch:{ all -> 0x00a9 }
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            com.whatsapp.jid.Jid r0 = r7.A08(r0)     // Catch:{ all -> 0x00a9 }
            X.0sL r0 = (X.C16050sL) r0     // Catch:{ all -> 0x00a9 }
            r4.A0L(r7, r0)     // Catch:{ all -> 0x00a9 }
            r2.close()     // Catch:{ IllegalArgumentException -> 0x00ae }
            goto L_0x00c0
        L_0x00a9:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00ae }
        L_0x00ae:
            r2 = move-exception
            java.lang.String r1 = "contact-mgr-db/unable to add group chat "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A09(r0, r2)
        L_0x00c0:
            r3.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0P(X.0sH, com.whatsapp.jid.UserJid, X.1cF, java.lang.String, int, int, long, boolean, boolean, boolean, boolean, boolean, boolean, boolean):void");
    }

    public void A0Q(GroupJid groupJid, boolean z2) {
        C16010sH A0A2 = A0A(groupJid);
        if (A0A2.A0c != z2) {
            A0A2.A0c = z2;
            this.A06.A0J(A0A2);
            this.A04.A00(A0A2);
        }
    }

    public void A0R(C16050sL r3, int i2) {
        C16010sH A0A2 = A0A(r3);
        if (A0A2.A01 != i2) {
            A0A2.A01 = i2;
            this.A06.A0J(A0A2);
            this.A04.A00(A0A2);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0S(com.whatsapp.jid.UserJid r10, int r11, long r12) {
        /*
            r9 = this;
            X.18c r5 = r9.A06
            long r2 = (long) r11
            r4 = 1
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>(r4)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.String r0 = "disappearing_mode_duration"
            r8.put(r0, r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "disappearing_mode_timestamp"
            r8.put(r0, r1)
            X.11X r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x003e }
            X.0tf r7 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x003e }
            java.lang.String r6 = "wa_contacts"
            java.lang.String r5 = "jid = ?"
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x0039 }
            r1 = 0
            java.lang.String r0 = X.C16030sJ.A03(r10)     // Catch:{ all -> 0x0039 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0039 }
            r4[r1] = r0     // Catch:{ all -> 0x0039 }
            X.AnonymousClass15L.A01(r8, r7, r6, r5, r4)     // Catch:{ all -> 0x0039 }
            r7.close()     // Catch:{ IllegalArgumentException -> 0x003e }
            goto L_0x0058
        L_0x0039:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ IllegalArgumentException -> 0x003e }
        L_0x003e:
            r4 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update disappearing_mode_duration state  "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r4)
        L_0x0058:
            X.1kv r0 = r9.A04
            java.util.Map r0 = r0.A01
            r0.remove(r10)
            r9.A0J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0S(com.whatsapp.jid.UserJid, int, long):void");
    }

    public void A0T(UserJid userJid, String str, long j2) {
        this.A06.A0N(userJid, str, j2);
        this.A04.A01.remove(userJid);
        this.A00.post(new RunnableRunnableShape4S0200000_I0_2(this, 31, userJid));
    }

    public void A0U(ArrayList arrayList) {
        this.A06.A0R(arrayList, 1, false, false);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x004b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(java.util.Collection r12) {
        /*
            r11 = this;
            java.util.Iterator r10 = r12.iterator()
        L_0x0004:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r4 = r10.next()
            X.0sH r4 = (X.C16010sH) r4
            X.18c r3 = r11.A06
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r8 = r4.A08(r0)
            boolean r7 = r4.A0i
            r2 = 1
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            java.lang.String r0 = "is_whatsapp_user"
            r9.put(r0, r1)
            X.11X r0 = r3.A00     // Catch:{ IllegalArgumentException -> 0x004c }
            X.0tf r6 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x004c }
            java.lang.String r5 = "wa_contacts"
            java.lang.String r3 = "jid = ?"
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0047 }
            r1 = 0
            java.lang.String r0 = X.C16030sJ.A03(r8)     // Catch:{ all -> 0x0047 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0047 }
            r2[r1] = r0     // Catch:{ all -> 0x0047 }
            X.AnonymousClass15L.A01(r9, r6, r5, r3, r2)     // Catch:{ all -> 0x0047 }
            r6.close()     // Catch:{ IllegalArgumentException -> 0x004c }
            goto L_0x0066
        L_0x0047:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x004b }
        L_0x004b:
            throw r0     // Catch:{ IllegalArgumentException -> 0x004c }
        L_0x004c:
            r2 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update is_whatsapp_user state  "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r8)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r2)
        L_0x0066:
            X.1kv r0 = r11.A04
            r0.A00(r4)
            android.os.Handler r2 = r11.A00
            r1 = 29
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r11, r1, r4)
            r2.post(r0)
            goto L_0x0004
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0V(java.util.Collection):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0079 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(java.util.Collection r14) {
        /*
            r13 = this;
            X.18c r1 = r13.A06
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x008b
            r0 = 1
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r0)
            r5.A03()
            r8 = 1
            android.content.ContentValues r7 = new android.content.ContentValues
            r7.<init>(r0)
            r12 = 0
            X.11X r0 = r1.A00     // Catch:{ IllegalArgumentException -> 0x007f }
            X.0tf r6 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x007f }
            X.1cj r11 = r6.A00()     // Catch:{ all -> 0x007a }
            java.util.Iterator r10 = r14.iterator()     // Catch:{ all -> 0x0075 }
        L_0x0026:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x006b
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0075 }
            X.0sH r9 = (X.C16010sH) r9     // Catch:{ all -> 0x0075 }
            X.0rv r2 = r9.A0E     // Catch:{ all -> 0x0075 }
            if (r2 != 0) goto L_0x004b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "contact-mgr-db/update contact skipped for jid="
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            r1.append(r2)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0075 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0075 }
            goto L_0x0026
        L_0x004b:
            java.lang.String r2 = "keep_timestamp"
            long r0 = r9.A09     // Catch:{ all -> 0x0075 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0075 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = "wa_contacts"
            java.lang.String r3 = "_id = ?"
            java.lang.String[] r2 = new java.lang.String[r8]     // Catch:{ all -> 0x0075 }
            long r0 = r9.A05()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0075 }
            r2[r12] = r0     // Catch:{ all -> 0x0075 }
            X.AnonymousClass15L.A01(r7, r6, r4, r3, r2)     // Catch:{ all -> 0x0075 }
            goto L_0x0026
        L_0x006b:
            r11.A00()     // Catch:{ all -> 0x0075 }
            r11.close()     // Catch:{ all -> 0x007a }
            r6.close()     // Catch:{ IllegalArgumentException -> 0x007f }
            goto L_0x0085
        L_0x0075:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0079 }
        L_0x0079:
            throw r0     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0     // Catch:{ IllegalArgumentException -> 0x007f }
        L_0x007f:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update keep timestamp "
            X.AnonymousClass00B.A09(r0, r1)
        L_0x0085:
            r14.size()
            r5.A00()
        L_0x008b:
            X.1kv r5 = r13.A04
            java.util.Iterator r4 = r14.iterator()
        L_0x0091:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r3 = r4.next()
            X.0sH r3 = (X.C16010sH) r3
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r1 = r3.A08(r0)
            if (r1 == 0) goto L_0x0091
            java.util.Map r0 = r5.A01
            java.lang.Object r2 = r0.get(r1)
            X.0sH r2 = (X.C16010sH) r2
            if (r2 == 0) goto L_0x0091
            long r0 = r3.A09
            r2.A09 = r0
            goto L_0x0091
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0W(java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r1 != null) goto L_0x0099;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:56:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x010b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x0110 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0X(java.util.List r17) {
        /*
            r16 = this;
            r0 = r16
            X.18c r5 = r0.A06
            r4 = r17
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = "contact-mgr-db/delete contacts called without any contacts"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0011:
            return
        L_0x0012:
            r0 = 1
            X.1Zf r7 = new X.1Zf
            r7.<init>((boolean) r0)
            r7.A03()
            X.11X r6 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0111 }
            X.0tf r3 = r6.A02()     // Catch:{ IllegalArgumentException -> 0x0111 }
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x010c }
            java.util.Iterator r1 = r4.iterator()     // Catch:{ all -> 0x0107 }
        L_0x0029:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0107 }
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0107 }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x0107 }
            r5.A0E(r3, r2, r0)     // Catch:{ all -> 0x0107 }
            goto L_0x0029
        L_0x0039:
            r2.A00()     // Catch:{ all -> 0x0107 }
            r1 = 37
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2     // Catch:{ all -> 0x0107 }
            r0.<init>(r5, r1, r4)     // Catch:{ all -> 0x0107 }
            r3.A03(r0)     // Catch:{ all -> 0x0107 }
            r2.close()     // Catch:{ all -> 0x010c }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0111 }
            r7.A00()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r4.iterator()
        L_0x0058:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r4 = r8.next()
            X.0sH r4 = (X.C16010sH) r4
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r7 = r4.A08(r0)
            if (r7 == 0) goto L_0x0058
            r2 = 1
            java.lang.String[] r14 = new java.lang.String[r2]
            java.lang.String r0 = "1"
            r1 = 0
            r14[r1] = r0
            java.lang.String[] r15 = new java.lang.String[r2]
            java.lang.String r0 = r7.getRawString()
            r15[r1] = r0
            X.0tf r9 = r6.get()
            java.lang.String r10 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String r11 = "wa_contacts.jid = ?"
            r12 = 0
            java.lang.String r13 = "CONTACTS"
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0102 }
            if (r1 == 0) goto L_0x0096
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x0096
            goto L_0x0099
        L_0x0096:
            r2 = 0
            if (r1 == 0) goto L_0x009c
        L_0x0099:
            r1.close()     // Catch:{ all -> 0x0102 }
        L_0x009c:
            r9.close()
            if (r2 != 0) goto L_0x0058
            r3.add(r4)
            goto L_0x0058
        L_0x00a5:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0011
            X.1iU r0 = r5.A02
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r5 = r0.iterator()
        L_0x00b5:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r5.next()
            X.1iT r1 = (X.C33371iT) r1
            boolean r0 = r1 instanceof X.C33361iS
            if (r0 == 0) goto L_0x00b5
            X.1iS r1 = (X.C33361iS) r1
            X.0sG r4 = r1.A00
            X.1kw r0 = r4.A05
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00e4
            r1.next()
            java.lang.String r1 = "onJidsRemoved"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x00e4:
            java.util.Iterator r2 = r3.iterator()
        L_0x00e8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r1 = r2.next()
            X.0sH r1 = (X.C16010sH) r1
            X.120 r0 = r4.A08
            r0.A03(r1)
            r0.A04(r1)
            goto L_0x00e8
        L_0x00fd:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0101 }
        L_0x0101:
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0106 }
        L_0x0106:
            throw r0
        L_0x0107:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x010b }
        L_0x010b:
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0110 }
        L_0x0110:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0111 }
        L_0x0111:
            r2 = move-exception
            java.lang.String r1 = "contact-mgr-db/unable to delete contacts "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0X(java.util.List):void");
    }

    public void A0Y(List list) {
        this.A06.A0R(list, 0, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Z(com.whatsapp.jid.UserJid r3) {
        /*
            r2 = this;
            X.0sH r0 = r2.A08(r3)
            if (r0 == 0) goto L_0x0013
            X.1ko r0 = r0.A0D
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r0.A01
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16000sG.A0Z(com.whatsapp.jid.UserJid):boolean");
    }
}
