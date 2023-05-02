package com.whatsapp.voipcalling;

import X.AnonymousClass000;
import X.AnonymousClass15I;
import X.AnonymousClass1ZK;
import X.AnonymousClass1ZQ;
import X.AnonymousClass1yR;
import X.AnonymousClass1yV;
import X.AnonymousClass2AN;
import X.AnonymousClass2DC;
import X.AnonymousClass2DE;
import X.AnonymousClass3K4;
import X.C13690nt;
import X.C14550pN;
import X.C14760pi;
import X.C15860rz;
import X.C19200xv;
import X.C19270y9;
import X.C19610yi;
import X.C28961Zl;
import X.C29251aI;
import X.C37831po;
import X.C42821yj;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape18S0100000_I1_1;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.group.GroupCallButtonController;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.whatsapp.util.Log;

public class IDxCObserverShape111S0100000_2_I0 extends C19270y9 {
    public Object A00;
    public final int A01;

    public IDxCObserverShape111S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        C19610yi r2;
        View view;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                if (C14550pN.A1Q(homeActivity)) {
                    r2 = homeActivity.A0w;
                    view = homeActivity.A0D;
                    break;
                } else {
                    return;
                }
            case 3:
                Log.i("CameraUi/onShowingIncomingCallUI");
                C29251aI r1 = (C29251aI) this.A00;
                if (r1.A0X()) {
                    r1.A0Y = false;
                    r1.A0V(r1.A0J.A02());
                    return;
                }
                return;
            case 5:
                C42821yj r12 = (C42821yj) this.A00;
                if (C14550pN.A1Q((C14550pN) r12.A22)) {
                    AnonymousClass1yV r13 = r12.A22;
                    r2 = ((AnonymousClass1yR) r13).A00.A0J;
                    view = ((C14550pN) r13).A00;
                    break;
                } else {
                    return;
                }
            case 10:
                ((AnonymousClass1ZK) this.A00).A03();
                return;
            default:
                super.A00();
                return;
        }
        AnonymousClass2DE.A03(view, r2);
    }

    public void A01(long j2, boolean z2, boolean z3) {
        if (2 - this.A01 != 0) {
            super.A01(j2, z2, z3);
            return;
        }
        AnonymousClass2AN r4 = (AnonymousClass2AN) this.A00;
        r4.setVisibility(0);
        TextView textView = r4.A0I;
        textView.setVisibility(0);
        textView.setText(C28961Zl.A04(r4.A06, C13690nt.A09(j2)));
        textView.setTag(Long.valueOf(j2));
        if (r4.A0K.getVisibility() == 0 && z2 != r4.A0G) {
            r4.A0G = z2;
            r4.A01();
        } else if (r4.A0F != z3) {
            r4.A0F = z3;
        } else {
            return;
        }
        r4.A02();
    }

    public void A02(C37831po r6) {
        switch (this.A01) {
            case 1:
                Log.i("voip/CallsFragment/onCallEnded");
                if (!r6.A0B()) {
                    ((CallsHistoryFragment) this.A00).A1E();
                    return;
                }
                return;
            case 2:
                ((View) this.A00).setVisibility(8);
                return;
            case 4:
                AnonymousClass15I r4 = (AnonymousClass15I) this.A00;
                Object obj = r6.A0A() ? r6.A04 : r6.A0C.A01;
                if (obj != null) {
                    r4.A0Z.execute(new RunnableRunnableShape0S0300000_I0(r4, obj, r6, 34));
                    return;
                }
                return;
            case 5:
                ((C42821yj) this.A00).A22.invalidateOptionsMenu();
                return;
            case 6:
                AnonymousClass2DC r0 = ((GroupCallButtonController) this.A00).A04;
                if (r0 != null) {
                    r0.A00.A02();
                    return;
                }
                return;
            case 7:
                C19200xv r3 = (C19200xv) this.A00;
                r3.A09.Acl(new RunnableRunnableShape18S0100000_I1_1((Object) r3, 49));
                return;
            case 9:
                AnonymousClass3K4.A0t((QuickContactActivity) this.A00);
                return;
            case 11:
                Log.i("voip/VoipActivityV2/onCallEnded");
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                if (!voipActivityV2.A0i.A00) {
                    voipActivityV2.finish();
                    return;
                }
                return;
            default:
                super.A02(r6);
                return;
        }
    }

    public void A03(C37831po r5) {
        C19610yi r2;
        View view;
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                homeActivity.A0w.A04();
                if (C14550pN.A1Q(homeActivity)) {
                    r2 = homeActivity.A0w;
                    view = homeActivity.A0D;
                    break;
                } else {
                    return;
                }
            case 2:
                AnonymousClass2AN r3 = (AnonymousClass2AN) this.A00;
                r3.A0F = AnonymousClass000.A1P(r5.A04().size());
                r3.A03();
                Runnable runnable = r3.A0N;
                r3.removeCallbacks(runnable);
                r3.postDelayed(runnable, 2000);
                return;
            case 5:
                C42821yj r22 = (C42821yj) this.A00;
                ((AnonymousClass1yR) r22.A22).A00.A0J.A04();
                r22.A22.invalidateOptionsMenu();
                AnonymousClass1ZQ r1 = r22.A4A;
                if (r1 != null && r1.ACn()) {
                    r1.AaG();
                }
                if (C14550pN.A1Q((C14550pN) r22.A22)) {
                    AnonymousClass1yV r12 = r22.A22;
                    r2 = ((AnonymousClass1yR) r12).A00.A0J;
                    view = ((C14550pN) r12).A00;
                    break;
                } else {
                    return;
                }
            case 6:
                AnonymousClass2DC r0 = ((GroupCallButtonController) this.A00).A04;
                if (r0 != null) {
                    r0.A00.A02();
                    return;
                }
                return;
            case 9:
                AnonymousClass3K4.A0t((QuickContactActivity) this.A00);
                return;
            case 10:
                AnonymousClass1ZK r13 = (AnonymousClass1ZK) this.A00;
                r13.A0R(r13.A0V());
                return;
            default:
                super.A03(r5);
                return;
        }
        AnonymousClass2DE.A03(view, r2);
    }

    public void A04(C37831po r6, boolean z2) {
        switch (this.A01) {
            case 1:
                Log.i("voip/CallsFragment/onCallMissed");
                ((CallsHistoryFragment) this.A00).A1E();
                return;
            case 8:
                C14760pi r4 = (C14760pi) this.A00;
                r4.A03();
                if (r4.A00.isEmpty()) {
                    C15860rz r0 = r4.A0A;
                    r0.A0K().putLong("first_missed_call", r6.A0A).apply();
                }
                synchronized (r4) {
                    r4.A00.add(r6);
                }
                r4.A04(z2);
                r4.A0D.A04();
                return;
            case 11:
                Log.i("voip/VoipActivityV2/onCallMissed");
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
                if (!voipActivityV2.A0i.A00) {
                    voipActivityV2.finish();
                    return;
                }
                return;
            default:
                super.A04(r6, z2);
                return;
        }
    }
}
