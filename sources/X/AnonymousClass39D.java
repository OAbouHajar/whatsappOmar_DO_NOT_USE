package X;

import android.view.View;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.SelectionCheckView;

/* renamed from: X.39D  reason: invalid class name */
public class AnonymousClass39D {
    public final View A00;
    public final ImageView A01;
    public final TextEmojiLabel A02;
    public final C30521cU A03;
    public final SelectionCheckView A04;
    public final /* synthetic */ AnonymousClass1V8 A05;

    public AnonymousClass39D(View view, C16080sP r10, AnonymousClass1V8 r11, AnonymousClass013 r12, C25781Lc r13) {
        this.A05 = r11;
        this.A00 = view.findViewById(R.id.row_container);
        this.A01 = C13680ns.A0K(view, R.id.contact_photo);
        C30521cU r2 = new C30521cU(view, r10, r12, r13, (int) R.id.chat_able_contacts_row_name);
        this.A03 = r2;
        C004601z.A0d(r2.A02, 2);
        r2.A05();
        this.A02 = C13680ns.A0R(view, R.id.chat_able_contacts_row_status);
        this.A04 = (SelectionCheckView) view.findViewById(R.id.selection_check);
    }

    public void A00(String str, boolean z2) {
        this.A00.setEnabled(z2);
        TextEmojiLabel textEmojiLabel = this.A02;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.setText(str);
        AnonymousClass1V8 r3 = this.A05;
        C13690nt.A0w(r3.getResources(), textEmojiLabel, R.color.color0470);
        this.A03.A06(r3.getResources().getColor(R.color.color0470));
        this.A01.setAlpha(0.5f);
        this.A04.A04(false, false);
    }

    public void A01(boolean z2) {
        this.A00.setEnabled(true);
        this.A01.setAlpha(1.0f);
        TextEmojiLabel textEmojiLabel = this.A02;
        AnonymousClass1V8 r3 = this.A05;
        C13690nt.A0w(r3.getResources(), textEmojiLabel, R.color.color0505);
        this.A03.A06(r3.getResources().getColor(R.color.color0507));
        this.A04.A04(z2, false);
    }
}
