package e;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import okio.Okio;

/* compiled from: XFMFile */
public class l extends RequestHandler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1677a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f1678b;

    public /* synthetic */ l(Context context, int i2) {
        this.f1677a = i2;
        this.f1678b = context;
    }

    public boolean canHandleRequest(Request request) {
        switch (this.f1677a) {
            case 0:
                return "content".equals(request.uri.getScheme());
            default:
                if (request.resourceId != 0) {
                    return true;
                }
                return "android.resource".equals(request.uri.getScheme());
        }
    }

    public final InputStream e(Request request) {
        return this.f1678b.getContentResolver().openInputStream(request.uri);
    }

    public RequestHandler.Result load(Request request, int i2) {
        Resources resources;
        Uri uri;
        int i3;
        Uri uri2;
        switch (this.f1677a) {
            case 0:
                return new RequestHandler.Result(Okio.source(e(request)), Picasso.LoadedFrom.DISK);
            default:
                StringBuilder sb = o0.f1699a;
                int i4 = request.resourceId;
                Context context = this.f1678b;
                if (i4 != 0 || (uri2 = request.uri) == null) {
                    resources = context.getResources();
                } else {
                    String authority = uri2.getAuthority();
                    if (authority != null) {
                        try {
                            resources = context.getPackageManager().getResourcesForApplication(authority);
                        } catch (PackageManager.NameNotFoundException unused) {
                            throw new FileNotFoundException("Unable to obtain resources for package: " + request.uri);
                        }
                    } else {
                        throw new FileNotFoundException("No package provided: " + request.uri);
                    }
                }
                int i5 = request.resourceId;
                boolean z2 = true;
                if (i5 == 0 && (uri = request.uri) != null) {
                    String authority2 = uri.getAuthority();
                    if (authority2 != null) {
                        List<String> pathSegments = request.uri.getPathSegments();
                        if (pathSegments == null || pathSegments.isEmpty()) {
                            throw new FileNotFoundException("No path segments: " + request.uri);
                        }
                        if (pathSegments.size() == 1) {
                            try {
                                i3 = Integer.parseInt(pathSegments.get(0));
                            } catch (NumberFormatException unused2) {
                                throw new FileNotFoundException("Last path segment is not a resource ID: " + request.uri);
                            }
                        } else if (pathSegments.size() == 2) {
                            i3 = resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority2);
                        } else {
                            throw new FileNotFoundException("More than two path segments: " + request.uri);
                        }
                        i5 = i3;
                    } else {
                        throw new FileNotFoundException("No package provided: " + request.uri);
                    }
                }
                BitmapFactory.Options b2 = RequestHandler.b(request);
                if (b2 == null || !b2.inJustDecodeBounds) {
                    z2 = false;
                }
                if (z2) {
                    BitmapFactory.decodeResource(resources, i5, b2);
                    RequestHandler.a(request.targetWidth, request.targetHeight, b2.outWidth, b2.outHeight, b2, request);
                }
                return new RequestHandler.Result(BitmapFactory.decodeResource(resources, i5, b2), Picasso.LoadedFrom.DISK);
        }
    }
}
