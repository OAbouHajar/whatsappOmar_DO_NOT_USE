package X;

import android.transition.Transition;
import java.util.ArrayList;

/* renamed from: X.0YS  reason: invalid class name */
public class AnonymousClass0YS implements Transition.TransitionListener {
    public final /* synthetic */ C02770Ew A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public AnonymousClass0YS(C02770Ew r1, Object obj, Object obj2, ArrayList arrayList, ArrayList arrayList2) {
        this.A00 = r1;
        this.A01 = obj;
        this.A03 = arrayList;
        this.A02 = obj2;
        this.A04 = arrayList2;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.A01;
        if (obj != null) {
            this.A00.A0H(obj, this.A03, (ArrayList) null);
        }
        Object obj2 = this.A02;
        if (obj2 != null) {
            this.A00.A0H(obj2, this.A04, (ArrayList) null);
        }
    }
}
