package X;

import android.content.Context;
import android.content.pm.FeatureInfo;
import com.whatsapp.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1vI  reason: invalid class name and case insensitive filesystem */
public final class C41141vI extends C41091vD {
    public static Pattern A01;
    public float A00 = -1.0f;

    public final float A03(Context context) {
        float f2 = this.A00;
        if (f2 >= 0.0f) {
            return f2;
        }
        this.A00 = 0.0f;
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        int length = systemAvailableFeatures.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            try {
                String str = systemAvailableFeatures[i2].name;
                if (str != null && str.startsWith("com.htc.software.Sense")) {
                    Pattern pattern = A01;
                    if (pattern == null) {
                        pattern = Pattern.compile("com\\.htc\\.software\\.Sense(\\d+(?:\\.\\d+)?).*");
                        A01 = pattern;
                    }
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches()) {
                        float parseFloat = Float.parseFloat(matcher.group(1));
                        if (Float.valueOf(parseFloat) != null) {
                            this.A00 = parseFloat;
                            break;
                        }
                    } else {
                        throw new NumberFormatException("could not find version");
                    }
                }
            } catch (NumberFormatException unused) {
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder("badger/htc/sense ");
        sb.append(this.A00);
        Log.i(sb.toString());
        return this.A00;
    }
}
