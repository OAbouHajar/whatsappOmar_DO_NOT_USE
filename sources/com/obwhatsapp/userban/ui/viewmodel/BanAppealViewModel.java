package com.obwhatsapp.userban.ui.viewmodel;

import X.AnonymousClass00B;
import X.AnonymousClass027;
import X.AnonymousClass168;
import X.AnonymousClass1KO;
import X.AnonymousClass52Q;
import X.C000900k;
import X.C003401n;
import X.C005402i;
import X.C14710pd;
import X.C14750ph;
import X.C15860rz;
import X.C15960sC;
import X.C16150sX;
import X.C17130ua;
import X.C17220uj;
import X.C17270uo;
import X.C19380yL;
import X.C19750yw;
import X.C19760yx;
import X.C23071Aj;
import X.C30801cy;
import X.C76383tp;
import android.app.Activity;
import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape2S0300000_I0_2;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class BanAppealViewModel extends C003401n {
    public int A00;
    public final AnonymousClass027 A01 = new AnonymousClass027();
    public final AnonymousClass027 A02 = new AnonymousClass027();
    public final AnonymousClass1KO A03;
    public final C23071Aj A04;
    public final C19380yL A05;
    public final C19760yx A06;
    public final C15960sC A07;
    public final C17220uj A08;
    public final C19750yw A09;
    public final C30801cy A0A = new C30801cy();
    public final C30801cy A0B = new C30801cy();

    public BanAppealViewModel(AnonymousClass1KO r2, C23071Aj r3, C19380yL r4, C19760yx r5, C15960sC r6, C17220uj r7, C19750yw r8) {
        this.A03 = r2;
        this.A04 = r3;
        this.A08 = r7;
        this.A09 = r8;
        this.A06 = r5;
        this.A05 = r4;
        this.A07 = r6;
    }

    public static void A01(Activity activity, boolean z2) {
        AnonymousClass00B.A06(activity);
        C005402i x2 = ((C000900k) activity).x();
        if (x2 != null) {
            x2.A0N(z2);
            int i2 = R.string.str1cf7;
            if (z2) {
                i2 = R.string.str0158;
            }
            x2.A0B(i2);
        }
    }

    public final int A05(String str, boolean z2) {
        String str2;
        switch (str.hashCode()) {
            case -358171056:
                str2 = "UNKNOWN_IN_CLIENT";
                break;
            case 272787191:
                if (str.equals("UNBANNED")) {
                    return 4;
                }
                break;
            case 527514546:
                if (str.equals("IN_REVIEW")) {
                    return !z2 ? 1 : 3;
                }
                break;
            case 1166090011:
                str2 = "NO_APPEAL_OPENED";
                break;
            case 1951953694:
                if (str.equals("BANNED")) {
                    return 5;
                }
                break;
        }
        if (str.equals(str2)) {
            return (this.A00 != 2 || !((SharedPreferences) this.A09.A04.A01.get()).getBoolean("support_ban_appeal_user_banned_from_chat_disconnect", false)) ? 1 : 2;
        }
        StringBuilder sb = new StringBuilder("Invalid BanAppealState: ");
        sb.append(str);
        throw new UnsupportedOperationException(sb.toString());
    }

    public void A06() {
        Log.i("BanAppealViewModel/fetchBanAppealStatus");
        C19750yw r4 = this.A09;
        this.A0B.A0B(Integer.valueOf(A05(r4.A00(), false)));
        int A002 = this.A07.A00();
        StringBuilder sb = new StringBuilder("BanAppealViewModel/verifyIfPhoneNumberIsVerified reg_state: ");
        sb.append(A002);
        Log.i(sb.toString());
        if (A002 == 10) {
            Log.i("BanAppealViewModel/fetchBanAppealStatus trying to fetch ban appeal status");
            AnonymousClass52Q r3 = new AnonymousClass52Q(this);
            String string = ((SharedPreferences) r4.A04.A01.get()).getString("support_ban_appeal_token", (String) null);
            if (string == null) {
                r3.AQv(3);
                return;
            }
            C16150sX r1 = r4.A01.A00.A01;
            r4.A06.Acl(new RunnableRunnableShape2S0300000_I0_2(r4, new C76383tp((C17130ua) r1.AN9.get(), (C15860rz) r1.AQh.get(), (C14710pd) r1.A05.get(), (AnonymousClass168) r1.AAi.get(), C17270uo.A00(r1.AQV), string, r1.AAM, r1.A1b), r3, 21));
            return;
        }
        Log.i("BanAppealViewModel/fetchBanAppealStatus returning since phone number not verified yet");
    }

    public void A07() {
        if (this.A00 != 2 || !((SharedPreferences) this.A09.A04.A01.get()).getBoolean("support_ban_appeal_user_banned_from_chat_disconnect", false)) {
            this.A0A.A0B(Boolean.TRUE);
        } else {
            this.A0B.A0B(1);
        }
    }

    public void A08(Activity activity, boolean z2) {
        this.A05.A03(42, (String) null);
        this.A06.A01();
        C15860rz r2 = this.A09.A04;
        r2.A0K().remove("support_ban_appeal_state").apply();
        r2.A0K().remove("support_ban_appeal_token").apply();
        r2.A0K().remove("support_ban_appeal_violation_type").apply();
        r2.A0K().remove("support_ban_appeal_unban_reason").apply();
        r2.A0K().remove("support_ban_appeal_unban_reason_url").apply();
        if (!z2) {
            r2.A0K().remove("support_ban_appeal_user_banned_from_chat_disconnect").apply();
        }
        Log.i("BanAppealRepository/clearFormReviewDraft");
        r2.A0K().remove("support_ban_appeal_form_review_draft").apply();
        activity.startActivity(C14750ph.A01(activity));
        activity.finishAffinity();
    }
}
