package e;

import android.content.Context;
import android.net.Uri;
import com.squareup.picasso.Request;

/* compiled from: XFMFile */
public final class y extends l {

    /* renamed from: c  reason: collision with root package name */
    public static final String[] f1731c = {"orientation"};

    public y(Context context) {
        super(context, 0);
    }

    public final boolean canHandleRequest(Request request) {
        Uri uri = request.uri;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        if (r2 != null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.picasso.RequestHandler.Result load(com.squareup.picasso.Request r19, int r20) {
        /*
            r18 = this;
            r0 = r19
            r7 = r18
            android.content.Context r1 = r7.f1678b
            android.content.ContentResolver r14 = r1.getContentResolver()
            android.net.Uri r9 = r0.uri
            r1 = 0
            r15 = 0
            java.lang.String[] r10 = f1731c     // Catch:{ RuntimeException -> 0x0039, all -> 0x0032 }
            r11 = 0
            r12 = 0
            r13 = 0
            r8 = r14
            android.database.Cursor r2 = r8.query(r9, r10, r11, r12, r13)     // Catch:{ RuntimeException -> 0x0039, all -> 0x0032 }
            if (r2 == 0) goto L_0x002f
            boolean r3 = r2.moveToFirst()     // Catch:{ RuntimeException -> 0x002d, all -> 0x002a }
            if (r3 != 0) goto L_0x0021
            goto L_0x002f
        L_0x0021:
            int r3 = r2.getInt(r1)     // Catch:{ RuntimeException -> 0x002d, all -> 0x002a }
            r2.close()
            r8 = r3
            goto L_0x0041
        L_0x002a:
            r0 = move-exception
            r15 = r2
            goto L_0x0033
        L_0x002d:
            goto L_0x003b
        L_0x002f:
            if (r2 == 0) goto L_0x0040
            goto L_0x003d
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            if (r15 == 0) goto L_0x0038
            r15.close()
        L_0x0038:
            throw r0
        L_0x0039:
            r2 = r15
        L_0x003b:
            if (r2 == 0) goto L_0x0040
        L_0x003d:
            r2.close()
        L_0x0040:
            r8 = 0
        L_0x0041:
            android.net.Uri r2 = r0.uri
            java.lang.String r2 = r14.getType(r2)
            r9 = 1
            if (r2 == 0) goto L_0x0054
            java.lang.String r3 = "video/"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x0054
            r10 = 1
            goto L_0x0055
        L_0x0054:
            r10 = 0
        L_0x0055:
            boolean r1 = r19.hasSize()
            if (r1 == 0) goto L_0x00c9
            int r1 = r0.targetWidth
            int r2 = r0.targetHeight
            r11 = 3
            r3 = 96
            if (r1 > r3) goto L_0x0068
            if (r2 > r3) goto L_0x0068
            r1 = 1
            goto L_0x0071
        L_0x0068:
            r3 = 512(0x200, float:7.175E-43)
            if (r1 > r3) goto L_0x0073
            r1 = 384(0x180, float:5.38E-43)
            if (r2 > r1) goto L_0x0073
            r1 = 2
        L_0x0071:
            r12 = r1
            goto L_0x0074
        L_0x0073:
            r12 = 3
        L_0x0074:
            if (r10 != 0) goto L_0x0088
            if (r12 != r11) goto L_0x0088
            java.io.InputStream r0 = r18.e(r19)
            okio.Source r0 = okio.Okio.source((java.io.InputStream) r0)
            com.squareup.picasso.RequestHandler$Result r1 = new com.squareup.picasso.RequestHandler$Result
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r1.<init>(r15, r0, r2, r8)
            return r1
        L_0x0088:
            android.net.Uri r1 = r0.uri
            long r5 = android.content.ContentUris.parseId(r1)
            android.graphics.BitmapFactory$Options r13 = com.squareup.picasso.RequestHandler.b(r19)
            r13.inJustDecodeBounds = r9
            int r1 = r0.targetWidth
            int r2 = r0.targetHeight
            int r3 = a.a.c(r12)
            int r4 = a.a.b(r12)
            r16 = r5
            r5 = r13
            r6 = r19
            com.squareup.picasso.RequestHandler.a(r1, r2, r3, r4, r5, r6)
            int r1 = a.a.a(r12)
            if (r10 == 0) goto L_0x00b9
            if (r12 != r11) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r9 = r1
        L_0x00b2:
            r2 = r16
            android.graphics.Bitmap r1 = android.provider.MediaStore.Video.Thumbnails.getThumbnail(r14, r2, r9, r13)
            goto L_0x00bf
        L_0x00b9:
            r2 = r16
            android.graphics.Bitmap r1 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r14, r2, r1, r13)
        L_0x00bf:
            if (r1 == 0) goto L_0x00c9
            com.squareup.picasso.RequestHandler$Result r0 = new com.squareup.picasso.RequestHandler$Result
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r0.<init>(r1, r15, r2, r8)
            return r0
        L_0x00c9:
            java.io.InputStream r0 = r18.e(r19)
            okio.Source r0 = okio.Okio.source((java.io.InputStream) r0)
            com.squareup.picasso.RequestHandler$Result r1 = new com.squareup.picasso.RequestHandler$Result
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.DISK
            r1.<init>(r15, r0, r2, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.y.load(com.squareup.picasso.Request, int):com.squareup.picasso.RequestHandler$Result");
    }
}
