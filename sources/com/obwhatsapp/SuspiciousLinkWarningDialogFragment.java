package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass02E;
import X.AnonymousClass1ZW;
import X.AnonymousClass3MF;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C32241fu;
import X.C59142uk;
import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape2S1100000_2_I1;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Set;

public class SuspiciousLinkWarningDialogFragment extends Hilt_SuspiciousLinkWarningDialogFragment {
    public static SuspiciousLinkWarningDialogFragment A01(String str, String str2, Set set) {
        SuspiciousLinkWarningDialogFragment suspiciousLinkWarningDialogFragment = new SuspiciousLinkWarningDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("url", str);
        A0D.putSerializable("message_key_id", str2);
        A0D.putSerializable("phishingChars", new HashSet(set));
        suspiciousLinkWarningDialogFragment.A0T(A0D);
        return suspiciousLinkWarningDialogFragment;
    }

    public void A0q() {
        super.A0q();
        TextView textView = (TextView) this.A03.findViewById(16908299);
        if (textView != null) {
            textView.setMovementMethod(new AnonymousClass3MF());
            C13680ns.A0v(A0C(), textView, R.color.color0768);
        }
    }

    public Dialog A1B(Bundle bundle) {
        SpannableString spannableString;
        int length;
        String string = A04().getString("url");
        A04().getString("message_key_id");
        AbstractCollection abstractCollection = (AbstractCollection) A04().getSerializable("phishingChars");
        boolean z2 = true;
        SpannableStringBuilder A0F = C13690nt.A0F(AnonymousClass1ZW.A00(A0u(), new Object[]{this.A05.A04("26000162").toString()}, R.string.str171c));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0F.getSpans(0, A0F.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A0F.setSpan(new C59142uk(A0u(), this.A01, this.A00, this.A02, uRLSpan.getURL()), A0F.getSpanStart(uRLSpan), A0F.getSpanEnd(uRLSpan), A0F.getSpanFlags(uRLSpan));
            }
            for (URLSpan removeSpan : uRLSpanArr) {
                A0F.removeSpan(removeSpan);
            }
        }
        A0F.append("\n\n");
        if (!TextUtils.isEmpty(string) && abstractCollection != null) {
            ForegroundColorSpan A0G = C13690nt.A0G(A0u(), R.color.color0769);
            if (string.codePointCount(0, string.length()) > 96) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(AnonymousClass1ZW.A04(96, string));
                spannableString = new SpannableString(AnonymousClass000.A0h("…", A0o));
            } else {
                spannableString = new SpannableString(string);
            }
            int i2 = -1;
            for (String str : Uri.parse(string).getHost().split("\\.")) {
                int i3 = 0;
                boolean z3 = false;
                int i4 = -1;
                while (true) {
                    length = str.length();
                    if (i3 >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i3);
                    int charCount = Character.charCount(codePointAt);
                    if (C13700nu.A0h(abstractCollection, codePointAt)) {
                        i4 = string.indexOf(codePointAt, i4 + 1);
                        spannableString.setSpan(new StyleSpan(z2 ? 1 : 0), i4, i4 + charCount, 33);
                        z3 = true;
                    }
                    i3 += charCount;
                    z2 = true;
                }
                if (z3) {
                    i2 = string.indexOf(str, i2 + 1);
                    spannableString.setSpan(A0G, i2, length + i2, 33);
                }
            }
            AnonymousClass02E A03 = this.A02.A03();
            A0F.append(A03.A03(A03.A00, spannableString));
        }
        C32241fu A00 = C32241fu.A00(A0C());
        A00.A02(R.string.str171d);
        A00.A06(A0F);
        A00.A07(z2);
        A00.setNegativeButton(R.string.str171f, new IDxCListenerShape2S1100000_2_I1(z2 ? 1 : 0, string, this));
        C13680ns.A1H(A00, this, 9, R.string.str1720);
        return A00.create();
    }
}
