package X;

import androidx.lifecycle.LegacySavedStateHandleController$1;
import androidx.lifecycle.SavedStateHandleController;
import java.util.Map;

/* renamed from: X.07H  reason: invalid class name */
public class AnonymousClass07H {
    public static void A00(C009704q r3, C003401n r4, AnonymousClass05X r5) {
        Object obj;
        Map map = r4.A00;
        synchronized (map) {
            obj = map.get("androidx.lifecycle.savedstate.vm.tag");
        }
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
        if (savedStateHandleController != null && !savedStateHandleController.A00) {
            savedStateHandleController.A00(r3, r5);
            A01(r3, r5);
        }
    }

    public static void A01(C009704q r2, AnonymousClass05X r3) {
        C011005f r1 = ((C009604p) r2).A02;
        if (r1 == C011005f.INITIALIZED || r1.A00(C011005f.STARTED)) {
            r3.A03();
        } else {
            r2.A00(new LegacySavedStateHandleController$1(r2, r3));
        }
    }
}
