package com.obwhatsapp.text;

import X.AnonymousClass000;
import X.C13690nt;
import X.C13700nu;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxCSpanShape14S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.apache.commons.io.IOUtils;

public class SeeMoreTextView extends WaTextView {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = false;
    public final Paint A04 = C13700nu.A05();

    public SeeMoreTextView(Context context) {
        super(context);
        A0A();
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A0A();
    }

    public SeeMoreTextView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A0A();
    }

    public static void A02(Paint paint, String str, ArrayList arrayList, ArrayList arrayList2, int i2) {
        arrayList2.add(str);
        if (paint.measureText(TextUtils.join(" ", arrayList2)) >= ((float) i2)) {
            arrayList2.remove(arrayList2.size() - 1);
            arrayList.add(TextUtils.join(" ", arrayList2));
            arrayList2.clear();
            arrayList2.add(str);
        }
    }

    public final void A0A() {
        this.A00 = getContext().getString(R.string.str14be);
        this.A02 = getContext().getString(R.string.str14bf);
        this.A01 = C13690nt.A0b(this);
        Paint paint = this.A04;
        paint.setTextSize(getTextSize());
        paint.setTypeface(getTypeface());
    }

    public void onMeasure(int i2, int i3) {
        int size;
        SpannableStringBuilder A0F;
        ArrayList arrayList;
        int i4 = i2;
        if (!this.A03 && (size = View.MeasureSpec.getSize(i4) - (getPaddingLeft() + getPaddingRight())) > 0) {
            String A0b = C13690nt.A0b(this);
            String A0b2 = C13690nt.A0b(this);
            ArrayList A0u = AnonymousClass000.A0u();
            ArrayList A0u2 = AnonymousClass000.A0u();
            for (String str : A0b2.split("\\s")) {
                Paint paint = this.A04;
                float f2 = (float) size;
                if (paint.measureText(str) < f2) {
                    A02(paint, str, A0u, A0u2, size);
                } else {
                    if (!TextUtils.isEmpty(str) && paint.measureText(str) > f2) {
                        ArrayList A0u3 = AnonymousClass000.A0u();
                        int i5 = 0;
                        int i6 = 1;
                        while (true) {
                            int length = str.length();
                            if (i6 > length) {
                                arrayList = A0u3;
                                break;
                            }
                            if (paint.measureText(str.substring(i5, i6)) >= f2) {
                                int i7 = i6 - 1;
                                A0u3.add(str.substring(i5, i7));
                                i5 = i7;
                            }
                            if (i6 == length) {
                                A0u3.add(str.substring(i5, i6));
                            }
                            i6++;
                        }
                    } else {
                        arrayList = Collections.singletonList(str);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        A02(paint, AnonymousClass000.A0m(it), A0u, A0u2, size);
                    }
                }
            }
            if (!A0u2.isEmpty()) {
                A0u.add(TextUtils.join(" ", A0u2));
            }
            if (A0u.size() > 3) {
                if (A0u.size() <= 3) {
                    A0F = C13690nt.A0F(TextUtils.join(IOUtils.LINE_SEPARATOR_UNIX, A0u));
                } else {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append(this.A00);
                    String A0h = AnonymousClass000.A0h(this.A02, A0o);
                    StringBuilder A0o2 = AnonymousClass000.A0o();
                    int i8 = 0;
                    while (true) {
                        String str2 = (String) A0u.get(i8);
                        if (i8 != 2) {
                            A0o2.append(str2);
                            A0o2.append(IOUtils.LINE_SEPARATOR_UNIX);
                            i8++;
                            if (i8 >= 3) {
                                break;
                            }
                        } else {
                            A0o2.append(str2.subSequence(0, Math.max(0, str2.length() - A0h.length())));
                            A0o2.append(A0h);
                            break;
                        }
                    }
                    String obj = A0o2.toString();
                    A0F = C13690nt.A0F(obj);
                    A0F.setSpan(new IDxCSpanShape14S0100000_2_I1(this, 3), obj.indexOf(A0h), obj.length(), 0);
                }
                if (!A0b.equals(A0F.toString())) {
                    setMovementMethod(LinkMovementMethod.getInstance());
                    super.setText(A0F, TextView.BufferType.SPANNABLE);
                }
            } else {
                String join = TextUtils.join(IOUtils.LINE_SEPARATOR_UNIX, A0u);
                if (!A0b.equals(join)) {
                    super.setText(join);
                }
            }
        }
        super.onMeasure(i4, i3);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.A03 = bundle.getBoolean("is_expanded");
            String string = bundle.getString("original_text");
            if (string == null) {
                string = "";
            }
            this.A01 = string;
            parcelable = bundle.getParcelable("super_state");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("super_state", super.onSaveInstanceState());
        A0D.putBoolean("is_expanded", this.A03);
        A0D.putString("original_text", this.A01);
        return A0D;
    }

    public void setText(String str) {
        this.A01 = str;
        super.setText(str);
    }
}
