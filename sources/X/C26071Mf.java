package X;

import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import com.obwhatsapp.youbasha.ui.YoSettings.HideMedia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Mf  reason: invalid class name and case insensitive filesystem */
public class C26071Mf {
    public static final String A08 = A02("xｘ#＃~～");
    public static final Map A09;
    public static final Map A0A;
    public static final Logger A0B = Logger.getLogger(C26071Mf.class.getName());
    public static final Pattern A0C = Pattern.compile("(\\p{Nd})");
    public static final Pattern A0D = Pattern.compile("\\$CC");
    public static final Pattern A0E;
    public static final Pattern A0F = Pattern.compile("\\$FG");
    public static final Pattern A0G = Pattern.compile("\\(?\\$1\\)?");
    public static final Pattern A0H = Pattern.compile("(\\$\\d)");
    public static final Pattern A0I = Pattern.compile("(\\D+)");
    public static final Pattern A0J = Pattern.compile("\\$NP");
    public static final Pattern A0K = Pattern.compile("[+＋]+");
    public static final Pattern A0L = Pattern.compile("[\\\\/] *x");
    public static final Pattern A0M = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]+");
    public static final Pattern A0N = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    public static final Pattern A0O = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    public static final Pattern A0P;
    public static final Pattern A0Q = Pattern.compile("[+＋\\p{Nd}]");
    public static volatile C26071Mf A0R;
    public AnonymousClass4Q0 A00 = new AnonymousClass4Q0(100);
    public AnonymousClass1G1 A01;
    public Map A02 = null;
    public final Map A03 = Collections.synchronizedMap(new HashMap());
    public final Map A04 = Collections.synchronizedMap(new HashMap());
    public final Set A05 = new HashSet();
    public final Set A06 = new HashSet(35);
    public final Set A07 = new HashSet(320);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put('0', '0');
        hashMap.put('1', '1');
        hashMap.put('2', '2');
        hashMap.put('3', '3');
        hashMap.put('4', '4');
        hashMap.put('5', '5');
        hashMap.put('6', '6');
        hashMap.put('7', '7');
        hashMap.put('8', '8');
        hashMap.put('9', '9');
        HashMap hashMap2 = new HashMap(40);
        hashMap2.put('A', '2');
        hashMap2.put('B', '2');
        hashMap2.put('C', '2');
        hashMap2.put('D', '3');
        hashMap2.put('E', '3');
        hashMap2.put('F', '3');
        hashMap2.put('G', '4');
        hashMap2.put('H', '4');
        hashMap2.put('I', '4');
        hashMap2.put('J', '5');
        hashMap2.put('K', '5');
        hashMap2.put('L', '5');
        hashMap2.put('M', '6');
        hashMap2.put('N', '6');
        hashMap2.put('O', '6');
        hashMap2.put('P', '7');
        hashMap2.put('Q', '7');
        hashMap2.put('R', '7');
        hashMap2.put('S', '7');
        hashMap2.put('T', '8');
        hashMap2.put('U', '8');
        hashMap2.put('V', '8');
        hashMap2.put('W', '9');
        hashMap2.put('X', '9');
        hashMap2.put('Y', '9');
        hashMap2.put('Z', '9');
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        A09 = unmodifiableMap;
        HashMap hashMap3 = new HashMap(100);
        hashMap3.putAll(unmodifiableMap);
        hashMap3.putAll(hashMap);
        A0A = Collections.unmodifiableMap(hashMap3);
        StringBuilder sb = new StringBuilder();
        sb.append(Arrays.toString(unmodifiableMap.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        sb.append(Arrays.toString(unmodifiableMap.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～*");
        sb2.append(obj);
        sb2.append("\\p{Nd}");
        sb2.append("]*");
        String obj2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder(",");
        sb3.append("xｘ#＃~～");
        String A022 = A02(sb3.toString());
        StringBuilder sb4 = new StringBuilder("(?:");
        sb4.append(A022);
        sb4.append(")$");
        A0E = Pattern.compile(sb4.toString(), 66);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(obj2);
        sb5.append("(?:");
        sb5.append(A022);
        sb5.append(")?");
        A0P = Pattern.compile(sb5.toString(), 66);
    }

    public C26071Mf(AnonymousClass1G1 r9) {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        hashMap.put(7, arrayList2);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("EG");
        hashMap.put(20, arrayList3);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("ZA");
        hashMap.put(27, arrayList4);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("GR");
        hashMap.put(30, arrayList5);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("NL");
        hashMap.put(31, arrayList6);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("BE");
        hashMap.put(32, arrayList7);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("FR");
        hashMap.put(33, arrayList8);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ES");
        hashMap.put(34, arrayList9);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("HU");
        hashMap.put(36, arrayList10);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("IT");
        hashMap.put(39, arrayList11);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("RO");
        hashMap.put(40, arrayList12);
        ArrayList arrayList13 = new ArrayList(1);
        arrayList13.add("CH");
        hashMap.put(41, arrayList13);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add("AT");
        hashMap.put(43, arrayList14);
        ArrayList arrayList15 = new ArrayList(4);
        arrayList15.add("GB");
        arrayList15.add("GG");
        arrayList15.add("IM");
        arrayList15.add("JE");
        hashMap.put(44, arrayList15);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add("DK");
        hashMap.put(45, arrayList16);
        ArrayList arrayList17 = new ArrayList(1);
        arrayList17.add("SE");
        hashMap.put(46, arrayList17);
        ArrayList arrayList18 = new ArrayList(2);
        arrayList18.add("NO");
        arrayList18.add("SJ");
        hashMap.put(47, arrayList18);
        ArrayList arrayList19 = new ArrayList(1);
        arrayList19.add("PL");
        hashMap.put(48, arrayList19);
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add("DE");
        hashMap.put(49, arrayList20);
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add("PE");
        hashMap.put(51, arrayList21);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList22.add("MX");
        hashMap.put(52, arrayList22);
        ArrayList arrayList23 = new ArrayList(1);
        arrayList23.add("CU");
        hashMap.put(53, arrayList23);
        ArrayList arrayList24 = new ArrayList(1);
        arrayList24.add("AR");
        hashMap.put(54, arrayList24);
        ArrayList arrayList25 = new ArrayList(1);
        arrayList25.add("BR");
        hashMap.put(55, arrayList25);
        ArrayList arrayList26 = new ArrayList(1);
        arrayList26.add("CL");
        hashMap.put(56, arrayList26);
        ArrayList arrayList27 = new ArrayList(1);
        arrayList27.add("CO");
        hashMap.put(57, arrayList27);
        ArrayList arrayList28 = new ArrayList(1);
        arrayList28.add("VE");
        hashMap.put(58, arrayList28);
        ArrayList arrayList29 = new ArrayList(1);
        arrayList29.add("MY");
        hashMap.put(60, arrayList29);
        ArrayList arrayList30 = new ArrayList(3);
        arrayList30.add("AU");
        arrayList30.add("CC");
        arrayList30.add("CX");
        hashMap.put(61, arrayList30);
        ArrayList arrayList31 = new ArrayList(1);
        arrayList31.add("ID");
        hashMap.put(62, arrayList31);
        ArrayList arrayList32 = new ArrayList(1);
        arrayList32.add("PH");
        hashMap.put(63, arrayList32);
        ArrayList arrayList33 = new ArrayList(1);
        arrayList33.add("NZ");
        hashMap.put(64, arrayList33);
        ArrayList arrayList34 = new ArrayList(1);
        arrayList34.add("SG");
        hashMap.put(65, arrayList34);
        ArrayList arrayList35 = new ArrayList(1);
        arrayList35.add("TH");
        hashMap.put(66, arrayList35);
        ArrayList arrayList36 = new ArrayList(1);
        arrayList36.add("JP");
        hashMap.put(81, arrayList36);
        ArrayList arrayList37 = new ArrayList(1);
        arrayList37.add("KR");
        hashMap.put(82, arrayList37);
        ArrayList arrayList38 = new ArrayList(1);
        arrayList38.add("VN");
        hashMap.put(84, arrayList38);
        ArrayList arrayList39 = new ArrayList(1);
        arrayList39.add("CN");
        hashMap.put(86, arrayList39);
        ArrayList arrayList40 = new ArrayList(1);
        arrayList40.add("TR");
        hashMap.put(90, arrayList40);
        ArrayList arrayList41 = new ArrayList(1);
        arrayList41.add("IN");
        hashMap.put(91, arrayList41);
        ArrayList arrayList42 = new ArrayList(1);
        arrayList42.add("PK");
        hashMap.put(92, arrayList42);
        ArrayList arrayList43 = new ArrayList(1);
        arrayList43.add("AF");
        hashMap.put(93, arrayList43);
        ArrayList arrayList44 = new ArrayList(1);
        arrayList44.add("LK");
        hashMap.put(94, arrayList44);
        ArrayList arrayList45 = new ArrayList(1);
        arrayList45.add("MM");
        hashMap.put(95, arrayList45);
        ArrayList arrayList46 = new ArrayList(1);
        arrayList46.add("IR");
        hashMap.put(98, arrayList46);
        ArrayList arrayList47 = new ArrayList(1);
        arrayList47.add("SS");
        hashMap.put(211, arrayList47);
        ArrayList arrayList48 = new ArrayList(2);
        arrayList48.add("MA");
        arrayList48.add("EH");
        hashMap.put(212, arrayList48);
        ArrayList arrayList49 = new ArrayList(1);
        arrayList49.add("DZ");
        hashMap.put(213, arrayList49);
        ArrayList arrayList50 = new ArrayList(1);
        arrayList50.add("TN");
        hashMap.put(216, arrayList50);
        ArrayList arrayList51 = new ArrayList(1);
        arrayList51.add("LY");
        hashMap.put(218, arrayList51);
        ArrayList arrayList52 = new ArrayList(1);
        arrayList52.add("GM");
        hashMap.put(220, arrayList52);
        ArrayList arrayList53 = new ArrayList(1);
        arrayList53.add("SN");
        hashMap.put(221, arrayList53);
        ArrayList arrayList54 = new ArrayList(1);
        arrayList54.add("MR");
        hashMap.put(Integer.valueOf(HideMedia.IMAGES), arrayList54);
        ArrayList arrayList55 = new ArrayList(1);
        arrayList55.add("ML");
        hashMap.put(223, arrayList55);
        ArrayList arrayList56 = new ArrayList(1);
        arrayList56.add("GN");
        hashMap.put(224, arrayList56);
        ArrayList arrayList57 = new ArrayList(1);
        arrayList57.add("CI");
        hashMap.put(225, arrayList57);
        ArrayList arrayList58 = new ArrayList(1);
        arrayList58.add("BF");
        hashMap.put(226, arrayList58);
        ArrayList arrayList59 = new ArrayList(1);
        arrayList59.add("NE");
        hashMap.put(227, arrayList59);
        ArrayList arrayList60 = new ArrayList(1);
        arrayList60.add("TG");
        hashMap.put(228, arrayList60);
        ArrayList arrayList61 = new ArrayList(1);
        arrayList61.add("BJ");
        hashMap.put(229, arrayList61);
        ArrayList arrayList62 = new ArrayList(1);
        arrayList62.add("MU");
        hashMap.put(230, arrayList62);
        ArrayList arrayList63 = new ArrayList(1);
        arrayList63.add("LR");
        hashMap.put(231, arrayList63);
        ArrayList arrayList64 = new ArrayList(1);
        arrayList64.add("SL");
        hashMap.put(232, arrayList64);
        ArrayList arrayList65 = new ArrayList(1);
        arrayList65.add("GH");
        hashMap.put(233, arrayList65);
        ArrayList arrayList66 = new ArrayList(1);
        arrayList66.add("NG");
        hashMap.put(234, arrayList66);
        ArrayList arrayList67 = new ArrayList(1);
        arrayList67.add("TD");
        hashMap.put(235, arrayList67);
        ArrayList arrayList68 = new ArrayList(1);
        arrayList68.add("CF");
        hashMap.put(236, arrayList68);
        ArrayList arrayList69 = new ArrayList(1);
        arrayList69.add("CM");
        hashMap.put(237, arrayList69);
        ArrayList arrayList70 = new ArrayList(1);
        arrayList70.add("CV");
        hashMap.put(238, arrayList70);
        ArrayList arrayList71 = new ArrayList(1);
        arrayList71.add("ST");
        hashMap.put(239, arrayList71);
        ArrayList arrayList72 = new ArrayList(1);
        arrayList72.add("GQ");
        hashMap.put(240, arrayList72);
        ArrayList arrayList73 = new ArrayList(1);
        arrayList73.add("GA");
        hashMap.put(241, arrayList73);
        ArrayList arrayList74 = new ArrayList(1);
        arrayList74.add("CG");
        hashMap.put(242, arrayList74);
        ArrayList arrayList75 = new ArrayList(1);
        arrayList75.add("CD");
        hashMap.put(243, arrayList75);
        ArrayList arrayList76 = new ArrayList(1);
        arrayList76.add("AO");
        hashMap.put(244, arrayList76);
        ArrayList arrayList77 = new ArrayList(1);
        arrayList77.add("GW");
        hashMap.put(245, arrayList77);
        ArrayList arrayList78 = new ArrayList(1);
        arrayList78.add("IO");
        hashMap.put(246, arrayList78);
        ArrayList arrayList79 = new ArrayList(1);
        arrayList79.add("AC");
        hashMap.put(247, arrayList79);
        ArrayList arrayList80 = new ArrayList(1);
        arrayList80.add("SC");
        hashMap.put(248, arrayList80);
        ArrayList arrayList81 = new ArrayList(1);
        arrayList81.add("SD");
        hashMap.put(249, arrayList81);
        ArrayList arrayList82 = new ArrayList(1);
        arrayList82.add("RW");
        hashMap.put(250, arrayList82);
        ArrayList arrayList83 = new ArrayList(1);
        arrayList83.add("ET");
        hashMap.put(251, arrayList83);
        ArrayList arrayList84 = new ArrayList(1);
        arrayList84.add("SO");
        hashMap.put(252, arrayList84);
        ArrayList arrayList85 = new ArrayList(1);
        arrayList85.add("DJ");
        hashMap.put(253, arrayList85);
        ArrayList arrayList86 = new ArrayList(1);
        arrayList86.add("KE");
        hashMap.put(254, arrayList86);
        ArrayList arrayList87 = new ArrayList(1);
        arrayList87.add("TZ");
        hashMap.put(Integer.valueOf(MotionEventCompat.ACTION_MASK), arrayList87);
        ArrayList arrayList88 = new ArrayList(1);
        arrayList88.add("UG");
        hashMap.put(256, arrayList88);
        ArrayList arrayList89 = new ArrayList(1);
        arrayList89.add("BI");
        hashMap.put(257, arrayList89);
        ArrayList arrayList90 = new ArrayList(1);
        arrayList90.add("MZ");
        hashMap.put(258, arrayList90);
        ArrayList arrayList91 = new ArrayList(1);
        arrayList91.add("ZM");
        hashMap.put(260, arrayList91);
        ArrayList arrayList92 = new ArrayList(1);
        arrayList92.add("MG");
        hashMap.put(261, arrayList92);
        ArrayList arrayList93 = new ArrayList(2);
        arrayList93.add("RE");
        arrayList93.add("YT");
        hashMap.put(262, arrayList93);
        ArrayList arrayList94 = new ArrayList(1);
        arrayList94.add("ZW");
        hashMap.put(263, arrayList94);
        ArrayList arrayList95 = new ArrayList(1);
        arrayList95.add("NA");
        hashMap.put(264, arrayList95);
        ArrayList arrayList96 = new ArrayList(1);
        arrayList96.add("MW");
        hashMap.put(265, arrayList96);
        ArrayList arrayList97 = new ArrayList(1);
        arrayList97.add("LS");
        hashMap.put(266, arrayList97);
        ArrayList arrayList98 = new ArrayList(1);
        arrayList98.add("BW");
        hashMap.put(267, arrayList98);
        ArrayList arrayList99 = new ArrayList(1);
        arrayList99.add("SZ");
        hashMap.put(268, arrayList99);
        ArrayList arrayList100 = new ArrayList(1);
        arrayList100.add("KM");
        hashMap.put(269, arrayList100);
        ArrayList arrayList101 = new ArrayList(1);
        arrayList101.add("SH");
        hashMap.put(290, arrayList101);
        ArrayList arrayList102 = new ArrayList(1);
        arrayList102.add("ER");
        hashMap.put(291, arrayList102);
        ArrayList arrayList103 = new ArrayList(1);
        arrayList103.add("AW");
        hashMap.put(297, arrayList103);
        ArrayList arrayList104 = new ArrayList(1);
        arrayList104.add("FO");
        hashMap.put(298, arrayList104);
        ArrayList arrayList105 = new ArrayList(1);
        arrayList105.add("GL");
        hashMap.put(299, arrayList105);
        ArrayList arrayList106 = new ArrayList(1);
        arrayList106.add("GI");
        hashMap.put(350, arrayList106);
        ArrayList arrayList107 = new ArrayList(1);
        arrayList107.add("PT");
        hashMap.put(351, arrayList107);
        ArrayList arrayList108 = new ArrayList(1);
        arrayList108.add("LU");
        hashMap.put(352, arrayList108);
        ArrayList arrayList109 = new ArrayList(1);
        arrayList109.add("IE");
        hashMap.put(353, arrayList109);
        ArrayList arrayList110 = new ArrayList(1);
        arrayList110.add("IS");
        hashMap.put(354, arrayList110);
        ArrayList arrayList111 = new ArrayList(1);
        arrayList111.add("AL");
        hashMap.put(355, arrayList111);
        ArrayList arrayList112 = new ArrayList(1);
        arrayList112.add("MT");
        hashMap.put(356, arrayList112);
        ArrayList arrayList113 = new ArrayList(1);
        arrayList113.add("CY");
        hashMap.put(357, arrayList113);
        ArrayList arrayList114 = new ArrayList(2);
        arrayList114.add("FI");
        arrayList114.add("AX");
        hashMap.put(358, arrayList114);
        ArrayList arrayList115 = new ArrayList(1);
        arrayList115.add("BG");
        hashMap.put(359, arrayList115);
        ArrayList arrayList116 = new ArrayList(1);
        arrayList116.add("LT");
        hashMap.put(370, arrayList116);
        ArrayList arrayList117 = new ArrayList(1);
        arrayList117.add("LV");
        hashMap.put(371, arrayList117);
        ArrayList arrayList118 = new ArrayList(1);
        arrayList118.add("EE");
        hashMap.put(372, arrayList118);
        ArrayList arrayList119 = new ArrayList(1);
        arrayList119.add("MD");
        hashMap.put(373, arrayList119);
        ArrayList arrayList120 = new ArrayList(1);
        arrayList120.add("AM");
        hashMap.put(374, arrayList120);
        ArrayList arrayList121 = new ArrayList(1);
        arrayList121.add("BY");
        hashMap.put(375, arrayList121);
        ArrayList arrayList122 = new ArrayList(1);
        arrayList122.add("AD");
        hashMap.put(376, arrayList122);
        ArrayList arrayList123 = new ArrayList(1);
        arrayList123.add("MC");
        hashMap.put(377, arrayList123);
        ArrayList arrayList124 = new ArrayList(1);
        arrayList124.add("SM");
        hashMap.put(378, arrayList124);
        ArrayList arrayList125 = new ArrayList(1);
        arrayList125.add("VA");
        hashMap.put(379, arrayList125);
        ArrayList arrayList126 = new ArrayList(1);
        arrayList126.add("UA");
        hashMap.put(380, arrayList126);
        ArrayList arrayList127 = new ArrayList(1);
        arrayList127.add("RS");
        hashMap.put(381, arrayList127);
        ArrayList arrayList128 = new ArrayList(1);
        arrayList128.add("ME");
        hashMap.put(382, arrayList128);
        ArrayList arrayList129 = new ArrayList(1);
        arrayList129.add("HR");
        hashMap.put(385, arrayList129);
        ArrayList arrayList130 = new ArrayList(1);
        arrayList130.add("SI");
        hashMap.put(386, arrayList130);
        ArrayList arrayList131 = new ArrayList(1);
        arrayList131.add("BA");
        hashMap.put(387, arrayList131);
        ArrayList arrayList132 = new ArrayList(1);
        arrayList132.add("MK");
        hashMap.put(389, arrayList132);
        ArrayList arrayList133 = new ArrayList(1);
        arrayList133.add("CZ");
        hashMap.put(420, arrayList133);
        ArrayList arrayList134 = new ArrayList(1);
        arrayList134.add("SK");
        hashMap.put(421, arrayList134);
        ArrayList arrayList135 = new ArrayList(1);
        arrayList135.add("LI");
        hashMap.put(423, arrayList135);
        ArrayList arrayList136 = new ArrayList(1);
        arrayList136.add("FK");
        hashMap.put(500, arrayList136);
        ArrayList arrayList137 = new ArrayList(1);
        arrayList137.add("BZ");
        hashMap.put(501, arrayList137);
        ArrayList arrayList138 = new ArrayList(1);
        arrayList138.add("GT");
        hashMap.put(502, arrayList138);
        ArrayList arrayList139 = new ArrayList(1);
        arrayList139.add("SV");
        hashMap.put(503, arrayList139);
        ArrayList arrayList140 = new ArrayList(1);
        arrayList140.add("HN");
        hashMap.put(504, arrayList140);
        ArrayList arrayList141 = new ArrayList(1);
        arrayList141.add("NI");
        hashMap.put(505, arrayList141);
        ArrayList arrayList142 = new ArrayList(1);
        arrayList142.add("CR");
        hashMap.put(506, arrayList142);
        ArrayList arrayList143 = new ArrayList(1);
        arrayList143.add("PA");
        hashMap.put(507, arrayList143);
        ArrayList arrayList144 = new ArrayList(1);
        arrayList144.add("PM");
        hashMap.put(508, arrayList144);
        ArrayList arrayList145 = new ArrayList(1);
        arrayList145.add("HT");
        hashMap.put(509, arrayList145);
        ArrayList arrayList146 = new ArrayList(3);
        arrayList146.add("GP");
        arrayList146.add("BL");
        arrayList146.add("MF");
        hashMap.put(590, arrayList146);
        ArrayList arrayList147 = new ArrayList(1);
        arrayList147.add("BO");
        hashMap.put(591, arrayList147);
        ArrayList arrayList148 = new ArrayList(1);
        arrayList148.add("GY");
        hashMap.put(592, arrayList148);
        ArrayList arrayList149 = new ArrayList(1);
        arrayList149.add("EC");
        hashMap.put(593, arrayList149);
        ArrayList arrayList150 = new ArrayList(1);
        arrayList150.add("GF");
        hashMap.put(594, arrayList150);
        ArrayList arrayList151 = new ArrayList(1);
        arrayList151.add("PY");
        hashMap.put(595, arrayList151);
        ArrayList arrayList152 = new ArrayList(1);
        arrayList152.add("MQ");
        hashMap.put(596, arrayList152);
        ArrayList arrayList153 = new ArrayList(1);
        arrayList153.add("SR");
        hashMap.put(597, arrayList153);
        ArrayList arrayList154 = new ArrayList(1);
        arrayList154.add("UY");
        hashMap.put(598, arrayList154);
        ArrayList arrayList155 = new ArrayList(2);
        arrayList155.add("CW");
        arrayList155.add("BQ");
        hashMap.put(599, arrayList155);
        ArrayList arrayList156 = new ArrayList(1);
        arrayList156.add("TL");
        hashMap.put(670, arrayList156);
        ArrayList arrayList157 = new ArrayList(1);
        arrayList157.add("NF");
        hashMap.put(672, arrayList157);
        ArrayList arrayList158 = new ArrayList(1);
        arrayList158.add("BN");
        hashMap.put(673, arrayList158);
        ArrayList arrayList159 = new ArrayList(1);
        arrayList159.add("NR");
        hashMap.put(674, arrayList159);
        ArrayList arrayList160 = new ArrayList(1);
        arrayList160.add("PG");
        hashMap.put(675, arrayList160);
        ArrayList arrayList161 = new ArrayList(1);
        arrayList161.add("TO");
        hashMap.put(676, arrayList161);
        ArrayList arrayList162 = new ArrayList(1);
        arrayList162.add("SB");
        hashMap.put(677, arrayList162);
        ArrayList arrayList163 = new ArrayList(1);
        arrayList163.add("VU");
        hashMap.put(678, arrayList163);
        ArrayList arrayList164 = new ArrayList(1);
        arrayList164.add("FJ");
        hashMap.put(679, arrayList164);
        ArrayList arrayList165 = new ArrayList(1);
        arrayList165.add("PW");
        hashMap.put(680, arrayList165);
        ArrayList arrayList166 = new ArrayList(1);
        arrayList166.add("WF");
        hashMap.put(681, arrayList166);
        ArrayList arrayList167 = new ArrayList(1);
        arrayList167.add("CK");
        hashMap.put(682, arrayList167);
        ArrayList arrayList168 = new ArrayList(1);
        arrayList168.add("NU");
        hashMap.put(683, arrayList168);
        ArrayList arrayList169 = new ArrayList(1);
        arrayList169.add("WS");
        hashMap.put(685, arrayList169);
        ArrayList arrayList170 = new ArrayList(1);
        arrayList170.add("KI");
        hashMap.put(686, arrayList170);
        ArrayList arrayList171 = new ArrayList(1);
        arrayList171.add("NC");
        hashMap.put(687, arrayList171);
        ArrayList arrayList172 = new ArrayList(1);
        arrayList172.add("TV");
        hashMap.put(688, arrayList172);
        ArrayList arrayList173 = new ArrayList(1);
        arrayList173.add("PF");
        hashMap.put(689, arrayList173);
        ArrayList arrayList174 = new ArrayList(1);
        arrayList174.add("TK");
        hashMap.put(690, arrayList174);
        ArrayList arrayList175 = new ArrayList(1);
        arrayList175.add("FM");
        hashMap.put(691, arrayList175);
        ArrayList arrayList176 = new ArrayList(1);
        arrayList176.add("MH");
        hashMap.put(692, arrayList176);
        ArrayList arrayList177 = new ArrayList(1);
        arrayList177.add("001");
        hashMap.put(800, arrayList177);
        ArrayList arrayList178 = new ArrayList(1);
        arrayList178.add("001");
        hashMap.put(808, arrayList178);
        ArrayList arrayList179 = new ArrayList(1);
        arrayList179.add("KP");
        hashMap.put(850, arrayList179);
        ArrayList arrayList180 = new ArrayList(1);
        arrayList180.add("HK");
        hashMap.put(852, arrayList180);
        ArrayList arrayList181 = new ArrayList(1);
        arrayList181.add("MO");
        hashMap.put(853, arrayList181);
        ArrayList arrayList182 = new ArrayList(1);
        arrayList182.add("KH");
        hashMap.put(855, arrayList182);
        ArrayList arrayList183 = new ArrayList(1);
        arrayList183.add("LA");
        hashMap.put(856, arrayList183);
        ArrayList arrayList184 = new ArrayList(1);
        arrayList184.add("001");
        hashMap.put(870, arrayList184);
        ArrayList arrayList185 = new ArrayList(1);
        arrayList185.add("001");
        hashMap.put(878, arrayList185);
        ArrayList arrayList186 = new ArrayList(1);
        arrayList186.add("BD");
        hashMap.put(880, arrayList186);
        ArrayList arrayList187 = new ArrayList(1);
        arrayList187.add("001");
        hashMap.put(881, arrayList187);
        ArrayList arrayList188 = new ArrayList(1);
        arrayList188.add("001");
        hashMap.put(882, arrayList188);
        ArrayList arrayList189 = new ArrayList(1);
        arrayList189.add("001");
        hashMap.put(883, arrayList189);
        ArrayList arrayList190 = new ArrayList(1);
        arrayList190.add("TW");
        hashMap.put(886, arrayList190);
        ArrayList arrayList191 = new ArrayList(1);
        arrayList191.add("001");
        hashMap.put(888, arrayList191);
        ArrayList arrayList192 = new ArrayList(1);
        arrayList192.add("MV");
        hashMap.put(960, arrayList192);
        ArrayList arrayList193 = new ArrayList(1);
        arrayList193.add("LB");
        hashMap.put(961, arrayList193);
        ArrayList arrayList194 = new ArrayList(1);
        arrayList194.add("JO");
        hashMap.put(962, arrayList194);
        ArrayList arrayList195 = new ArrayList(1);
        arrayList195.add("SY");
        hashMap.put(963, arrayList195);
        ArrayList arrayList196 = new ArrayList(1);
        arrayList196.add("IQ");
        hashMap.put(964, arrayList196);
        ArrayList arrayList197 = new ArrayList(1);
        arrayList197.add("KW");
        hashMap.put(965, arrayList197);
        ArrayList arrayList198 = new ArrayList(1);
        arrayList198.add("SA");
        hashMap.put(966, arrayList198);
        ArrayList arrayList199 = new ArrayList(1);
        arrayList199.add("YE");
        hashMap.put(967, arrayList199);
        ArrayList arrayList200 = new ArrayList(1);
        arrayList200.add("OM");
        hashMap.put(968, arrayList200);
        ArrayList arrayList201 = new ArrayList(1);
        arrayList201.add("PS");
        hashMap.put(970, arrayList201);
        ArrayList arrayList202 = new ArrayList(1);
        arrayList202.add("AE");
        hashMap.put(971, arrayList202);
        ArrayList arrayList203 = new ArrayList(1);
        arrayList203.add("IL");
        hashMap.put(972, arrayList203);
        ArrayList arrayList204 = new ArrayList(1);
        arrayList204.add("BH");
        hashMap.put(973, arrayList204);
        ArrayList arrayList205 = new ArrayList(1);
        arrayList205.add("QA");
        hashMap.put(974, arrayList205);
        ArrayList arrayList206 = new ArrayList(1);
        arrayList206.add("BT");
        hashMap.put(975, arrayList206);
        ArrayList arrayList207 = new ArrayList(1);
        arrayList207.add("MN");
        hashMap.put(976, arrayList207);
        ArrayList arrayList208 = new ArrayList(1);
        arrayList208.add("NP");
        hashMap.put(977, arrayList208);
        ArrayList arrayList209 = new ArrayList(1);
        arrayList209.add("001");
        hashMap.put(979, arrayList209);
        ArrayList arrayList210 = new ArrayList(1);
        arrayList210.add("TJ");
        hashMap.put(992, arrayList210);
        ArrayList arrayList211 = new ArrayList(1);
        arrayList211.add("TM");
        hashMap.put(993, arrayList211);
        ArrayList arrayList212 = new ArrayList(1);
        arrayList212.add("AZ");
        hashMap.put(994, arrayList212);
        ArrayList arrayList213 = new ArrayList(1);
        arrayList213.add("GE");
        hashMap.put(995, arrayList213);
        ArrayList arrayList214 = new ArrayList(1);
        arrayList214.add("KG");
        hashMap.put(996, arrayList214);
        ArrayList arrayList215 = new ArrayList(1);
        arrayList215.add("UZ");
        hashMap.put(998, arrayList215);
        this.A01 = r9;
        this.A02 = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() != 1 || !"001".equals(list.get(0))) {
                this.A07.addAll(list);
            } else {
                this.A05.add(entry.getKey());
            }
        }
        if (this.A07.remove("001")) {
            A0B.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.A06.addAll((Collection) hashMap.get(1));
    }

    public static C26071Mf A00() {
        if (A0R == null) {
            synchronized (C26071Mf.class) {
                if (A0R == null) {
                    A0R = new C26071Mf(AnonymousClass1G1.A00());
                }
            }
        }
        return A0R;
    }

    public static String A01(AnonymousClass3HS r4) {
        String str = "0";
        String str2 = "";
        if (r4.italianLeadingZero_) {
            str2 = str;
        }
        StringBuilder sb = new StringBuilder(str2);
        if (!r4.secondLeadingZero_) {
            str = "";
        }
        sb.append(str);
        sb.append(r4.nationalNumber_);
        return sb.toString();
    }

    public static String A02(String str) {
        StringBuilder sb = new StringBuilder(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|[");
        sb.append(str);
        sb.append("]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*");
        sb.append("(\\p{Nd}{1,7})");
        sb.append("#?|[- ]+(");
        sb.append("\\p{Nd}");
        sb.append("{1,5})#");
        return sb.toString();
    }

    public static String A03(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (char digit : str.toCharArray()) {
            int digit2 = Character.digit(digit, 10);
            if (digit2 != -1) {
                sb.append(digit2);
            }
        }
        return sb.toString();
    }

    public static final void A04(C796640u r2, StringBuilder sb, int i2) {
        switch (r2.ordinal()) {
            case 0:
                break;
            case 1:
                sb.insert(0, " ");
                break;
            case 3:
                sb.insert(0, "-");
                sb.insert(0, i2);
                sb.insert(0, '+');
                sb.insert(0, "tel:");
                return;
            default:
                return;
        }
        sb.insert(0, i2);
        sb.insert(0, '+');
    }

    public static void A05(StringBuilder sb) {
        String str;
        String obj = sb.toString();
        if (A0O.matcher(obj).matches()) {
            Map map = A0A;
            int length = obj.length();
            StringBuilder sb2 = new StringBuilder(length);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj2 = map.get(Character.valueOf(Character.toUpperCase(obj.charAt(i2))));
                if (obj2 != null) {
                    sb2.append(obj2);
                }
            }
            str = sb2.toString();
        } else {
            str = A03(obj);
        }
        sb.replace(0, sb.length(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        if ((r1.matches() ? X.C795640i.A00 : r1.lookingAt() ? X.C795640i.A01 : X.C795640i.A02) == X.C795640i.A01) goto L_0x00fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A06(X.AnonymousClass54V r9, X.AnonymousClass3HS r10, java.lang.String r11, java.lang.StringBuilder r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r11.length()
            r3 = 0
            if (r0 == 0) goto L_0x011d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            if (r9 == 0) goto L_0x0091
            java.lang.String r2 = r9.internationalPrefix_
        L_0x0010:
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0088
            java.util.regex.Pattern r0 = A0K
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0050
            int r0 = r1.end()
            r4.delete(r3, r0)
            A05(r4)
            X.41j r1 = X.C798041j.FROM_NUMBER_WITH_PLUS_SIGN
        L_0x002e:
            if (r13 == 0) goto L_0x0035
            r0 = 1
            r10.hasCountryCodeSource = r0
            r10.countryCodeSource_ = r1
        L_0x0035:
            X.41j r0 = X.C798041j.FROM_DEFAULT_COUNTRY
            if (r1 == r0) goto L_0x009f
            int r1 = r4.length()
            r0 = 2
            if (r1 <= r0) goto L_0x0095
            int r2 = r8.A07(r4, r12)
            if (r2 != 0) goto L_0x0106
            X.41z r2 = X.C799541z.INVALID_COUNTRY_CODE
            java.lang.String r1 = "Country calling code supplied was not recognised."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x0050:
            X.4Q0 r0 = r8.A00
            java.util.regex.Pattern r0 = r0.A00(r2)
            A05(r4)
            java.util.regex.Matcher r1 = r0.matcher(r4)
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0088
            int r5 = r1.end()
            java.util.regex.Pattern r1 = A0C
            java.lang.String r0 = r4.substring(r5)
            java.util.regex.Matcher r2 = r1.matcher(r0)
            boolean r1 = r2.find()
            r0 = 1
            if (r1 == 0) goto L_0x008b
            java.lang.String r0 = r2.group(r0)
            java.lang.String r1 = A03(r0)
            java.lang.String r0 = "0"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008b
        L_0x0088:
            X.41j r1 = X.C798041j.FROM_DEFAULT_COUNTRY
            goto L_0x002e
        L_0x008b:
            r4.delete(r3, r5)
            X.41j r1 = X.C798041j.FROM_NUMBER_WITH_IDD
            goto L_0x002e
        L_0x0091:
            java.lang.String r2 = "NonMatch"
            goto L_0x0010
        L_0x0095:
            X.41z r2 = X.C799541z.TOO_SHORT_AFTER_IDD
            java.lang.String r1 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x009f:
            if (r9 == 0) goto L_0x0118
            int r2 = r9.countryCode_
            java.lang.String r5 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r4.toString()
            boolean r0 = r1.startsWith(r5)
            if (r0 == 0) goto L_0x0118
            int r0 = r5.length()
            java.lang.String r0 = r1.substring(r0)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            X.54T r7 = r9.generalDesc_
            X.4Q0 r1 = r8.A00
            java.lang.String r0 = r7.nationalNumberPattern_
            java.util.regex.Pattern r6 = r1.A00(r0)
            r0 = 0
            r8.A0J(r9, r5, r0)
            java.lang.String r0 = r7.possibleNumberPattern_
            java.util.regex.Pattern r1 = r1.A00(r0)
            java.util.regex.Matcher r0 = r6.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x00e6
            java.util.regex.Matcher r0 = r6.matcher(r5)
            boolean r0 = r0.matches()
            if (r0 != 0) goto L_0x00fa
        L_0x00e6:
            java.lang.String r0 = r4.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            boolean r0 = r1.matches()
            if (r0 == 0) goto L_0x010c
            X.40i r1 = X.C795640i.IS_POSSIBLE
        L_0x00f6:
            X.40i r0 = X.C795640i.TOO_LONG
            if (r1 != r0) goto L_0x0118
        L_0x00fa:
            r12.append(r5)
            if (r13 == 0) goto L_0x0106
            X.41j r1 = X.C798041j.FROM_NUMBER_WITHOUT_PLUS_SIGN
            r0 = 1
            r10.hasCountryCodeSource = r0
            r10.countryCodeSource_ = r1
        L_0x0106:
            r0 = 1
            r10.hasCountryCode = r0
            r10.countryCode_ = r2
            return r2
        L_0x010c:
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x0115
            X.40i r1 = X.C795640i.TOO_LONG
            goto L_0x00f6
        L_0x0115:
            X.40i r1 = X.C795640i.TOO_SHORT
            goto L_0x00f6
        L_0x0118:
            r0 = 1
            r10.hasCountryCode = r0
            r10.countryCode_ = r3
        L_0x011d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26071Mf.A06(X.54V, X.3HS, java.lang.String, java.lang.StringBuilder, boolean):int");
    }

    public int A07(StringBuilder sb, StringBuilder sb2) {
        if (sb.length() != 0 && sb.charAt(0) != '0') {
            int length = sb.length();
            int i2 = 1;
            while (i2 <= length) {
                int parseInt = Integer.parseInt(sb.substring(0, i2));
                if (!this.A02.containsKey(Integer.valueOf(parseInt))) {
                    i2++;
                    if (i2 > 3) {
                        break;
                    }
                } else {
                    sb2.append(sb.substring(i2));
                    return parseInt;
                }
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        if (r2 == r1) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C795840k A08(X.AnonymousClass3HS r6, X.AnonymousClass3HS r7) {
        /*
            r5 = this;
            X.3HS r4 = new X.3HS
            r4.<init>()
            r4.A00(r6)
            X.3HS r3 = new X.3HS
            r3.<init>()
            r3.A00(r7)
            r1 = 0
            r4.hasRawInput = r1
            java.lang.String r2 = ""
            r4.rawInput_ = r2
            r4.hasCountryCodeSource = r1
            X.41j r0 = X.C798041j.FROM_NUMBER_WITH_PLUS_SIGN
            r4.countryCodeSource_ = r0
            r4.hasPreferredDomesticCarrierCode = r1
            r4.preferredDomesticCarrierCode_ = r2
            r3.hasRawInput = r1
            r3.rawInput_ = r2
            r3.hasCountryCodeSource = r1
            r3.countryCodeSource_ = r0
            r3.hasPreferredDomesticCarrierCode = r1
            r3.preferredDomesticCarrierCode_ = r2
            boolean r0 = r4.hasExtension
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = r4.extension_
            int r0 = r0.length()
            if (r0 != 0) goto L_0x003d
            r4.hasExtension = r1
            r4.extension_ = r2
        L_0x003d:
            boolean r1 = r3.hasExtension
            if (r1 == 0) goto L_0x004e
            java.lang.String r0 = r3.extension_
            int r0 = r0.length()
            if (r0 != 0) goto L_0x004e
            r1 = 0
            r3.hasExtension = r1
            r3.extension_ = r2
        L_0x004e:
            boolean r0 = r4.hasExtension
            if (r0 == 0) goto L_0x0061
            if (r1 == 0) goto L_0x0061
            java.lang.String r1 = r4.extension_
            java.lang.String r0 = r3.extension_
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0061
        L_0x005e:
            X.40k r0 = X.C795840k.NO_MATCH
            return r0
        L_0x0061:
            int r2 = r4.countryCode_
            int r1 = r3.countryCode_
            if (r2 == 0) goto L_0x0072
            if (r1 == 0) goto L_0x0072
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0080
            X.40k r0 = X.C795840k.EXACT_MATCH
            return r0
        L_0x0072:
            r0 = 1
            r4.hasCountryCode = r0
            r4.countryCode_ = r1
            boolean r0 = r4.A01(r3)
            if (r0 == 0) goto L_0x0082
            X.40k r0 = X.C795840k.NSN_MATCH
            return r0
        L_0x0080:
            if (r2 != r1) goto L_0x005e
        L_0x0082:
            long r0 = r4.nationalNumber_
            java.lang.String r2 = java.lang.String.valueOf(r0)
            long r0 = r3.nationalNumber_
            java.lang.String r1 = java.lang.String.valueOf(r0)
            boolean r0 = r2.endsWith(r1)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r1.endsWith(r2)
            if (r0 == 0) goto L_0x005e
        L_0x009a:
            X.40k r0 = X.C795840k.SHORT_NSN_MATCH
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26071Mf.A08(X.3HS, X.3HS):X.40k");
    }

    public C795840k A09(AnonymousClass3HS r10, String str) {
        String str2 = str;
        try {
            return A08(r10, A0E(str, "ZZ"));
        } catch (C803443m e2) {
            if (e2.errorType == C799541z.INVALID_COUNTRY_CODE) {
                String A0F2 = A0F(r10.countryCode_);
                try {
                    if (!A0F2.equals("ZZ")) {
                        C795840k A082 = A08(r10, A0E(str, A0F2));
                        return A082 == C795840k.EXACT_MATCH ? C795840k.NSN_MATCH : A082;
                    }
                    AnonymousClass3HS r4 = new AnonymousClass3HS();
                    A0H(r4, str2, (String) null, false, false);
                    return A08(r10, r4);
                } catch (C803443m unused) {
                    return C795840k.NOT_A_NUMBER;
                }
            }
            return C795840k.NOT_A_NUMBER;
        }
    }

    public final C796840w A0A(AnonymousClass54V r3, String str) {
        AnonymousClass54T r1 = r3.generalDesc_;
        if (r1.hasNationalNumberPattern && A0K(r1, str)) {
            if (A0K(r3.personalNumber_, str)) {
                return C796840w.PERSONAL_NUMBER;
            }
            if (A0K(r3.tollFree_, str)) {
                return C796840w.TOLL_FREE;
            }
            if (A0K(r3.sharedCost_, str)) {
                return C796840w.SHARED_COST;
            }
            if (A0K(r3.voip_, str)) {
                return C796840w.VOIP;
            }
            if (A0K(r3.premiumRate_, str)) {
                return C796840w.PREMIUM_RATE;
            }
            if (A0K(r3.pager_, str)) {
                return C796840w.PAGER;
            }
            if (A0K(r3.uan_, str)) {
                return C796840w.UAN;
            }
            if (A0K(r3.voicemail_, str)) {
                return C796840w.VOICEMAIL;
            }
            boolean A0K2 = A0K(r3.fixedLine_, str);
            boolean z2 = r3.sameMobileAndFixedLinePattern_;
            if (A0K2) {
                return (z2 || A0K(r3.mobile_, str)) ? C796840w.FIXED_LINE_OR_MOBILE : C796840w.FIXED_LINE;
            }
            if (!z2 && A0K(r3.mobile_, str)) {
                return C796840w.MOBILE;
            }
        }
        return C796840w.UNKNOWN;
    }

    public AnonymousClass54U A0B(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass54U r3 = (AnonymousClass54U) it.next();
            int size = r3.leadingDigitsPattern_.size();
            if (size != 0) {
                if (!this.A00.A00((String) r3.leadingDigitsPattern_.get(size - 1)).matcher(str).lookingAt()) {
                    continue;
                }
            }
            if (this.A00.A00(r3.pattern_).matcher(str).matches()) {
                return r3;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
        return (X.AnonymousClass54V) r2.get(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass54V A0C(int r4) {
        /*
            r3 = this;
            java.util.Map r2 = r3.A03
            monitor-enter(r2)
            java.util.Map r0 = r3.A02     // Catch:{ all -> 0x0025 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x0012
            r0 = 0
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0012:
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x0025 }
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = "001"
            r3.A0I(r0, r4)     // Catch:{ all -> 0x0025 }
        L_0x001d:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r2.get(r1)
            X.54V r0 = (X.AnonymousClass54V) r0
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26071Mf.A0C(int):X.54V");
    }

    public AnonymousClass54V A0D(String str) {
        if (str == null || !this.A07.contains(str)) {
            return null;
        }
        Map map = this.A04;
        AnonymousClass54V r0 = (AnonymousClass54V) map.get(str);
        if (r0 != null) {
            return r0;
        }
        synchronized (map) {
            if (!map.containsKey(str)) {
                A0I(str, 0);
            }
        }
        return (AnonymousClass54V) map.get(str);
    }

    public AnonymousClass3HS A0E(String str, String str2) {
        AnonymousClass3HS r1 = new AnonymousClass3HS();
        A0H(r1, str, str2, false, true);
        return r1;
    }

    public String A0F(int i2) {
        List list = (List) this.A02.get(Integer.valueOf(i2));
        return list == null ? "ZZ" : (String) list.get(0);
    }

    public String A0G(C796640u r9, AnonymousClass3HS r10) {
        if (r10.nationalNumber_ == 0 && r10.hasRawInput) {
            String str = r10.rawInput_;
            if (str.length() > 0) {
                return str;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int i2 = r10.countryCode_;
        String A012 = A01(r10);
        C796640u r0 = C796640u.E164;
        if (r9 == r0) {
            sb.append(A012);
            A04(r0, sb, i2);
        } else if (!this.A02.containsKey(Integer.valueOf(i2))) {
            sb.append(A012);
        } else {
            String A0F2 = A0F(i2);
            AnonymousClass54V A0C2 = "001".equals(A0F2) ? A0C(i2) : A0D(A0F2);
            AnonymousClass00B.A06(A0C2);
            AnonymousClass54U A0B2 = A0B(A012, (A0C2.intlNumberFormat_.size() == 0 || r9 == C796640u.NATIONAL) ? A0C2.numberFormat_ : A0C2.intlNumberFormat_);
            if (A0B2 != null) {
                String str2 = A0B2.format_;
                Matcher matcher = this.A00.A00(A0B2.pattern_).matcher(A012);
                C796640u r02 = C796640u.NATIONAL;
                String str3 = A0B2.nationalPrefixFormattingRule_;
                A012 = (r9 != r02 || str3 == null || str3.length() <= 0) ? matcher.replaceAll(str2) : matcher.replaceAll(A0H.matcher(str2).replaceFirst(str3));
                if (r9 == C796640u.RFC3966) {
                    Matcher matcher2 = A0M.matcher(A012);
                    if (matcher2.lookingAt()) {
                        A012 = matcher2.replaceFirst("");
                    }
                    A012 = matcher2.reset(A012).replaceAll("-");
                }
            }
            sb.append(A012);
            if (r10.hasExtension) {
                String str4 = r10.extension_;
                if (str4.length() > 0) {
                    sb.append(r9 == C796640u.RFC3966 ? ";ext=" : A0C2.hasPreferredExtnPrefix ? A0C2.preferredExtnPrefix_ : " ext. ");
                    sb.append(str4);
                }
            }
            A04(r9, sb, i2);
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(X.AnonymousClass3HS r13, java.lang.String r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            r12 = this;
            if (r14 == 0) goto L_0x024f
            int r1 = r14.length()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 > r0) goto L_0x0245
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = ";phone-context="
            int r4 = r14.indexOf(r0)
            if (r4 <= 0) goto L_0x0103
            int r2 = r4 + 15
            char r1 = r14.charAt(r2)
            r0 = 43
            if (r1 != r0) goto L_0x0030
            r0 = 59
            int r0 = r14.indexOf(r0, r2)
            if (r0 <= 0) goto L_0x00fd
            java.lang.String r0 = r14.substring(r2, r0)
        L_0x002d:
            r3.append(r0)
        L_0x0030:
            java.lang.String r0 = "tel:"
            int r0 = r14.indexOf(r0)
            int r0 = r0 + 4
            java.lang.String r6 = r14.substring(r0, r4)
        L_0x003d:
            r3.append(r6)
            java.lang.String r0 = ";isub="
            int r1 = r3.indexOf(r0)
            if (r1 <= 0) goto L_0x004f
            int r0 = r3.length()
            r3.delete(r1, r0)
        L_0x004f:
            java.lang.String r2 = r3.toString()
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x023b
            java.util.regex.Pattern r5 = A0P
            java.util.regex.Matcher r0 = r5.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x023b
            r6 = r12
            if (r17 == 0) goto L_0x0077
            java.lang.String r1 = r3.toString()
            if (r15 == 0) goto L_0x00df
            java.util.Set r0 = r12.A07
            boolean r0 = r0.contains(r15)
            if (r0 == 0) goto L_0x00df
        L_0x0077:
            r8 = r13
            r11 = r16
            if (r16 == 0) goto L_0x0081
            r0 = 1
            r13.hasRawInput = r0
            r13.rawInput_ = r14
        L_0x0081:
            java.util.regex.Pattern r0 = A0E
            java.util.regex.Matcher r4 = r0.matcher(r3)
            boolean r0 = r4.find()
            if (r0 == 0) goto L_0x00dc
            r1 = 0
            int r0 = r4.start()
            java.lang.String r2 = r3.substring(r1, r0)
            int r1 = r2.length()
            r0 = 2
            if (r1 < r0) goto L_0x00dc
            java.util.regex.Matcher r0 = r5.matcher(r2)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00dc
            int r2 = r4.groupCount()
            r1 = 1
        L_0x00ac:
            if (r1 > r2) goto L_0x00dc
            java.lang.String r0 = r4.group(r1)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r2 = r4.group(r1)
            int r1 = r4.start()
            int r0 = r3.length()
            r3.delete(r1, r0)
        L_0x00c3:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x00ce
            r0 = 1
            r13.hasExtension = r0
            r13.extension_ = r2
        L_0x00ce:
            X.54V r7 = r12.A0D(r15)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            goto L_0x015b
        L_0x00d9:
            int r1 = r1 + 1
            goto L_0x00ac
        L_0x00dc:
            java.lang.String r2 = ""
            goto L_0x00c3
        L_0x00df:
            if (r1 == 0) goto L_0x00f3
            int r0 = r1.length()
            if (r0 == 0) goto L_0x00f3
            java.util.regex.Pattern r0 = A0K
            java.util.regex.Matcher r0 = r0.matcher(r1)
            boolean r0 = r0.lookingAt()
            if (r0 != 0) goto L_0x0077
        L_0x00f3:
            X.41z r2 = X.C799541z.INVALID_COUNTRY_CODE
            java.lang.String r1 = "Missing or invalid default region."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x00fd:
            java.lang.String r0 = r14.substring(r2)
            goto L_0x002d
        L_0x0103:
            java.util.regex.Pattern r0 = A0Q
            java.util.regex.Matcher r1 = r0.matcher(r14)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0157
            int r0 = r1.start()
            java.lang.String r6 = r14.substring(r0)
            java.util.regex.Pattern r0 = A0N
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            r5 = 0
            if (r0 == 0) goto L_0x0141
            int r0 = r1.start()
            java.lang.String r6 = r6.substring(r5, r0)
            java.util.logging.Logger r4 = A0B
            java.util.logging.Level r2 = java.util.logging.Level.FINER
            java.lang.String r1 = "Stripped trailing characters: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.log(r2, r0)
        L_0x0141:
            java.util.regex.Pattern r0 = A0L
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x003d
            int r0 = r1.start()
            java.lang.String r6 = r6.substring(r5, r0)
            goto L_0x003d
        L_0x0157:
            java.lang.String r6 = ""
            goto L_0x003d
        L_0x015b:
            java.lang.String r9 = r3.toString()     // Catch:{ 43m -> 0x017f }
            int r4 = r6.A06(r7, r8, r9, r10, r11)     // Catch:{ 43m -> 0x017f }
            if (r4 != 0) goto L_0x01ac
            A05(r3)
            r10.append(r3)
            if (r15 == 0) goto L_0x0175
            int r1 = r7.countryCode_
            r0 = 1
            r13.hasCountryCode = r0
            r13.countryCode_ = r1
            goto L_0x01c2
        L_0x0175:
            if (r16 == 0) goto L_0x01c2
            r0 = 0
            r13.hasCountryCodeSource = r0
            X.41j r0 = X.C798041j.FROM_NUMBER_WITH_PLUS_SIGN
            r13.countryCodeSource_ = r0
            goto L_0x01c2
        L_0x017f:
            r4 = move-exception
            java.util.regex.Pattern r1 = A0K
            java.lang.String r0 = r3.toString()
            java.util.regex.Matcher r1 = r1.matcher(r0)
            X.41z r0 = r4.errorType
            X.41z r2 = X.C799541z.INVALID_COUNTRY_CODE
            if (r0 != r2) goto L_0x022f
            boolean r0 = r1.lookingAt()
            if (r0 == 0) goto L_0x022f
            int r0 = r1.end()
            java.lang.String r9 = r3.substring(r0)
            int r4 = r6.A06(r7, r8, r9, r10, r11)
            if (r4 != 0) goto L_0x01ac
            java.lang.String r1 = "Could not interpret numbers after plus-sign."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x01ac:
            java.lang.String r1 = r12.A0F(r4)
            boolean r0 = r1.equals(r15)
            if (r0 != 0) goto L_0x01c2
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0210
            X.54V r7 = r12.A0C(r4)
        L_0x01c2:
            int r0 = r10.length()
            java.lang.String r3 = "The string supplied is too short to be a phone number."
            r2 = 2
            if (r0 < r2) goto L_0x0227
            if (r7 == 0) goto L_0x01e0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r12.A0J(r7, r10, r0)
            if (r16 == 0) goto L_0x01e0
            java.lang.String r1 = r0.toString()
            r0 = 1
            r13.hasPreferredDomesticCarrierCode = r0
            r13.preferredDomesticCarrierCode_ = r1
        L_0x01e0:
            int r1 = r10.length()
            if (r1 < r2) goto L_0x021f
            r0 = 16
            if (r1 > r0) goto L_0x0215
            r0 = 0
            char r0 = r10.charAt(r0)
            r2 = 48
            if (r0 != r2) goto L_0x0202
            r1 = 1
            r13.hasItalianLeadingZero = r1
            r13.italianLeadingZero_ = r1
            char r0 = r10.charAt(r1)
            if (r0 != r2) goto L_0x0202
            r13.hasSecondLeadingZero = r1
            r13.secondLeadingZero_ = r1
        L_0x0202:
            java.lang.String r0 = r10.toString()
            long r1 = java.lang.Long.parseLong(r0)
            r0 = 1
            r13.hasNationalNumber = r0
            r13.nationalNumber_ = r1
            return
        L_0x0210:
            X.54V r7 = r12.A0D(r1)
            goto L_0x01c2
        L_0x0215:
            X.41z r2 = X.C799541z.TOO_LONG
            java.lang.String r1 = "The string supplied is too long to be a phone number."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x021f:
            X.41z r1 = X.C799541z.TOO_SHORT_NSN
            X.43m r0 = new X.43m
            r0.<init>(r1, r3)
            throw r0
        L_0x0227:
            X.41z r1 = X.C799541z.TOO_SHORT_NSN
            X.43m r0 = new X.43m
            r0.<init>(r1, r3)
            throw r0
        L_0x022f:
            X.41z r2 = r4.errorType
            java.lang.String r1 = r4.getMessage()
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x023b:
            X.41z r2 = X.C799541z.NOT_A_NUMBER
            java.lang.String r1 = "The string supplied did not seem to be a phone number."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x0245:
            X.41z r2 = X.C799541z.TOO_LONG
            java.lang.String r1 = "The string supplied was too long to parse."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        L_0x024f:
            X.41z r2 = X.C799541z.NOT_A_NUMBER
            java.lang.String r1 = "The phone number supplied was null."
            X.43m r0 = new X.43m
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26071Mf.A0H(X.3HS, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    public void A0I(String str, int i2) {
        boolean equals = "001".equals(str);
        C29211aE A012 = this.A01.A01(str);
        if (A012 == null) {
            Logger logger = A0B;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("phonenumberutil/empty metadata: ");
            sb.append(str);
            logger.log(level, sb.toString());
            return;
        }
        AnonymousClass54V r3 = new AnonymousClass54V();
        String str2 = A012.A02;
        r3.hasId = true;
        r3.id_ = str2;
        int i3 = A012.A00;
        r3.hasCountryCode = true;
        r3.countryCode_ = i3;
        String str3 = A012.A01;
        r3.hasInternationalPrefix = true;
        r3.internationalPrefix_ = str3;
        LinkedList linkedList = new LinkedList();
        String[] strArr = A012.A09;
        if (strArr != null) {
            for (int i4 = 0; i4 < strArr.length; i4++) {
                AnonymousClass54U r9 = new AnonymousClass54U();
                String str4 = strArr[i4];
                r9.hasPattern = true;
                r9.pattern_ = str4;
                String str5 = A012.A07[i4];
                r9.hasFormat = true;
                r9.format_ = str5;
                String[] strArr2 = A012.A08;
                if (strArr2 != null && i4 < strArr2.length && strArr2[i4] != null && !strArr2[i4].equals("N/A")) {
                    for (String add : TextUtils.split(strArr2[i4], "#")) {
                        r9.leadingDigitsPattern_.add(add);
                    }
                }
                r3.intlNumberFormat_.add(r9);
                r3.numberFormat_.add(r9);
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(r9.pattern_);
                sb2.append(")");
                linkedList.add(sb2.toString());
            }
        }
        AnonymousClass54T r2 = new AnonymousClass54T();
        String join = TextUtils.join("|", linkedList);
        r2.hasNationalNumberPattern = true;
        r2.nationalNumberPattern_ = join;
        r2.hasPossibleNumberPattern = true;
        r2.possibleNumberPattern_ = join;
        r3.hasGeneralDesc = true;
        r3.generalDesc_ = r2;
        r3.hasPersonalNumber = true;
        r3.personalNumber_ = r2;
        if (equals) {
            this.A03.put(Integer.valueOf(i2), r3);
        } else {
            this.A04.put(str, r3);
        }
    }

    public boolean A0J(AnonymousClass54V r11, StringBuilder sb, StringBuilder sb2) {
        int length = sb.length();
        String str = r11.nationalPrefixForParsing_;
        if (!(length == 0 || str.length() == 0)) {
            AnonymousClass4Q0 r2 = this.A00;
            Matcher matcher = r2.A00(str).matcher(sb);
            if (matcher.lookingAt()) {
                Pattern A002 = r2.A00(r11.generalDesc_.nationalNumberPattern_);
                boolean matches = A002.matcher(sb).matches();
                int groupCount = matcher.groupCount();
                String str2 = r11.nationalPrefixTransformRule_;
                if (str2 != null && str2.length() != 0 && matcher.group(groupCount) != null) {
                    StringBuilder sb3 = new StringBuilder(sb);
                    sb3.replace(0, length, matcher.replaceFirst(str2));
                    if (!matches || A002.matcher(sb3.toString()).matches()) {
                        if (sb2 != null && groupCount > 1) {
                            sb2.append(matcher.group(1));
                        }
                        sb.replace(0, sb.length(), sb3.toString());
                        return true;
                    }
                } else if (matches && !A002.matcher(sb.substring(matcher.end())).matches()) {
                    return false;
                } else {
                    if (!(sb2 == null || groupCount <= 0 || matcher.group(groupCount) == null)) {
                        sb2.append(matcher.group(1));
                    }
                    sb.delete(0, matcher.end());
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A0K(AnonymousClass54T r4, String str) {
        AnonymousClass4Q0 r1 = this.A00;
        return r1.A00(r4.possibleNumberPattern_).matcher(str).matches() && r1.A00(r4.nationalNumberPattern_).matcher(str).matches();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r1 != r0.countryCode_) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L(X.AnonymousClass3HS r7) {
        /*
            r6 = this;
            int r5 = r7.countryCode_
            java.util.Map r1 = r6.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r1.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0075
            java.lang.String r4 = A01(r7)
            java.util.logging.Logger r3 = A0B
            java.util.logging.Level r2 = java.util.logging.Level.WARNING
            java.lang.String r0 = "Missing/invalid country_code ("
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            java.lang.String r0 = ") for number "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.log(r2, r0)
        L_0x0031:
            r5 = 0
        L_0x0032:
            int r1 = r7.countryCode_
            java.lang.String r0 = "001"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0070
            X.54V r3 = r6.A0C(r1)
        L_0x0040:
            r2 = 0
            if (r3 == 0) goto L_0x004f
            if (r0 != 0) goto L_0x0050
            X.54V r0 = r6.A0D(r5)
            if (r0 == 0) goto L_0x00c0
            int r0 = r0.countryCode_
            if (r1 == r0) goto L_0x0050
        L_0x004f:
            return r2
        L_0x0050:
            X.54T r0 = r3.generalDesc_
            java.lang.String r1 = A01(r7)
            boolean r0 = r0.hasNationalNumberPattern
            if (r0 != 0) goto L_0x0067
            int r1 = r1.length()
            r0 = 2
            if (r1 <= r0) goto L_0x004f
            r0 = 16
            if (r1 > r0) goto L_0x004f
        L_0x0065:
            r2 = 1
            return r2
        L_0x0067:
            X.40w r1 = r6.A0A(r3, r1)
            X.40w r0 = X.C796840w.UNKNOWN
            if (r1 == r0) goto L_0x004f
            goto L_0x0065
        L_0x0070:
            X.54V r3 = r6.A0D(r5)
            goto L_0x0040
        L_0x0075:
            int r1 = r2.size()
            r0 = 1
            if (r1 != r0) goto L_0x0084
            r0 = 0
            java.lang.Object r5 = r2.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x0032
        L_0x0084:
            java.lang.String r4 = A01(r7)
            java.util.Iterator r3 = r2.iterator()
        L_0x008c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            X.54V r2 = r6.A0D(r5)
            if (r2 == 0) goto L_0x008c
            boolean r0 = r2.hasLeadingDigits
            if (r0 == 0) goto L_0x00b6
            X.4Q0 r1 = r6.A00
            java.lang.String r0 = r2.leadingDigits_
            java.util.regex.Pattern r0 = r1.A00(r0)
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.lookingAt()
            if (r0 == 0) goto L_0x008c
            goto L_0x0032
        L_0x00b6:
            X.40w r1 = r6.A0A(r2, r4)
            X.40w r0 = X.C796840w.UNKNOWN
            if (r1 == r0) goto L_0x008c
            goto L_0x0032
        L_0x00c0:
            java.lang.String r1 = "Invalid region code: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26071Mf.A0L(X.3HS):boolean");
    }
}
