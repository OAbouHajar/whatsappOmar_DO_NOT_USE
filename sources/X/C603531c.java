package X;

import android.view.View;
import com.whatsapp.util.Log;

/* renamed from: X.31c  reason: invalid class name and case insensitive filesystem */
public class C603531c extends AnonymousClass3BL {
    public static final AnonymousClass4RB A02 = new AnonymousClass4RB(72, 4.0f, 1.0f);
    public static final AnonymousClass4RB A03 = new AnonymousClass4RB(72, 1.0f, 1.0f);
    public static final AnonymousClass4RB A04 = new AnonymousClass4RB(65, 5.0f, 7.0f);
    public final AnonymousClass4RB A00;
    public final AnonymousClass4RB A01;

    public C603531c(AnonymousClass4RB r1, AnonymousClass4RB r2, int i2) {
        super(i2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public static final Float A00(float f2, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            f2 = Math.min(f2, (float) View.MeasureSpec.getSize(i2));
        } else if (mode != 0) {
            if (mode != 1073741824) {
                Log.w(C13680ns.A0c(mode, "ConversationRowSingleImagePreviewCalculator/getSizeToSpec: Unhandled View.MeasureSpec "));
            } else if (f2 != ((float) View.MeasureSpec.getSize(i2))) {
                return null;
            }
        }
        return Float.valueOf(f2);
    }
}
