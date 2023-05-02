package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.obwhatsapp.QrImageView;
import java.util.ArrayList;

/* renamed from: X.3NH  reason: invalid class name */
public class AnonymousClass3NH extends Animation {
    public final /* synthetic */ QrImageView A00;

    public AnonymousClass3NH(QrImageView qrImageView) {
        this.A00 = qrImageView;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        QrImageView qrImageView = this.A00;
        C51252bG r3 = qrImageView.A04;
        if (r3 != null) {
            if (f2 != 1.0f) {
                float f3 = f2 > 0.25f ? (f2 - 0.25f) / 0.75f : 0.0f;
                AnonymousClass4R5 r0 = r3.A04;
                int i2 = (int) (((float) (r0.A01 * r0.A00)) * (1.0f - f3));
                while (true) {
                    ArrayList arrayList = qrImageView.A06;
                    if (arrayList.size() <= i2) {
                        break;
                    }
                    arrayList.remove(QrImageView.A09.nextInt(arrayList.size()));
                }
            } else {
                qrImageView.A06.clear();
            }
            qrImageView.invalidate();
        }
    }
}
