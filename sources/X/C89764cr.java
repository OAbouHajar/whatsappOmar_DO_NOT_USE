package X;

import android.util.Pair;
import java.util.Stack;

/* renamed from: X.4cr  reason: invalid class name and case insensitive filesystem */
public class C89764cr {
    public static final C88614ao A00;
    public static final C88614ao A01;
    public static final C88614ao A02;

    static {
        C88614ao r3 = new C88614ao("({[", ")}]");
        A02 = r3;
        C88614ao r2 = new C88614ao("*~_", "*~_");
        A00 = r2;
        C88614ao[] r1 = new C88614ao[2];
        AnonymousClass000.A1E(r3, r2, r1);
        A01 = new C88614ao(r1);
    }

    public static Pair A00(Pair pair, C88614ao r6, CharSequence charSequence) {
        Object valueOf;
        Object obj;
        int A0D = AnonymousClass000.A0D(pair.first);
        char c2 = 0;
        char charAt = A0D != 0 ? charSequence.charAt(A0D - 1) : 0;
        if (AnonymousClass000.A0D(pair.second) != charSequence.length()) {
            c2 = charSequence.charAt(AnonymousClass000.A0D(pair.second));
        }
        char charAt2 = charSequence.charAt(AnonymousClass000.A0D(pair.first));
        char charAt3 = charSequence.charAt(AnonymousClass000.A0D(pair.second) - 1);
        if (!r6.A00(charAt, c2)) {
            if (r6.A00(charAt, charAt3)) {
                valueOf = pair.first;
            } else if (r6.A00(charAt2, c2)) {
                valueOf = Integer.valueOf(AnonymousClass000.A0D(pair.first) + 1);
                obj = pair.second;
                return new Pair(valueOf, obj);
            } else if (r6.A00(charAt2, charAt3)) {
                valueOf = Integer.valueOf(AnonymousClass000.A0D(pair.first) + 1);
            }
            obj = Integer.valueOf(AnonymousClass000.A0D(pair.second) - 1);
            return new Pair(valueOf, obj);
        }
        return pair;
    }

    public static boolean A01(Pair pair, CharSequence charSequence) {
        C88614ao r5 = A02;
        Stack stack = new Stack();
        for (int A0D = AnonymousClass000.A0D(pair.first); A0D < AnonymousClass000.A0D(pair.second); A0D++) {
            char charAt = charSequence.charAt(A0D);
            String valueOf = String.valueOf(charAt);
            if ("({[".contains(valueOf)) {
                stack.push(Character.valueOf(charAt));
            } else if (!")}]".contains(valueOf)) {
                continue;
            } else if (stack.empty() || !r5.A00(((Character) stack.peek()).charValue(), charAt)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }
}
