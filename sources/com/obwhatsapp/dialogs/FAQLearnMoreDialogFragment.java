package com.obwhatsapp.dialogs;

import X.AnonymousClass00B;
import X.AnonymousClass2Sy;
import X.C13690nt;
import X.C17220uj;
import X.C17250um;
import X.C19980zJ;
import X.C32241fu;
import X.C91374fo;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import com.obwhatsapp.R;

public class FAQLearnMoreDialogFragment extends Hilt_FAQLearnMoreDialogFragment {
    public C19980zJ A00;
    public C17250um A01;
    public C17220uj A02;

    public static Dialog A02(Context context, C19980zJ r8, C17250um r9, C17220uj r10, CharSequence charSequence, String str, String str2, String str3) {
        Context context2 = context;
        C91374fo r3 = new C91374fo(context2, r8, r10, str, str3);
        C32241fu A002 = C32241fu.A00(context2);
        A002.A06(AnonymousClass2Sy.A05(context2, r9, charSequence));
        A002.A07(true);
        A002.A0B(r3, R.string.str1cf6);
        A002.setNegativeButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        if (str2 != null) {
            A002.setTitle(AnonymousClass2Sy.A05(context2, r9, str2));
        }
        return A002.create();
    }

    public static FAQLearnMoreDialogFragment A03() {
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("message_string_res_id", R.string.str12ea);
        A0D.putString("faq_id", "26000003");
        if (!TextUtils.isEmpty((CharSequence) null)) {
            A0D.putString("faq_section_name", (String) null);
        }
        FAQLearnMoreDialogFragment fAQLearnMoreDialogFragment = new FAQLearnMoreDialogFragment();
        fAQLearnMoreDialogFragment.A0T(A0D);
        return fAQLearnMoreDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String string;
        A04();
        String string2 = A04().getString("faq_id");
        AnonymousClass00B.A06(string2);
        if (this.A05.containsKey("message_string_res_id")) {
            string = A0J(this.A05.getInt("message_string_res_id"));
        } else {
            string = A04().getString("message_text");
            AnonymousClass00B.A06(string);
        }
        String str = null;
        String A0J = this.A05.containsKey("title_string_res_id") ? A0J(this.A05.getInt("title_string_res_id")) : null;
        if (this.A05.containsKey("faq_section_name")) {
            str = this.A05.getString("faq_section_name");
        }
        return A02(A02(), this.A00, this.A01, this.A02, string, string2, A0J, str);
    }
}
