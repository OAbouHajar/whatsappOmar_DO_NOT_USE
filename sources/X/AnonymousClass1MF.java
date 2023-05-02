package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.animated.webp.WebPImage;
import com.obwhatsapp.R;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.io.IOUtils;

/* renamed from: X.1MF  reason: invalid class name */
public class AnonymousClass1MF {
    public C435720q A00;
    public final C16180sb A01;
    public final C14870pt A02;
    public final C17120uZ A03;
    public final C14710pd A04;
    public final C435620o A05 = new C435620o();
    public final C18840xL A06;
    public final AnonymousClass20p A07;
    public final ConcurrentHashMap A08;
    public final ConcurrentHashMap A09;

    public AnonymousClass1MF(C16180sb r2, C14870pt r3, C17120uZ r4, C14710pd r5, C18840xL r6, AnonymousClass1QP r7) {
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A06 = r6;
        this.A03 = r4;
        this.A07 = new AnonymousClass20p(r3, r5, r7);
        this.A09 = new ConcurrentHashMap();
        this.A08 = new ConcurrentHashMap();
    }

    public static String A00(C34151jm r5, int i2, int i3) {
        StringBuilder sb;
        String obj;
        String str = r5.A0D;
        if (str != null) {
            obj = str.replace("/", "-");
        } else {
            sb = new StringBuilder();
            obj = r5.toString();
        }
        sb.append(obj);
        sb.append("_");
        sb.append(i2);
        sb.append("_");
        sb.append(i3);
        return sb.toString();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:103:0x0136 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x013b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x004a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x011e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0123 */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0131 A[Catch:{ all -> 0x013b, IOException -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A01(android.content.Context r10, X.C16180sb r11, X.C34151jm r12) {
        /*
            java.lang.String r0 = r12.A09
            r9 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData filePath is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x000a:
            return r9
        L_0x000b:
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x0153 }
            if (r0 != 0) goto L_0x012b
            int r1 = r12.A01     // Catch:{ IOException -> 0x0153 }
            r0 = 3
            if (r1 != r0) goto L_0x0063
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch:{ IOException -> 0x005b, SecurityException -> 0x0053, IllegalArgumentException -> 0x004b }
            java.lang.String r0 = r12.A09     // Catch:{ IOException -> 0x005b, SecurityException -> 0x0053, IllegalArgumentException -> 0x004b }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ IOException -> 0x005b, SecurityException -> 0x0053, IllegalArgumentException -> 0x004b }
            java.io.InputStream r2 = r1.openInputStream(r0)     // Catch:{ IOException -> 0x005b, SecurityException -> 0x0053, IllegalArgumentException -> 0x004b }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0044 }
            r1.<init>()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x003f
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x003a }
            byte[] r8 = r1.toByteArray()     // Catch:{ all -> 0x003a }
            r1.close()     // Catch:{ all -> 0x0044 }
            r2.close()     // Catch:{ IOException -> 0x005b, SecurityException -> 0x0053, IllegalArgumentException -> 0x004b }
            goto L_0x012e
        L_0x003a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x003f:
            r1.close()     // Catch:{ all -> 0x0044 }
            goto L_0x012b
        L_0x0044:
            r0 = move-exception
            if (r2 == 0) goto L_0x004a
            r2.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0     // Catch:{ IOException -> 0x005b, SecurityException -> 0x0053, IllegalArgumentException -> 0x004b }
        L_0x004b:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IllegalArgumentException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0153 }
            goto L_0x012b
        L_0x0053:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/SecurityException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0153 }
            goto L_0x012b
        L_0x005b:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromUri/IOException"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0153 }
            goto L_0x012b
        L_0x0063:
            java.lang.String r0 = r12.A09     // Catch:{ IOException -> 0x0153 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ IOException -> 0x0153 }
            r8 = 0
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = r12.A09     // Catch:{ IOException -> 0x0153 }
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0153 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0153 }
            boolean r0 = r2.exists()     // Catch:{ IOException -> 0x0153 }
            if (r0 == 0) goto L_0x00bc
            long r3 = r2.length()     // Catch:{ IOException -> 0x0153 }
            r5 = 1048576(0x100000, double:5.180654E-318)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fd
            java.lang.String r0 = "Sticker/getImageDataFromFile/sticker is above legal size limit: 1048576, hash: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0153 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r12.A0D     // Catch:{ IOException -> 0x0153 }
            r1.append(r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0153 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r1 = r12.A0D     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r12.A0G     // Catch:{ IOException -> 0x0153 }
            java.io.File r7 = r11.A0P(r1, r0)     // Catch:{ IOException -> 0x0153 }
            if (r7 != 0) goto L_0x00a8
            java.lang.String r0 = "Sticker/getImageDataFromFile/could not get sticker thumbnail file"
        L_0x00a3:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0153 }
            goto L_0x012e
        L_0x00a8:
            boolean r0 = r7.exists()     // Catch:{ IOException -> 0x0153 }
            if (r0 != 0) goto L_0x00fc
            java.lang.String r0 = r12.A09     // Catch:{ IOException -> 0x0153 }
            int r0 = com.whatsapp.stickers.WebpUtils.getFirstWebpThumbnailMinimumFileLength(r0)     // Catch:{ IOException -> 0x0153 }
            long r3 = (long) r0     // Catch:{ IOException -> 0x0153 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cd
            java.lang.String r0 = "Sticker/getImageDataFromFile/even first frame is above legal size limit: 1048576"
            goto L_0x00a3
        L_0x00bc:
            java.lang.String r0 = "Sticker/getImageDataFromFile/sticker file cannot be found, "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0153 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r12.A09     // Catch:{ IOException -> 0x0153 }
            r1.append(r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0153 }
            goto L_0x00a3
        L_0x00cd:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0153 }
            r0.<init>(r2)     // Catch:{ IOException -> 0x0153 }
            X.1q7 r6 = new X.1q7     // Catch:{ IOException -> 0x0153 }
            r6.<init>(r0, r3)     // Catch:{ IOException -> 0x0153 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x0137 }
            r5.<init>()     // Catch:{ all -> 0x0137 }
            X.AnonymousClass1XI.A0H(r6, r5)     // Catch:{ all -> 0x0132 }
            byte[] r2 = r5.toByteArray()     // Catch:{ all -> 0x0132 }
            int r1 = (int) r3     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x0132 }
            boolean r0 = com.whatsapp.stickers.WebpUtils.createFirstThumbnail(r2, r1, r0)     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x00f5
            r5.close()     // Catch:{ all -> 0x0137 }
            r6.close()     // Catch:{ IOException -> 0x0153 }
            goto L_0x00fc
        L_0x00f5:
            r5.close()     // Catch:{ all -> 0x0137 }
            r6.close()     // Catch:{ IOException -> 0x0153 }
            goto L_0x012e
        L_0x00fc:
            r2 = r7
        L_0x00fd:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ OutOfMemoryError -> 0x0124 }
            r0.<init>(r2)     // Catch:{ OutOfMemoryError -> 0x0124 }
            X.1q7 r2 = new X.1q7     // Catch:{ OutOfMemoryError -> 0x0124 }
            r2.<init>(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0124 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x011f }
            r1.<init>()     // Catch:{ all -> 0x011f }
            X.AnonymousClass1XI.A0H(r2, r1)     // Catch:{ all -> 0x011a }
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x011a }
            r1.close()     // Catch:{ all -> 0x011f }
            r2.close()     // Catch:{ OutOfMemoryError -> 0x0124 }
            goto L_0x012d
        L_0x011a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x011e }
        L_0x011e:
            throw r0     // Catch:{ all -> 0x011f }
        L_0x011f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0123 }
        L_0x0123:
            throw r0     // Catch:{ OutOfMemoryError -> 0x0124 }
        L_0x0124:
            r1 = move-exception
            java.lang.String r0 = "Sticker/getImageDataFromFile/OutOfMemoryError"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0153 }
            goto L_0x012e
        L_0x012b:
            r8 = 0
            goto L_0x012e
        L_0x012d:
            r8 = r0
        L_0x012e:
            r9 = r8
            if (r8 != 0) goto L_0x000a
            goto L_0x013c
        L_0x0132:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0136 }
        L_0x0136:
            throw r0     // Catch:{ all -> 0x0137 }
        L_0x0137:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x013b }
        L_0x013b:
            throw r0     // Catch:{ IOException -> 0x0153 }
        L_0x013c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0153 }
            r1.<init>()     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker file does not exist: "
            r1.append(r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r12.A0D     // Catch:{ IOException -> 0x0153 }
            r1.append(r0)     // Catch:{ IOException -> 0x0153 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0153 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0153 }
            return r9
        L_0x0153:
            r2 = move-exception
            java.lang.String r0 = "StickerImageFileLoader/loadStickerData sticker IOException when getting image data: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r12.A0D
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MF.A01(android.content.Context, X.0sb, X.1jm):byte[]");
    }

    public final Drawable A02(C435920s r21, String str, byte[] bArr) {
        int min;
        int i2;
        C34151jm r5;
        AnonymousClass1XO r0;
        String str2;
        C435920s r1 = r21;
        ConcurrentHashMap concurrentHashMap = this.A08;
        String str3 = r1.A04;
        Reference reference = (Reference) concurrentHashMap.get(str3);
        if (reference != null) {
            C41441vn r52 = (C41441vn) reference.get();
            if (r52 != null) {
                return new C436020t(r52);
            }
            concurrentHashMap.remove(str3);
        }
        byte[] bArr2 = bArr;
        WebPImage A002 = C18840xL.A00(bArr2);
        if (A002 != null) {
            boolean z2 = false;
            C14710pd r9 = this.A04;
            C16620tM r8 = C16620tM.A02;
            if (r9.A0E(r8, 295) && !((r0 = (r5 = r1.A03).A04) == null && ((str2 = r5.A09) == null || (r0 = AnonymousClass1XO.A00(WebpUtils.fetchWebpMetadata(str2))) == null))) {
                z2 = !r0.A07;
            }
            String str4 = str;
            if (A002.getFrameCount() == 1 || z2) {
                Bitmap A052 = this.A06.A05(str4, bArr2, r1.A02, r1.A00);
                if (A052 != null) {
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(A052);
                    this.A09.put(str3, new SoftReference(bitmapDrawable));
                    return bitmapDrawable;
                }
                StringBuilder sb = new StringBuilder("StickerImageLoader/loadAnimatedSticker failed to create drawable, hash: ");
                sb.append(str4);
                Log.e(sb.toString());
            } else {
                if (r9.A0E(r8, 276)) {
                    min = Math.min(512, r1.A02);
                    i2 = Math.min(512, r1.A00);
                    if (r1.A06) {
                        min = (int) (((float) min) / 2.0f);
                        i2 = (int) (((float) i2) / 2.0f);
                    }
                } else {
                    min = Math.min(512, (r1 instanceof C436220v ? ((C436220v) r1).A00.getContext() : ((C436320w) r1).A00).getResources().getDimensionPixelSize(R.dimen.dimen0288));
                    i2 = min;
                }
                C18840xL r12 = this.A06;
                String A012 = C18840xL.A01(str3, min, i2);
                Bitmap A042 = r12.A04(A012);
                if (!(A042 == null && (A042 = r12.A02(A002, A012, min, i2)) == null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4.replace(IOUtils.DIR_SEPARATOR_UNIX, '-'));
                    sb2.append("_");
                    sb2.append(min);
                    sb2.append("_");
                    sb2.append(i2);
                    C41441vn r122 = new C41441vn(A042, A002, this.A02, this.A07, sb2.toString(), min, i2);
                    concurrentHashMap.put(str3, new WeakReference(r122));
                    return new C436020t(r122);
                }
            }
        }
        return null;
    }

    public void A03() {
        C435720q r1 = this.A00;
        if (r1 != null) {
            r1.A01 = true;
            r1.interrupt();
            this.A00 = null;
        }
        C435620o r12 = this.A05;
        synchronized (r12) {
            r12.A00.clear();
        }
        AnonymousClass20p r13 = this.A07;
        C435820r r0 = r13.A00;
        if (r0 != null) {
            r0.A00();
            r13.A00 = null;
        }
    }

    public void A04(ImageView imageView, C34151jm r18, C436420x r19, int i2, int i3, int i4, boolean z2, boolean z3) {
        PriorityQueue priorityQueue;
        Drawable drawable;
        C34151jm r8 = r18;
        int i5 = i3;
        int i6 = i4;
        String A002 = A00(r8, i5, i6);
        ImageView imageView2 = imageView;
        imageView2.setTag(A002);
        C435620o r2 = this.A05;
        synchronized (r2) {
            priorityQueue = r2.A00;
            Iterator it = priorityQueue.iterator();
            while (it.hasNext()) {
                if (((C436220v) it.next()).A00 == imageView2) {
                    it.remove();
                }
            }
        }
        Drawable drawable2 = imageView2.getDrawable();
        Reference reference = (Reference) this.A09.get(A002);
        if (reference == null || (drawable = (Drawable) reference.get()) == null) {
            drawable = null;
            if (r8.A0D != null) {
                ConcurrentHashMap concurrentHashMap = this.A08;
                Reference reference2 = (Reference) concurrentHashMap.get(A002);
                if (reference2 != null) {
                    C41441vn r0 = (C41441vn) reference2.get();
                    if (r0 != null) {
                        drawable = new C436020t(r0);
                    } else {
                        concurrentHashMap.remove(A002);
                    }
                }
            }
        }
        C436420x r9 = r19;
        if (drawable2 == null || !drawable2.equals(drawable)) {
            if (drawable != null) {
                imageView2.setImageDrawable(drawable);
            } else {
                imageView2.setImageResource(R.drawable.sticker_loading);
                C436220v r6 = new C436220v(imageView2, r8, r9, A002, i5, i6, i2, z2, z3);
                synchronized (r2) {
                    priorityQueue.add(r6);
                    r2.notifyAll();
                }
                if (this.A00 == null) {
                    C435720q r02 = new C435720q(r2, this);
                    this.A00 = r02;
                    r02.start();
                    return;
                }
                return;
            }
        }
        if (r19 != null) {
            r9.AXn(true);
        }
    }

    public final void A05(C14870pt r6, C435920s r7, Map map) {
        Reference reference;
        boolean z2 = r7 instanceof C436220v;
        if (z2) {
            C436220v r0 = (C436220v) r7;
            if (!r0.A04.equals(r0.A00.getTag())) {
                return;
            }
        }
        Drawable drawable = null;
        if (map == null || (reference = (Reference) map.get(r7.A04)) == null || (drawable = (Drawable) reference.get()) == null) {
            Context context = z2 ? ((C436220v) r7).A00.getContext() : ((C436320w) r7).A00;
            C34151jm r2 = r7.A03;
            byte[] A012 = A01(context, this.A01, r2);
            if (A012 != null) {
                if (r7.A05) {
                    String str = r2.A0D;
                    AnonymousClass00B.A06(str);
                    drawable = A02(r7, str, A012);
                } else {
                    Bitmap A052 = this.A06.A05(r7.A04, A012, r7.A02, r7.A00);
                    drawable = A052 != null ? new BitmapDrawable(A052) : null;
                }
            }
            if (map != null) {
                if (drawable != null) {
                    map.put(r7.A04, new SoftReference(drawable));
                } else {
                    StringBuilder sb = new StringBuilder("StickerImageLoader/loadSticker failed to create drawable: ");
                    sb.append(r7.A04);
                    Log.e(sb.toString());
                }
            }
        }
        r7.A00(drawable, r6);
    }
}
