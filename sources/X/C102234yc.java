package X;

import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1;
import java.io.File;

/* renamed from: X.4yc  reason: invalid class name and case insensitive filesystem */
public class C102234yc implements AnonymousClass20R {
    public final /* synthetic */ ViewOnClickCListenerShape1S0100000_I0_1 A00;

    public C102234yc(ViewOnClickCListenerShape1S0100000_I0_1 viewOnClickCListenerShape1S0100000_I0_1) {
        this.A00 = viewOnClickCListenerShape1S0100000_I0_1;
    }

    public void AQu(Exception exc) {
    }

    public void ARL(File file, String str, byte[] bArr) {
        SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00.A00;
        sharedTextPreviewDialogFragment.A0F.setImageProgressBarVisibility(false);
        sharedTextPreviewDialogFragment.A0F.setImageThumbVisibility(true);
        if (file == null) {
            Log.e("sharedtextpreviewdialogfragment/gif-preview/file is null");
        } else {
            sharedTextPreviewDialogFragment.startActivityForResult(AnonymousClass384.A00(sharedTextPreviewDialogFragment.A0C(), sharedTextPreviewDialogFragment.A0D, (C16740tZ) null, file, sharedTextPreviewDialogFragment.A0G), 27);
        }
    }
}
