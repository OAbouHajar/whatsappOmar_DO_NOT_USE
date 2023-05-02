package X;

import android.graphics.Path;
import android.util.Log;

/* renamed from: X.0IP  reason: invalid class name */
public class AnonymousClass0IP extends AnonymousClass0QD {
    public float A00;
    public float A01;
    public Path A02;
    public final /* synthetic */ AnonymousClass0XJ A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0IP(Path path, AnonymousClass0XJ r2, float f2, float f3) {
        super(r2);
        this.A03 = r2;
        this.A00 = f2;
        this.A01 = f3;
        this.A02 = path;
    }

    public void A00(String str) {
        AnonymousClass0XJ r2 = this.A03;
        String str2 = str;
        if (r2.A0w()) {
            Path A0I = AnonymousClass000.A0I();
            r2.A02.A00.getTextPath(str2, 0, str.length(), this.A00, this.A01, A0I);
            this.A02.addPath(A0I);
        }
        this.A00 += r2.A02.A00.measureText(str);
    }

    public boolean A01(C03250Hu r4) {
        if (!(r4 instanceof AnonymousClass0II)) {
            return true;
        }
        Log.w("SVGAndroidRenderer", String.format("Using <textPath> elements in a clip path is not supported.", new Object[0]));
        return false;
    }
}
