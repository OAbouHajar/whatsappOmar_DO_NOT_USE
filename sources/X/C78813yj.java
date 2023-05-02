package X;

import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: X.3yj  reason: invalid class name and case insensitive filesystem */
public class C78813yj extends C16690tT {
    public final C16080sP A00;
    public final C16050sL A01;
    public final WeakReference A02;

    public C78813yj(TextView textView, C16080sP r3, C16050sL r4) {
        this.A00 = r3;
        this.A01 = r4;
        this.A02 = C13690nt.A0h(textView);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return this.A00.A0K(this.A01, -1, true);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        String str = (String) obj;
        TextView textView = (TextView) this.A02.get();
        if (textView != null && textView.getTag().equals(this.A01)) {
            textView.setText(str);
        }
    }
}
