package X;

import android.content.Intent;
import android.provider.MediaStore;

/* renamed from: X.5EO  reason: invalid class name */
public final class AnonymousClass5EO extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ int $mediaType;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EO(int i2) {
        super(0);
        this.$mediaType = i2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Video.Media.INTERNAL_CONTENT_URI);
        int i2 = this.$mediaType;
        intent.setType(i2 != 2 ? i2 != 4 ? "image/*" : "video/*" : "image/gif");
        return intent;
    }
}
