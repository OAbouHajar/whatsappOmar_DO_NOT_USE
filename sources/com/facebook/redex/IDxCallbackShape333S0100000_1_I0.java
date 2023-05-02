package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass2AH;
import X.C000900k;
import X.C001000l;
import X.C004601z;
import X.C009804r;
import X.C101124wk;
import X.C13680ns;
import X.C13690nt;
import X.C14550pN;
import X.C16030sJ;
import X.C19980zJ;
import X.C33741j5;
import X.C34621kZ;
import X.C42821yj;
import X.C616739v;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.WaEditText;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.calling.callhistory.view.CallsHistoryFragmentV2;
import com.obwhatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel;
import com.obwhatsapp.community.CommunityDeleteDialogFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;

public class IDxCallbackShape333S0100000_1_I0 implements C009804r {
    public Object A00;
    public final int A01;

    public IDxCallbackShape333S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean AM1(MenuItem menuItem, AnonymousClass05J r8) {
        AnonymousClass05J r0;
        C616739v r02;
        switch (this.A01) {
            case 0:
                if (menuItem.getItemId() == R.id.menuitem_calls_delete) {
                    ArrayList A0u = AnonymousClass000.A0u();
                    CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A00;
                    Iterator it = callsHistoryFragment.A0r.iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass000.A0m(it);
                        if (!TextUtils.isEmpty(A0m)) {
                            LinkedHashMap linkedHashMap = callsHistoryFragment.A0h;
                            if (!linkedHashMap.isEmpty() && linkedHashMap.containsKey(A0m) && (r02 = (C616739v) callsHistoryFragment.A0h.get(A0m)) != null) {
                                A0u.addAll(Collections.unmodifiableList(r02.A04));
                            }
                        }
                    }
                    if (!A0u.isEmpty()) {
                        callsHistoryFragment.A0T.A0D(A0u);
                    }
                    callsHistoryFragment.A1C();
                    r0 = callsHistoryFragment.A03;
                    break;
                } else {
                    return false;
                }
            case 1:
                if (menuItem.getItemId() != R.id.menuitem_calls_delete) {
                    return false;
                }
                ArrayList A0u2 = AnonymousClass000.A0u();
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                HashSet hashSet = callsHistoryFragmentV2.A0b;
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    A0u2.addAll(Collections.unmodifiableList(((C101124wk) it2.next()).A01.A04));
                }
                if (!A0u2.isEmpty()) {
                    callsHistoryFragmentV2.A0R.A0D(A0u2);
                    CallsHistoryFragmentV2ViewModel callsHistoryFragmentV2ViewModel = callsHistoryFragmentV2.A0E;
                    Iterator it3 = hashSet.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (!callsHistoryFragmentV2ViewModel.A03.remove(it3.next())) {
                                Log.w("CallsHistoryFragmentV2ViewModel/removeHistoricalCallItems failed to remove item");
                                callsHistoryFragmentV2ViewModel.A08.A01();
                            }
                        }
                    }
                    callsHistoryFragmentV2ViewModel.A06();
                    callsHistoryFragmentV2ViewModel.A05();
                    hashSet.clear();
                    r0 = callsHistoryFragmentV2.A06;
                    break;
                } else {
                    return true;
                }
            case 2:
                return false;
            default:
                if (menuItem.getItemId() != R.id.menuitem_delete) {
                    return false;
                }
                AnonymousClass2AH r2 = (AnonymousClass2AH) this.A00;
                ArrayList A0n = C13680ns.A0n(r2.A0y);
                Bundle A0D = C13690nt.A0D();
                A0D.putStringArrayList("selectedParentJids", C16030sJ.A06(A0n));
                CommunityDeleteDialogFragment communityDeleteDialogFragment = new CommunityDeleteDialogFragment();
                communityDeleteDialogFragment.A0T(A0D);
                ((C14550pN) C19980zJ.A00(r2.A06)).Afc(communityDeleteDialogFragment);
                return true;
        }
        if (r0 == null) {
            return true;
        }
        r0.A05();
        return true;
    }

    public boolean APA(Menu menu, AnonymousClass05J r8) {
        int i2;
        int i3;
        switch (this.A01) {
            case 2:
                C42821yj r3 = (C42821yj) this.A00;
                View A0H = C13680ns.A0H(LayoutInflater.from(r3.A22.AGK().A02()), (ViewGroup) null, R.layout.layout01e7);
                r8.A09(A0H);
                WaEditText waEditText = (WaEditText) A0H.findViewById(R.id.search_src_text);
                r3.A1A = waEditText;
                if (waEditText == null) {
                    return false;
                }
                waEditText.setOnFocusChangeListener(new IDxCListenerShape241S0100000_2_I1(this, 1));
                r3.A1A.addTextChangedListener(r3.A4r);
                r3.A1A.setOnEditorActionListener(new IDxAListenerShape212S0100000_2_I1(this, 2));
                View A0E = C004601z.A0E(A0H, R.id.search_up);
                r3.A0G = A0E;
                C13680ns.A17(A0E, this, 24);
                View A0E2 = C004601z.A0E(A0H, R.id.search_down);
                r3.A0E = A0E2;
                C13680ns.A17(A0E2, this, 25);
                r3.A0H = C004601z.A0E(A0H, R.id.search_up_progress_bar);
                r3.A0F = C004601z.A0E(A0H, R.id.search_down_progress_bar);
                r3.A1A.setText(r3.A2C.A0F);
                r3.A1A.selectAll();
                r3.A1A.requestFocus();
                r3.A1A.setSelected(true);
                return true;
            case 3:
                i2 = R.id.menuitem_delete;
                i3 = R.string.str1c4c;
                break;
            default:
                i2 = R.id.menuitem_calls_delete;
                i3 = R.string.str046d;
                break;
        }
        menu.add(0, i2, 0, i3).setIcon(R.drawable.ic_action_delete).setShowAsAction(2);
        return true;
    }

    public void APd(AnonymousClass05J r4) {
        switch (this.A01) {
            case 0:
                CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A00;
                callsHistoryFragment.A1C();
                callsHistoryFragment.A03 = null;
                return;
            case 1:
                ((CallsHistoryFragmentV2) this.A00).A06 = null;
                return;
            case 2:
                r4.A09((View) null);
                C42821yj r2 = (C42821yj) this.A00;
                r2.A0a = null;
                C34621kZ r0 = r2.A2C;
                r0.A0E = null;
                r0.A0G = null;
                r2.A2g = null;
                C33741j5 r1 = r2.A45;
                if (r1 != null) {
                    r1.A03(8);
                }
                if (r2.A2A.A07()) {
                    r2.A37.A03();
                } else {
                    r2.A07.setVisibility(0);
                    r2.A37.requestFocus();
                }
                r2.A1n.getConversationCursorAdapter().A02++;
                r2.A1n.A02();
                return;
            default:
                AnonymousClass2AH r12 = (AnonymousClass2AH) this.A00;
                r12.A0F();
                r12.A00 = null;
                return;
        }
    }

    public boolean AV8(Menu menu, AnonymousClass05J r8) {
        switch (this.A01) {
            case 0:
                CallsHistoryFragment callsHistoryFragment = (CallsHistoryFragment) this.A00;
                if (!callsHistoryFragment.A0c()) {
                    Log.i("calls/actionmode/fragment is not attached to activity.");
                    return false;
                }
                HashSet hashSet = callsHistoryFragment.A0r;
                if (!hashSet.isEmpty()) {
                    Locale A0m = C13690nt.A0m(callsHistoryFragment.A0S);
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1M(objArr, hashSet.size(), 0);
                    r8.A0B(String.format(A0m, "%d", objArr));
                    C19980zJ.A04(callsHistoryFragment.A0C().findViewById(R.id.action_mode_bar), callsHistoryFragment.A0C().getWindowManager());
                    return true;
                }
                break;
            case 1:
                CallsHistoryFragmentV2 callsHistoryFragmentV2 = (CallsHistoryFragmentV2) this.A00;
                if (!callsHistoryFragmentV2.A0c()) {
                    Log.w("CallsHistoryFragmentV2/onPrepareActionMode not attached to an activity");
                    return false;
                }
                HashSet hashSet2 = callsHistoryFragmentV2.A0b;
                if (!hashSet2.isEmpty()) {
                    Locale A0m2 = C13690nt.A0m(callsHistoryFragmentV2.A0Q);
                    Object[] objArr2 = new Object[1];
                    AnonymousClass000.A1M(objArr2, hashSet2.size(), 0);
                    r8.A0B(String.format(A0m2, "%d", objArr2));
                    C001000l A0D = callsHistoryFragmentV2.A0D();
                    C19980zJ.A04(A0D.findViewById(R.id.action_mode_bar), A0D.getWindowManager());
                    return true;
                }
                break;
            case 2:
                return false;
            default:
                AnonymousClass2AH r5 = (AnonymousClass2AH) this.A00;
                HashSet hashSet3 = r5.A0y;
                if (!hashSet3.isEmpty()) {
                    Locale A0m3 = C13690nt.A0m(r5.A0X);
                    Object[] objArr3 = new Object[1];
                    AnonymousClass000.A1M(objArr3, hashSet3.size(), 0);
                    r8.A0B(String.format(A0m3, "%d", objArr3));
                    C000900k r2 = r5.A06;
                    C19980zJ.A04(r2.findViewById(R.id.action_mode_bar), r2.getWindowManager());
                    return true;
                }
                break;
        }
        r8.A05();
        return true;
    }
}
