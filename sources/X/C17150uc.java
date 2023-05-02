package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape0S0210000_I0;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0uc  reason: invalid class name and case insensitive filesystem */
public class C17150uc {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final C16300so A01;
    public final C16040sK A02;
    public final AnonymousClass13V A03;
    public final AnonymousClass16O A04;
    public final AnonymousClass16I A05;
    public final AnonymousClass16G A06;
    public final AnonymousClass16N A07;
    public final AnonymousClass16K A08;
    public final AnonymousClass16E A09;
    public final AnonymousClass235 A0A;
    public final C16440t3 A0B;
    public final C15860rz A0C;
    public final C17190ug A0D;
    public final C18700x7 A0E;
    public final C16320sq A0F;
    public final Set A0G = new HashSet();

    static {
        TimeUnit.HOURS.toMillis(24);
    }

    public C17150uc(C16300so r3, C16040sK r4, AnonymousClass13V r5, AnonymousClass16O r6, AnonymousClass16I r7, AnonymousClass16G r8, AnonymousClass16N r9, AnonymousClass16K r10, AnonymousClass16E r11, C16440t3 r12, C15860rz r13, C17190ug r14, C18700x7 r15, C16320sq r16, AnonymousClass11X r17) {
        this.A0B = r12;
        this.A02 = r4;
        this.A0F = r16;
        this.A01 = r3;
        this.A0D = r14;
        this.A0C = r13;
        this.A04 = r6;
        this.A03 = r5;
        this.A0E = r15;
        this.A07 = r9;
        this.A08 = r10;
        this.A05 = r7;
        this.A0A = new AnonymousClass235(r17);
        this.A06 = r8;
        this.A09 = r11;
    }

