package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1Vt;
import X.AnonymousClass22J;
import X.AnonymousClass4NS;
import X.C101964yB;
import X.C106765Fc;
import X.C109935Ui;
import X.C14870pt;
import X.C18450wi;
import X.C209712h;
import X.C212213g;
import X.C228019i;
import X.C35361lo;
import X.C47272Ih;
import X.C63473Is;
import X.C83794Ib;
import X.C86184Rn;
import X.C93394j7;
import android.content.SharedPreferences;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class RunnableRunnableShape1S0310000_I1 implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public final int A04 = 1;

    public RunnableRunnableShape1S0310000_I1(C35361lo r2, C101964yB r3, C109935Ui r4) {
        this.A00 = r3;
        this.A01 = r2;
        this.A03 = true;
        this.A02 = r4;
    }

    public RunnableRunnableShape1S0310000_I1(AnonymousClass4NS r2, AnonymousClass22J r3, AnonymousClass22J r4, boolean z2) {
        this.A03 = z2;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public RunnableRunnableShape1S0310000_I1(TextView textView, AnonymousClass1Vt r3, C86184Rn r4) {
        this.A00 = r4;
        this.A01 = textView;
        this.A02 = r3;
        this.A03 = true;
    }

    public final void run() {
        C14870pt r2;
        RunnableRunnableShape14S0200000_I1_2 runnableRunnableShape14S0200000_I1_2;
        switch (this.A04) {
            case 0:
                C228019i r0 = ((C86184Rn) this.A00).A04;
                r0.A05((TextView) this.A01, (AnonymousClass1Vt) this.A02, false);
                r0.A00.A09(R.string.str109a, 0);
                return;
            case 1:
                C101964yB r6 = (C101964yB) this.A00;
                C35361lo r5 = (C35361lo) this.A01;
                C47272Ih r4 = (C47272Ih) this.A02;
                C209712h r3 = r6.A02;
                C35361lo A012 = r3.A04.A01(r5.A0F);
                if (A012 == null) {
                    r2 = r3.A01;
                    runnableRunnableShape14S0200000_I1_2 = new RunnableRunnableShape14S0200000_I1_2(r6, 38, r5);
                    break;
                } else {
                    C14870pt.A03(r3.A01, r6, A012, 37);
                    r3.A03(A012, r4);
                    return;
                }
            default:
                boolean z2 = this.A03;
                AnonymousClass4NS r7 = (AnonymousClass4NS) this.A00;
                AnonymousClass22J r52 = (AnonymousClass22J) this.A01;
                AnonymousClass22J r62 = (AnonymousClass22J) this.A02;
                if (!z2) {
                    String string = ((SharedPreferences) r7.A01.A01.getValue()).getString("pref_avatar_profile_photo_poses", (String) null);
                    if (string != null) {
                        JSONArray jSONArray = new JSONArray(string);
                        ArrayList A0u = AnonymousClass000.A0u();
                        int i2 = 0;
                        int length = jSONArray.length();
                        while (i2 < length) {
                            int i3 = i2 + 1;
                            JSONObject jSONObject = jSONArray.getJSONObject(i2);
                            String string2 = jSONObject.getString("url");
                            String string3 = jSONObject.has("emojis") ? jSONObject.getString("emojis") : null;
                            C18450wi.A0B(string2);
                            A0u.add(new C93394j7(string2, string3));
                            i2 = i3;
                        }
                        List A013 = ((C212213g) r7.A03.get()).A01(A0u, false);
                        if (!A013.isEmpty()) {
                            r2 = r7.A00;
                            runnableRunnableShape14S0200000_I1_2 = new RunnableRunnableShape14S0200000_I1_2(r52, 44, A013);
                            break;
                        }
                    }
                    r7.A02.Aco(new RunnableRunnableShape1S0310000_I1(r7, r52, r62, true));
                    return;
                }
                C83794Ib r32 = (C83794Ib) r7.A04.get();
                r32.A01.A71(new IDxRProviderShape347S0100000_2_I1(r32, 2)).Aah(new IDxRCallbacksShape75S0200000_2_I1(new C63473Is(r7, r52, r62), 0, new C106765Fc(r7, r62)));
                return;
        }
        r2.A0K(runnableRunnableShape14S0200000_I1_2);
    }
}
