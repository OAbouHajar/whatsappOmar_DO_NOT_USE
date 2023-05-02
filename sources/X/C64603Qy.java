package X;

import android.view.ViewGroup;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3Qy  reason: invalid class name and case insensitive filesystem */
public class C64603Qy extends AnonymousClass01X {
    public final List A00;

    public C64603Qy(List list) {
        this.A00 = list;
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        C65133Sz r22 = (C65133Sz) r2;
        r22.A07();
        r22.A08(this.A00.get(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        switch (AnonymousClass428.values()[i2].ordinal()) {
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return new C72763mf(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout050d));
            case 41:
                return new C72773mg(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout050d));
            default:
                throw AnonymousClass000.A0V(C13680ns.A0c(i2, "LocationOptionPickerAdapter/onCreateViewHolder type not handled: "));
        }
    }

    public int getItemViewType(int i2) {
        return ((C31301dt) this.A00.get(i2)).A00.ordinal();
    }
}
