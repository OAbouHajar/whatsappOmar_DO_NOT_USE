package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.obwhatsapp.conversation.selectlist.SelectListBottomSheet;

/* renamed from: X.2eX  reason: invalid class name and case insensitive filesystem */
public class C52842eX implements C52852eY {
    public final C14870pt A00;

    public C52842eX(C14870pt r1) {
        this.A00 = r1;
    }

    public void AaR(Context context, C16740tZ r5, C16880tn r6, int i2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg_select_list_content", r6);
        SelectListBottomSheet selectListBottomSheet = new SelectListBottomSheet();
        selectListBottomSheet.A0T(bundle);
        selectListBottomSheet.A00 = new AnonymousClass4KR(context, this, r5);
        Activity A002 = AnonymousClass22N.A00(context);
        if (A002 != null && (A002 instanceof AnonymousClass1yP)) {
            C453428a.A01(selectListBottomSheet, ((C001000l) A002).AGM());
        }
    }
}
