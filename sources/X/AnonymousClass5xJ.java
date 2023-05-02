package X;

import android.hardware.Camera;
import com.AssemMods.translator.Language;
import com.mod.bomfab.R$styleable;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5xJ  reason: invalid class name */
public class AnonymousClass5xJ {
    public static final AtomicInteger A05 = new AtomicInteger(Integer.MIN_VALUE);
    public final int A00;
    public final Camera.Parameters A01;
    public final Camera A02;
    public final C111155fQ A03;
    public final C111175fS A04;

    public AnonymousClass5xJ(Camera.Parameters parameters, Camera camera, C111155fQ r3, C111175fS r4, int i2) {
        this.A02 = camera;
        this.A01 = parameters;
        this.A03 = r3;
        this.A04 = r4;
        this.A00 = i2;
    }

    public static String A00(int i2) {
        if (i2 == 0) {
            return Language.AUTO_DETECT;
        }
        switch (i2) {
            case 2:
                return "action";
            case 3:
                return "portrait";
            case 4:
                return "landscape";
            case 5:
                return "night";
            case 6:
                return "night-portrait";
            case 7:
                return "theatre";
            case 8:
                return "beach";
            case 9:
                return "snow";
            case 10:
                return "sunset";
            case 11:
                return "steadyphoto";
            case 12:
                return "fireworks";
            case 13:
                return "sports";
            case 14:
                return "party";
            case 15:
                return "candlelight";
            case 16:
                return "barcode";
            case 17:
                return "hdr";
            default:
                return null;
        }
    }

    public static boolean A01(List list, Object obj) {
        return (list == null || obj == null || !list.contains(obj)) ? false : true;
    }

