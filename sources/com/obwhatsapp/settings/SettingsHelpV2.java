package com.obwhatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass13H;
import X.AnonymousClass13L;
import X.AnonymousClass15W;
import X.AnonymousClass1BY;
import X.AnonymousClass1DN;
import X.AnonymousClass1KO;
import X.AnonymousClass1KP;
import X.AnonymousClass2SR;
import X.AnonymousClass4NQ;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16260sj;
import X.C16620tM;
import X.C17120uZ;
import X.C17220uj;
import X.C18450wi;
import X.C434920f;
import X.C447725m;
import X.C49132Rg;
import X.C52512dv;
import X.C70443gh;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class SettingsHelpV2 extends C14530pL {
    public AnonymousClass1KO A00;
    public C17120uZ A01;
    public C16260sj A02;
    public AnonymousClass15W A03;
    public AnonymousClass1DN A04;
    public AnonymousClass13L A05;
    public AnonymousClass13H A06;
    public AnonymousClass1KP A07;
    public AnonymousClass1BY A08;
    public C17220uj A09;
    public boolean A0A;

    public SettingsHelpV2() {
        this(0);
    }

    public SettingsHelpV2(int i2) {
        this.A0A = false;
        C13680ns.A1G(this, 117);
    }

    public void A1q() {
        if (!this.A0A) {
            this.A0A = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = (AnonymousClass1KO) r1.ALY.get();
            this.A09 = C16150sX.A18(r1);
            this.A03 = (AnonymousClass15W) r1.AOC.get();
            this.A04 = (AnonymousClass1DN) r1.AGL.get();
            this.A02 = C16150sX.A0X(r1);
            this.A08 = (AnonymousClass1BY) r1.A55.get();
            this.A05 = (AnonymousClass13L) r1.APe.get();
            this.A07 = (AnonymousClass1KP) r1.AKw.get();
            this.A06 = (AnonymousClass13H) r1.APf.get();
            this.A01 = C16150sX.A0W(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1d95);
        setContentView((int) R.layout.layout04c8);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
            int A002 = C434920f.A00(this, R.attr.attr0451, R.color.color070f);
            if (!this.A0C.A0E(C16620tM.A02, 1347)) {
                View findViewById = findViewById(R.id.faq_preference);
                findViewById.setVisibility(0);
                ImageView A0K = C13680ns.A0K(findViewById, R.id.settings_row_icon);
                A0K.setImageDrawable(new C70443gh(AnonymousClass00T.A04(this, R.drawable.ic_settings_help), this.A01));
                AnonymousClass2SR.A08(A0K, A002);
                C13680ns.A19(findViewById, this, 1);
                View findViewById2 = findViewById(R.id.contact_us_preference);
                findViewById2.setVisibility(0);
                AnonymousClass2SR.A08(C13680ns.A0K(findViewById2, R.id.settings_row_icon), A002);
                C13680ns.A19(findViewById2, this, 3);
            } else {
                View findViewById3 = findViewById(R.id.get_help_preference);
                findViewById3.setVisibility(0);
                ImageView A0K2 = C13680ns.A0K(findViewById3, R.id.settings_row_icon);
                A0K2.setImageDrawable(new C70443gh(AnonymousClass00T.A04(this, R.drawable.ic_settings_help), this.A01));
                AnonymousClass2SR.A08(A0K2, A002);
                C13680ns.A19(findViewById3, this, 0);
            }
            View findViewById4 = findViewById(R.id.terms_and_privacy_preference);
            TextView A0M = C13680ns.A0M(findViewById4, R.id.settings_row_text);
            ImageView A0K3 = C13680ns.A0K(findViewById4, R.id.settings_row_icon);
            C447725m.A01(this, A0K3, this.A01, R.drawable.ic_settings_terms_policy);
            AnonymousClass2SR.A08(A0K3, A002);
            A0M.setText(getText(R.string.str15cb));
            C13680ns.A15(findViewById4, this, 49);
            View findViewById5 = findViewById(R.id.about_preference);
            AnonymousClass2SR.A08(C13680ns.A0K(findViewById5, R.id.settings_row_icon), A002);
            C13680ns.A19(findViewById5, this, 2);
            return;
        }
        throw AnonymousClass000.A0T("Required value was null.");
    }

    public void onResume() {
        View findViewById;
        C52512dv r0;
        int i2;
        boolean z2;
        super.onResume();
        AnonymousClass1DN r1 = this.A04;
        if (r1 != null) {
            ArrayList A0u = AnonymousClass000.A0u();
            if (r1.A0C) {
                ConcurrentHashMap concurrentHashMap = r1.A02;
                for (Number number : concurrentHashMap.keySet()) {
                    C52512dv r4 = (C52512dv) concurrentHashMap.get(number);
                    if (r4 != null) {
                        int intValue = number.intValue();
                        String str = intValue == 20220328 ? "https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account" : "";
                        int i3 = r4.A00;
                        if (i3 >= 4) {
                            A0u.add(new AnonymousClass4NQ(false, true, intValue, r4.A01, str));
                        } else {
                            if (i3 > -1) {
                                i2 = r4.A01;
                                z2 = true;
                            } else if (i3 == -1) {
                                i2 = r4.A01;
                                z2 = false;
                            }
                            A0u.add(new AnonymousClass4NQ(z2, z2, intValue, i2, str));
                        }
                    }
                }
            }
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                AnonymousClass4NQ r6 = (AnonymousClass4NQ) it.next();
                if (r6.A04) {
                    SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(r6.A01);
                    if (settingsRowIconText != null && (findViewById = settingsRowIconText.findViewById(R.id.settings_row_icon)) != null) {
                        findViewById.setVisibility(4);
                        if (r6.A03) {
                            settingsRowIconText.setBadgeIcon(AnonymousClass00T.A04(this, R.drawable.ic_settings_row_badge));
                            AnonymousClass1DN r7 = this.A04;
                            if (r7 != null) {
                                int i4 = r6.A00;
                                if (!(!r7.A0C || (r0 = (C52512dv) r7.A02.get(Integer.valueOf(i4))) == null || r0.A00 == 9)) {
                                    r7.A07.A00(i4, 0, 4);
                                    r7.A05(new RunnableRunnableShape0S0101000_I0((Object) r7, i4, 21));
                                }
                            }
                        } else {
                            settingsRowIconText.setBadgeIcon((Drawable) null);
                        }
                        settingsRowIconText.setVisibility(0);
                        AnonymousClass1DN r02 = this.A04;
                        if (r02 != null) {
                            r02.A07.A00(r6.A00, 0, 6);
                            C13690nt.A1A(settingsRowIconText, this, r6, 10);
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        throw C18450wi.A03("noticeBadgeManager");
    }
}
