package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.facebook.redex.RunnableRunnableShape0S1300000_I0;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.2Df  reason: invalid class name and case insensitive filesystem */
public class C46262Df implements C19550yc {
    public final C16300so A00;
    public final C14870pt A01;
    public final AnonymousClass01Y A02;
    public final C16440t3 A03;
    public final C15860rz A04;
    public final C17190ug A05;
    public final AnonymousClass273 A06;

    public C46262Df(C16300so r1, C14870pt r2, AnonymousClass01Y r3, C16440t3 r4, C15860rz r5, C17190ug r6, AnonymousClass273 r7) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r6;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
    }

    public void A00() {
        C28371Vv r4;
        Log.i("getblocklistprotocolhelper/sendGetBlocklistRequest");
        C17190ug r7 = this.A05;
        String A022 = r7.A02();
        String string = ((SharedPreferences) this.A04.A01.get()).getString("block_list_v2_dhash", (String) null);
        if (TextUtils.isEmpty(string)) {
            r4 = null;
        } else {
            r4 = new C28371Vv("item", new C35081lL[]{new C35081lL("dhash", string)});
        }
        r7.A0A(this, new C28371Vv(r4, "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("type", "get"), new C35081lL("xmlns", "blocklist")}), A022, 198, 0);
    }

    public void APb(String str) {
        StringBuilder sb = new StringBuilder("getblocklistprotocolhelper/onDeliveryFailure iq=");
        sb.append(str);
        Log.i(sb.toString());
    }

    public void AQe(C28371Vv r4, String str) {
        int A002 = C34451kH.A00(r4);
        StringBuilder sb = new StringBuilder("getblocklistprotocolhelper/onError, iq=");
        sb.append(str);
        sb.append("; errorCode=");
        sb.append(A002);
        Log.i(sb.toString());
    }

    public void AYG(C28371Vv r8, String str) {
        C28371Vv A0J = r8.A0J("list");
        if (A0J != null) {
            HashSet hashSet = new HashSet();
            HashMap hashMap = new HashMap();
            String A0N = A0J.A0N("dhash", (String) null);
            C28371Vv[] r4 = A0J.A03;
            if (r4 != null) {
                for (C28371Vv r5 : r4) {
                    C28371Vv.A06(r5, "item");
                    Jid A0F = r5.A0F(this.A00, UserJid.class, "jid");
                    String A0N2 = r5.A0N("display_name", (String) null);
                    if (!AnonymousClass1ZW.A0E(A0N2) && (A0F instanceof AnonymousClass1ZX)) {
                        hashMap.put(A0F, A0N2);
                    }
                    hashSet.add(A0F);
                }
            }
            this.A01.Acq(new RunnableRunnableShape0S1300000_I0(3, A0N, this, hashSet, hashMap));
        } else {
            this.A04.A0m(this.A03.A00());
        }
        AnonymousClass273 r1 = this.A06;
        if (r1 != null) {
            r1.A00(4);
        }
    }
}
