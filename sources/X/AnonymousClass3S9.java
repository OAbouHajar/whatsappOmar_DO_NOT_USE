package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.polls.PollResultsViewModel;

/* renamed from: X.3S9  reason: invalid class name */
public class AnonymousClass3S9 extends C005602k {
    public long A00;
    public final WaTextView A01;

    public AnonymousClass3S9(View view, PollResultsViewModel pollResultsViewModel) {
        super(view);
        WaTextView A0S = C13680ns.A0S(view, R.id.poll_results_see_all_text_view);
        this.A01 = A0S;
        C13680ns.A1C(A0S, this, pollResultsViewModel, 40);
        AnonymousClass2JP.A02(A0S);
    }
}
