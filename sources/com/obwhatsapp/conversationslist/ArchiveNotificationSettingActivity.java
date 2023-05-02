package com.obwhatsapp.conversationslist;

import X.AnonymousClass00T;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C222417e;
import X.C49132Rg;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxCListenerShape220S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape17S0100000_I1_2;
import com.obwhatsapp.R;
import com.obwhatsapp.components.WaSwitchView;

public class ArchiveNotificationSettingActivity extends C14530pL {
    public C222417e A00;
    public boolean A01;

    public ArchiveNotificationSettingActivity() {
        this(0);
    }

    public ArchiveNotificationSettingActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 57);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = (C222417e) r1.A0g.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        setContentView((int) R.layout.layout0073);
        setTitle(R.string.str0101);
        Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.toolbar);
        C14530pL.A0W(this, toolbar, this.A01);
        toolbar.setTitle((CharSequence) getString(R.string.str0101));
        toolbar.setBackgroundResource(R.color.color064b);
        toolbar.A0C(this, R.style.style02e9);
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape17S0100000_I1_2(this, 33));
        Aem(toolbar);
        WaSwitchView waSwitchView = (WaSwitchView) AnonymousClass00T.A05(this, R.id.notify_new_message_switch_view);
        waSwitchView.setChecked(true ^ this.A09.A1c());
        waSwitchView.setOnCheckedChangeListener(new IDxCListenerShape220S0100000_2_I1(this, 1));
        waSwitchView.setOnClickListener(new ViewOnClickCListenerShape17S0100000_I1_2(waSwitchView, 31));
        WaSwitchView waSwitchView2 = (WaSwitchView) AnonymousClass00T.A05(this, R.id.auto_hide_switch_view);
        waSwitchView2.setChecked(C13680ns.A0B(this.A09).getBoolean("auto_archive_inactive_chats", false));
        waSwitchView2.setOnCheckedChangeListener(new IDxCListenerShape220S0100000_2_I1(this, 0));
        waSwitchView2.setOnClickListener(new ViewOnClickCListenerShape17S0100000_I1_2(waSwitchView2, 32));
        waSwitchView2.setVisibility(8);
    }
}
