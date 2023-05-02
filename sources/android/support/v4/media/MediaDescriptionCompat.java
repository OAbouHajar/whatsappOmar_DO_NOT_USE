package android.support.v4.media;

import X.AnonymousClass000;
import X.AnonymousClass0P7;
import X.C03940Km;
import X.C06790Xt;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C06790Xt();
    public MediaDescription A00;
    public final Bitmap A01;
    public final Uri A02;
    public final Uri A03;
    public final Bundle A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final String A08;

    public MediaDescriptionCompat(Bitmap bitmap, Uri uri, Uri uri2, Bundle bundle, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, String str) {
        this.A08 = str;
        this.A07 = charSequence;
        this.A06 = charSequence2;
        this.A05 = charSequence3;
        this.A01 = bitmap;
        this.A02 = uri;
        this.A04 = bundle;
        this.A03 = uri2;
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.A08 = parcel.readString();
        this.A07 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A06 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A05 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.A01 = (Bitmap) parcel.readParcelable(classLoader);
        this.A02 = (Uri) parcel.readParcelable(classLoader);
        this.A04 = parcel.readBundle(classLoader);
        this.A03 = (Uri) parcel.readParcelable(classLoader);
    }

    public static MediaDescriptionCompat A00(Object obj) {
        int i2;
        Uri uri;
        Object obj2 = obj;
        Bundle bundle = null;
        if (obj == null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return null;
        }
        AnonymousClass0P7 r4 = new AnonymousClass0P7();
        MediaDescription mediaDescription = (MediaDescription) obj2;
        r4.A07 = mediaDescription.getMediaId();
        r4.A06 = mediaDescription.getTitle();
        r4.A05 = mediaDescription.getSubtitle();
        r4.A04 = mediaDescription.getDescription();
        r4.A00 = mediaDescription.getIconBitmap();
        r4.A01 = mediaDescription.getIconUri();
        Bundle extras = mediaDescription.getExtras();
        if (extras != null) {
            extras.setClassLoader(C03940Km.class.getClassLoader());
            try {
                extras.isEmpty();
            } catch (BadParcelableException unused) {
                Log.e("MediaSessionCompat", "Could not unparcel the data.");
                extras = null;
            }
        }
        if (extras != null) {
            uri = (Uri) extras.getParcelable("android.support.v4.media.description.MEDIA_URI");
            if (uri != null) {
                if (!extras.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || extras.size() != 2) {
                    extras.remove("android.support.v4.media.description.MEDIA_URI");
                    extras.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
                }
            }
            bundle = extras;
        } else {
            uri = null;
            bundle = extras;
        }
        r4.A03 = bundle;
        if (uri != null) {
            r4.A02 = uri;
        } else if (i2 >= 23) {
            r4.A02 = mediaDescription.getMediaUri();
        }
        String str = r4.A07;
        MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(r4.A00, r4.A01, r4.A02, r4.A03, r4.A06, r4.A05, r4.A04, str);
        mediaDescriptionCompat.A00 = mediaDescription;
        return mediaDescriptionCompat;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A07);
        A0o.append(", ");
        A0o.append(this.A06);
        A0o.append(", ");
        return AnonymousClass000.A0f(this.A05, A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Uri uri;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 21) {
            parcel.writeString(this.A08);
            TextUtils.writeToParcel(this.A07, parcel, i2);
            TextUtils.writeToParcel(this.A06, parcel, i2);
            TextUtils.writeToParcel(this.A05, parcel, i2);
            parcel.writeParcelable(this.A01, i2);
            parcel.writeParcelable(this.A02, i2);
            parcel.writeBundle(this.A04);
            parcel.writeParcelable(this.A03, i2);
            return;
        }
        MediaDescription mediaDescription = this.A00;
        if (mediaDescription == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.A08);
            builder.setTitle(this.A07);
            builder.setSubtitle(this.A06);
            builder.setDescription(this.A05);
            builder.setIconBitmap(this.A01);
            builder.setIconUri(this.A02);
            Bundle bundle = this.A04;
            if (i3 < 23 && (uri = this.A03) != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                    bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                }
                bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", uri);
            }
            builder.setExtras(bundle);
            if (i3 >= 23) {
                builder.setMediaUri(this.A03);
            }
            mediaDescription = builder.build();
            this.A00 = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i2);
    }
}
