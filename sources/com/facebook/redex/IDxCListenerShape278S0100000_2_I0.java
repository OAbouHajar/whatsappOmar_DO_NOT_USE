package com.facebook.redex;

import X.AnonymousClass1WS;
import X.AnonymousClass2KO;
import X.AnonymousClass3K2;
import X.C12440kP;
import X.C15830rv;
import X.C16010sH;
import X.C16220sf;
import X.C19740yv;
import android.os.Build;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.SettingsJidNotificationFragment;

public class IDxCListenerShape278S0100000_2_I0 implements C12440kP {
    public Object A00;
    public final int A01;

    public IDxCListenerShape278S0100000_2_I0(SettingsJidNotificationFragment settingsJidNotificationFragment, int i2) {
        this.A01 = i2;
        this.A00 = settingsJidNotificationFragment;
    }

    public final boolean AV5(Preference preference, Object obj) {
        AnonymousClass2KO r0;
        C16220sf r3;
        AnonymousClass1WS r2;
        switch (this.A01) {
            case 0:
                SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) this.A00;
                C16220sf A0U = AnonymousClass3K2.A0U(preference, settingsJidNotificationFragment, obj);
                C15830rv r02 = settingsJidNotificationFragment.A04;
                A0U.A0O(r02.getRawString(), obj.toString());
                return true;
            case 1:
                SettingsJidNotificationFragment settingsJidNotificationFragment2 = (SettingsJidNotificationFragment) this.A00;
                r3 = settingsJidNotificationFragment2.A05;
                C15830rv r22 = settingsJidNotificationFragment2.A04;
                boolean equals = Boolean.FALSE.equals(obj);
                r2 = r3.A07(r22.getRawString());
                if (equals != r2.A0E) {
                    r2.A0E = equals;
                    break;
                } else {
                    return true;
                }
            case 2:
                SettingsJidNotificationFragment settingsJidNotificationFragment3 = (SettingsJidNotificationFragment) this.A00;
                C16220sf A0U2 = AnonymousClass3K2.A0U(preference, settingsJidNotificationFragment3, obj);
                C15830rv r03 = settingsJidNotificationFragment3.A04;
                A0U2.A0M(r03.getRawString(), obj.toString());
                return true;
            case 3:
                SettingsJidNotificationFragment settingsJidNotificationFragment4 = (SettingsJidNotificationFragment) this.A00;
                r3 = AnonymousClass3K2.A0U(preference, settingsJidNotificationFragment4, obj);
                C15830rv r04 = settingsJidNotificationFragment4.A04;
                String obj2 = obj.toString();
                r2 = r3.A07(r04.getRawString());
                if (!TextUtils.equals(obj2, r2.A08)) {
                    r2.A08 = obj2;
                    break;
                } else {
                    return true;
                }
            case 4:
                SettingsJidNotificationFragment settingsJidNotificationFragment5 = (SettingsJidNotificationFragment) this.A00;
                String str = Build.MODEL;
                if ((str.contains("Desire") || str.contains("Wildfire")) && !obj.toString().equals("00FF00") && (r0 = settingsJidNotificationFragment5.A00) != null) {
                    r0.Afg(R.string.str0c16);
                }
                C16220sf A0U3 = AnonymousClass3K2.A0U(preference, settingsJidNotificationFragment5, obj);
                C15830rv r05 = settingsJidNotificationFragment5.A04;
                A0U3.A0L(r05.getRawString(), obj.toString());
                return true;
            default:
                SettingsJidNotificationFragment settingsJidNotificationFragment6 = (SettingsJidNotificationFragment) this.A00;
                C16220sf r5 = settingsJidNotificationFragment6.A05;
                C15830rv r1 = settingsJidNotificationFragment6.A04;
                boolean equals2 = Boolean.TRUE.equals(obj);
                C19740yv r32 = settingsJidNotificationFragment6.A01;
                AnonymousClass1WS A07 = r5.A07(r1.getRawString());
                if (equals2 != A07.A0J) {
                    if (equals2) {
                        A07.A0E = A07.A0B();
                        C16010sH A08 = r5.A09.A08(r1);
                        if (A08 != null) {
                            r32.A03(r5.A0G.A00, A08);
                        }
                    } else {
                        r32.A06(r1);
                    }
                    A07.A0J = equals2;
                    r5.A0K(A07);
                }
                settingsJidNotificationFragment6.A1E();
                return true;
        }
        r3.A0K(r2);
        return true;
    }
}
