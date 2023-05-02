package X;

import android.content.Context;
import android.content.IntentFilter;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape1S0101200_I1;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.lang.ref.Reference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.3E2  reason: invalid class name */
public final class AnonymousClass3E2 implements AnonymousClass5LX, AnonymousClass5LZ {
    public static AnonymousClass3E2 A0D;
    public static final C34641kb A0E = C34641kb.of(218000L, 159000L, 145000L, 130000L, 112000L);
    public static final C34641kb A0F = C34641kb.of(2200000L, 1300000L, 930000L, 730000L, 530000L);
    public static final C34641kb A0G = C34641kb.of(4800000L, 2700000L, 1800000L, 1200000L, 630000L);
    public static final C34641kb A0H = C34641kb.of(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);
    public static final C34641kb A0I = C34641kb.of(6100000L, 3800000L, 2100000L, 1300000L, 590000L);
    public static final C67853cU A0J;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final Context A08;
    public final C85744Pt A09;
    public final AnonymousClass5TU A0A;
    public final C88324aJ A0B;
    public final C17930vs A0C;

    static {
        C67833cS builder = C67853cU.builder();
        builder.putAll((Object) "AD", (Object[]) new Integer[]{1, 2, 0, 0, 2});
        Integer[] A062 = A06(1, 4);
        A062[2] = 4;
        A062[3] = 4;
        A062[4] = 1;
        builder.putAll((Object) "AE", (Object[]) A062);
        Integer[] A042 = A04(4);
        A042[2] = 3;
        A042[3] = 4;
        A042[4] = 2;
        builder.putAll((Object) "AF", (Object[]) A042);
        Integer[] A043 = A04(2);
        A043[2] = 1;
        A043[3] = 1;
        A043[4] = 2;
        builder.putAll((Object) "AG", (Object[]) A043);
        Integer[] A063 = A06(1, 2);
        A063[2] = 2;
        A063[3] = 2;
        A063[4] = 2;
        builder.putAll((Object) "AI", (Object[]) A063);
        Integer[] A044 = A04(1);
        A044[2] = 0;
        A044[3] = 1;
        A044[4] = 2;
        builder.putAll((Object) "AL", (Object[]) A044);
        Integer[] A045 = A04(2);
        A045[2] = 1;
        A045[3] = 2;
        A045[4] = 2;
        builder.putAll((Object) "AM", (Object[]) A045);
        Integer[] A064 = A06(3, 4);
        A064[2] = 4;
        A064[3] = 2;
        A064[4] = 2;
        builder.putAll((Object) "AO", (Object[]) A064);
        Integer[] A065 = A06(2, 4);
        A03(A065, 2);
        builder.putAll((Object) "AR", (Object[]) A065);
        Integer[] A046 = A04(2);
        A046[2] = 4;
        A046[3] = 3;
        A046[4] = 2;
        builder.putAll((Object) "AS", (Object[]) A046);
        Integer[] A066 = A06(0, 3);
        A066[2] = 0;
        A066[3] = 0;
        A066[4] = 2;
        builder.putAll((Object) "AT", (Object[]) A066);
        Integer[] A067 = A06(0, 2);
        A067[2] = 0;
        A067[3] = 1;
        A067[4] = 1;
        builder.putAll((Object) "AU", (Object[]) A067);
        Integer[] A068 = A06(1, 2);
        A068[2] = 0;
        A068[3] = 4;
        A068[4] = 2;
        builder.putAll((Object) "AW", (Object[]) A068);
        Integer[] A069 = A06(0, 2);
        A069[2] = 2;
        A069[3] = 2;
        A069[4] = 2;
        builder.putAll((Object) "AX", (Object[]) A069);
        Integer[] A052 = A05(3);
        A052[3] = 4;
        A052[4] = 2;
        builder.putAll((Object) "AZ", (Object[]) A052);
        Integer[] A047 = A04(1);
        A047[2] = 0;
        A047[3] = 1;
        A047[4] = 2;
        builder.putAll((Object) "BA", (Object[]) A047);
        Integer[] A0610 = A06(0, 2);
        A0610[2] = 0;
        A0610[3] = 0;
        A0610[4] = 2;
        builder.putAll((Object) "BB", (Object[]) A0610);
        Integer[] A0611 = A06(2, 0);
        A0611[2] = 3;
        A0611[3] = 3;
        A0611[4] = 2;
        builder.putAll((Object) "BD", (Object[]) A0611);
        Integer[] A0612 = A06(0, 1);
        A0612[2] = 2;
        A0612[3] = 3;
        A0612[4] = 2;
        builder.putAll((Object) "BE", (Object[]) A0612);
        Integer[] A053 = A05(4);
        A053[3] = 2;
        A053[4] = 2;
        builder.putAll((Object) "BF", (Object[]) A053);
        Integer[] A0613 = A06(0, 1);
        A0613[2] = 0;
        A0613[3] = 0;
        A0613[4] = 2;
        builder.putAll((Object) "BG", (Object[]) A0613);
        Integer[] A0614 = A06(1, 0);
        A0614[2] = 2;
        A0614[3] = 4;
        A0614[4] = 2;
        builder.putAll((Object) "BH", (Object[]) A0614);
        Integer[] A054 = A05(4);
        A054[3] = 4;
        A054[4] = 2;
        builder.putAll((Object) "BI", (Object[]) A054);
        Integer[] A048 = A04(4);
        A048[2] = 3;
        A048[3] = 4;
        A048[4] = 2;
        builder.putAll((Object) "BJ", (Object[]) A048);
        Integer[] A0615 = A06(1, 2);
        A0615[2] = 2;
        A0615[3] = 2;
        A0615[4] = 2;
        builder.putAll((Object) "BL", (Object[]) A0615);
        Integer[] A0616 = A06(1, 2);
        A0616[2] = 0;
        A0616[3] = 0;
        A0616[4] = 2;
        builder.putAll((Object) "BM", (Object[]) A0616);
        Integer[] A0617 = A06(4, 0);
        A0617[2] = 1;
        A0617[3] = 1;
        A0617[4] = 2;
        builder.putAll((Object) "BN", (Object[]) A0617);
        Integer[] A0618 = A06(2, 3);
        A0618[2] = 3;
        A0618[3] = 2;
        A0618[4] = 2;
        builder.putAll((Object) "BO", (Object[]) A0618);
        Integer[] A0619 = A06(1, 2);
        A0619[2] = 1;
        A0619[3] = 2;
        A0619[4] = 2;
        builder.putAll((Object) "BQ", (Object[]) A0619);
        Integer[] A0620 = A06(2, 4);
        A0620[2] = 2;
        A0620[3] = 1;
        A0620[4] = 2;
        builder.putAll((Object) "BR", (Object[]) A0620);
        Integer[] A0621 = A06(3, 2);
        A0621[2] = 2;
        A0621[3] = 3;
        A0621[4] = 2;
        builder.putAll((Object) "BS", (Object[]) A0621);
        Integer[] A0622 = A06(3, 0);
        A0622[2] = 3;
        A0622[3] = 2;
        A0622[4] = 2;
        builder.putAll((Object) "BT", (Object[]) A0622);
        Integer[] A0623 = A06(3, 4);
        A03(A0623, 2);
        builder.putAll((Object) "BW", (Object[]) A0623);
        Integer[] A0624 = A06(1, 0);
        A0624[2] = 2;
        A0624[3] = 1;
        A0624[4] = 2;
        builder.putAll((Object) "BY", (Object[]) A0624);
        Integer[] A055 = A05(2);
        A055[3] = 1;
        A055[4] = 2;
        builder.putAll((Object) "BZ", (Object[]) A055);
        Integer[] A0625 = A06(0, 3);
        A0625[2] = 1;
        A0625[3] = 2;
        A0625[4] = 3;
        builder.putAll((Object) "CA", (Object[]) A0625);
        Integer[] A0626 = A06(4, 3);
        A03(A0626, 2);
        builder.putAll((Object) "CD", (Object[]) A0626);
        Integer[] A0627 = A06(4, 2);
        A0627[2] = 2;
        A0627[3] = 2;
        A0627[4] = 2;
        builder.putAll((Object) "CF", (Object[]) A0627);
        Integer[] A0628 = A06(3, 4);
        A0628[2] = 1;
        A0628[3] = 1;
        A0628[4] = 2;
        builder.putAll((Object) "CG", (Object[]) A0628);
        Integer[] A0629 = A06(0, 1);
        A03(A0629, 0);
        builder.putAll((Object) "CH", (Object[]) A0629);
        Integer[] A056 = A05(3);
        A056[3] = 3;
        A056[4] = 2;
        builder.putAll((Object) "CI", (Object[]) A056);
        Integer[] A0630 = A06(3, 2);
        A0630[2] = 1;
        A0630[3] = 0;
        A0630[4] = 2;
        builder.putAll((Object) "CK", (Object[]) A0630);
        Integer[] A049 = A04(1);
        A049[2] = 2;
        A049[3] = 3;
        A049[4] = 2;
        builder.putAll((Object) "CL", (Object[]) A049);
        Integer[] A0631 = A06(3, 4);
        A0631[2] = 3;
        A0631[3] = 2;
        A0631[4] = 2;
        builder.putAll((Object) "CM", (Object[]) A0631);
        Integer[] A057 = A05(2);
        A057[3] = 1;
        A057[4] = 3;
        builder.putAll((Object) "CN", (Object[]) A057);
        Integer[] A0632 = A06(2, 4);
        A0632[2] = 3;
        A0632[3] = 2;
        A0632[4] = 2;
        builder.putAll((Object) "CO", (Object[]) A0632);
        Integer[] A0633 = A06(2, 3);
        A0633[2] = 4;
        A0633[3] = 4;
        A0633[4] = 2;
        builder.putAll((Object) "CR", (Object[]) A0633);
        Integer[] A0410 = A04(4);
        A0410[2] = 2;
        A0410[3] = 1;
        A0410[4] = 2;
        builder.putAll((Object) "CU", (Object[]) A0410);
        Integer[] A0634 = A06(2, 3);
        A0634[2] = 3;
        A0634[3] = 3;
        A0634[4] = 2;
        builder.putAll((Object) "CV", (Object[]) A0634);
        Integer[] A0635 = A06(1, 2);
        A0635[2] = 0;
        A0635[3] = 0;
        A0635[4] = 2;
        builder.putAll((Object) "CW", (Object[]) A0635);
        Integer[] A0636 = A06(1, 2);
        A0636[2] = 0;
        A0636[3] = 0;
        A0636[4] = 2;
        builder.putAll((Object) "CY", (Object[]) A0636);
        Integer[] A0637 = A06(0, 1);
        A0637[2] = 0;
        A0637[3] = 0;
        A0637[4] = 2;
        builder.putAll((Object) "CZ", (Object[]) A0637);
        Integer[] A0638 = A06(0, 1);
        A0638[2] = 1;
        A0638[3] = 2;
        A0638[4] = 0;
        builder.putAll((Object) "DE", (Object[]) A0638);
        Integer[] A0639 = A06(4, 1);
        A0639[2] = 4;
        A0639[3] = 4;
        A0639[4] = 2;
        builder.putAll((Object) "DJ", (Object[]) A0639);
        Integer[] A0411 = A04(0);
        A0411[2] = 1;
        A0411[3] = 0;
        A0411[4] = 2;
        builder.putAll((Object) "DK", (Object[]) A0411);
        Integer[] A0640 = A06(1, 2);
        A0640[2] = 2;
        A0640[3] = 2;
        A0640[4] = 2;
        builder.putAll((Object) "DM", (Object[]) A0640);
        Integer[] A0641 = A06(3, 4);
        A0641[2] = 4;
        A0641[3] = 4;
        A0641[4] = 2;
        builder.putAll((Object) "DO", (Object[]) A0641);
        Integer[] A0642 = A06(3, 2);
        A0642[2] = 4;
        A0642[3] = 4;
        A0642[4] = 2;
        builder.putAll((Object) "DZ", (Object[]) A0642);
        Integer[] A0643 = A06(2, 4);
        A0643[2] = 3;
        A0643[3] = 2;
        A0643[4] = 2;
        builder.putAll((Object) "EC", (Object[]) A0643);
        Integer[] A058 = A05(0);
        A058[3] = 0;
        A058[4] = 2;
        builder.putAll((Object) "EE", (Object[]) A058);
        Integer[] A0644 = A06(3, 4);
        A0644[2] = 2;
        A0644[3] = 1;
        A0644[4] = 2;
        builder.putAll((Object) "EG", (Object[]) A0644);
        Integer[] A059 = A05(2);
        A059[3] = 2;
        A059[4] = 2;
        builder.putAll((Object) "EH", (Object[]) A059);
        Integer[] A0645 = A06(4, 2);
        A0645[2] = 2;
        A0645[3] = 2;
        A0645[4] = 2;
        builder.putAll((Object) "ER", (Object[]) A0645);
        Integer[] A0646 = A06(0, 1);
        A0646[2] = 2;
        A0646[3] = 1;
        A0646[4] = 2;
        builder.putAll((Object) "ES", (Object[]) A0646);
        Integer[] A0510 = A05(4);
        A0510[3] = 1;
        A0510[4] = 2;
        builder.putAll((Object) "ET", (Object[]) A0510);
        Integer[] A0412 = A04(0);
        A0412[2] = 1;
        A0412[3] = 0;
        A0412[4] = 0;
        builder.putAll((Object) "FI", (Object[]) A0412);
        Integer[] A0647 = A06(3, 0);
        A0647[2] = 3;
        A0647[3] = 3;
        A0647[4] = 2;
        builder.putAll((Object) "FJ", (Object[]) A0647);
        Integer[] A0511 = A05(2);
        A0511[3] = 2;
        A0511[4] = 2;
        builder.putAll((Object) "FK", (Object[]) A0511);
        Integer[] A0648 = A06(4, 2);
        A0648[2] = 4;
        A0648[3] = 3;
        A0648[4] = 2;
        builder.putAll((Object) "FM", (Object[]) A0648);
        Integer[] A0649 = A06(0, 2);
        A0649[2] = 0;
        A0649[3] = 0;
        A0649[4] = 2;
        builder.putAll((Object) "FO", (Object[]) A0649);
        Integer[] A0650 = A06(1, 0);
        A0650[2] = 2;
        A0650[3] = 1;
        A0650[4] = 2;
        builder.putAll((Object) "FR", (Object[]) A0650);
        Integer[] A0413 = A04(3);
        A0413[2] = 1;
        A0413[3] = 0;
        A0413[4] = 2;
        builder.putAll((Object) "GA", (Object[]) A0413);
        Integer[] A0414 = A04(0);
        A0414[2] = 1;
        A0414[3] = 2;
        A0414[4] = 2;
        builder.putAll((Object) "GB", (Object[]) A0414);
        Integer[] A0651 = A06(1, 2);
        A0651[2] = 2;
        A0651[3] = 2;
        A0651[4] = 2;
        builder.putAll((Object) "GD", (Object[]) A0651);
        Integer[] A0652 = A06(1, 0);
        A0652[2] = 1;
        A0652[3] = 3;
        A0652[4] = 2;
        builder.putAll((Object) "GE", (Object[]) A0652);
        Integer[] A0512 = A05(2);
        A0512[3] = 4;
        A0512[4] = 2;
        builder.putAll((Object) "GF", (Object[]) A0512);
        Integer[] A0653 = A06(0, 2);
        A0653[2] = 0;
        A0653[3] = 0;
        A0653[4] = 2;
        builder.putAll((Object) "GG", (Object[]) A0653);
        Integer[] A0654 = A06(3, 2);
        A0654[2] = 3;
        A0654[3] = 2;
        A0654[4] = 2;
        builder.putAll((Object) "GH", (Object[]) A0654);
        Integer[] A0655 = A06(0, 2);
        A0655[2] = 0;
        A0655[3] = 0;
        A0655[4] = 2;
        builder.putAll((Object) "GI", (Object[]) A0655);
        Integer[] A0656 = A06(1, 2);
        A0656[2] = 2;
        A0656[3] = 1;
        A0656[4] = 2;
        builder.putAll((Object) "GL", (Object[]) A0656);
        Integer[] A0657 = A06(4, 3);
        A0657[2] = 2;
        A0657[3] = 4;
        A0657[4] = 2;
        builder.putAll((Object) "GM", (Object[]) A0657);
        Integer[] A0658 = A06(4, 3);
        A0658[2] = 4;
        A0658[3] = 2;
        A0658[4] = 2;
        builder.putAll((Object) "GN", (Object[]) A0658);
        Integer[] A0415 = A04(2);
        A0415[2] = 3;
        A0415[3] = 4;
        A0415[4] = 2;
        builder.putAll((Object) "GP", (Object[]) A0415);
        Integer[] A0659 = A06(4, 2);
        A0659[2] = 3;
        A0659[3] = 4;
        A0659[4] = 2;
        builder.putAll((Object) "GQ", (Object[]) A0659);
        Integer[] A0416 = A04(1);
        A0416[2] = 0;
        A0416[3] = 1;
        A0416[4] = 2;
        builder.putAll((Object) "GR", (Object[]) A0416);
        Integer[] A0660 = A06(3, 2);
        A0660[2] = 3;
        A0660[3] = 2;
        A0660[4] = 2;
        builder.putAll((Object) "GT", (Object[]) A0660);
        Integer[] A0661 = A06(1, 2);
        A0661[2] = 4;
        A0661[3] = 4;
        A0661[4] = 2;
        builder.putAll((Object) "GU", (Object[]) A0661);
        Integer[] A0662 = A06(3, 4);
        A0662[2] = 4;
        A0662[3] = 3;
        A0662[4] = 2;
        builder.putAll((Object) "GW", (Object[]) A0662);
        Integer[] A0417 = A04(3);
        A0417[2] = 1;
        A0417[3] = 0;
        A0417[4] = 2;
        builder.putAll((Object) "GY", (Object[]) A0417);
        Integer[] A0663 = A06(0, 2);
        A0663[2] = 3;
        A0663[3] = 4;
        A0663[4] = 2;
        builder.putAll((Object) "HK", (Object[]) A0663);
        Integer[] A0664 = A06(3, 0);
        A0664[2] = 3;
        A0664[3] = 3;
        A0664[4] = 2;
        builder.putAll((Object) "HN", (Object[]) A0664);
        Integer[] A0418 = A04(1);
        A0418[2] = 0;
        A0418[3] = 1;
        A0418[4] = 2;
        builder.putAll((Object) "HR", (Object[]) A0418);
        Integer[] A0665 = A06(4, 3);
        A0665[2] = 4;
        A0665[3] = 4;
        A0665[4] = 2;
        builder.putAll((Object) "HT", (Object[]) A0665);
        Integer[] A0666 = A06(0, 1);
        A0666[2] = 0;
        A0666[3] = 0;
        A0666[4] = 2;
        builder.putAll((Object) "HU", (Object[]) A0666);
        Integer[] A0667 = A06(3, 2);
        A0667[2] = 2;
        A0667[3] = 3;
        A0667[4] = 2;
        builder.putAll((Object) "ID", (Object[]) A0667);
        Integer[] A0419 = A04(0);
        A0419[2] = 1;
        A0419[3] = 1;
        A0419[4] = 2;
        builder.putAll((Object) "IE", (Object[]) A0419);
        Integer[] A0668 = A06(1, 0);
        A0668[2] = 2;
        A0668[3] = 3;
        A0668[4] = 2;
        builder.putAll((Object) "IL", (Object[]) A0668);
        Integer[] A0669 = A06(0, 2);
        A0669[2] = 0;
        A0669[3] = 1;
        A0669[4] = 2;
        builder.putAll((Object) "IM", (Object[]) A0669);
        Integer[] A0670 = A06(2, 1);
        A0670[2] = 3;
        A0670[3] = 3;
        A0670[4] = 2;
        builder.putAll((Object) "IN", (Object[]) A0670);
        Integer[] A0671 = A06(4, 2);
        A0671[2] = 2;
        A0671[3] = 4;
        A0671[4] = 2;
        builder.putAll((Object) "IO", (Object[]) A0671);
        Integer[] A0672 = A06(3, 2);
        A0672[2] = 4;
        A0672[3] = 3;
        A0672[4] = 2;
        builder.putAll((Object) "IQ", (Object[]) A0672);
        Integer[] A0673 = A06(4, 2);
        A0673[2] = 3;
        A0673[3] = 4;
        A0673[4] = 2;
        builder.putAll((Object) "IR", (Object[]) A0673);
        Integer[] A0674 = A06(0, 2);
        A0674[2] = 0;
        A0674[3] = 0;
        A0674[4] = 2;
        builder.putAll((Object) "IS", (Object[]) A0674);
        Integer[] A0420 = A04(0);
        A0420[2] = 1;
        A0420[3] = 1;
        A0420[4] = 2;
        builder.putAll((Object) "IT", (Object[]) A0420);
        Integer[] A0421 = A04(2);
        A0421[2] = 0;
        A0421[3] = 2;
        A0421[4] = 2;
        builder.putAll((Object) "JE", (Object[]) A0421);
        Integer[] A0422 = A04(3);
        A0422[2] = 4;
        A0422[3] = 4;
        A0422[4] = 2;
        builder.putAll((Object) "JM", (Object[]) A0422);
        Integer[] A0675 = A06(1, 2);
        A0675[2] = 1;
        A0675[3] = 1;
        A0675[4] = 2;
        builder.putAll((Object) "JO", (Object[]) A0675);
        Integer[] A0676 = A06(0, 2);
        A0676[2] = 0;
        A0676[3] = 1;
        A0676[4] = 3;
        builder.putAll((Object) "JP", (Object[]) A0676);
        Integer[] A0677 = A06(3, 4);
        A03(A0677, 2);
        builder.putAll((Object) "KE", (Object[]) A0677);
        Integer[] A0678 = A06(1, 0);
        A03(A0678, 2);
        builder.putAll((Object) "KG", (Object[]) A0678);
        Integer[] A0679 = A06(2, 0);
        A0679[2] = 4;
        A0679[3] = 3;
        A0679[4] = 2;
        builder.putAll((Object) "KH", (Object[]) A0679);
        Integer[] A0680 = A06(4, 2);
        A0680[2] = 3;
        A0680[3] = 1;
        A0680[4] = 2;
        builder.putAll((Object) "KI", (Object[]) A0680);
        Integer[] A0681 = A06(4, 2);
        A0681[2] = 2;
        A0681[3] = 3;
        A0681[4] = 2;
        builder.putAll((Object) "KM", (Object[]) A0681);
        Integer[] A0682 = A06(1, 2);
        A0682[2] = 2;
        A0682[3] = 2;
        A0682[4] = 2;
        builder.putAll((Object) "KN", (Object[]) A0682);
        Integer[] A0683 = A06(4, 2);
        A0683[2] = 2;
        A0683[3] = 2;
        A0683[4] = 2;
        builder.putAll((Object) "KP", (Object[]) A0683);
        Integer[] A0684 = A06(0, 2);
        A03(A0684, 1);
        builder.putAll((Object) "KR", (Object[]) A0684);
        Integer[] A0685 = A06(2, 3);
        A03(A0685, 1);
        builder.putAll((Object) "KW", (Object[]) A0685);
        Integer[] A0686 = A06(1, 2);
        A0686[2] = 0;
        A0686[3] = 0;
        A0686[4] = 2;
        builder.putAll((Object) "KY", (Object[]) A0686);
        Integer[] A0687 = A06(1, 2);
        A0687[2] = 2;
        A0687[3] = 3;
        A0687[4] = 2;
        builder.putAll((Object) "KZ", (Object[]) A0687);
        Integer[] A0423 = A04(2);
        A0423[2] = 1;
        A0423[3] = 1;
        A0423[4] = 2;
        builder.putAll((Object) "LA", (Object[]) A0423);
        Integer[] A0688 = A06(3, 2);
        A0688[2] = 0;
        A0688[3] = 0;
        A0688[4] = 2;
        builder.putAll((Object) "LB", (Object[]) A0688);
        Integer[] A0424 = A04(1);
        A0424[2] = 0;
        A0424[3] = 0;
        A0424[4] = 2;
        builder.putAll((Object) "LC", (Object[]) A0424);
        Integer[] A0689 = A06(0, 2);
        A0689[2] = 2;
        A0689[3] = 2;
        A0689[4] = 2;
        builder.putAll((Object) "LI", (Object[]) A0689);
        Integer[] A0690 = A06(2, 0);
        A0690[2] = 2;
        A0690[3] = 3;
        A0690[4] = 2;
        builder.putAll((Object) "LK", (Object[]) A0690);
        Integer[] A0691 = A06(3, 4);
        A0691[2] = 3;
        A0691[3] = 2;
        A0691[4] = 2;
        builder.putAll((Object) "LR", (Object[]) A0691);
        Integer[] A0425 = A04(3);
        A0425[2] = 2;
        A0425[3] = 3;
        A0425[4] = 2;
        builder.putAll((Object) "LS", (Object[]) A0425);
        Integer[] A0513 = A05(0);
        A0513[3] = 0;
        A0513[4] = 2;
        builder.putAll((Object) "LT", (Object[]) A0513);
        Integer[] A0514 = A05(0);
        A0514[3] = 0;
        A0514[4] = 2;
        builder.putAll((Object) "LU", (Object[]) A0514);
        Integer[] A0515 = A05(0);
        A0515[3] = 0;
        A0515[4] = 2;
        builder.putAll((Object) "LV", (Object[]) A0515);
        Integer[] A0692 = A06(4, 2);
        A0692[2] = 4;
        A0692[3] = 3;
        A0692[4] = 2;
        builder.putAll((Object) "LY", (Object[]) A0692);
        Integer[] A0693 = A06(2, 1);
        A0693[2] = 2;
        A0693[3] = 1;
        A0693[4] = 2;
        builder.putAll((Object) "MA", (Object[]) A0693);
        Integer[] A0694 = A06(0, 2);
        A0694[2] = 2;
        A0694[3] = 2;
        A0694[4] = 2;
        builder.putAll((Object) "MC", (Object[]) A0694);
        Integer[] A0695 = A06(1, 2);
        A0695[2] = 0;
        A0695[3] = 0;
        A0695[4] = 2;
        builder.putAll((Object) "MD", (Object[]) A0695);
        Integer[] A0696 = A06(1, 2);
        A0696[2] = 1;
        A0696[3] = 2;
        A0696[4] = 2;
        builder.putAll((Object) "ME", (Object[]) A0696);
        Integer[] A0697 = A06(1, 2);
        A0697[2] = 1;
        A0697[3] = 0;
        A0697[4] = 2;
        builder.putAll((Object) "MF", (Object[]) A0697);
        Integer[] A0698 = A06(3, 4);
        A0698[2] = 3;
        A0698[3] = 3;
        A0698[4] = 2;
        builder.putAll((Object) "MG", (Object[]) A0698);
        Integer[] A0699 = A06(4, 2);
        A0699[2] = 2;
        A0699[3] = 4;
        A0699[4] = 2;
        builder.putAll((Object) "MH", (Object[]) A0699);
        Integer[] A06100 = A06(1, 0);
        A06100[2] = 0;
        A06100[3] = 0;
        A06100[4] = 2;
        builder.putAll((Object) "MK", (Object[]) A06100);
        Integer[] A0426 = A04(4);
        A0426[2] = 1;
        A0426[3] = 1;
        A0426[4] = 2;
        builder.putAll((Object) "ML", (Object[]) A0426);
        Integer[] A06101 = A06(2, 3);
        A03(A06101, 2);
        builder.putAll((Object) "MM", (Object[]) A06101);
        Integer[] A06102 = A06(2, 4);
        A06102[2] = 1;
        A06102[3] = 1;
        A06102[4] = 2;
        builder.putAll((Object) "MN", (Object[]) A06102);
        Integer[] A06103 = A06(0, 2);
        A06103[2] = 4;
        A06103[3] = 4;
        A06103[4] = 2;
        builder.putAll((Object) "MO", (Object[]) A06103);
        Integer[] A06104 = A06(0, 2);
        A06104[2] = 2;
        A06104[3] = 2;
        A06104[4] = 2;
        builder.putAll((Object) "MP", (Object[]) A06104);
        Integer[] A0516 = A05(2);
        A0516[3] = 3;
        A0516[4] = 2;
        builder.putAll((Object) "MQ", (Object[]) A0516);
        Integer[] A06105 = A06(3, 0);
        A06105[2] = 4;
        A06105[3] = 2;
        A06105[4] = 2;
        builder.putAll((Object) "MR", (Object[]) A06105);
        Integer[] A06106 = A06(1, 2);
        A06106[2] = 2;
        A06106[3] = 2;
        A06106[4] = 2;
        builder.putAll((Object) "MS", (Object[]) A06106);
        Integer[] A06107 = A06(0, 2);
        A06107[2] = 0;
        A06107[3] = 1;
        A06107[4] = 2;
        builder.putAll((Object) "MT", (Object[]) A06107);
        Integer[] A06108 = A06(3, 1);
        A06108[2] = 2;
        A06108[3] = 3;
        A06108[4] = 2;
        builder.putAll((Object) "MU", (Object[]) A06108);
        Integer[] A06109 = A06(4, 3);
        A06109[2] = 1;
        A06109[3] = 4;
        A06109[4] = 2;
        builder.putAll((Object) "MV", (Object[]) A06109);
        Integer[] A06110 = A06(4, 1);
        A06110[2] = 1;
        A06110[3] = 0;
        A06110[4] = 2;
        builder.putAll((Object) "MW", (Object[]) A06110);
        Integer[] A06111 = A06(2, 4);
        A06111[2] = 3;
        A06111[3] = 3;
        A06111[4] = 2;
        builder.putAll((Object) "MX", (Object[]) A06111);
        Integer[] A06112 = A06(2, 0);
        A06112[2] = 3;
        A06112[3] = 3;
        A06112[4] = 2;
        builder.putAll((Object) "MY", (Object[]) A06112);
        Integer[] A0427 = A04(3);
        A0427[2] = 2;
        A0427[3] = 3;
        A0427[4] = 2;
        builder.putAll((Object) "MZ", (Object[]) A0427);
        Integer[] A06113 = A06(4, 3);
        A03(A06113, 2);
        builder.putAll((Object) "NA", (Object[]) A06113);
        Integer[] A06114 = A06(2, 0);
        A06114[2] = 4;
        A06114[3] = 4;
        A06114[4] = 2;
        builder.putAll((Object) "NC", (Object[]) A06114);
        Integer[] A0517 = A05(4);
        A0517[3] = 4;
        A0517[4] = 2;
        builder.putAll((Object) "NE", (Object[]) A0517);
        Integer[] A0518 = A05(2);
        A0518[3] = 2;
        A0518[4] = 2;
        builder.putAll((Object) "NF", (Object[]) A0518);
        Integer[] A0428 = A04(3);
        A03(A0428, 2);
        builder.putAll((Object) "NG", (Object[]) A0428);
        Integer[] A06115 = A06(3, 1);
        A06115[2] = 4;
        A06115[3] = 4;
        A06115[4] = 2;
        builder.putAll((Object) "NI", (Object[]) A06115);
        Integer[] A06116 = A06(0, 2);
        A06116[2] = 4;
        A06116[3] = 2;
        A06116[4] = 0;
        builder.putAll((Object) "NL", (Object[]) A06116);
        Integer[] A06117 = A06(0, 1);
        A06117[2] = 1;
        A06117[3] = 0;
        A06117[4] = 2;
        builder.putAll((Object) "NO", (Object[]) A06117);
        Integer[] A06118 = A06(2, 0);
        A06118[2] = 4;
        A06118[3] = 3;
        A06118[4] = 2;
        builder.putAll((Object) "NP", (Object[]) A06118);
        Integer[] A06119 = A06(4, 2);
        A06119[2] = 3;
        A06119[3] = 1;
        A06119[4] = 2;
        builder.putAll((Object) "NR", (Object[]) A06119);
        Integer[] A06120 = A06(4, 2);
        A06120[2] = 2;
        A06120[3] = 2;
        A06120[4] = 2;
        builder.putAll((Object) "NU", (Object[]) A06120);
        Integer[] A06121 = A06(0, 2);
        A06121[2] = 1;
        A06121[3] = 2;
        A06121[4] = 4;
        builder.putAll((Object) "NZ", (Object[]) A06121);
        Integer[] A0429 = A04(2);
        A0429[2] = 0;
        A0429[3] = 2;
        A0429[4] = 2;
        builder.putAll((Object) "OM", (Object[]) A0429);
        Integer[] A06122 = A06(1, 3);
        A06122[2] = 3;
        A06122[3] = 4;
        A06122[4] = 2;
        builder.putAll((Object) "PA", (Object[]) A06122);
        Integer[] A06123 = A06(2, 4);
        A06123[2] = 4;
        A06123[3] = 4;
        A06123[4] = 2;
        builder.putAll((Object) "PE", (Object[]) A06123);
        Integer[] A0430 = A04(2);
        A0430[2] = 1;
        A0430[3] = 1;
        A0430[4] = 2;
        builder.putAll((Object) "PF", (Object[]) A0430);
        Integer[] A06124 = A06(4, 3);
        A06124[2] = 3;
        A06124[3] = 2;
        A06124[4] = 2;
        builder.putAll((Object) "PG", (Object[]) A06124);
        Integer[] A06125 = A06(3, 0);
        A06125[2] = 3;
        A06125[3] = 4;
        A06125[4] = 4;
        builder.putAll((Object) "PH", (Object[]) A06125);
        Integer[] A06126 = A06(3, 2);
        A06126[2] = 3;
        A06126[3] = 3;
        A06126[4] = 2;
        builder.putAll((Object) "PK", (Object[]) A06126);
        Integer[] A06127 = A06(1, 0);
        A03(A06127, 2);
        builder.putAll((Object) "PL", (Object[]) A06127);
        Integer[] A06128 = A06(0, 2);
        A06128[2] = 2;
        A06128[3] = 2;
        A06128[4] = 2;
        builder.putAll((Object) "PM", (Object[]) A06128);
        Integer[] A06129 = A06(1, 2);
        A06129[2] = 2;
        A06129[3] = 3;
        A06129[4] = 4;
        builder.putAll((Object) "PR", (Object[]) A06129);
        Integer[] A0431 = A04(3);
        A03(A0431, 2);
        builder.putAll((Object) "PS", (Object[]) A0431);
        Integer[] A0432 = A04(1);
        A0432[2] = 0;
        A0432[3] = 0;
        A0432[4] = 2;
        builder.putAll((Object) "PT", (Object[]) A0432);
        Integer[] A06130 = A06(1, 2);
        A06130[2] = 3;
        A06130[3] = 0;
        A06130[4] = 2;
        builder.putAll((Object) "PW", (Object[]) A06130);
        Integer[] A06131 = A06(2, 0);
        A06131[2] = 3;
        A06131[3] = 3;
        A06131[4] = 2;
        builder.putAll((Object) "PY", (Object[]) A06131);
        Integer[] A06132 = A06(2, 3);
        A06132[2] = 1;
        A06132[3] = 2;
        A06132[4] = 2;
        builder.putAll((Object) "QA", (Object[]) A06132);
        Integer[] A06133 = A06(1, 0);
        A06133[2] = 2;
        A06133[3] = 1;
        A06133[4] = 2;
        builder.putAll((Object) "RE", (Object[]) A06133);
        Integer[] A0519 = A05(1);
        A0519[3] = 2;
        A0519[4] = 2;
        builder.putAll((Object) "RO", (Object[]) A0519);
        Integer[] A06134 = A06(1, 2);
        A06134[2] = 0;
        A06134[3] = 0;
        A06134[4] = 2;
        builder.putAll((Object) "RS", (Object[]) A06134);
        Integer[] A06135 = A06(0, 1);
        A06135[2] = 0;
        A06135[3] = 1;
        A06135[4] = 2;
        builder.putAll((Object) "RU", (Object[]) A06135);
        Integer[] A06136 = A06(4, 3);
        A06136[2] = 3;
        A06136[3] = 4;
        A06136[4] = 2;
        builder.putAll((Object) "RW", (Object[]) A06136);
        Integer[] A0520 = A05(2);
        A0520[3] = 1;
        A0520[4] = 2;
        builder.putAll((Object) "SA", (Object[]) A0520);
        Integer[] A06137 = A06(4, 2);
        A06137[2] = 4;
        A06137[3] = 2;
        A06137[4] = 2;
        builder.putAll((Object) "SB", (Object[]) A06137);
        Integer[] A06138 = A06(4, 2);
        A06138[2] = 0;
        A06138[3] = 1;
        A06138[4] = 2;
        builder.putAll((Object) "SC", (Object[]) A06138);
        Integer[] A0521 = A05(4);
        A0521[3] = 3;
        A0521[4] = 2;
        builder.putAll((Object) "SD", (Object[]) A0521);
        Integer[] A0522 = A05(0);
        A0522[3] = 0;
        A0522[4] = 2;
        builder.putAll((Object) "SE", (Object[]) A0522);
        Integer[] A0433 = A04(0);
        A0433[2] = 3;
        A0433[3] = 3;
        A0433[4] = 4;
        builder.putAll((Object) "SG", (Object[]) A0433);
        Integer[] A06139 = A06(4, 2);
        A06139[2] = 2;
        A06139[3] = 2;
        A06139[4] = 2;
        builder.putAll((Object) "SH", (Object[]) A06139);
        Integer[] A06140 = A06(0, 1);
        A06140[2] = 0;
        A06140[3] = 0;
        A06140[4] = 2;
        builder.putAll((Object) "SI", (Object[]) A06140);
        Integer[] A0523 = A05(2);
        A0523[3] = 2;
        A0523[4] = 2;
        builder.putAll((Object) "SJ", (Object[]) A0523);
        Integer[] A06141 = A06(0, 1);
        A06141[2] = 0;
        A06141[3] = 0;
        A06141[4] = 2;
        builder.putAll((Object) "SK", (Object[]) A06141);
        Integer[] A06142 = A06(4, 3);
        A06142[2] = 3;
        A06142[3] = 1;
        A06142[4] = 2;
        builder.putAll((Object) "SL", (Object[]) A06142);
        Integer[] A06143 = A06(0, 2);
        A06143[2] = 2;
        A06143[3] = 2;
        A06143[4] = 2;
        builder.putAll((Object) "SM", (Object[]) A06143);
        Integer[] A0524 = A05(4);
        A0524[3] = 3;
        A0524[4] = 2;
        builder.putAll((Object) "SN", (Object[]) A0524);
        Integer[] A06144 = A06(3, 4);
        A06144[2] = 4;
        A06144[3] = 4;
        A06144[4] = 2;
        builder.putAll((Object) "SO", (Object[]) A06144);
        Integer[] A06145 = A06(3, 2);
        A06145[2] = 3;
        A06145[3] = 1;
        A06145[4] = 2;
        builder.putAll((Object) "SR", (Object[]) A06145);
        Integer[] A06146 = A06(4, 1);
        A06146[2] = 4;
        A06146[3] = 2;
        A06146[4] = 2;
        builder.putAll((Object) "SS", (Object[]) A06146);
        Integer[] A0434 = A04(2);
        A0434[2] = 1;
        A0434[3] = 2;
        A0434[4] = 2;
        builder.putAll((Object) "ST", (Object[]) A0434);
        Integer[] A06147 = A06(2, 1);
        A06147[2] = 4;
        A06147[3] = 4;
        A06147[4] = 2;
        builder.putAll((Object) "SV", (Object[]) A06147);
        Integer[] A0435 = A04(2);
        A0435[2] = 1;
        A0435[3] = 0;
        A0435[4] = 2;
        builder.putAll((Object) "SX", (Object[]) A0435);
        Integer[] A06148 = A06(4, 3);
        A03(A06148, 2);
        builder.putAll((Object) "SY", (Object[]) A06148);
        Integer[] A06149 = A06(3, 4);
        A06149[2] = 3;
        A06149[3] = 4;
        A06149[4] = 2;
        builder.putAll((Object) "SZ", (Object[]) A06149);
        Integer[] A06150 = A06(1, 2);
        A06150[2] = 1;
        A06150[3] = 0;
        A06150[4] = 2;
        builder.putAll((Object) "TC", (Object[]) A06150);
        Integer[] A0525 = A05(4);
        A0525[3] = 4;
        A0525[4] = 2;
        builder.putAll((Object) "TD", (Object[]) A0525);
        Integer[] A06151 = A06(3, 2);
        A06151[2] = 1;
        A06151[3] = 0;
        A06151[4] = 2;
        builder.putAll((Object) "TG", (Object[]) A06151);
        Integer[] A06152 = A06(1, 3);
        A06152[2] = 4;
        A06152[3] = 3;
        A06152[4] = 0;
        builder.putAll((Object) "TH", (Object[]) A06152);
        Integer[] A0526 = A05(4);
        A0526[3] = 4;
        A0526[4] = 2;
        builder.putAll((Object) "TJ", (Object[]) A0526);
        Integer[] A06153 = A06(4, 1);
        A06153[2] = 4;
        A06153[3] = 4;
        A06153[4] = 2;
        builder.putAll((Object) "TL", (Object[]) A06153);
        Integer[] A06154 = A06(4, 2);
        A06154[2] = 1;
        A06154[3] = 2;
        A06154[4] = 2;
        builder.putAll((Object) "TM", (Object[]) A06154);
        Integer[] A06155 = A06(2, 1);
        A06155[2] = 1;
        A06155[3] = 1;
        A06155[4] = 2;
        builder.putAll((Object) "TN", (Object[]) A06155);
        Integer[] A0436 = A04(3);
        A0436[2] = 4;
        A0436[3] = 2;
        A0436[4] = 2;
        builder.putAll((Object) "TO", (Object[]) A0436);
        Integer[] A06156 = A06(1, 2);
        A06156[2] = 1;
        A06156[3] = 1;
        A06156[4] = 2;
        builder.putAll((Object) "TR", (Object[]) A06156);
        Integer[] A06157 = A06(1, 3);
        A06157[2] = 1;
        A06157[3] = 3;
        A06157[4] = 2;
        builder.putAll((Object) "TT", (Object[]) A06157);
        Integer[] A06158 = A06(3, 2);
        A06158[2] = 2;
        A06158[3] = 4;
        A06158[4] = 2;
        builder.putAll((Object) "TV", (Object[]) A06158);
        Integer[] A0527 = A05(0);
        A0527[3] = 0;
        A0527[4] = 1;
        builder.putAll((Object) "TW", (Object[]) A0527);
        Integer[] A0528 = A05(3);
        A0528[3] = 2;
        A0528[4] = 2;
        builder.putAll((Object) "TZ", (Object[]) A0528);
        Integer[] A06159 = A06(0, 3);
        A06159[2] = 0;
        A06159[3] = 0;
        A06159[4] = 2;
        builder.putAll((Object) "UA", (Object[]) A06159);
        Integer[] A06160 = A06(3, 2);
        A06160[2] = 2;
        A06160[3] = 3;
        A06160[4] = 2;
        builder.putAll((Object) "UG", (Object[]) A06160);
        Integer[] A06161 = A06(0, 1);
        A03(A06161, 3);
        builder.putAll((Object) "US", (Object[]) A06161);
        Integer[] A06162 = A06(2, 1);
        A06162[2] = 1;
        A06162[3] = 1;
        A06162[4] = 2;
        builder.putAll((Object) "UY", (Object[]) A06162);
        Integer[] A06163 = A06(2, 0);
        A06163[2] = 3;
        A06163[3] = 2;
        A06163[4] = 2;
        builder.putAll((Object) "UZ", (Object[]) A06163);
        Integer[] A0529 = A05(2);
        A0529[3] = 2;
        A0529[4] = 2;
        builder.putAll((Object) "VC", (Object[]) A0529);
        Integer[] A0530 = A05(4);
        A0530[3] = 4;
        A0530[4] = 2;
        builder.putAll((Object) "VE", (Object[]) A0530);
        Integer[] A0437 = A04(2);
        A0437[2] = 1;
        A0437[3] = 2;
        A0437[4] = 2;
        builder.putAll((Object) "VG", (Object[]) A0437);
        Integer[] A06164 = A06(1, 2);
        A06164[2] = 2;
        A06164[3] = 4;
        A06164[4] = 2;
        builder.putAll((Object) "VI", (Object[]) A06164);
        Integer[] A06165 = A06(0, 1);
        A06165[2] = 4;
        A06165[3] = 4;
        A06165[4] = 2;
        builder.putAll((Object) "VN", (Object[]) A06165);
        Integer[] A06166 = A06(4, 1);
        A06166[2] = 3;
        A06166[3] = 1;
        A06166[4] = 2;
        builder.putAll((Object) "VU", (Object[]) A06166);
        Integer[] A06167 = A06(3, 1);
        A06167[2] = 4;
        A06167[3] = 2;
        A06167[4] = 2;
        builder.putAll((Object) "WS", (Object[]) A06167);
        Integer[] A0531 = A05(1);
        A0531[3] = 0;
        A0531[4] = 2;
        builder.putAll((Object) "XK", (Object[]) A0531);
        Integer[] A0532 = A05(4);
        A0532[3] = 4;
        A0532[4] = 2;
        builder.putAll((Object) "YE", (Object[]) A0532);
        Integer[] A06168 = A06(3, 2);
        A06168[2] = 1;
        A06168[3] = 3;
        A06168[4] = 2;
        builder.putAll((Object) "YT", (Object[]) A06168);
        Integer[] A06169 = A06(2, 3);
        A03(A06169, 2);
        builder.putAll((Object) "ZA", (Object[]) A06169);
        Integer[] A06170 = A06(3, 2);
        A06170[2] = 2;
        A06170[3] = 3;
        A06170[4] = 2;
        builder.putAll((Object) "ZM", (Object[]) A06170);
        Integer[] A0533 = A05(3);
        A0533[3] = 3;
        A0533[4] = 2;
        builder.putAll((Object) "ZW", (Object[]) A0533);
        A0J = builder.build();
    }

