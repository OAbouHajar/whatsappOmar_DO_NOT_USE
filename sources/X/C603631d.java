package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.31d  reason: invalid class name and case insensitive filesystem */
public final class C603631d extends AnonymousClass3O2 implements AnonymousClass2VS {
    public View A00 = findViewById(R.id.add_btn);
    public View A01 = findViewById(R.id.block_btn);
    public View A02 = findViewById(R.id.content);
    public View A03 = findViewById(R.id.dismiss_btn);
    public View A04 = findViewById(R.id.exit_group_btn);
    public View A05 = findViewById(R.id.not_spam_btn);
    public View A06 = findViewById(R.id.spam_btn);
    public TextView A07 = C13680ns.A0M(this, R.id.add_btn_text);
    public TextView A08 = C13680ns.A0M(this, R.id.block_btn_text);
    public TextView A09 = C13680ns.A0M(this, R.id.dismiss_btn_text);
    public TextView A0A = C13680ns.A0M(this, R.id.exit_group_btn_text);
    public TextView A0B = C13680ns.A0M(this, R.id.header);
    public TextView A0C = C13680ns.A0M(this, R.id.not_spam_btn_text);
    public TextView A0D = C13680ns.A0M(this, R.id.spam_btn_text);
    public TextEmojiLabel A0E = C13680ns.A0R(this, R.id.group_privacy_info);
    public C55442jc A0F;
    public AnonymousClass01V A0G;

    public C603631d(Context context) {
        super(context);
        FrameLayout.inflate(context, R.layout.layout015a, this);
    }

    public void AHp() {
        this.A02.setVisibility(8);
    }

    public void Ac8(AnonymousClass4P5 r8) {
        int i2;
        int i3;
        int i4;
        this.A02.setVisibility(0);
        this.A06.setVisibility(r8.A0B);
        View view = this.A05;
        int i5 = r8.A0A;
        view.setVisibility(i5);
        View view2 = this.A01;
        int i6 = r8.A02;
        view2.setVisibility(i6);
        this.A00.setVisibility(r8.A00);
        this.A03.setVisibility(r8.A03);
        this.A04.setVisibility(r8.A04);
        TextEmojiLabel textEmojiLabel = this.A0E;
        int i7 = r8.A06;
        textEmojiLabel.setVisibility(i7);
        if (i5 == 0 && (i4 = r8.A09) != -1) {
            TextView textView = this.A0C;
            textView.setText(i4);
            C13680ns.A0t(getContext(), textView, r8.A08);
        }
        if (i6 == 0 && (i3 = r8.A01) != -1) {
            this.A08.setText(i3);
        }
        if (i7 == 0 && (i2 = r8.A05) != -1) {
            C30531cW.A02(textEmojiLabel);
            C30531cW.A03(textEmojiLabel, this.A0G);
            textEmojiLabel.setText(this.A0F.A00(C13700nu.A0H(this, i2)));
        }
        int i8 = r8.A07;
        if (i8 != -1) {
            TextView textView2 = this.A0B;
            textView2.setText(i8);
            C13680ns.A0t(getContext(), textView2, i8);
        }
    }

    public int getType() {
        return 0;
    }

    public boolean isVisible() {
        return AnonymousClass000.A1P(this.A02.getVisibility());
    }

    public void setup(C55442jc r3) {
        this.A0F = r3;
        C13680ns.A1C(this.A06, this, r3, 15);
        C13680ns.A1C(this.A01, this, r3, 13);
        C13680ns.A17(this.A00, r3, 28);
        C13680ns.A17(this.A05, r3, 27);
        C13680ns.A17(this.A03, this, 26);
        C13680ns.A1C(this.A04, this, r3, 14);
        AnonymousClass1UP.A06(this.A0D);
        AnonymousClass1UP.A06(this.A0C);
        AnonymousClass1UP.A06(this.A08);
        AnonymousClass1UP.A06(this.A07);
        AnonymousClass1UP.A06(this.A0A);
    }
}
