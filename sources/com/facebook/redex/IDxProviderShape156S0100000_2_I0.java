package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass01J;
import X.AnonymousClass022;
import X.AnonymousClass100;
import X.AnonymousClass10Z;
import X.AnonymousClass1TH;
import X.AnonymousClass1V0;
import X.AnonymousClass1V1;
import X.AnonymousClass1V2;
import X.AnonymousClass1V4;
import X.AnonymousClass1V8;
import X.AnonymousClass1VE;
import X.AnonymousClass1VH;
import X.AnonymousClass1VI;
import X.AnonymousClass3K2;
import X.C13690nt;
import X.C15860rz;
import X.C16190sc;
import X.C16320sq;
import X.C16360su;
import X.C16980tz;
import X.C17020u3;
import X.C27271Rc;
import X.C37781pj;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.view.View;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.AbstractAppShellDelegate;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import com.obwhatsapp.migration.android.view.GoogleMigrateImporterActivity;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

public class IDxProviderShape156S0100000_2_I0 implements AnonymousClass01J {
    public Object A00;
    public final int A01;

    public IDxProviderShape156S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object get() {
        float f2;
        AnonymousClass1VH r0;
        switch (this.A01) {
            case 0:
                return ((AbstractAppShellDelegate) this.A00).lambda$onCreate$2();
            case 1:
                return ((AnonymousClass1VI) this.A00).A08;
            case 3:
            case 4:
            case 5:
                return new AnonymousClass1TH((AnonymousClass100) this.A00);
            case 6:
            case 7:
            case 8:
            case 9:
                return this.A00;
            case 10:
            case 11:
                View view = (View) this.A00;
                return new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            case 12:
                AnonymousClass1VE r1 = (AnonymousClass1VE) this.A00;
                f2 = AnonymousClass3K2.A02(r1.A0H);
                r0 = r1.A0M;
                break;
            case 13:
                return Float.valueOf(AnonymousClass3K2.A02(((AnonymousClass1VE) this.A00).A0C) * 0.45f);
            case 14:
                AnonymousClass1VE r12 = (AnonymousClass1VE) this.A00;
                f2 = AnonymousClass3K2.A02(r12.A0F);
                r0 = r12.A0L;
                break;
            case 15:
                AnonymousClass1VE r2 = (AnonymousClass1VE) this.A00;
                return Float.valueOf(((float) r2.A04.getDimensionPixelSize(R.dimen.dimen0762)) - ((float) ((Rect) r2.A0L.get()).top));
            case 16:
                AnonymousClass1VE r22 = (AnonymousClass1VE) this.A00;
                return Float.valueOf(((float) r22.A04.getDimensionPixelSize(R.dimen.dimen0762)) - ((float) ((Rect) r22.A0M.get()).top));
            case 17:
                return Float.valueOf(AnonymousClass3K2.A02(((AnonymousClass1VE) this.A00).A0C) * 0.55f);
            case 18:
                return ((AnonymousClass1V8) this.A00).A3F();
            case 19:
                return C16190sc.A00((C16190sc) this.A00);
            case 20:
                return ((C17020u3) this.A00).A00(C15860rz.A05);
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                ArrayList A0i = C13690nt.A0i(r3);
                for (int[] r13 : (int[][]) this.A00) {
                    A0i.add(new C37781pj(r13));
                }
                return A0i;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return new PorterDuffColorFilter(C16980tz.A00((C16980tz) this.A00).getColor(R.color.color01f4), PorterDuff.Mode.SRC_ATOP);
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
                return mediaGalleryFragmentBase.A0D.ACN(mediaGalleryFragmentBase.A0E);
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return new AnonymousClass1V4((AnonymousClass10Z) ((AnonymousClass01D) this.A00).get());
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return new AnonymousClass1V2(AnonymousClass000.A0L(), (C16980tz) ((AnonymousClass01D) this.A00).get());
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                AnonymousClass1V1 r02 = (AnonymousClass1V1) this.A00;
                return r02.A00.A7d(r02.A01, new LinkedBlockingQueue(), 0, 1, 1, 60);
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return ((C27271Rc) this.A00).A00.A7d("DocumentCheckQueue", new LinkedBlockingQueue(), 1, 1, 1, 0);
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                ThreadPoolExecutor A7d = ((C16320sq) this.A00).A7d("FileDownloadQueue", new LinkedBlockingQueue(), 1, 1, 10, 5);
                A7d.allowCoreThreadTimeOut(true);
                return A7d;
            case 30:
                ThreadPoolExecutor A7d2 = ((C16320sq) this.A00).A7d("MediaDownload", new PriorityBlockingQueue(), 1, 1, 10, 60);
                A7d2.allowCoreThreadTimeOut(true);
                return A7d2;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                ThreadPoolExecutor A7d3 = ((C16320sq) this.A00).A7d("ThumbnailDownloadQueue", new LinkedBlockingQueue(), 1, 2, 10, 5);
                A7d3.allowCoreThreadTimeOut(true);
                return A7d3;
            case 32:
                return ((AnonymousClass1V0) this.A00).A00.A7d("ProcessImageQueue", new LinkedBlockingQueue(), 4, 4, 1, 0);
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                return ((AnonymousClass1V0) this.A00).A00.A7d("TranscodeQueue", new LinkedBlockingQueue(), 1, 1, 1, 0);
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                ThreadPoolExecutor A7d4 = ((C16320sq) this.A00).A7d("MediaUploadQueue", new LinkedBlockingQueue(), 10, 10, 1, 5);
                A7d4.allowCoreThreadTimeOut(true);
                return A7d4;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                return ((GoogleMigrateImporterActivity) this.A00).A0A(R.drawable.vec_ios_to_android_finished);
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                return ((GoogleMigrateImporterActivity) this.A00).A0A(R.drawable.vec_ios_to_android_error);
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                return ((GoogleMigrateImporterActivity) this.A00).A0A(R.drawable.vec_ios_to_android_in_progress);
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                return ((C16360su) this.A00).A01.A00("migration_export");
            case 41:
                return AnonymousClass022.A01((Context) this.A00);
            default:
                return ((AnonymousClass01J) this.A00).get();
        }
        float height = f2 / ((float) ((Rect) r0.get()).height());
        if (height < 0.0f || height > 1.0f) {
            int i2 = (height > 0.0f ? 1 : (height == 0.0f ? 0 : -1));
            height = 1.0f;
            if (i2 < 0) {
                height = 0.0f;
            }
        }
        return Float.valueOf(1.0f - height);
    }
}
