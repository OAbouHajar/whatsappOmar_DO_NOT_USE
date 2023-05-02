package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.SingleChoiceListDialogFragment;
import java.util.List;

/* renamed from: X.3Oe  reason: invalid class name */
public class AnonymousClass3Oe extends SimpleAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String[] A02;
    public final /* synthetic */ boolean[] A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Oe(Context context, SingleChoiceListDialogFragment singleChoiceListDialogFragment, List list, int[] iArr, String[] strArr, String[] strArr2, boolean[] zArr, int i2) {
        super(context, list, R.layout.layout055d, strArr, iArr);
        this.A01 = singleChoiceListDialogFragment;
        this.A03 = zArr;
        this.A00 = i2;
        this.A02 = strArr2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        Context A0u;
        int i3;
        View view2 = super.getView(i2, view, viewGroup);
        TextView A0M = C13680ns.A0M(view2, 16908308);
        TextView A0M2 = C13680ns.A0M(view2, 16908309);
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        if (singleChoiceListDialogFragment.A0c()) {
            boolean[] zArr = this.A03;
            if (zArr == null || zArr[i2]) {
                A0u = singleChoiceListDialogFragment.A0u();
                i3 = R.color.color0711;
            } else {
                A0u = singleChoiceListDialogFragment.A0u();
                i3 = R.color.color070b;
            }
            C13680ns.A0v(A0u, A0M, i3);
            C13680ns.A0v(singleChoiceListDialogFragment.A0u(), A0M2, i3);
        }
        if (TextUtils.isEmpty(A0M2.getText())) {
            A0M2.setVisibility(8);
        } else {
            A0M2.setVisibility(0);
        }
        int i4 = this.A00;
        if (i4 < 0 || !TextUtils.equals(this.A02[i4], A0M.getText())) {
            ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(false);
            return view2;
        }
        ((CompoundButton) view2.findViewById(R.id.radio)).setChecked(true);
        return view2;
    }
}
