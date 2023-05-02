package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.RunnableRunnableShape0S3100000_I1;
import com.facebook.redex.RunnableRunnableShape0S3410000_I1;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaBkExtensionsLayoutViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Eu  reason: invalid class name and case insensitive filesystem */
public final class C62753Eu implements C439622f {
    public final Activity A00;
    public final C25371Jn A01;
    public final C14870pt A02;
    public final C25271Jd A03;
    public final AnonymousClass1Z6 A04;
    public final C16460t6 A05;
    public final C16320sq A06;
    public final C25381Jo A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;

    public C62753Eu(Activity activity, C25371Jn r3, C14870pt r4, C25271Jd r5, AnonymousClass1Z6 r6, C16460t6 r7, C16320sq r8, C25381Jo r9, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, boolean z3) {
        this.A00 = activity;
        this.A04 = r6;
        this.A0E = z2;
        this.A03 = r5;
        this.A0C = str;
        this.A0B = str2;
        this.A0A = str3;
        this.A09 = str4;
        this.A0F = z3;
        this.A08 = str5;
        this.A0D = str6;
        this.A07 = r9;
        this.A01 = r3;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
    }

    public static final void A00(Activity activity, AnonymousClass1Z6 r13, AnonymousClass1JU r14, C62753Eu r15, String str, String str2, String str3, boolean z2) {
        Intent intent;
        Bundle extras;
        AnonymousClass01A A0B2;
        C62753Eu r11 = r15;
        if (z2) {
            Activity activity2 = activity;
            AnonymousClass01A A0B3 = ((C001000l) activity2).AGM().A0B("extensions_bottom_sheet_container");
            String str4 = str;
            if (!(A0B3 == null || (A0B2 = A0B3.A0F().A0B("BK_FRAGMENT")) == null)) {
                WaBkExtensionsLayoutViewModel.A01(activity2, r14, (WaBkExtensionsLayoutViewModel) new C006602z(A0B2).A01(WaBkExtensionsLayoutViewModel.class), str4, (String) null, str3, 16, r15.A0F);
            }
            r15.A03.A00(r13, "data_exchange").A02("failure", C438921y.A01(str4));
            if (str != null && (intent = r15.A00.getIntent()) != null && (extras = intent.getExtras()) != null) {
                String string = extras.getString("chat_id");
                String string2 = extras.getString("message_id");
                String string3 = extras.getString("action_name");
                if (string2 != null && string3 != null) {
                    r15.A06.Acl(new RunnableRunnableShape0S3100000_I1(r11, string, string2, string3, 1));
                    return;
                }
                return;
            }
            return;
        }
        r15.A03.A00(r13, "data_exchange").A02("success", C438921y.A01(str2));
    }

    public void ARf(String str) {
        C18450wi.A0H(str, 0);
        Activity activity = this.A00;
        this.A02.Acq(new RunnableRunnableShape0S3410000_I1(activity, this, this.A04, (Object) null, (String) null, (String) null, str, 1, true));
    }

    public void ARg(UserJid userJid, String str) {
        C18450wi.A0H(str, 1);
        this.A06.Acl(new RunnableRunnableShape1S1200000_I1(this, str, userJid, 12));
    }
}
