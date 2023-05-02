package X;

import android.content.res.Resources;
import com.AssemMods.translator.Language;
import com.obwhatsapp.R;

/* renamed from: X.1Lh  reason: invalid class name and case insensitive filesystem */
public class C25831Lh {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public int A02 = 0;
    public final AnonymousClass013 A03;

    public C25831Lh(AnonymousClass013 r2) {
        this.A03 = r2;
    }

    public float A00(Resources resources) {
        float f2 = this.A00;
        if (f2 == 0.0f) {
            f2 = resources.getDimension(R.dimen.dimen023d) / resources.getDisplayMetrics().scaledDensity;
            this.A00 = f2;
        }
        int i2 = 0;
        int i3 = this.A02;
        if (i3 == -1) {
            i2 = -2;
        } else if (i3 == 1) {
            i2 = 4;
        }
        return f2 + ((float) i2);
    }

    public float A01(Resources resources) {
        return (A02(resources, this.A02) * 24.0f) / 27.0f;
    }

    public float A02(Resources resources, int i2) {
        if (this.A01 == 0.0f) {
            this.A01 = resources.getDimension(R.dimen.dimen0299) / resources.getDisplayMetrics().scaledDensity;
        }
        int i3 = 0;
        if (i2 == -1) {
            i3 = -2;
        } else if (i2 == 1) {
            i3 = 4;
        }
        AnonymousClass013 r2 = this.A03;
        if (r2.A06().equals(Language.ARABIC) || r2.A06().equals("fa")) {
            i3++;
        }
        return this.A01 + ((float) i3);
    }
}
