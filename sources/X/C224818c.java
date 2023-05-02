package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.Build;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.18c  reason: invalid class name and case insensitive filesystem */
public class C224818c extends AnonymousClass15L {
    public static final String[] A08 = {"wa_contacts._id", "wa_contacts.jid", "is_whatsapp_user", "status", "number", "raw_contact_id", "display_name", "phone_type", "phone_label", "unseen_msg_count", "photo_ts", "thumb_ts", "photo_id_timestamp", "given_name", "family_name", "wa_name", "sort_name", "status_timestamp", "nickname", "company", "title", "status_autodownload_disabled", "keep_timestamp", "is_spam_reported", "is_sidelist_synced", "is_business_synced", "disappearing_mode_duration", "disappearing_mode_timestamp", "history_sync_initial_phash", "verified_name", "expires", "verified_level", "issuer", "identity_unconfirmed_since", "serial", "host_storage", "actual_actors", "privacy_mode_ts", FacebookFacade.RequestParameter.DESCRIPTION, "description_id_string", "description_time", "description_setter_jid", "restrict_mode", "announcement_group", "no_frequently_forwarded", "ephemeral_duration", "creator_jid", "in_app_support", "is_suspended", "require_membership_approval", "member_add_mode", "incognito", "group_state", "is_pending_requests_banner_acknowledged"};
    public static final String[] A09 = {"count(wa_contacts._id) AS _count"};
    public static final String[] A0A = {"wa_contacts.jid", "number"};
    public static final String[] A0B = {"_id", "jid", "serial", "issuer", "expires", "verified_name", "industry", "city", "country", "verified_level", "cert_blob", "identity_unconfirmed_since", "host_storage", "actual_actors", "privacy_mode_ts"};
    public Integer A00;
    public final C16040sK A01;
    public final C33381iU A02;
    public final AnonymousClass01V A03;
    public final C16440t3 A04;
    public final AnonymousClass013 A05;
    public final C16320sq A06;
    public final Object A07 = new Object();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C224818c(C16040sK r3, AnonymousClass01V r4, C16440t3 r5, AnonymousClass013 r6, C16320sq r7, AnonymousClass11X r8) {
        super(r8);
        C33381iU r1 = new C33381iU();
        this.A04 = r5;
        this.A01 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A05 = r6;
        this.A02 = r1;
        r1.A02(new C34741kn(r3, this));
    }

    public static final C16010sH A06(C16010sH r5, C16010sH r6) {
        C34751ko r2;
        C34751ko r0;
        if (r6 == null || ((r2 = r6.A0D) == null && r5.A0D != null)) {
            return r5;
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("lge") && r2 != null && r2.A00 == -2 && (r0 = r5.A0D) != null && r0.A00 != -2) {
            return r5;
        }
        boolean z2 = r6.A0i;
        boolean z3 = r5.A0i;
        if (z2) {
            return (!z3 || r5.A05() >= r6.A05()) ? r6 : r5;
        }
        if (z3) {
            return r5;
        }
    }

