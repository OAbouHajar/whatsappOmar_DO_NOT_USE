package X;

import android.widget.CompoundButton;
import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.5z4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5z4 implements AnonymousClass023 {
    public final /* synthetic */ RadioGroup.OnCheckedChangeListener A00;
    public final /* synthetic */ RadioGroup A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ int[] A03;

    public /* synthetic */ AnonymousClass5z4(RadioGroup.OnCheckedChangeListener onCheckedChangeListener, RadioGroup radioGroup, List list, int[] iArr) {
        this.A01 = radioGroup;
        this.A03 = iArr;
        this.A02 = list;
        this.A00 = onCheckedChangeListener;
    }

    public final void AOH(Object obj) {
        RadioGroup radioGroup = this.A01;
        int[] iArr = this.A03;
        List list = this.A02;
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.A00;
        int A0D = AnonymousClass000.A0D(C004601z.A0E(radioGroup, radioGroup.getCheckedRadioButtonId()).getTag());
        int intValue = ((Number) obj).intValue();
        if (intValue != A0D) {
            radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
            for (int i2 = 0; i2 < iArr.length; i2++) {
                if (iArr[i2] == intValue) {
                    ((CompoundButton) list.get(i2)).setChecked(true);
                }
            }
            radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
        }
    }
}
