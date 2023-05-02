package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5fE  reason: invalid class name and case insensitive filesystem */
public abstract class C111035fE extends C005602k {
    public C111035fE(View view) {
        super(view);
    }

    public void A07(C116245r4 r9, int i2) {
        String A0d;
        View.OnClickListener onClickListener;
        Button button;
        if (this instanceof C113365lv) {
            ((C113365lv) this).A00.setText(((C113785mc) r9).A00);
        } else if (this instanceof C113405lz) {
            throw AnonymousClass000.A0W("title");
        } else {
            if (this instanceof C113415m1) {
                C113415m1 r4 = (C113415m1) this;
                C113965mu r92 = (C113965mu) r9;
                r4.A01.setImageDrawable(AnonymousClass2SR.A02(r4.A0H.getContext(), r92.A00, r92.A01));
                r4.A02.setText(r92.A04);
                Button button2 = r4.A00;
                button2.setText(r92.A03);
                onClickListener = r92.A02;
                button = button2;
            } else if (this instanceof AnonymousClass5m0) {
                AnonymousClass5m0 r2 = (AnonymousClass5m0) this;
                C113905mo r93 = (C113905mo) r9;
                r2.A01.setText(r93.A00);
                r2.A02.setText(r93.A01);
                r2.A00.setVisibility(0);
                return;
            } else if (this instanceof C113395ly) {
                C113395ly r3 = (C113395ly) this;
                r3.A01.setText(((C113805me) r9).A00);
                AnonymousClass2SR.A07(r3.A0H.getContext(), r3.A00, R.color.color0226);
                return;
            } else if (this instanceof C113425m2) {
                C113425m2 r7 = (C113425m2) this;
                C113995mx r94 = (C113995mx) r9;
                byte[] bArr = r94.A09;
                if (bArr != null) {
                    r7.A01.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                }
                r7.A04.setText((CharSequence) C110105dW.A0d(r94.A03));
                String str = r94.A04;
                if (str != null) {
                    r7.A03.setText(str);
                }
                TextView textView = r7.A03;
                int i3 = 0;
                if (r94.A04 == null) {
                    i3 = 8;
                }
                textView.setVisibility(i3);
                if (r94.A08) {
                    LinearLayout linearLayout = r7.A02;
                    linearLayout.setVisibility(0);
                    ImageView A0J = C13680ns.A0J(linearLayout, R.id.warning_icon);
                    TextView A0L = C13680ns.A0L(linearLayout, R.id.warning_message);
                    A0J.setImageDrawable(AnonymousClass2SR.A02(r7.A0H.getContext(), r94.A00, r94.A01));
                    A0L.setText(r94.A06);
                    if (r94.A07) {
                        Button button3 = r7.A00;
                        button3.setVisibility(0);
                        button3.setText(r94.A05);
                        onClickListener = r94.A02;
                        button = button3;
                    } else {
                        r7.A00.setVisibility(8);
                        return;
                    }
                } else {
                    r7.A02.setVisibility(8);
                    return;
                }
            } else if (this instanceof C113345lt) {
                return;
            } else {
                if (this instanceof C113385lx) {
                    C113385lx r22 = (C113385lx) this;
                    C113715mV r95 = (C113715mV) r9;
                    r22.A01.setText(r95.A02);
                    r22.A00.A0G(Html.fromHtml(r95.A01));
                    View view = r22.A0H;
                    onClickListener = r95.A00;
                    button = view;
                } else if (this instanceof C113355lu) {
                    C113355lu r23 = (C113355lu) this;
                    C113705mU r96 = (C113705mU) r9;
                    r23.A0H.setOnClickListener(r96.A00);
                    boolean isEmpty = TextUtils.isEmpty(r96.A02);
                    TextView textView2 = r23.A00;
                    if (isEmpty) {
                        A0d = r96.A01;
                    } else {
                        Context context = textView2.getContext();
                        Object[] A1Z = C13690nt.A1Z();
                        A1Z[0] = r96.A01;
                        A0d = C13680ns.A0d(context, r96.A02, A1Z, 1, R.string.str1935);
                    }
                    textView2.setText(A0d);
                    return;
                } else {
                    C113375lw r5 = (C113375lw) this;
                    C113935mr r97 = (C113935mr) r9;
                    ImageView imageView = r5.A00;
                    View view2 = r5.A0H;
                    imageView.setImageDrawable(AnonymousClass2SR.A02(view2.getContext(), r97.A00, r97.A01));
                    r5.A01.setText(r97.A03);
                    view2.setOnClickListener(r97.A02);
                    return;
                }
            }
            button.setOnClickListener(onClickListener);
        }
    }
}
