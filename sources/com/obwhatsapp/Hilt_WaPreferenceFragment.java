package com.obwhatsapp;

import X.AnonymousClass006;
import X.AnonymousClass013;
import X.AnonymousClass01A;
import X.AnonymousClass04o;
import X.AnonymousClass12W;
import X.AnonymousClass1M1;
import X.AnonymousClass2TA;
import X.C14730pf;
import X.C14870pt;
import X.C15800rs;
import X.C15900s5;
import X.C16000sG;
import X.C16040sK;
import X.C16150sX;
import X.C16220sf;
import X.C16320sq;
import X.C16760tb;
import X.C17050uS;
import X.C17060uT;
import X.C17220uj;
import X.C17250um;
import X.C19740yv;
import X.C19980zJ;
import X.C25721Kw;
import X.C54442hW;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.preference.PreferenceFragmentCompat;
import com.obwhatsapp.settings.Hilt_SettingsChatHistoryFragment;
import com.obwhatsapp.settings.Hilt_SettingsJidNotificationFragment;
import com.obwhatsapp.settings.SettingsChatHistoryFragment;
import com.obwhatsapp.settings.SettingsJidNotificationFragment;

public abstract class Hilt_WaPreferenceFragment extends PreferenceFragmentCompat implements AnonymousClass006 {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public volatile C54442hW A04;

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A1B();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        LayoutInflater A0v = super.A0v(bundle);
        return A0v.cloneInContext(new C54452hX(A0v, (AnonymousClass01A) this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.C54442hW.A00(r0) == r4) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r4) {
        /*
            r3 = this;
            r0 = 1
            r3.A0V = r0
            android.content.ContextWrapper r0 = r3.A00
            r1 = 0
            if (r0 == 0) goto L_0x000f
            android.content.Context r0 = X.C54442hW.A00(r0)
            r2 = 0
            if (r0 != r4) goto L_0x0010
        L_0x000f:
            r2 = 1
        L_0x0010:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = "onAttach called multiple times with different Context! Hilt Fragments should not be retained."
            X.C52772eQ.A00(r0, r1, r2)
            r3.A1B()
            r3.A1A()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.Hilt_WaPreferenceFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A1B();
        A1A();
    }

    public void A1A() {
        if (this instanceof Hilt_SettingsJidNotificationFragment) {
            Hilt_SettingsJidNotificationFragment hilt_SettingsJidNotificationFragment = (Hilt_SettingsJidNotificationFragment) this;
            if (!hilt_SettingsJidNotificationFragment.A02) {
                hilt_SettingsJidNotificationFragment.A02 = true;
                SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) hilt_SettingsJidNotificationFragment;
                C16150sX r1 = ((C17050uS) ((C17060uT) hilt_SettingsJidNotificationFragment.generatedComponent())).A0b;
                settingsJidNotificationFragment.A03 = (C17250um) r1.A7e.get();
                settingsJidNotificationFragment.A00 = (C19980zJ) r1.A0P.get();
                settingsJidNotificationFragment.A06 = (C17220uj) r1.A9x.get();
                settingsJidNotificationFragment.A05 = (C16220sf) r1.A3y.get();
                settingsJidNotificationFragment.A01 = (C19740yv) r1.AQi.get();
                settingsJidNotificationFragment.A02 = (AnonymousClass013) r1.AR8.get();
            }
        } else if (this instanceof Hilt_SettingsChatHistoryFragment) {
            Hilt_SettingsChatHistoryFragment hilt_SettingsChatHistoryFragment = (Hilt_SettingsChatHistoryFragment) this;
            if (!hilt_SettingsChatHistoryFragment.A02) {
                hilt_SettingsChatHistoryFragment.A02 = true;
                SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) hilt_SettingsChatHistoryFragment;
                C16150sX r2 = ((C17050uS) ((C17060uT) hilt_SettingsChatHistoryFragment.generatedComponent())).A0b;
                settingsChatHistoryFragment.A01 = (C16040sK) r2.ADr.get();
                settingsChatHistoryFragment.A0B = (C16320sq) r2.ARB.get();
                settingsChatHistoryFragment.A02 = (C15900s5) r2.ALm.get();
                settingsChatHistoryFragment.A03 = (C16760tb) r2.APV.get();
                settingsChatHistoryFragment.A08 = (C14730pf) r2.ANy.get();
                settingsChatHistoryFragment.A04 = (C16000sG) r2.A4x.get();
                settingsChatHistoryFragment.A06 = (AnonymousClass1M1) r2.A86.get();
                settingsChatHistoryFragment.A07 = (AnonymousClass12W) r2.AEM.get();
                settingsChatHistoryFragment.A05 = (C15800rs) r2.A5c.get();
                settingsChatHistoryFragment.A00 = (C14870pt) r2.AB3.get();
                settingsChatHistoryFragment.A0A = (C25721Kw) r2.A6Z.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public final void A1B() {
        if (this.A00 == null) {
            this.A00 = new C54452hX(super.A0u(), (AnonymousClass01A) this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A01(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A04 == null) {
            synchronized (this.A03) {
                if (this.A04 == null) {
                    this.A04 = new C54442hW(this);
                }
            }
        }
        return this.A04.generatedComponent();
    }
}
