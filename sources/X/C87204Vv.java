package X;

import android.graphics.Bitmap;

/* renamed from: X.4Vv  reason: invalid class name and case insensitive filesystem */
public class C87204Vv {
    public final int A00;
    public final Bitmap.Config A01;
    public final boolean A02;

    public C87204Vv(AnonymousClass4JN r2) {
        this.A00 = r2.A00;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C87204Vv r5 = (C87204Vv) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((3100 + this.A00) * 31 * 31 * 31 * 31) + (this.A02 ? 1 : 0)) * 31) + this.A01.ordinal()) * 31 * 31 * 31;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ImageDecodeOptions{");
        AnonymousClass0QP r3 = new AnonymousClass0QP(AnonymousClass000.A0c(this));
        r3.A00("100", "minDecodeIntervalMs");
        r3.A00(String.valueOf(this.A00), "maxDimensionPx");
        r3.A00("false", "decodePreviewFrame");
        r3.A00("false", "useLastFrameForPreview");
        r3.A00("false", "decodeAllFrames");
        r3.A00(String.valueOf(this.A02), "forceStaticImage");
        r3.A00(this.A01.name(), "bitmapConfigName");
        r3.A00((Object) null, "customImageDecoder");
        r3.A00((Object) null, "bitmapTransformation");
        r3.A00((Object) null, "colorSpace");
        AnonymousClass000.A1I(r3, A0r);
        return AnonymousClass000.A0h("}", A0r);
    }
}
