package X;

import android.widget.ImageView;
import java.io.File;
import java.util.Set;

/* renamed from: X.2Ik  reason: invalid class name and case insensitive filesystem */
public class C47302Ik implements C47262Ig {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ C35361lo A03;
    public final /* synthetic */ C209712h A04;

    public C47302Ik(ImageView imageView, C35361lo r2, C209712h r3, int i2, int i3) {
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = imageView;
        this.A01 = i2;
        this.A00 = i3;
    }

    public void AMZ(C35361lo r1, File file) {
    }

    public void AQQ() {
    }

    public /* bridge */ /* synthetic */ void ATm(Object obj) {
        C35361lo r4 = this.A03;
        if (((Set) obj).contains(r4.A0F)) {
            this.A04.A08.A00(this.A02, r4, this.A01, this.A00);
        }
    }
}
