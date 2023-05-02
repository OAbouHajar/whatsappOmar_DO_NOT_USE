package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.obwhatsapp.status.playback.widget.StatusEditText;
import java.util.ArrayList;
import java.util.regex.Matcher;

/* renamed from: X.1wJ  reason: invalid class name and case insensitive filesystem */
public class C41641wJ extends C41651wK {
    public final /* synthetic */ C41661wL A00;

    public C41641wJ(C41661wL r1) {
        this.A00 = r1;
    }

    public void afterTextChanged(Editable editable) {
        Editable editable2 = editable;
        for (UnderlineSpan removeSpan : (UnderlineSpan[]) editable2.getSpans(0, editable2.length(), UnderlineSpan.class)) {
            editable2.removeSpan(removeSpan);
        }
        C41661wL r3 = this.A00;
        StatusEditText statusEditText = r3.A0J;
        C45922Bq.A07(statusEditText.getContext(), statusEditText.getPaint(), editable2, r3.A0B, r3.A0C, r3.A0F, 1.1f);
        String obj = editable2.toString();
        r3.A0L.A06.A01(obj);
        boolean z2 = false;
        if (TextUtils.getTrimmedLength(obj) > 0) {
            z2 = true;
        }
        if (r3.A0H.A00() && z2 && !r3.A04) {
            C27701Su r5 = r3.A0I.A0D;
            if (r5.A04.A00()) {
                C47462Jb A01 = r5.A01();
                A01.A03 = 17;
                AnonymousClass2JY r2 = r5.A05;
                A01.A02 = r2.A01;
                A01.A01 = r2.A00;
                r5.A02.A05(A01);
            }
            r3.A04 = true;
        }
        String A012 = C30931dC.A01(obj);
        int length = obj.length();
        r3.A08.A0B(Integer.valueOf(C47622Js.A02(obj, 0, length)));
        if (!r3.A05) {
            C41681wN r8 = r3.A0A;
            C50262Yq r52 = r3.A01;
            if (r52 == null) {
                r52 = new C50262Yq(r3.A09, r3.A0G);
                r3.A01 = r52;
            }
            r8.A05(editable2, r52, true);
        }
        int length2 = editable2.length();
        int A013 = C31011dK.A01(editable2, 0, length2) + (C41661wL.A00(editable2, 0, length2) * 49);
        int i2 = 700;
        if (A012 != null && !A012.equals(r3.A03) && !r3.A05) {
            i2 = 350;
        }
        if (A013 >= i2 && r3.A00 == 0) {
            int inputType = statusEditText.getInputType();
            r3.A00 = inputType;
            if (inputType != 0) {
                statusEditText.setInputType(inputType | AccessibilityEventCompat.TYPE_GESTURE_DETECTION_END);
                statusEditText.setText(obj);
                statusEditText.setCursorPosition(length);
            }
        }
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(obj)) {
            Matcher matcher = C30931dC.A01.matcher(length > 4096 ? obj.substring(0, 4096) : obj);
            while (matcher.find()) {
                Pair A002 = C30931dC.A00(obj, matcher.start(), matcher.end());
                if (A002 != null) {
                    String substring = obj.substring(((Number) A002.first).intValue(), ((Number) A002.second).intValue());
                    String[] strArr = C30931dC.A03;
                    int length3 = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        String str = strArr[i3];
                        if (substring.regionMatches(true, 0, str, 0, str.length())) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!arrayList.contains(A002)) {
                                arrayList.add(A002);
                            }
                        } else {
                            i3++;
                        }
                    }
                }
            }
        }
        if (A012 != null && arrayList != null && arrayList.size() > 0 && statusEditText.getText() != null) {
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                int length4 = statusEditText.getText().length();
                if (((Number) ((Pair) arrayList.get(i4)).first).intValue() < length4 && ((Number) ((Pair) arrayList.get(i4)).second).intValue() < length4) {
                    statusEditText.getText().setSpan(new UnderlineSpan(), ((Number) ((Pair) arrayList.get(i4)).first).intValue(), ((Number) ((Pair) arrayList.get(i4)).second).intValue(), 33);
                }
            }
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        int codePointCount;
        C41661wL r3 = this.A00;
        r3.A0E.A00(C34771kq.A00);
        C41681wN r4 = r3.A0A;
        boolean z2 = false;
        if (i4 > i3 && ((codePointCount = Character.codePointCount(charSequence, i2, i4 + i2)) > 1 || (codePointCount == 1 && Character.isWhitespace(Character.codePointAt(charSequence, i2))))) {
            z2 = true;
        }
        r4.A07 = z2;
        StatusEditText statusEditText = r3.A0J;
        if (statusEditText.getText() != null && i2 + i4 == statusEditText.getText().length()) {
            r3.A07.post(new RunnableRunnableShape15S0100000_I0_14(this, 34));
        }
    }
}
