package X;

import com.obwhatsapp.R;

/* renamed from: X.47M  reason: invalid class name */
public class AnonymousClass47M {
    public static int A00(String str) {
        int i2;
        boolean z2;
        if (str != null) {
            String lowerCase = str.toLowerCase();
            switch (lowerCase.hashCode()) {
                case -2139208497:
                    z2 = lowerCase.equals("misleading");
                    i2 = R.string.str13be;
                    break;
                case -1771213723:
                    z2 = lowerCase.equals("gambling");
                    i2 = R.string.str13bb;
                    break;
                case -1560609346:
                    z2 = lowerCase.equals("digital_services_products");
                    i2 = R.string.str13ba;
                    break;
                case -1338910485:
                    z2 = lowerCase.equals("dating");
                    i2 = R.string.str13b8;
                    break;
                case -1152426539:
                    z2 = lowerCase.equals("tobacco");
                    i2 = R.string.str13c3;
                    break;
                case -919668978:
                    z2 = lowerCase.equals("alcohol");
                    i2 = R.string.str13b5;
                    break;
                case -856935945:
                    z2 = lowerCase.equals("animals");
                    i2 = R.string.str13b6;
                    break;
                case -850113115:
                    z2 = lowerCase.equals("body_parts_fluids");
                    i2 = R.string.str13b7;
                    break;
                case -596951334:
                    z2 = lowerCase.equals("supplements");
                    i2 = R.string.str13c1;
                    break;
                case -371061680:
                    z2 = lowerCase.equals("illegal_products_services");
                    i2 = R.string.str13bd;
                    break;
                case 3536713:
                    z2 = lowerCase.equals("spam");
                    i2 = R.string.str13c0;
                    break;
                case 92676538:
                    z2 = lowerCase.equals("adult");
                    i2 = R.string.str13b4;
                    break;
                case 306174265:
                    z2 = lowerCase.equals("violation_drugs");
                    i2 = R.string.str13c5;
                    break;
                case 329032921:
                    z2 = lowerCase.equals("unauthorized_media");
                    i2 = R.string.str13c4;
                    break;
                case 908259181:
                    z2 = lowerCase.equals("healthcare");
                    i2 = R.string.str13bc;
                    break;
                case 1155840218:
                    z2 = lowerCase.equals("real_fake_currency");
                    i2 = R.string.str13bf;
                    break;
                case 1223328215:
                    z2 = lowerCase.equals("weapons");
                    i2 = R.string.str13c7;
                    break;
                case 1659800405:
                    z2 = lowerCase.equals("violent_content");
                    i2 = R.string.str13c6;
                    break;
                case 1945443043:
                    z2 = lowerCase.equals("third_party_infringement");
                    i2 = R.string.str13c2;
                    break;
            }
            return !z2 ? R.string.str13b9 : i2;
        }
    }
}