    public boolean A02(C115835qO r10, Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i2;
        int i3 = r10.A00;
        int i4 = 0;
        if (i3 != 2) {
            if (i3 == 3) {
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0T, this.A03) && !AnonymousClass5x0.A02(AnonymousClass5w4.A07)) {
                    this.A01.setVideoStabilization(booleanValue);
                    this.A04.A07(AnonymousClass5wI.A0W, bool);
                    return true;
                }
            } else if (i3 == 27) {
                Number number = (Number) obj;
                this.A01.setGpsTimestamp(number.longValue());
                this.A04.A07(AnonymousClass5wI.A0H, number);
                return true;
            } else if (i3 == 42) {
                String str6 = (String) obj;
                this.A01.setGpsProcessingMethod(str6);
                this.A04.A07(AnonymousClass5wI.A0G, str6);
                return true;
            } else if (i3 == 45) {
                this.A04.A07(AnonymousClass5wI.A0K, obj);
                return true;
            } else if (i3 == 52) {
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0B, this.A03)) {
                    this.A04.A07(AnonymousClass5wI.A0h, (Object) null);
                    throw AnonymousClass000.A0W("getCaptureRequestKeys");
                }
            } else if (i3 != 57) {
                if (i3 != 59) {
                    switch (i3) {
                        case 8:
                            Boolean bool2 = (Boolean) obj;
                            boolean booleanValue2 = bool2.booleanValue();
                            if (!AnonymousClass5x0.A02(AnonymousClass5w4.A06)) {
                                this.A01.setRecordingHint(booleanValue2);
                                this.A04.A07(AnonymousClass5wI.A0n, bool2);
                                return true;
                            }
                            break;
                        case 9:
                            Number number2 = (Number) obj;
                            switch (number2.intValue()) {
                                case 0:
                                    str2 = "fixed";
                                    break;
                                case 1:
                                    str2 = Language.AUTO_DETECT;
                                    break;
                                case 2:
                                    str2 = "macro";
                                    break;
                                case 3:
                                    str2 = "continuous-video";
                                    break;
                                case 4:
                                    str2 = "continuous-picture";
                                    break;
                                case 5:
                                    str2 = "edof";
                                    break;
                                case 6:
                                    str2 = "infinity";
                                    break;
                                default:
                                    return false;
                            }
                            if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0k, this.A03), number2)) {
                                this.A01.setFocusMode(str2);
                                this.A04.A07(AnonymousClass5wI.A0C, number2);
                                return true;
                            }
                            break;
                        case 10:
                            Number number3 = (Number) obj;
                            int intValue = number3.intValue();
                            if (intValue == 0) {
                                str3 = "off";
                            } else if (intValue == 1) {
                                str3 = "on";
                            } else if (intValue == 2) {
                                str3 = Language.AUTO_DETECT;
                            } else if (intValue == 3) {
                                str3 = "torch";
                            } else if (intValue == 4) {
                                str3 = "red-eye";
                            }
                            if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0j, this.A03), number3)) {
                                this.A01.setFlashMode(str3);
                                this.A04.A07(AnonymousClass5wI.A0A, number3);
                                return true;
                            }
                            break;
                        case 11:
                            Number number4 = (Number) obj;
                            int intValue2 = number4.intValue();
                            if (intValue2 == 0) {
                                str4 = "off";
                            } else if (intValue2 == 1) {
                                str4 = "50hz";
                            } else if (intValue2 == 2) {
                                str4 = "60hz";
                            } else if (intValue2 == 3) {
                                str4 = Language.AUTO_DETECT;
                            }
                            if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0e, this.A03), number4)) {
                                this.A01.setAntibanding(str4);
                                this.A04.A07(AnonymousClass5wI.A00, number4);
                                return true;
                            }
                            break;
                        case 12:
                            Number number5 = (Number) obj;
                            switch (number5.intValue()) {
                                case 0:
                                    str = "none";
                                    break;
                                case 1:
                                    str = "mono";
                                    break;
                                case 2:
                                    str = "negative";
                                    break;
                                case 3:
                                    str = "solarize";
                                    break;
                                case 4:
                                    str = "sepia";
                                    break;
                                case 5:
                                    str = "posterize";
                                    break;
                                case 6:
                                    str = "whiteboard";
                                    break;
                                case 7:
                                    str = "blackboard";
                                    break;
                                case 8:
                                    str = "aqua";
                                    break;
                            }
                            if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0g, this.A03), number5)) {
                                this.A01.setColorEffect(str);
                                this.A04.A07(AnonymousClass5wI.A06, number5);
                                return true;
                            }
                            break;
                        case 13:
                            Number number6 = (Number) obj;
                            int intValue3 = number6.intValue();
                            if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0C, this.A03)) {
                                this.A01.setExposureCompensation(intValue3);
                                this.A04.A07(AnonymousClass5wI.A08, number6);
                                return true;
                            }
                            break;
                        case 14:
                            Number number7 = (Number) obj;
                            int intValue4 = number7.intValue();
                            if (intValue4 > 0 && intValue4 <= 100) {
                                this.A01.setJpegQuality(intValue4);
                                this.A04.A07(AnonymousClass5wI.A0X, number7);
                                return true;
                            }
                        case 15:
                            Number number8 = (Number) obj;
                            int intValue5 = number8.intValue();
                            if (intValue5 > 0 && intValue5 <= 100) {
                                this.A01.setJpegThumbnailQuality(intValue5);
                                this.A04.A07(AnonymousClass5wI.A0Y, number8);
                                return true;
                            }
                        default:
                            switch (i3) {
                                case 17:
                                    Number number9 = (Number) obj;
                                    int intValue6 = number9.intValue();
                                    if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0m, this.A03), number9)) {
                                        this.A01.setPictureFormat(intValue6);
                                        this.A04.A07(AnonymousClass5wI.A0e, number9);
                                        return true;
                                    }
                                    break;
                                case 18:
                                    Number number10 = (Number) obj;
                                    int intValue7 = number10.intValue();
                                    if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0o, this.A03), number10)) {
                                        this.A01.setPreviewFormat(intValue7);
                                        this.A04.A07(AnonymousClass5wI.A0i, number10);
                                        return true;
                                    }
                                    break;
                                case 19:
                                    Number number11 = (Number) obj;
                                    int intValue8 = number11.intValue();
                                    if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0q, this.A03), number11)) {
                                        this.A01.setPreviewFrameRate(intValue8);
                                        this.A04.A07(AnonymousClass5wI.A0k, number11);
                                        return true;
                                    }
                                    break;
                                default:
                                    switch (i3) {
                                        case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                                            Number number12 = (Number) obj;
                                            int intValue9 = number12.intValue();
                                            Camera.Parameters parameters = this.A01;
                                            parameters.setRotation(intValue9);
                                            C111175fS r1 = this.A04;
                                            r1.A07(AnonymousClass5wI.A0c, number12);
                                            if (AnonymousClass000.A1X(r1.A05(AnonymousClass5wI.A0S))) {
                                                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0E, this.A03)) {
                                                    if (intValue9 == 90 || intValue9 == 270) {
                                                        parameters.set("snapshot-picture-flip", "flip-v");
                                                        return true;
                                                    }
                                                    parameters.set("snapshot-picture-flip", "flip-h");
                                                    return true;
                                                }
                                            }
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                                            Number number13 = (Number) obj;
                                            int intValue10 = number13.intValue();
                                            C117345sq r0 = this.A03.A00;
                                            if (r0 != null) {
                                                this.A01.set(r0.A03, (String) r0.A01.get(intValue10));
                                                this.A04.A07(AnonymousClass5wI.A0I, number13);
                                                return true;
                                            }
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                                            Number number14 = (Number) obj;
                                            String A002 = A00(number14.intValue());
                                            if (A002 != null) {
                                                if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0t, this.A03), number14)) {
                                                    this.A01.setSceneMode(A002);
                                                    this.A04.A07(AnonymousClass5wI.A0o, number14);
                                                    return true;
                                                }
                                            }
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                                            Number number15 = (Number) obj;
                                            switch (number15.intValue()) {
                                                case 1:
                                                    str5 = Language.AUTO_DETECT;
                                                    break;
                                                case 2:
                                                    str5 = "incandescent";
                                                    break;
                                                case 3:
                                                    str5 = "fluorescent";
                                                    break;
                                                case 4:
                                                    str5 = "warm-fluorescent";
                                                    break;
                                                case 5:
                                                    str5 = "daylight";
                                                    break;
                                                case 6:
                                                    str5 = "cloudy-daylight";
                                                    break;
                                                case 7:
                                                    str5 = "twilight";
                                                    break;
                                                case 8:
                                                    str5 = "shade";
                                                    break;
                                                default:
                                                    return false;
                                            }
                                            if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0v, this.A03), number15)) {
                                                this.A01.setWhiteBalance(str5);
                                                this.A04.A07(AnonymousClass5wI.A0t, number15);
                                                return true;
                                            }
                                            break;
                                        case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                                            Number number16 = (Number) obj;
                                            int intValue11 = number16.intValue();
                                            if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0W, this.A03)) {
                                                this.A01.setZoom(intValue11);
                                                this.A04.A07(AnonymousClass5wI.A0v, number16);
                                                return true;
                                            }
                                            break;
                                        default:
                                            List list = null;
                                            switch (i3) {
                                                case 30:
                                                    Number number17 = (Number) obj;
                                                    this.A01.setGpsAltitude(number17.doubleValue());
                                                    this.A04.A07(AnonymousClass5wI.A0D, number17);
                                                    return true;
                                                case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                                                    Number number18 = (Number) obj;
                                                    this.A01.setGpsLongitude(number18.doubleValue());
                                                    this.A04.A07(AnonymousClass5wI.A0F, number18);
                                                    return true;
                                                case 32:
                                                    Number number19 = (Number) obj;
                                                    this.A01.setGpsLatitude(number19.doubleValue());
                                                    this.A04.A07(AnonymousClass5wI.A0E, number19);
                                                    return true;
                                                case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                                                    AnonymousClass5vQ r11 = (AnonymousClass5vQ) obj;
                                                    if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0r, this.A03), r11)) {
                                                        this.A01.setPreviewSize(r11.A02, r11.A01);
                                                        this.A04.A07(AnonymousClass5wI.A0m, r11);
                                                        return true;
                                                    }
                                                    break;
                                                case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                                                    AnonymousClass5vQ r112 = (AnonymousClass5vQ) obj;
                                                    if (A01(AnonymousClass5wJ.A01(AnonymousClass5wJ.A0n, this.A03), r112)) {
                                                        this.A01.setPictureSize(r112.A02, r112.A01);
                                                        this.A04.A07(AnonymousClass5wI.A0g, r112);
                                                        return true;
                                                    }
                                                    break;
                                                case R$styleable.FloatingActionMenu_menu_backgroundColor /*35*/:
                                                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0B, this.A03)) {
                                                        this.A01.set("video-size", obj.toString());
                                                    }
                                                    this.A04.A07(AnonymousClass5wI.A0s, obj);
                                                    return true;
                                                case R$styleable.FloatingActionMenu_menu_fab_label /*36*/:
                                                    AnonymousClass5vQ r113 = (AnonymousClass5vQ) obj;
                                                    this.A01.setJpegThumbnailSize(r113.A02, r113.A01);
                                                    this.A04.A07(AnonymousClass5wI.A0Z, r113);
                                                    return true;
                                                case R$styleable.FloatingActionMenu_menu_fab_show_animation /*37*/:
                                                    List list2 = (List) obj;
                                                    C111155fQ r2 = this.A03;
                                                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0O, r2) && list2.size() <= AnonymousClass000.A0D(r2.A03(AnonymousClass5wJ.A0Y))) {
                                                        Camera.Parameters parameters2 = this.A01;
                                                        if (!list2.isEmpty()) {
                                                            list = list2;
                                                        }
                                                        parameters2.setFocusAreas(list);
                                                        this.A04.A07(AnonymousClass5wI.A0B, list2);
                                                        return true;
                                                    }
                                                case R$styleable.FloatingActionMenu_menu_fab_hide_animation /*38*/:
                                                    List list3 = (List) obj;
                                                    C111155fQ r22 = this.A03;
                                                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0P, r22) && list3.size() <= AnonymousClass000.A0D(r22.A03(AnonymousClass5wJ.A0Z))) {
                                                        Camera.Parameters parameters3 = this.A01;
                                                        if (!list3.isEmpty()) {
                                                            list = list3;
                                                        }
                                                        parameters3.setMeteringAreas(list);
                                                        this.A04.A07(AnonymousClass5wI.A0b, list3);
                                                        return true;
                                                    }
                                                case 39:
                                                    int[] iArr = (int[]) obj;
                                                    List<int[]> A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0p, this.A03);
                                                    if (!(A012 == null || iArr == null)) {
                                                        for (int[] iArr2 : A012) {
                                                            int i5 = iArr2[0];
                                                            int i6 = iArr[0];
                                                            if (i5 == i6 && iArr2[1] == (i2 = iArr[1])) {
                                                                this.A01.setPreviewFpsRange(i6, i2);
                                                                this.A04.A07(AnonymousClass5wI.A0j, iArr);
                                                                break;
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    throw AnonymousClass000.A0a(C13680ns.A0c(i3, "Invalid Settings key: "));
                                            }
                                            break;
                                    }
                            }
                    }
                } else {
                    C111175fS r8 = this.A04;
                    if (AnonymousClass000.A1X(r8.A05(AnonymousClass5wI.A0S))) {
                        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0E, this.A03)) {
                            Number number20 = (Number) obj;
                            int intValue12 = number20.intValue();
                            r8.A07(AnonymousClass5wI.A0r, number20);
                            if (intValue12 == 90 || intValue12 == 270) {
                                this.A01.set("video-flip", "flip-v");
                                return true;
                            }
                            this.A01.set("video-flip", "flip-h");
                            return true;
                        }
                    }
                }
            } else if (this.A00 == 1) {
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0E, this.A03)) {
                    this.A04.A07(AnonymousClass5wI.A0S, obj);
                    return true;
                }
            }
            return false;
        }
        boolean A1X = AnonymousClass000.A1X(obj);
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0G, this.A03)) {
            if (A1X) {
                i4 = 17;
            }
            this.A01.setSceneMode(A00(i4));
            this.A04.A07(AnonymousClass5wI.A0o, Integer.valueOf(i4));
            if (A1X) {
                A02(AnonymousClass5wI.A0n, Boolean.FALSE);
                return true;
            }
        }
        return false;
        return true;
    }
}
