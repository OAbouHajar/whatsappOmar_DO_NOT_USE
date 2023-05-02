package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass01Q;
import X.AnonymousClass03H;
import X.AnonymousClass1US;
import X.AnonymousClass1WJ;
import X.AnonymousClass1WN;
import X.AnonymousClass3K4;
import X.C15820ru;
import X.C15840rx;
import X.C16030sJ;
import X.C16740tZ;
import X.C16960tx;
import X.C17340uv;
import X.C30991dI;
import X.C34181jp;
import X.C34251jx;
import X.C34271jz;
import X.C34291k1;
import X.C35641mG;
import X.C37831po;
import X.C37841pp;
import X.C37851pq;
import X.C37861pr;
import X.C37871ps;
import X.C37881pt;
import X.C37891pu;
import X.C37901pv;
import X.C37911pw;
import X.C37921px;
import X.C37931py;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Pair;
import com.mod.bomfab.R$styleable;
import com.whatsapp.jid.Jid;
import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.pjsip.PjCameraInfo;

public class IDxComparatorShape19S0000000_2_I0 implements Comparator {
    public final int A00;

    public IDxComparatorShape19S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return Long.valueOf(((File) obj2).lastModified()).compareTo(Long.valueOf(((File) obj).lastModified()));
            case 1:
                return AnonymousClass03H.A00(((C34271jz) obj2).A00, ((C34271jz) obj).A00);
            case 2:
                return AnonymousClass03H.A00(((C34251jx) obj).A01.A00, ((C34251jx) obj2).A01.A00);
            case 3:
                C34291k1 r8 = (C34291k1) obj;
                C34291k1 r9 = (C34291k1) obj2;
                int A002 = AnonymousClass03H.A00(r9.A00, r8.A00);
                if (A002 != 0) {
                    return A002;
                }
                int compareTo = r8.A03.compareTo(r9.A03);
                return compareTo == 0 ? r8.A02.compareTo(r9.A02) : compareTo;
            case 4:
                C34291k1 r82 = (C34291k1) obj;
                C34291k1 r92 = (C34291k1) obj2;
                int A003 = AnonymousClass03H.A00(r92.A01, r82.A01);
                if (A003 != 0) {
                    return A003;
                }
                int compareTo2 = r92.A03.compareTo(r82.A03);
                return compareTo2 == 0 ? r92.A02.compareTo(r82.A02) : compareTo2;
            case 5:
            case 6:
                return (((C37931py) obj2).A00 > ((C37931py) obj).A00 ? 1 : (((C37931py) obj2).A00 == ((C37931py) obj).A00 ? 0 : -1));
            case 7:
                return (((C35641mG) obj2).A00 > ((C35641mG) obj).A00 ? 1 : (((C35641mG) obj2).A00 == ((C35641mG) obj).A00 ? 0 : -1));
            case 8:
                return Double.compare(((AnonymousClass1US) obj).A00, ((AnonymousClass1US) obj2).A00);
            case 9:
                C37921px r83 = (C37921px) obj;
                C37921px r93 = (C37921px) obj2;
                if (!r83.A00()) {
                    return r93.A00() ? 1 : 0;
                }
                if (r93.A00()) {
                    return AnonymousClass03H.A00(AnonymousClass000.A0D(r83.A05.second), AnonymousClass000.A0D(r93.A05.second));
                }
                return -1;
            case 10:
                return -AnonymousClass03H.A00(((C37921px) obj).A03, ((C37921px) obj2).A03);
            case 11:
                return AnonymousClass000.A0D(((C37921px) obj).A05.first) > AnonymousClass000.A0D(((C37921px) obj2).A05.first) ? 1 : -1;
            case 12:
                Camera.Size size = (Camera.Size) obj;
                Camera.Size size2 = (Camera.Size) obj2;
                return AnonymousClass03H.A00(size.width * size.height, size2.width * size2.height);
            case 13:
                Camera.Size size3 = (Camera.Size) obj;
                Camera.Size size4 = (Camera.Size) obj2;
                return AnonymousClass03H.A00(size4.width * size4.height, size3.width * size3.height);
            case 14:
                return (((AnonymousClass1WJ) obj2).A04 > ((AnonymousClass1WJ) obj).A04 ? 1 : (((AnonymousClass1WJ) obj2).A04 == ((AnonymousClass1WJ) obj).A04 ? 0 : -1));
            case 15:
                C15820ru r84 = (C15820ru) obj;
                C15820ru r94 = (C15820ru) obj2;
                long j2 = r84.A00;
                long j3 = r94.A00;
                return j2 == j3 ? r84.A01.compareTo((Jid) r94.A01) : j2 < j3 ? 1 : -1;
            case 18:
                return ((C37911pw) ((Map.Entry) obj2).getValue()).compareTo((C37911pw) ((Map.Entry) obj).getValue());
            case 19:
                return ((Integer) ((Map.Entry) obj2).getValue()).compareTo((Integer) ((Map.Entry) obj).getValue());
            case 20:
                return (int) (((C16740tZ) obj).A13 - ((C16740tZ) obj2).A13);
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                AnonymousClass1WN r85 = (AnonymousClass1WN) obj;
                AnonymousClass1WN r95 = (AnonymousClass1WN) obj2;
                long j4 = r85.A01;
                return (!(j4 == 0 && r95.A01 == 0) && (j4 == 0 || r95.A01 == 0)) ? j4 != 0 ? 1 : -1 : (r95.A00 > r85.A00 ? 1 : (r95.A00 == r85.A00 ? 0 : -1));
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return (((C37901pv) obj2).A00 > ((C37901pv) obj).A00 ? 1 : (((C37901pv) obj2).A00 == ((C37901pv) obj).A00 ? 0 : -1));
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return (((File) obj).lastModified() > ((File) obj2).lastModified() ? 1 : (((File) obj).lastModified() == ((File) obj2).lastModified() ? 0 : -1));
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                C37891pu r86 = (C37891pu) obj;
                C37891pu r96 = (C37891pu) obj2;
                float AH5 = r86.AH5();
                float AH52 = r96.AH5();
                return ((double) AnonymousClass3K4.A01(AH5, AH52)) < 0.001d ? (r96.A9n() > r86.A9n() ? 1 : (r96.A9n() == r86.A9n() ? 0 : -1)) : Float.compare(AH52, AH5);
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return C34181jp.A00(Long.valueOf(((C37831po) obj2).A0A), Long.valueOf(((C37831po) obj).A0A));
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return C34181jp.A00(Long.valueOf(((C15840rx) obj2).A02()), Long.valueOf(((C15840rx) obj).A02()));
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return ((Point) ((AnonymousClass01Q) obj).A01).y - ((Point) ((AnonymousClass01Q) obj2).A01).y;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return ((Point) ((AnonymousClass01Q) obj).A01).x - ((Point) ((AnonymousClass01Q) obj2).A01).x;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return ((C37881pt) obj).A04.compareTo(((C37881pt) obj2).A04);
            case 30:
                return C17340uv.A00((Pair) obj, (Pair) obj2);
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                List list = (List) obj;
                List list2 = (List) obj2;
                return (((C37871ps) list.get(list.size() - 1)).A00.A0I > ((C37871ps) list2.get(list2.size() - 1)).A00.A0I ? 1 : (((C37871ps) list.get(list.size() - 1)).A00.A0I == ((C37871ps) list2.get(list2.size() - 1)).A00.A0I ? 0 : -1));
            case 32:
                return ((C37861pr) obj2).AFD() - ((C37861pr) obj).AFD();
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                return (int) (((C16740tZ) obj2).A14 - ((C16740tZ) obj).A14);
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                C16740tZ r87 = (C16740tZ) obj;
                C16740tZ r97 = (C16740tZ) obj2;
                int i2 = (r87.A0I > r97.A0I ? 1 : (r87.A0I == r97.A0I ? 0 : -1));
                return i2 == 0 ? (r87.A14 > r97.A14 ? 1 : (r87.A14 == r97.A14 ? 0 : -1)) : i2;
            case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                return -(((C16740tZ) obj).A0I > ((C16740tZ) obj2).A0I ? 1 : (((C16740tZ) obj).A0I == ((C16740tZ) obj2).A0I ? 0 : -1));
            case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                return (((C16740tZ) obj).A0I > ((C16740tZ) obj2).A0I ? 1 : (((C16740tZ) obj).A0I == ((C16740tZ) obj2).A0I ? 0 : -1));
            case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                return ((C37831po) obj).A0C.A00 - ((C37831po) obj2).A0C.A00;
            case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                return ((File) obj).getName().compareTo(((File) obj2).getName());
            case 39:
                C30991dI r88 = (C30991dI) obj;
                C30991dI r98 = (C30991dI) obj2;
                if (r88.A0B()) {
                    return -1;
                }
                if (r98.A0B()) {
                    return 1;
                }
                if (r88.A02() > 0 && r98.A02() == 0) {
                    return -1;
                }
                if (r88.A02() == 0 && r98.A02() > 0) {
                    return 1;
                }
                if (C16030sJ.A0P(r88.A0B)) {
                    return -1;
                }
                if (!C16030sJ.A0P(r98.A0B)) {
                    return -(r88.A04() > r98.A04() ? 1 : (r88.A04() == r98.A04() ? 0 : -1));
                }
                return 1;
            case 40:
                return -(((C37851pq) obj).A00 > ((C37851pq) obj2).A00 ? 1 : (((C37851pq) obj).A00 == ((C37851pq) obj2).A00 ? 0 : -1));
            case 41:
                return ((File) obj).getName().substring(0, 2).compareTo(((File) obj2).getName().substring(0, 2));
            case 42:
                return ((C16960tx) obj).version - ((C16960tx) obj2).version;
            case 43:
                return PjCameraInfo.lambda$static$0((C37841pp) obj, (C37841pp) obj2);
            default:
                return (((C37831po) obj).A0A > ((C37831po) obj2).A0A ? 1 : (((C37831po) obj).A0A == ((C37831po) obj2).A0A ? 0 : -1));
        }
    }
}
