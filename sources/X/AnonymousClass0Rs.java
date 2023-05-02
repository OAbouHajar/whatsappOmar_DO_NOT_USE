package X;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.0Rs  reason: invalid class name */
public class AnonymousClass0Rs {
    public float A00;
    public float A01;
    public float A02;
    public int A03 = 0;
    public Rect A04;
    public AnonymousClass03G A05;
    public AnonymousClass07U A06;
    public List A07;
    public List A08;
    public Map A09;
    public Map A0A;
    public Map A0B;
    public boolean A0C;
    public final AnonymousClass0Oh A0D = new AnonymousClass0Oh();
    public final HashSet A0E = new HashSet();

    public static float A00(AnonymousClass0Rs r2) {
        return (float) ((long) (((r2.A00 - r2.A02) / r2.A01) * 1000.0f));
    }

    public static void A01(AnonymousClass0Rs r0, String str) {
        C05770Sy.A00(str);
        r0.A0E.add(str);
    }

    public AnonymousClass0OS A02(String str) {
        int size = this.A08.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnonymousClass0OS r4 = (AnonymousClass0OS) this.A08.get(i2);
            String str2 = r4.A02;
            if (str2.equalsIgnoreCase(str) || (str2.endsWith("\r") && str2.substring(0, str2.length() - 1).equalsIgnoreCase(str))) {
                return r4;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LottieComposition:\n");
        for (C05320Qf A002 : this.A07) {
            A0r.append(A002.A00("\t"));
        }
        return A0r.toString();
    }
}
