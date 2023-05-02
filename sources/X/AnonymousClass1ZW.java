package X;

import android.content.Context;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.AssemMods.translator.Language;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1ZW  reason: invalid class name */
public class AnonymousClass1ZW {
    public static Spanned A00(Context context, Object[] objArr, int i2) {
        return Html.fromHtml(objArr.length == 0 ? context.getString(i2) : context.getString(i2, A0H(objArr)));
    }

    public static Spanned A01(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, A0H(objArr));
        }
        return Html.fromHtml(str);
    }

    public static CharSequence A02(CharSequence charSequence) {
        int i2;
        if (!TextUtils.isEmpty(charSequence) && (i2 = Build.VERSION.SDK_INT) >= 26 && i2 <= 29) {
            Pattern pattern = AnonymousClass2NF.A01;
            if (pattern == null) {
                pattern = Pattern.compile("[\\u1680\\u2000-\\u200a\\u205f\\u3000]+\\u0020");
                AnonymousClass2NF.A01 = pattern;
            }
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.find()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                int i3 = 0;
                int i4 = 0;
                while (matcher.find(i3)) {
                    i3 = matcher.end();
                    int start = matcher.start();
                    spannableStringBuilder.replace(start - i4, i3 - i4, " ");
                    i4 += (i3 - start) - 1;
                }
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r2.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(int r1, java.lang.String r2) {
        /*
            r0 = 1
            X.AnonymousClass00B.A0F(r0)
            if (r2 == 0) goto L_0x0011
            int r0 = r2.length()
            if (r0 <= r1) goto L_0x0011
            int r0 = r0 - r1
            java.lang.String r2 = r2.substring(r0)
        L_0x0011:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZW.A03(int, java.lang.String):java.lang.String");
    }

    public static String A04(int i2, String str) {
        return (str == null || str.codePointCount(0, str.length()) <= i2) ? str : str.substring(0, str.offsetByCodePoints(0, i2));
    }

    public static String A05(int i2, String str) {
        if (str == null) {
            return "";
        }
        String A04 = A04(i2, str);
        if (str == A04) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A04);
        sb.append("…");
        return sb.toString();
    }

    public static String A06(Context context, int i2) {
        return String.format(Locale.US, "%06X", new Object[]{Integer.valueOf(AnonymousClass00T.A00(context, i2) & ViewCompat.MEASURED_SIZE_MASK)});
    }

    public static String A07(AnonymousClass013 r3, String str, String str2) {
        String A06 = r3.A06();
        String str3 = (Language.ARABIC.equals(A06) || "fa".equals(A06) || Language.URDU.equals(A06)) ? " — " : " • ";
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A0G(str));
        sb.append(str3);
        sb.append(r3.A0G(str2));
        return sb.toString();
    }

    public static String A08(CharSequence charSequence) {
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFKD);
        Pattern pattern = AnonymousClass2NF.A00;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            AnonymousClass2NF.A00 = pattern;
        }
        return pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US).replace(305, 'i');
    }

    public static String A09(CharSequence charSequence) {
        AnonymousClass2NH r2 = AnonymousClass2NG.A00;
        if (r2 == null) {
            r2 = new AnonymousClass2NH(new String[]{"ı", "i", "ة", "ه", "ـ", "", "ى", "ي", "ٱ", "ا", "ڤ", "ف", "ک", "ك", "ں", "ن", "ھ", "ه", "ۃ", "ۂ", "ی", "ي", "ے", "ي", "ە", "ه", "۰", "٠", "۱", "١", "۲", "٢", "۳", "٣", "۴", "٤", "۵", "٥", "۶", "٦", "۷", "٧", "۸", "٨", "۹", "٩", "ࢻ", "ف", "ࢼ", "ق", "ࢽ", "ن", "‌", ""});
            AnonymousClass2NG.A00 = r2;
        }
        AnonymousClass2NH r0 = AnonymousClass2NG.A01;
        if (r0 == null) {
            r0 = new AnonymousClass2NH(new String[]{"ٵ", "ٴا", "ٶ", "ٴو", "ٷ", "ٴۇ", "ٸ", "ٴى", "अॆ", "ऄ", "अा", "आ", "र्इ", "ई", "उु", "ऊ", "एॅ", "ऍ", "एॆ", "ऎ", "एे", "ऐ", "अॉ", "ऑ", "आॅ", "ऑ", "अॊ", "ऒ", "आॆ", "ऒ", "अो", "ओ", "आे", "ओ", "अौ", "औ", "आै", "औ", "अॅ", "ॲ", "अऺ", "ॳ", "अऻ", "ॴ", "आऺ", "ॴ", "अॏ", "ॵ", "अॖ", "ॶ", "अॗ", "ॷ", "অা", "আ", "ঋৃ", "ৠ", "ঌৢ", "ৡ", "ਅਾ", "ਆ", "ੲਿ", "ਇ", "ੲੀ", "ਈ", "ੳੁ", "ਉ", "ੳੂ", "ਊ", "ੲੇ", "ਏ", "ਅੈ", "ਐ", "ੳੋ", "ਓ", "ਅੌ", "ਔ", "અા", "આ", "અૅ", "ઍ", "અે", "એ", "અૈ", "ઐ", "અૉ", "ઑ", "અો", "ઓ", "અાૅ", "ઓ", "અૌ", "ઔ", "અાૈ", "ઔ", "ૅા", "ૉ", "ଅା", "ଆ", "ଏୗ", "ଐ", "ଓୗ", "ଔ", "ஸ்ரீ", "ஶ்ரீ", "ఒౕ", "ఓ", "ఒౌ", "ఔ", "ిౕ", "ీ", "ెౕ", "ే", "ొౕ", "ో", "ಉಾ", "ಊ", "ಒೌ", "ಔ", "ಋಾ", "ೠ", "ഇൗ", "ഈ", "ഉൗ", "ഊ", "എെ", "ഐ", "ഒാ", "ഓ", "ഒൗ", "ഔ", "ണ്‍", "ൺ", "ന്‍", "ൻ", "ര്‍", "ർ", "ല്‍", "ൽ", "ള്‍", "ൾ", "අා", "ආ", "අැ", "ඇ", "අෑ", "ඈ", "උෟ", "ඌ", "ඍෘ", "ඎ", "ඏෟ", "ඐ", "එ්", "ඒ", "එෙ", "ඓ", "ඔෟ", "ඖ"});
            AnonymousClass2NG.A01 = r0;
        }
        String normalize = Normalizer.normalize(r0.A00(charSequence), Normalizer.Form.NFKD);
        Pattern pattern = AnonymousClass2NF.A00;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            AnonymousClass2NF.A00 = pattern;
        }
        return r2.A00(pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US)).toString();
    }

    public static String A0A(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
            sb.append(charSequence);
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - charSequence.length()) : "";
    }

    public static String A0B(CharSequence charSequence, CharSequence... charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int length = charSequenceArr.length;
            if (i2 >= length) {
                return sb.toString();
            }
            sb.append(charSequenceArr[i2]);
            if (i2 < length - 1) {
                sb.append(charSequence);
            }
            i2++;
        }
    }

    public static String A0C(String str) {
        return str.replace('+', '-').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    public static String A0D(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 << 1);
        for (byte b2 : bArr) {
            sb.append(Character.forDigit((b2 >> 4) & 15, 16));
            sb.append(Character.forDigit(b2 & 15, 16));
        }
        return sb.toString();
    }

    public static boolean A0E(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = charSequence.charAt(i2);
                if (charAt != 8203 && !Character.isWhitespace(charAt)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A0F(CharSequence charSequence, CharSequence charSequence2) {
        return (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) || TextUtils.equals(charSequence, charSequence2);
    }

    public static byte[] A0G(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length >> 1)];
            int i2 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                int digit = Character.digit(charAt, 16);
                if (digit != -1) {
                    int i3 = i2 >> 1;
                    byte b2 = bArr[i3];
                    int i4 = 0;
                    if (i2 % 2 == 0) {
                        i4 = 4;
                    }
                    bArr[i3] = (byte) ((digit << i4) | b2);
                    i2++;
                } else {
                    StringBuilder sb = new StringBuilder("invalid character; char=");
                    sb.append(charAt);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return bArr;
        }
        StringBuilder sb2 = new StringBuilder("even length input string required; length=");
        sb2.append(length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static Object[] A0H(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        for (int i2 = 0; i2 < copyOf.length; i2++) {
            if (copyOf[i2] instanceof CharSequence) {
                copyOf[i2] = Html.escapeHtml((CharSequence) copyOf[i2]);
            }
        }
        return copyOf;
    }
}
