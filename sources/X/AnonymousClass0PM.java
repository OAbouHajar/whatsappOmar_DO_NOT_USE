package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0PM  reason: invalid class name */
public class AnonymousClass0PM {
    public List A00 = AnonymousClass000.A0u();

    public void A00(Path path) {
        List list = this.A00;
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                C08240dJ r1 = (C08240dJ) list.get(size);
                if (r1 != null && !r1.A06) {
                    AnonymousClass0XD.A04(path, ((AnonymousClass0HM) r1.A02).A0E() / 100.0f, ((AnonymousClass0HM) r1.A00).A0E() / 100.0f, ((AnonymousClass0HM) r1.A01).A0E() / 360.0f);
                }
            } else {
                return;
            }
        }
    }
}
