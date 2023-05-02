package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.4ua  reason: invalid class name and case insensitive filesystem */
public abstract class C99784ua implements AnonymousClass5SS {
    public View A00;
    public final AnonymousClass1VI A01;
    public final AnonymousClass1P3 A02;

    public C99784ua(AnonymousClass1VI r1, AnonymousClass1P3 r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public View A00() {
        View view = this.A00;
        if (view != null) {
            return view;
        }
        AnonymousClass1VI r2 = this.A01;
        View A0H = C13680ns.A0H(C13680ns.A0G(r2), r2, this instanceof C71303ip ? R.layout.layout01ef : R.layout.layout01f0);
        this.A00 = A0H;
        return A0H;
    }

    public void A01() {
        View view = this.A00;
        AnonymousClass00B.A04(view);
        view.setVisibility(8);
        this.A02.A02();
    }

    public void A02(int i2) {
        if (i2 != 1) {
            switch (i2) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    return;
            }
        }
        this.A02.A01();
    }

    public void AHm() {
        View view = this.A00;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public boolean AfA() {
        return this.A02.A04();
    }

    public void AhG() {
        if (this instanceof C71313iq) {
            AnonymousClass1P3 r7 = this.A02;
            if (r7.A04() && this.A00 == null) {
                this.A01.addView(A00());
            }
            View A002 = A00();
            TextEmojiLabel A0Q = C13680ns.A0Q(A002, R.id.banner_title);
            AnonymousClass1VI r3 = this.A01;
            A0Q.A0G(AnonymousClass1ZW.A00(r3.getContext(), new Object[0], R.string.str1077));
            C13680ns.A0L(A002, R.id.banner_image).setText(r7.A00());
            r3.setBackgroundResource(R.color.color0141);
            C13680ns.A1A(r3, this, 34);
            C13680ns.A1A(C004601z.A0E(A002, R.id.cancel), this, 33);
            A002.setVisibility(0);
            r3.A01(16, 1);
            return;
        }
        if (this.A02.A04() && this.A00 == null) {
            this.A01.addView(A00());
        }
        View A003 = A00();
        TextEmojiLabel A0Q2 = C13680ns.A0Q(A003, R.id.banner_title);
        AnonymousClass1VI r6 = this.A01;
        A0Q2.A0G(AnonymousClass1ZW.A00(r6.getContext(), new Object[]{AnonymousClass1ZW.A06(A003.getContext(), R.color.color0659)}, R.string.str104d));
        r6.setBackgroundResource(R.color.color0141);
        C13680ns.A1A(r6, this, 32);
        C13680ns.A1A(C004601z.A0E(A003, R.id.cancel), this, 31);
        A003.setVisibility(0);
        r6.A01(23, 1);
    }
}
