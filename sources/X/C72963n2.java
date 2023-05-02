package X;

import android.content.Context;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel;

/* renamed from: X.3n2  reason: invalid class name and case insensitive filesystem */
public class C72963n2 extends AnonymousClass26H {
    public final View A00;

    public C72963n2(View view, ParticipantsListViewModel participantsListViewModel) {
        super(view, participantsListViewModel);
        this.A00 = C004601z.A0E(view, R.id.add_participant_icon);
    }

    public void A07(AnonymousClass26J r5) {
        View view = this.A0H;
        view.setClickable(true);
        C13680ns.A18(view, this, 47);
        Context context = view.getContext();
        C62043Bk.A03(context, this.A00);
        C62043Bk.A04(view, context.getString(R.string.str1aa1), context.getString(R.string.str1aa0));
    }
}
