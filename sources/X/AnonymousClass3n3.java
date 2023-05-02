package X;

import android.view.View;
import com.facebook.redex.ViewOnClickCListenerShape0S0000000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.3n3  reason: invalid class name */
public class AnonymousClass3n3 extends AnonymousClass26H {
    public final WaTextView A00;

    public AnonymousClass3n3(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        this.A00 = C13680ns.A0S(view, R.id.button_text);
    }

    public void A07(AnonymousClass26J r4) {
        WaTextView waTextView;
        int i2;
        int i3 = r4.A00;
        if (i3 == 2) {
            View view = this.A0H;
            view.setClickable(true);
            view.setOnClickListener(new ViewOnClickCListenerShape0S0000000_I1(0));
            waTextView = this.A00;
            i2 = R.string.str1aae;
        } else if (i3 != 3) {
            Log.w(C13680ns.A0c(i3, "CallInfoButtonViewHolder/bind/Unsupported item type: "));
            return;
        } else {
            View view2 = this.A0H;
            view2.setClickable(false);
            view2.setOnClickListener((View.OnClickListener) null);
            waTextView = this.A00;
            i2 = R.string.str1aad;
        }
        waTextView.setText(i2);
    }
}
