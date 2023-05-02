package X;

import android.content.ContentValues;
import com.whatsapp.util.Log;

/* renamed from: X.1z0  reason: invalid class name */
public class AnonymousClass1z0 {
    public final C209912j A00;
    public final boolean A01;

    public AnonymousClass1z0(C209912j r1, boolean z2) {
        this.A00 = r1;
        this.A01 = z2;
    }

    public void A00(C34151jm r7) {
        if (r7.A0D == null) {
            Log.e("RecentStickerDBStorage/updateSticker/sticker filehash is null, could not be updated");
            return;
        }
        C16800tf A02 = this.A00.A02();
        int i2 = 1;
        try {
            String[] strArr = {r7.A0D};
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", r7.A0G);
            contentValues.put("enc_hash", r7.A08);
            contentValues.put("direct_path", r7.A06);
            contentValues.put("mimetype", r7.A0C);
            contentValues.put("media_key", r7.A0B);
            contentValues.put("file_size", Integer.valueOf(r7.A00));
            contentValues.put("width", Integer.valueOf(r7.A03));
            contentValues.put("height", Integer.valueOf(r7.A02));
            contentValues.put("emojis", r7.A07);
            if (!r7.A0I) {
                i2 = 0;
            }
            contentValues.put("is_first_party", Integer.valueOf(i2));
            A02.A02.A00("recent_stickers", contentValues, "plaintext_hash = ?", strArr);
            A02.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
