package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;

/* renamed from: X.38z  reason: invalid class name and case insensitive filesystem */
public class C614538z {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Rect A08;
    public Uri A09;
    public Uri A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E = true;
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H = true;
    public final Context A0I;

    public C614538z(Context context) {
        this.A0I = context;
    }

    public Intent A00() {
        Context context = this.A0I;
        Uri uri = this.A09;
        Uri uri2 = this.A0A;
        String str = this.A0C;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A06;
        int i5 = this.A07;
        int i6 = this.A04;
        int i7 = this.A03;
        Rect rect = this.A08;
        boolean z2 = this.A0E;
        boolean z3 = this.A0H;
        boolean z4 = this.A0F;
        int i8 = this.A05;
        boolean z5 = this.A0G;
        String str2 = this.A0D;
        String str3 = this.A0B;
        int i9 = this.A02;
        Intent A092 = C13680ns.A09();
        A092.setClassName(context.getPackageName(), "com.obwhatsapp.crop.CropImage");
        A092.setData(uri);
        A092.putExtra("output", uri2);
        A092.putExtra("outputFormat", str);
        A092.putExtra("circleCrop", (String) null);
        A092.putExtra("aspectX", i2);
        A092.putExtra("aspectY", i3);
        A092.putExtra("outputX", i4);
        A092.putExtra("outputY", i5);
        A092.putExtra("minCrop", i6);
        A092.putExtra("maxCrop", i7);
        A092.putExtra("initialRect", rect);
        A092.putExtra("cropByOutputSize", z2);
        A092.putExtra("scale", true);
        A092.putExtra("scaleUpIfNeeded", z3);
        A092.putExtra("maxFileSize", 0);
        A092.putExtra("flattenRotation", z4);
        A092.putExtra("rotation", i8);
        A092.putExtra("flipH", z5);
        A092.putExtra("flipV", false);
        A092.putExtra("webImageSource", str2);
        A092.putExtra("doodle", str3);
        A092.putExtra("filter", i9);
        A092.putExtra("rotateAspect", false);
        return A092;
    }
}
