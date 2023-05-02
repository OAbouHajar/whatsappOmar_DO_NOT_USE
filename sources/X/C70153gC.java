package X;

import java.util.regex.Pattern;

/* renamed from: X.3gC  reason: invalid class name and case insensitive filesystem */
public class C70153gC extends C89494cI {
    public final String A00;
    public final String A01;
    public final Pattern A02;

    public C70153gC(CharSequence charSequence) {
        int i2;
        String charSequence2 = charSequence.toString();
        int indexOf = charSequence2.indexOf(47);
        int lastIndexOf = charSequence2.lastIndexOf(47);
        String substring = charSequence2.substring(indexOf + 1, lastIndexOf);
        this.A01 = substring;
        int i3 = lastIndexOf + 1;
        String substring2 = charSequence2.length() > i3 ? charSequence2.substring(i3) : "";
        this.A00 = substring2;
        int i4 = 0;
        for (char c2 : substring2.toCharArray()) {
            C800842m[] values = C800842m.values();
            int length = values.length;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    i2 = 0;
                    break;
                }
                C800842m r1 = values[i5];
                if (r1.flag == c2) {
                    i2 = r1.code;
                    break;
                }
                i5++;
            }
            i4 |= i2;
        }
        this.A02 = Pattern.compile(substring, i4);
    }

    public C70153gC(Pattern pattern) {
        this.A01 = pattern.pattern();
        this.A02 = pattern;
        int flags = pattern.flags();
        StringBuilder A0o = AnonymousClass000.A0o();
        for (C800842m r2 : C800842m.values()) {
            int i2 = r2.code;
            if ((i2 & flags) == i2) {
                A0o.append(r2.flag);
            }
        }
        this.A00 = A0o.toString();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C70153gC)) {
                return false;
            }
            Pattern pattern = this.A02;
            Pattern pattern2 = ((C70153gC) obj).A02;
            if (pattern == null) {
                return pattern2 == null;
            }
            if (!pattern.equals(pattern2)) {
                return false;
            }
        }
    }

    public String toString() {
        String str = this.A01;
        if (str.startsWith("/")) {
            return str;
        }
        StringBuilder A0q = AnonymousClass000.A0q("/");
        A0q.append(str);
        A0q.append("/");
        return AnonymousClass000.A0h(this.A00, A0q);
    }
}
