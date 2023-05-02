package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5vM  reason: invalid class name and case insensitive filesystem */
public class C118855vM {
    public volatile List A00 = Collections.unmodifiableList(AnonymousClass000.A0u());

    public synchronized void A00() {
        this.A00 = Collections.unmodifiableList(AnonymousClass000.A0u());
    }

    public synchronized boolean A01(Object obj) {
        if (this.A00.contains(obj)) {
            return false;
        }
        ArrayList A0i = C13690nt.A0i(this.A00.size() + 1);
        A0i.addAll(this.A00);
        A0i.add(obj);
        this.A00 = Collections.unmodifiableList(A0i);
        return true;
    }

    public synchronized boolean A02(Object obj) {
        boolean z2;
        z2 = false;
        if (this.A00.contains(obj)) {
            int size = this.A00.size();
            int i2 = size - 1;
            ArrayList A0i = C13690nt.A0i(i2);
            int indexOf = this.A00.indexOf(obj);
            if (indexOf > 0) {
                A0i.addAll(this.A00.subList(0, indexOf));
            }
            z2 = true;
            if (indexOf < i2) {
                A0i.addAll(this.A00.subList(indexOf + 1, size));
            }
            this.A00 = Collections.unmodifiableList(A0i);
        }
        return z2;
    }
}
