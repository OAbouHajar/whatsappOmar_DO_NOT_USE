package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.wds.components.button.WDSButton;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2X7  reason: invalid class name */
public final class AnonymousClass2X7 extends AnonymousClass01X {
    public C16050sL A00;
    public List A01 = new ArrayList();
    public AnonymousClass22J A02;
    public AnonymousClass22J A03;
    public final Context A04;
    public final C19980zJ A05;
    public final C16080sP A06;
    public final AnonymousClass2Ao A07;
    public final C17200uh A08;
    public final C17110uY A09;

    public AnonymousClass2X7(Context context, C19980zJ r4, C16080sP r5, C17200uh r6, C17110uY r7) {
        C18450wi.A0H(r4, 2);
        C18450wi.A0H(r7, 3);
        C18450wi.A0H(r6, 4);
        C18450wi.A0H(r5, 5);
        this.A04 = context;
        this.A05 = r4;
        this.A09 = r7;
        this.A08 = r6;
        this.A06 = r5;
        this.A07 = r6.A04(context, "group-pending-participants");
        A0B(true);
    }

    public void A0A(RecyclerView recyclerView) {
        C18450wi.A0H(recyclerView, 0);
        this.A07.A00();
    }

    public int A0C() {
        int size = this.A01.size();
        int i2 = size + 1;
        if (size <= 0) {
            return 0;
        }
        return i2;
    }

    public long A0D(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return (long) ((AnonymousClass2BN) this.A01.get(i2 - 1)).A06.hashCode();
    }

    public void ANf(C005602k r7, int i2) {
        String string;
        Context context;
        int i3;
        C18450wi.A0H(r7, 0);
        if (i2 != 0) {
            C64883Sa r72 = (C64883Sa) r7;
            AnonymousClass2BN r2 = (AnonymousClass2BN) this.A01.get(i2 - 1);
            C16010sH r4 = r2.A03;
            r72.A00.setTag(r2.A06);
            if (r4 != null) {
                TextEmojiLabel textEmojiLabel = r72.A03;
                C16080sP r1 = this.A06;
                textEmojiLabel.setText(r1.A0A(r4));
                if (!r4.A0G()) {
                    String A0F = r1.A0F(r4);
                    C18450wi.A0B(A0F);
                    if (!TextUtils.isEmpty(A0F)) {
                        TextEmojiLabel textEmojiLabel2 = r72.A02;
                        textEmojiLabel2.setVisibility(0);
                        textEmojiLabel2.setText(A0F);
                        this.A07.A06(r72.A01, r4);
                    }
                }
                r72.A02.setVisibility(8);
                this.A07.A06(r72.A01, r4);
            }
            AnonymousClass42N r42 = r2.A01;
            AnonymousClass42N r3 = AnonymousClass42N.A02;
            WDSButton wDSButton = r72.A05;
            if (r42 == r3) {
                wDSButton.setVisibility(0);
                r72.A06.setVisibility(0);
                r72.A04.setVisibility(8);
                return;
            }
            wDSButton.setVisibility(8);
            r72.A06.setVisibility(8);
            WaTextView waTextView = r72.A04;
            waTextView.setVisibility(0);
            int i4 = R.color.color04a3;
            int i5 = R.drawable.group_info_label_green;
            switch (r2.A01.ordinal()) {
                case 1:
                    if (r2.A02 == AnonymousClass2X8.REJECT && r2.A00 == C801042o.REQUESTER_ALREADY_IN_GROUP) {
                        context = this.A04;
                        i3 = R.string.str0ad5;
                    } else {
                        context = this.A04;
                        i3 = R.string.str0ac1;
                    }
                    string = context.getString(i3);
                    C18450wi.A0B(string);
                    break;
                case 2:
                    i4 = R.color.color04a1;
                    string = this.A04.getString(R.string.str0ac4);
                    C18450wi.A0B(string);
                    i5 = R.drawable.group_info_label_gray;
                    break;
                default:
                    string = "";
                    break;
            }
            Context context2 = this.A04;
            int A002 = AnonymousClass00T.A00(context2, i4);
            waTextView.setBackground(AnonymousClass00T.A04(context2, i5));
            waTextView.setText(string);
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        C18450wi.A0H(viewGroup, 0);
        C19980zJ r3 = this.A05;
        if (i2 == 1) {
            C17110uY r2 = this.A09;
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout02d9, viewGroup, false);
            C18450wi.A0B(inflate);
            return new AnonymousClass3S3(inflate, r3, this, r2);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout02db, viewGroup, false);
        C18450wi.A0B(inflate2);
        return new C64883Sa(inflate2, r3, this);
    }

    public int getItemViewType(int i2) {
        return i2 == 0 ? 1 : 0;
    }
}
