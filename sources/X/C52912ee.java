package X;

import android.content.Context;
import java.util.Map;

/* renamed from: X.2ee  reason: invalid class name and case insensitive filesystem */
public class C52912ee {
    public final Map A00;

    public C52912ee(Map map) {
        this.A00 = map;
    }

    public void A00(Context context, C16740tZ r5) {
        C16880tn AAt;
        C35191lW r0;
        if (!(r5 instanceof C16840tj) || (AAt = ((C16840tj) r5).AAt()) == null || (r0 = AAt.A03) == null || r0.A00.size() <= 0 || !((C35181lV) AAt.A03.A00.get(0)).A00) {
            A01(context, r5, 0);
        }
    }

    public void A01(Context context, C16740tZ r5, int i2) {
        C16880tn AAt;
        int i3;
        Map map;
        int i4;
        if ((r5 instanceof C16840tj) && (AAt = ((C16840tj) r5).AAt()) != null && (i3 = AAt.A00) != 0) {
            switch (i3) {
                case 1:
                    map = this.A00;
                    i4 = 2;
                    break;
                case 2:
                case 6:
                    map = this.A00;
                    i4 = 1;
                    break;
                case 3:
                    map = this.A00;
                    i4 = 3;
                    break;
                case 4:
                    map = this.A00;
                    i4 = 4;
                    break;
                case 5:
                    map = this.A00;
                    i4 = 5;
                    break;
                default:
                    return;
            }
            ((C52852eY) map.get(Integer.valueOf(i4))).AaR(context, r5, AAt, i2);
        }
    }
}
