package com.obwhatsapp.xfamily.accountlinking.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass1AJ;
import X.AnonymousClass1ZW;
import X.AnonymousClass2Rf;
import X.AnonymousClass3MF;
import X.AnonymousClass4JB;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16150sX;
import X.C16980tz;
import X.C17130ua;
import X.C18450wi;
import X.C19950zG;
import X.C38411qk;
import X.C38461qp;
import X.C49132Rg;
import X.C50352Zd;
import X.C83144Fn;
import X.C93424jA;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.facebook.redex.ViewOnClickCListenerShape21S0100000_I1_6;
import com.obwhatsapp.IDxTSpanShape54S0100000_2_I1;
import com.obwhatsapp.R;

public final class AccountLinkingNativeAuthActivity extends C14530pL {
    public C17130ua A00;
    public C16980tz A01;
    public C38411qk A02;
    public AnonymousClass4JB A03;
    public C93424jA A04;
    public boolean A05;

    public AccountLinkingNativeAuthActivity() {
        this(0);
    }

    public AccountLinkingNativeAuthActivity(int i2) {
        this.A05 = false;
        C13680ns.A1G(this, 141);
    }

    public void A1q() {
        if (!this.A05) {
            this.A05 = true;
            C49132Rg r3 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r3.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(r3, r1, this, C14550pN.A0v(r1));
            this.A00 = C16150sX.A05(r1);
            this.A01 = C16150sX.A0V(r1);
            AnonymousClass4JB r2 = new AnonymousClass4JB();
            r2.A01 = (AnonymousClass1AJ) r1.A9z.get();
            r2.A00 = new C83144Fn((C50352Zd) r3.A1P.get());
            this.A03 = r2;
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout005e);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("fb_app_user_entity_as_parcel");
        if (parcelableExtra != null) {
            C93424jA r0 = (C93424jA) parcelableExtra;
            this.A04 = r0;
            if (r0 != null) {
                Object obj = r0.A01.A00;
                AnonymousClass00B.A06(obj);
                C18450wi.A0B(obj);
                TextView textView = (TextView) C18450wi.A01(this, R.id.consent_login_button);
                textView.setText(C13700nu.A0F(getResources(), obj, C13680ns.A1b(), 0, R.string.str0c9d));
                textView.setOnClickListener(new ViewOnClickCListenerShape21S0100000_I1_6(this, 0));
                C93424jA r02 = this.A04;
                if (r02 != null) {
                    Object obj2 = r02.A02.A00;
                    AnonymousClass00B.A06(obj2);
                    C18450wi.A0B(obj2);
                    String str2 = (String) obj2;
                    ImageView imageView = (ImageView) C18450wi.A01(this, R.id.profile_picture_image);
                    C14870pt r5 = this.A05;
                    C17130ua r6 = this.A00;
                    if (r6 != null) {
                        C19950zG r7 = this.A0D;
                        C16980tz r03 = this.A01;
                        if (r03 != null) {
                            C38461qp r4 = new C38461qp(r5, r6, r7, C13700nu.A0C(r03.A00.getCacheDir(), "xfamily_cache"), "xfamily-native-auth");
                            C16980tz r04 = this.A01;
                            if (r04 != null) {
                                r4.A00 = C16980tz.A00(r04).getDimensionPixelSize(R.dimen.dimen03c4);
                                C16980tz r05 = this.A01;
                                if (r05 != null) {
                                    r4.A02 = AnonymousClass00T.A04(r05.A00, R.drawable.ic_shimmer_profile);
                                    C16980tz r06 = this.A01;
                                    if (r06 != null) {
                                        r4.A03 = AnonymousClass00T.A04(r06.A00, R.drawable.ic_shimmer_profile);
                                        C38411qk A002 = r4.A00();
                                        this.A02 = A002;
                                        A002.A01(imageView, str2);
                                        findViewById(R.id.close_button).setOnClickListener(new ViewOnClickCListenerShape21S0100000_I1_6(this, 1));
                                        TextView A0N = C13680ns.A0N(this, R.id.different_login);
                                        String string = getResources().getString(R.string.str008f);
                                        C18450wi.A0B(string);
                                        int currentTextColor = A0N.getCurrentTextColor();
                                        RunnableRunnableShape20S0100000_I1_3 runnableRunnableShape20S0100000_I1_3 = new RunnableRunnableShape20S0100000_I1_3(this, 24);
                                        int i2 = 0;
                                        Spanned A012 = AnonymousClass1ZW.A01(string, new Object[0]);
                                        C18450wi.A0B(A012);
                                        SpannableStringBuilder A0F = C13690nt.A0F(A012);
                                        URLSpan[] uRLSpanArr = (URLSpan[]) A012.getSpans(0, A012.length(), URLSpan.class);
                                        if (uRLSpanArr != null) {
                                            int length = uRLSpanArr.length;
                                            while (i2 < length) {
                                                URLSpan uRLSpan = uRLSpanArr[i2];
                                                i2++;
                                                if ("log-in".equals(uRLSpan.getURL())) {
                                                    int spanStart = A0F.getSpanStart(uRLSpan);
                                                    int spanEnd = A0F.getSpanEnd(uRLSpan);
                                                    int spanFlags = A0F.getSpanFlags(uRLSpan);
                                                    A0F.removeSpan(uRLSpan);
                                                    A0F.setSpan(new IDxTSpanShape54S0100000_2_I1((Runnable) runnableRunnableShape20S0100000_I1_3, currentTextColor), spanStart, spanEnd, spanFlags);
                                                }
                                            }
                                        }
                                        A0N.setText(A0F);
                                        A0N.setMovementMethod(new AnonymousClass3MF());
                                        return;
                                    }
                                }
                            }
                        }
                        str = "waContext";
                    } else {
                        str = "statistics";
                    }
                    throw C18450wi.A03(str);
                }
            }
            str = "fb4aUserEntityForNativeAuth";
            throw C18450wi.A03(str);
        }
        throw AnonymousClass000.A0V("Required value was null.");
    }
}
