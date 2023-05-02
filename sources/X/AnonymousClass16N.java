package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.16N  reason: invalid class name */
public class AnonymousClass16N {
    public long A00;
    public String A01;
    public String A02;
    public Map A03 = new HashMap();
    public final C16300so A04;
    public final AnonymousClass16L A05;
    public final AnonymousClass16J A06;
    public final AnonymousClass16M A07;
    public final C15860rz A08;
    public final C17290uq A09;
    public final C14710pd A0A;
    public final C17190ug A0B;

    public AnonymousClass16N(C16300so r2, AnonymousClass16L r3, AnonymousClass16J r4, AnonymousClass16M r5, C15860rz r6, C17290uq r7, C14710pd r8, C17190ug r9) {
        this.A0B = r9;
        this.A08 = r6;
        this.A04 = r2;
        this.A06 = r4;
        this.A05 = r3;
        this.A09 = r7;
        this.A07 = r5;
        this.A0A = r8;
    }

    public String A00(UserJid userJid) {
        C15860rz r0 = this.A08;
        String rawString = userJid.getRawString();
        StringBuilder sb = new StringBuilder("smb_business_direct_connection_public_key_");
        sb.append(rawString);
        return ((SharedPreferences) r0.A01.get()).getString(sb.toString(), (String) null);
    }

    public synchronized String A01(UserJid userJid) {
        String str;
        if (this.A02 == null || (str = this.A01) == null) {
            C15860rz r0 = this.A08;
            String rawString = userJid.getRawString();
            StringBuilder sb = new StringBuilder("smb_business_direct_connection_enc_string_");
            sb.append(rawString);
            str = ((SharedPreferences) r0.A01.get()).getString(sb.toString(), (String) null);
        }
        return str;
    }

    public synchronized void A02(AnonymousClass22Z r6, UserJid userJid, boolean z2) {
        Map map = this.A03;
        List list = (List) map.get(userJid);
        if (list != null) {
            list.add(r6);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(r6);
            map.put(userJid, arrayList);
            if (z2) {
                String rawString = userJid.getRawString();
                C15860rz r4 = this.A08;
                r4.A0n(rawString);
                SharedPreferences.Editor A0K = r4.A0K();
                StringBuilder sb = new StringBuilder("smb_business_direct_connection_enc_string_");
                sb.append(rawString);
                A0K.remove(sb.toString()).apply();
                SharedPreferences.Editor A0K2 = r4.A0K();
                StringBuilder sb2 = new StringBuilder("smb_business_direct_connection_enc_string_expired_timestamp_");
                sb2.append(rawString);
                A0K2.remove(sb2.toString()).apply();
                SharedPreferences.Editor A0K3 = r4.A0K();
                StringBuilder sb3 = new StringBuilder("dc_business_domain_");
                sb3.append(rawString);
                A0K3.remove(sb3.toString()).apply();
            } else if (!TextUtils.isEmpty(A00(userJid))) {
                if (A01(userJid) == null || A06(userJid)) {
                    A03(userJid);
                } else {
                    A05(userJid);
                }
            }
            new C439122a(userJid, this.A0B).A00(new C439222b(this));
        }
    }

    public final void A03(UserJid userJid) {
        C439422d r8 = new C439422d(userJid, this.A0B);
        r8.A00 = new C439522e(this, userJid);
        C17190ug r7 = r8.A02;
        String A022 = r7.A02();
        r7.A0A(r8, new C28371Vv(new C28371Vv("signed_user_info", new C35081lL[]{new C35081lL("biz_jid", r8.A01.getRawString())}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("xmlns", "w:biz:catalog"), new C35081lL("type", "get"), new C35081lL("id", A022)}), A022, 287, 32000);
    }

    public synchronized void A04(UserJid userJid) {
        Map map = this.A03;
        List<AnonymousClass22Z> list = (List) map.get(userJid);
        if (list == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectConnectionManager/onDirectConnectionInfoFailed/No listeners for jid - ");
            sb.append(userJid);
            Log.e(sb.toString());
        } else {
            for (AnonymousClass22Z APn : list) {
                APn.APn(userJid);
            }
            map.remove(userJid);
        }
    }

    public synchronized void A05(UserJid userJid) {
        Map map = this.A03;
        List<AnonymousClass22Z> list = (List) map.get(userJid);
        if (list == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("DirectConnectionManager/onDirectConnectionInfoSucceeded/No listeners for jid - ");
            sb.append(userJid);
            Log.e(sb.toString());
        } else {
            for (AnonymousClass22Z APo : list) {
                APo.APo(userJid);
            }
            map.remove(userJid);
        }
    }

    public boolean A06(UserJid userJid) {
        long time = new Date().getTime();
        C15860rz r0 = this.A08;
        String rawString = userJid.getRawString();
        StringBuilder sb = new StringBuilder("smb_business_direct_connection_enc_string_expired_timestamp_");
        sb.append(rawString);
        return time > ((SharedPreferences) r0.A01.get()).getLong(sb.toString(), 0);
    }
}
