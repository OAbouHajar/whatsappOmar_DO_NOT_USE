package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2rD  reason: invalid class name and case insensitive filesystem */
public class C57462rD extends AnonymousClass01X {
    public int A00 = -1;
    public AnonymousClass4E9 A01;
    public final List A02 = AnonymousClass000.A0u();

    public int A0C() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r7, int i2) {
        View view;
        C64683Rg r72 = (C64683Rg) r7;
        if (getItemViewType(i2) == 0) {
            AnonymousClass3pK r73 = (AnonymousClass3pK) r72;
            String str = ((C87894Zb) this.A02.get(i2)).A01;
            boolean isEmpty = TextUtils.isEmpty(str);
            View view2 = r73.A0H;
            if (isEmpty) {
                view2.setVisibility(8);
                return;
            }
            view2.setVisibility(0);
            r73.A00.A0I((List) null, str);
            return;
        }
        C35111lO r4 = ((C87894Zb) this.A02.get(i2)).A00;
        AnonymousClass3pL r74 = (AnonymousClass3pL) r72;
        if (r4 == null) {
            view = r74.A0H;
        } else {
            r74.A00.setChecked(AnonymousClass000.A1R(r74.A00(), r74.A03.A00));
            r74.A0H.setVisibility(0);
            r74.A02.A0I((List) null, r4.A02);
            String str2 = r4.A00;
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            TextEmojiLabel textEmojiLabel = r74.A01;
            view = textEmojiLabel;
            if (!isEmpty2) {
                textEmojiLabel.A0I((List) null, str2);
                textEmojiLabel.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        LayoutInflater A0G = C13680ns.A0G(viewGroup);
        return i2 == 0 ? new AnonymousClass3pK(A0G.inflate(R.layout.layout053a, viewGroup, false), this) : new AnonymousClass3pL(A0G.inflate(R.layout.layout0539, viewGroup, false), this);
    }

    public int getItemViewType(int i2) {
        return (TextUtils.isEmpty(((C87894Zb) this.A02.get(i2)).A01) ^ true) ^ true ? 1 : 0;
    }
}
