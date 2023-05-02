package X;

import com.obwhatsapp.picker.search.PickerSearchDialogFragment;
import com.obwhatsapp.picker.search.StickerSearchDialogFragment;
import com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment;
import java.util.List;

/* renamed from: X.3H7  reason: invalid class name */
public class AnonymousClass3H7 implements AnonymousClass5QT, C108745Pe {
    public C47572Jn A00;
    public C108745Pe A01;
    public AnonymousClass1yX A02;
    public PickerSearchDialogFragment A03;
    public AnonymousClass5QT A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public final C41791wf A08;

    public AnonymousClass3H7(C41791wf r1) {
        this.A08 = r1;
    }

    public AnonymousClass1MF A00() {
        AnonymousClass39R r0;
        C47572Jn r02 = this.A00;
        if (r02 == null || (r0 = r02.A0D) == null) {
            return null;
        }
        return r0.A0A;
    }

    public void A01() {
        C47572Jn r1 = this.A00;
        if (r1 != null) {
            r1.A03 = null;
            this.A00 = null;
        }
        this.A02 = null;
        this.A01 = null;
        this.A04 = null;
        this.A03 = null;
    }

    public void A02(PickerSearchDialogFragment pickerSearchDialogFragment) {
        this.A07 = true;
        this.A03 = pickerSearchDialogFragment;
        pickerSearchDialogFragment.A00 = this;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            this.A08.A00 = this;
        }
        if (pickerSearchDialogFragment instanceof ExpressionsSearchDialogFragment) {
            this.A08.A00 = this;
        }
    }

    public void A03(List list) {
        this.A05 = list;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment instanceof StickerSearchDialogFragment) {
            ((StickerSearchDialogFragment) pickerSearchDialogFragment).A09.A00.A0B(list);
        } else if (pickerSearchDialogFragment instanceof ExpressionsSearchDialogFragment) {
            ((ExpressionsSearchDialogFragment) pickerSearchDialogFragment).A1P(list);
        }
    }

    public void A04(boolean z2) {
        this.A06 = z2;
        PickerSearchDialogFragment pickerSearchDialogFragment = this.A03;
        if (pickerSearchDialogFragment != null) {
            pickerSearchDialogFragment.A1M();
        }
    }

    public void ARt(C93544jN r2) {
        C108745Pe r0 = this.A01;
        if (r0 != null) {
            r0.ARt(r2);
        }
    }

    public void AXt(C34151jm r4, Integer num, int i2) {
        AnonymousClass5QT r0 = this.A04;
        if (r0 != null) {
            r0.AXt(r4, num, i2);
            C47572Jn r02 = this.A00;
            if (r02 != null && r02.A0E.A0E(C16620tM.A02, 2023)) {
                this.A00.A06();
            }
        }
    }
}
