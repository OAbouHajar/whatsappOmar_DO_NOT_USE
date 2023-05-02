package com.obwhatsapp.calling.calllink.viewmodel;

import X.AnonymousClass027;
import X.AnonymousClass4KI;
import X.C003401n;
import X.C016407u;
import X.C13680ns;
import X.C13690nt;
import X.C18260wP;
import X.C204710g;
import X.C93504jJ;
import android.os.Handler;
import android.os.Message;
import com.obwhatsapp.R;
import java.util.Set;

public class CallLinkViewModel extends C003401n {
    public final AnonymousClass027 A00;
    public final AnonymousClass027 A01;
    public final C016407u A02;
    public final AnonymousClass4KI A03;
    public final C18260wP A04;

    public CallLinkViewModel(C016407u r4, AnonymousClass4KI r5, C18260wP r6) {
        AnonymousClass027 A0O = C13690nt.A0O();
        this.A01 = A0O;
        AnonymousClass027 A0O2 = C13690nt.A0O();
        this.A00 = A0O2;
        this.A03 = r5;
        r5.A02.add(this);
        this.A02 = r4;
        this.A04 = r6;
        C13680ns.A1O(A0O2, R.string.str0346);
        C13680ns.A1O(A0O, R.string.str035e);
        AnonymousClass027 A032 = this.A02.A03("saved_state_link");
        if (A032.A01() == null || ((C93504jJ) A032.A01()).A03 != 1) {
            A05(A06());
        }
    }

    public void A04() {
        AnonymousClass4KI r1 = this.A03;
        Set set = r1.A02;
        set.remove(this);
        if (set.size() == 0) {
            r1.A00.A03(r1);
        }
    }

    public final void A05(boolean z2) {
        boolean A0A = this.A04.A0A();
        C016407u r0 = this.A02;
        if (!A0A) {
            r0.A06("saved_state_link", new C93504jJ("", "", 3, 0, R.color.color0507, 0, false));
            return;
        }
        r0.A06("saved_state_link", new C93504jJ("", "", 0, 0, R.color.color0505, R.string.str0619, false));
        this.A03.A01.A00(new C204710g(Message.obtain((Handler) null, 0, z2 ? 1 : 0, 0), "create_call_link"));
    }

    public final boolean A06() {
        Boolean bool = (Boolean) this.A02.A03.get("saved_state_is_video");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
