package X;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.4ar  reason: invalid class name and case insensitive filesystem */
public final class C88644ar {
    public static final Pattern A02 = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int A00 = -1;
    public int A01 = -1;

    public void A00(C93724jf r7) {
        String str;
        int parseInt;
        int parseInt2;
        int i2 = 0;
        while (true) {
            C35731mP[] r1 = r7.A00;
            if (i2 < r1.length) {
                C35731mP r5 = r1[i2];
                if (r5 instanceof AnonymousClass3V9) {
                    AnonymousClass3V9 r52 = (AnonymousClass3V9) r5;
                    if ("iTunSMPB".equals(r52.A00)) {
                        str = r52.A02;
                    } else {
                        continue;
                        i2++;
                    }
                } else {
                    if (r5 instanceof AnonymousClass3VA) {
                        AnonymousClass3VA r53 = (AnonymousClass3VA) r5;
                        if ("com.apple.iTunes".equals(r53.A01) && "iTunSMPB".equals(r53.A00)) {
                            str = r53.A02;
                        }
                    } else {
                        continue;
                    }
                    i2++;
                }
                Matcher matcher = A02.matcher(str);
                if (matcher.find()) {
                    try {
                        parseInt = Integer.parseInt(matcher.group(1), 16);
                        parseInt2 = Integer.parseInt(matcher.group(2), 16);
                        if (parseInt > 0 || parseInt2 > 0) {
                            this.A00 = parseInt;
                            this.A01 = parseInt2;
                        }
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                } else {
                    continue;
                }
                i2++;
            } else {
                return;
            }
        }
        this.A00 = parseInt;
        this.A01 = parseInt2;
    }
}
