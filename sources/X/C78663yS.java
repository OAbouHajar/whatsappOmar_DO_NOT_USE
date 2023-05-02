package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.group.NewGroup;
import java.util.List;

/* renamed from: X.3yS  reason: invalid class name and case insensitive filesystem */
public class C78663yS extends C34331k5 {
    public final /* synthetic */ NewGroup A00;
    public final /* synthetic */ List A01;

    public C78663yS(NewGroup newGroup, List list) {
        this.A00 = newGroup;
        this.A01 = list;
    }

    public void A06(View view) {
        NewGroup newGroup = this.A00;
        if (AnonymousClass3K4.A0Z(newGroup.A07.getText()).length() == 0) {
            newGroup.A05.A09(R.string.str0dd9, 0);
        } else {
            NewGroup.A0x(newGroup, this.A01);
        }
    }
}
