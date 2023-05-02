package X;

import android.graphics.Bitmap;
import android.view.ViewTreeObserver;

/* renamed from: X.4kz  reason: invalid class name and case insensitive filesystem */
public class C94484kz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass4E5 A01;
    public final /* synthetic */ C42821yj A02;
    public final /* synthetic */ C16740tZ A03;
    public final /* synthetic */ C28381Vw A04;
    public final /* synthetic */ C86094Re A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ Bitmap[] A08;

    public C94484kz(AnonymousClass4E5 r1, C42821yj r2, C16740tZ r3, C28381Vw r4, C86094Re r5, String str, String str2, Bitmap[] bitmapArr, int i2) {
        this.A02 = r2;
        this.A01 = r1;
        this.A07 = str;
        this.A06 = str2;
        this.A04 = r4;
        this.A05 = r5;
        this.A00 = i2;
        this.A08 = bitmapArr;
        this.A03 = r3;
    }

    public void onGlobalLayout() {
        C42821yj r3 = this.A02;
        if (r3.A4A != null) {
            AnonymousClass3K2.A0z(r3.A49, this);
            r3.A49.setVisibility(0);
            r3.A4A.AgE(this.A01, r3.A49);
            AnonymousClass1ZQ r2 = r3.A4A;
            String str = this.A07;
            String str2 = this.A06;
            C28381Vw r5 = this.A04;
            C86094Re r6 = this.A05;
            int i2 = this.A00;
            Bitmap[] bitmapArr = this.A08;
            r2.A8w(new AnonymousClass1ZR(r3.A16, str), this.A03, r5, r6, str, str2, bitmapArr, i2);
        }
    }
}
