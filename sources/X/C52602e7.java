package X;

import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;

/* renamed from: X.2e7  reason: invalid class name and case insensitive filesystem */
public final class C52602e7 {
    public static int A00(String str) {
        C52592e6 r1;
        C52592e6[] values = C52592e6.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                r1 = C52592e6.OTHERS;
                break;
            }
            r1 = values[i2];
            if (r1.id.equals(str)) {
                break;
            }
            i2++;
        }
        switch (r1.ordinal()) {
            case 0:
                return R.color.color0110;
            case 1:
                return R.color.color0133;
            case 2:
                return R.color.color0112;
            case 3:
                return R.color.color0131;
            case 4:
                return R.color.color011f;
            case 5:
                return R.color.color012e;
            case 6:
                return R.color.color011e;
            case 7:
                return R.color.color0116;
            case 8:
                return R.color.color0134;
            case 9:
                return R.color.color0128;
            case 10:
                return R.color.color010e;
            case 11:
                return R.color.color010f;
            case 12:
                return R.color.color0111;
            case 13:
                return R.color.color0113;
            case 14:
                return R.color.color0114;
            case 15:
                return R.color.color0115;
            case 16:
                return R.color.color011d;
            case 17:
                return R.color.color0121;
            case 18:
                return R.color.color0124;
            case 19:
                return R.color.color0125;
            case 20:
                return R.color.color0129;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return R.color.color012a;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return R.color.color012b;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return R.color.color012c;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return R.color.color012d;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return R.color.color012f;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return R.color.color0130;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return R.color.color0132;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return R.color.color0135;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return R.color.color0136;
            default:
                return R.color.color011c;
        }
    }

    public static int A01(String str) {
        C52592e6 r1;
        C52592e6[] values = C52592e6.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                r1 = C52592e6.OTHERS;
                break;
            }
            r1 = values[i2];
            if (r1.id.equals(str)) {
                break;
            }
            i2++;
        }
        switch (r1.ordinal()) {
            case 0:
                return R.drawable.ic_business_cat_apparel_and_clothing;
            case 1:
                return R.drawable.ic_business_cat_shopping_and_retail;
            case 2:
                return R.drawable.ic_business_cat_automotive_service;
            case 3:
                return R.drawable.ic_business_cat_restaurant;
            case 4:
                return R.drawable.ic_business_cat_grocery_store;
            case 5:
                return R.drawable.ic_business_cat_pizza_place;
            case 6:
                return R.drawable.ic_business_cat_food_and_beverage;
            case 7:
                return R.drawable.ic_business_cat_education;
            case 8:
                return R.drawable.ic_business_cat_sports_and_fitness;
            case 9:
                return R.drawable.ic_business_cat_local_services;
            case 10:
                return R.drawable.ic_business_cat_advertising_and_marketing;
            case 11:
                return R.drawable.ic_business_cat_agriculture;
            case 12:
                return R.drawable.ic_business_cat_arts_and_entertainment;
            case 13:
                return R.drawable.ic_business_cat_beauty_cosmetic_and_personal_care;
            case 14:
                return R.drawable.ic_business_cat_commercial_and_industrial;
            case 15:
                return R.drawable.ic_business_cat_communities_and_organizations;
            case 16:
                return R.drawable.ic_business_cat_finance;
            case 17:
                return R.drawable.ic_business_cat_hotel_and_lodging;
            case 18:
                return R.drawable.ic_business_cat_interests;
            case 19:
                return R.drawable.ic_business_cat_legal;
            case 20:
                return R.drawable.ic_business_cat_media;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                return R.drawable.ic_business_cat_media_and_news_company;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                return R.drawable.ic_business_cat_medical_and_health;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return R.drawable.ic_business_cat_non_governmental_org;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return R.drawable.ic_business_cat_non_profit_org;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return R.drawable.ic_business_cat_public_and_gov_service;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                return R.drawable.ic_business_cat_real_estate;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                return R.drawable.ic_business_cat_science_tech_and_eng;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                return R.drawable.ic_business_cat_travel_and_transportation;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                return R.drawable.ic_business_cat_vehicle_aircraft_boat;
            default:
                return R.drawable.ic_business_cat;
        }
    }
}
