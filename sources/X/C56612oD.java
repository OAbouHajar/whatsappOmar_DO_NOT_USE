package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import java.util.List;

/* renamed from: X.2oD  reason: invalid class name and case insensitive filesystem */
public class C56612oD extends ArrayAdapter {
    public final /* synthetic */ PhoneContactsSelector A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56612oD(Context context, PhoneContactsSelector phoneContactsSelector, List list) {
        super(context, R.layout.layout048f, list);
        this.A00 = phoneContactsSelector;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4ND r0;
        Object item = getItem(i2);
        AnonymousClass00B.A06(item);
        C55902kd r6 = (C55902kd) item;
        if (view == null) {
            view = this.A00.getLayoutInflater().inflate(R.layout.layout048f, viewGroup, false);
            r0 = new AnonymousClass4ND(view);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass4ND) view.getTag();
        }
        PhoneContactsSelector phoneContactsSelector = this.A00;
        C17160ud r3 = phoneContactsSelector.A0C;
        ImageView imageView = r0.A01;
        r3.A05(imageView, R.drawable.avatar_contact);
        phoneContactsSelector.A0F.A01(imageView, r6);
        r0.A02.A0I(phoneContactsSelector.A0U, r6.A06);
        SelectionCheckView selectionCheckView = r0.A04;
        selectionCheckView.A04(r6.A03, false);
        selectionCheckView.setTag(r6);
        return view;
    }
}
