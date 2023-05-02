package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;
import java.util.List;

/* renamed from: X.3Qw  reason: invalid class name and case insensitive filesystem */
public final class C64583Qw extends AnonymousClass01X {
    public final CallRatingViewModel A00;
    public final List A01;

    public C64583Qw(CallRatingViewModel callRatingViewModel, List list) {
        C18450wi.A0H(callRatingViewModel, 2);
        this.A01 = list;
        this.A00 = callRatingViewModel;
    }

    public int A0C() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r6, int i2) {
        AnonymousClass3SG r62 = (AnonymousClass3SG) r6;
        C18450wi.A0H(r62, 0);
        C87044Vd r4 = (C87044Vd) this.A01.get(i2);
        C18450wi.A0H(r4, 0);
        r62.A01.setText(r4.A00);
        C13680ns.A18(r62.A0H, r62, 46);
        AppCompatCheckBox appCompatCheckBox = r62.A00;
        C64583Qw r2 = r62.A02;
        appCompatCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        appCompatCheckBox.setChecked(r2.A00.A0E.contains(Integer.valueOf(r4.A01.ordinal())));
        appCompatCheckBox.setOnCheckedChangeListener(new C94734lO(r2, r4));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        View inflate = C13680ns.A0G(viewGroup).inflate(R.layout.layout00d8, viewGroup, false);
        C18450wi.A0B(inflate);
        return new AnonymousClass3SG(inflate, this);
    }
}
