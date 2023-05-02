package X;

import android.content.SharedPreferences;
import com.facebook.redex.IDxRCallbackShape48S0200000_1_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.whatsapp.jid.Jid;
import java.util.Set;

/* renamed from: X.1Ml  reason: invalid class name and case insensitive filesystem */
public abstract class C26131Ml {
    public final C16300so A00;
    public final C17190ug A01;
    public final C26111Mj A02;
    public final C16320sq A03;
    public final String A04;

    public C26131Ml(C16300so r1, C17190ug r2, C26111Mj r3, C16320sq r4, String str) {
        this.A04 = str;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
    }

    public C30801cy A00() {
        C30801cy r2 = new C30801cy();
        C17190ug r7 = this.A01;
        String A022 = r7.A02();
        r7.A0B(new IDxRCallbackShape48S0200000_1_I0(r2, 3, this), new C28371Vv(new C28371Vv(new C28371Vv("list", C26111Mj.A00(this.A04, A02())), "privacy", (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "privacy"), new C35081lL("type", "get")}), A022, this instanceof AnonymousClass2ZL ? 291 : this instanceof AnonymousClass2ZA ? 288 : this instanceof C26121Mk ? 227 : 293, 32000);
        return r2;
    }

    public C30801cy A01(Set set) {
        C30801cy r3 = new C30801cy();
        this.A03.Acl(new RunnableRunnableShape1S0300000_I0_1(this, set, r3, 41));
        return r3;
    }

