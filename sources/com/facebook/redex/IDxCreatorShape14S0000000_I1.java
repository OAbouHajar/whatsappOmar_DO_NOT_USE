package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass0Bb;
import X.AnonymousClass0FH;
import X.AnonymousClass0FI;
import X.AnonymousClass0FJ;
import X.AnonymousClass0FK;
import X.AnonymousClass0FL;
import X.AnonymousClass0FM;
import X.AnonymousClass0Y6;
import X.AnonymousClass0Y7;
import X.AnonymousClass0Y9;
import X.AnonymousClass0YA;
import X.AnonymousClass0YB;
import X.AnonymousClass0YC;
import X.AnonymousClass0YD;
import X.AnonymousClass0YE;
import X.AnonymousClass0YF;
import X.AnonymousClass0YG;
import X.AnonymousClass0YH;
import X.AnonymousClass0YI;
import X.AnonymousClass0YJ;
import X.C02370Bi;
import X.C02380Bj;
import X.C02390Bk;
import X.C06810Xz;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.versionedparcelable.ParcelImpl;
import com.mod.bomfab.R$styleable;
import java.util.ArrayList;

public class IDxCreatorShape14S0000000_I1 implements Parcelable.Creator {
    public final int A00;

    public IDxCreatorShape14S0000000_I1(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem(parcel);
            case 1:
                return new MediaMetadataCompat(parcel);
            case 2:
                return new RatingCompat(parcel.readInt(), parcel.readFloat());
            case 3:
                return new MediaSessionCompat$QueueItem(parcel);
            case 4:
                return new MediaSessionCompat$ResultReceiverWrapper(parcel);
            case 5:
                return new MediaSessionCompat$Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable((ClassLoader) null) : parcel.readStrongBinder());
            case 6:
                return new ParcelableVolumeInfo(parcel);
            case 7:
                return new PlaybackStateCompat(parcel);
            case 8:
                return new PlaybackStateCompat.CustomAction(parcel);
            case 9:
                return new C06810Xz(parcel);
            case 10:
                return new AnonymousClass0YD(parcel);
            case 11:
                return new AnonymousClass0YA(parcel);
            case 12:
                return new C02370Bi(parcel);
            case 13:
                return new AnonymousClass0Y7(parcel.readBundle(getClass().getClassLoader()));
            case 14:
                return new C02390Bk(parcel);
            case 15:
                return new AnonymousClass0YC(parcel);
            case 16:
                return new AnonymousClass0Y9(parcel);
            case 17:
                return new AnonymousClass0YB(parcel);
            case 18:
                return new AnonymousClass0YF(parcel);
            case 19:
                return new AnonymousClass0FH(parcel);
            case 20:
                return new AnonymousClass0FI(parcel);
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return new AnonymousClass0FJ(parcel);
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return new AnonymousClass0Bb(parcel);
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return new AnonymousClass0FK(parcel);
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return new AnonymousClass0FM(parcel);
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return new AnonymousClass0FL(parcel);
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return new AnonymousClass0YI(parcel);
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return new AnonymousClass0YE(parcel);
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return new AnonymousClass0YJ(parcel);
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return new ParcelImpl(parcel);
            case 30:
                return new C02380Bj(parcel);
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                AnonymousClass0Y6 r1 = new AnonymousClass0Y6(parcel.readString());
                r1.A04 = parcel.readString();
                r1.A0B = parcel.readString();
                r1.A02 = parcel.readString();
                r1.A0A = parcel.readString();
                r1.A03 = parcel.readString();
                r1.A05 = parcel.readString();
                r1.A06 = parcel.readString();
                r1.A07 = parcel.readString();
                r1.A00 = parcel.readFloat();
                r1.A01 = parcel.readFloat();
                ArrayList A0u = AnonymousClass000.A0u();
                r1.A0C = A0u;
                parcel.readStringList(A0u);
                r1.A09 = parcel.readString();
                return r1;
            case 32:
                return new AnonymousClass0YG(parcel);
            default:
                return new AnonymousClass0YH(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i2) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i2];
            case 1:
                return new MediaMetadataCompat[i2];
            case 2:
                return new RatingCompat[i2];
            case 3:
                return new MediaSessionCompat$QueueItem[i2];
            case 4:
                return new MediaSessionCompat$ResultReceiverWrapper[i2];
            case 5:
                return new MediaSessionCompat$Token[i2];
            case 6:
                return new ParcelableVolumeInfo[i2];
            case 7:
                return new PlaybackStateCompat[i2];
            case 8:
                return new PlaybackStateCompat.CustomAction[i2];
            case 9:
                return new C06810Xz[i2];
            case 10:
                return new AnonymousClass0YD[i2];
            case 11:
                return new AnonymousClass0YA[i2];
            case 12:
                return new C02370Bi[i2];
            case 13:
                return new AnonymousClass0Y7[i2];
            case 14:
                return new C02390Bk[i2];
            case 15:
                return new AnonymousClass0YC[i2];
            case 16:
                return new AnonymousClass0Y9[i2];
            case 17:
                return new AnonymousClass0YB[i2];
            case 18:
                return new AnonymousClass0YF[i2];
            case 19:
                return new AnonymousClass0FH[i2];
            case 20:
                return new AnonymousClass0FI[i2];
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return new AnonymousClass0FJ[i2];
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return new AnonymousClass0Bb[i2];
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return new AnonymousClass0FK[i2];
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return new AnonymousClass0FM[i2];
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return new AnonymousClass0FL[i2];
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return new AnonymousClass0YI[i2];
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return new AnonymousClass0YE[i2];
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return new AnonymousClass0YJ[i2];
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return new ParcelImpl[i2];
            case 30:
                return new C02380Bj[i2];
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                return new AnonymousClass0Y6[i2];
            case 32:
                return new AnonymousClass0YG[i2];
            default:
                return new AnonymousClass0YH[i2];
        }
    }
}
