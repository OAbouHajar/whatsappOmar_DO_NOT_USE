package X;

import android.content.ContentResolver;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.16k  reason: invalid class name and case insensitive filesystem */
public class C220416k {
    public final C16040sK A00;
    public final AnonymousClass19Y A01;
    public final C15860rz A02;
    public final AnonymousClass013 A03;
    public final C17020u3 A04;
    public final C16320sq A05;

    public C220416k(C16040sK r1, AnonymousClass19Y r2, C15860rz r3, AnonymousClass013 r4, C17020u3 r5, C16320sq r6) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static final byte A00(String str) {
        if (str.equals("vnd.android.cursor.item/name")) {
            return 0;
        }
        if (str.equals("vnd.android.cursor.item/phone_v2")) {
            return 1;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.obwhatsapp.profile")) {
            return 2;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call")) {
            return 3;
        }
        if (str.equals("vnd.android.cursor.item/vnd.com.obwhatsapp.video.call")) {
            return 4;
        }
        StringBuilder sb = new StringBuilder("no code found for ");
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public static final boolean A01(ContentResolver contentResolver, String str, ArrayList arrayList) {
        boolean z2;
        try {
            contentResolver.applyBatch("com.android.contacts", arrayList);
            z2 = true;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidcontactssync/");
            sb.append(str);
            Log.e(sb.toString(), e2);
            z2 = false;
        } catch (Throwable th) {
            arrayList.clear();
            throw th;
        }
        arrayList.clear();
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0036 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0057 A[Catch:{ NullPointerException -> 0x0066 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.accounts.Account A02(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r4 = "com.android.contacts"
            android.accounts.AccountManager r6 = android.accounts.AccountManager.get(r8)
            java.lang.String r5 = "com.obwhatsapp"
            android.accounts.Account[] r1 = r6.getAccountsByType(r5)
            int r0 = r1.length
            r2 = 0
            if (r0 == 0) goto L_0x0025
            r0 = 0
            r3 = r1[r0]
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r1 = r8.getString(r0)
            java.lang.String r0 = r3.name
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0051
            r6.removeAccount(r3, r2, r2)
        L_0x0025:
            X.0sK r0 = r7.A00
            r0.A0B()
            X.1ZT r0 = r0.A05
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = "androidcontactssync/get-or-create-account null jid"
        L_0x0030:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = r2
        L_0x0034:
            if (r3 != 0) goto L_0x0051
            return r2
        L_0x0037:
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r0 = r8.getString(r0)
            android.accounts.Account r3 = new android.accounts.Account
            r3.<init>(r0, r5)
            boolean r0 = r6.addAccountExplicitly(r3, r2, r2)
            if (r0 == 0) goto L_0x004e
            r0 = 1
            android.content.ContentResolver.setIsSyncable(r3, r4, r0)
            goto L_0x0034
        L_0x004e:
            java.lang.String r0 = "androidcontactssync/get-or-create-account failed to add account"
            goto L_0x0030
        L_0x0051:
            boolean r0 = android.content.ContentResolver.getSyncAutomatically(r3, r4)     // Catch:{ NullPointerException -> 0x0066 }
            if (r0 != 0) goto L_0x005b
            r0 = 1
            android.content.ContentResolver.setSyncAutomatically(r3, r4, r0)     // Catch:{ NullPointerException -> 0x0066 }
        L_0x005b:
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ NullPointerException -> 0x0066 }
            r2.<init>()     // Catch:{ NullPointerException -> 0x0066 }
            r0 = 3600(0xe10, double:1.7786E-320)
            android.content.ContentResolver.addPeriodicSync(r3, r4, r2, r0)     // Catch:{ NullPointerException -> 0x0066 }
            return r3
        L_0x0066:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Attempt to invoke virtual method 'com.prism.gaia"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L_0x007a
            return r3
        L_0x007a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220416k.A02(android.content.Context):android.accounts.Account");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0099 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(android.accounts.Account r23, android.content.Context r24) {
        /*
            r22 = this;
            r3 = r22
            monitor-enter(r3)
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x016b }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x016b }
            java.lang.String r1 = "account_name"
            r4 = r23
            java.lang.String r0 = r4.name     // Catch:{ all -> 0x016b }
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r1 = "account_type"
            java.lang.String r0 = r4.type     // Catch:{ all -> 0x016b }
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r2 = "caller_is_syncadapter"
            java.lang.String r1 = "true"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x016b }
            android.net.Uri r17 = r0.build()     // Catch:{ all -> 0x016b }
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x016b }
            android.net.Uri$Builder r0 = r0.buildUpon()     // Catch:{ all -> 0x016b }
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x016b }
            android.net.Uri r15 = r0.build()     // Catch:{ all -> 0x016b }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x016b }
            r9.<init>()     // Catch:{ all -> 0x016b }
            r6 = r24
            android.content.ContentResolver r16 = r6.getContentResolver()     // Catch:{ all -> 0x016b }
            r0 = 4
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x016b }
            java.lang.String r4 = "_id"
            r14 = 0
            r8[r14] = r4     // Catch:{ all -> 0x016b }
            java.lang.String r2 = "sync1"
            r7 = 1
            r8[r7] = r2     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "sync2"
            r5 = 2
            r8[r5] = r0     // Catch:{ all -> 0x016b }
            r1 = 3
            java.lang.String r0 = "display_name"
            r8[r1] = r0     // Catch:{ all -> 0x016b }
            r19 = 0
            r21 = r19
            r18 = r8
            r20 = r19
            android.database.Cursor r12 = r16.query(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x016b }
            if (r12 == 0) goto L_0x009d
            int r13 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0095 }
            int r11 = r12.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0095 }
            int r10 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0095 }
        L_0x0074:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x009a
            java.lang.String r0 = r12.getString(r11)     // Catch:{ all -> 0x0095 }
            com.whatsapp.jid.UserJid r8 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x0095 }
            if (r8 == 0) goto L_0x0074
            long r0 = r12.getLong(r13)     // Catch:{ all -> 0x0095 }
            java.lang.String r4 = r12.getString(r10)     // Catch:{ all -> 0x0095 }
            X.27p r2 = new X.27p     // Catch:{ all -> 0x0095 }
            r2.<init>(r8, r4, r0)     // Catch:{ all -> 0x0095 }
            r9.add(r2)     // Catch:{ all -> 0x0095 }
            goto L_0x0074
        L_0x0095:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x0099 }
        L_0x0099:
            throw r0     // Catch:{ all -> 0x016b }
        L_0x009a:
            r12.close()     // Catch:{ all -> 0x016b }
        L_0x009d:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x016b }
            r4.<init>()     // Catch:{ all -> 0x016b }
            java.util.Iterator r12 = r9.iterator()     // Catch:{ all -> 0x016b }
        L_0x00a6:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x016b }
            if (r0 == 0) goto L_0x015a
            java.lang.Object r8 = r12.next()     // Catch:{ all -> 0x016b }
            X.27p r8 = (X.C452327p) r8     // Catch:{ all -> 0x016b }
            int r1 = r4.size()     // Catch:{ all -> 0x016b }
            r0 = 100
            if (r1 < r0) goto L_0x00c3
            android.content.ContentResolver r1 = r6.getContentResolver()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "error updating contact data action strings"
            A01(r1, r0, r4)     // Catch:{ all -> 0x016b }
        L_0x00c3:
            X.013 r2 = r3.A03     // Catch:{ all -> 0x016b }
            com.whatsapp.jid.UserJid r0 = r8.A01     // Catch:{ all -> 0x016b }
            java.lang.String r1 = r0.user     // Catch:{ all -> 0x016b }
            X.1Mf r0 = X.C26071Mf.A00()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = X.C24561Gk.A00(r0, r1)     // Catch:{ all -> 0x016b }
            java.lang.String r11 = r2.A0H(r0)     // Catch:{ all -> 0x016b }
            long r0 = r8.A00     // Catch:{ all -> 0x016b }
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r15)     // Catch:{ all -> 0x016b }
            java.lang.String r9 = "raw_contact_id=? and mimetype=?"
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x016b }
            r1[r14] = r10     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.obwhatsapp.profile"
            r1[r7] = r0     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r2 = r2.withSelection(r9, r1)     // Catch:{ all -> 0x016b }
            java.lang.String r8 = "data3"
            r1 = 2131886218(0x7f12008a, float:1.9407009E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x016b }
            r0[r14] = r11     // Catch:{ all -> 0x016b }
            java.lang.String r0 = r6.getString(r1, r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r0 = r2.withValue(r8, r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r0 = r0.withYieldAllowed(r7)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x016b }
            r4.add(r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r15)     // Catch:{ all -> 0x016b }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x016b }
            r1[r14] = r10     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call"
            r1[r7] = r0     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r2 = r2.withSelection(r9, r1)     // Catch:{ all -> 0x016b }
            r1 = 2131886220(0x7f12008c, float:1.9407013E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x016b }
            r0[r14] = r11     // Catch:{ all -> 0x016b }
            java.lang.String r0 = r6.getString(r1, r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r0 = r2.withValue(r8, r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x016b }
            r4.add(r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r15)     // Catch:{ all -> 0x016b }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x016b }
            r1[r14] = r10     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.obwhatsapp.video.call"
            r1[r7] = r0     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r2 = r2.withSelection(r9, r1)     // Catch:{ all -> 0x016b }
            r1 = 2131886219(0x7f12008b, float:1.940701E38)
            java.lang.Object[] r0 = new java.lang.Object[r7]     // Catch:{ all -> 0x016b }
            r0[r14] = r11     // Catch:{ all -> 0x016b }
            java.lang.String r0 = r6.getString(r1, r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation$Builder r0 = r2.withValue(r8, r0)     // Catch:{ all -> 0x016b }
            android.content.ContentProviderOperation r0 = r0.build()     // Catch:{ all -> 0x016b }
            r4.add(r0)     // Catch:{ all -> 0x016b }
            goto L_0x00a6
        L_0x015a:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x016b }
            if (r0 != 0) goto L_0x0169
            android.content.ContentResolver r1 = r6.getContentResolver()     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "error updating contact data action strings"
            A01(r1, r0, r4)     // Catch:{ all -> 0x016b }
        L_0x0169:
            monitor-exit(r3)
            return
        L_0x016b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C220416k.A03(android.accounts.Account, android.content.Context):void");
    }
}
