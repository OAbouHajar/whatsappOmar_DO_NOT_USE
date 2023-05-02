package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.io.IOUtils;

/* renamed from: X.0Uw  reason: invalid class name and case insensitive filesystem */
public class C06230Uw {
    public View A00;
    public final ArrayList A01 = AnonymousClass000.A0u();
    public final Map A02 = AnonymousClass000.A0x();

    @Deprecated
    public C06230Uw() {
    }

    public C06230Uw(View view) {
        this.A00 = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C06230Uw) {
            C06230Uw r3 = (C06230Uw) obj;
            return this.A00 == r3.A00 && this.A02.equals(r3.A02);
        }
    }

    public int hashCode() {
        return (this.A00.hashCode() * 31) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("TransitionValues@");
        AnonymousClass000.A1J(A0r, hashCode());
        StringBuilder A0q = AnonymousClass000.A0q(AnonymousClass000.A0h(":\n", A0r));
        A0q.append("    view = ");
        A0q.append(this.A00);
        String A0h = AnonymousClass000.A0h("    values:", AnonymousClass000.A0q(AnonymousClass000.A0h(IOUtils.LINE_SEPARATOR_UNIX, A0q)));
        Map map = this.A02;
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            StringBuilder A0q2 = AnonymousClass000.A0q(A0h);
            A0q2.append("    ");
            A0q2.append(A0m);
            A0q2.append(": ");
            A0q2.append(map.get(A0m));
            A0h = AnonymousClass000.A0h(IOUtils.LINE_SEPARATOR_UNIX, A0q2);
        }
        return A0h;
    }
}
