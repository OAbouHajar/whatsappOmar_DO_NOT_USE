package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.3Nk  reason: invalid class name and case insensitive filesystem */
public class C64253Nk extends ArrayAdapter {
    public final /* synthetic */ AnonymousClass1V8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64253Nk(Context context, AnonymousClass1V8 r3, List list) {
        super(context, R.layout.layout03f3, list);
        this.A00 = r3;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass39D r3;
        View view2 = view;
        Object item = getItem(i2);
        AnonymousClass00B.A06(item);
        C16010sH r2 = (C16010sH) item;
        if (view == null) {
            AnonymousClass1V8 r6 = this.A00;
            view2 = C13680ns.A0H(r6.getLayoutInflater(), viewGroup, R.layout.layout03f3);
            r3 = new AnonymousClass39D(view2, r6.A0L, r6, r6.A0S, r6.A0U);
            view2.setTag(r3);
        } else {
            r3 = (AnonymousClass39D) view.getTag();
        }
        this.A00.A3U(r3, r2);
        return view2;
    }
}
