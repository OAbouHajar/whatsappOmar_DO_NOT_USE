package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.35A  reason: invalid class name */
public class AnonymousClass35A extends AnonymousClass3GL {
    public View A00;
    public List A01;
    public final int A02;
    public final AnonymousClass1MF A03;
    public final AnonymousClass5QT A04;

    public AnonymousClass35A(Context context, LayoutInflater layoutInflater, C14710pd r3, AnonymousClass1MF r4, AnonymousClass5QT r5, int i2, int i3) {
        super(context, layoutInflater, r3, i3);
        this.A04 = r5;
        this.A03 = r4;
        this.A02 = i2;
    }

    public void A03(View view) {
        this.A00 = view.findViewById(R.id.empty);
    }

    public void APc(View view, ViewGroup viewGroup, int i2) {
        super.APc(view, viewGroup, i2);
        this.A00 = null;
    }
}
