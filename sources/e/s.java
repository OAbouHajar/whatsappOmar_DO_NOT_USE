package e;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.exifinterface.media.ExifInterface;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;
import okio.Okio;

/* compiled from: XFMFile */
public final class s extends l {
    public s(Context context) {
        super(context, 0);
    }

    public final boolean canHandleRequest(Request request) {
        return "file".equals(request.uri.getScheme());
    }

    public final RequestHandler.Result load(Request request, int i2) {
        return new RequestHandler.Result((Bitmap) null, Okio.source(e(request)), Picasso.LoadedFrom.DISK, new ExifInterface(request.uri.getPath()).getAttributeInt("Orientation", 1));
    }
}
