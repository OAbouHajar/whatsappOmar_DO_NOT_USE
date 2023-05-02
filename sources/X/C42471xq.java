package X;

import android.os.Build;
import java.util.regex.Pattern;

/* renamed from: X.1xq  reason: invalid class name and case insensitive filesystem */
public class C42471xq {
    public static final Pattern A00;

    static {
        String str = "[\\p{InTHAI}\\p{InLAO}\\p{InMYANMAR}\\p{InKHMER}\\p{InKHMER_SYMBOLS}\\p{InHIRAGANA}\\p{InKATAKANA}\\p{InKANA_SUPPLEMENT}\\p{InKATAKANA_PHONETIC_EXTENSIONS}\\p{InHANGUL_JAMO}\\p{InHANGUL_COMPATIBILITY_JAMO}\\p{InHANGUL_SYLLABLES}\\p{InCJK_COMPATIBILITY}\\p{InCJK_COMPATIBILITY_IDEOGRAPHS}\\p{InCJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT}\\p{InCJK_UNIFIED_IDEOGRAPHS}\\p{InCJK_UNIFIED_IDEOGRAPHS_EXTENSION_A}\\p{InCJK_UNIFIED_IDEOGRAPHS_EXTENSION_B}";
        if (Build.VERSION.SDK_INT >= 19) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("\\p{InCJK_UNIFIED_IDEOGRAPHS_EXTENSION_C}\\p{InCJK_UNIFIED_IDEOGRAPHS_EXTENSION_D}\\p{InMYANMAR_EXTENDED_A}\\p{InMYANMAR_EXTENDED_A}\\p{InHANGUL_JAMO_EXTENDED_A}\\p{InHANGUL_JAMO_EXTENDED_B}");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("]");
        A00 = Pattern.compile(sb2.toString());
    }
}
