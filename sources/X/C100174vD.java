package X;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.obwhatsapp.R;
import com.obwhatsapp.chatinfo.ContactInfoActivity;

/* renamed from: X.4vD  reason: invalid class name and case insensitive filesystem */
public final class C100174vD implements C38431qm {
    public /* bridge */ /* synthetic */ void AMd(AnonymousClass5TC r1) {
    }

    public /* bridge */ /* synthetic */ void ASn(AnonymousClass5TC r1) {
    }

    public /* bridge */ /* synthetic */ void ASt(AnonymousClass5TC r1) {
    }

    public /* bridge */ /* synthetic */ void ASx(Bitmap bitmap, AnonymousClass5TC r9, boolean z2) {
        AnonymousClass2Xz r6 = ((C100194vF) r9).A02.A00;
        ContactInfoActivity contactInfoActivity = r6.A0d;
        ((C49662Uu) contactInfoActivity.findViewById(R.id.content)).A0C(bitmap);
        AnonymousClass0QR r5 = new AnonymousClass0QR(bitmap);
        new C02290As(r5, new C95364mW(contactInfoActivity)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{r5.A01});
        r6.A0M = null;
    }
}