    public AnonymousClass23A A00(C16300so r10, UserJid userJid, String str) {
        int A002 = this.A04.A00();
        Context context = this.A0E.A00.A00;
        C17190ug r5 = this.A0D;
        return new AnonymousClass23A(r10, this, this.A03, userJid, r5, (C18630x0) ((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, context))).A1m.get(), str, A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (r1 != null) goto L_0x0045;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A01(com.whatsapp.jid.UserJid r12) {
        /*
            r11 = this;
            X.235 r0 = r11.A0A
            java.lang.String r3 = "business_description"
            r7 = 0
            if (r12 != 0) goto L_0x000d
            java.lang.String r0 = "contact-mgr-db/cannot get business description details by null jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r7
        L_0x000d:
            java.lang.String r2 = r12.getRawString()
            X.11X r0 = r0.A00
            X.0tf r4 = r0.get()
            java.lang.String r5 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)"
            r1 = 1
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ all -> 0x004c }
            r0 = 0
            r9[r0] = r3     // Catch:{ all -> 0x004c }
            java.lang.String r6 = "wa_biz_profiles.jid = ?"
            java.lang.String[] r10 = new java.lang.String[r1]     // Catch:{ all -> 0x004c }
            r10[r0] = r2     // Catch:{ all -> 0x004c }
            java.lang.String r8 = "CONTACT_BIZ_PROFILES"
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x0043
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0043
            int r0 = r1.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x003e }
            java.lang.String r7 = r1.getString(r0)     // Catch:{ all -> 0x003e }
            goto L_0x0045
        L_0x003e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0042 }
        L_0x0042:
            throw r0     // Catch:{ all -> 0x004c }
        L_0x0043:
            if (r1 == 0) goto L_0x0048
        L_0x0045:
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x0048:
            r4.close()
            return r7
        L_0x004c:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0050 }
        L_0x0050:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17150uc.A01(com.whatsapp.jid.UserJid):java.lang.String");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A02() {
        /*
            r13 = this;
            X.235 r0 = r13.A0A
            java.lang.String r2 = "tag"
            java.lang.String r1 = "jid"
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.11X r0 = r0.A00
            X.0tf r6 = r0.get()
            java.lang.String r7 = "wa_biz_profiles LEFT JOIN wa_biz_profiles_websites ON (wa_biz_profiles._id = wa_biz_profiles_websites.wa_biz_profile_id)"
            r0 = 2
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ all -> 0x0056 }
            r0 = 0
            r11[r0] = r1     // Catch:{ all -> 0x0056 }
            r0 = 1
            r11[r0] = r2     // Catch:{ all -> 0x0056 }
            r8 = 0
            java.lang.String r10 = "CONTACT_BIZ_PROFILES"
            r12 = r8
            r9 = r8
            android.database.Cursor r4 = X.AnonymousClass15L.A03(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0056 }
            if (r4 == 0) goto L_0x0052
            int r3 = r4.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x004d }
            int r2 = r4.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x004d }
        L_0x0031:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x004d }
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x004d }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r0)     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x0031
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x004d }
            r5.put(r1, r0)     // Catch:{ all -> 0x004d }
            goto L_0x0031
        L_0x0049:
            r4.close()     // Catch:{ all -> 0x0056 }
            goto L_0x0052
        L_0x004d:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ all -> 0x0056 }
        L_0x0052:
            r6.close()
            return r5
        L_0x0056:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x005a }
        L_0x005a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17150uc.A02():java.util.Map");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (java.lang.Boolean.valueOf(r2).booleanValue() != false) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass23B r12, com.whatsapp.jid.UserJid r13) {
        /*
            r11 = this;
            X.0sq r2 = r11.A0F
            X.23C r1 = new X.23C
            r6 = r13
            r1.<init>(r12, r11, r13)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r2.Ack(r1, r0)
            X.16I r4 = r11.A05
            X.0pd r1 = r4.A05
            r0 = 1693(0x69d, float:2.372E-42)
            X.0tM r3 = X.C16620tM.A02
            java.lang.String r1 = r1.A06(r3, r0)
            r5 = 0
            if (r13 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            java.lang.String r0 = r13.user
            X.C18450wi.A0B(r0)
            boolean r0 = X.C008603x.A0F(r1, r0)
            if (r0 == 0) goto L_0x002b
            r5 = 1
        L_0x002b:
            X.0rz r0 = r4.A03
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "pref_commerce_metadata_cache_enable"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0072
            if (r5 == 0) goto L_0x0075
            X.22m r0 = r4.A03()
            if (r0 == 0) goto L_0x0072
            java.util.List r1 = r0.A00
            boolean r0 = r1.isEmpty()
            r2 = 0
            if (r0 != 0) goto L_0x0068
            java.util.Iterator r1 = r1.iterator()
        L_0x0053:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r0 = r1.next()
            X.22i r0 = (X.C439922i) r0
            java.lang.String r0 = r0.A03
            X.22i r0 = r4.A01(r0)
            if (r0 != 0) goto L_0x0053
            r2 = 1
        L_0x0068:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0075
        L_0x0072:
            r4.A04()
        L_0x0075:
            X.16G r4 = r11.A06
            X.0pd r1 = r4.A06
            r0 = 1763(0x6e3, float:2.47E-42)
            java.lang.String r1 = r1.A06(r3, r0)
            if (r13 == 0) goto L_0x00b1
            java.lang.String r0 = r13.user
            if (r0 == 0) goto L_0x00b1
            if (r1 == 0) goto L_0x00b1
            boolean r0 = X.C008603x.A0F(r1, r0)
            if (r0 == 0) goto L_0x00b1
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x00a8
            r0 = 1
            r4.A01 = r0
            X.0tz r0 = r4.A03
            android.content.Context r3 = r0.A00
            r0 = 5
            com.facebook.redex.IDxBReceiverShape7S0100000_2_I0 r2 = new com.facebook.redex.IDxBReceiverShape7S0100000_2_I0
            r2.<init>(r4, r0)
            java.lang.String r1 = "android.intent.action.LOCALE_CHANGED"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
        L_0x00a8:
            boolean r0 = r4.A02()
            if (r0 == 0) goto L_0x00b1
            r4.A01()
        L_0x00b1:
            boolean r0 = r11.A0A(r13)
            if (r0 == 0) goto L_0x00c1
            X.16K r4 = r11.A08
            r10 = 0
            r5 = 0
            r8 = r5
            r9 = r5
            r7 = r5
            r4.A01(r5, r6, r7, r8, r9, r10)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17150uc.A03(X.23B, com.whatsapp.jid.UserJid):void");
    }

    public void A04(AnonymousClass236 r9, UserJid userJid) {
        AnonymousClass16E r5 = this.A09;
        C18450wi.A0H(userJid, 0);
        long currentTimeMillis = System.currentTimeMillis();
        C15860rz r0 = r5.A04;
        String rawString = userJid.getRawString();
        AnonymousClass01D r4 = r0.A01;
        StringBuilder sb = new StringBuilder("extensions_metadata_timestamp_");
        sb.append(rawString);
        if (currentTimeMillis <= ((SharedPreferences) r4.get()).getLong(sb.toString(), 0)) {
            String rawString2 = userJid.getRawString();
            StringBuilder sb2 = new StringBuilder("extensions_metadata_");
            sb2.append(rawString2);
            String string = ((SharedPreferences) r4.get()).getString(sb2.toString(), (String) null);
            if (string != null) {
                if (r9 != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        ArrayList arrayList = new ArrayList();
                        JSONArray optJSONArray = jSONObject.optJSONArray("extensionIdLinks");
                        int i2 = 0;
                        if (optJSONArray != null) {
                            int length = optJSONArray.length();
                            while (i2 < length) {
                                int i3 = i2 + 1;
                                JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
                                if (optJSONObject != null) {
                                    arrayList.add(AnonymousClass237.A00(optJSONObject));
                                }
                                i2 = i3;
                            }
                        }
                        r9.ALZ(new AnonymousClass239(arrayList));
                        return;
                    } catch (JSONException unused) {
                    }
                } else {
                    return;
                }
            }
        }
        r5.A07.Acl(new RunnableRunnableShape0S0300000_I0(r5, userJid, r9, 18));
    }

    public void A05(AnonymousClass1U3 r2, UserJid userJid, String str) {
        A00(this.A01, userJid, str).A00(r2);
    }

    public void A06(C35611mD r5, UserJid userJid) {
        if (r5 != null) {
            if (this.A02.A0I(userJid)) {
                C15860rz r3 = this.A0C;
                r3.A0K().putLong("smb_last_my_business_profile_sync_time", this.A0B.A00()).apply();
            }
            AnonymousClass235 r1 = this.A0A;
            HashMap hashMap = new HashMap();
            hashMap.put(userJid, r5);
            r1.A03(hashMap);
        }
    }

    public void A07(UserJid userJid, String str) {
        C15860rz r0 = this.A0C;
        String rawString = userJid.getRawString();
        SharedPreferences.Editor A0K = r0.A0K();
        StringBuilder sb = new StringBuilder("dc_default_postcode_");
        sb.append(rawString);
        A0K.putString(sb.toString(), str).apply();
    }

    public void A08(UserJid userJid, boolean z2) {
        this.A0F.Acl(new RunnableRunnableShape0S0210000_I0(this, userJid, 1, z2));
    }

    public boolean A09() {
        return (this.A04.A00() & 128) > 0;
    }

    public boolean A0A(UserJid userJid) {
        String A062;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        AnonymousClass16K r0 = this.A08;
        if (userJid == null || (A062 = r0.A03.A06(C16620tM.A02, 1320)) == null) {
            return false;
        }
        try {
            JSONObject optJSONObject2 = new JSONObject(A062).optJSONObject("galaxy_message");
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("flows")) == null) {
                return false;
            }
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                JSONObject optJSONObject3 = optJSONObject.optJSONObject(keys.next());
                if (!(optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("supported_businesses")) == null)) {
                    int length = optJSONArray.length();
                    int i2 = 0;
                    while (i2 < length) {
                        int i3 = i2 + 1;
                        String str = userJid.user;
                        String string = optJSONArray.getString(i2);
                        if (str == null) {
                            if (string == null) {
                                return true;
                            }
                        } else if (str.equalsIgnoreCase(string)) {
                            return true;
                        }
                        i2 = i3;
                    }
                    continue;
                }
            }
            return false;
        } catch (Exception e2) {
            Log.w(C18450wi.A06("ExtensionsConnectionManager/isExtensionsBusiness/", e2.getMessage()));
            return false;
        }
    }
}
