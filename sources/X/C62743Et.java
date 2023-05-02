package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape0S3100000_I1;
import com.facebook.redex.RunnableRunnableShape0S3410000_I1;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public final class C62743Et implements C439622f {
    public final Activity A00;
    public final C25371Jn A01;
    public final C14870pt A02;
    public final AnonymousClass4R8 A03;
    public final C16460t6 A04;
    public final C16320sq A05;
    public final C25381Jo A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public C62743Et(Activity activity, C25371Jn r2, C14870pt r3, AnonymousClass4R8 r4, C16460t6 r5, C16320sq r6, C25381Jo r7, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3) {
        this.A00 = activity;
        this.A03 = r4;
        this.A0D = z2;
        this.A0B = str;
        this.A0A = str2;
        this.A09 = str3;
        this.A08 = str4;
        this.A0E = z3;
        this.A07 = str5;
        this.A0C = str6;
        this.A06 = r7;
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r6;
        this.A04 = r5;
    }

    public static final void A00(Activity activity, AnonymousClass4R8 r11, AnonymousClass1JU r12, C62743Et r13, String str, String str2, String str3, boolean z2) {
        Intent intent;
        Bundle extras;
        AnonymousClass01A A0B2;
        if (z2) {
            Activity activity2 = activity;
            AnonymousClass01A A0B3 = ((C001000l) activity2).AGM().A0B("extensions_bottom_sheet_container");
            C62743Et r10 = r13;
            String str4 = str;
            if (!(A0B3 == null || (A0B2 = A0B3.A0F().A0B("BK_FRAGMENT")) == null)) {
                WaBkExtensionsLayoutViewModel.A01(activity2, r12, (WaBkExtensionsLayoutViewModel) new C006602z(A0B2).A01(WaBkExtensionsLayoutViewModel.class), str4, (String) null, str3, 16, r13.A0E);
            }
            if (r11 != null) {
                r11.A00("failure", C438921y.A01(str));
            }
            if (str != null && (intent = r13.A00.getIntent()) != null && (extras = intent.getExtras()) != null) {
                String string = extras.getString("chat_id");
                String string2 = extras.getString("message_id");
                String string3 = extras.getString("action_name");
                if (string2 != null && string3 != null) {
                    r10.A05.Acl(new RunnableRunnableShape0S3100000_I1(r10, string, string2, string3, 0));
                }
            }
        } else if (r11 != null) {
            r11.A00("success", C438921y.A01(str2));
        }
    }

    public void ARf(String str) {
        C18450wi.A0H(str, 0);
        Activity activity = this.A00;
        AnonymousClass4R8 r3 = this.A03;
        this.A02.Acq(new RunnableRunnableShape0S3410000_I1(activity, r3, this, (Object) null, (String) null, (String) null, str, 0, true));
    }

    public void ARg(UserJid userJid, String str) {
        C18450wi.A0H(str, 1);
        this.A05.Acl(new RunnableRunnableShape1S1200000_I1(this, str, userJid, 11));
    }
}
