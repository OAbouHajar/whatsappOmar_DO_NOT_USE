package kotlin.jvm.internal;

import X.AnonymousClass1DR;
import X.AnonymousClass1DU;
import X.AnonymousClass3L9;
import X.C13690nt;
import X.C79453zw;
import X.C89264br;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicReference;

public class IDxLambdaShape56S0000000_2_I1 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLambdaShape56S0000000_2_I1(int i2) {
        super(0);
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        switch (this.A00) {
            case 4:
                return new AtomicReference();
            case 6:
                return new AnonymousClass3L9();
            case 7:
                Paint paint = new Paint(1);
                paint.setFilterBitmap(true);
                paint.setDither(true);
                paint.setColor(-1);
                return paint;
            case 8:
                Paint paint2 = new Paint(1);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setDither(true);
                paint2.setFilterBitmap(true);
                return paint2;
            case 9:
                return new C79453zw();
            case 10:
            case 11:
                return new RectF();
            case 12:
            case 13:
                return new C89264br(0, 0, 0, 0);
            case 14:
                Paint paint3 = new Paint(1);
                paint3.setAntiAlias(true);
                paint3.setStyle(Paint.Style.FILL);
                paint3.setDither(true);
                return paint3;
            default:
                return C13690nt.A0O();
        }
    }
}