    public static final Set A07(Cursor cursor, String str) {
        HashSet hashSet = new HashSet();
        if (cursor == null) {
            AnonymousClass00B.A08(str);
        } else {
            while (cursor.moveToNext()) {
                UserJid nullable = UserJid.getNullable(cursor.getString(0));
                if (nullable != null) {
                    hashSet.add(nullable);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.A0D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A08(X.C16010sH r1) {
        /*
            X.0rv r0 = r1.A0E
            if (r0 == 0) goto L_0x0011
            X.1ko r0 = r1.A0D
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r0.A01
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A08(X.0sH):boolean");
    }

    public Cursor A09() {
        C16800tf A012 = this.A00.get();
        try {
            Cursor A032 = AnonymousClass15L.A03(A012, "wa_contact_storage_usage", "jid != ?", "conversation_size DESC, conversation_message_count DESC", "CONTACT_STORAGE_USAGES", new String[]{"jid", "conversation_size", "conversation_message_count"}, new String[]{C34771kq.A00.getRawString()});
            A012.close();
            return A032;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:41|42|43|44|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0078, code lost:
        if (r8 == null) goto L_0x007a;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0090 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0095 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16010sH A0A(X.C15830rv r13) {
        /*
            r12 = this;
            r8 = 0
            if (r13 != 0) goto L_0x0009
            java.lang.String r0 = "contact-mgr-db/cannot get contact by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r8
        L_0x0009:
            r0 = 1
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r0)
            r3.A03()
            X.11X r0 = r12.A00     // Catch:{ all -> 0x0096 }
            X.0tf r5 = r0.get()     // Catch:{ all -> 0x0096 }
            java.lang.String r6 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r10 = A08     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = "wa_contacts.jid = ?"
            r0 = 1
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0091 }
            r1 = 0
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x0091 }
            r11[r1] = r0     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = "CONTACTS"
            android.database.Cursor r2 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0091 }
            if (r2 != 0) goto L_0x004a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r1.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "contact-mgr-db/unable to get contact by jid "
            r1.append(r0)     // Catch:{ all -> 0x008a }
            r1.append(r13)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x008a }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x008a }
            r5.close()     // Catch:{ all -> 0x0096 }
            return r8
        L_0x004a:
            r4 = r8
        L_0x004b:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x005f
            X.0sH r1 = X.C34761kp.A00(r2)     // Catch:{ all -> 0x008a }
            X.0sH r8 = A06(r1, r8)     // Catch:{ all -> 0x008a }
            X.1ko r0 = r1.A0D     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x004b
            r4 = r1
            goto L_0x004b
        L_0x005f:
            r2.getCount()     // Catch:{ all -> 0x008a }
            r2.close()     // Catch:{ all -> 0x0091 }
            r5.close()     // Catch:{ all -> 0x0096 }
            if (r4 == 0) goto L_0x0078
            if (r4 == r8) goto L_0x007e
            X.0sq r2 = r12.A06
            r1 = 35
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r12, r1, r4)
            r2.Acl(r0)
        L_0x0078:
            if (r8 != 0) goto L_0x007e
        L_0x007a:
            r3.A00()
            return r8
        L_0x007e:
            X.013 r0 = r12.A05
            android.content.Context r0 = r0.A00
            java.util.Locale r0 = X.AnonymousClass013.A00(r0)
            r12.A0M(r8, r0)
            goto L_0x007a
        L_0x008a:
            r0 = move-exception
            if (r2 == 0) goto L_0x0090
            r2.close()     // Catch:{ all -> 0x0090 }
        L_0x0090:
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0095 }
        L_0x0095:
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0A(X.0rv):X.0sH");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0B(X.C15830rv r13) {
        /*
            r12 = this;
            r0 = 1
            X.1Zf r4 = new X.1Zf
            r4.<init>((boolean) r0)
            r4.A03()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.11X r0 = r12.A00
            X.0tf r5 = r0.get()
            java.lang.String r6 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r10 = A08     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = "wa_contacts.jid = ?"
            r0 = 1
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0070 }
            r1 = 0
            java.lang.String r0 = r13.getRawString()     // Catch:{ all -> 0x0070 }
            r11[r1] = r0     // Catch:{ all -> 0x0070 }
            r8 = 0
            java.lang.String r9 = "CONTACTS"
            android.database.Cursor r3 = X.AnonymousClass15L.A03(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0070 }
            if (r3 != 0) goto L_0x0047
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0069 }
            r1.<init>()     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "contact-mgr-db/unable to get contacts by jid "
            r1.append(r0)     // Catch:{ all -> 0x0069 }
            r1.append(r13)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0069 }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0069 }
            r5.close()
            return r2
        L_0x0047:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0059
            X.0sH r1 = X.C34761kp.A00(r3)     // Catch:{ all -> 0x0069 }
            X.0rv r0 = r1.A0E     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0047
            r2.add(r1)     // Catch:{ all -> 0x0069 }
            goto L_0x0047
        L_0x0059:
            r3.close()     // Catch:{ all -> 0x0070 }
            r5.close()
            r12.A0P(r2)
            r2.size()
            r4.A00()
            return r2
        L_0x0069:
            r0 = move-exception
            if (r3 == 0) goto L_0x006f
            r3.close()     // Catch:{ all -> 0x006f }
        L_0x006f:
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0074 }
        L_0x0074:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0B(X.0rv):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        if (r4.getMessage() == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("contactmanagerdb/getSideListContacts/illegal-state-exception/cursor count=");
        r1.append(0);
        r1.append("; partial list size=");
        r1.append(r2.size());
        X.AnonymousClass00B.A09(r1.toString(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c1, code lost:
        if (r5 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:12:0x0067, B:14:0x006f] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00c6 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:38:0x00c6=Splitter:B:38:0x00c6, B:28:0x00b8=Splitter:B:28:0x00b8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Collection A0C(boolean r14) {
        /*
            r13 = this;
            if (r14 == 0) goto L_0x0054
            java.lang.String r2 = "is_sidelist_synced= 1)"
        L_0x0004:
            java.lang.String r1 = "is_whatsapp_user = 1 AND wa_contacts.jid != ? AND wa_contacts.jid IS NOT NULL AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid NOT LIKE ? AND wa_contacts.jid != ? AND wa_contacts.jid != ? AND (raw_contact_id IS NULL OR raw_contact_id<0) AND ("
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r8 = r0.toString()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            X.0sK r0 = r13.A01
            r0.A0B()
            X.1ZT r0 = r0.A05
            java.lang.String r4 = X.C16030sJ.A03(r0)
            r0 = 6
            java.lang.String[] r12 = new java.lang.String[r0]
            java.lang.String r0 = "broadcast"
            r3 = 0
            r12[r3] = r0
            r1 = 1
            java.lang.String r0 = "%@broadcast"
            r12[r1] = r0
            r1 = 2
            java.lang.String r0 = "%@g.us"
            r12[r1] = r0
            r1 = 3
            java.lang.String r0 = "%@temp"
            r12[r1] = r0
            r1 = 4
            if (r4 != 0) goto L_0x0042
            X.1ks r0 = X.C34791ks.A00
            java.lang.String r4 = r0.getRawString()
        L_0x0042:
            r12[r1] = r4
            r1 = 5
            X.1kt r0 = X.C34801kt.A00
            java.lang.String r0 = r0.getRawString()
            r12[r1] = r0
            X.11X r0 = r13.A00
            X.0tf r6 = r0.get()
            goto L_0x0057
        L_0x0054:
            java.lang.String r2 = "is_sidelist_synced= 0 OR is_sidelist_synced IS NULL)"
            goto L_0x0004
        L_0x0057:
            java.lang.String r7 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r11 = A08     // Catch:{ all -> 0x00c7 }
            r9 = 0
            java.lang.String r10 = "CONTACTS"
            android.database.Cursor r5 = X.AnonymousClass15L.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c7 }
            if (r5 != 0) goto L_0x006f
            java.lang.String r0 = "contact-mgr-db/unable to get sidelist sync pending list"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x00c0 }
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x00c0 }
            goto L_0x00bb
        L_0x006f:
            int r3 = r5.getCount()     // Catch:{ IllegalStateException -> 0x0085 }
        L_0x0073:
            boolean r0 = r5.moveToNext()     // Catch:{ IllegalStateException -> 0x0085 }
            if (r0 == 0) goto L_0x00b8
            X.0sH r1 = X.C34761kp.A00(r5)     // Catch:{ IllegalStateException -> 0x0085 }
            X.0rv r0 = r1.A0E     // Catch:{ IllegalStateException -> 0x0085 }
            if (r0 == 0) goto L_0x0073
            r2.add(r1)     // Catch:{ IllegalStateException -> 0x0085 }
            goto L_0x0073
        L_0x0085:
            r4 = move-exception
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00bf
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "Make sure the Cursor is initialized correctly before accessing data from it"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00bf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "contactmanagerdb/getSideListContacts/illegal-state-exception/cursor count="
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            r1.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "; partial list size="
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            int r0 = r2.size()     // Catch:{ all -> 0x00c0 }
            r1.append(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c0 }
            X.AnonymousClass00B.A09(r0, r4)     // Catch:{ all -> 0x00c0 }
        L_0x00b8:
            r5.close()     // Catch:{ all -> 0x00c7 }
        L_0x00bb:
            r6.close()
            return r2
        L_0x00bf:
            throw r4     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            if (r5 == 0) goto L_0x00c6
            r5.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0C(boolean):java.util.Collection");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0023 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(android.content.ContentValues r7, X.C15830rv r8) {
        /*
            r6 = this;
            X.11X r0 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0024 }
            X.0tf r5 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0024 }
            java.lang.String r4 = "wa_contacts"
            java.lang.String r3 = "jid = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x001f }
            r1 = 0
            java.lang.String r0 = X.C16030sJ.A03(r8)     // Catch:{ all -> 0x001f }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x001f }
            r2[r1] = r0     // Catch:{ all -> 0x001f }
            X.AnonymousClass15L.A01(r7, r5, r4, r3, r2)     // Catch:{ all -> 0x001f }
            r5.close()     // Catch:{ IllegalArgumentException -> 0x0024 }
            return
        L_0x001f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            java.lang.String r1 = "contact-mgr-db/unable to update contact by jid "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0D(android.content.ContentValues, X.0rv):void");
    }

    public final void A0E(C16800tf r8, C30651cj r9, C16010sH r10) {
        AnonymousClass00B.A0G(r9.A01());
        C15830rv r5 = r10.A0E;
        String A032 = C16030sJ.A03(r5);
        AnonymousClass15L.A02(r8, "wa_contacts", "_id = ?", new String[]{String.valueOf(r10.A05())});
        AnonymousClass15L.A02(r8, "wa_contact_storage_usage", "jid = ? AND NOT EXISTS (SELECT 1 FROM wa_contacts WHERE jid = ?)", new String[]{A032, A032});
        if (r5 instanceof C16050sL) {
            A0F(r8, r9, (C16050sL) r5, (C30371cF) null);
        }
        AnonymousClass15L.A02(r8, "wa_group_admin_settings", "jid = ?", new String[]{A032});
    }

    public final void A0F(C16800tf r7, C30651cj r8, C16050sL r9, C30371cF r10) {
        AnonymousClass00B.A0G(r8.A01());
        if (r9 != null) {
            String rawString = r9.getRawString();
            AnonymousClass00B.A06(rawString);
            if (r10 == null) {
                AnonymousClass15L.A02(r7, "wa_group_descriptions", "jid = ?", new String[]{rawString});
                return;
            }
            String str = r10.A02;
            if (str != null) {
                AnonymousClass15L.A02(r7, "wa_group_descriptions", "jid = ?", new String[]{rawString});
                ContentValues contentValues = new ContentValues(5);
                contentValues.put("jid", rawString);
                contentValues.put(FacebookFacade.RequestParameter.DESCRIPTION, str);
                String str2 = r10.A03;
                String str3 = "";
                if (str2 == null) {
                    str2 = str3;
                }
                contentValues.put("description_id_string", str2);
                contentValues.put("description_time", Long.valueOf(r10.A00));
                UserJid userJid = r10.A01;
                if (userJid != null) {
                    str3 = userJid.getRawString();
                }
                contentValues.put("description_setter_jid", str3);
                AnonymousClass15L.A00(contentValues, r7, "wa_group_descriptions");
            }
        }
    }

    public final void A0G(C30651cj r8, UserJid userJid) {
        AnonymousClass00B.A0G(r8.A01());
        String A032 = C16030sJ.A03(userJid);
        AnonymousClass00B.A06(A032);
        C16800tf A022 = this.A00.A02();
        try {
            AnonymousClass15L.A02(A022, "wa_vnames", "jid = ?", new String[]{A032});
            AnonymousClass15L.A02(A022, "wa_vnames_localized", "jid = ?", new String[]{A032});
            A022.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C28711Xg r11) {
        /*
            r10 = this;
            X.11X r0 = r10.A00     // Catch:{ IllegalArgumentException -> 0x0062 }
            X.0tf r6 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0062 }
            X.1cj r9 = r6.A00()     // Catch:{ all -> 0x005d }
            X.0rv r0 = r11.A01()     // Catch:{ all -> 0x0058 }
            java.lang.String r8 = r0.getRawString()     // Catch:{ all -> 0x0058 }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x0058 }
            r7.<init>()     // Catch:{ all -> 0x0058 }
            java.lang.String r2 = "conversation_size"
            X.1Xf r0 = r11.A00     // Catch:{ all -> 0x0058 }
            long r0 = r0.A0G     // Catch:{ all -> 0x0058 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0058 }
            r7.put(r2, r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r1 = "conversation_message_count"
            X.1Xf r0 = r11.A00     // Catch:{ all -> 0x0058 }
            int r0 = r0.A06     // Catch:{ all -> 0x0058 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0058 }
            r7.put(r1, r0)     // Catch:{ all -> 0x0058 }
            java.lang.String r5 = "wa_contact_storage_usage"
            java.lang.String r2 = "jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0058 }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x0058 }
            long r3 = X.AnonymousClass15L.A01(r7, r6, r5, r2, r1)     // Catch:{ all -> 0x0058 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "jid"
            r7.put(r0, r8)     // Catch:{ all -> 0x0058 }
            X.AnonymousClass15L.A04(r7, r6, r5)     // Catch:{ all -> 0x0058 }
        L_0x004e:
            r9.A00()     // Catch:{ all -> 0x0058 }
            r9.close()     // Catch:{ all -> 0x005d }
            r6.close()     // Catch:{ IllegalArgumentException -> 0x0062 }
            return
        L_0x0058:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x005c }
        L_0x005c:
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0061 }
        L_0x0061:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update batch on storage usage table"
            X.AnonymousClass00B.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0H(X.1Xg):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(X.C16010sH r6) {
        /*
            r5 = this;
            r0 = 1
            X.1Zf r3 = new X.1Zf
            r3.<init>((boolean) r0)
            r3.A03()
            X.0rv r2 = r6.A0E
            if (r2 != 0) goto L_0x0013
            java.lang.String r0 = "contact-mgr-db/unable to add unknown contact with null jid"
        L_0x000f:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0013:
            X.0sK r1 = r5.A01
            r1.A0B()
            X.1ZT r0 = r1.A05
            if (r0 != 0) goto L_0x001f
            java.lang.String r0 = "contact-mgr-db/unable to add unknown contact due to null me record"
            goto L_0x000f
        L_0x001f:
            boolean r0 = r6.A0J()
            if (r0 != 0) goto L_0x0031
            boolean r0 = r1.A0I(r2)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "contact-mgr-db/unable to add unknown contact due to matching jid prefix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0031:
            r0 = 4
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r0)
            java.lang.String r1 = r2.getRawString()
            java.lang.String r0 = "jid"
            r4.put(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r0 = "is_whatsapp_user"
            r4.put(r0, r1)
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = "status"
            r4.put(r0, r1)
            long r0 = r6.A0B
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "status_timestamp"
            r4.put(r0, r1)
            X.11X r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0080 }
            X.0tf r2 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0080 }
            java.lang.String r0 = "wa_contacts"
            long r0 = X.AnonymousClass15L.A00(r4, r2, r0)     // Catch:{ all -> 0x007b }
            r6.A0D(r0)     // Catch:{ all -> 0x007b }
            r2.close()     // Catch:{ IllegalArgumentException -> 0x0080 }
            X.1iU r1 = r5.A02
            java.util.List r0 = java.util.Collections.singletonList(r6)
            r1.A04(r0)
            r3.A00()
            return
        L_0x007b:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007f }
        L_0x007f:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0080 }
        L_0x0080:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0096 }
            r1.<init>()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "contact-mgr-db/unable to add unknown contact "
            r1.append(r0)     // Catch:{ all -> 0x0096 }
            r1.append(r6)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0096 }
            X.AnonymousClass00B.A09(r0, r2)     // Catch:{ all -> 0x0096 }
            return
        L_0x0096:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0I(X.0sH):void");
    }

    public void A0J(C16010sH r6) {
        C28921Zf r3 = new C28921Zf(true);
        r3.A03();
        ContentValues contentValues = new ContentValues(5);
        contentValues.put("display_name", r6.A09());
        contentValues.put("phone_label", r6.A0R);
        contentValues.put("is_whatsapp_user", Boolean.valueOf(r6.A0i));
        contentValues.put("history_sync_initial_phash", r6.A0O);
        A0D(contentValues, r6.A0E);
        A0L(r6, (C16050sL) r6.A08(C16050sL.class));
        StringBuilder sb = new StringBuilder("updated group info for jid=");
        sb.append(r6.A0E);
        sb.append(' ');
        sb.append(contentValues);
        sb.append(" | time: ");
        sb.append(r3.A00());
        Log.i(sb.toString());
        this.A02.A04(Collections.singleton(r6));
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0K(X.C16010sH r5) {
        /*
            r4 = this;
            X.11X r0 = r4.A00     // Catch:{ all -> 0x0034 }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x0034 }
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x002f }
            boolean r0 = r2.A01()     // Catch:{ all -> 0x002a }
            X.AnonymousClass00B.A0G(r0)     // Catch:{ all -> 0x002a }
            r1 = 1
            X.1Zf r0 = new X.1Zf     // Catch:{ all -> 0x002a }
            r0.<init>((boolean) r1)     // Catch:{ all -> 0x002a }
            r0.A03()     // Catch:{ all -> 0x002a }
            r4.A0E(r3, r2, r5)     // Catch:{ all -> 0x002a }
            r0.A00()     // Catch:{ all -> 0x002a }
            r2.A00()     // Catch:{ all -> 0x002a }
            r2.close()     // Catch:{ all -> 0x002f }
            r3.close()     // Catch:{ all -> 0x0034 }
            return
        L_0x002a:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0K(X.0sH):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x00c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x00c5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.C16010sH r18, X.C16050sL r19) {
        /*
            r17 = this;
            r1 = r19
            if (r19 == 0) goto L_0x00cc
            r5 = r17
            X.11X r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x00c6 }
            X.0tf r2 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x00c6 }
            X.1cj r3 = r2.A00()     // Catch:{ all -> 0x00c1 }
            r4 = r18
            X.1cF r0 = r4.A0H     // Catch:{ all -> 0x00bc }
            r5.A0F(r2, r3, r1, r0)     // Catch:{ all -> 0x00bc }
            boolean r0 = r4.A0l     // Catch:{ all -> 0x00bc }
            r16 = r0
            boolean r15 = r4.A0Y     // Catch:{ all -> 0x00bc }
            boolean r14 = r4.A0j     // Catch:{ all -> 0x00bc }
            int r13 = r4.A01     // Catch:{ all -> 0x00bc }
            com.whatsapp.jid.UserJid r12 = r4.A0F     // Catch:{ all -> 0x00bc }
            boolean r11 = r4.A0a     // Catch:{ all -> 0x00bc }
            boolean r10 = r4.A0c     // Catch:{ all -> 0x00bc }
            boolean r9 = r4.A0k     // Catch:{ all -> 0x00bc }
            int r8 = r4.A03     // Catch:{ all -> 0x00bc }
            boolean r7 = r4.A0b     // Catch:{ all -> 0x00bc }
            int r6 = r4.A02     // Catch:{ all -> 0x00bc }
            boolean r5 = r4.A0e     // Catch:{ all -> 0x00bc }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00bc }
            r4.<init>()     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = r1.getRawString()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "jid"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r16)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "restrict_mode"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "announcement_group"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "no_frequently_forwarded"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "ephemeral_duration"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = X.C16030sJ.A03(r12)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "creator_jid"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "in_app_support"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "is_suspended"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "require_membership_approval"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "member_add_mode"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "incognito"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "group_state"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "is_pending_requests_banner_acknowledged"
            r4.put(r0, r1)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "wa_group_admin_settings"
            X.AnonymousClass15L.A04(r4, r2, r0)     // Catch:{ all -> 0x00bc }
            r3.A00()     // Catch:{ all -> 0x00bc }
            r3.close()     // Catch:{ all -> 0x00c1 }
            r2.close()     // Catch:{ IllegalArgumentException -> 0x00c6 }
            return
        L_0x00bc:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            throw r0     // Catch:{ IllegalArgumentException -> 0x00c6 }
        L_0x00c6:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update group settings "
            X.AnonymousClass00B.A09(r0, r1)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0L(X.0sH, X.0sL):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|39|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00a2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00a7 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00a7=Splitter:B:40:0x00a7, B:28:0x0098=Splitter:B:28:0x0098} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0M(X.C16010sH r20, java.util.Locale r21) {
        /*
            r19 = this;
            java.lang.String r10 = "verified_name"
            java.lang.String r4 = "lc"
            r6 = r20
            boolean r0 = r6.A0K()
            if (r0 == 0) goto L_0x00aa
            r5 = r21
            java.lang.String r11 = r5.getLanguage()
            java.lang.String r8 = r5.getCountry()
            X.0rv r3 = r6.A0E
            r0 = r19
            X.11X r0 = r0.A00     // Catch:{ all -> 0x00a8 }
            X.0tf r12 = r0.get()     // Catch:{ all -> 0x00a8 }
            java.lang.String r13 = "wa_vnames_localized"
            r0 = 2
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x00a3 }
            r7 = 0
            r9[r7] = r4     // Catch:{ all -> 0x00a3 }
            r2 = 1
            r9[r2] = r10     // Catch:{ all -> 0x00a3 }
            java.lang.String r14 = "jid = ? AND lg = ?"
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = X.C16030sJ.A03(r3)     // Catch:{ all -> 0x00a3 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00a3 }
            r1[r7] = r0     // Catch:{ all -> 0x00a3 }
            r1[r2] = r11     // Catch:{ all -> 0x00a3 }
            r15 = 0
            java.lang.String r16 = "CONTACT_VNAMES_LOCALIZED"
            r18 = r1
            r17 = r9
            android.database.Cursor r9 = X.AnonymousClass15L.A03(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00a3 }
            if (r9 != 0) goto L_0x005e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009c }
            r1.<init>()     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "contact-mgr-db/unable to get localized vname by jid "
            r1.append(r0)     // Catch:{ all -> 0x009c }
            r1.append(r3)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009c }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x009c }
            goto L_0x0098
        L_0x005e:
            r7 = 0
            int r4 = r9.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x009c }
            int r3 = r9.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x009c }
        L_0x0067:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0084
            java.lang.String r2 = r9.getString(r4)     // Catch:{ all -> 0x009c }
            java.lang.String r1 = r9.getString(r3)     // Catch:{ all -> 0x009c }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x007d
            r7 = r1
            goto L_0x0067
        L_0x007d:
            boolean r0 = r2.equals(r8)     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0067
            r7 = r1
        L_0x0084:
            if (r7 == 0) goto L_0x008f
            boolean r0 = r6 instanceof X.C34811ku     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "Setting verified name for ServerContact not allowed"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x009c }
        L_0x008f:
            r6.A0X = r5     // Catch:{ all -> 0x009c }
            goto L_0x0095
        L_0x0092:
            r6.A0V = r7     // Catch:{ all -> 0x009c }
            goto L_0x008f
        L_0x0095:
            r9.close()     // Catch:{ all -> 0x00a3 }
        L_0x0098:
            r12.close()     // Catch:{ all -> 0x00a8 }
            return
        L_0x009c:
            r0 = move-exception
            if (r9 == 0) goto L_0x00a2
            r9.close()     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            throw r0     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            throw r0
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0M(X.0sH, java.util.Locale):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(com.whatsapp.jid.UserJid r10, java.lang.String r11, long r12) {
        /*
            r9 = this;
            r0 = 1
            X.1Zf r5 = new X.1Zf
            r5.<init>((boolean) r0)
            r5.A03()
            r0 = 2
            android.content.ContentValues r8 = new android.content.ContentValues
            r8.<init>(r0)
            java.lang.String r0 = "status"
            r8.put(r0, r11)
            java.lang.Long r1 = java.lang.Long.valueOf(r12)
            java.lang.String r0 = "status_timestamp"
            r8.put(r0, r1)
            r6 = 1
            r7 = 0
            X.11X r0 = r9.A00     // Catch:{ IllegalArgumentException -> 0x0040 }
            X.0tf r4 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0040 }
            java.lang.String r3 = "wa_contacts"
            java.lang.String r2 = "jid = ?"
            java.lang.String[] r1 = new java.lang.String[r6]     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r10.getRawString()     // Catch:{ all -> 0x003b }
            r1[r7] = r0     // Catch:{ all -> 0x003b }
            X.AnonymousClass15L.A01(r8, r4, r3, r2, r1)     // Catch:{ all -> 0x003b }
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0040 }
            goto L_0x005d
        L_0x003b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0040 }
        L_0x0040:
            r2 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update contact status "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = ", statusNull="
            r1.append(r0)
            if (r11 == 0) goto L_0x0053
            r6 = 0
        L_0x0053:
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r2)
        L_0x005d:
            r5.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0N(com.whatsapp.jid.UserJid, java.lang.String, long):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O(java.lang.String r8, java.util.Set r9) {
        /*
            r7 = this;
            java.lang.String r6 = "jid"
            X.11X r0 = r7.A00
            X.0tf r5 = r0.A02()
            X.1cj r4 = r5.A00()     // Catch:{ all -> 0x0040 }
            r0 = 0
            X.AnonymousClass15L.A02(r5, r8, r0, r0)     // Catch:{ all -> 0x003b }
            java.util.Iterator r3 = r9.iterator()     // Catch:{ all -> 0x003b }
        L_0x0014:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x003b }
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2     // Catch:{ all -> 0x003b }
            r0 = 1
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch:{ all -> 0x003b }
            r1.<init>(r0)     // Catch:{ all -> 0x003b }
            java.lang.String r0 = r2.getRawString()     // Catch:{ all -> 0x003b }
            r1.put(r6, r0)     // Catch:{ all -> 0x003b }
            X.AnonymousClass15L.A00(r1, r5, r8)     // Catch:{ all -> 0x003b }
            goto L_0x0014
        L_0x0031:
            r4.A00()     // Catch:{ all -> 0x003b }
            r4.close()     // Catch:{ all -> 0x0040 }
            r5.close()
            return
        L_0x003b:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0O(java.lang.String, java.util.Set):void");
    }

    public final void A0P(Collection collection) {
        Locale A002 = AnonymousClass013.A00(this.A05.A00);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0M((C16010sH) it.next(), A002);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0053 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(java.util.List r8) {
        /*
            r7 = this;
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            r5 = 0
            X.11X r0 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0054 }
            X.0tf r4 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0054 }
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x004f }
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x004a }
        L_0x0014:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x004a }
            X.0rv r0 = (X.C15830rv) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0014
            java.lang.String r1 = "jid"
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x004a }
            r6.put(r1, r0)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "conversation_size"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x004a }
            r6.put(r0, r1)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "conversation_message_count"
            r6.put(r0, r1)     // Catch:{ all -> 0x004a }
            java.lang.String r0 = "wa_contact_storage_usage"
            X.AnonymousClass15L.A04(r6, r4, r0)     // Catch:{ all -> 0x004a }
            goto L_0x0014
        L_0x0040:
            r3.A00()     // Catch:{ all -> 0x004a }
            r3.close()     // Catch:{ all -> 0x004f }
            r4.close()     // Catch:{ IllegalArgumentException -> 0x0054 }
            return
        L_0x004a:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to insert batch to storage usage table"
            X.AnonymousClass00B.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0Q(java.util.List):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:165:0x0372 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x0380 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:180:0x0385 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:180:0x0385=Splitter:B:180:0x0385, B:170:0x0378=Splitter:B:170:0x0378} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(java.util.List r31, int r32, boolean r33, boolean r34) {
        /*
            r30 = this;
            r1 = 1
            X.1Zf r15 = new X.1Zf
            r15.<init>((boolean) r1)
            r15.A03()
            java.lang.String r0 = "is_whatsapp_user"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            if (r33 == 0) goto L_0x0084
            java.lang.String r0 = " = 0"
        L_0x0014:
            r2.append(r0)
            r6 = r30
            X.0sK r0 = r6.A01
            r0.A0B()
            X.1ZT r7 = r0.A05
            if (r7 == 0) goto L_0x0032
            java.lang.String r0 = " AND "
            r2.append(r0)
            java.lang.String r0 = "wa_contacts.jid"
            r2.append(r0)
            java.lang.String r0 = " != ?"
            r2.append(r0)
        L_0x0032:
            r8 = 1
            r10 = r32
            if (r10 == r1) goto L_0x003a
            r0 = 2
            if (r10 != r0) goto L_0x006b
        L_0x003a:
            java.lang.String r0 = " AND ("
            r2.append(r0)
            java.lang.String r4 = "raw_contact_id"
            r2.append(r4)
            java.lang.String r0 = " > 0 OR "
            r2.append(r0)
            r2.append(r4)
            java.lang.String r3 = " = "
            r2.append(r3)
            r0 = -2
            r2.append(r0)
            java.lang.String r0 = " OR "
            r2.append(r0)
            r2.append(r4)
            r2.append(r3)
            r0 = -3
            r2.append(r0)
            r0 = 41
            r2.append(r0)
        L_0x006b:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            r4 = 0
            if (r7 != 0) goto L_0x007b
            java.lang.String[] r0 = new java.lang.String[r4]
        L_0x0075:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            goto L_0x0087
        L_0x007b:
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.String r1 = r7.getRawString()
            r0[r4] = r1
            goto L_0x0075
        L_0x0084:
            java.lang.String r0 = " = 1"
            goto L_0x0014
        L_0x0087:
            r14 = r31
            X.11X r1 = r6.A00     // Catch:{ IllegalArgumentException -> 0x0386 }
            r29 = r1
            X.0tf r22 = r29.get()     // Catch:{ IllegalArgumentException -> 0x0386 }
            java.lang.String r23 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            java.lang.String[] r27 = A08     // Catch:{ all -> 0x0381 }
            java.lang.String r24 = r2.toString()     // Catch:{ all -> 0x0381 }
            java.lang.String r25 = "display_name, wa_contacts.jid, phone_type ASC"
            java.lang.String r26 = "CONTACTS"
            r28 = r0
            android.database.Cursor r21 = X.AnonymousClass15L.A03(r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0381 }
            if (r21 != 0) goto L_0x00b2
            java.lang.String r0 = "contact-mgr-db/get-picker-list/unable to get contact picker list"
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x00af }
            r22.close()     // Catch:{ IllegalArgumentException -> 0x0386 }
            return
        L_0x00af:
            r0 = move-exception
            goto L_0x0380
        L_0x00b2:
            boolean r0 = r21.moveToNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0317
            X.0sH r9 = X.C34761kp.A00(r21)     // Catch:{ all -> 0x037c }
            X.0rv r1 = r9.A0E     // Catch:{ all -> 0x037c }
            if (r1 == 0) goto L_0x00b2
            boolean r0 = X.C16030sJ.A0Q(r1)     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x00b2
            boolean r0 = X.C16030sJ.A0R(r1)     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x00b2
            int r2 = r1.getType()     // Catch:{ all -> 0x037c }
            r0 = 11
            if (r2 == r0) goto L_0x00b2
            r0 = 3
            if (r10 != r0) goto L_0x00de
            boolean r0 = X.C16030sJ.A0H(r1)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x00de
            goto L_0x00b2
        L_0x00de:
            boolean r0 = r5.containsKey(r1)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0301
            java.lang.Object r8 = r5.get(r1)     // Catch:{ all -> 0x037c }
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x037c }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x037c }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x037c }
            r7.<init>()     // Catch:{ all -> 0x037c }
            X.1ko r0 = r9.A0D     // Catch:{ all -> 0x037c }
            java.lang.String r12 = "contact-mgr-db/process-contact/removing duplicate contact with null key "
            r20 = 1
            if (r0 != 0) goto L_0x0134
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x030e
            java.lang.Object r13 = r8.get(r4)     // Catch:{ all -> 0x037c }
            X.0sH r13 = (X.C16010sH) r13     // Catch:{ all -> 0x037c }
            X.1ko r0 = r13.A0D     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x011c
            long r2 = r13.A09     // Catch:{ all -> 0x037c }
            long r0 = r9.A09     // Catch:{ all -> 0x037c }
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x012e
            r8.remove(r13)     // Catch:{ all -> 0x037c }
            r7.add(r13)     // Catch:{ all -> 0x037c }
            r8.add(r9)     // Catch:{ all -> 0x037c }
            goto L_0x0131
        L_0x011c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r0.<init>()     // Catch:{ all -> 0x037c }
            r0.append(r12)     // Catch:{ all -> 0x037c }
            r0.append(r9)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
        L_0x012e:
            r7.add(r9)     // Catch:{ all -> 0x037c }
        L_0x0131:
            r19 = 1
            goto L_0x0136
        L_0x0134:
            r19 = 0
        L_0x0136:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x037c }
            r3.<init>()     // Catch:{ all -> 0x037c }
            if (r19 != 0) goto L_0x02b5
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x0141:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x016e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x037c }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x037c }
            X.1ko r0 = r1.A0D     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x0141
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r0.<init>()     // Catch:{ all -> 0x037c }
            r0.append(r12)     // Catch:{ all -> 0x037c }
            r0.append(r1)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            r3.add(r1)     // Catch:{ all -> 0x037c }
            r7.add(r1)     // Catch:{ all -> 0x037c }
            r8.add(r9)     // Catch:{ all -> 0x037c }
            goto L_0x02b3
        L_0x016e:
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x0172:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x019e
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x037c }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x037c }
            X.1ko r1 = r9.A0D     // Catch:{ all -> 0x037c }
            X.1ko r0 = r0.A0D     // Catch:{ all -> 0x037c }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0172
            java.lang.String r1 = "contact-mgr-db/process-contact/removing duplicate contact with matching key "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r0.<init>(r1)     // Catch:{ all -> 0x037c }
            r0.append(r9)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            r7.add(r9)     // Catch:{ all -> 0x037c }
            goto L_0x02b3
        L_0x019e:
            java.util.Iterator r13 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x01a2:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x01dd
            java.lang.Object r2 = r13.next()     // Catch:{ all -> 0x037c }
            X.0sH r2 = (X.C16010sH) r2     // Catch:{ all -> 0x037c }
            X.1ko r0 = r9.A0D     // Catch:{ all -> 0x037c }
            long r0 = r0.A00     // Catch:{ all -> 0x037c }
            r16 = -2
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 == 0) goto L_0x01a2
            X.1ko r0 = r2.A0D     // Catch:{ all -> 0x037c }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x037c }
            long r0 = r0.A00     // Catch:{ all -> 0x037c }
            int r12 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r12 != 0) goto L_0x01a2
            java.lang.String r1 = "contact-mgr-db/process-contact/removing sim card duplicate contact "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r0.<init>(r1)     // Catch:{ all -> 0x037c }
            r0.append(r2)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            r3.add(r2)     // Catch:{ all -> 0x037c }
            r7.add(r2)     // Catch:{ all -> 0x037c }
            r19 = 1
            goto L_0x01a2
        L_0x01dd:
            if (r19 != 0) goto L_0x02af
            java.util.Iterator r12 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x01e3:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0226
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x037c }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r1.A09()     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x01fb
            java.lang.String r0 = r9.A09()     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x020f
        L_0x01fb:
            java.lang.String r0 = r1.A09()     // Catch:{ all -> 0x037c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x01e3
            java.lang.String r0 = r9.A09()     // Catch:{ all -> 0x037c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x01e3
        L_0x020f:
            java.lang.String r2 = "contact-mgr-db/process-contact/deduping null/empty display name contact "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r0.<init>(r2)     // Catch:{ all -> 0x037c }
            r0.append(r1)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            r3.add(r1)     // Catch:{ all -> 0x037c }
            r19 = 1
            goto L_0x01e3
        L_0x0226:
            if (r19 != 0) goto L_0x02af
            java.lang.String r0 = r9.A09()     // Catch:{ all -> 0x037c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0252
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x0236:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0252
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x037c }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.A09()     // Catch:{ all -> 0x037c }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x037c }
            if (r0 != 0) goto L_0x0236
            java.lang.String r0 = "contact-mgr-db/process-contact/ignoring empty name since we have non-empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x037c }
            goto L_0x02b3
        L_0x0252:
            java.util.Iterator r18 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x0256:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0288
            java.lang.Object r1 = r18.next()     // Catch:{ all -> 0x037c }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r1.A09()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0256
            java.lang.String r2 = r1.A09()     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r9.A09()     // Catch:{ all -> 0x037c }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0256
            long r16 = r9.A05()     // Catch:{ all -> 0x037c }
            long r12 = r1.A05()     // Catch:{ all -> 0x037c }
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0256
            r3.add(r1)     // Catch:{ all -> 0x037c }
            r19 = 1
            goto L_0x0256
        L_0x0288:
            if (r19 != 0) goto L_0x02af
            java.lang.String r0 = r9.A09()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x02b5
            java.util.Iterator r2 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x0294:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x02b8
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x037c }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x037c }
            java.lang.String r1 = r9.A09()     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r0.A09()     // Catch:{ all -> 0x037c }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x0294
            goto L_0x02b5
        L_0x02af:
            r8.add(r9)     // Catch:{ all -> 0x037c }
            goto L_0x02b5
        L_0x02b3:
            r19 = 1
        L_0x02b5:
            r20 = r19
            goto L_0x02bb
        L_0x02b8:
            r8.add(r9)     // Catch:{ all -> 0x037c }
        L_0x02bb:
            r8.removeAll(r3)     // Catch:{ all -> 0x037c }
            if (r20 != 0) goto L_0x02fc
            java.lang.String r0 = "existing_contacts: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r2.<init>(r0)     // Catch:{ all -> 0x037c }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x037c }
        L_0x02cb:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x02de
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x037c }
            r2.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = ", "
            r2.append(r0)     // Catch:{ all -> 0x037c }
            goto L_0x02cb
        L_0x02de:
            java.lang.String r0 = "contact-mgr-db/process-contact/contacts are identical, yet not ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x037c }
            r1.<init>(r0)     // Catch:{ all -> 0x037c }
            r1.append(r2)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = " and "
            r1.append(r0)     // Catch:{ all -> 0x037c }
            r1.append(r9)     // Catch:{ all -> 0x037c }
            r0 = 41
            r1.append(r0)     // Catch:{ all -> 0x037c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x037c }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x037c }
        L_0x02fc:
            r11.addAll(r7)     // Catch:{ all -> 0x037c }
            goto L_0x00b2
        L_0x0301:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x037c }
            r0.<init>()     // Catch:{ all -> 0x037c }
            r0.add(r9)     // Catch:{ all -> 0x037c }
            r5.put(r1, r0)     // Catch:{ all -> 0x037c }
            goto L_0x00b2
        L_0x030e:
            java.lang.String r1 = "same jid contacts must not be empty"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x037c }
            r0.<init>(r1)     // Catch:{ all -> 0x037c }
            throw r0     // Catch:{ all -> 0x037c }
        L_0x0317:
            r21.close()     // Catch:{ all -> 0x0381 }
            java.util.Set r0 = r5.entrySet()     // Catch:{ all -> 0x0381 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0381 }
        L_0x0322:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0381 }
            if (r0 == 0) goto L_0x0338
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0381 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0381 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0381 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x0381 }
            r14.addAll(r0)     // Catch:{ all -> 0x0381 }
            goto L_0x0322
        L_0x0338:
            r6.A0P(r14)     // Catch:{ all -> 0x0381 }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x0381 }
            if (r0 != 0) goto L_0x0378
            X.0tf r3 = r29.A02()     // Catch:{ all -> 0x0381 }
            if (r34 == 0) goto L_0x034c
            X.1cj r2 = r3.A01()     // Catch:{ all -> 0x0373 }
            goto L_0x0350
        L_0x034c:
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x0373 }
        L_0x0350:
            java.util.Iterator r1 = r11.iterator()     // Catch:{ all -> 0x036e }
        L_0x0354:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x036e }
            if (r0 == 0) goto L_0x0364
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x036e }
            X.0sH r0 = (X.C16010sH) r0     // Catch:{ all -> 0x036e }
            r6.A0E(r3, r2, r0)     // Catch:{ all -> 0x036e }
            goto L_0x0354
        L_0x0364:
            r2.A00()     // Catch:{ all -> 0x036e }
            r2.close()     // Catch:{ all -> 0x0373 }
            r3.close()     // Catch:{ all -> 0x0381 }
            goto L_0x0378
        L_0x036e:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0372 }
        L_0x0372:
            throw r0     // Catch:{ all -> 0x0373 }
        L_0x0373:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0380 }
            goto L_0x0380
        L_0x0378:
            r22.close()     // Catch:{ IllegalArgumentException -> 0x0386 }
            goto L_0x038c
        L_0x037c:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x0380 }
        L_0x0380:
            throw r0     // Catch:{ all -> 0x0381 }
        L_0x0381:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x0385 }
        L_0x0385:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0386 }
        L_0x0386:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to apply contact picker list de-dupe batch "
            X.AnonymousClass00B.A09(r0, r1)
        L_0x038c:
            r14.size()
            r15.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C224818c.A0R(java.util.List, int, boolean, boolean):void");
    }
}
