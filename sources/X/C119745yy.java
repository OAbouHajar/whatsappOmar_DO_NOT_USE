package X;

import android.widget.CompoundButton;
import com.google.android.material.chip.Chip;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.PaymentTransactionHistoryActivity;
import com.obwhatsapp.payments.ui.widget.MultiExclusionChip;
import com.obwhatsapp.payments.ui.widget.MultiExclusionChipGroup;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5yy  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119745yy implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ MultiExclusionChip A00;
    public final /* synthetic */ MultiExclusionChipGroup A01;

    public /* synthetic */ C119745yy(MultiExclusionChip multiExclusionChip, MultiExclusionChipGroup multiExclusionChipGroup) {
        this.A01 = multiExclusionChipGroup;
        this.A00 = multiExclusionChip;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        MultiExclusionChipGroup multiExclusionChipGroup = this.A01;
        MultiExclusionChip multiExclusionChip = this.A00;
        Map map = multiExclusionChipGroup.A02;
        if (map.containsKey(multiExclusionChip)) {
            boolean isChecked = multiExclusionChip.isChecked();
            int i2 = R.dimen.dimen05f3;
            if (isChecked) {
                i2 = R.dimen.dimen05f0;
            }
            multiExclusionChip.setChipStrokeWidthResource(i2);
            boolean isChecked2 = multiExclusionChip.isChecked();
            int i3 = R.dimen.dimen05f4;
            if (isChecked2) {
                i3 = R.dimen.dimen05f1;
            }
            multiExclusionChip.setTextStartPaddingResource(i3);
            List list = (List) map.get(multiExclusionChip);
            if (list != null) {
                for (int i4 = 0; i4 < list.size(); i4++) {
                    Chip chip = (Chip) list.get(i4);
                    if (chip != multiExclusionChip) {
                        chip.setClickable(!multiExclusionChip.isChecked());
                        chip.setCheckable(!multiExclusionChip.isChecked());
                        int i5 = 0;
                        if (multiExclusionChip.isChecked()) {
                            i5 = 8;
                        }
                        chip.setVisibility(i5);
                    }
                }
            }
        }
        Set set = multiExclusionChipGroup.A03;
        if (z2) {
            set.add(multiExclusionChip);
        } else {
            set.remove(multiExclusionChip);
        }
        AnonymousClass684 r0 = multiExclusionChipGroup.A00;
        if (r0 != null) {
            AnonymousClass62K r02 = (AnonymousClass62K) r0;
            PaymentTransactionHistoryActivity paymentTransactionHistoryActivity = r02.A00;
            MultiExclusionChip multiExclusionChip2 = r02.A01;
            MultiExclusionChip multiExclusionChip3 = r02.A02;
            MultiExclusionChip multiExclusionChip4 = r02.A03;
            MultiExclusionChip multiExclusionChip5 = r02.A04;
            if (paymentTransactionHistoryActivity.A0T) {
                C39961tL r1 = paymentTransactionHistoryActivity.A0W;
                r1.A06 = set.contains(multiExclusionChip2);
                if (set.contains(multiExclusionChip3)) {
                    r1.A00 = new C39971tM();
                }
            }
            if (paymentTransactionHistoryActivity.A0O) {
                C39961tL r12 = paymentTransactionHistoryActivity.A0W;
                r12.A02 = set.contains(multiExclusionChip4);
                r12.A03 = set.contains(multiExclusionChip5);
            }
            paymentTransactionHistoryActivity.A36();
        }
    }
}
