package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: XFMFile */
public final class Request {

    /* renamed from: c  reason: collision with root package name */
    public static final long f1565c = TimeUnit.SECONDS.toNanos(5);

    /* renamed from: a  reason: collision with root package name */
    public int f1566a;

    /* renamed from: b  reason: collision with root package name */
    public long f1567b;
    public final boolean centerCrop;
    public final int centerCropGravity;
    public final boolean centerInside;
    public final Bitmap.Config config;
    public final boolean hasRotationPivot;
    public final boolean onlyScaleDown;
    public final Picasso.Priority priority;
    public final boolean purgeable;
    public final int resourceId;
    public final float rotationDegrees;
    public final float rotationPivotX;
    public final float rotationPivotY;
    public final String stableKey;
    public final int targetHeight;
    public final int targetWidth;
    public final List<Transformation> transformations;
    public final Uri uri;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Uri f1568a;

        /* renamed from: b  reason: collision with root package name */
        public int f1569b;

        /* renamed from: c  reason: collision with root package name */
        public String f1570c;

        /* renamed from: d  reason: collision with root package name */
        public int f1571d;

        /* renamed from: e  reason: collision with root package name */
        public int f1572e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1573f;

        /* renamed from: g  reason: collision with root package name */
        public int f1574g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1575h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1576i;

        /* renamed from: j  reason: collision with root package name */
        public float f1577j;

        /* renamed from: k  reason: collision with root package name */
        public float f1578k;

        /* renamed from: l  reason: collision with root package name */
        public float f1579l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f1580m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f1581n;

        /* renamed from: o  reason: collision with root package name */
        public ArrayList f1582o;

        /* renamed from: p  reason: collision with root package name */
        public Bitmap.Config f1583p;

        /* renamed from: q  reason: collision with root package name */
        public Picasso.Priority f1584q;

        public Builder(@DrawableRes int i2) {
            setResourceId(i2);
        }

        public Builder(@NonNull Uri uri) {
            setUri(uri);
        }

        public Builder(Uri uri, int i2, Bitmap.Config config) {
            this.f1568a = uri;
            this.f1569b = i2;
            this.f1583p = config;
        }

        public Builder(Request request) {
            this.f1568a = request.uri;
            this.f1569b = request.resourceId;
            this.f1570c = request.stableKey;
            this.f1571d = request.targetWidth;
            this.f1572e = request.targetHeight;
            this.f1573f = request.centerCrop;
            this.f1575h = request.centerInside;
            this.f1574g = request.centerCropGravity;
            this.f1577j = request.rotationDegrees;
            this.f1578k = request.rotationPivotX;
            this.f1579l = request.rotationPivotY;
            this.f1580m = request.hasRotationPivot;
            this.f1581n = request.purgeable;
            this.f1576i = request.onlyScaleDown;
            if (request.transformations != null) {
                this.f1582o = new ArrayList(request.transformations);
            }
            this.f1583p = request.config;
            this.f1584q = request.priority;
        }

        public final boolean a() {
            return (this.f1568a == null && this.f1569b == 0) ? false : true;
        }

