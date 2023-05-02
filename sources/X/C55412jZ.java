package X;

import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.quickcontact.QuickContactActivity;

/* renamed from: X.2jZ  reason: invalid class name and case insensitive filesystem */
public class C55412jZ extends AnonymousClass2Aq {
    public View A00;
    public View A01;
    public TextView A02;
    public WaImageButton A03;
    public final /* synthetic */ QuickContactActivity A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55412jZ(QuickContactActivity quickContactActivity) {
        super(quickContactActivity);
        this.A04 = quickContactActivity;
    }

    public void A04() {
        super.A04();
        QuickContactActivity quickContactActivity = this.A04;
        quickContactActivity.A07.setContentDescription(quickContactActivity.getResources().getString(R.string.str1d6a));
    }
}
