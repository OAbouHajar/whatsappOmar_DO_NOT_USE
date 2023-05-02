package X;

import android.transition.Transition;
import android.view.View;
import java.util.ArrayList;

/* renamed from: X.0YR  reason: invalid class name */
public class AnonymousClass0YR implements Transition.TransitionListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C02770Ew A01;
    public final /* synthetic */ ArrayList A02;

    public AnonymousClass0YR(View view, C02770Ew r2, ArrayList arrayList) {
        this.A01 = r2;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass000.A0N(arrayList, i2).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        transition.removeListener(this);
        transition.addListener(this);
    }
}
