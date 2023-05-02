package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.facebook.redex.IDxDListenerShape1S0210000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.components.SelectionCheckView;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2A8  reason: invalid class name */
public class AnonymousClass2A8 extends BaseAdapter {
    public List A00 = new ArrayList();
    public final /* synthetic */ C32501gU A01;

    public AnonymousClass2A8(C32501gU r2) {
        this.A01 = r2;
    }

    public final void A00(SelectionCheckView selectionCheckView, boolean z2) {
        int i2;
        C32501gU r1 = this.A01;
        if (r1.A0K) {
            i2 = R.string.str167f;
            if (z2) {
                i2 = R.string.str167e;
            }
        } else {
            i2 = R.string.str1680;
            if (z2) {
                i2 = R.string.str1681;
            }
        }
        selectionCheckView.setContentDescription(r1.getString(i2));
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A00.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        C84644Li r0;
        View view2 = view;
        C16010sH r7 = (C16010sH) this.A00.get(i2);
        if (view == null) {
            C32501gU r2 = this.A01;
            view2 = r2.getLayoutInflater().inflate(R.layout.layout0569, viewGroup, false);
            r0 = new C84644Li();
            view2.setTag(r0);
            r0.A00 = (ImageView) view2.findViewById(R.id.contactpicker_row_photo);
            r0.A01 = new C30521cU(view2, r2.A0B, r2.A01, r2.A0F, (int) R.id.contactpicker_row_name);
            r0.A02 = (SelectionCheckView) view2.findViewById(R.id.selection_check);
            r0.A01.A05();
        } else {
            r0 = (C84644Li) view2.getTag();
        }
        view2.setClickable(false);
        view2.setLongClickable(false);
        Class<UserJid> cls = UserJid.class;
        Jid A08 = r7.A08(cls);
        AnonymousClass00B.A06(A08);
        r0.A03 = (UserJid) A08;
        C32501gU r6 = this.A01;
        r6.A0C.A06(r0.A00, r7);
        C004601z.A0d(r0.A00, 2);
        r0.A01.A0D(r7, r6.A0H);
        boolean contains = r6.A0T.contains(r7.A08(cls));
        boolean z2 = r6.A0K;
        SelectionCheckView selectionCheckView = r0.A02;
        int i3 = R.drawable.teal_circle;
        if (z2) {
            i3 = R.drawable.red_circle;
        }
        selectionCheckView.setSelectionBackground(i3);
        if (r6.A0S.remove(r7.A08(cls))) {
            r0.A02.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape1S0210000_2_I0(this, r0, 0, contains));
        } else {
            boolean A0V = r6.A06.A0V((UserJid) r7.A08(cls));
            SelectionCheckView selectionCheckView2 = r0.A02;
            if (A0V) {
                selectionCheckView2.A04(r6.A0K, false);
                r0.A02.setContentDescription(r6.getString(R.string.str178d));
                view2.setAlpha(0.5f);
                return view2;
            }
            selectionCheckView2.A04(contains, false);
            A00(r0.A02, contains);
        }
        view2.setAlpha(1.0f);
        return view2;
    }
}
