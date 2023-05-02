package X;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0db  reason: invalid class name and case insensitive filesystem */
public class C08410db implements C13230lg {
    public final List A00;

    public C08410db() {
        this.A00 = Collections.singletonList(new C06520Wl(new PointF(0.0f, 0.0f)));
    }

    public C08410db(List list) {
        this.A00 = list;
    }

    public AnonymousClass0SI A7E() {
        List list = this.A00;
        return AnonymousClass000.A0R(list, 0).A03() ? new AnonymousClass0HN(list) : new AnonymousClass0HJ(list);
    }

    public List AD1() {
        return this.A00;
    }

    public boolean AJi() {
        List list = this.A00;
        return list.size() == 1 && AnonymousClass000.A0R(list, 0).A03();
    }
}
