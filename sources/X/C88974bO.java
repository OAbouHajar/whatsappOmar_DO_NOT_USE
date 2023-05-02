package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.4bO  reason: invalid class name and case insensitive filesystem */
public class C88974bO {
    public boolean A00 = true;
    public final C85024Mu A01;
    public final Map A02 = AnonymousClass000.A0x();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();

    public C88974bO(C85024Mu r2) {
        this.A01 = r2;
        r2.A01 = this;
    }

    public static C88974bO A00() {
        return new C88974bO(new C85024Mu(Choreographer.getInstance()));
    }

    public AnonymousClass4X6 A01() {
        AnonymousClass4X6 r3 = new AnonymousClass4X6(this);
        Map map = this.A02;
        String str = r3.A0B;
        if (!map.containsKey(str)) {
            map.put(str, r3);
            return r3;
        }
        throw AnonymousClass000.A0T("spring is already registered");
    }

    public void A02(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                C85024Mu r2 = this.A01;
                if (!r2.A02) {
                    r2.A02 = true;
                    r2.A00 = SystemClock.uptimeMillis();
                    Choreographer choreographer = r2.A04;
                    Choreographer.FrameCallback frameCallback = r2.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("springId ");
        A0r.append(str);
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(" does not reference a registered spring", A0r));
    }
}