    public String A02() {
        SharedPreferences sharedPreferences;
        String str;
        if (this instanceof AnonymousClass2ZL) {
            sharedPreferences = (SharedPreferences) ((AnonymousClass2ZL) this).A01.A01.get();
            str = "profile_photo_block_list_hash";
        } else if (this instanceof AnonymousClass2ZA) {
            sharedPreferences = (SharedPreferences) ((AnonymousClass2ZA) this).A01.A01.get();
            str = "last_seen_block_list_hash";
        } else if (this instanceof C26121Mk) {
            sharedPreferences = (SharedPreferences) ((C26121Mk) this).A01.A01.get();
            str = "group_add_blacklist_hash";
        } else {
            sharedPreferences = (SharedPreferences) ((C50282Ys) this).A01.A01.get();
            str = "about_block_list_hash";
        }
        return sharedPreferences.getString(str, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        if (r1 != null) goto L_0x00b4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c1 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x00c1=Splitter:B:45:0x00c1, B:37:0x00b4=Splitter:B:37:0x00b4} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A03() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.AnonymousClass2ZL
            if (r0 == 0) goto L_0x002f
            r0 = r9
            X.2ZL r0 = (X.AnonymousClass2ZL) r0
            X.0sG r0 = r0.A00
            X.18c r0 = r0.A06
            X.11X r0 = r0.A00
            X.0tf r2 = r0.get()
            java.lang.String r3 = "wa_profile_photo_block_list"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00c2 }
            r1 = 0
            java.lang.String r0 = "jid"
            r7[r1] = r0     // Catch:{ all -> 0x00c2 }
            r4 = 0
            java.lang.String r6 = "CONTACT_PROFILE_PHOTO_BLOCK_LIST"
            r8 = r4
            r5 = r4
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "contact-mgr-db/unable to get profile photo block list"
            java.util.Set r0 = X.C224818c.A07(r1, r0)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b4
        L_0x002f:
            boolean r0 = r9 instanceof X.AnonymousClass2ZA
            if (r0 == 0) goto L_0x005d
            r0 = r9
            X.2ZA r0 = (X.AnonymousClass2ZA) r0
            X.0sG r0 = r0.A00
            X.18c r0 = r0.A06
            X.11X r0 = r0.A00
            X.0tf r2 = r0.get()
            java.lang.String r3 = "wa_last_seen_block_list"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00c2 }
            r1 = 0
            java.lang.String r0 = "jid"
            r7[r1] = r0     // Catch:{ all -> 0x00c2 }
            r4 = 0
            java.lang.String r6 = "CONTACT_LAST_SEEN_BLOCK_LIST"
            r8 = r4
            r5 = r4
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "contact-mgr-db/unable to get last seen block list"
            java.util.Set r0 = X.C224818c.A07(r1, r0)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b4
        L_0x005d:
            boolean r0 = r9 instanceof X.C26121Mk
            if (r0 == 0) goto L_0x008b
            r0 = r9
            X.1Mk r0 = (X.C26121Mk) r0
            X.0sG r0 = r0.A00
            X.18c r0 = r0.A06
            X.11X r0 = r0.A00
            X.0tf r2 = r0.get()
            java.lang.String r3 = "wa_group_add_black_list"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00c2 }
            r1 = 0
            java.lang.String r0 = "jid"
            r7[r1] = r0     // Catch:{ all -> 0x00c2 }
            r4 = 0
            java.lang.String r6 = "CONTACT_GROUP_ADD_BLACK_LIST"
            r8 = r4
            r5 = r4
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "contact-mgr-db/unable to get group add block list"
            java.util.Set r0 = X.C224818c.A07(r1, r0)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b7
            goto L_0x00b4
        L_0x008b:
            r0 = r9
            X.2Ys r0 = (X.C50282Ys) r0
            X.0sG r0 = r0.A00
            X.18c r0 = r0.A06
            X.11X r0 = r0.A00
            X.0tf r2 = r0.get()
            java.lang.String r3 = "wa_about_block_list"
            r0 = 1
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00c2 }
            r1 = 0
            java.lang.String r0 = "jid"
            r7[r1] = r0     // Catch:{ all -> 0x00c2 }
            r4 = 0
            java.lang.String r6 = "CONTACT_ABOUT_BLOCK_LIST"
            r8 = r4
            r5 = r4
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r0 = "contact-mgr-db/unable to get about block list"
            java.util.Set r0 = X.C224818c.A07(r1, r0)     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x00b7
        L_0x00b4:
            r1.close()     // Catch:{ all -> 0x00c2 }
        L_0x00b7:
            r2.close()
            return r0
        L_0x00bb:
            r0 = move-exception
            if (r1 == 0) goto L_0x00c1
            r1.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00c2:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26131Ml.A03():java.util.Set");
    }

    public void A04(String str, Set set, boolean z2) {
        int i2;
        SharedPreferences.Editor A0K;
        String str2;
        if (this instanceof AnonymousClass2ZL) {
            AnonymousClass2ZL r3 = (AnonymousClass2ZL) this;
            C224818c r2 = r3.A00.A06;
            C28921Zf r1 = new C28921Zf(true);
            r1.A03();
            r2.A0O("wa_profile_photo_block_list", set);
            r1.A00();
            C15860rz r22 = r3.A01;
            ((SharedPreferences) r22.A01.get()).edit().putString("profile_photo_block_list_hash", str).apply();
            if (z2) {
                i2 = 3;
                A0K = r22.A0K();
                str2 = "privacy_profile_photo";
            } else {
                return;
            }
        } else if (this instanceof AnonymousClass2ZA) {
            AnonymousClass2ZA r32 = (AnonymousClass2ZA) this;
            C224818c r23 = r32.A00.A06;
            C28921Zf r12 = new C28921Zf(true);
            r12.A03();
            r23.A0O("wa_last_seen_block_list", set);
            r12.A00();
            C15860rz r24 = r32.A01;
            ((SharedPreferences) r24.A01.get()).edit().putString("last_seen_block_list_hash", str).apply();
            if (z2) {
                i2 = 3;
                A0K = r24.A0K();
                str2 = "privacy_last_seen";
            } else {
                return;
            }
        } else if (this instanceof C26121Mk) {
            C26121Mk r33 = (C26121Mk) this;
            C224818c r25 = r33.A00.A06;
            C28921Zf r13 = new C28921Zf(true);
            r13.A03();
            r25.A0O("wa_group_add_black_list", set);
            r13.A00();
            C15860rz r26 = r33.A01;
            ((SharedPreferences) r26.A01.get()).edit().putString("group_add_blacklist_hash", str).apply();
            if (z2) {
                i2 = 3;
                A0K = r26.A0K();
                str2 = "privacy_groupadd";
            } else {
                return;
            }
        } else {
            C50282Ys r34 = (C50282Ys) this;
            C224818c r27 = r34.A00.A06;
            C28921Zf r14 = new C28921Zf(true);
            r14.A03();
            r27.A0O("wa_about_block_list", set);
            r14.A00();
            C15860rz r28 = r34.A01;
            ((SharedPreferences) r28.A01.get()).edit().putString("about_block_list_hash", str).apply();
            if (z2) {
                i2 = 3;
                A0K = r28.A0K();
                str2 = "privacy_status";
            } else {
                return;
            }
        }
        A0K.putInt(str2, i2).apply();
    }
}
