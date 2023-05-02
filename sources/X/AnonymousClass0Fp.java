package X;

import android.util.SparseArray;
import android.view.View;
import com.obwhatsapp.R;

/* renamed from: X.0Fp  reason: invalid class name */
public class AnonymousClass0Fp extends C005602k {
    public boolean A00;
    public boolean A01;
    public final SparseArray A02;

    public AnonymousClass0Fp(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.A02 = sparseArray;
        sparseArray.put(16908310, view.findViewById(16908310));
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
    }

    public View A07(int i2) {
        SparseArray sparseArray = this.A02;
        View view = (View) sparseArray.get(i2);
        if (view == null && (view = this.A0H.findViewById(i2)) != null) {
            sparseArray.put(i2, view);
        }
        return view;
    }
}
