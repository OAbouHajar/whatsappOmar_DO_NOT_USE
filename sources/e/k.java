package e;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.Request;
import com.squareup.picasso.RequestHandler;

/* compiled from: XFMFile */
public final class k extends RequestHandler {

    /* renamed from: b  reason: collision with root package name */
    public static final UriMatcher f1671b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f1672a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f1671b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    public k(Context context) {
        this.f1672a = context;
    }

    public final boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f1671b.match(request.uri) != -1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r5, int r6) {
        /*
            r4 = this;
            android.content.Context r6 = r4.f1672a
            android.content.ContentResolver r6 = r6.getContentResolver()
            android.net.Uri r5 = r5.uri
            android.content.UriMatcher r0 = f1671b
            int r0 = r0.match(r5)
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x0035
            r3 = 2
            if (r0 == r3) goto L_0x0030
            r3 = 3
            if (r0 == r3) goto L_0x003d
            r2 = 4
            if (r0 != r2) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid uri: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x0030:
            java.io.InputStream r5 = r6.openInputStream(r5)
            goto L_0x0041
        L_0x0035:
            android.net.Uri r5 = android.provider.ContactsContract.Contacts.lookupContact(r6, r5)
            if (r5 != 0) goto L_0x003d
            r5 = r1
            goto L_0x0041
        L_0x003d:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r6, r5, r2)
        L_0x0041:
            if (r5 != 0) goto L_0x0044
            return r1
        L_0x0044:
            com.squareup.picasso.RequestHandler$Result r6 = new com.squareup.picasso.RequestHandler$Result
            okio.Source r5 = okio.Okio.source((java.io.InputStream) r5)
            com.squareup.picasso.Picasso$LoadedFrom r0 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r6.<init>((okio.Source) r5, (com.squareup.picasso.Picasso.LoadedFrom) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.load(com.squareup.picasso.Request, int):com.squareup.picasso.RequestHandler$Result");
    }
}
