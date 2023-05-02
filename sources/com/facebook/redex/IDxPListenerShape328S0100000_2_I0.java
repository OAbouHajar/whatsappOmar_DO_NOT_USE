package com.facebook.redex;

import X.AnonymousClass2PI;
import android.media.MediaPlayer;
import com.obwhatsapp.search.views.itemviews.MessageGifVideoPlayer;

public class IDxPListenerShape328S0100000_2_I0 implements MediaPlayer.OnPreparedListener {
    public Object A00;
    public final int A01;

    public IDxPListenerShape328S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        if (this.A01 != 0) {
            AnonymousClass2PI r2 = (AnonymousClass2PI) this.A00;
            r2.A00 = 2;
            if (r2.A0G) {
                mediaPlayer.setVolume(0.0f, 0.0f);
            }
            if (r2.A0F) {
                mediaPlayer.setLooping(true);
            }
            r2.A0E = true;
            r2.A0D = true;
            r2.A0C = true;
            int i2 = r2.A02;
            if (i2 >= 0) {
                r2.seekTo(i2);
            }
            if (r2.A03 == 3) {
                r2.start();
            }
            MediaPlayer.OnPreparedListener onPreparedListener = r2.A08;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(mediaPlayer);
                return;
            }
            return;
        }
        MessageGifVideoPlayer messageGifVideoPlayer = (MessageGifVideoPlayer) this.A00;
        messageGifVideoPlayer.A0C = true;
        messageGifVideoPlayer.A02();
    }
}
