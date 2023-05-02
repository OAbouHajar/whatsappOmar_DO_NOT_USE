package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import java.util.List;

/* renamed from: X.2oH  reason: invalid class name and case insensitive filesystem */
public class C56652oH extends ArrayAdapter {
    public final /* synthetic */ ListChatInfoActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56652oH(Context context, ListChatInfoActivity listChatInfoActivity, List list) {
        super(context, 0, list);
        this.A00 = listChatInfoActivity;
    }

    public int getCount() {
        return this.A00.A0b.size();
    }

    public int getItemViewType(int i2) {
        Object item = getItem(i2);
        C16080sP r1 = this.A00.A0B;
        AnonymousClass00B.A06(item);
        return r1.A0S((C16010sH) item, -1) ? 1 : 0;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4M4 r0;
        TextEmojiLabel textEmojiLabel;
        String str;
        View view2 = view;
        if (view == null) {
            int itemViewType = getItemViewType(i2);
            int i3 = R.layout.layout02d2;
            if (itemViewType == 0) {
                i3 = R.layout.layout02d1;
            }
            ListChatInfoActivity listChatInfoActivity = this.A00;
            view2 = listChatInfoActivity.getLayoutInflater().inflate(i3, viewGroup, false);
            r0 = new AnonymousClass4M4();
            r0.A02 = new C30521cU(view2, listChatInfoActivity.A0B, listChatInfoActivity.A08, listChatInfoActivity.A0T, (int) R.id.name);
            r0.A01 = C13680ns.A0R(view2, R.id.status);
            r0.A00 = C13680ns.A0K(view2, R.id.avatar);
            view2.setTag(r0);
        } else {
            r0 = (AnonymousClass4M4) view.getTag();
        }
        Object item = getItem(i2);
        AnonymousClass00B.A06(item);
        C16010sH r4 = (C16010sH) item;
        r0.A03 = r4;
        r0.A02.A0A(r4);
        ImageView imageView = r0.A00;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(new C54602hp(getContext()).A00(R.string.str1dd1));
        C004601z.A0n(imageView, AnonymousClass000.A0h(C16030sJ.A03(r4.A0E), A0o));
        ListChatInfoActivity listChatInfoActivity2 = this.A00;
        listChatInfoActivity2.A0C.A06(r0.A00, r4);
        C34331k5.A05(r0.A00, this, r4, r0, 6);
        if (listChatInfoActivity2.A0B.A0S(r4, -1)) {
            r0.A01.setVisibility(0);
            textEmojiLabel = r0.A01;
            str = listChatInfoActivity2.A0B.A0F(r4);
        } else {
            String str2 = r4.A0T;
            TextEmojiLabel textEmojiLabel2 = r0.A01;
            if (str2 != null) {
                textEmojiLabel2.setVisibility(0);
                textEmojiLabel = r0.A01;
                str = r4.A0T;
            } else {
                textEmojiLabel2.setVisibility(8);
                return view2;
            }
        }
        textEmojiLabel.A0I((List) null, str);
        return view2;
    }

    public int getViewTypeCount() {
        return 2;
    }
}
