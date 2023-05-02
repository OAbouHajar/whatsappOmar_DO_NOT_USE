package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.4W2  reason: invalid class name */
public final class AnonymousClass4W2 {
    public final Map A00 = new LinkedHashMap();
    public final Stack A01 = new Stack();
    public final Stack A02 = new Stack();

    public final Map A00(String str) {
        C18450wi.A0H(str, 0);
        C87144Vo r0 = (C87144Vo) this.A00.remove(str);
        if (r0 == null) {
            return null;
        }
        return r0.A01;
    }

    public final void A01() {
        Stack stack = this.A01;
        if (stack.size() >= 1) {
            stack.pop();
        }
    }

    public final void A02() {
        Stack stack = this.A02;
        if (stack.size() >= 1) {
            stack.pop();
        }
    }
}
