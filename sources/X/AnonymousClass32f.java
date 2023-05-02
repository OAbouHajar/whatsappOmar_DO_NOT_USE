package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.util.Calendar;

/* renamed from: X.32f  reason: invalid class name */
public class AnonymousClass32f extends C65093Sv {
    public final TextView A00;
    public final /* synthetic */ AnonymousClass291 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass32f(View view, AnonymousClass291 r3) {
        super(view, r3);
        this.A01 = r3;
        this.A00 = C13680ns.A0M(view, R.id.live_location_end_text);
    }

    public void A07(C16010sH r12, C39721sx r13) {
        String A0d;
        int i2;
        TextView textView = this.A00;
        AnonymousClass291 r9 = this.A01;
        C16440t3 r2 = r9.A1B;
        long A02 = r2.A02(r13.A05);
        int A002 = C42681yF.A00(r2.A00(), A02);
        if (A002 <= 6) {
            if (A002 != 0) {
                if (A002 != 1) {
                    Calendar instance = Calendar.getInstance();
                    instance.setTimeInMillis(A02);
                    switch (instance.get(7)) {
                        case 1:
                            i2 = R.string.str0c6d;
                            break;
                        case 2:
                            i2 = R.string.str0c6b;
                            break;
                        case 3:
                            i2 = R.string.str0c70;
                            break;
                        case 4:
                            i2 = R.string.str0c71;
                            break;
                        case 5:
                            i2 = R.string.str0c6e;
                            break;
                        case 6:
                            i2 = R.string.str0c6a;
                            break;
                        case 7:
                            i2 = R.string.str0c6c;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                } else {
                    i2 = R.string.str0c72;
                }
            } else {
                i2 = R.string.str0c6f;
            }
            AnonymousClass013 r5 = r9.A1D;
            A0d = C47672Jx.A01(r5, C13680ns.A0d(r9.A0E, C47672Jx.A00(r5, A02), new Object[1], 0, i2), A02);
        } else {
            A0d = C13680ns.A0d(r9.A0E, C28961Zl.A03(r9.A1D, A002, A02), new Object[1], 0, R.string.str0c69);
        }
        textView.setText(A0d);
    }
}