        public Request build() {
            boolean z2 = this.f1575h;
            if (z2 && this.f1573f) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            } else if (this.f1573f && this.f1571d == 0 && this.f1572e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            } else if (z2 && this.f1571d == 0 && this.f1572e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            } else {
                if (this.f1584q == null) {
                    this.f1584q = Picasso.Priority.NORMAL;
                }
                Request request = r2;
                Request request2 = new Request(this.f1568a, this.f1569b, this.f1570c, this.f1582o, this.f1571d, this.f1572e, this.f1573f, this.f1575h, this.f1574g, this.f1576i, this.f1577j, this.f1578k, this.f1579l, this.f1580m, this.f1581n, this.f1583p, this.f1584q);
                return request;
            }
        }

        public Builder centerCrop() {
            return centerCrop(17);
        }

        public Builder centerCrop(int i2) {
            if (!this.f1575h) {
                this.f1573f = true;
                this.f1574g = i2;
                return this;
            }
            throw new IllegalStateException("Center crop can not be used after calling centerInside");
        }

        public Builder centerInside() {
            if (!this.f1573f) {
                this.f1575h = true;
                return this;
            }
            throw new IllegalStateException("Center inside can not be used after calling centerCrop");
        }

        public Builder clearCenterCrop() {
            this.f1573f = false;
            this.f1574g = 17;
            return this;
        }

        public Builder clearCenterInside() {
            this.f1575h = false;
            return this;
        }

        public Builder clearOnlyScaleDown() {
            this.f1576i = false;
            return this;
        }

        public Builder clearResize() {
            this.f1571d = 0;
            this.f1572e = 0;
            this.f1573f = false;
            this.f1575h = false;
            return this;
        }

        public Builder clearRotation() {
            this.f1577j = 0.0f;
            this.f1578k = 0.0f;
            this.f1579l = 0.0f;
            this.f1580m = false;
            return this;
        }

        public Builder config(@NonNull Bitmap.Config config) {
            if (config != null) {
                this.f1583p = config;
                return this;
            }
            throw new IllegalArgumentException("config == null");
        }

        public Builder onlyScaleDown() {
            if (this.f1572e == 0 && this.f1571d == 0) {
                throw new IllegalStateException("onlyScaleDown can not be applied without resize");
            }
            this.f1576i = true;
            return this;
        }

        public Builder priority(@NonNull Picasso.Priority priority) {
            if (priority == null) {
                throw new IllegalArgumentException("Priority invalid.");
            } else if (this.f1584q == null) {
                this.f1584q = priority;
                return this;
            } else {
                throw new IllegalStateException("Priority already set.");
            }
        }

        public Builder purgeable() {
            this.f1581n = true;
            return this;
        }

        public Builder resize(@Px int i2, @Px int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Width must be positive number or 0.");
            } else if (i3 < 0) {
                throw new IllegalArgumentException("Height must be positive number or 0.");
            } else if (i3 == 0 && i2 == 0) {
                throw new IllegalArgumentException("At least one dimension has to be positive number.");
            } else {
                this.f1571d = i2;
                this.f1572e = i3;
                return this;
            }
        }

        public Builder rotate(float f2) {
            this.f1577j = f2;
            return this;
        }

        public Builder rotate(float f2, float f3, float f4) {
            this.f1577j = f2;
            this.f1578k = f3;
            this.f1579l = f4;
            this.f1580m = true;
            return this;
        }

        public Builder setResourceId(@DrawableRes int i2) {
            if (i2 != 0) {
                this.f1569b = i2;
                this.f1568a = null;
                return this;
            }
            throw new IllegalArgumentException("Image resource ID may not be 0.");
        }

        public Builder setUri(@NonNull Uri uri) {
            if (uri != null) {
                this.f1568a = uri;
                this.f1569b = 0;
                return this;
            }
            throw new IllegalArgumentException("Image URI may not be null.");
        }

        public Builder stableKey(@Nullable String str) {
            this.f1570c = str;
            return this;
        }

        public Builder transform(@NonNull Transformation transformation) {
            if (transformation == null) {
                throw new IllegalArgumentException("Transformation must not be null.");
            } else if (transformation.key() != null) {
                if (this.f1582o == null) {
                    this.f1582o = new ArrayList(2);
                }
                this.f1582o.add(transformation);
                return this;
            } else {
                throw new IllegalArgumentException("Transformation key must not be null.");
            }
        }

        public Builder transform(@NonNull List<? extends Transformation> list) {
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    transform((Transformation) list.get(i2));
                }
                return this;
            }
            throw new IllegalArgumentException("Transformation list must not be null.");
        }
    }

    public Request(Uri uri2, int i2, String str, ArrayList arrayList, int i3, int i4, boolean z2, boolean z3, int i5, boolean z4, float f2, float f3, float f4, boolean z5, boolean z6, Bitmap.Config config2, Picasso.Priority priority2) {
        this.uri = uri2;
        this.resourceId = i2;
        this.stableKey = str;
        this.transformations = arrayList == null ? null : Collections.unmodifiableList(arrayList);
        this.targetWidth = i3;
        this.targetHeight = i4;
        this.centerCrop = z2;
        this.centerInside = z3;
        this.centerCropGravity = i5;
        this.onlyScaleDown = z4;
        this.rotationDegrees = f2;
        this.rotationPivotX = f3;
        this.rotationPivotY = f4;
        this.hasRotationPivot = z5;
        this.purgeable = z6;
        this.config = config2;
        this.priority = priority2;
    }

    public final String a() {
        StringBuilder sb;
        long nanoTime = System.nanoTime() - this.f1567b;
        if (nanoTime > f1565c) {
            sb.append(c());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toSeconds(nanoTime));
            sb.append('s');
        } else {
            sb = new StringBuilder();
            sb.append(c());
            sb.append('+');
            sb.append(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            sb.append("ms");
        }
        return sb.toString();
    }

    public final boolean b() {
        return hasSize() || this.rotationDegrees != 0.0f;
    }

    public Builder buildUpon() {
        return new Builder(this);
    }

    public final String c() {
        return "[R" + this.f1566a + ']';
    }

    public boolean hasSize() {
        return (this.targetWidth == 0 && this.targetHeight == 0) ? false : true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{");
        int i2 = this.resourceId;
        if (i2 > 0) {
            sb.append(i2);
        } else {
            sb.append(this.uri);
        }
        List<Transformation> list = this.transformations;
        if (list != null && !list.isEmpty()) {
            for (Transformation key : this.transformations) {
                sb.append(' ');
                sb.append(key.key());
            }
        }
        if (this.stableKey != null) {
            sb.append(" stableKey(");
            sb.append(this.stableKey);
            sb.append(')');
        }
        if (this.targetWidth > 0) {
            sb.append(" resize(");
            sb.append(this.targetWidth);
            sb.append(',');
            sb.append(this.targetHeight);
            sb.append(')');
        }
        if (this.centerCrop) {
            sb.append(" centerCrop");
        }
        if (this.centerInside) {
            sb.append(" centerInside");
        }
        if (this.rotationDegrees != 0.0f) {
            sb.append(" rotation(");
            sb.append(this.rotationDegrees);
            if (this.hasRotationPivot) {
                sb.append(" @ ");
                sb.append(this.rotationPivotX);
                sb.append(',');
                sb.append(this.rotationPivotY);
            }
            sb.append(')');
        }
        if (this.purgeable) {
            sb.append(" purgeable");
        }
        if (this.config != null) {
            sb.append(' ');
            sb.append(this.config);
        }
        sb.append('}');
        return sb.toString();
    }
}
