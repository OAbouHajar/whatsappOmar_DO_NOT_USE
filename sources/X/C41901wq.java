package X;

import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.1wq  reason: invalid class name and case insensitive filesystem */
public class C41901wq extends MediaMetadataRetriever implements Closeable {
    public void close() {
        try {
            release();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
