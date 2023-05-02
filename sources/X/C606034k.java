package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import com.obwhatsapp.R;

/* renamed from: X.34k  reason: invalid class name and case insensitive filesystem */
public class C606034k extends AnonymousClass3T0 {
    public C16690tT A00;
    public boolean A01 = false;
    public final C16980tz A02;
    public final C49172Rk A03;
    public final AnonymousClass2OM A04;
    public final AnonymousClass3OQ A05;
    public final C16320sq A06;

    public C606034k(C16980tz r2, C49172Rk r3, AnonymousClass2OM r4, AnonymousClass4FA r5, AnonymousClass3OQ r6, C16320sq r7) {
        super(r6, r5);
        this.A05 = r6;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = r7;
        this.A03 = r3;
    }

    public C16690tT A07() {
        return this.A00;
    }

    public void A08(Integer num) {
        Context context = this.A0H.getContext();
        String string = context.getString(R.string.str1b43);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(1, 1);
        gradientDrawable.setColor(AnonymousClass00T.A00(context, R.color.color0809));
        this.A05.A00(gradientDrawable, AnonymousClass2SR.A02(context, R.drawable.ic_attachment_gallery, R.color.color080a), string);
        if (!this.A01 && this.A00 == null) {
            AnonymousClass35y r2 = new AnonymousClass35y(this.A03, new C83874Ij(this, string));
            this.A00 = r2;
            this.A06.Ack(r2, new Object[0]);
        }
    }
}
