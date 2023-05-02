package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.R;
import com.obwhatsapp.profile.ViewProfilePhoto;

/* renamed from: X.3Lq  reason: invalid class name and case insensitive filesystem */
public class C63823Lq extends Handler {
    public final /* synthetic */ ViewProfilePhoto A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63823Lq(Looper looper, ViewProfilePhoto viewProfilePhoto) {
        super(looper);
        this.A00 = viewProfilePhoto;
    }

    public void handleMessage(Message message) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        C14870pt r2 = viewProfilePhoto.A05;
        boolean A0J = viewProfilePhoto.A0A.A0J();
        int i2 = R.string.str08d7;
        if (A0J) {
            i2 = R.string.str08d4;
        }
        r2.A09(i2, 0);
        viewProfilePhoto.findViewById(R.id.progress_bar).setVisibility(8);
    }
}
