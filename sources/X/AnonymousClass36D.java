package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.documentpicker.DocumentPreviewActivity;
import com.obwhatsapp.mediaview.PhotoView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.36D  reason: invalid class name */
public final class AnonymousClass36D extends C16690tT {
    public final C18820xJ A00;
    public final File A01;
    public final String A02;
    public final WeakReference A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass36D(C001300o r2, C107995Mg r3, C18820xJ r4, File file, String str) {
        super(r2, true);
        C18450wi.A0H(r4, 5);
        this.A01 = file;
        this.A02 = str;
        this.A00 = r4;
        this.A03 = C13690nt.A0h(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Resources A002;
        int i2;
        C18820xJ r4 = this.A00;
        String str = this.A02;
        File file = this.A01;
        if (C18820xJ.A07(str) || AnonymousClass1A9.A0T(str)) {
            A002 = C16980tz.A00(r4.A00);
            i2 = R.dimen.dimen031f;
        } else {
            A002 = C16980tz.A00(r4.A00);
            i2 = R.dimen.dimen0320;
        }
        byte[] A0A = r4.A0A(file, str, A002.getDimension(i2));
        if (A0A == null || C16690tT.A02(this)) {
            return null;
        }
        return AnonymousClass25U.A00(new BitmapFactory.Options(), A0A, 2000);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C107995Mg r4 = (C107995Mg) this.A03.get();
        if (r4 != null) {
            File file = this.A01;
            String str = this.A02;
            DocumentPreviewActivity documentPreviewActivity = (DocumentPreviewActivity) r4;
            documentPreviewActivity.A01.setVisibility(8);
            documentPreviewActivity.A03.setVisibility(8);
            if (bitmap == null) {
                documentPreviewActivity.A39(file, str);
                return;
            }
            documentPreviewActivity.getLayoutInflater().inflate(R.layout.layout023c, documentPreviewActivity.A02, true);
            PhotoView photoView = (PhotoView) C004601z.A0E(documentPreviewActivity.A02, R.id.document_preview);
            photoView.A06(bitmap);
            boolean z2 = documentPreviewActivity.A0N;
            int i2 = R.dimen.dimen051d;
            if (z2) {
                i2 = R.dimen.dimen057f;
            }
            int dimensionPixelOffset = photoView.getResources().getDimensionPixelOffset(i2);
            ViewGroup.MarginLayoutParams A0O = AnonymousClass000.A0O(photoView);
            A0O.bottomMargin = dimensionPixelOffset;
            photoView.setLayoutParams(A0O);
        }
    }
}
