package X;

import com.AssemMods.translator.Language;
import java.util.regex.Pattern;

/* renamed from: X.4a0  reason: invalid class name and case insensitive filesystem */
public final class C88134a0 {
    public static final C17380uz A03 = C17380uz.of("filled", "open");
    public static final C17380uz A04 = C17380uz.of("dot", "sesame", "circle");
    public static final C17380uz A05 = C17380uz.of("after", "before", "outside");
    public static final C17380uz A06 = C17380uz.of(Language.AUTO_DETECT, "none");
    public static final Pattern A07 = Pattern.compile("\\s+");
    public final int A00;
    public final int A01;
    public final int A02;

    public C88134a0(int i2, int i3, int i4) {
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = i4;
    }
}
