package X;

import android.os.Build;
import android.view.View;
import android.widget.Button;
import com.obwhatsapp.R;

/* renamed from: X.2kb  reason: invalid class name and case insensitive filesystem */
public class C55882kb extends AnonymousClass05M {
    public final /* synthetic */ View A00;

    public C55882kb(View view) {
        this.A00 = view;
    }

    public void A06(View view, AnonymousClass031 r6) {
        super.A06(view, r6);
        if ("Button".equals("Button")) {
            String name = Button.class.getName();
            if (Build.VERSION.SDK_INT < 23) {
                r6.A0F(this.A00.getContext().getString(R.string.str003e));
            }
            r6.A01.setClassName(name);
            return;
        }
        StringBuilder sb = new StringBuilder("AccessibilityUtils/setRole/invalid role: ");
        sb.append("Button");
        throw new IllegalArgumentException(sb.toString());
    }
}
