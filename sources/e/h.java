package e;

import com.squareup.picasso.Transformation;

/* compiled from: XFMFile */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1640a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Transformation f1641b;

    public /* synthetic */ h(Transformation transformation, int i2) {
        this.f1640a = i2;
        this.f1641b = transformation;
    }

    public final void run() {
        int i2 = this.f1640a;
        Transformation transformation = this.f1641b;
        switch (i2) {
            case 0:
                throw new IllegalStateException("Transformation " + transformation.key() + " returned input Bitmap but recycled it.");
            default:
                throw new IllegalStateException("Transformation " + transformation.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }
}
