package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.3G9  reason: invalid class name */
public class AnonymousClass3G9 implements AnonymousClass2V1 {
    public final int A00;

    public AnonymousClass3G9(int i2) {
        this.A00 = i2;
    }

    public boolean A5u() {
        return false;
    }

    public C455829l A7b(Context context, AnonymousClass013 r4, boolean z2) {
        switch (this.A00) {
            case 0:
                return new C605332s();
            case 1:
                return new AnonymousClass32t();
            case 2:
                return new AnonymousClass32u();
            case 3:
                return new C605432y();
            case 4:
                return new AnonymousClass32v();
            case 5:
                return new AnonymousClass32w();
            case 6:
                return new C605132q(context, r4, z2);
            case 7:
                return new AnonymousClass330(context, r4, z2);
            default:
                return new AnonymousClass331(context, r4, context.getString(R.string.str0118), z2);
        }
    }

    public C37781pj[] ABx() {
        int i2;
        C37781pj[] r2 = new C37781pj[1];
        int[] iArr = new int[1];
        switch (this.A00) {
            case 0:
                i2 = 8599;
                break;
            case 1:
                i2 = 11093;
                break;
            case 2:
                i2 = 128306;
                break;
            case 3:
                i2 = 128173;
                break;
            case 4:
            case 5:
                i2 = 128172;
                break;
            case 8:
                i2 = 128205;
                break;
            default:
                i2 = 128346;
                break;
        }
        iArr[0] = i2;
        r2[0] = new C37781pj(iArr);
        return r2;
    }

    public String AGT() {
        return AnonymousClass000.A0l(AnonymousClass000.A0r("custom:"), this.A00);
    }

    public boolean AcK() {
        int i2 = this.A00;
        return i2 == 7 || i2 == 8;
    }
}
