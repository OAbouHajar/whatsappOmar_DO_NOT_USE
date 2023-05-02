package org.spongycastle.jcajce.provider.symmetric;

import X.AnonymousClass000;
import X.AnonymousClass1UN;
import X.AnonymousClass1UO;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.AnonymousClass4U8;
import X.AnonymousClass59n;
import X.AnonymousClass5AA;
import X.AnonymousClass5BF;
import X.AnonymousClass5BG;
import X.AnonymousClass5I7;
import X.AnonymousClass5I8;
import X.AnonymousClass5IT;
import X.AnonymousClass5JB;
import X.AnonymousClass5JC;
import X.AnonymousClass5JK;
import X.AnonymousClass5JL;
import X.AnonymousClass5JX;
import X.AnonymousClass5Kd;
import X.AnonymousClass5Kp;
import X.AnonymousClass5T1;
import X.AnonymousClass5VP;
import X.C1046856m;
import X.C1053159a;
import X.C1054459q;
import X.C1054659s;
import X.C1054759t;
import X.C1054859u;
import X.C1054959v;
import X.C1055259y;
import X.C105995Cc;
import X.C106005Cd;
import X.C106015Ce;
import X.C106025Cf;
import X.C106035Cg;
import X.C107405Ib;
import X.C32041fY;
import X.C32051fZ;
import X.C32351gB;
import X.C32411gJ;
import X.C33001hh;
import X.C33111hx;
import X.C33131i5;
import X.C46902Gs;
import X.C46912Gt;
import X.C46932Gv;
import X.C89424c9;
import X.C89784cu;
import X.C90614eS;
import java.security.AccessController;
import java.security.AlgorithmParameters;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.IvParameterSpec;

public final class AES {
    public static final Map A00;

    public class Mappings extends C33001hh {
        public static final String A00 = AES.class.getName();

