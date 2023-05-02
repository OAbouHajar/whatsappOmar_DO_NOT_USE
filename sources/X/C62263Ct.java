package X;

import android.view.View;
import android.widget.EditText;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.polls.PollCreatorViewModel;
import java.util.List;

/* renamed from: X.3Ct  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62263Ct implements View.OnFocusChangeListener {
    public final /* synthetic */ C14710pd A00;
    public final /* synthetic */ AnonymousClass33r A01;
    public final /* synthetic */ PollCreatorViewModel A02;

    public /* synthetic */ C62263Ct(C14710pd r1, AnonymousClass33r r2, PollCreatorViewModel pollCreatorViewModel) {
        this.A01 = r2;
        this.A02 = pollCreatorViewModel;
        this.A00 = r1;
    }

    public final void onFocusChange(View view, boolean z2) {
        AnonymousClass33r r2 = this.A01;
        PollCreatorViewModel pollCreatorViewModel = this.A02;
        C14710pd r5 = this.A00;
        if (z2) {
            WaEditText waEditText = r2.A01;
            waEditText.setSelection(waEditText.getText().length());
            if (r2.A00() != -1) {
                int A002 = r2.A00() - 2;
                if (pollCreatorViewModel.A06(A002) && A002 != pollCreatorViewModel.A01) {
                    C13680ns.A1P(pollCreatorViewModel.A03, pollCreatorViewModel.A0G.size() - 1);
                    pollCreatorViewModel.A01 = A002;
                    pollCreatorViewModel.A0E.A09(C13690nt.A0Y());
                    return;
                }
                return;
            }
            return;
        }
        if (r5.A0E(C16620tM.A02, 2661)) {
            pollCreatorViewModel.A09(false);
        } else {
            pollCreatorViewModel.A08(false);
        }
        if ((view instanceof WaEditText) && r2.A00() != -1) {
            EditText editText = (EditText) view;
            String trim = editText.getText() == null ? "" : C13680ns.A0f(editText).trim();
            int A003 = r2.A00() - 2;
            if (trim.length() > 0) {
                pollCreatorViewModel.A07(trim, A003);
                return;
            }
            List list = pollCreatorViewModel.A0G;
            if (list.size() > 2 && list.size() - 1 != A003) {
                list.remove(A003);
                pollCreatorViewModel.A05();
            }
        }
    }
}
