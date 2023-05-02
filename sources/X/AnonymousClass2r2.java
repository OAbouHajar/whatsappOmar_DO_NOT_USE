package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.IntentChooserBottomSheetDialogFragment;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.2r2  reason: invalid class name */
public class AnonymousClass2r2 extends AnonymousClass01X {
    public List A00;
    public final /* synthetic */ IntentChooserBottomSheetDialogFragment A01;

    public AnonymousClass2r2(IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment, List list) {
        this.A01 = intentChooserBottomSheetDialogFragment;
        this.A00 = list;
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r6, int i2) {
        C64843Rw r62 = (C64843Rw) r6;
        C35021lF r2 = (C35021lF) this.A00.get(i2);
        int i3 = r2.A05;
        r62.A01.setText(r2.A06);
        C13680ns.A1B(r62.A0H, this, r2, 2);
        try {
            ImageView imageView = r62.A00;
            Context context = imageView.getContext();
            Integer num = r2.A02;
            Drawable applicationIcon = i3 == 0 ? context.getPackageManager().getApplicationIcon("com.obwhatsapp") : AnonymousClass00T.A04(context, i3);
            if (!(applicationIcon == null || num == null)) {
                applicationIcon = C018208n.A03(applicationIcon);
                C018208n.A0A(applicationIcon, num.intValue());
            }
            imageView.setImageDrawable(applicationIcon);
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        boolean A0E = this.A01.A04.A0E(C16620tM.A02, 689);
        int i3 = R.layout.layout035a;
        if (A0E) {
            i3 = R.layout.layout035b;
        }
        return new C64843Rw(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, i3));
    }
}