        public void A00(AnonymousClass1UO r42) {
            StringBuilder sb = new StringBuilder();
            String str = A00;
            sb.append(str);
            sb.append("$AlgParams");
            AnonymousClass1UO r11 = r42;
            r11.A4W("AlgorithmParameters.AES", sb.toString());
            r11.A4W("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
            r11.A4W("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
            r11.A4W("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb2 = new StringBuilder("Alg.Alias.AlgorithmParameters.");
            C32041fY r26 = C32351gB.A08;
            sb2.append(r26);
            r11.A4W(sb2.toString(), "AES");
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r32 = C32351gB.A0G;
            sb3.append(r32);
            r11.A4W(sb3.toString(), "AES");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r34 = C32351gB.A0O;
            sb4.append(r34);
            r11.A4W(sb4.toString(), "AES");
            StringBuilder sb5 = new StringBuilder();
            sb5.append(str);
            sb5.append("$AlgParamsGCM");
            r11.A4W("AlgorithmParameters.GCM", sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r35 = C32351gB.A0C;
            sb6.append(r35);
            r11.A4W(sb6.toString(), "GCM");
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r36 = C32351gB.A0K;
            sb7.append(r36);
            r11.A4W(sb7.toString(), "GCM");
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r37 = C32351gB.A0S;
            sb8.append(r37);
            r11.A4W(sb8.toString(), "GCM");
            StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append("$AlgParamsCCM");
            r11.A4W("AlgorithmParameters.CCM", sb9.toString());
            StringBuilder sb10 = new StringBuilder();
            sb10.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r38 = C32351gB.A09;
            sb10.append(r38);
            r11.A4W(sb10.toString(), "CCM");
            StringBuilder sb11 = new StringBuilder();
            sb11.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r7 = C32351gB.A0H;
            sb11.append(r7);
            r11.A4W(sb11.toString(), "CCM");
            StringBuilder sb12 = new StringBuilder();
            sb12.append("Alg.Alias.AlgorithmParameters.");
            C32041fY r6 = C32351gB.A0P;
            sb12.append(r6);
            r11.A4W(sb12.toString(), "CCM");
            StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append("$AlgParamGen");
            r11.A4W("AlgorithmParameterGenerator.AES", sb13.toString());
            r11.A4W("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
            r11.A4W("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
            r11.A4W("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
            StringBuilder sb14 = new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.");
            sb14.append(r26);
            r11.A4W(sb14.toString(), "AES");
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb15.append(r32);
            r11.A4W(sb15.toString(), "AES");
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb16.append(r34);
            r11.A4W(sb16.toString(), "AES");
            Map map = AES.A00;
            AnonymousClass1UN r40 = (AnonymousClass1UN) r11;
            for (String str2 : map.keySet()) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append("Cipher.AES");
                sb17.append(" ");
                sb17.append(str2);
                String obj = sb17.toString();
                if (!r40.containsKey(obj)) {
                    r40.put(obj, map.get(str2));
                } else {
                    StringBuilder sb18 = new StringBuilder("duplicate provider attribute key (");
                    sb18.append(obj);
                    sb18.append(") found");
                    throw new IllegalStateException(sb18.toString());
                }
            }
            StringBuilder sb19 = new StringBuilder();
            sb19.append(str);
            sb19.append("$ECB");
            r11.A4W("Cipher.AES", sb19.toString());
            r11.A4W("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
            r11.A4W("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
            r11.A4W("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
            C32041fY r24 = C32351gB.A0B;
            StringBuilder sb20 = new StringBuilder();
            sb20.append(str);
            sb20.append("$ECB");
            String obj2 = sb20.toString();
            StringBuilder sb21 = new StringBuilder();
            sb21.append("Cipher");
            sb21.append(".");
            sb21.append(r24);
            r40.A4W(sb21.toString(), obj2);
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Cipher");
            sb22.append(".OID.");
            sb22.append(r24);
            r40.A4W(sb22.toString(), obj2);
            C32041fY r29 = C32351gB.A0J;
            StringBuilder sb23 = new StringBuilder();
            sb23.append(str);
            sb23.append("$ECB");
            String obj3 = sb23.toString();
            StringBuilder sb24 = new StringBuilder();
            sb24.append("Cipher");
            sb24.append(".");
            sb24.append(r29);
            r40.A4W(sb24.toString(), obj3);
            StringBuilder sb25 = new StringBuilder();
            sb25.append("Cipher");
            sb25.append(".OID.");
            sb25.append(r29);
            r40.A4W(sb25.toString(), obj3);
            C32041fY r33 = C32351gB.A0R;
            StringBuilder sb26 = new StringBuilder();
            sb26.append(str);
            sb26.append("$ECB");
            String obj4 = sb26.toString();
            StringBuilder sb27 = new StringBuilder();
            sb27.append("Cipher");
            sb27.append(".");
            sb27.append(r33);
            r40.A4W(sb27.toString(), obj4);
            StringBuilder sb28 = new StringBuilder();
            sb28.append("Cipher");
            sb28.append(".OID.");
            sb28.append(r33);
            r40.A4W(sb28.toString(), obj4);
            StringBuilder sb29 = new StringBuilder();
            sb29.append(str);
            sb29.append("$CBC");
            String obj5 = sb29.toString();
            StringBuilder sb30 = new StringBuilder();
            sb30.append("Cipher");
            sb30.append(".");
            sb30.append(r26);
            r40.A4W(sb30.toString(), obj5);
            StringBuilder sb31 = new StringBuilder();
            sb31.append("Cipher");
            sb31.append(".OID.");
            sb31.append(r26);
            r40.A4W(sb31.toString(), obj5);
            StringBuilder sb32 = new StringBuilder();
            sb32.append(str);
            sb32.append("$CBC");
            String obj6 = sb32.toString();
            StringBuilder sb33 = new StringBuilder();
            sb33.append("Cipher");
            sb33.append(".");
            sb33.append(r32);
            r40.A4W(sb33.toString(), obj6);
            StringBuilder sb34 = new StringBuilder();
            sb34.append("Cipher");
            sb34.append(".OID.");
            sb34.append(r32);
            r40.A4W(sb34.toString(), obj6);
            StringBuilder sb35 = new StringBuilder();
            sb35.append(str);
            sb35.append("$CBC");
            String obj7 = sb35.toString();
            StringBuilder sb36 = new StringBuilder();
            sb36.append("Cipher");
            sb36.append(".");
            sb36.append(r34);
            r40.A4W(sb36.toString(), obj7);
            StringBuilder sb37 = new StringBuilder();
            sb37.append("Cipher");
            sb37.append(".OID.");
            sb37.append(r34);
            r40.A4W(sb37.toString(), obj7);
            C32041fY r18 = C32351gB.A0D;
            StringBuilder sb38 = new StringBuilder();
            sb38.append(str);
            sb38.append("$OFB");
            String obj8 = sb38.toString();
            StringBuilder sb39 = new StringBuilder();
            sb39.append("Cipher");
            sb39.append(".");
            sb39.append(r18);
            r40.A4W(sb39.toString(), obj8);
            StringBuilder sb40 = new StringBuilder();
            sb40.append("Cipher");
            sb40.append(".OID.");
            sb40.append(r18);
            r40.A4W(sb40.toString(), obj8);
            C32041fY r23 = C32351gB.A0L;
            StringBuilder sb41 = new StringBuilder();
            sb41.append(str);
            sb41.append("$OFB");
            String obj9 = sb41.toString();
            StringBuilder sb42 = new StringBuilder();
            sb42.append("Cipher");
            sb42.append(".");
            sb42.append(r23);
            r40.A4W(sb42.toString(), obj9);
            StringBuilder sb43 = new StringBuilder();
            sb43.append("Cipher");
            sb43.append(".OID.");
            sb43.append(r23);
            r40.A4W(sb43.toString(), obj9);
            C32041fY r28 = C32351gB.A0T;
            StringBuilder sb44 = new StringBuilder();
            sb44.append(str);
            sb44.append("$OFB");
            String obj10 = sb44.toString();
            StringBuilder sb45 = new StringBuilder();
            sb45.append("Cipher");
            sb45.append(".");
            sb45.append(r28);
            r40.A4W(sb45.toString(), obj10);
            StringBuilder sb46 = new StringBuilder();
            sb46.append("Cipher");
            sb46.append(".OID.");
            sb46.append(r28);
            r40.A4W(sb46.toString(), obj10);
            C32041fY r19 = C32351gB.A0A;
            StringBuilder sb47 = new StringBuilder();
            sb47.append(str);
            sb47.append("$CFB");
            String obj11 = sb47.toString();
            StringBuilder sb48 = new StringBuilder();
            sb48.append("Cipher");
            sb48.append(".");
            sb48.append(r19);
            r40.A4W(sb48.toString(), obj11);
            StringBuilder sb49 = new StringBuilder();
            sb49.append("Cipher");
            sb49.append(".OID.");
            sb49.append(r19);
            r40.A4W(sb49.toString(), obj11);
            C32041fY r17 = C32351gB.A0I;
            StringBuilder sb50 = new StringBuilder();
            sb50.append(str);
            sb50.append("$CFB");
            String obj12 = sb50.toString();
            StringBuilder sb51 = new StringBuilder();
            sb51.append("Cipher");
            sb51.append(".");
            sb51.append(r17);
            r40.A4W(sb51.toString(), obj12);
            StringBuilder sb52 = new StringBuilder();
            sb52.append("Cipher");
            sb52.append(".OID.");
            sb52.append(r17);
            r40.A4W(sb52.toString(), obj12);
            C32041fY r25 = C32351gB.A0Q;
            StringBuilder sb53 = new StringBuilder();
            sb53.append(str);
            sb53.append("$CFB");
            String obj13 = sb53.toString();
            StringBuilder sb54 = new StringBuilder();
            sb54.append("Cipher");
            sb54.append(".");
            sb54.append(r25);
            r40.A4W(sb54.toString(), obj13);
            StringBuilder sb55 = new StringBuilder();
            sb55.append("Cipher");
            sb55.append(".OID.");
            sb55.append(r25);
            r40.A4W(sb55.toString(), obj13);
            for (String str3 : map.keySet()) {
                StringBuilder sb56 = new StringBuilder();
                sb56.append("Cipher.AESWRAP");
                sb56.append(" ");
                sb56.append(str3);
                String obj14 = sb56.toString();
                if (!r40.containsKey(obj14)) {
                    r40.put(obj14, map.get(str3));
                } else {
                    StringBuilder sb57 = new StringBuilder("duplicate provider attribute key (");
                    sb57.append(obj14);
                    sb57.append(") found");
                    throw new IllegalStateException(sb57.toString());
                }
            }
            StringBuilder sb58 = new StringBuilder();
            sb58.append(str);
            sb58.append("$Wrap");
            r11.A4W("Cipher.AESWRAP", sb58.toString());
            C32041fY r21 = C32351gB.A0E;
            StringBuilder sb59 = new StringBuilder();
            sb59.append("Alg.Alias.Cipher");
            sb59.append(".");
            sb59.append(r21);
            r40.A4W(sb59.toString(), "AESWRAP");
            StringBuilder sb60 = new StringBuilder();
            sb60.append("Alg.Alias.Cipher");
            sb60.append(".OID.");
            sb60.append(r21);
            r40.A4W(sb60.toString(), "AESWRAP");
            C32041fY r22 = C32351gB.A0M;
            StringBuilder sb61 = new StringBuilder();
            sb61.append("Alg.Alias.Cipher");
            sb61.append(".");
            sb61.append(r22);
            r40.A4W(sb61.toString(), "AESWRAP");
            StringBuilder sb62 = new StringBuilder();
            sb62.append("Alg.Alias.Cipher");
            sb62.append(".OID.");
            sb62.append(r22);
            r40.A4W(sb62.toString(), "AESWRAP");
            C32041fY r16 = C32351gB.A0U;
            StringBuilder sb63 = new StringBuilder();
            sb63.append("Alg.Alias.Cipher");
            sb63.append(".");
            sb63.append(r16);
            r40.A4W(sb63.toString(), "AESWRAP");
            StringBuilder sb64 = new StringBuilder();
            sb64.append("Alg.Alias.Cipher");
            sb64.append(".OID.");
            sb64.append(r16);
            r40.A4W(sb64.toString(), "AESWRAP");
            r11.A4W("Alg.Alias.Cipher.AESKW", "AESWRAP");
            for (String str4 : map.keySet()) {
                StringBuilder sb65 = new StringBuilder();
                sb65.append("Cipher.AESWRAPPAD");
                sb65.append(" ");
                sb65.append(str4);
                String obj15 = sb65.toString();
                if (!r40.containsKey(obj15)) {
                    r40.put(obj15, map.get(str4));
                } else {
                    StringBuilder sb66 = new StringBuilder("duplicate provider attribute key (");
                    sb66.append(obj15);
                    sb66.append(") found");
                    throw new IllegalStateException(sb66.toString());
                }
            }
            StringBuilder sb67 = new StringBuilder();
            sb67.append(str);
            sb67.append("$WrapPad");
            r11.A4W("Cipher.AESWRAPPAD", sb67.toString());
            C32041fY r31 = C32351gB.A0F;
            StringBuilder sb68 = new StringBuilder();
            sb68.append("Alg.Alias.Cipher");
            sb68.append(".");
            sb68.append(r31);
            r40.A4W(sb68.toString(), "AESWRAPPAD");
            StringBuilder sb69 = new StringBuilder();
            sb69.append("Alg.Alias.Cipher");
            sb69.append(".OID.");
            sb69.append(r31);
            r40.A4W(sb69.toString(), "AESWRAPPAD");
            C32041fY r30 = C32351gB.A0N;
            StringBuilder sb70 = new StringBuilder();
            sb70.append("Alg.Alias.Cipher");
            sb70.append(".");
            sb70.append(r30);
            r40.A4W(sb70.toString(), "AESWRAPPAD");
            StringBuilder sb71 = new StringBuilder();
            sb71.append("Alg.Alias.Cipher");
            sb71.append(".OID.");
            sb71.append(r30);
            r40.A4W(sb71.toString(), "AESWRAPPAD");
            C32041fY r27 = C32351gB.A0V;
            StringBuilder sb72 = new StringBuilder();
            sb72.append("Alg.Alias.Cipher");
            sb72.append(".");
            sb72.append(r27);
            r40.A4W(sb72.toString(), "AESWRAPPAD");
            StringBuilder sb73 = new StringBuilder();
            sb73.append("Alg.Alias.Cipher");
            sb73.append(".OID.");
            sb73.append(r27);
            r40.A4W(sb73.toString(), "AESWRAPPAD");
            r11.A4W("Alg.Alias.Cipher.AESKWP", "AESWRAPPAD");
            StringBuilder sb74 = new StringBuilder();
            sb74.append(str);
            sb74.append("$RFC3211Wrap");
            r11.A4W("Cipher.AESRFC3211WRAP", sb74.toString());
            StringBuilder sb75 = new StringBuilder();
            sb75.append(str);
            sb75.append("$RFC5649Wrap");
            r11.A4W("Cipher.AESRFC5649WRAP", sb75.toString());
            StringBuilder sb76 = new StringBuilder();
            sb76.append(str);
            sb76.append("$AlgParamGenCCM");
            r11.A4W("AlgorithmParameterGenerator.CCM", sb76.toString());
            StringBuilder sb77 = new StringBuilder();
            sb77.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb77.append(r38);
            r11.A4W(sb77.toString(), "CCM");
            StringBuilder sb78 = new StringBuilder();
            sb78.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb78.append(r7);
            r11.A4W(sb78.toString(), "CCM");
            StringBuilder sb79 = new StringBuilder();
            sb79.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb79.append(r6);
            r11.A4W(sb79.toString(), "CCM");
            for (String str5 : map.keySet()) {
                StringBuilder sb80 = new StringBuilder();
                sb80.append("Cipher.CCM");
                sb80.append(" ");
                sb80.append(str5);
                String obj16 = sb80.toString();
                if (!r40.containsKey(obj16)) {
                    r40.put(obj16, map.get(str5));
                } else {
                    StringBuilder sb81 = new StringBuilder("duplicate provider attribute key (");
                    sb81.append(obj16);
                    sb81.append(") found");
                    throw new IllegalStateException(sb81.toString());
                }
            }
            StringBuilder sb82 = new StringBuilder();
            sb82.append(str);
            sb82.append("$CCM");
            r11.A4W("Cipher.CCM", sb82.toString());
            StringBuilder sb83 = new StringBuilder();
            sb83.append("Alg.Alias.Cipher");
            sb83.append(".");
            sb83.append(r38);
            r40.A4W(sb83.toString(), "CCM");
            StringBuilder sb84 = new StringBuilder();
            sb84.append("Alg.Alias.Cipher");
            sb84.append(".OID.");
            sb84.append(r38);
            r40.A4W(sb84.toString(), "CCM");
            StringBuilder sb85 = new StringBuilder();
            sb85.append("Alg.Alias.Cipher");
            sb85.append(".");
            sb85.append(r7);
            r40.A4W(sb85.toString(), "CCM");
            StringBuilder sb86 = new StringBuilder();
            sb86.append("Alg.Alias.Cipher");
            sb86.append(".OID.");
            sb86.append(r7);
            r40.A4W(sb86.toString(), "CCM");
            StringBuilder sb87 = new StringBuilder();
            sb87.append("Alg.Alias.Cipher");
            sb87.append(".");
            sb87.append(r6);
            r40.A4W(sb87.toString(), "CCM");
            StringBuilder sb88 = new StringBuilder();
            sb88.append("Alg.Alias.Cipher");
            sb88.append(".OID.");
            sb88.append(r6);
            r40.A4W(sb88.toString(), "CCM");
            StringBuilder sb89 = new StringBuilder();
            sb89.append(str);
            sb89.append("$AlgParamGenGCM");
            r11.A4W("AlgorithmParameterGenerator.GCM", sb89.toString());
            StringBuilder sb90 = new StringBuilder();
            sb90.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb90.append(r35);
            r11.A4W(sb90.toString(), "GCM");
            StringBuilder sb91 = new StringBuilder();
            sb91.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb91.append(r36);
            r11.A4W(sb91.toString(), "GCM");
            StringBuilder sb92 = new StringBuilder();
            sb92.append("Alg.Alias.AlgorithmParameterGenerator.");
            sb92.append(r37);
            r11.A4W(sb92.toString(), "GCM");
            for (String str6 : map.keySet()) {
                StringBuilder sb93 = new StringBuilder();
                sb93.append("Cipher.GCM");
                sb93.append(" ");
                sb93.append(str6);
                String obj17 = sb93.toString();
                if (!r40.containsKey(obj17)) {
                    r40.put(obj17, map.get(str6));
                } else {
                    StringBuilder sb94 = new StringBuilder("duplicate provider attribute key (");
                    sb94.append(obj17);
                    sb94.append(") found");
                    throw new IllegalStateException(sb94.toString());
                }
            }
            StringBuilder sb95 = new StringBuilder();
            sb95.append(str);
            sb95.append("$GCM");
            r11.A4W("Cipher.GCM", sb95.toString());
            StringBuilder sb96 = new StringBuilder();
            sb96.append("Alg.Alias.Cipher");
            sb96.append(".");
            sb96.append(r35);
            r40.A4W(sb96.toString(), "GCM");
            StringBuilder sb97 = new StringBuilder();
            sb97.append("Alg.Alias.Cipher");
            sb97.append(".OID.");
            sb97.append(r35);
            r40.A4W(sb97.toString(), "GCM");
            StringBuilder sb98 = new StringBuilder();
            sb98.append("Alg.Alias.Cipher");
            sb98.append(".");
            sb98.append(r36);
            r40.A4W(sb98.toString(), "GCM");
            StringBuilder sb99 = new StringBuilder();
            sb99.append("Alg.Alias.Cipher");
            sb99.append(".OID.");
            sb99.append(r36);
            r40.A4W(sb99.toString(), "GCM");
            StringBuilder sb100 = new StringBuilder();
            sb100.append("Alg.Alias.Cipher");
            sb100.append(".");
            sb100.append(r37);
            r40.A4W(sb100.toString(), "GCM");
            StringBuilder sb101 = new StringBuilder();
            sb101.append("Alg.Alias.Cipher");
            sb101.append(".OID.");
            sb101.append(r37);
            r40.A4W(sb101.toString(), "GCM");
            StringBuilder sb102 = new StringBuilder();
            sb102.append(str);
            sb102.append("$KeyGen");
            r11.A4W("KeyGenerator.AES", sb102.toString());
            StringBuilder sb103 = new StringBuilder();
            sb103.append(str);
            sb103.append("$KeyGen128");
            r11.A4W("KeyGenerator.2.16.840.1.101.3.4.2", sb103.toString());
            StringBuilder sb104 = new StringBuilder();
            sb104.append(str);
            sb104.append("$KeyGen192");
            r11.A4W("KeyGenerator.2.16.840.1.101.3.4.22", sb104.toString());
            StringBuilder sb105 = new StringBuilder();
            sb105.append(str);
            sb105.append("$KeyGen256");
            r11.A4W("KeyGenerator.2.16.840.1.101.3.4.42", sb105.toString());
            StringBuilder sb106 = new StringBuilder();
            sb106.append(str);
            sb106.append("$KeyGen128");
            String obj18 = sb106.toString();
            StringBuilder sb107 = new StringBuilder();
            sb107.append("KeyGenerator");
            sb107.append(".");
            sb107.append(r24);
            r40.A4W(sb107.toString(), obj18);
            StringBuilder sb108 = new StringBuilder();
            sb108.append("KeyGenerator");
            sb108.append(".OID.");
            sb108.append(r24);
            r40.A4W(sb108.toString(), obj18);
            StringBuilder sb109 = new StringBuilder();
            sb109.append(str);
            sb109.append("$KeyGen128");
            String obj19 = sb109.toString();
            StringBuilder sb110 = new StringBuilder();
            sb110.append("KeyGenerator");
            sb110.append(".");
            sb110.append(r26);
            r40.A4W(sb110.toString(), obj19);
            StringBuilder sb111 = new StringBuilder();
            sb111.append("KeyGenerator");
            sb111.append(".OID.");
            sb111.append(r26);
            r40.A4W(sb111.toString(), obj19);
            StringBuilder sb112 = new StringBuilder();
            sb112.append(str);
            sb112.append("$KeyGen128");
            String obj20 = sb112.toString();
            StringBuilder sb113 = new StringBuilder();
            sb113.append("KeyGenerator");
            sb113.append(".");
            sb113.append(r18);
            r40.A4W(sb113.toString(), obj20);
            StringBuilder sb114 = new StringBuilder();
            sb114.append("KeyGenerator");
            sb114.append(".OID.");
            sb114.append(r18);
            r40.A4W(sb114.toString(), obj20);
            StringBuilder sb115 = new StringBuilder();
            sb115.append(str);
            sb115.append("$KeyGen128");
            String obj21 = sb115.toString();
            StringBuilder sb116 = new StringBuilder();
            sb116.append("KeyGenerator");
            sb116.append(".");
            sb116.append(r19);
            r40.A4W(sb116.toString(), obj21);
            StringBuilder sb117 = new StringBuilder();
            sb117.append("KeyGenerator");
            sb117.append(".OID.");
            sb117.append(r19);
            r40.A4W(sb117.toString(), obj21);
            StringBuilder sb118 = new StringBuilder();
            sb118.append(str);
            sb118.append("$KeyGen192");
            String obj22 = sb118.toString();
            StringBuilder sb119 = new StringBuilder();
            sb119.append("KeyGenerator");
            sb119.append(".");
            sb119.append(r29);
            r40.A4W(sb119.toString(), obj22);
            StringBuilder sb120 = new StringBuilder();
            sb120.append("KeyGenerator");
            sb120.append(".OID.");
            sb120.append(r29);
            r40.A4W(sb120.toString(), obj22);
            StringBuilder sb121 = new StringBuilder();
            sb121.append(str);
            sb121.append("$KeyGen192");
            String obj23 = sb121.toString();
            StringBuilder sb122 = new StringBuilder();
            sb122.append("KeyGenerator");
            sb122.append(".");
            sb122.append(r32);
            r40.A4W(sb122.toString(), obj23);
            StringBuilder sb123 = new StringBuilder();
            sb123.append("KeyGenerator");
            sb123.append(".OID.");
            sb123.append(r32);
            r40.A4W(sb123.toString(), obj23);
            StringBuilder sb124 = new StringBuilder();
            sb124.append(str);
            sb124.append("$KeyGen192");
            String obj24 = sb124.toString();
            StringBuilder sb125 = new StringBuilder();
            sb125.append("KeyGenerator");
            sb125.append(".");
            sb125.append(r23);
            r40.A4W(sb125.toString(), obj24);
            StringBuilder sb126 = new StringBuilder();
            sb126.append("KeyGenerator");
            sb126.append(".OID.");
            sb126.append(r23);
            r40.A4W(sb126.toString(), obj24);
            StringBuilder sb127 = new StringBuilder();
            sb127.append(str);
            sb127.append("$KeyGen192");
            String obj25 = sb127.toString();
            StringBuilder sb128 = new StringBuilder();
            sb128.append("KeyGenerator");
            sb128.append(".");
            sb128.append(r17);
            r40.A4W(sb128.toString(), obj25);
            StringBuilder sb129 = new StringBuilder();
            sb129.append("KeyGenerator");
            sb129.append(".OID.");
            sb129.append(r17);
            r40.A4W(sb129.toString(), obj25);
            StringBuilder sb130 = new StringBuilder();
            sb130.append(str);
            sb130.append("$KeyGen256");
            String obj26 = sb130.toString();
            StringBuilder sb131 = new StringBuilder();
            sb131.append("KeyGenerator");
            sb131.append(".");
            sb131.append(r33);
            r40.A4W(sb131.toString(), obj26);
            StringBuilder sb132 = new StringBuilder();
            sb132.append("KeyGenerator");
            sb132.append(".OID.");
            sb132.append(r33);
            r40.A4W(sb132.toString(), obj26);
            StringBuilder sb133 = new StringBuilder();
            sb133.append(str);
            sb133.append("$KeyGen256");
            String obj27 = sb133.toString();
            StringBuilder sb134 = new StringBuilder();
            sb134.append("KeyGenerator");
            sb134.append(".");
            sb134.append(r34);
            r40.A4W(sb134.toString(), obj27);
            StringBuilder sb135 = new StringBuilder();
            sb135.append("KeyGenerator");
            sb135.append(".OID.");
            sb135.append(r34);
            r40.A4W(sb135.toString(), obj27);
            StringBuilder sb136 = new StringBuilder();
            sb136.append(str);
            sb136.append("$KeyGen256");
            String obj28 = sb136.toString();
            StringBuilder sb137 = new StringBuilder();
            sb137.append("KeyGenerator");
            sb137.append(".");
            sb137.append(r28);
            r40.A4W(sb137.toString(), obj28);
            StringBuilder sb138 = new StringBuilder();
            sb138.append("KeyGenerator");
            sb138.append(".OID.");
            sb138.append(r28);
            r40.A4W(sb138.toString(), obj28);
            StringBuilder sb139 = new StringBuilder();
            sb139.append(str);
            sb139.append("$KeyGen256");
            String obj29 = sb139.toString();
            StringBuilder sb140 = new StringBuilder();
            sb140.append("KeyGenerator");
            sb140.append(".");
            sb140.append(r25);
            r40.A4W(sb140.toString(), obj29);
            StringBuilder sb141 = new StringBuilder();
            sb141.append("KeyGenerator");
            sb141.append(".OID.");
            sb141.append(r25);
            r40.A4W(sb141.toString(), obj29);
            StringBuilder sb142 = new StringBuilder();
            sb142.append(str);
            sb142.append("$KeyGen");
            r11.A4W("KeyGenerator.AESWRAP", sb142.toString());
            StringBuilder sb143 = new StringBuilder();
            sb143.append(str);
            sb143.append("$KeyGen128");
            String obj30 = sb143.toString();
            StringBuilder sb144 = new StringBuilder();
            sb144.append("KeyGenerator");
            sb144.append(".");
            sb144.append(r21);
            r40.A4W(sb144.toString(), obj30);
            StringBuilder sb145 = new StringBuilder();
            sb145.append("KeyGenerator");
            sb145.append(".OID.");
            sb145.append(r21);
            r40.A4W(sb145.toString(), obj30);
            StringBuilder sb146 = new StringBuilder();
            sb146.append(str);
            sb146.append("$KeyGen192");
            String obj31 = sb146.toString();
            StringBuilder sb147 = new StringBuilder();
            sb147.append("KeyGenerator");
            sb147.append(".");
            sb147.append(r22);
            r40.A4W(sb147.toString(), obj31);
            StringBuilder sb148 = new StringBuilder();
            sb148.append("KeyGenerator");
            sb148.append(".OID.");
            sb148.append(r22);
            r40.A4W(sb148.toString(), obj31);
            StringBuilder sb149 = new StringBuilder();
            sb149.append(str);
            sb149.append("$KeyGen256");
            String obj32 = sb149.toString();
            StringBuilder sb150 = new StringBuilder();
            sb150.append("KeyGenerator");
            sb150.append(".");
            sb150.append(r16);
            r40.A4W(sb150.toString(), obj32);
            StringBuilder sb151 = new StringBuilder();
            sb151.append("KeyGenerator");
            sb151.append(".OID.");
            sb151.append(r16);
            r40.A4W(sb151.toString(), obj32);
            StringBuilder sb152 = new StringBuilder();
            sb152.append(str);
            sb152.append("$KeyGen128");
            String obj33 = sb152.toString();
            StringBuilder sb153 = new StringBuilder();
            sb153.append("KeyGenerator");
            sb153.append(".");
            sb153.append(r35);
            r40.A4W(sb153.toString(), obj33);
            StringBuilder sb154 = new StringBuilder();
            sb154.append("KeyGenerator");
            sb154.append(".OID.");
            sb154.append(r35);
            r40.A4W(sb154.toString(), obj33);
            StringBuilder sb155 = new StringBuilder();
            sb155.append(str);
            sb155.append("$KeyGen192");
            String obj34 = sb155.toString();
            StringBuilder sb156 = new StringBuilder();
            sb156.append("KeyGenerator");
            sb156.append(".");
            sb156.append(r36);
            r40.A4W(sb156.toString(), obj34);
            StringBuilder sb157 = new StringBuilder();
            sb157.append("KeyGenerator");
            sb157.append(".OID.");
            sb157.append(r36);
            r40.A4W(sb157.toString(), obj34);
            StringBuilder sb158 = new StringBuilder();
            sb158.append(str);
            sb158.append("$KeyGen256");
            String obj35 = sb158.toString();
            StringBuilder sb159 = new StringBuilder();
            sb159.append("KeyGenerator");
            sb159.append(".");
            sb159.append(r37);
            r40.A4W(sb159.toString(), obj35);
            StringBuilder sb160 = new StringBuilder();
            sb160.append("KeyGenerator");
            sb160.append(".OID.");
            sb160.append(r37);
            r40.A4W(sb160.toString(), obj35);
            StringBuilder sb161 = new StringBuilder();
            sb161.append(str);
            sb161.append("$KeyGen128");
            String obj36 = sb161.toString();
            StringBuilder sb162 = new StringBuilder();
            sb162.append("KeyGenerator");
            sb162.append(".");
            sb162.append(r38);
            r40.A4W(sb162.toString(), obj36);
            StringBuilder sb163 = new StringBuilder();
            sb163.append("KeyGenerator");
            sb163.append(".OID.");
            sb163.append(r38);
            r40.A4W(sb163.toString(), obj36);
            StringBuilder sb164 = new StringBuilder();
            sb164.append(str);
            sb164.append("$KeyGen192");
            String obj37 = sb164.toString();
            StringBuilder sb165 = new StringBuilder();
            sb165.append("KeyGenerator");
            sb165.append(".");
            sb165.append(r7);
            r40.A4W(sb165.toString(), obj37);
            StringBuilder sb166 = new StringBuilder();
            sb166.append("KeyGenerator");
            sb166.append(".OID.");
            sb166.append(r7);
            r40.A4W(sb166.toString(), obj37);
            StringBuilder sb167 = new StringBuilder();
            sb167.append(str);
            sb167.append("$KeyGen256");
            String obj38 = sb167.toString();
            StringBuilder sb168 = new StringBuilder();
            sb168.append("KeyGenerator");
            sb168.append(".");
            sb168.append(r6);
            r40.A4W(sb168.toString(), obj38);
            StringBuilder sb169 = new StringBuilder();
            sb169.append("KeyGenerator");
            sb169.append(".OID.");
            sb169.append(r6);
            r40.A4W(sb169.toString(), obj38);
            StringBuilder sb170 = new StringBuilder();
            sb170.append(str);
            sb170.append("$KeyGen");
            r11.A4W("KeyGenerator.AESWRAPPAD", sb170.toString());
            StringBuilder sb171 = new StringBuilder();
            sb171.append(str);
            sb171.append("$KeyGen128");
            String obj39 = sb171.toString();
            StringBuilder sb172 = new StringBuilder();
            sb172.append("KeyGenerator");
            sb172.append(".");
            sb172.append(r31);
            r40.A4W(sb172.toString(), obj39);
            StringBuilder sb173 = new StringBuilder();
            sb173.append("KeyGenerator");
            sb173.append(".OID.");
            sb173.append(r31);
            r40.A4W(sb173.toString(), obj39);
            StringBuilder sb174 = new StringBuilder();
            sb174.append(str);
            sb174.append("$KeyGen192");
            String obj40 = sb174.toString();
            StringBuilder sb175 = new StringBuilder();
            sb175.append("KeyGenerator");
            sb175.append(".");
            sb175.append(r30);
            r40.A4W(sb175.toString(), obj40);
            StringBuilder sb176 = new StringBuilder();
            sb176.append("KeyGenerator");
            sb176.append(".OID.");
            sb176.append(r30);
            r40.A4W(sb176.toString(), obj40);
            StringBuilder sb177 = new StringBuilder();
            sb177.append(str);
            sb177.append("$KeyGen256");
            String obj41 = sb177.toString();
            StringBuilder sb178 = new StringBuilder();
            sb178.append("KeyGenerator");
            sb178.append(".");
            sb178.append(r27);
            r40.A4W(sb178.toString(), obj41);
            StringBuilder sb179 = new StringBuilder();
            sb179.append("KeyGenerator");
            sb179.append(".OID.");
            sb179.append(r27);
            r40.A4W(sb179.toString(), obj41);
            StringBuilder sb180 = new StringBuilder();
            sb180.append(str);
            sb180.append("$AESCMAC");
            r11.A4W("Mac.AESCMAC", sb180.toString());
            StringBuilder sb181 = new StringBuilder();
            sb181.append(str);
            sb181.append("$AESCCMMAC");
            r11.A4W("Mac.AESCCMMAC", sb181.toString());
            StringBuilder sb182 = new StringBuilder();
            sb182.append("Alg.Alias.Mac.");
            sb182.append(r38.A01);
            r11.A4W(sb182.toString(), "AESCCMMAC");
            StringBuilder sb183 = new StringBuilder();
            sb183.append("Alg.Alias.Mac.");
            sb183.append(r7.A01);
            r11.A4W(sb183.toString(), "AESCCMMAC");
            StringBuilder sb184 = new StringBuilder();
            sb184.append("Alg.Alias.Mac.");
            sb184.append(r6.A01);
            r11.A4W(sb184.toString(), "AESCCMMAC");
            C32041fY r252 = C33131i5.A06;
            StringBuilder sb185 = new StringBuilder();
            sb185.append("Alg.Alias.Cipher");
            sb185.append(".");
            sb185.append(r252);
            r40.A4W(sb185.toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
            StringBuilder sb186 = new StringBuilder();
            sb186.append("Alg.Alias.Cipher");
            sb186.append(".OID.");
            sb186.append(r252);
            r40.A4W(sb186.toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
            C32041fY r242 = C33131i5.A07;
            StringBuilder sb187 = new StringBuilder();
            sb187.append("Alg.Alias.Cipher");
            sb187.append(".");
            sb187.append(r242);
            r40.A4W(sb187.toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
            StringBuilder sb188 = new StringBuilder();
            sb188.append("Alg.Alias.Cipher");
            sb188.append(".OID.");
            sb188.append(r242);
            r40.A4W(sb188.toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
            C32041fY r232 = C33131i5.A08;
            StringBuilder sb189 = new StringBuilder();
            sb189.append("Alg.Alias.Cipher");
            sb189.append(".");
            sb189.append(r232);
            r40.A4W(sb189.toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
            StringBuilder sb190 = new StringBuilder();
            sb190.append("Alg.Alias.Cipher");
            sb190.append(".OID.");
            sb190.append(r232);
            r40.A4W(sb190.toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
            C32041fY r222 = C33131i5.A0D;
            StringBuilder sb191 = new StringBuilder();
            sb191.append("Alg.Alias.Cipher");
            sb191.append(".");
            sb191.append(r222);
            r40.A4W(sb191.toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
            StringBuilder sb192 = new StringBuilder();
            sb192.append("Alg.Alias.Cipher");
            sb192.append(".OID.");
            sb192.append(r222);
            r40.A4W(sb192.toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
            C32041fY r212 = C33131i5.A0E;
            StringBuilder sb193 = new StringBuilder();
            sb193.append("Alg.Alias.Cipher");
            sb193.append(".");
            sb193.append(r212);
            r40.A4W(sb193.toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
            StringBuilder sb194 = new StringBuilder();
            sb194.append("Alg.Alias.Cipher");
            sb194.append(".OID.");
            sb194.append(r212);
            r40.A4W(sb194.toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
            C32041fY r20 = C33131i5.A0F;
            StringBuilder sb195 = new StringBuilder();
            sb195.append("Alg.Alias.Cipher");
            sb195.append(".");
            sb195.append(r20);
            r40.A4W(sb195.toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb196 = new StringBuilder();
            sb196.append("Alg.Alias.Cipher");
            sb196.append(".OID.");
            sb196.append(r20);
            r40.A4W(sb196.toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb197 = new StringBuilder();
            sb197.append(str);
            sb197.append("$PBEWithSHA1AESCBC128");
            r11.A4W("Cipher.PBEWITHSHAAND128BITAES-CBC-BC", sb197.toString());
            StringBuilder sb198 = new StringBuilder();
            sb198.append(str);
            sb198.append("$PBEWithSHA1AESCBC192");
            r11.A4W("Cipher.PBEWITHSHAAND192BITAES-CBC-BC", sb198.toString());
            StringBuilder sb199 = new StringBuilder();
            sb199.append(str);
            sb199.append("$PBEWithSHA1AESCBC256");
            r11.A4W("Cipher.PBEWITHSHAAND256BITAES-CBC-BC", sb199.toString());
            StringBuilder sb200 = new StringBuilder();
            sb200.append(str);
            sb200.append("$PBEWithSHA256AESCBC128");
            r11.A4W("Cipher.PBEWITHSHA256AND128BITAES-CBC-BC", sb200.toString());
            StringBuilder sb201 = new StringBuilder();
            sb201.append(str);
            sb201.append("$PBEWithSHA256AESCBC192");
            r11.A4W("Cipher.PBEWITHSHA256AND192BITAES-CBC-BC", sb201.toString());
            StringBuilder sb202 = new StringBuilder();
            sb202.append(str);
            sb202.append("$PBEWithSHA256AESCBC256");
            r11.A4W("Cipher.PBEWITHSHA256AND256BITAES-CBC-BC", sb202.toString());
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHAAND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHAAND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHAAND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-1AND128BITAES-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-1AND192BITAES-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-1AND256BITAES-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.Cipher.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb203 = new StringBuilder();
            sb203.append(str);
            sb203.append("$PBEWithAESCBC");
            r11.A4W("Cipher.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb203.toString());
            StringBuilder sb204 = new StringBuilder();
            sb204.append(str);
            sb204.append("$PBEWithAESCBC");
            r11.A4W("Cipher.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb204.toString());
            StringBuilder sb205 = new StringBuilder();
            sb205.append(str);
            sb205.append("$PBEWithAESCBC");
            r11.A4W("Cipher.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb205.toString());
            StringBuilder sb206 = new StringBuilder();
            sb206.append(str);
            sb206.append("$KeyFactory");
            r11.A4W("SecretKeyFactory.AES", sb206.toString());
            C32041fY r182 = C32351gB.A00;
            StringBuilder sb207 = new StringBuilder();
            sb207.append(str);
            sb207.append("$KeyFactory");
            String obj42 = sb207.toString();
            StringBuilder sb208 = new StringBuilder();
            sb208.append("SecretKeyFactory");
            sb208.append(".");
            sb208.append(r182);
            r40.A4W(sb208.toString(), obj42);
            StringBuilder sb209 = new StringBuilder();
            sb209.append("SecretKeyFactory");
            sb209.append(".OID.");
            sb209.append(r182);
            r40.A4W(sb209.toString(), obj42);
            StringBuilder sb210 = new StringBuilder();
            sb210.append(str);
            sb210.append("$PBEWithMD5And128BitAESCBCOpenSSL");
            r11.A4W("SecretKeyFactory.PBEWITHMD5AND128BITAES-CBC-OPENSSL", sb210.toString());
            StringBuilder sb211 = new StringBuilder();
            sb211.append(str);
            sb211.append("$PBEWithMD5And192BitAESCBCOpenSSL");
            r11.A4W("SecretKeyFactory.PBEWITHMD5AND192BITAES-CBC-OPENSSL", sb211.toString());
            StringBuilder sb212 = new StringBuilder();
            sb212.append(str);
            sb212.append("$PBEWithMD5And256BitAESCBCOpenSSL");
            r11.A4W("SecretKeyFactory.PBEWITHMD5AND256BITAES-CBC-OPENSSL", sb212.toString());
            StringBuilder sb213 = new StringBuilder();
            sb213.append(str);
            sb213.append("$PBEWithSHAAnd128BitAESBC");
            r11.A4W("SecretKeyFactory.PBEWITHSHAAND128BITAES-CBC-BC", sb213.toString());
            StringBuilder sb214 = new StringBuilder();
            sb214.append(str);
            sb214.append("$PBEWithSHAAnd192BitAESBC");
            r11.A4W("SecretKeyFactory.PBEWITHSHAAND192BITAES-CBC-BC", sb214.toString());
            StringBuilder sb215 = new StringBuilder();
            sb215.append(str);
            sb215.append("$PBEWithSHAAnd256BitAESBC");
            r11.A4W("SecretKeyFactory.PBEWITHSHAAND256BITAES-CBC-BC", sb215.toString());
            StringBuilder sb216 = new StringBuilder();
            sb216.append(str);
            sb216.append("$PBEWithSHA256And128BitAESBC");
            r11.A4W("SecretKeyFactory.PBEWITHSHA256AND128BITAES-CBC-BC", sb216.toString());
            StringBuilder sb217 = new StringBuilder();
            sb217.append(str);
            sb217.append("$PBEWithSHA256And192BitAESBC");
            r11.A4W("SecretKeyFactory.PBEWITHSHA256AND192BITAES-CBC-BC", sb217.toString());
            StringBuilder sb218 = new StringBuilder();
            sb218.append(str);
            sb218.append("$PBEWithSHA256And256BitAESBC");
            r11.A4W("SecretKeyFactory.PBEWITHSHA256AND256BITAES-CBC-BC", sb218.toString());
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND128BITAES-CBC-BC", "PBEWITHSHAAND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND192BITAES-CBC-BC", "PBEWITHSHAAND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-1AND256BITAES-CBC-BC", "PBEWITHSHAAND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-CBC-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-CBC-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-CBC-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND128BITAES-BC", "PBEWITHSHA256AND128BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND192BITAES-BC", "PBEWITHSHA256AND192BITAES-CBC-BC");
            r11.A4W("Alg.Alias.SecretKeyFactory.PBEWITHSHA-256AND256BITAES-BC", "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb219 = new StringBuilder();
            sb219.append("Alg.Alias.SecretKeyFactory");
            sb219.append(".");
            sb219.append(r252);
            r40.A4W(sb219.toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
            StringBuilder sb220 = new StringBuilder();
            sb220.append("Alg.Alias.SecretKeyFactory");
            sb220.append(".OID.");
            sb220.append(r252);
            r40.A4W(sb220.toString(), "PBEWITHSHAAND128BITAES-CBC-BC");
            StringBuilder sb221 = new StringBuilder();
            sb221.append("Alg.Alias.SecretKeyFactory");
            sb221.append(".");
            sb221.append(r242);
            r40.A4W(sb221.toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
            StringBuilder sb222 = new StringBuilder();
            sb222.append("Alg.Alias.SecretKeyFactory");
            sb222.append(".OID.");
            sb222.append(r242);
            r40.A4W(sb222.toString(), "PBEWITHSHAAND192BITAES-CBC-BC");
            StringBuilder sb223 = new StringBuilder();
            sb223.append("Alg.Alias.SecretKeyFactory");
            sb223.append(".");
            sb223.append(r232);
            r40.A4W(sb223.toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
            StringBuilder sb224 = new StringBuilder();
            sb224.append("Alg.Alias.SecretKeyFactory");
            sb224.append(".OID.");
            sb224.append(r232);
            r40.A4W(sb224.toString(), "PBEWITHSHAAND256BITAES-CBC-BC");
            StringBuilder sb225 = new StringBuilder();
            sb225.append("Alg.Alias.SecretKeyFactory");
            sb225.append(".");
            sb225.append(r222);
            r40.A4W(sb225.toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
            StringBuilder sb226 = new StringBuilder();
            sb226.append("Alg.Alias.SecretKeyFactory");
            sb226.append(".OID.");
            sb226.append(r222);
            r40.A4W(sb226.toString(), "PBEWITHSHA256AND128BITAES-CBC-BC");
            StringBuilder sb227 = new StringBuilder();
            sb227.append("Alg.Alias.SecretKeyFactory");
            sb227.append(".");
            sb227.append(r212);
            r40.A4W(sb227.toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
            StringBuilder sb228 = new StringBuilder();
            sb228.append("Alg.Alias.SecretKeyFactory");
            sb228.append(".OID.");
            sb228.append(r212);
            r40.A4W(sb228.toString(), "PBEWITHSHA256AND192BITAES-CBC-BC");
            StringBuilder sb229 = new StringBuilder();
            sb229.append("Alg.Alias.SecretKeyFactory");
            sb229.append(".");
            sb229.append(r20);
            r40.A4W(sb229.toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
            StringBuilder sb230 = new StringBuilder();
            sb230.append("Alg.Alias.SecretKeyFactory");
            sb230.append(".OID.");
            sb230.append(r20);
            r40.A4W(sb230.toString(), "PBEWITHSHA256AND256BITAES-CBC-BC");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND128BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND192BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHAAND256BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA256AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA-1AND256BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND128BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND192BITAES-CBC-BC", "PKCS12PBE");
            r11.A4W("Alg.Alias.AlgorithmParameters.PBEWITHSHA-256AND256BITAES-CBC-BC", "PKCS12PBE");
            StringBuilder sb231 = new StringBuilder();
            sb231.append("Alg.Alias.AlgorithmParameters.");
            sb231.append(r252.A01);
            r11.A4W(sb231.toString(), "PKCS12PBE");
            StringBuilder sb232 = new StringBuilder();
            sb232.append("Alg.Alias.AlgorithmParameters.");
            sb232.append(r242.A01);
            r11.A4W(sb232.toString(), "PKCS12PBE");
            StringBuilder sb233 = new StringBuilder();
            sb233.append("Alg.Alias.AlgorithmParameters.");
            sb233.append(r232.A01);
            r11.A4W(sb233.toString(), "PKCS12PBE");
            StringBuilder sb234 = new StringBuilder();
            sb234.append("Alg.Alias.AlgorithmParameters.");
            sb234.append(r222.A01);
            r11.A4W(sb234.toString(), "PKCS12PBE");
            StringBuilder sb235 = new StringBuilder();
            sb235.append("Alg.Alias.AlgorithmParameters.");
            sb235.append(r212.A01);
            r11.A4W(sb235.toString(), "PKCS12PBE");
            StringBuilder sb236 = new StringBuilder();
            sb236.append("Alg.Alias.AlgorithmParameters.");
            sb236.append(r20.A01);
            r11.A4W(sb236.toString(), "PKCS12PBE");
            StringBuilder sb237 = new StringBuilder();
            sb237.append(str);
            sb237.append("$AESGMAC");
            String obj43 = sb237.toString();
            StringBuilder sb238 = new StringBuilder();
            sb238.append(str);
            sb238.append("$KeyGen128");
            String obj44 = sb238.toString();
            StringBuilder sb239 = new StringBuilder("Mac.");
            sb239.append("AES");
            sb239.append("-GMAC");
            r11.A4W(sb239.toString(), obj43);
            StringBuilder sb240 = new StringBuilder("Alg.Alias.Mac.");
            sb240.append("AES");
            sb240.append("GMAC");
            String obj45 = sb240.toString();
            StringBuilder sb241 = new StringBuilder();
            sb241.append("AES");
            sb241.append("-GMAC");
            r11.A4W(obj45, sb241.toString());
            StringBuilder sb242 = new StringBuilder("KeyGenerator.");
            sb242.append("AES");
            sb242.append("-GMAC");
            r11.A4W(sb242.toString(), obj44);
            StringBuilder sb243 = new StringBuilder("Alg.Alias.KeyGenerator.");
            sb243.append("AES");
            sb243.append("GMAC");
            String obj46 = sb243.toString();
            StringBuilder sb244 = new StringBuilder();
            sb244.append("AES");
            sb244.append("-GMAC");
            r11.A4W(obj46, sb244.toString());
            StringBuilder sb245 = new StringBuilder();
            sb245.append(str);
            sb245.append("$Poly1305");
            String obj47 = sb245.toString();
            StringBuilder sb246 = new StringBuilder();
            sb246.append(str);
            sb246.append("$Poly1305KeyGen");
            String obj48 = sb246.toString();
            StringBuilder sb247 = new StringBuilder("Mac.POLY1305-");
            sb247.append("AES");
            r11.A4W(sb247.toString(), obj47);
            StringBuilder sb248 = new StringBuilder("Alg.Alias.Mac.POLY1305");
            sb248.append("AES");
            String obj49 = sb248.toString();
            StringBuilder sb249 = new StringBuilder("POLY1305-");
            sb249.append("AES");
            r11.A4W(obj49, sb249.toString());
            StringBuilder sb250 = new StringBuilder("KeyGenerator.POLY1305-");
            sb250.append("AES");
            r11.A4W(sb250.toString(), obj48);
            StringBuilder sb251 = new StringBuilder("Alg.Alias.KeyGenerator.POLY1305");
            sb251.append("AES");
            String obj50 = sb251.toString();
            StringBuilder sb252 = new StringBuilder();
            sb252.append("POLY1305-");
            sb252.append("AES");
            r11.A4W(obj50, sb252.toString());
        }
    }

    public class AESCCMMAC extends C106015Ce {

        public class CCMMac implements C46912Gt {
            public int A00 = 8;
            public final C1054959v A01 = new C1054959v(new C1053159a());

            public int A8A(byte[] bArr, int i2) {
                try {
                    return this.A01.A8A(bArr, 0);
                } catch (AnonymousClass5JC e2) {
                    throw AnonymousClass000.A0V(AnonymousClass000.A0h(e2.toString(), AnonymousClass000.A0r("exception on doFinal(): ")));
                }
            }

            public int ADH() {
                return this.A00;
            }

            public void AHz(C46932Gv r3) {
                C1054959v r1 = this.A01;
                r1.AI1(r3, true);
                this.A00 = r1.ADG().length;
            }

            public void AhH(byte b2) {
                this.A01.A04.write(b2);
            }

            public void reset() {
                C1054959v r1 = this.A01;
                r1.A02.reset();
                r1.A04.reset();
                r1.A05.reset();
            }

            public void update(byte[] bArr, int i2, int i3) {
                this.A01.Aap(bArr, i2, i3);
            }
        }

        public AESCCMMAC() {
            super(new CCMMac());
        }
    }

    public class AESCMAC extends C106015Ce {
        public AESCMAC() {
            super(new C1054459q(new C1053159a()));
        }
    }

    public class AESGMAC extends C106015Ce {
        public AESGMAC() {
            super(new AnonymousClass59n(new C1055259y(new C1053159a())));
        }
    }

    public class AlgParamGen extends AnonymousClass5BF {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[16];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = C90614eS.A00();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("AES", ((AnonymousClass5AA) this.A01).A00);
                instance.init(new IvParameterSpec(bArr));
                return instance;
            } catch (Exception e2) {
                throw AnonymousClass000.A0a(e2.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw AnonymousClass3K4.A0d("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenCCM extends AnonymousClass5BF {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("CCM", ((AnonymousClass5AA) this.A01).A00);
                instance.init(new AnonymousClass5I7(bArr, 12).A01());
                return instance;
            } catch (Exception e2) {
                throw AnonymousClass000.A0a(e2.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw AnonymousClass3K4.A0d("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParamGenGCM extends AnonymousClass5BF {
        public AlgorithmParameters engineGenerateParameters() {
            byte[] bArr = new byte[12];
            SecureRandom secureRandom = this.A00;
            if (secureRandom == null) {
                secureRandom = new SecureRandom();
                this.A00 = secureRandom;
            }
            secureRandom.nextBytes(bArr);
            try {
                AlgorithmParameters instance = AlgorithmParameters.getInstance("GCM", ((AnonymousClass5AA) this.A01).A00);
                instance.init(new AnonymousClass5I8(bArr, 16).A01());
                return instance;
            } catch (Exception e2) {
                throw AnonymousClass000.A0a(e2.getMessage());
            }
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
            throw AnonymousClass3K4.A0d("No supported AlgorithmParameterSpec for AES parameter generation.");
        }
    }

    public class AlgParams extends AnonymousClass5BG {
        public byte[] A00;

        public byte[] engineGetEncoded() {
            return engineGetEncoded("ASN.1");
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass5BG.A00(str)) {
                return new AnonymousClass5IT(engineGetEncoded("RAW")).A01();
            }
            if (str.equals("RAW")) {
                return C33111hx.A02(this.A00);
            }
            return null;
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                this.A00 = ((IvParameterSpec) algorithmParameterSpec).getIV();
                return;
            }
            throw new InvalidParameterSpecException("IvParameterSpec required to initialise a IV parameters algorithm parameters object");
        }

        public void engineInit(byte[] bArr) {
            int length = bArr.length;
            if (length % 8 != 0 && bArr[0] == 4 && bArr[1] == length - 2) {
                bArr = ((C107405Ib) C32051fZ.A02(bArr)).A00;
            }
            this.A00 = C33111hx.A02(bArr);
        }

        public void engineInit(byte[] bArr, String str) {
            if (AnonymousClass5BG.A00(str)) {
                try {
                    engineInit(((C107405Ib) C32051fZ.A02(bArr)).A00);
                } catch (Exception e2) {
                    throw AnonymousClass3K3.A0e(AnonymousClass000.A0g("Exception decoding: ", e2));
                }
            } else if (str.equals("RAW")) {
                engineInit(bArr);
            } else {
                throw AnonymousClass3K3.A0e("Unknown parameters format in IV parameters object");
            }
        }

        public String engineToString() {
            return "AES IV";
        }
    }

    public class AlgParamsCCM extends AnonymousClass5BG {
        public AnonymousClass5I7 A00;

        public byte[] engineGetEncoded() {
            return this.A00.A01();
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass5BG.A00(str)) {
                return this.A00.A01();
            }
            throw AnonymousClass3K3.A0e("unknown format specified");
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            AnonymousClass5I7 r2;
            Class cls = C89784cu.A00;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    AnonymousClass5I8 r0 = (AnonymousClass5I8) AccessController.doPrivileged(new C1046856m(algorithmParameterSpec));
                    r2 = r0 != null ? new AnonymousClass5I7(C32411gJ.A00(r0)) : null;
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof C106035Cg) {
                C106035Cg r4 = (C106035Cg) algorithmParameterSpec;
                r2 = new AnonymousClass5I7(r4.getIV(), r4.A00 >> 3);
            } else {
                throw new InvalidParameterSpecException(AnonymousClass000.A0h(AnonymousClass000.A0d(algorithmParameterSpec), AnonymousClass000.A0r("AlgorithmParameterSpec class not recognized: ")));
            }
            this.A00 = r2;
        }

        public void engineInit(byte[] bArr) {
            this.A00 = bArr instanceof AnonymousClass5I7 ? (AnonymousClass5I7) bArr : bArr != null ? new AnonymousClass5I7(C32411gJ.A00(bArr)) : null;
        }

        public void engineInit(byte[] bArr, String str) {
            if (AnonymousClass5BG.A00(str)) {
                this.A00 = bArr instanceof AnonymousClass5I7 ? (AnonymousClass5I7) bArr : bArr != null ? new AnonymousClass5I7(C32411gJ.A00(bArr)) : null;
                return;
            }
            throw AnonymousClass3K3.A0e("unknown format specified");
        }

        public String engineToString() {
            return "CCM";
        }
    }

    public class AlgParamsGCM extends AnonymousClass5BG {
        public AnonymousClass5I8 A00;

        public byte[] engineGetEncoded() {
            return this.A00.A01();
        }

        public byte[] engineGetEncoded(String str) {
            if (AnonymousClass5BG.A00(str)) {
                return this.A00.A01();
            }
            throw AnonymousClass3K3.A0e("unknown format specified");
        }

        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) {
            AnonymousClass5I8 r2;
            Class cls = C89784cu.A00;
            if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                try {
                    r2 = (AnonymousClass5I8) AccessController.doPrivileged(new C1046856m(algorithmParameterSpec));
                } catch (Exception unused) {
                    throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
                }
            } else if (algorithmParameterSpec instanceof C106035Cg) {
                C106035Cg r4 = (C106035Cg) algorithmParameterSpec;
                r2 = new AnonymousClass5I8(r4.getIV(), r4.A00 >> 3);
            } else {
                throw new InvalidParameterSpecException(AnonymousClass000.A0h(AnonymousClass000.A0d(algorithmParameterSpec), AnonymousClass000.A0r("AlgorithmParameterSpec class not recognized: ")));
            }
            this.A00 = r2;
        }

        public void engineInit(byte[] bArr) {
            this.A00 = bArr instanceof AnonymousClass5I8 ? (AnonymousClass5I8) bArr : bArr != null ? new AnonymousClass5I8(C32411gJ.A00(bArr)) : null;
        }

        public void engineInit(byte[] bArr, String str) {
            if (AnonymousClass5BG.A00(str)) {
                this.A00 = bArr instanceof AnonymousClass5I8 ? (AnonymousClass5I8) bArr : bArr != null ? new AnonymousClass5I8(C32411gJ.A00(bArr)) : null;
                return;
            }
            throw AnonymousClass3K3.A0e("unknown format specified");
        }

        public String engineToString() {
            return "GCM";
        }
    }

    public class CBC extends AnonymousClass5Kd {
        public CBC() {
            super((AnonymousClass5T1) C105995Cc.A00(), 128);
        }
    }

    public class CCM extends AnonymousClass5Kd {
        public CCM() {
            super(new C1054959v(new C1053159a()), 12, false);
        }
    }

    public class CFB extends AnonymousClass5Kd {
        public CFB() {
            super(new C89424c9(new AnonymousClass5JL(new C1053159a(), 128)), 128);
        }
    }

    public class ECB extends AnonymousClass5Kd {
        public ECB() {
            super(new Object() {
            });
        }
    }

    public class GCM extends AnonymousClass5Kd {
        public GCM() {
            super((AnonymousClass5VP) new C1055259y(new C1053159a()));
        }
    }

    public class KeyFactory extends C106025Cf {
        public KeyFactory() {
            super("AES", (C32041fY) null);
        }
    }

    public class KeyGen extends C106005Cd {
        public KeyGen() {
            this(192);
        }

        public KeyGen(int i2) {
            super("AES", new AnonymousClass4U8(), i2);
        }
    }

    public class KeyGen128 extends KeyGen {
        public KeyGen128() {
            super(128);
        }
    }

    public class KeyGen192 extends KeyGen {
        public KeyGen192() {
            super(192);
        }
    }

    public class KeyGen256 extends KeyGen {
        public KeyGen256() {
            super(256);
        }
    }

    public class OFB extends AnonymousClass5Kd {
        public OFB() {
            super(new C89424c9(new AnonymousClass5JK(new C1053159a(), 128)), 128);
        }
    }

    public class PBEWithAESCBC extends AnonymousClass5Kd {
        public PBEWithAESCBC() {
            super((AnonymousClass5T1) C105995Cc.A00());
        }
    }

    public class PBEWithMD5And128BitAESCBCOpenSSL extends AnonymousClass5Kp {
        public PBEWithMD5And128BitAESCBCOpenSSL() {
            super("PBEWithMD5And128BitAES-CBC-OpenSSL", (C32041fY) null, 3, 0, 128, 128, true);
        }
    }

    public class PBEWithMD5And192BitAESCBCOpenSSL extends AnonymousClass5Kp {
        public PBEWithMD5And192BitAESCBCOpenSSL() {
            super("PBEWithMD5And192BitAES-CBC-OpenSSL", (C32041fY) null, 3, 0, 192, 128, true);
        }
    }

    public class PBEWithMD5And256BitAESCBCOpenSSL extends AnonymousClass5Kp {
        public PBEWithMD5And256BitAESCBCOpenSSL() {
            super("PBEWithMD5And256BitAES-CBC-OpenSSL", (C32041fY) null, 3, 0, 256, 128, true);
        }
    }

    public class PBEWithSHA1AESCBC128 extends AnonymousClass5Kd {
        public PBEWithSHA1AESCBC128() {
            super(C105995Cc.A00(), 2, 1, 128, 16);
        }
    }

    public class PBEWithSHA1AESCBC192 extends AnonymousClass5Kd {
        public PBEWithSHA1AESCBC192() {
            super(C105995Cc.A00(), 2, 1, 192, 16);
        }
    }

    public class PBEWithSHA1AESCBC256 extends AnonymousClass5Kd {
        public PBEWithSHA1AESCBC256() {
            super(C105995Cc.A00(), 2, 1, 256, 16);
        }
    }

    public class PBEWithSHA256AESCBC128 extends AnonymousClass5Kd {
        public PBEWithSHA256AESCBC128() {
            super(C105995Cc.A00(), 2, 4, 128, 16);
        }
    }

    public class PBEWithSHA256AESCBC192 extends AnonymousClass5Kd {
        public PBEWithSHA256AESCBC192() {
            super(C105995Cc.A00(), 2, 4, 192, 16);
        }
    }

    public class PBEWithSHA256AESCBC256 extends AnonymousClass5Kd {
        public PBEWithSHA256AESCBC256() {
            super(C105995Cc.A00(), 2, 4, 256, 16);
        }
    }

    public class PBEWithSHA256And128BitAESBC extends AnonymousClass5Kp {
        public PBEWithSHA256And128BitAESBC() {
            super("PBEWithSHA256And128BitAES-CBC-BC", (C32041fY) null, 2, 4, 128, 128, true);
        }
    }

    public class PBEWithSHA256And192BitAESBC extends AnonymousClass5Kp {
        public PBEWithSHA256And192BitAESBC() {
            super("PBEWithSHA256And192BitAES-CBC-BC", (C32041fY) null, 2, 4, 192, 128, true);
        }
    }

    public class PBEWithSHA256And256BitAESBC extends AnonymousClass5Kp {
        public PBEWithSHA256And256BitAESBC() {
            super("PBEWithSHA256And256BitAES-CBC-BC", (C32041fY) null, 2, 4, 256, 128, true);
        }
    }

    public class PBEWithSHAAnd128BitAESBC extends AnonymousClass5Kp {
        public PBEWithSHAAnd128BitAESBC() {
            super("PBEWithSHA1And128BitAES-CBC-BC", (C32041fY) null, 2, 1, 128, 128, true);
        }
    }

    public class PBEWithSHAAnd192BitAESBC extends AnonymousClass5Kp {
        public PBEWithSHAAnd192BitAESBC() {
            super("PBEWithSHA1And192BitAES-CBC-BC", (C32041fY) null, 2, 1, 192, 128, true);
        }
    }

    public class PBEWithSHAAnd256BitAESBC extends AnonymousClass5Kp {
        public PBEWithSHAAnd256BitAESBC() {
            super("PBEWithSHA1And256BitAES-CBC-BC", (C32041fY) null, 2, 1, 256, 128, true);
        }
    }

    public class Poly1305 extends C106015Ce {
        public Poly1305() {
            super(new C46902Gs(new C1053159a()));
        }
    }

    public class Poly1305KeyGen extends C106005Cd {
        public Poly1305KeyGen() {
            super("Poly1305-AES", new AnonymousClass5JB(), 256);
        }
    }

    public class RFC3211Wrap extends C105995Cc {
        public RFC3211Wrap() {
            super(new C1054759t(new C1053159a()), 16);
        }
    }

    public class RFC5649Wrap extends C105995Cc {
        public RFC5649Wrap() {
            super(new C1054859u(new C1053159a()), 0);
        }
    }

    public class Wrap extends C105995Cc {
        public Wrap() {
            super(new C1054659s(), 0);
        }
    }

    public class WrapPad extends C105995Cc {
        public WrapPad() {
            super(new AnonymousClass5JX(), 0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        A00 = hashMap;
        hashMap.put("SupportedKeyClasses", "javax.crypto.SecretKey");
        hashMap.put("SupportedKeyFormats", "RAW");
    }
}
