package com.obwhatsapp.settings;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass0Fp;
import X.AnonymousClass1WS;
import X.AnonymousClass29T;
import X.AnonymousClass2KO;
import X.C12440kP;
import X.C13680ns;
import X.C15830rv;
import X.C16030sJ;
import X.C16220sf;
import X.C17220uj;
import X.C17250um;
import X.C19740yv;
import X.C19980zJ;
import X.C218415q;
import X.C434920f;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.TwoStatePreference;
import com.facebook.redex.IDxCListenerShape117S0200000_2_I0;
import com.facebook.redex.IDxCListenerShape278S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.preference.WaRingtonePreference;
import com.whatsapp.util.Log;

public class SettingsJidNotificationFragment extends Hilt_SettingsJidNotificationFragment {
    public C19980zJ A00;
    public C19740yv A01;
    public AnonymousClass013 A02;
    public C17250um A03;
    public C15830rv A04;
    public C16220sf A05;
    public C17220uj A06;

    public void A0q() {
        super.A0q();
        if (this.A05.A0V(this.A04.getRawString())) {
            Log.i("settings-jid-notifications/onStart settings-store updated, refreshing ui");
            this.A02.A07.A0T();
            A1D();
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        Object parcelableExtra;
        String str;
        Object obj = "";
        if (i2 == 1) {
            if (intent != null) {
                parcelableExtra = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
                str = "jid_message_tone";
            }
            super.A0x(i2, i3, intent);
            return;
        }
        if (i2 == 2 && intent != null) {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            str = "jid_call_ringtone";
        }
        super.A0x(i2, i3, intent);
        return;
        Preference A92 = A92(str);
        C12440kP r0 = A92.A0A;
        if (parcelableExtra != null) {
            obj = parcelableExtra;
        }
        r0.AV5(A92, obj);
    }

    public void A0z(Menu menu, MenuInflater menuInflater) {
        menu.add(0, R.id.menuitem_reset_notification_settings, 0, R.string.str159c).setShowAsAction(0);
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_reset_notification_settings) {
            return false;
        }
        C16220sf r3 = this.A05;
        AnonymousClass1WS A07 = r3.A07(this.A04.getRawString());
        AnonymousClass1WS A022 = A07.A02();
        A07.A0B = A022.A07();
        A07.A0C = A022.A08();
        A07.A0A = A022.A06();
        A07.A09 = A022.A05();
        A07.A07 = A022.A03();
        A07.A08 = A022.A04();
        A07.A0J = false;
        A07.A0E = false;
        r3.A0K(A07);
        this.A02.A07.A0T();
        A1D();
        return true;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        A0a(true);
    }

    public void A19(String str, Bundle bundle) {
        C15830rv A022 = C15830rv.A02(A0C().getIntent().getStringExtra("jid"));
        AnonymousClass00B.A06(A022);
        this.A04 = A022;
        String string = A0D().getString(R.string.str1da5);
        AnonymousClass2KO r0 = this.A00;
        if (r0 != null) {
            r0.setTitle(string);
        }
        A1D();
    }

