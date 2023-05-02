package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.0ZY  reason: invalid class name */
public class AnonymousClass0ZY implements C12970lG {
    public final /* synthetic */ C02570Cy A00;

    public AnonymousClass0ZY(C02570Cy r1) {
        this.A00 = r1;
    }

    public void ASS(MenuItem menuItem, C016607w r9) {
        C02570Cy r1 = this.A00;
        Handler handler = r1.A0J;
        AnonymousClass0OK r0 = null;
        handler.removeCallbacksAndMessages((Object) null);
        List list = r1.A0O;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            if (r9 != ((AnonymousClass0OK) list.get(i2)).A01) {
                i2++;
            } else if (i2 != -1) {
                int i3 = i2 + 1;
                if (i3 < list.size()) {
                    r0 = (AnonymousClass0OK) list.get(i3);
                }
                handler.postAtTime(new C10380h2(menuItem, this, r0, r9), r9, SystemClock.uptimeMillis() + 200);
                return;
            } else {
                return;
            }
        }
    }

    public void AST(MenuItem menuItem, C016607w r3) {
        this.A00.A0J.removeCallbacksAndMessages(r3);
    }
}
