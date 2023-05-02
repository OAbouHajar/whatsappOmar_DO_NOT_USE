package X;

import android.widget.ImageView;

/* renamed from: X.3Tt  reason: invalid class name */
public class AnonymousClass3Tt extends C95784nH {
    public int A00;
    public final /* synthetic */ AnonymousClass1ZK A01;

    public AnonymousClass3Tt(AnonymousClass1ZK r1, int i2) {
        this.A01 = r1;
        this.A00 = i2;
    }

    public void AXO(AnonymousClass4X6 r12) {
        C83264Fz r10 = r12.A07;
        double d2 = 1.0d - 0.0d;
        float f2 = (float) (0.5d + (((r10.A00 - 0.0d) / d2) * (1.0d - 0.5d)));
        AnonymousClass1ZK r7 = this.A01;
        ImageView imageView = r7.A0g;
        imageView.setScaleX(f2);
        imageView.setScaleY(f2);
        int i2 = this.A00;
        if (i2 != 0) {
            float f3 = (float) (0.0d + (((r10.A00 - 0.0d) / d2) * (((double) i2) - 0.0d)));
            int width = imageView.getWidth() >> 2;
            if (r7.A11.A0T()) {
                width = -width;
            }
            imageView.setTranslationX(f3 + ((float) width));
        }
    }
}
