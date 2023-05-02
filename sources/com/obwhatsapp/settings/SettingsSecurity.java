package com.obwhatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass01V;
import X.AnonymousClass137;
import X.AnonymousClass16S;
import X.C004601z;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14710pd;
import X.C14870pt;
import X.C16150sX;
import X.C16620tM;
import X.C17190ug;
import X.C17220uj;
import X.C19980zJ;
import X.C45922Bq;
import X.C49132Rg;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape220S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class SettingsSecurity extends C14530pL {
    public AnonymousClass137 A00;
    public C17190ug A01;
    public AnonymousClass16S A02;
    public C17220uj A03;
    public boolean A04;

    public SettingsSecurity() {
        this(0);
    }

    public SettingsSecurity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 121);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A0t(r1);
            this.A03 = C16150sX.A18(r1);
            this.A02 = (AnonymousClass16S) r1.AFt.get();
            this.A00 = (AnonymousClass137) r1.A6f.get();
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        C14710pd r2 = this.A0C;
        C16620tM r1 = C16620tM.A02;
        boolean A0E = r2.A0E(r1, 2261);
        int i3 = R.string.str15bb;
        if (A0E) {
            i3 = R.string.str15bf;
        }
        setTitle(i3);
        setContentView((int) R.layout.layout054b);
        C13690nt.A0N(this).A0N(true);
        CompoundButton compoundButton = (CompoundButton) C004601z.A0E(this.A00, R.id.security_notifications);
        compoundButton.setChecked(this.A09.A1Y());
        compoundButton.setOnCheckedChangeListener(new IDxCListenerShape220S0100000_2_I1(this, 4));
        C14870pt r11 = this.A05;
        C19980zJ r10 = this.A00;
        AnonymousClass01V r13 = this.A08;
        TextEmojiLabel A0Q = C13680ns.A0Q(this.A00, R.id.settings_security_toggle_info);
        if (this.A02.A01.A1d()) {
            boolean A0E2 = this.A00.A0E.A0E(r1, 903);
            i2 = R.string.str14b9;
            if (A0E2) {
                i2 = R.string.str14ba;
            }
        } else {
            i2 = R.string.str14b8;
        }
        C45922Bq.A08(this, this.A03.A05("security-and-privacy", "security-code-change-notification"), r10, r11, A0Q, r13, C13680ns.A0d(this, "learn-more", new Object[1], 0, i2));
        C14870pt r112 = this.A05;
        C19980zJ r102 = this.A00;
        AnonymousClass01V r132 = this.A08;
        C45922Bq.A08(this, this.A02.A00("https://www.whatsapp.com/security"), r102, r112, C13680ns.A0Q(this.A00, R.id.settings_security_info_text), r132, C13680ns.A0d(this, "learn-more", new Object[1], 0, R.string.str14bc));
        TextView A0L = C13680ns.A0L(this.A00, R.id.settings_security_toggle_title);
        boolean A1d = this.A02.A01.A1d();
        int i4 = R.string.str15c4;
        if (A1d) {
            i4 = R.string.str15c5;
        }
        A0L.setText(i4);
        C13680ns.A19(findViewById(R.id.security_notifications_group), compoundButton, 21);
        StringBuilder A0r = AnonymousClass000.A0r("SettingsSecurity/shouldShowMultiAppAutoConfConsentToggle/MULTI_APP_AUTOCONF_ENABLED = ");
        A0r.append(false);
        A0r.append("; autoconfType = ");
        A0r.append(C13680ns.A0B(this.A09).getInt("autoconf_type", -1));
        A0r.append("; should_kill_autoconf = ");
        A0r.append(this.A0C.A0E(r1, 2702));
        C13680ns.A1V(A0r);
        if (this.A0C.A0E(r1, 1071)) {
            View A0E3 = C004601z.A0E(this.A00, R.id.e2ee_settings_layout);
            View A0E4 = C004601z.A0E(this.A00, R.id.settings_security_top_container);
            C13680ns.A19(C004601z.A0E(this.A00, R.id.security_settings_learn_more), this, 22);
            A0E3.setVisibility(0);
            A0E4.setVisibility(8);
        }
    }
}
