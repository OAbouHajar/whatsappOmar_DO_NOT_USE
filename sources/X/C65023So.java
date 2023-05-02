package X;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaTextView;
import java.util.Arrays;

/* renamed from: X.3So  reason: invalid class name and case insensitive filesystem */
public class C65023So extends C005602k {
    public C65023So(View view) {
        super(view);
    }

    public void A07(Object obj) {
        int i2;
        if (this instanceof C71693kt) {
            C71693kt r1 = (C71693kt) this;
            LayoutInflater A0G = C13680ns.A0G(r1.A00);
            ViewGroup A0M = AnonymousClass3K4.A0M(r1.A0H);
            int i3 = 0;
            do {
                A0G.inflate(R.layout.layout050c, A0M, true);
                i3++;
            } while (i3 < 14);
        } else if (this instanceof C71673kr) {
            C71783l2 r10 = (C71783l2) obj;
            C18450wi.A0H(r10, 0);
            this.A0H.getLayoutParams().height = r10.A00;
        } else if (this instanceof C71713kv) {
            C71713kv r2 = (C71713kv) this;
            Uri parse = Uri.parse("https://faq.whatsapp.com/591394022726343");
            C18450wi.A0B(parse);
            C14870pt r5 = r2.A01;
            String string = r2.A0H.getContext().getString(R.string.str017d);
            C18450wi.A0B(string);
            TextEmojiLabel textEmojiLabel = r2.A02;
            C19980zJ r4 = r2.A00;
            AnonymousClass01V r7 = r2.A03;
            C18450wi.A0H(textEmojiLabel, 4);
            C45922Bq.A08(textEmojiLabel.getContext(), parse, r4, r5, textEmojiLabel, r7, string);
        } else if (this instanceof C71683ks) {
            C18450wi.A0H(obj, 0);
            AnonymousClass3OY r22 = ((C71683ks) this).A00;
            String string2 = r22.getResources().getString(R.string.str017e);
            C18450wi.A0B(string2);
            r22.setSearchHint(string2);
            C13680ns.A1A(r22, obj, 47);
        } else if (this instanceof C71703ku) {
            C71703ku r3 = (C71703ku) this;
            C71823l6 r102 = (C71823l6) obj;
            int i4 = r102.A00;
            if (i4 != 1) {
                int i5 = R.string.str1665;
                if (i4 != 2) {
                    i5 = R.string.str14ab;
                }
                r3.A01.setText(i5);
                WaTextView waTextView = r3.A00;
                waTextView.setText(R.string.str1831);
                waTextView.setVisibility(0);
                AnonymousClass00B.A06(r102.A01);
                C13680ns.A1A(waTextView, r102, 46);
                return;
            }
            r3.A01.setText(R.string.str14aa);
            r3.A00.setVisibility(8);
        } else if (this instanceof C71723kw) {
            C71723kw r52 = (C71723kw) this;
            C71793l3 r103 = (C71793l3) obj;
            C18450wi.A0H(r103, 0);
            TextView textView = r52.A04;
            textView.setText(r103.A01);
            Integer num = r103.A00;
            if (num == null || num.intValue() == 0) {
                r52.A03.setVisibility(8);
            } else {
                TextView textView2 = r52.A03;
                textView2.setVisibility(0);
                String format = String.format(C13690nt.A0m(r52.A05), "%,d", Arrays.copyOf(new Object[]{num}, 1));
                C18450wi.A0B(format);
                textView2.setText(format);
            }
            r103.A04.AIV(r52.A02, r103.A02);
            C13680ns.A1A(r52.A00, r103, 45);
            boolean A0T = r52.A05.A0T();
            ImageView imageView = r52.A01;
            if (A0T) {
                imageView.setScaleX(-1.0f);
                i2 = 5;
            } else {
                imageView.setScaleY(1.0f);
                i2 = 3;
            }
            textView.setGravity(i2);
        }
    }
}
