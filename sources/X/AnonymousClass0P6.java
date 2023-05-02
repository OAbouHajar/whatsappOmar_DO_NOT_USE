package X;

import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;

/* renamed from: X.0P6  reason: invalid class name */
public class AnonymousClass0P6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Rect[] A04;
    public final String[] A05;
    public final C05150Pm[][] A06;

    public AnonymousClass0P6(String str, String str2, Rect[] rectArr, String[] strArr, C05150Pm[][] r7, int i2) {
        this.A01 = str;
        String queryParameter = Uri.parse(str).getQueryParameter("v");
        this.A02 = TextUtils.isEmpty(queryParameter) ? "unknown" : queryParameter;
        this.A03 = str2;
        this.A04 = rectArr;
        this.A00 = i2;
        this.A05 = strArr;
        this.A06 = r7;
    }
}
