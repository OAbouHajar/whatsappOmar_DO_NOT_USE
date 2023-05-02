package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.redex.IDxTObserverShape253S0100000_3_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5ei  reason: invalid class name and case insensitive filesystem */
public class C110715ei extends C003401n {
    public C18940xV A00;
    public C41411vk A01;
    public final AnonymousClass028 A02;
    public final AnonymousClass027 A03;
    public final C17030uP A04;
    public final C16440t3 A05;
    public final C19150xq A06;
    public final C14710pd A07;
    public final UserJid A08;
    public final AnonymousClass17Y A09;
    public final AnonymousClass2ZJ A0A;
    public final AnonymousClass5wL A0B = new AnonymousClass5wL((AnonymousClass5xI) null, (C54392hN) null, 1);
    public final C28381Vw A0C;
    public final C16320sq A0D;
    public final boolean A0E;

    public C110715ei(C17030uP r4, C16440t3 r5, C19150xq r6, C14710pd r7, UserJid userJid, AnonymousClass17Y r9, AnonymousClass2ZJ r10, C28381Vw r11, C16320sq r12, boolean z2) {
        this.A05 = r5;
        this.A07 = r7;
        this.A0D = r12;
        this.A06 = r6;
        this.A04 = r4;
        this.A09 = r9;
        this.A0A = r10;
        this.A08 = userJid;
        this.A0C = r11;
        this.A0E = z2;
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A03 = A0O;
        this.A02 = A0O;
        C111725hJ r0 = new C111725hJ(this);
        this.A00 = r0;
        r6.A02(r0);
        IDxTObserverShape253S0100000_3_I1 iDxTObserverShape253S0100000_3_I1 = new IDxTObserverShape253S0100000_3_I1(this, 3);
        this.A01 = iDxTObserverShape253S0100000_3_I1;
        r9.A02(iDxTObserverShape253S0100000_3_I1);
    }

    public static final /* synthetic */ void A01(AnonymousClass1Vt r4, C110715ei r5) {
        C16830ti r2;
        String str;
        C35251lc r0;
        String str2 = null;
        C119215wj r02 = (C119215wj) r5.A0B.A00.A01;
        if (r02 != null && (r2 = r02.A03) != null && (str = r4.A0K) != null) {
            AnonymousClass1Vt r03 = r2.A0L;
            if (!C18450wi.A0R(r03 == null ? null : r03.A0K, str)) {
                C16880tn r04 = r2.A00;
                if (!(r04 == null || (r0 = r04.A01) == null)) {
                    str2 = r0.A03;
                }
                if (!C18450wi.A0R(str2, r4.A0K)) {
                    return;
                }
            }
            r2.A0L = r4;
            r5.A08(r2);
        }
    }

    public void A04() {
        this.A06.A03(this.A00);
        this.A09.A03(this.A01);
    }

    public final void A05() {
        this.A03.A09(this.A0B.A00(this.A08, (AnonymousClass5yZ) null, (C797441c) null, (C16830ti) null, Boolean.valueOf(this.A0E)));
        this.A0D.Aco(new C1211064f(this));
    }

    public final void A06(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("save_order_detail_state_key");
        if (bundle2 != null) {
            boolean z2 = bundle2.getBoolean("should_show_shimmer_key");
            AnonymousClass5yZ r5 = (AnonymousClass5yZ) bundle2.getSerializable("checkout_error_code_key");
            this.A0D.Aco(new C1217366q((AnonymousClass2H9) bundle2.getParcelable("payment_transaction_key"), (UserJid) bundle2.getParcelable("merchant_jid_key"), this, r5, (C797441c) bundle2.getSerializable("merchant_status_key"), z2));
        }
    }

    public final void A07(C15830rv r35, C16840tj r36, int i2) {
        C222617g r2;
        C16830ti r5;
        C16880tn r28;
        C35251lc r52;
        C15830rv r6 = r35;
        C18450wi.A0H(r6, 0);
        C16840tj r4 = r36;
        C18450wi.A0H(r4, 1);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        String str = i2 != 2 ? "confirm" : "payment_instruction";
        C35251lc A0W = C110115dX.A0W(r4);
        C35221lZ r14 = A0W.A05;
        C18450wi.A0A(r14);
        String str2 = A0W.A09;
        String str3 = null;
        C35201lX r29 = null;
        C35251lc r12 = new C35251lc((C28411Vz) null, r14, (C35211lY) null, (String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, str, (List) null, (byte[]) null, seconds, true);
        AnonymousClass2ZJ r9 = this.A0A;
        C16760tb r8 = r9.A00;
        C16740tZ r7 = (C16740tZ) r4;
        try {
            JSONObject A032 = C39811t6.A03(r12, false);
            if (A032 != null) {
                str3 = A032.toString();
            }
        } catch (JSONException unused) {
            Log.e("UserActions/userActionSendOrderUpdateMessage failed to build parameter json for order status message");
        }
        C35191lW r3 = new C35191lW(Collections.singletonList(new C35181lV(new C35071lK("payment_method", str3), false)));
        C35201lX r10 = new C35201lX((String) null, (String) null, (byte[]) null);
        if ("review_order".equals("payment_method") || "payment_method".equals("payment_method") || "payment_status".equals("payment_method")) {
            r2 = r8.A1N;
            r5 = new C16830ti(r2.A05.A02(r6, true), (byte) 55, r8.A0Q.A00());
            if (!TextUtils.isEmpty((CharSequence) null) || !TextUtils.isEmpty((CharSequence) null) || r10.A02 != null) {
                r29 = r10;
            }
            r28 = new C16880tn(r29, r3, "", (String) null, "");
        } else {
            r2 = r8.A1N;
            r5 = new C39091ru(r2.A05.A02(r6, true), r8.A0Q.A00());
            if (TextUtils.isEmpty((CharSequence) null) && TextUtils.isEmpty((CharSequence) null) && r10.A02 == null) {
                r10 = null;
            }
            r28 = new C16880tn(r12, r10, r3, (String) null, (String) null);
        }
        r5.Adh(r28);
        if (r7 != null) {
            r2.A05(r5, r7);
        }
        r8.A0M(r5);
        r8.A0e.A0W(r5);
        C16880tn AAt = r4.AAt();
        if (AAt != null && (r52 = AAt.A01) != null) {
            if (!TextUtils.isEmpty(r12.A01)) {
                r52.A01 = r12.A01;
            }
            long j2 = r12.A00;
            if (j2 > 0) {
                r52.A00 = j2;
            }
            r9.A01.A0a(r7);
        }
    }

    public final void A08(C16830ti r12) {
        AnonymousClass5xI A002;
        AnonymousClass5wL r5 = this.A0B;
        C16830ti r9 = r12;
        if (r12 == null) {
            C114855oi r4 = C114855oi.ORDER_NOT_FOUND;
            C18450wi.A0H(r4, 0);
            int A012 = C110115dX.A01(r4, C115495pq.A00);
            int i2 = R.string.str0ea5;
            int i3 = R.string.str0ea4;
            if (A012 != 1) {
                i2 = R.string.str0854;
                i3 = R.string.str1664;
            }
            A002 = r5.A00((UserJid) null, new AnonymousClass5yZ(r4, i2, i3), (C797441c) null, (C16830ti) null, (Boolean) null);
        } else {
            A002 = r5.A00((UserJid) null, (AnonymousClass5yZ) null, (C797441c) null, r9, (Boolean) null);
        }
        this.A03.A09(A002);
    }
}
