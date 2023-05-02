package X;

import android.content.Intent;
import com.obwhatsapp.R;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;

/* renamed from: X.3xv  reason: invalid class name and case insensitive filesystem */
public class C78373xv extends C41781we {
    public final /* synthetic */ AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;

    public C78373xv(AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment) {
        this.A00 = addStickerPackDialogFragment;
    }

    public void A07(String str, String str2) {
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
        if (str.equals(addStickerPackDialogFragment.A02) && str2.equals(addStickerPackDialogFragment.A03)) {
            Object[] A1Z = C13690nt.A1Z();
            A1Z[0] = addStickerPackDialogFragment.A04;
            addStickerPackDialogFragment.A00.A0N(C13690nt.A0c(addStickerPackDialogFragment, addStickerPackDialogFragment.A0J(R.string.str1cf7), A1Z, 1, R.string.str16e6), 1);
            C001000l A0C = addStickerPackDialogFragment.A0C();
            if (A0C != null) {
                Intent A09 = C13680ns.A09();
                A09.putExtra("add_successful", true);
                A0C.setResult(-1, A09);
                addStickerPackDialogFragment.A1D();
            }
        }
    }
}