    @Deprecated
    public AnonymousClass3E2() {
        this((Context) null, AnonymousClass5TU.A00, C17930vs.of());
    }

    public AnonymousClass3E2(Context context, AnonymousClass5TU r6, Map map) {
        C63563Kd r3;
        this.A08 = context == null ? null : context.getApplicationContext();
        this.A0C = C17930vs.copyOf(map);
        this.A09 = new C85744Pt();
        this.A0B = new C88324aJ();
        this.A0A = r6;
        int A032 = context == null ? 0 : AnonymousClass3C1.A03(context);
        this.A00 = A032;
        this.A02 = A07(A032);
        if (context != null) {
            synchronized (C63563Kd.class) {
                if (C63563Kd.A02 == null) {
                    C63563Kd.A02 = new C63563Kd();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    context.registerReceiver(C63563Kd.A02, intentFilter);
                }
                r3 = C63563Kd.A02;
            }
            synchronized (r3) {
                ArrayList arrayList = r3.A01;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        arrayList.add(C13690nt.A0h(this));
                        C13700nu.A0O(r3.A00, r3, this, 10);
                    } else if (((Reference) arrayList.get(size)).get() == null) {
                        arrayList.remove(size);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.AnonymousClass3E2 A00(android.content.Context r11) {
        /*
            java.lang.Class<X.3E2> r10 = X.AnonymousClass3E2.class
            monitor-enter(r10)
            X.3E2 r1 = A0D     // Catch:{ all -> 0x00a3 }
            if (r1 != 0) goto L_0x00a1
            if (r11 != 0) goto L_0x000b
            r5 = 0
            goto L_0x0024
        L_0x000b:
            android.content.Context r5 = r11.getApplicationContext()     // Catch:{ all -> 0x00a3 }
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r11.getSystemService(r0)     // Catch:{ all -> 0x00a3 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r0.getNetworkCountryIso()     // Catch:{ all -> 0x00a3 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a3 }
            if (r0 != 0) goto L_0x0024
            goto L_0x002c
        L_0x0024:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = r0.getCountry()     // Catch:{ all -> 0x00a3 }
        L_0x002c:
            if (r1 == 0) goto L_0x0034
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = r1.toUpperCase(r0)     // Catch:{ all -> 0x00a3 }
        L_0x0034:
            X.3cU r0 = A0J     // Catch:{ all -> 0x00a3 }
            X.1kb r7 = r0.get(r1)     // Catch:{ all -> 0x00a3 }
            boolean r0 = r7.isEmpty()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0048
            java.lang.Integer r0 = X.C13680ns.A0Z()     // Catch:{ all -> 0x00a3 }
            X.1kb r7 = X.C34641kb.of(r0, r0, r0, r0, r0)     // Catch:{ all -> 0x00a3 }
        L_0x0048:
            r0 = 6
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x00a3 }
            r6.<init>(r0)     // Catch:{ all -> 0x00a3 }
            r4 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00a3 }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            r6.put(r2, r0)     // Catch:{ all -> 0x00a3 }
            r9 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00a3 }
            X.1kb r3 = A0I     // Catch:{ all -> 0x00a3 }
            A02(r0, r6, r7, r3, r4)     // Catch:{ all -> 0x00a3 }
            r8 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x00a3 }
            X.1kb r1 = A0E     // Catch:{ all -> 0x00a3 }
            r0 = 1
            A02(r2, r6, r7, r1, r0)     // Catch:{ all -> 0x00a3 }
            r2 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x00a3 }
            X.1kb r0 = A0F     // Catch:{ all -> 0x00a3 }
            A02(r1, r6, r7, r0, r9)     // Catch:{ all -> 0x00a3 }
            java.lang.Integer r1 = X.C13690nt.A0U()     // Catch:{ all -> 0x00a3 }
            X.1kb r0 = A0G     // Catch:{ all -> 0x00a3 }
            A02(r1, r6, r7, r0, r8)     // Catch:{ all -> 0x00a3 }
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            X.1kb r0 = A0H     // Catch:{ all -> 0x00a3 }
            A02(r1, r6, r7, r0, r2)     // Catch:{ all -> 0x00a3 }
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00a3 }
            A02(r0, r6, r7, r3, r4)     // Catch:{ all -> 0x00a3 }
            X.5TU r0 = X.AnonymousClass5TU.A00     // Catch:{ all -> 0x00a3 }
            X.3E2 r1 = new X.3E2     // Catch:{ all -> 0x00a3 }
            r1.<init>(r5, r0, r6)     // Catch:{ all -> 0x00a3 }
            A0D = r1     // Catch:{ all -> 0x00a3 }
        L_0x00a1:
            monitor-exit(r10)
            return r1
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E2.A00(android.content.Context):X.3E2");
    }

    public static /* synthetic */ void A01(AnonymousClass3E2 r11) {
        AnonymousClass3E2 r6 = r11;
        synchronized (r6) {
            Context context = r11.A08;
            int A032 = context == null ? 0 : AnonymousClass3C1.A03(context);
            if (r11.A00 != A032) {
                r11.A00 = A032;
                if (!(A032 == 1 || A032 == 0 || A032 == 8)) {
                    long A072 = r11.A07(A032);
                    r6.A02 = A072;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    r6.A08(r6.A01 > 0 ? (int) (elapsedRealtime - r6.A05) : 0, r6.A04, A072);
                    r6.A05 = elapsedRealtime;
                    r6.A04 = 0;
                    r6.A06 = 0;
                    r6.A07 = 0;
                    C88324aJ r1 = r6.A0B;
                    r1.A04.clear();
                    r1.A00 = -1;
                    r1.A01 = 0;
                    r1.A03 = 0;
                }
            }
        }
    }

    public static void A02(Object obj, AbstractMap abstractMap, List list, List list2, int i2) {
        abstractMap.put(obj, list2.get(((Integer) list.get(i2)).intValue()));
    }

    public static void A03(Object[] objArr, Object obj) {
        objArr[2] = obj;
        objArr[3] = obj;
        objArr[4] = obj;
    }

    public static Integer[] A04(Object obj) {
        Integer[] numArr = new Integer[5];
        numArr[0] = obj;
        numArr[1] = obj;
        return numArr;
    }

    public static Integer[] A05(Object obj) {
        Integer[] numArr = new Integer[5];
        numArr[0] = obj;
        numArr[1] = obj;
        numArr[2] = obj;
        return numArr;
    }

    public static Integer[] A06(Object obj, Object obj2) {
        Integer[] numArr = new Integer[5];
        numArr[0] = obj;
        numArr[1] = obj2;
        return numArr;
    }

    public final long A07(int i2) {
        C17930vs r1 = this.A0C;
        Number number = (Number) r1.get(Integer.valueOf(i2));
        if (number == null && (number = (Number) r1.get(C13680ns.A0X())) == null) {
            number = Long.valueOf(SearchActionVerificationClientService.MS_TO_NS);
        }
        return number.longValue();
    }

    public final void A08(int i2, long j2, long j3) {
        int i3 = i2;
        long j4 = j2;
        long j5 = j3;
        if (i2 != 0 || j2 != 0 || j3 != this.A03) {
            this.A03 = j3;
            Iterator it = this.A09.A00.iterator();
            while (it.hasNext()) {
                C84084Je r3 = (C84084Je) it.next();
                if (!r3.A00) {
                    r3.A01.post(new RunnableRunnableShape1S0101200_I1(r3, i3, 1, j4, j5));
                }
            }
        }
    }
}
