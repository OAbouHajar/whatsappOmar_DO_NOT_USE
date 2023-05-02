package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.audiopicker.AudioPickerActivity;

/* renamed from: X.4yU  reason: invalid class name and case insensitive filesystem */
public class C102154yU implements AnonymousClass2OW {
    public final /* synthetic */ C615739l A00;

    public C102154yU(C615739l r1) {
        this.A00 = r1;
    }

    public void A5K() {
        C615739l r0 = this.A00;
        ImageView imageView = r0.A05;
        imageView.setImageBitmap((Bitmap) null);
        r0.A03.setBackground((Drawable) null);
        imageView.setBackgroundResource(0);
    }

    public /* synthetic */ void AQs() {
    }

    public void AY3(Bitmap bitmap, boolean z2) {
        Resources resources;
        int i2;
        C615739l r2 = this.A00;
        ImageView imageView = r2.A05;
        imageView.setImageBitmap(bitmap);
        if (bitmap == C43201zV.A07) {
            r2.A03.setBackground((Drawable) null);
            resources = r2.A0C.getResources();
            i2 = R.drawable.audio_picker_empty_thumb_background;
        } else {
            FrameLayout frameLayout = r2.A03;
            AudioPickerActivity audioPickerActivity = r2.A0C;
            frameLayout.setBackground(audioPickerActivity.getResources().getDrawable(R.drawable.audio_picker_thumb_frame_background));
            resources = audioPickerActivity.getResources();
            i2 = R.drawable.audio_picker_filled_thumb_background;
        }
        imageView.setBackground(resources.getDrawable(i2));
    }
}