    public final void A1D() {
        AnonymousClass1WS A07 = this.A05.A07(this.A04.getRawString());
        A1C(R.xml.xml0008);
        WaRingtonePreference waRingtonePreference = (WaRingtonePreference) A92("jid_message_tone");
        String A072 = A07.A07();
        waRingtonePreference.A00 = 7;
        waRingtonePreference.A02 = true;
        waRingtonePreference.A03 = true;
        waRingtonePreference.A01 = A072;
        waRingtonePreference.A0I(C218415q.A07(this.A00, A072));
        waRingtonePreference.A0A = new IDxCListenerShape117S0200000_2_I0(waRingtonePreference, this, 0);
        ListPreference listPreference = (ListPreference) A92("jid_message_vibrate");
        listPreference.A0U(A07.A08());
        listPreference.A0I(listPreference.A0T());
        listPreference.A0A = new IDxCListenerShape278S0100000_2_I0(this, 0);
        ListPreference listPreference2 = (ListPreference) A92("jid_message_popup");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            final int A002 = C434920f.A00(this.A00, R.attr.attr0465, R.color.color070b);
            PreferenceGroup preferenceGroup = (PreferenceGroup) A92("notification");
            preferenceGroup.A0V(listPreference2);
            preferenceGroup.A05();
            AnonymousClass1 r2 = new ListPreference(this.A00) {
                public void A07() {
                    AnonymousClass29T.A01(this.A00, 0);
                }

                public void A0R(AnonymousClass0Fp r4) {
                    super.A0R(r4);
                    View view = r4.A0H;
                    TextView A0M = C13680ns.A0M(view, 16908310);
                    TextView A0M2 = C13680ns.A0M(view, 16908304);
                    int i2 = A002;
                    A0M.setTextColor(i2);
                    A0M2.setTextColor(i2);
                    r4.A00 = true;
                    r4.A01 = true;
                }
            };
            String str = listPreference2.A0L;
            r2.A0L = str;
            if (r2.A0Y && !(!TextUtils.isEmpty(str))) {
                if (!TextUtils.isEmpty(r2.A0L)) {
                    r2.A0Y = true;
                } else {
                    throw new IllegalStateException("Preference does not have a key assigned.");
                }
            }
            r2.A0X = listPreference2.A0X;
            r2.A0I = listPreference2.A01;
            r2.A0V(listPreference2.A03);
            r2.A04 = listPreference2.A04;
            r2.A0I(listPreference2.A02());
            CharSequence charSequence = listPreference2.A0H;
            CharSequence charSequence2 = r2.A0H;
            if (charSequence != null ? !charSequence.equals(charSequence2) : charSequence2 != null) {
                r2.A0H = charSequence;
                r2.A04();
            }
            int i3 = listPreference2.A02;
            if (i3 != r2.A02) {
                r2.A02 = i3;
                r2.A05();
            }
            boolean z2 = listPreference2.A0V;
            if (r2.A0V != z2) {
                r2.A0V = z2;
                r2.A04();
            }
            preferenceGroup.A0U(r2);
            r2.A0U(listPreference2.A01);
            r2.A0I(r2.A05.getString(R.string.str12eb));
        } else {
            listPreference2.A0U(A07.A06());
            listPreference2.A0I(listPreference2.A0T());
            listPreference2.A0A = new IDxCListenerShape278S0100000_2_I0(this, 2);
        }
        ListPreference listPreference3 = (ListPreference) A92("jid_message_light");
        listPreference3.A0V(this.A02.A0U(SettingsNotifications.A0q));
        listPreference3.A0U(A07.A05());
        listPreference3.A0I(listPreference3.A0T());
        listPreference3.A0A = new IDxCListenerShape278S0100000_2_I0(this, 4);
        TwoStatePreference twoStatePreference = (TwoStatePreference) A92("jid_use_high_priority_notifications");
        if (i2 < 21) {
            PreferenceGroup preferenceGroup2 = (PreferenceGroup) A92("notification");
            preferenceGroup2.A0V(twoStatePreference);
            preferenceGroup2.A05();
        } else {
            twoStatePreference.A0T(!A07.A0B());
            twoStatePreference.A0A = new IDxCListenerShape278S0100000_2_I0(this, 1);
        }
        if (C16030sJ.A0L(this.A04)) {
            Preference A92 = A92("jid_call");
            if (A92 != null) {
                PreferenceScreen preferenceScreen = this.A02.A07;
                preferenceScreen.A0V(A92);
                preferenceScreen.A05();
            }
        } else {
            WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) A92("jid_call_ringtone");
            String A032 = A07.A03();
            waRingtonePreference2.A00 = 1;
            waRingtonePreference2.A02 = true;
            waRingtonePreference2.A03 = true;
            waRingtonePreference2.A01 = A032;
            waRingtonePreference2.A0I(C218415q.A07(this.A00, A032));
            waRingtonePreference2.A0A = new IDxCListenerShape117S0200000_2_I0(waRingtonePreference2, this, 1);
            ListPreference listPreference4 = (ListPreference) A92("jid_call_vibrate");
            listPreference4.A0U(A07.A04());
            listPreference4.A0I(listPreference4.A0T());
            listPreference4.A0A = new IDxCListenerShape278S0100000_2_I0(this, 3);
        }
        TwoStatePreference twoStatePreference2 = (TwoStatePreference) A92("jid_use_custom");
        twoStatePreference2.A0T(A07.A0J);
        twoStatePreference2.A0A = new IDxCListenerShape278S0100000_2_I0(this, 5);
        A1E();
    }

    public final void A1E() {
        boolean z2 = this.A05.A07(this.A04.getRawString()).A0J;
        A92("jid_message_tone").A0M(z2);
        A92("jid_message_vibrate").A0M(z2);
        A92("jid_message_popup").A0M(z2);
        A92("jid_message_light").A0M(z2);
        if (Build.VERSION.SDK_INT >= 21) {
            A92("jid_use_high_priority_notifications").A0M(z2);
        }
        if (!C16030sJ.A0L(this.A04)) {
            A92("jid_call_ringtone").A0M(z2);
            A92("jid_call_vibrate").A0M(z2);
        }
    }

    public boolean AV7(Preference preference) {
        String str = preference.A0L;
        if (str.equals("jid_message_tone")) {
            startActivityForResult(((WaRingtonePreference) preference).A0S(), 1);
            return true;
        } else if (!str.equals("jid_call_ringtone")) {
            return super.AV7(preference);
        } else {
            startActivityForResult(((WaRingtonePreference) preference).A0S(), 2);
            return true;
        }
    }
}
