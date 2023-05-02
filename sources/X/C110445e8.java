package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;

/* renamed from: X.5e8  reason: invalid class name and case insensitive filesystem */
public class C110445e8 extends LinearLayout implements AnonymousClass006 {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public C14870pt A03;
    public TextEmojiLabel A04;
    public WaImageView A05;
    public AnonymousClass01V A06;
    public C17110uY A07;
    public C52662eE A08;
    public boolean A09;

    public C110445e8(Context context, AnonymousClass013 r10, C28401Vy r11, C53302fU r12, int i2, boolean z2) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A03 = C16150sX.A02(A002);
            this.A07 = C16150sX.A1A(A002);
            this.A06 = C16150sX.A0T(A002);
        }
        LinearLayout.inflate(getContext(), R.layout.layout02fd, this);
        this.A01 = C004601z.A0E(this, R.id.incentive_info_container);
        this.A00 = C004601z.A0E(this, R.id.incentive_message_divider);
        this.A05 = C13690nt.A0R(this, R.id.incentive_icon);
        this.A04 = C13680ns.A0Q(this, R.id.incentive_info_text);
        this.A02 = C110115dX.A05(this, R.id.incentive_blurb_container);
        this.A01.setVisibility(0);
        if (z2) {
            this.A00.setVisibility(0);
        }
        C28401Vy r3 = r12.A09.A00.A02;
        String str = r12.A0C;
        String string = context.getString(R.string.str0b58);
        if (i2 != 0) {
            if (i2 != 1) {
                if (!(i2 == 2 || i2 == 3)) {
                    if (i2 != 4) {
                        if (!(i2 == 5 || i2 == 7)) {
                            return;
                        }
                    } else if (r12.A01 != 0) {
                        return;
                    }
                }
                String[] strArr = {str};
                Runnable[] runnableArr = {new AnonymousClass63R()};
                A00(this, this.A07.A05(string, runnableArr, new String[]{"fine-print"}, strArr), 1);
            } else if (r12.A00 == 0) {
                this.A04.setText(R.string.str0b5a);
                this.A02.getBackground().setLevel(1);
            } else {
                return;
            }
            this.A05.setVisibility(8);
        } else if (r11.A00.compareTo(r3.A00) >= 0) {
            String str2 = r12.A0E;
            C35431lv r0 = r12.A07;
            String A0d = C13680ns.A0d(context, C218315p.A03(context, r10, r0.A01, r0.A02).toString(), C13680ns.A1b(), 0, R.string.str0b53);
            Runnable[] runnableArr2 = {new AnonymousClass63Q()};
            A00(this, this.A07.A05(A0d, runnableArr2, new String[]{"cashback-terms"}, new String[]{str2}), 0);
            this.A05.setVisibility(0);
        } else {
            C35431lv r2 = r12.A07;
            C28411Vz r1 = r2.A01;
            this.A04.setText(C13680ns.A0d(context, C218315p.A03(context, r10, r1, r3).toString(), C110105dW.A1a(C218315p.A03(context, r10, r1, r2.A02).toString()), 1, R.string.str0b59));
            this.A02.getBackground().setLevel(0);
            this.A05.setVisibility(0);
        }
    }

    public static void A00(C110445e8 r3, CharSequence charSequence, int i2) {
        TextEmojiLabel textEmojiLabel = r3.A04;
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, r3.A06));
        r3.A04.A07 = new AnonymousClass3MF();
        r3.A04.setText(charSequence);
        r3.A02.getBackground().setLevel(i2);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A08;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }
}
