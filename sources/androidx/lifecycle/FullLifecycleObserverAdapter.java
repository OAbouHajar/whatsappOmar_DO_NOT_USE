package androidx.lifecycle;

import X.AnonymousClass000;
import X.AnonymousClass05T;
import X.C001300o;
import X.C011405n;
import X.C012205z;

public class FullLifecycleObserverAdapter implements AnonymousClass05T {
    public final C012205z A00;
    public final AnonymousClass05T A01;

    public FullLifecycleObserverAdapter(C012205z r1, AnonymousClass05T r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void AXa(C011405n r2, C001300o r3) {
        String str;
        switch (r2.ordinal()) {
            case 0:
                str = "onCreate";
                break;
            case 1:
                str = "onStart";
                break;
            case 2:
                str = "onResume";
                break;
            case 3:
                str = "onPause";
                break;
            case 4:
                str = "onStop";
                break;
            case 5:
                str = "onDestroy";
                break;
            case 6:
                throw AnonymousClass000.A0T("ON_ANY must not been send by anybody");
            default:
                AnonymousClass05T r0 = this.A01;
                if (r0 != null) {
                    r0.AXa(r2, r3);
                    return;
                }
                return;
        }
        throw AnonymousClass000.A0W(str);
    }
}
