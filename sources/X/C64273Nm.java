package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.profile.SetAboutInfo;
import java.util.ArrayList;

/* renamed from: X.3Nm  reason: invalid class name and case insensitive filesystem */
public class C64273Nm extends ArrayAdapter {
    public final ArrayList A00;
    public final /* synthetic */ SetAboutInfo A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64273Nm(Context context, SetAboutInfo setAboutInfo, ArrayList arrayList) {
        super(context, R.id.status_row, arrayList);
        this.A01 = setAboutInfo;
        this.A00 = arrayList;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextEmojiLabel A0R;
        if (view == null) {
            view = AnonymousClass01V.A01(viewGroup.getContext()).inflate(R.layout.layout0545, (ViewGroup) null);
        }
        String str = (String) this.A00.get(i2);
        if (!(str == null || (A0R = C13680ns.A0R(view, R.id.status_row)) == null)) {
            View findViewById = view.findViewById(R.id.status_selected_check);
            SetAboutInfo setAboutInfo = this.A01;
            int i3 = 4;
            if (str.equals(setAboutInfo.A01.A00())) {
                i3 = 0;
            }
            findViewById.setVisibility(i3);
            C13680ns.A0t(setAboutInfo, findViewById, R.string.str0453);
            A0R.A0G(str);
        }
        return view;
    }
}
