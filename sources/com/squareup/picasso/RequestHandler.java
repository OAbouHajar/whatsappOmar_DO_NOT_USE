package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.squareup.picasso.Picasso;
import e.o0;
import okio.Source;

/* compiled from: XFMFile */
public abstract class RequestHandler {

    /* compiled from: XFMFile */
    public final class Result {

        /* renamed from: a  reason: collision with root package name */
        public final Picasso.LoadedFrom f1598a;

        /* renamed from: b  reason: collision with root package name */
        public final Bitmap f1599b;

        /* renamed from: c  reason: collision with root package name */
        public final Source f1600c;

        /* renamed from: d  reason: collision with root package name */
        public final int f1601d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Result(@NonNull Bitmap bitmap, @NonNull Picasso.LoadedFrom loadedFrom) {
            this(bitmap, (Source) null, loadedFrom, 0);
            StringBuilder sb = o0.f1699a;
            if (bitmap != null) {
                return;
            }
            throw new NullPointerException("bitmap == null");
        }

        public Result(Bitmap bitmap, Source source, Picasso.LoadedFrom loadedFrom, int i2) {
            if ((bitmap != null) != (source == null ? false : true)) {
                this.f1599b = bitmap;
                this.f1600c = source;
                StringBuilder sb = o0.f1699a;
                if (loadedFrom != null) {
                    this.f1598a = loadedFrom;
                    this.f1601d = i2;
                    return;
                }
                throw new NullPointerException("loadedFrom == null");
            }
            throw new AssertionError();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Result(@NonNull Source source, @NonNull Picasso.LoadedFrom loadedFrom) {
            this((Bitmap) null, source, loadedFrom, 0);
            StringBuilder sb = o0.f1699a;
            if (source != null) {
                return;
            }
            throw new NullPointerException("source == null");
        }

        @Nullable
        public Bitmap getBitmap() {
            return this.f1599b;
        }

        @NonNull
        public Picasso.LoadedFrom getLoadedFrom() {
            return this.f1598a;
        }

        @Nullable
        public Source getSource() {
            return this.f1600c;
        }
    }

    public static void a(int i2, int i3, int i4, int i5, BitmapFactory.Options options, Request request) {
        int i6;
        double d2;
        if (i5 > i3 || i4 > i2) {
            if (i3 == 0) {
                d2 = (double) (((float) i4) / ((float) i2));
            } else if (i2 == 0) {
                d2 = (double) (((float) i5) / ((float) i3));
            } else {
                int floor = (int) Math.floor((double) (((float) i5) / ((float) i3)));
                int floor2 = (int) Math.floor((double) (((float) i4) / ((float) i2)));
                i6 = request.centerInside ? Math.max(floor, floor2) : Math.min(floor, floor2);
            }
            i6 = (int) Math.floor(d2);
        } else {
            i6 = 1;
        }
        options.inSampleSize = i6;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options b(Request request) {
        boolean hasSize = request.hasSize();
        boolean z2 = request.config != null;
        if (!hasSize && !z2 && !request.purgeable) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = hasSize;
        boolean z3 = request.purgeable;
        options.inInputShareable = z3;
        options.inPurgeable = z3;
        if (z2) {
            options.inPreferredConfig = request.config;
        }
        return options;
    }

    public int c() {
        return 0;
    }

    public abstract boolean canHandleRequest(Request request);

    public boolean d(NetworkInfo networkInfo) {
        return false;
    }

    @Nullable
    public abstract Result load(Request request, int i2);
}
