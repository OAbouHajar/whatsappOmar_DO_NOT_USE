package X;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.3VX  reason: invalid class name */
public final class AnonymousClass3VX extends C65323Ui {
    public static final Pattern A02 = Pattern.compile("\\{\\\\.*?\\}");
    public static final Pattern A03 = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public final StringBuilder A00 = AnonymousClass000.A0o();
    public final ArrayList A01 = AnonymousClass000.A0u();

    public AnonymousClass3VX() {
        super("SubripDecoder");
    }

    public static long A01(Matcher matcher, int i2) {
        String group = matcher.group(i2 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (C65323Ui.A00(matcher, i2 + 2) * 60 * 1000) + (C65323Ui.A00(matcher, i2 + 3) * 1000);
        String group2 = matcher.group(i2 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }
}
