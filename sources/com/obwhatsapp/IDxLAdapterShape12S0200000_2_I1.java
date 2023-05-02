package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass1B2;
import X.AnonymousClass1ZK;
import X.AnonymousClass309;
import X.AnonymousClass3K3;
import X.AnonymousClass3T3;
import X.C16590tJ;
import X.C29251aI;
import X.C30551cZ;
import X.C54272h7;
import X.C70363gX;
import X.C82724Dx;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.appcompat.widget.SearchView;
import com.obwhatsapp.group.GroupParticipantsSearchFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class IDxLAdapterShape12S0200000_2_I1 extends C30551cZ {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLAdapterShape12S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        switch (this.A02) {
            case 0:
                Animation animation2 = (Animation) this.A00;
                animation2.setStartOffset(1500);
                ((View) this.A01).startAnimation(animation2);
                return;
            case 1:
                ((C29251aI) this.A01).A08();
                return;
            case 3:
                ((View) this.A01).setVisibility(4);
                return;
            case 4:
                AnonymousClass309 r3 = (AnonymousClass309) this.A00;
                View view = r3.A01;
                AnonymousClass00B.A04(view);
                view.setVisibility(8);
                r3.A04.removeView(r3.A01);
                r3.A01 = null;
                ((C82724Dx) this.A01).A00.A01 = null;
                return;
            case 5:
                View view2 = (View) this.A01;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.width = -2;
                view2.setLayoutParams(layoutParams);
                view2.setVisibility(8);
                return;
            case 6:
                AnonymousClass3T3 r1 = (AnonymousClass3T3) this.A00;
                r1.clearAnimation();
                r1.setVisibility(8);
                r1.A0E = false;
                r1.setEnabled(true);
                AnonymousClass3K3.A14(r1);
                ((Runnable) this.A01).run();
                return;
            case 7:
                GroupParticipantsSearchFragment groupParticipantsSearchFragment = (GroupParticipantsSearchFragment) this.A00;
                SearchView searchView = (SearchView) this.A01;
                if (groupParticipantsSearchFragment.A0A) {
                    searchView.setIconified(false);
                    groupParticipantsSearchFragment.A0A = false;
                    return;
                }
                groupParticipantsSearchFragment.A08.A01(searchView);
                return;
            case 8:
                AnonymousClass1ZK r2 = ((C70363gX) this.A00).A04;
                if (r2.A0P == null) {
                    ((View) this.A01).setVisibility(0);
                    AnonymousClass1B2 r12 = r2.A1I;
                    Log.e("voicenote/voicenotecancelled");
                    Iterator A002 = C16590tJ.A00(r12);
                    while (A002.hasNext()) {
                        ((C54272h7) A002.next()).A00();
                    }
                    return;
                }
                return;
            default:
                super.onAnimationEnd(animation);
                return;
        }
    }

    public void onAnimationStart(Animation animation) {
        switch (this.A02) {
            case 2:
                ((View) this.A01).setVisibility(0);
                return;
            case 6:
                ((View) this.A00).setEnabled(false);
                return;
            default:
                super.onAnimationStart(animation);
                return;
        }
    }
}
