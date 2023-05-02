package org.npci.commonlibrary;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass69I;
import X.AnonymousClass69X;
import X.C110115dX;
import X.C110385e1;
import X.C110495eG;
import X.C118985vj;
import X.C13680ns;
import X.C13690nt;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.facebook.redex.IDxCListenerShape0S2400000_3_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

public class ATMPinFragment extends Hilt_ATMPinFragment implements AnonymousClass69I {
    public int A00 = 0;
    public ViewSwitcher A01 = null;
    public C118985vj A02;
    public boolean A03 = false;
    public final HashMap A04 = AnonymousClass000.A0x();

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout041d);
    }

    public void A18(Bundle bundle, View view) {
        String A0J;
        View view2 = view;
        super.A18(bundle, view2);
        A1B();
        ViewGroup A0K = C13690nt.A0K(view2, R.id.switcherLayout1);
        ViewGroup A0K2 = C13690nt.A0K(view2, R.id.switcherLayout2);
        this.A01 = (ViewSwitcher) view2.findViewById(R.id.view_switcher);
        if (this.A07 != null) {
            int i2 = 0;
            boolean z2 = false;
            while (i2 < this.A07.length()) {
                try {
                    JSONObject jSONObject = this.A07.getJSONObject(i2);
                    String string = jSONObject.getString("subtype");
                    int optInt = jSONObject.optInt("dLength") == 0 ? 6 : jSONObject.optInt("dLength");
                    if (string.equals("MPIN")) {
                        C110495eG A19 = A19(A0J(R.string.str1d3a), i2, optInt);
                        C110495eG A192 = A19(A0J(R.string.str1d30), i2, optInt);
                        if (!z2) {
                            A19.A9B();
                            z2 = true;
                        }
                        ArrayList A0u = AnonymousClass000.A0u();
                        A0u.add(A19);
                        A0u.add(A192);
                        C110385e1 r1 = new C110385e1(A0C());
                        r1.A00(A0u, this);
                        r1.A02 = jSONObject;
                        this.A0B.add(r1);
                        A0K2.addView(r1);
                    } else {
                        if (string.equals("ATMPIN")) {
                            A0J = A0J(R.string.str1d2d);
                        } else if ("OTP".equals(string) || "SMS".equals(string) || "EMAIL".equals(string) || "HOTP".equals(string) || "TOTP".equals(string)) {
                            A0J = A0J(R.string.str1d39);
                            this.A00 = i2;
                        } else {
                            A0J = "";
                        }
                        C110495eG A193 = A19(A0J, i2, optInt);
                        if (!z2) {
                            A193.A9B();
                            z2 = true;
                        }
                        A193.A07 = jSONObject;
                        this.A0B.add(A193);
                        A0K.addView(A193);
                    }
                    i2++;
                } catch (JSONException e2) {
                    throw C110115dX.A0Z(e2);
                }
            }
        }
        int i3 = this.A00;
        if (i3 != -1) {
            ArrayList arrayList = this.A0B;
            if (arrayList.get(i3) instanceof C110495eG) {
                C110495eG A0l = C110115dX.A0l(arrayList, i3);
                A1D(A0l);
                A0l.A0C = true;
            }
        }
        ArrayList arrayList2 = this.A0B;
        int size = arrayList2.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (i4 != this.A00) {
                AnonymousClass69X r10 = (AnonymousClass69X) arrayList2.get(i4);
                Drawable A042 = AnonymousClass00T.A04(A0C(), R.drawable.ic_visibility_on);
                Drawable A043 = AnonymousClass00T.A04(A0C(), R.drawable.ic_visibility_off);
                String A0J2 = A0J(R.string.str1d2a);
                String A0J3 = A0J(R.string.str1d2c);
                r10.Agw(A042, new IDxCListenerShape0S2400000_3_I1(A043, A042, this, r10, A0J2, A0J3, 0), A0J3, 0, true, true);
            }
        }
    }

    public void ARZ(int i2) {
        if (!(this.A0B.get(i2) instanceof C110385e1)) {
            this.A00 = i2;
        }
    }

    public void ARa(int i2, String str) {
        int i3 = this.A00;
        if (i3 != -1 && i3 == i2) {
            ArrayList arrayList = this.A0B;
            if (arrayList.get(i3) instanceof C110495eG) {
                Timer timer = this.A06;
                if (timer != null) {
                    timer.cancel();
                }
                C110495eG A002 = C110495eG.A00(arrayList, this);
                Drawable A042 = AnonymousClass00T.A04(A0C(), R.drawable.ic_tick_ok);
                if (A042 != null) {
                    A002.A03.setImageDrawable(A042);
                }
                A002.A01(A002.A03, true);
            }
        }
    }
}
