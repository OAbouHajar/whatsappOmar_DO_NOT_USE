package com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils;

import com.facebook.msys.mci.DefaultCrypto;
import com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class PatternLockUtils {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v0, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r59v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r44v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r37v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v7, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v8, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v10, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r40v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v11, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v12, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v3, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v13, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v6, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v14, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r54v15, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v4, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r64v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r65v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r66v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r72v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v66, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v71, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v72, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v76, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v78, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v80, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v81, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v82, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v83, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v85, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v87, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v88, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v89, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v90, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v91, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v92, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v93, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v94, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v95, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v96, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v97, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v98, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v99, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v100, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v101, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v102, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v103, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v104, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v105, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v106, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v107, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v108, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v110, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v111, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v114, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v115, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v116, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v117, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v118, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v119, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v120, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v121, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v123, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v124, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v125, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v126, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v127, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v128, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v129, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v130, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v131, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v132, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v133, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v134, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v135, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v136, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v137, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v138, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v139, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v140, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v141, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v142, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v143, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v144, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v145, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v146, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v147, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v148, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v149, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v150, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v151, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v152, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v153, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v154, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v155, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v156, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v157, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v158, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v159, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v24, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v30, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v31, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v34, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v35, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v38, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v39, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v40, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v43, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v44, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v45, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v46, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v47, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v49, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v50, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v51, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v53, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v54, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v55, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v57, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v58, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v59, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v60, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v61, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v63, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v64, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v65, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v66, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v67, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v68, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v69, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v70, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v71, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v72, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v73, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v74, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v75, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v76, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v78, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v79, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v80, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v81, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v82, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v83, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v84, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v85, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v86, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v87, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v88, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v89, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v90, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v91, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v92, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v93, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v94, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v95, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v96, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v97, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v98, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v99, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v100, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v101, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v102, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v103, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v104, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v105, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v106, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v107, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v108, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v109, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v110, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v111, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v112, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v114, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v115, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v116, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v117, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v118, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v119, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v120, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v121, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v122, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v123, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v124, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v125, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v126, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v127, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v128, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v129, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v130, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v131, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v132, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v133, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v134, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v135, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v136, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v137, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v138, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v139, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v140, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v141, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v142, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v143, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v144, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v145, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v146, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v147, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v148, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v149, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v150, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v151, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v152, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v153, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v154, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v155, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v156, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v157, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v158, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v159, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v160, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v160, resolved type: java.lang.Object} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c8, code lost:
        r2 = "ۧۛۘۘ۠ۡۧ۠ۧۦۜۡۨۘۘۜۜۘۥۧۡۘ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0085, code lost:
        r34 = r34;
        r11 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot> generateRandomPattern(com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView r78, int r79) {
        /*
            r74 = 0
            r73 = 0
            r71 = 0
            r70 = 0
            r69 = 0
            r67 = 0
            r68 = 0
            r65 = 0
            r64 = 0
            r63 = 0
            r62 = 0
            r61 = 0
            r60 = 0
            r58 = 0
            r55 = 0
            r53 = 0
            r52 = 0
            r50 = 0
            r48 = 0
            r45 = 0
            r47 = 0
            r46 = 0
            r49 = 0
            r51 = 0
            r44 = 0
            r39 = 0
            r43 = 0
            r42 = 0
            r38 = 0
            r37 = 0
            r36 = 0
            r34 = 0
            r33 = 0
            r35 = 0
            r40 = 0
            r41 = 0
            r28 = 0
            r32 = 0
            r31 = 0
            r27 = 0
            r26 = 0
            r25 = 0
            r23 = 0
            r22 = 0
            r24 = 0
            r29 = 0
            r30 = 0
            r16 = 0
            r21 = 0
            r20 = 0
            r15 = 0
            r14 = 0
            r54 = 0
            r13 = 0
            r11 = 0
            r10 = 0
            r12 = 0
            r17 = 0
            r19 = 0
            r56 = 0
            r9 = 0
            r57 = 0
            r18 = 0
            r7 = 0
            r8 = 0
            r66 = 0
            r59 = 0
            r6 = 0
            r72 = 0
            r5 = 0
            r4 = 0
            r3 = 0
            java.lang.String r2 = "ۥۥۘۡۛۦ۠ۦۦۨ۠ۜۘۥۖۢۗ۫ۨ"
        L_0x0085:
            int r75 = r2.hashCode()
            r76 = 954(0x3ba, float:1.337E-42)
            r77 = 1150187728(0x448e78d0, float:1139.7754)
            r75 = r75 ^ r76
            r75 = r75 ^ r77
            switch(r75) {
                case -2104591850: goto L_0x02be;
                case -2070445022: goto L_0x02b2;
                case -2018397261: goto L_0x018b;
                case -1981401442: goto L_0x04ba;
                case -1971918327: goto L_0x022d;
                case -1966782761: goto L_0x02fb;
                case -1966324227: goto L_0x065a;
                case -1872835223: goto L_0x04fc;
                case -1871789749: goto L_0x0654;
                case -1824715388: goto L_0x01d7;
                case -1789318319: goto L_0x0396;
                case -1729844633: goto L_0x033e;
                case -1729631919: goto L_0x06d9;
                case -1707603923: goto L_0x07a6;
                case -1686958483: goto L_0x040a;
                case -1643181522: goto L_0x05e6;
                case -1625980062: goto L_0x07b6;
                case -1607548228: goto L_0x0316;
                case -1569743557: goto L_0x0582;
                case -1539477145: goto L_0x066f;
                case -1515212553: goto L_0x02b8;
                case -1499477950: goto L_0x0478;
                case -1476907618: goto L_0x024f;
                case -1425615737: goto L_0x03e3;
                case -1354025798: goto L_0x01e9;
                case -1353115689: goto L_0x0588;
                case -1338006692: goto L_0x053c;
                case -1336830519: goto L_0x056a;
                case -1330516747: goto L_0x070e;
                case -1322401958: goto L_0x03f2;
                case -1318358689: goto L_0x0191;
                case -1297618006: goto L_0x03ec;
                case -1277458732: goto L_0x05ac;
                case -1269627817: goto L_0x0484;
                case -1254830910: goto L_0x015b;
                case -1245530222: goto L_0x0110;
                case -1221936550: goto L_0x0201;
                case -1205595638: goto L_0x0772;
                case -1193296119: goto L_0x078a;
                case -1144849050: goto L_0x009c;
                case -1142852321: goto L_0x0614;
                case -1133133753: goto L_0x0123;
                case -1103395264: goto L_0x0104;
                case -1086291538: goto L_0x0626;
                case -1086061460: goto L_0x06ea;
                case -1055352003: goto L_0x0576;
                case -1029415332: goto L_0x0444;
                case -946706595: goto L_0x0378;
                case -850174475: goto L_0x058e;
                case -783825554: goto L_0x06d3;
                case -726817076: goto L_0x0310;
                case -720460610: goto L_0x077a;
                case -696540660: goto L_0x069f;
                case -676867221: goto L_0x017f;
                case -628820770: goto L_0x0693;
                case -624749027: goto L_0x065f;
                case -619299806: goto L_0x06fd;
                case -602791496: goto L_0x0524;
                case -599266108: goto L_0x0432;
                case -593649654: goto L_0x03c6;
                case -581532780: goto L_0x03fe;
                case -557949392: goto L_0x0536;
                case -476448972: goto L_0x042c;
                case -393240421: goto L_0x06f7;
                case -383239331: goto L_0x00b9;
                case -344934676: goto L_0x0270;
                case -323292972: goto L_0x05ec;
                case -320188071: goto L_0x07be;
                case -266450094: goto L_0x061a;
                case -218903471: goto L_0x0749;
                case -186972191: goto L_0x0754;
                case -178649465: goto L_0x046c;
                case -172252166: goto L_0x01f5;
                case -171310236: goto L_0x0699;
                case -126339808: goto L_0x05d4;
                case -111682643: goto L_0x0675;
                case -79477312: goto L_0x030a;
                case -32784217: goto L_0x01fb;
                case 12596780: goto L_0x01bf;
                case 62242905: goto L_0x0502;
                case 89532918: goto L_0x0350;
                case 104221030: goto L_0x038a;
                case 120816249: goto L_0x0664;
                case 150131730: goto L_0x0496;
                case 153878385: goto L_0x0472;
                case 250696763: goto L_0x0227;
                case 274325717: goto L_0x07a6;
                case 318405346: goto L_0x039c;
                case 321915426: goto L_0x0734;
                case 381239030: goto L_0x06df;
                case 435845648: goto L_0x0099;
                case 476621493: goto L_0x0564;
                case 498976583: goto L_0x062c;
                case 523273101: goto L_0x0147;
                case 606721660: goto L_0x07a2;
                case 624639008: goto L_0x0210;
                case 631410791: goto L_0x02dc;
                case 635266239: goto L_0x01e0;
                case 708984150: goto L_0x0291;
                case 772905648: goto L_0x0782;
                case 815686618: goto L_0x075f;
                case 824797473: goto L_0x00d9;
                case 836855053: goto L_0x052a;
                case 841555680: goto L_0x05da;
                case 911749079: goto L_0x031c;
                case 926733318: goto L_0x01ef;
                case 993916852: goto L_0x01cb;
                case 1021682724: goto L_0x0706;
                case 1059572051: goto L_0x06ab;
                case 1125429262: goto L_0x01d1;
                case 1181666114: goto L_0x0796;
                case 1204126917: goto L_0x00fc;
                case 1222391172: goto L_0x0404;
                case 1266194244: goto L_0x019d;
                case 1278546316: goto L_0x0344;
                case 1302689640: goto L_0x05cb;
                case 1311909946: goto L_0x05f2;
                case 1316324306: goto L_0x03f8;
                case 1393624884: goto L_0x06a5;
                case 1422521254: goto L_0x04f6;
                case 1423268850: goto L_0x0570;
                case 1425186793: goto L_0x06cd;
                case 1475335544: goto L_0x079e;
                case 1552414369: goto L_0x0384;
                case 1559607021: goto L_0x04ea;
                case 1578015690: goto L_0x0185;
                case 1591339865: goto L_0x0490;
                case 1596227165: goto L_0x0197;
                case 1600474044: goto L_0x011d;
                case 1653410318: goto L_0x04f0;
                case 1659712996: goto L_0x06e5;
                case 1698696853: goto L_0x057c;
                case 1722129836: goto L_0x047e;
                case 1747335664: goto L_0x037e;
                case 1799425300: goto L_0x0390;
                case 1848446744: goto L_0x048a;
                case 1877901861: goto L_0x0304;
                case 1885873248: goto L_0x04db;
                case 1893427386: goto L_0x01c5;
                case 1919114041: goto L_0x0768;
                case 1948082024: goto L_0x0669;
                case 1958729578: goto L_0x05e0;
                case 1966902687: goto L_0x03a2;
                case 1971385973: goto L_0x04e4;
                case 2009029975: goto L_0x077e;
                case 2028316944: goto L_0x0151;
                case 2041475968: goto L_0x043e;
                case 2084763296: goto L_0x07ae;
                case 2119347273: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x0085
        L_0x0096:
            java.lang.String r2 = "ۢۗۛۥۜۛۙۥۜۘۤ۠۫ۗۛ۬ۢۨۘۘۘۗۗۡۥۧ۫ۧۦ"
            goto L_0x0085
        L_0x0099:
            java.lang.String r2 = "ۜۥۥۨۛۦۘۛۚۢۥۢ۫ۢ۬ۜۘۚ۠ۜۘۡ۫ۤۢۘۨ"
            goto L_0x0085
        L_0x009c:
            r75 = 592136160(0x234b47e0, float:1.1019872E-17)
            java.lang.String r2 = "ۨۨۡۘۥۛۙ۠ۥۦۜۡۗۢۡۦۘ"
        L_0x00a1:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1006746034: goto L_0x00ab;
                case -732657190: goto L_0x00b6;
                case -104979218: goto L_0x00b1;
                case 1931120646: goto L_0x07ba;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            goto L_0x00a1
        L_0x00ab:
            java.lang.String r2 = "ۨۨۘۘۗۡۧۘۤۘۘۘۘۢۡۘۚۤۨۦۦۘۨۘ"
            goto L_0x00a1
        L_0x00ae:
            java.lang.String r2 = "ۤۢۖۘۢۗۜۘ۟۠ۦۘۚۢۖۤۦۙ۟ۜۜۘ"
            goto L_0x00a1
        L_0x00b1:
            if (r78 == 0) goto L_0x00ae
            java.lang.String r2 = "ۦ۠ۨ۟ۖۧۥۛۜ۫ۢۢ۬ۧ۬ۚۨۘۦۦ۠۫ۧۦۘ"
            goto L_0x00a1
        L_0x00b6:
            java.lang.String r2 = "ۧۘ۫۬ۚۚ۟ۗ۫ۗۗۧ۬۟ۧ۬ۦۚۡۗ۟"
            goto L_0x0085
        L_0x00b9:
            r75 = 1248530644(0x4a6b10d4, float:3851317.0)
            java.lang.String r2 = "۬ۦۗۗۤۛۖۤۥۦۙۛۨۨ"
        L_0x00be:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -974388561: goto L_0x00c8;
                case -956479716: goto L_0x00d6;
                case -167926579: goto L_0x00d3;
                case 419217974: goto L_0x00ce;
                default: goto L_0x00c7;
            }
        L_0x00c7:
            goto L_0x00be
        L_0x00c8:
            java.lang.String r2 = "ۧۛۘۘ۠ۡۧ۠ۧۦۜۡۨۘۘۜۜۘۥۧۡۘ"
            goto L_0x0085
        L_0x00cb:
            java.lang.String r2 = "۬ۖۜۘ۟ۥۦۘۤۖۤۚۢۢۙۛ۬ۙۚۜۘۤۢۚ"
            goto L_0x00be
        L_0x00ce:
            if (r79 <= 0) goto L_0x00cb
            java.lang.String r2 = "ۙۚۚۛ۠ۚۧۢۢۨۚ۫ۥۥۥۘ۫ۦۥۘۖۢۨۢۦۘ۠"
            goto L_0x00be
        L_0x00d3:
            java.lang.String r2 = "ۧ۠۠ۦ۠۫ۡ۫ۖۛ۫ۖۛۦۗۥ۠۫"
            goto L_0x00be
        L_0x00d6:
            java.lang.String r2 = "ۥ۠ۙۤۙۗۨۙۚ۟ۤۦۙۙۥۗۚۡۥۡۛۘۙۘۘ"
            goto L_0x0085
        L_0x00d9:
            r75 = -326668709(0xffffffffec876e5b, float:-1.309809E27)
            java.lang.String r2 = "ۦ۟ۡ۫ۘۡۘۧ۬ۜۘۚۘۚۧۥۖۘ"
        L_0x00de:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -856783436: goto L_0x00f9;
                case -481824138: goto L_0x00f6;
                case 545959444: goto L_0x00e8;
                case 1954484231: goto L_0x00c8;
                default: goto L_0x00e7;
            }
        L_0x00e7:
            goto L_0x00de
        L_0x00e8:
            int r2 = r78.getDotCount()
            r0 = r79
            if (r0 > r2) goto L_0x00f3
            java.lang.String r2 = "ۙۙۘۘۧ۫ۘۤۤ۟ۘۖۘ۬ۚۢۖۦۛۡۛ۠ۜۡۘ۠ۙۙ"
            goto L_0x00de
        L_0x00f3:
            java.lang.String r2 = "ۚۥ۫ۡۙۨ۠ۡۡۧۜۘۚۡۗۤۦۥۡۙۦۘ۠ۚۦۘ"
            goto L_0x00de
        L_0x00f6:
            java.lang.String r2 = "ۙ۬ۡۘۜۘۤۡ۫۟ۡۡۖۚ۫ۚۖۛۢۙ۠۠ۗۧۥ"
            goto L_0x00de
        L_0x00f9:
            java.lang.String r2 = "ۙۡۤ۬ۘۤۨۚۙ۠۠ۢۨ۟ۤۡۤۤۨۙۥۦ۫ۗۗۦۡۘ"
            goto L_0x0085
        L_0x00fc:
            java.util.ArrayList r74 = new java.util.ArrayList
            r74.<init>()
            java.lang.String r2 = "ۚۗ۟ۛۤۡ۟۟ۥۧۖۤۦ۠ۥۖۛۤ۟۟۟ۡۨۚۥۡ"
            goto L_0x0085
        L_0x0104:
            int r2 = r78.getDotCount()
            int r73 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randInt(r2)
            java.lang.String r2 = "ۙۚۢۨۜۜۨ۠ۗ۟ۧ۟۠ۜۡۖۨ"
            goto L_0x0085
        L_0x0110:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r73)
            r0 = r74
            r0.add(r2)
            java.lang.String r2 = "۠ۢۨۤۡۨۖۗۨۘۜۘ۟ۦۥۘ۠ۚۜ"
            goto L_0x0085
        L_0x011d:
            java.lang.String r2 = "۠۠ۥ۫ۜ۬ۖۛۦ۫ۗۡۘۡۧۗۦ۠ۨۘ"
            r72 = r73
            goto L_0x0085
        L_0x0123:
            r75 = -1815734654(0xffffffff93c61682, float:-5.000442E-27)
            java.lang.String r2 = "ۛۦۡۦ۟ۖۛۤۡۖۧۗۘ۠۠ۧۧۥۘۧ۬ۘۘ"
        L_0x0128:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1858737978: goto L_0x07b2;
                case -1844181773: goto L_0x0132;
                case 282609881: goto L_0x0139;
                case 1932256556: goto L_0x0144;
                default: goto L_0x0131;
            }
        L_0x0131:
            goto L_0x0128
        L_0x0132:
            java.lang.String r2 = "ۨۛ۟۠ۤۦۘۖۨۡۤۡۖۘۗۥۛۜ۟ۜۘ۠ۛۢ"
            goto L_0x0085
        L_0x0136:
            java.lang.String r2 = "ۥۤۗۛۡ۟ۘ۫ۜۗۚۜۚۜۗ"
            goto L_0x0128
        L_0x0139:
            int r2 = r74.size()
            r0 = r79
            if (r2 >= r0) goto L_0x0136
            java.lang.String r2 = "۠ۚۖۘۥۜۧۨۡۚۘۙۘۦۘۦۘ"
            goto L_0x0128
        L_0x0144:
            java.lang.String r2 = "۟ۛۤ۟ۙۡۘۧۖۗ۫ۨۚۛۖۧۘ۟ۜۢۢۡ۠ۖ۫ۤ۟ۗ"
            goto L_0x0128
        L_0x0147:
            int r2 = r78.getDotCount()
            int r71 = r72 / r2
            java.lang.String r2 = "ۨۛ۫ۧۨۥۘۜۦۨۘۘ۠ۡ۫ۙۨ۠ۥۥۘۡۦۙۖ۫ۖۘ۠ۙ۟"
            goto L_0x0085
        L_0x0151:
            int r2 = r78.getDotCount()
            int r70 = r72 % r2
            java.lang.String r2 = "۠ۦۜۚ۬ۡۧ۬ۦۘ۫۫ۡ۬ۡۖۘ"
            goto L_0x0085
        L_0x015b:
            int r2 = r78.getDotCount()
            int r2 = r2 - r71
            r0 = r71
            int r2 = java.lang.Math.max(r0, r2)
            int r69 = r78.getDotCount()
            int r69 = r69 - r70
            r0 = r70
            r1 = r69
            int r69 = java.lang.Math.max(r0, r1)
            r0 = r69
            int r69 = java.lang.Math.max(r2, r0)
            java.lang.String r2 = "ۤۧۖۚۢۦۘۛۛۧۦۧۖۥۧ۬ۙ۠ۢۤۘۛ۫۫۠ۦۚۚ"
            goto L_0x0085
        L_0x017f:
            r67 = 1
            java.lang.String r2 = "ۗۛ۟ۘۛۢۚۤۢۤۘۘۘۛۢۡۘۥۚۤۗۦۘ"
            goto L_0x0085
        L_0x0185:
            r68 = -1
            java.lang.String r2 = "ۖۜۚۦۢۧۤۚۘۘ۟۟ۗۥۨۖۚۧۤۡ۠ۡۘۘۚ۟"
            goto L_0x0085
        L_0x018b:
            java.lang.String r2 = "ۨۗۖۘ۫ۤ۠۟ۛۦۤۖۦۘۙۢۗۢۘۡ"
            r59 = r68
            goto L_0x0085
        L_0x0191:
            java.lang.String r2 = "ۖۨۥۘۡ۟۬ۗۙۤۨۙۖۘۡۙۛ"
            r66 = r67
            goto L_0x0085
        L_0x0197:
            java.lang.String r2 = "ۚۥۥۥۡۢۨ۫ۚۦۙۥۨۛۡۘۢۛۖۡۧ۠ۖۖۜ"
            r7 = r59
            goto L_0x0085
        L_0x019d:
            r75 = -618913925(0xffffffffdb1c1f7b, float:-4.394471E16)
            java.lang.String r2 = "ۥۛۨۘۨۨۜۘ۠ۧۦۨ۟ۥۘۙ۟ۨۘۛۨۚ۟۟ۗۙۨۘۖۡۤ"
        L_0x01a2:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1961901812: goto L_0x01b2;
                case -563014599: goto L_0x01bb;
                case -189570035: goto L_0x07ae;
                case 1243403637: goto L_0x01ac;
                default: goto L_0x01ab;
            }
        L_0x01ab:
            goto L_0x01a2
        L_0x01ac:
            java.lang.String r2 = "ۧۥۖۘۗۨۙ۬ۦۚۡ۫ۥۘ۫۬ۡۘ۫ۧ۫"
            goto L_0x01a2
        L_0x01af:
            java.lang.String r2 = "ۡ۟ۜۧ۬ۦۘۤۢ۠ۢۡۛۨۦۧۖۧۙۛۡۖۘ"
            goto L_0x01a2
        L_0x01b2:
            r0 = r66
            r1 = r69
            if (r0 > r1) goto L_0x01af
            java.lang.String r2 = "ۥۢۘۘۤۛۦۘۙ۬ۥۦۚۜۘۚ۫ۚۚۦۧ"
            goto L_0x01a2
        L_0x01bb:
            java.lang.String r2 = "۠ۖۥۜۤۜۘۧۤۡۘۡۚۦۘۛۧۤ"
            goto L_0x0085
        L_0x01bf:
            int r65 = r71 - r66
            java.lang.String r2 = "۟ۥۚۢۜ۫ۖۥۛۜ۬ۘ۫ۗۤ۫ۢۥۥ۠ۚ"
            goto L_0x0085
        L_0x01c5:
            int r64 = r70 - r66
            java.lang.String r2 = "ۘۥۡۘۜۤۜ۫ۧۜۘۤ۠ۧۜۥ۠ۖۤ۠"
            goto L_0x0085
        L_0x01cb:
            int r63 = r71 + r66
            java.lang.String r2 = "۠ۡۛۦ۟ۖۘۚۤۡۘۤۖۜۘ۠ۜۨۘۨ۠ۘۦۛۨۘۥۨ۠۟ۨۥۘ"
            goto L_0x0085
        L_0x01d1:
            int r62 = r70 + r66
            java.lang.String r2 = "ۨۥۛۢۗ۬ۘۚ۠ۗۡۖۘۜۤ۟ۨۡ۟ۜۡۘ۟ۚۘۘ"
            goto L_0x0085
        L_0x01d7:
            r2 = 4
            int[] r61 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randIntArray(r2)
            java.lang.String r2 = "ۛۢۛ۠ۨۦۘ۫ۘۗۦ۫۫۫ۙۙۗۜۛ"
            goto L_0x0085
        L_0x01e0:
            r0 = r61
            int r0 = r0.length
            r60 = r0
            java.lang.String r2 = "ۡۗ۟ۤ۠ۙۦ۫ۡۘ۬ۘۗۧۘ۠۫ۗۧۡۗۤۘۥۤ"
            goto L_0x0085
        L_0x01e9:
            r58 = 0
            java.lang.String r2 = "ۧۛۙۗۡۡۧۖۖۘۘۧۡۘۛ۫ۘۜۗۦۘ"
            goto L_0x0085
        L_0x01ef:
            java.lang.String r2 = "۠ۚۗۤۙۢۛ۫۫ۚ۟ۚۗ۫ۡۘۜ۠ۖۘۥۚ۠"
            r18 = r59
            goto L_0x0085
        L_0x01f5:
            java.lang.String r2 = "ۥۙۢۢۤۨۘۗ۬ۨۤۖ۟ۡۙۥۡۖۧۖۤ"
            r57 = r58
            goto L_0x0085
        L_0x01fb:
            java.lang.String r2 = "ۙۖ۠ۖ۠۠ۗۘۥۘۡ۟۠۬ۨۥۦ۠ۛۢۡۘۤ۠ۦۘۜۡۡۘ"
            r56 = r18
            goto L_0x0085
        L_0x0201:
            r75 = -247742131(0xfffffffff13bc14d, float:-9.297181E29)
            java.lang.String r2 = "۬ۙۖۧۘۘ۫ۖۚ۠ۘۛۧۜۙۧۧۧۥ۟ۗ۠ۡۘۘۥ۫"
        L_0x0206:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -366749758: goto L_0x0217;
                case 1036070783: goto L_0x0220;
                case 1401719496: goto L_0x0210;
                case 2080392647: goto L_0x0223;
                default: goto L_0x020f;
            }
        L_0x020f:
            goto L_0x0206
        L_0x0210:
            java.lang.String r2 = "ۦۡ۫ۘۢۤۡ۫ۢ۬ۢۘۘ۫ۖۨۨۘۧۨۘ۫ۖ"
            goto L_0x0085
        L_0x0214:
            java.lang.String r2 = "ۚۗ۠۫ۤۖۘ۬ۡ۠ۚ۬ۡ۟ۥۦۘۡ۟۟ۦۧۗۡۨۛ"
            goto L_0x0206
        L_0x0217:
            r0 = r57
            r1 = r60
            if (r0 >= r1) goto L_0x0214
            java.lang.String r2 = "۠ۨۖۨ۫ۙۚۘۜۘ۟ۢۖۚ۟ۜۘ"
            goto L_0x0206
        L_0x0220:
            java.lang.String r2 = "ۖ۫ۨۡۜۡۚۥۖۘۦۛۘۗۡۢۥۨۢ"
            goto L_0x0206
        L_0x0223:
            java.lang.String r2 = "ۗ۟ۨۘۢۜۡ۫۠ۤ۬ۖۚۦ۫۟ۤۖ۫ۜۥۧۘۘۤۜۘ"
            goto L_0x0085
        L_0x0227:
            r55 = r61[r57]
            java.lang.String r2 = "ۜۢۜۥ۫ۘۘۧۜ۬ۦۚۦۚۥۚ۟۠ۜ"
            goto L_0x0085
        L_0x022d:
            r75 = 726581352(0x2b4ec068, float:7.345292E-13)
            java.lang.String r2 = "ۚۖۖۦۗۡۚ۬ۗۘۡۖۤۡۥۥۜ۫ۥۖۦۘ"
        L_0x0232:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1368273543: goto L_0x023c;
                case -612891232: goto L_0x0248;
                case 548976453: goto L_0x0243;
                case 1501101037: goto L_0x024b;
                default: goto L_0x023b;
            }
        L_0x023b:
            goto L_0x0232
        L_0x023c:
            java.lang.String r2 = "ۢ۬ۜۘۤۛۜ۠ۗۨۘۗۨۚۥۖ۫ۚ۠"
            goto L_0x0085
        L_0x0240:
            java.lang.String r2 = "ۧۡۘۘۚۜ۟ۛ۠ۛ۫۫ۙۦۚ۬ۙۨۜۘ۬ۨۦ۬ۖۨ"
            goto L_0x0232
        L_0x0243:
            if (r55 == 0) goto L_0x0240
            java.lang.String r2 = "ۦۤۦۘ۬۫ۜ۬۬ۢۧ۟ۛۨۤۢۤ۫ۡۘ۠ۢ۠"
            goto L_0x0232
        L_0x0248:
            java.lang.String r2 = "ۘ۟ۖۘ۫ۚۨ۫ۡۢۚ۠ۢۗ۠ۜۘ"
            goto L_0x0232
        L_0x024b:
            java.lang.String r2 = "۟ۖۦۘ۟۬ۡۛۜۘۚۤۙۘۜۦۘۙۨۜ"
            goto L_0x0085
        L_0x024f:
            r75 = -1668842891(0xffffffff9c877a75, float:-8.965205E-22)
            java.lang.String r2 = "ۚ۬ۥ۫ۥۘۚ۠ۡۘۨۘۦۜۨۦ"
        L_0x0254:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1830660933: goto L_0x025e;
                case -741301340: goto L_0x079a;
                case -659394989: goto L_0x026d;
                case 958373881: goto L_0x0265;
                default: goto L_0x025d;
            }
        L_0x025d:
            goto L_0x0254
        L_0x025e:
            java.lang.String r2 = "ۚ۟ۤۖۡ۟ۘ۬ۨۗۗۡۥ۟ۡۘۚۤۜۛۛۜ۬۫ۢ"
            goto L_0x0085
        L_0x0262:
            java.lang.String r2 = "۫ۗۜۙۖۦۥۤۤ۫۬ۗ۫۟ۦۘۜۤۖۡ۟ۤۤ۫۠"
            goto L_0x0254
        L_0x0265:
            r2 = 1
            r0 = r55
            if (r0 == r2) goto L_0x0262
            java.lang.String r2 = "۠ۨۨۘۘۗۤۚۦۗۥ۟ۡۘ۠ۤ۫ۖۨۘ۬ۛ۟ۨ۬۬"
            goto L_0x0254
        L_0x026d:
            java.lang.String r2 = "ۙۦۘۧۢۖۜ۠ۢۨۛۖۤۧۦ"
            goto L_0x0254
        L_0x0270:
            r75 = 1307545207(0x4def8e77, float:5.023864E8)
            java.lang.String r2 = "ۚۢ۫ۢۥۦۨۚ۫۟ۖۦۘۗۙ۠ۛ۟ۡۦۦۜۘۜ۬"
        L_0x0275:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1404879159: goto L_0x0792;
                case -1402855686: goto L_0x027f;
                case -1319714975: goto L_0x028d;
                case 554769942: goto L_0x028a;
                default: goto L_0x027e;
            }
        L_0x027e:
            goto L_0x0275
        L_0x027f:
            r2 = 2
            r0 = r55
            if (r0 == r2) goto L_0x0287
            java.lang.String r2 = "ۛۨۦۘۘۙ۫ۜۖۘۥۖ۫ۥۦۥۜۚ۫ۡۖۨۗۗۚۖۦۨ"
            goto L_0x0275
        L_0x0287:
            java.lang.String r2 = "۬ۢۨۘۧۘۜۘ۟ۛۤ۠ۨۧ۫ۧۤ"
            goto L_0x0275
        L_0x028a:
            java.lang.String r2 = "۟ۜ۟ۗۜۙ۠۠ۦۨ۬ۧۛۡ۠ۢ۬۫"
            goto L_0x0275
        L_0x028d:
            java.lang.String r2 = "ۘۘۢۚۤۜۡۡۖۜۡۜۦۗۧۡۖۙۤۤۛ"
            goto L_0x0085
        L_0x0291:
            r75 = -661587334(0xffffffffd890fa7a, float:-1.2752437E15)
            java.lang.String r2 = "ۡۛۤۙۥۧ۟ۥۗۨ۠ۜۜۡۥ۠"
        L_0x0296:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1497463831: goto L_0x02ae;
                case -1423216913: goto L_0x02a0;
                case 282094814: goto L_0x02a6;
                case 2047324052: goto L_0x0786;
                default: goto L_0x029f;
            }
        L_0x029f:
            goto L_0x0296
        L_0x02a0:
            java.lang.String r2 = "ۛۙ۬۠ۥ۫ۨۚۖۢۡۢۧۙۜ"
            goto L_0x0296
        L_0x02a3:
            java.lang.String r2 = "ۘۧۖۥۗ۟ۥ۠ۥ۠ۢۙۤۙۖ"
            goto L_0x0296
        L_0x02a6:
            r2 = 3
            r0 = r55
            if (r0 == r2) goto L_0x02a3
            java.lang.String r2 = "ۢۖۥۢ۠۬ۢۘۥۗۧۢۙ۟ۗۖ۬ۚۦۢۨۘۗۗۡ۫ۜۖۘ"
            goto L_0x0296
        L_0x02ae:
            java.lang.String r2 = "ۤۙۗۧۘۧ۫ۧۢۤۜ۬ۘۛ۬ۙ۬ۢ"
            goto L_0x0085
        L_0x02b2:
            java.lang.String r2 = "ۢ۬۟ۛ۟ۜۢۛۡۜۖۤۦۖۘۥۥۚۧۤۛ"
            r54 = r18
            goto L_0x0085
        L_0x02b8:
            java.lang.String r2 = "۫ۡۦۘ۟ۚۧۧۗۜۜۚۨۜۡۛۖ۟ۙ"
            r54 = r18
            goto L_0x0085
        L_0x02be:
            r75 = 634764561(0x25d5bd11, float:3.7077726E-16)
            java.lang.String r2 = "ۤۨ۫ۚۢۜۢۗ۠ۜۨۜۦۖۡ۠۬۠ۡۤ۬"
        L_0x02c3:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -60346399: goto L_0x02cd;
                case 1559780229: goto L_0x02d9;
                case 1905329374: goto L_0x07a6;
                case 2069426885: goto L_0x02d4;
                default: goto L_0x02cc;
            }
        L_0x02cc:
            goto L_0x02c3
        L_0x02cd:
            java.lang.String r2 = "ۗۤۨۘۙۦۜۘۘۦۡۘۡۚۘۘۤ۠ۤۛۦۦۘۡۗۛۖۖۡۤۚ۠"
            goto L_0x0085
        L_0x02d1:
            java.lang.String r2 = "ۘ۠ۘۘۜ۟ۦۘۤ۫ۦۜۚ۬ۤۦۦۨۧۡۘۜ۟۠"
            goto L_0x02c3
        L_0x02d4:
            if (r64 < 0) goto L_0x02d1
            java.lang.String r2 = "ۡۚۧۙ۟۬ۗۦۘۜ۟۬۫ۥۦ"
            goto L_0x02c3
        L_0x02d9:
            java.lang.String r2 = "ۥۚۘۤ۬۬ۜۗۤۜۛۛۥۦۘۢۥۧۥۨۥۖ۫ۛۙۤ"
            goto L_0x02c3
        L_0x02dc:
            r2 = 0
            int r53 = r65 + 1
            r0 = r53
            int r2 = java.lang.Math.max(r2, r0)
            int r53 = r78.getDotCount()
            r0 = r53
            r1 = r63
            int r53 = java.lang.Math.min(r0, r1)
            r0 = r53
            int[] r53 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randIntArray(r2, r0)
            java.lang.String r2 = "ۘۥۨۘۖۡۜۘۚO۠ۧۘۜۨۖۘ۫ۜۧۜۗۨ"
            goto L_0x0085
        L_0x02fb:
            r0 = r53
            int r0 = r0.length
            r52 = r0
            java.lang.String r2 = "ۙ۟۟ۖ۬ۨۘ۟ۧۢۜۘۡۘۗۦۦۘ"
            goto L_0x0085
        L_0x0304:
            r50 = 0
            java.lang.String r2 = "ۗۡۖۘۥ۫ۧۦۡۖۘۡۗۧۤۦۥۖ۬ۥۖۢۥۘ"
            goto L_0x0085
        L_0x030a:
            java.lang.String r2 = "ۤۨۢۦۖ۠۬ۤۘۘ۫ۛۦۘۨۢۥۗ۫ۥۘ"
            r51 = r18
            goto L_0x0085
        L_0x0310:
            java.lang.String r2 = "ۥۙۦۘ۬۟ۦۘۥ۟ۖۧۜۜۘۚۨ۬۟ۧۚ"
            r49 = r50
            goto L_0x0085
        L_0x0316:
            java.lang.String r2 = "ۛ۟ۜۘۚۡۖ۫ۚ۟ۛ۫ۦۘۙۘ۫ۚۙۖۘۤ۟۫۟ۤۨ"
            r54 = r51
            goto L_0x0085
        L_0x031c:
            r75 = -965551444(0xffffffffc672daac, float:-15542.668)
            java.lang.String r2 = "ۖۥۜۖۜۨۗۚۢۘ۫ۢۗ۟ۖۘۢۥۢۜۡۢۢۥۥ"
        L_0x0321:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -846407949: goto L_0x07a6;
                case -36960932: goto L_0x033a;
                case -18838151: goto L_0x032b;
                case 1745203143: goto L_0x0337;
                default: goto L_0x032a;
            }
        L_0x032a:
            goto L_0x0321
        L_0x032b:
            r0 = r49
            r1 = r52
            if (r0 >= r1) goto L_0x0334
            java.lang.String r2 = "ۥۧ۫۫۠ۦۘۖۥۙۦۧۖۘۧۦۧ"
            goto L_0x0321
        L_0x0334:
            java.lang.String r2 = "۠ۚۘۛۢ۫ۗ۠ۖ۠ۜۧۢۘۨ۫۟ۘۡۙۘۨۡۢ"
            goto L_0x0321
        L_0x0337:
            java.lang.String r2 = "ۤۦۦۙۥۖۘۥۥۥۘۚۥۧۢ۠ۥ"
            goto L_0x0321
        L_0x033a:
            java.lang.String r2 = "ۨۦۘۥۦۥۜۖۤ۠ۧۘۡۘۤۡ۠ۨۘۛ۠ۥۜۡۥۘ"
            goto L_0x0085
        L_0x033e:
            r48 = r53[r49]
            java.lang.String r2 = "ۡۖۧۗۛۥۘۥۜۨۗۧۦۘۙۨۢۜۥۘ۫۠ۨۧ۫ۖ۫"
            goto L_0x0085
        L_0x0344:
            int r2 = r78.getDotCount()
            int r2 = r2 * r48
            int r45 = r2 + r64
            java.lang.String r2 = "ۤۥ۠ۙۨۛۦ۟ۙۥۚ۠ۜۖ۫ۦۢ۟ۡۡۦ"
            goto L_0x0085
        L_0x0350:
            r75 = -635424610(0xffffffffda20309e, float:-1.12723629E16)
            java.lang.String r2 = "ۡۙ۟ۜۤۤۢۖ۫ۤ۟۫ۢ۬ۦۘ۟ۚۧ"
        L_0x0355:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1036274532: goto L_0x0365;
                case 876754219: goto L_0x035f;
                case 934672892: goto L_0x078e;
                case 1295800956: goto L_0x0374;
                default: goto L_0x035e;
            }
        L_0x035e:
            goto L_0x0355
        L_0x035f:
            java.lang.String r2 = "ۖۨۨۘۧۨۧۘ۬۟ۢۡۛۜۥۥۘۢ۬ۘۘۚۡ۟ۜ۠۟ۗۙۖۘ"
            goto L_0x0355
        L_0x0362:
            java.lang.String r2 = "ۛۧ۬ۡۘۢۧۥ۠۫ۨۤۘ۫ۛۚۡۘۘۤۡۘۘۜۢ"
            goto L_0x0355
        L_0x0365:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r45)
            r0 = r74
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0362
            java.lang.String r2 = "۟ۤۦۘۖۘۨ۟۟۫ۨۘۦۘۗ۠ۜ"
            goto L_0x0355
        L_0x0374:
            java.lang.String r2 = "۬ۡۜۖۜ۠ۡۗ۫ۗۙۦۛ۬ۘ۫ۡۧۦۚۥۘۙۖۗۡۜۙ"
            goto L_0x0085
        L_0x0378:
            int r47 = r49 + 1
            java.lang.String r2 = "ۨۗ۫۟۠ۖۘۙۤۤ۬ۡۘۗۛۧ"
            goto L_0x0085
        L_0x037e:
            r46 = -1
            java.lang.String r2 = "ۙۥۙۦۗ۠ۨۗۥۘۗۛۛۢۖۘ۬ۤ۬ۢۗۥۘ"
            goto L_0x0085
        L_0x0384:
            java.lang.String r2 = "ۘ۟ۥ۠ۧۥۘ۫ۖۘۧۧۜۘۤ۬ۨۚۧۨۘ"
            r49 = r47
            goto L_0x0085
        L_0x038a:
            java.lang.String r2 = "ۚۜ۫۠۫ۖ۫ۗ۬ۤۙۖۘ۠ۚ۠ۜ۬ۛۨۦۢۜۚ۫"
            r51 = r46
            goto L_0x0085
        L_0x0390:
            java.lang.String r2 = "۟ۙۦۘۦ۠ۘ۠۠ۡۘۚۘۡۘۤ۬۟ۤ۬۟ۛۘ"
            r44 = r45
            goto L_0x0085
        L_0x0396:
            java.lang.String r2 = "ۙۘۢ۬۠ۦۘۧۖ۟ۡۨۧۧ۟ۦۘ۠ۨۡۘۥۙۡۚ۬ۖۘ"
            r54 = r44
            goto L_0x0085
        L_0x039c:
            java.lang.String r2 = "ۗ۟ۚۗ۠ۙ۫ۢۥ۫۫۫۬ۢۖۘۡۧۘ۠ۘۛۙۤ۟ۚ۟"
            r54 = r18
            goto L_0x0085
        L_0x03a2:
            r75 = -199929758(0xfffffffff4155062, float:-4.7319494E31)
            java.lang.String r2 = "ۨ۬ۤ۬ۙۡۘ۠ۥۛۗۨ۬ۙۦۛ"
        L_0x03a7:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1422882087: goto L_0x07a6;
                case -722362979: goto L_0x03c3;
                case -715111353: goto L_0x03b8;
                case 1851452118: goto L_0x03b1;
                default: goto L_0x03b0;
            }
        L_0x03b0:
            goto L_0x03a7
        L_0x03b1:
            java.lang.String r2 = "ۘ۬ۘۧۨۤۢۤۥۨۡۧۘۙۢۗ"
            goto L_0x0085
        L_0x03b5:
            java.lang.String r2 = "ۙ۫ۡۘ۬۟ۡۖۜۜۘۘۨ۬ۤۖۢ"
            goto L_0x03a7
        L_0x03b8:
            int r2 = r78.getDotCount()
            r0 = r63
            if (r0 >= r2) goto L_0x03b5
            java.lang.String r2 = "ۜۧۧۛۘۡۘۜ۬۟ۦۚۘۧۨۧ۠۠ۦۘۙۥۘۘ"
            goto L_0x03a7
        L_0x03c3:
            java.lang.String r2 = "۫ۨۧۘۥۤۡۗۘۥۙۥۗۡۨۘ۠۟ۖ۬ۦۥۘۧۘۧۜۨ"
            goto L_0x03a7
        L_0x03c6:
            r2 = 0
            r0 = r64
            int r2 = java.lang.Math.max(r2, r0)
            int r39 = r78.getDotCount()
            r0 = r39
            r1 = r62
            int r39 = java.lang.Math.min(r0, r1)
            r0 = r39
            int[] r39 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randIntArray(r2, r0)
            java.lang.String r2 = "ۧۚۗۘۨ۟ۖۤۘۨۖۜ۫ۤۛۥ۬ۚۧ۫۠ۨۙۘۘ"
            goto L_0x0085
        L_0x03e3:
            r0 = r39
            int r0 = r0.length
            r43 = r0
            java.lang.String r2 = "۫ۖۘۘۤۛۧ۟ۗۥ۟ۦ۠۬ۢۥۗۡۨ"
            goto L_0x0085
        L_0x03ec:
            r42 = 0
            java.lang.String r2 = "ۜۙۨۛۢۦۘۚۥۢۗۨۥۘۥۡۡۘۖۦۤۘ۫۬۠ۡۘۗ۬ۥۘ"
            goto L_0x0085
        L_0x03f2:
            java.lang.String r2 = "ۙۚۥۤۡۜۢۙ۫ۛ۟ۛۖ۫۫"
            r41 = r42
            goto L_0x0085
        L_0x03f8:
            java.lang.String r2 = "ۧۧۡ۟ۚۗۛۛۡۗ۫۬ۡۜۧۘ"
            r40 = r18
            goto L_0x0085
        L_0x03fe:
            java.lang.String r2 = "ۨۧۤ۟ۚ۬ۦۙۖۥ۠ۜۘۤۜۥۘۦۤۥ"
            r35 = r39
            goto L_0x0085
        L_0x0404:
            java.lang.String r2 = "ۖۚۥۘۙۡ۬ۙۗۦۘۦ۬ۢۜۜۘۢۥۤۘۥۘ۟ۗۢ"
            r54 = r40
            goto L_0x0085
        L_0x040a:
            r75 = 1545305735(0x5c1b7e87, float:1.75070959E17)
            java.lang.String r2 = "۠ۖۚۜۧۦۘۖۨ۟ۗۘۘ۠ۖۘ۫ۧۥ"
        L_0x040f:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1152146315: goto L_0x0419;
                case -663270536: goto L_0x0428;
                case -609868162: goto L_0x07a6;
                case 67865863: goto L_0x0425;
                default: goto L_0x0418;
            }
        L_0x0418:
            goto L_0x040f
        L_0x0419:
            r0 = r41
            r1 = r43
            if (r0 >= r1) goto L_0x0422
            java.lang.String r2 = "ۤۗۤۚۦۨۘۖۖ۫ۖۖ۬ۘ۫ۡ"
            goto L_0x040f
        L_0x0422:
            java.lang.String r2 = "ۘ۫ۘۘۨۖۤۤۘ۬ۜۡۘۡۧۥۘۖۨ۬ۜۜۜ"
            goto L_0x040f
        L_0x0425:
            java.lang.String r2 = "۟ۥۗۖۖۖۘۥۤۜۘ۟ۢ۫۬ۘۦۧ۫۟۟ۦۨ۟ۨۗۖۧۘ"
            goto L_0x040f
        L_0x0428:
            java.lang.String r2 = "ۙۨۨۗۡۘ۟۠ۗۜ۫ۥۘ۫ۖ۠۠ۨۘ"
            goto L_0x0085
        L_0x042c:
            r38 = r35[r41]
            java.lang.String r2 = "ۖۚۢۨۧۛۚۦۦۖۥۥۛۜۘۦۢۥ۫ۛۦۘ"
            goto L_0x0085
        L_0x0432:
            int r2 = r78.getDotCount()
            int r2 = r2 * r63
            int r37 = r2 + r38
            java.lang.String r2 = "۫ۧۛۛۦ۟ۥۖۦۛۢ۬ۥۙۦۦۤۤۗۚۡ۠ۥ"
            goto L_0x0085
        L_0x043e:
            java.lang.String r2 = "ۨۘۖۤ۟ۛۛۧۖۘۛۗۡۘۙۤۜ۬۬۬"
            r54 = r37
            goto L_0x0085
        L_0x0444:
            r75 = -591314203(0xffffffffdcc142e5, float:-4.35185775E17)
            java.lang.String r2 = "ۘۚۡۘۨۛۜۘ۬ۚۧ۫ۨۘۛۜۘۡۤۘۘ"
        L_0x0449:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case 581317875: goto L_0x0453;
                case 1036218069: goto L_0x0459;
                case 1328533208: goto L_0x0468;
                case 1511206317: goto L_0x07a6;
                default: goto L_0x0452;
            }
        L_0x0452:
            goto L_0x0449
        L_0x0453:
            java.lang.String r2 = "ۤ۬ۧۤۤۡ۫ۨۨۜۚۙۦۛۛ۟ۚۨۘۙۥۨۘۚ۬ۨۘ"
            goto L_0x0449
        L_0x0456:
            java.lang.String r2 = "ۤۗۥۘۗۙۤۦۜۢۖۘۢۗۛۡۥ۟ۡۡۙۛۘ۬ۥ"
            goto L_0x0449
        L_0x0459:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r37)
            r0 = r74
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x0456
            java.lang.String r2 = "ۡۛۖۘ۫ۤۚۜۡۥۧۚۙۖ۬۠۟ۖۛ۫ۜ"
            goto L_0x0449
        L_0x0468:
            java.lang.String r2 = "۫۬۠ۙۘۖۘۚ۬ۖۘ۫۠ۥۘۤ۠۠۫ۡۤ۠ۧ"
            goto L_0x0085
        L_0x046c:
            int r36 = r41 + 1
            java.lang.String r2 = "ۨۧۗ۬ۜۜ۬ۢۦۤۜۘ۠ۖۦۜۢ۠ۛۘۦ"
            goto L_0x0085
        L_0x0472:
            java.lang.String r2 = "ۥۜۚۨۧۘ۟۟ۘۦۘۗۛۖۘ۫ۙ"
            r34 = r35
            goto L_0x0085
        L_0x0478:
            r33 = -1
            java.lang.String r2 = "۠۬ۖۘۜ۟ۘۢۧ۫ۜۥۜۡۡۧۥۤۡۘ۠ۘۗۨۤۘ"
            goto L_0x0085
        L_0x047e:
            java.lang.String r2 = "ۥۤۜۚۧ۫ۘۖۤۖۙۚۘ۫ۧۡۧۛۘۦۗۙۜۖ"
            r35 = r34
            goto L_0x0085
        L_0x0484:
            java.lang.String r2 = "ۧۤۚۡۦۨۘۦۡۘۢ۠ۤۚۗۖۘۦۤۛۤۗۦۨۜۘۤۥۧ"
            r40 = r33
            goto L_0x0085
        L_0x048a:
            java.lang.String r2 = "۟ۜۗۦۧۦ۟۠ۥۙۡۡۘۥ۬ۘۘ۫۟۫۫ۘ۠۬۫۟ۥۘ۠"
            r41 = r36
            goto L_0x0085
        L_0x0490:
            java.lang.String r2 = "ۦۢ۟ۤ۠ۜۘۗ۬ۥۥۙۛۛۘۥۘۜۚۤۢۙۥ۟ۘۘۘۦۛ"
            r54 = r18
            goto L_0x0085
        L_0x0496:
            r75 = -1515344348(0xffffffffa5adae24, float:-3.0128718E-16)
            java.lang.String r2 = "ۢۦۥۙۘ۬ۥۗۗۖۘۖۖۜۡ۠ۡۛ"
        L_0x049b:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1145371714: goto L_0x04ac;
                case 445705926: goto L_0x04b7;
                case 1492474730: goto L_0x04a5;
                case 1613845490: goto L_0x07a6;
                default: goto L_0x04a4;
            }
        L_0x04a4:
            goto L_0x049b
        L_0x04a5:
            java.lang.String r2 = "ۙۖۖۘۗۖۛ۟ۡ۫ۚۙۦۘ۬۠ۚۗ۫ۚۛ۬ۢ"
            goto L_0x0085
        L_0x04a9:
            java.lang.String r2 = "ۧ۫ۘۤۢۚۙۘ۬ۢۡ۟ۡ۟ۢۙۖۜۨۘۨۘ"
            goto L_0x049b
        L_0x04ac:
            int r2 = r78.getDotCount()
            r0 = r62
            if (r0 >= r2) goto L_0x04a9
            java.lang.String r2 = "ۤ۠ۢۡۘۗۘۢۖۥ۟ۗۙۦۘۤۡۚۢۙۘ۟۟ۨۘۛۤ۟"
            goto L_0x049b
        L_0x04b7:
            java.lang.String r2 = "۫ۚۗ۫۬ۚ۫ۢ۬ۚۖۡۘۧۚ۟ۥۧۥ"
            goto L_0x049b
        L_0x04ba:
            r2 = 0
            int r28 = r65 + 1
            r0 = r28
            int r2 = java.lang.Math.max(r2, r0)
            int r28 = r78.getDotCount()
            int r75 = r63 + 1
            r0 = r28
            r1 = r75
            int r28 = java.lang.Math.min(r0, r1)
            r0 = r28
            int[] r28 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randIntArray(r2, r0)
            java.lang.String r2 = "۠۟ۘۘۧۤۨۙۖۡۧۥۡۘۢ۫ۘۘ۟ۧۥۘ۠ۧ۠ۢۨۜۘ"
            goto L_0x0085
        L_0x04db:
            r0 = r28
            int r0 = r0.length
            r32 = r0
            java.lang.String r2 = "ۜ۫ۛۥۦۨۘۧ۠ۜۘۘۡۘۖۙۗ۟ۧۘۘ"
            goto L_0x0085
        L_0x04e4:
            r31 = 0
            java.lang.String r2 = "ۢ۬ۚۡۚۨۨۧۘۦۚۥۘۡۜۘۘۦۡ۬ۜ۬۬"
            goto L_0x0085
        L_0x04ea:
            java.lang.String r2 = "ۤۧ۬ۗۡۜۘ۠ۜۡۘ۬۬ۘۗۙۥۚۡۧۘۙۨۘ"
            r30 = r31
            goto L_0x0085
        L_0x04f0:
            java.lang.String r2 = "ۧ۠ۗۗ۠۟ۧۖۥۡ۬ۖۘۙۖۥ۫۬ۙۛ۟ۗۥۙ"
            r29 = r18
            goto L_0x0085
        L_0x04f6:
            java.lang.String r2 = "ۦ۬ۡۘۤۨۡ۫ۖۢۛۖۥۖۤۤ"
            r24 = r28
            goto L_0x0085
        L_0x04fc:
            java.lang.String r2 = "۫ۛۥۘ۫۫ۡۧۗۖۜۜۘ۠۟۠ۤ۟۟"
            r54 = r29
            goto L_0x0085
        L_0x0502:
            r75 = 1447317033(0x56444e29, float:5.3959994E13)
            java.lang.String r2 = "۟ۚۜۚۖۢۜۨۛ۫ۤۙۨ۬۫ۜۙۗۛۚ۫ۗۦۦۘ۠۬"
        L_0x0507:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1234375937: goto L_0x0511;
                case -473710286: goto L_0x07a6;
                case -390692711: goto L_0x0518;
                case 1139551556: goto L_0x0521;
                default: goto L_0x0510;
            }
        L_0x0510:
            goto L_0x0507
        L_0x0511:
            java.lang.String r2 = "ۡۨۘۢۚۥۘۚ۫۬۠ۥۦۘۜۘۙۜۨۥ۠ۢۛ۠ۥۘۚۧ۫"
            goto L_0x0085
        L_0x0515:
            java.lang.String r2 = "ۡۨۡۘ۫۫ۛۦۨۘ۬ۢۦۨۡ۫"
            goto L_0x0507
        L_0x0518:
            r0 = r30
            r1 = r32
            if (r0 >= r1) goto L_0x0515
            java.lang.String r2 = "ۗۖۜۖۥۛۛۨۘۘۙۚ۟ۧۛۧ۟ۤۡۘۜ۠ۜۗۚ۟ۜۖۘ"
            goto L_0x0507
        L_0x0521:
            java.lang.String r2 = "ۜۚۨۜۦ۬ۢۙۧۨ۠ۘۘۚۤۨ۫ۥۦۨۙۥ"
            goto L_0x0507
        L_0x0524:
            r27 = r24[r30]
            java.lang.String r2 = "ۖۥۢ۠ۖۧۘۦۙۨۘ۟۬ۘۘۗ۫ۛۚۧۨۙ۬ۚۨۨۚ۠ۖ"
            goto L_0x0085
        L_0x052a:
            int r2 = r78.getDotCount()
            int r2 = r2 * r27
            int r26 = r2 + r62
            java.lang.String r2 = "ۡ۬۬ۧۘۜۘۤۘۨۘۚۡۥۘۧ۠ۨۘۥۜۦ"
            goto L_0x0085
        L_0x0536:
            java.lang.String r2 = "ۘۥۜۘۖۢۘۘۦۜۥۚۧۜۘۘ۠ۡ"
            r54 = r26
            goto L_0x0085
        L_0x053c:
            r75 = 1541260335(0x5bddc42f, float:1.24843352E17)
            java.lang.String r2 = "ۘۜۖۘۥۧۧۘۖۦۘ۬۫ۡۘۦۘۥۘ"
        L_0x0541:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -337176690: goto L_0x0560;
                case 29163877: goto L_0x0551;
                case 287978116: goto L_0x07a6;
                case 289015292: goto L_0x054b;
                default: goto L_0x054a;
            }
        L_0x054a:
            goto L_0x0541
        L_0x054b:
            java.lang.String r2 = "ۤۤۜۘۜۡۡۜۘ۫۫ۨۖ۫ۢۨۘۗۖۙ۟۠ۡۘ"
            goto L_0x0541
        L_0x054e:
            java.lang.String r2 = "ۚ۫۬ۨۦۗۡۦۤۙۖۗۙۦۜۡۥۘۖۨۗۡۦۜۘۘۛۖ"
            goto L_0x0541
        L_0x0551:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r26)
            r0 = r74
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x054e
            java.lang.String r2 = "ۤۢۦۚ۫ۤۢۤۚۜۦۤۧ۫ۢۗۙۥۘ۠۫ۖۘ"
            goto L_0x0541
        L_0x0560:
            java.lang.String r2 = "ۦۨۤۛۦۘۖۨۥۙۘۛ۠ۤۤۨ۟۠ۛۚۜۘۛ۫ۡۘ"
            goto L_0x0085
        L_0x0564:
            int r25 = r30 + 1
            java.lang.String r2 = "۟ۛۡۜۙۘۥ۠ۨۘۖ۬ۗۗۜۙ۫ۦۥۘۛ۟ۘۙۛۦۘۦ۬ۡۘ"
            goto L_0x0085
        L_0x056a:
            java.lang.String r2 = "ۘۗ۫ۤۨۥۘۜۢۗۜۡۨۘ۫ۤۜۘ"
            r23 = r24
            goto L_0x0085
        L_0x0570:
            r22 = -1
            java.lang.String r2 = "ۤۖۨ۫۬ۦ۫ۚۘۘۢۘۜۘۚۛۨ"
            goto L_0x0085
        L_0x0576:
            java.lang.String r2 = "ۙ۬ۚۡۦۘۘۜۤۦۘۚ۬ۜۚۜۥ"
            r24 = r23
            goto L_0x0085
        L_0x057c:
            java.lang.String r2 = "ۡۥۚۤۗۡۘ۫ۦ۠ۥۨۦۧۡ۬ۡ۫ۡ۫۬۟ۧۚ۟"
            r29 = r22
            goto L_0x0085
        L_0x0582:
            java.lang.String r2 = "ۥۘۨۗۙ۠۟۬ۤۤۦۨۘۢۙۡۗۢۧ"
            r30 = r25
            goto L_0x0085
        L_0x0588:
            java.lang.String r2 = "ۛ۠۠ۢۨۖ۬ۙ۠۬ۖۦۧۦۗۗۤۦ"
            r54 = r18
            goto L_0x0085
        L_0x058e:
            r75 = -1038316874(0xffffffffc21c8ab6, float:-39.13546)
            java.lang.String r2 = "ۛۗۤ۠ۥۡ۫ۗ۠ۜۖۙۤۖۧ"
        L_0x0593:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -2066436512: goto L_0x05a3;
                case 645037132: goto L_0x05a8;
                case 940959521: goto L_0x07a6;
                case 1021503120: goto L_0x059d;
                default: goto L_0x059c;
            }
        L_0x059c:
            goto L_0x0593
        L_0x059d:
            java.lang.String r2 = "ۗۚۘۘۜۡۙۨۦۛۤۤۜۘۤ۫ۖۘۤۧۙۗۤ۠ۥۚۥۘۖۢۜ"
            goto L_0x0593
        L_0x05a0:
            java.lang.String r2 = "ۘۡۜۛۡۧۜۗ۠۫ۥۚۧۥۨۘ"
            goto L_0x0593
        L_0x05a3:
            if (r65 < 0) goto L_0x05a0
            java.lang.String r2 = "ۖۧۥ۫ۧۨۘۨۧۗۨۜ۫ۦ۟۬۬ۜۘۥ۟ۨۚۤۡ۬ۡۘ"
            goto L_0x0593
        L_0x05a8:
            java.lang.String r2 = "ۗ۟۠ۛۤۗ۬ۡۦۘۚۜۦۚۦۤۥۡۦۨۘۥۚ"
            goto L_0x0085
        L_0x05ac:
            r2 = 0
            r0 = r64
            int r2 = java.lang.Math.max(r2, r0)
            int r16 = r78.getDotCount()
            int r75 = r62 + 1
            r0 = r16
            r1 = r75
            int r16 = java.lang.Math.min(r0, r1)
            r0 = r16
            int[] r16 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.RandomUtils.randIntArray(r2, r0)
            java.lang.String r2 = "ۙۨۛۢۨۧۡۨۦۘ۬ۡۦۘ۠ۤۥۘۖ۬ۦۘۦۚۦۘۡۤۜۖۜۧ"
            goto L_0x0085
        L_0x05cb:
            r0 = r16
            int r0 = r0.length
            r21 = r0
            java.lang.String r2 = "ۨۥۙۘۢۘ۟ۙۜۘۙ۫ۘۡۛۢ"
            goto L_0x0085
        L_0x05d4:
            r20 = 0
            java.lang.String r2 = "ۧ۠ۡۘۖۧۗۦ۟ۨۛۡۦۘۡ۫ۨۘۨۡۗۘۢۥۡۧۜۘ"
            goto L_0x0085
        L_0x05da:
            java.lang.String r2 = "ۨۚ۬ۗۧۖۘۨۜۢۜۜۘۡۘۧۘۦ۬ۜۘ"
            r19 = r20
            goto L_0x0085
        L_0x05e0:
            java.lang.String r2 = "ۛ۠ۢۚۗۜۘۨۖۜ۬ۦۜۜۤۖ"
            r17 = r18
            goto L_0x0085
        L_0x05e6:
            java.lang.String r2 = "۟ۤۡۖۨۥۘ۫ۖۜ۬۫ۗۤۚۜ"
            r12 = r16
            goto L_0x0085
        L_0x05ec:
            java.lang.String r2 = "ۢ۟ۨۘۚۗۖۘۗ۫۠ۖۥ۠ۘۤۗۥۛۖۘۥۡۧۘۜۥۘ"
            r54 = r17
            goto L_0x0085
        L_0x05f2:
            r75 = -996800218(0xffffffffc4960926, float:-1200.2859)
            java.lang.String r2 = "۫ۥۨ۠ۡۧۘۜۥۡۘۡۨۗ۟ۙۨۘۦۖ۫۠۠ۡۘ۫۠۫"
        L_0x05f7:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -972489634: goto L_0x07a6;
                case -110990184: goto L_0x0608;
                case 493309415: goto L_0x0611;
                case 1556302951: goto L_0x0601;
                default: goto L_0x0600;
            }
        L_0x0600:
            goto L_0x05f7
        L_0x0601:
            java.lang.String r2 = "۫ۘۖۦۘۤ۟ۤۧ۫ۗۡۘۜ۟ۨۢۘ۟۠ۛۡ۠ۨ۬ۢۛ۬"
            goto L_0x0085
        L_0x0605:
            java.lang.String r2 = "۟ۚۚۢۨۧۨۨۤ۟ۘۡۘۙۧۘ"
            goto L_0x05f7
        L_0x0608:
            r0 = r19
            r1 = r21
            if (r0 >= r1) goto L_0x0605
            java.lang.String r2 = "ۜ۫ۦۡ۬ۖۗۡۡۘۥۘۦۘۧۘۥۘۛۦۛ۬ۦ۠ۤۦۛۛۗ"
            goto L_0x05f7
        L_0x0611:
            java.lang.String r2 = "ۘۚۡۤۙۧۤۢ۬ۛۡۜۢۧۖۥۢۙۚۢۥۘ"
            goto L_0x05f7
        L_0x0614:
            r15 = r12[r19]
            java.lang.String r2 = "ۖ۫ۤ۠ۜۖۘۤۘۦۡۤۚۢ۟ۧۛ۫ۙۤۛ۠"
            goto L_0x0085
        L_0x061a:
            int r2 = r78.getDotCount()
            int r2 = r2 * r65
            int r14 = r2 + r15
            java.lang.String r2 = "ۙ۟ۚۡۖۨۛۨۢۤ۬ۨ۬ۙۗ۫۟ۖۘ۬ۧۥۘ"
            goto L_0x0085
        L_0x0626:
            java.lang.String r2 = "۬ۚۛۦۜ۫ۧۘ۠۠ۥۗۤۤۜ۬ۧۙ۬۬ۘۘ"
            r54 = r14
            goto L_0x0085
        L_0x062c:
            r75 = -1054209057(0xffffffffc12a0bdf, float:-10.627898)
            java.lang.String r2 = "ۛۚۡۘۘۦۦۧۡۛۗ۫ۖۙۨۦۥۗۘۘ۫ۥۦۚ۫ۥۘ۫ۜۛ"
        L_0x0631:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -874425823: goto L_0x07a6;
                case -563953316: goto L_0x063b;
                case -218352718: goto L_0x0651;
                case 943879871: goto L_0x0642;
                default: goto L_0x063a;
            }
        L_0x063a:
            goto L_0x0631
        L_0x063b:
            java.lang.String r2 = "۬ۡۜۘۧ۬ۡۘۙۦۜۘۤۢۢۧۢۡۘۘۜۥۘۗۦۧ"
            goto L_0x0085
        L_0x063f:
            java.lang.String r2 = "ۖ۬ۨۘۙ۬۬ۥ۟ۨۘۙۜۤ۟ۗۖۘ"
            goto L_0x0631
        L_0x0642:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r0 = r74
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L_0x063f
            java.lang.String r2 = "ۛۗۢ۟ۖۧۡۛۜۘۨۢۜۖۦۘۘ۟"
            goto L_0x0631
        L_0x0651:
            java.lang.String r2 = "ۙۡۡۘۧۢۡۖۙ۫ۘۢۗۘۛۚۚۢ۬ۧۛۖ۬ۖۡۘۘۢۗ"
            goto L_0x0631
        L_0x0654:
            int r13 = r19 + 1
            java.lang.String r2 = "ۖۨۢۗ۠ۛۗ۟ۖۘۡ۬ۤۦ۫ۦۘ۟۬ۡۨۤۦۘۤۚ۫"
            goto L_0x0085
        L_0x065a:
            java.lang.String r2 = "ۧۨۥۘ۬ۚۖۘۘ۠ۧۖۘۨ۠ۥۦۢۧۘۧۡ"
            r11 = r12
            goto L_0x0085
        L_0x065f:
            r10 = -1
            java.lang.String r2 = "ۢۙۨۘۗۤۗۡۜۦۘۦ۫۠ۦۨۜ۟ۧۚۧ۫ۚ"
            goto L_0x0085
        L_0x0664:
            java.lang.String r2 = "ۨۙۨۘۙۤۘۡۡۛ۫ۡ۬ۧۖۘ"
            r12 = r11
            goto L_0x0085
        L_0x0669:
            java.lang.String r2 = "ۙۦۧۘۖۨ۠ۧۨ۬۠۫ۛۤ۫ۨۨۧۘ"
            r17 = r10
            goto L_0x0085
        L_0x066f:
            java.lang.String r2 = "ۙۜۖۙۙ۠ۢۧۘۡۧۙۘ۬ۦۡۨۖ۬ۢۘۘ۟ۡۜ۠۠ۜۘ"
            r19 = r13
            goto L_0x0085
        L_0x0675:
            r75 = -1166488819(0xffffffffba78cb0d, float:-9.490706E-4)
            java.lang.String r2 = "ۜۗۙۨۜ۬ۖۧۥۘۛۨۡۘۘۗ۬ۜ۠۫ۘۖۡۘۘۤۨۘ"
        L_0x067a:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1175326760: goto L_0x07aa;
                case 80639795: goto L_0x0684;
                case 671592065: goto L_0x0690;
                case 672188128: goto L_0x068b;
                default: goto L_0x0683;
            }
        L_0x0683:
            goto L_0x067a
        L_0x0684:
            java.lang.String r2 = "ۤۡۖۨ۬ۜۗ۬۠ۨۘ۫ۨۙۙۜۘۚۦ۬ۧۜۧۘۤۤۥ"
            goto L_0x0085
        L_0x0688:
            java.lang.String r2 = "ۨۡۖۘۗۤۥۘۛۡۖۘۙ۠۫۟ۙۨۘ۟ۨ۠۬ۤۙ"
            goto L_0x067a
        L_0x068b:
            if (r54 < 0) goto L_0x0688
            java.lang.String r2 = "ۨ۠ۨۘۨ۟ۚۚۗۖۘۜۙ۬ۚۖۡۛۡۦۡ۬ۨۘۙۚۥۦ۬۫"
            goto L_0x067a
        L_0x0690:
            java.lang.String r2 = "ۙ۠ۥۘۘۡۨۗۨۘۗۦۗۛۗۜۘ"
            goto L_0x067a
        L_0x0693:
            java.lang.String r2 = "ۡۥۚۨۨۙۖۚۖۦۡۚ۟۠ۘۙۧۛۧۙۢ"
            r56 = r54
            goto L_0x0085
        L_0x0699:
            int r9 = r57 + 1
            java.lang.String r2 = "ۘۚۦۘۥ۬ۦۘۥۧۥۘ۫۬ۨ۫ۗۙۗۥۡۤۖۨ۫ۜۢۦۦ"
            goto L_0x0085
        L_0x069f:
            java.lang.String r2 = "ۚۤۧ۬ۥۨۛۦۚۘ۫۫ۙۨۤۚۘۜ۟ۙ"
            r57 = r9
            goto L_0x0085
        L_0x06a5:
            java.lang.String r2 = "۬ۧ۫ۥ۠ۤ۠۟ۤۛ۟ۙ۬۠ۜ۬۫ۜۘ"
            r18 = r54
            goto L_0x0085
        L_0x06ab:
            r75 = -1963183473(0xffffffff8afc328f, float:-2.4285735E-32)
            java.lang.String r2 = "ۦ۫ۡۘۛۦۖۘۢ۠ۢۗۤ۟۬ۢ۠ۙ۬۠"
        L_0x06b0:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -1723473451: goto L_0x06c1;
                case -482921277: goto L_0x06ba;
                case 811843800: goto L_0x06c9;
                case 1280878851: goto L_0x06c6;
                default: goto L_0x06b9;
            }
        L_0x06b9:
            goto L_0x06b0
        L_0x06ba:
            java.lang.String r2 = "ۛۖۥۘ۬۫ۖۘۖ۟ۡۘ۠ۛ۬ۛ۫ۖ"
            goto L_0x0085
        L_0x06be:
            java.lang.String r2 = "ۚۧۨۗۛۡۘۜۡ۬۠ۨۙۡۤۘۘۤۢۚۤ۠ۡۘ"
            goto L_0x06b0
        L_0x06c1:
            if (r56 < 0) goto L_0x06be
            java.lang.String r2 = "ۡ۟ۛ۟۬ۘۥ۫ۨۘۗۜۗۘۖ"
            goto L_0x06b0
        L_0x06c6:
            java.lang.String r2 = "ۜ۬ۦۘۥۛۥۛۚ۫ۚۗۥ۟ۜۖۘۛۛۜ۟ۢ"
            goto L_0x06b0
        L_0x06c9:
            java.lang.String r2 = "ۗۤۦۖۥۚۗ۬ۙ۬۬ۘۘۢۢ۠۫۠ۤ۫ۜۧۘ"
            goto L_0x0085
        L_0x06cd:
            java.lang.String r2 = "ۜۨ۬ۙۥۧۘ۫ۚۤۜۜ۫ۦۙۧۥۘ۠ۦۦۘۘۖۘۘ"
            r7 = r56
            goto L_0x0085
        L_0x06d3:
            int r8 = r66 + 1
            java.lang.String r2 = "ۙۧۙۛۜۖۘۛ۫ۨۘ۬ۛۜۗۨۜۗۨۘ"
            goto L_0x0085
        L_0x06d9:
            java.lang.String r2 = "۟ۨۙۖۚۧۨ۠ۨۘۜۘۗۨۘۡۘۡۘۧۥ۟۟"
            r66 = r8
            goto L_0x0085
        L_0x06df:
            java.lang.String r2 = "۠۬ۘ۠ۨۡۚۤۡۘۘۚۙ۠ۧۨ۠ۛۖۘ۫ۖۡۥۥۜۘ"
            r59 = r56
            goto L_0x0085
        L_0x06e5:
            java.lang.String r2 = "۟ۨۨۖۘۨۘۥ۫۬۠۠ۖۘۗۥۚۘ۠ۡۢ۫ۘۗۛۜۙۢۨۘ"
            r6 = r7
            goto L_0x0085
        L_0x06ea:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0 = r74
            r0.add(r2)
            java.lang.String r2 = "۠ۡ۟۠ۥۢۜۡۚۧۙۡۘۜ۟۬ۨ۠ۜۚ۫ۚۖۘ"
            goto L_0x0085
        L_0x06f7:
            java.lang.String r2 = "ۜۙۙۗۨۡۥ۬ۘۘۦۢۨۤ۬ۡۘ۠ۛ۟"
            r72 = r6
            goto L_0x0085
        L_0x06fd:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.lang.String r2 = "ۥۤۜۧۢۘۘۨۚۜۧۧۡۘۚ۬ۥۘ"
            goto L_0x0085
        L_0x0706:
            java.util.Iterator r4 = r74.iterator()
            java.lang.String r2 = "ۦۗۖۘۢۗۗۚ۬ۡۤۚۘۘۤۚۢۥۥۜۥۨۨ"
            goto L_0x0085
        L_0x070e:
            r75 = 1316549367(0x4e78f2f7, float:1.04416813E9)
            java.lang.String r2 = "ۖۖۨ۟۫ۗ۬ۥۜۘۖۜۖۘۡۗۛ۫ۥۨۘۙ۬ۡۘۛۛۧ"
        L_0x0713:
            int r76 = r2.hashCode()
            r76 = r76 ^ r75
            switch(r76) {
                case -172040839: goto L_0x0724;
                case 267624332: goto L_0x071d;
                case 472589991: goto L_0x0730;
                case 1501645984: goto L_0x072d;
                default: goto L_0x071c;
            }
        L_0x071c:
            goto L_0x0713
        L_0x071d:
            java.lang.String r2 = "ۛۧۧۨۚۨۘۥۨ۟ۚ۬ۡۘۛۖۘۡۛۘۘ۫ۧۨۘۧۦۨۗۡ۫"
            goto L_0x0085
        L_0x0721:
            java.lang.String r2 = "ۙۖ۠ۥۨۖۘۖۥۢۜۦ۫ۦۨۜۘ۟۫۟۬۠ۦۗۙۨۜۤ"
            goto L_0x0713
        L_0x0724:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0721
            java.lang.String r2 = "ۧۨۖۨۨۢ۟۬ۨۘ۟۫ۗۛۧۚ۬۬ۤ"
            goto L_0x0713
        L_0x072d:
            java.lang.String r2 = "ۦ۫ۡۘۗ۬ۨۘۘۘۢۘ۟ۚۤ۠ۖۘ"
            goto L_0x0713
        L_0x0730:
            java.lang.String r2 = "ۥۙۛۚۥۛۥۖۢۙۗۘۘۖۘۘۖ۟ۥ۠ۦۘۘۘۘۘۚ۬۠"
            goto L_0x0085
        L_0x0734:
            java.lang.Object r2 = r4.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView$Dot r2 = com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView.Dot.of(r2)
            r5.add(r2)
            java.lang.String r2 = "ۛۧ۫ۜۜۙۜۙۖۘۘۗۥۘۘۨۦۦۗ۫ۧ۠ۚۦۧۛ"
            goto L_0x0085
        L_0x0749:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "Size must be in range [1, "
            r3.<init>(r2)
            java.lang.String r2 = "ۡۧۧۨۛۧۧۦۤۜۛ۟۬ۗ۫ۧۗ۫ۥۥۤ۬۟ۨۘۡۜۤ"
            goto L_0x0085
        L_0x0754:
            int r2 = r78.getDotCount()
            r3.append(r2)
            java.lang.String r2 = "۫ۛۚۧۚۜۘ۠ۤ۫ۧۢ۠۫۟ۛ"
            goto L_0x0085
        L_0x075f:
            java.lang.String r2 = "]"
            r3.append(r2)
            java.lang.String r2 = "ۙۜۧۢۤۧۖۙ۬ۤۦ۫۟ۘۘۘۢ۫ۖ"
            goto L_0x0085
        L_0x0768:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x0772:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "PatternLockView can not be null."
            r2.<init>(r3)
            throw r2
        L_0x077a:
            java.lang.String r2 = "۠۠ۥ۫ۜ۬ۖۛۦ۫ۗۡۘۡۧۗۦ۠ۨۘ"
            goto L_0x0085
        L_0x077e:
            java.lang.String r2 = "ۖۨۥۘۡ۟۬ۗۙۤۨۙۖۘۡۙۛ"
            goto L_0x0085
        L_0x0782:
            java.lang.String r2 = "ۥۙۢۢۤۨۘۗ۬ۨۤۖ۟ۡۙۥۡۖۧۖۤ"
            goto L_0x0085
        L_0x0786:
            java.lang.String r2 = "ۥۜۧۦۡۚۜۜۜ۬۟۟ۙۢۛۥۡۦۘ۫ۥۥۧ۫ۖۥ"
            goto L_0x0085
        L_0x078a:
            java.lang.String r2 = "ۥۙۦۘ۬۟ۦۘۥ۟ۖۧۜۜۘۚۨ۬۟ۧۚ"
            goto L_0x0085
        L_0x078e:
            java.lang.String r2 = "ۛۘۖۘۡۜۤۚۖۡۘۚۛۢۦ۠ۜ"
            goto L_0x0085
        L_0x0792:
            java.lang.String r2 = "۠ۦۖۘۢ۟۬ۜۤۢۢۜ۟ۗۙۡۘۚۧۚۗ۬۟"
            goto L_0x0085
        L_0x0796:
            java.lang.String r2 = "ۨۧۤ۟ۚ۬ۦۙۖۥ۠ۜۘۤۜۥۘۦۤۥ"
            goto L_0x0085
        L_0x079a:
            java.lang.String r2 = "ۥۘۙۤ۬ۥۘۤۧۗۙۡۡۘۚۙۤ"
            goto L_0x0085
        L_0x079e:
            java.lang.String r2 = "ۦ۬ۡۘۤۨۡ۫ۖۢۛۖۥۖۤۤ"
            goto L_0x0085
        L_0x07a2:
            java.lang.String r2 = "۟ۤۡۖۨۥۘ۫ۖۜ۬۫ۗۤۚۜ"
            goto L_0x0085
        L_0x07a6:
            java.lang.String r2 = "ۥۚۖ۬ۛۙۥۥۘۘۨ۟ۛۥۚۗ"
            goto L_0x0085
        L_0x07aa:
            java.lang.String r2 = "ۡۚۡ۟ۛۡۖۨۡۨۥۘۡۢۨۜۗ۟ۙۡ"
            goto L_0x0085
        L_0x07ae:
            java.lang.String r2 = "ۡۥۖ۫۬ۖۤۜۙۛۚۡۥۖۘۗۨۢ"
            goto L_0x0085
        L_0x07b2:
            java.lang.String r2 = "ۦ۠ۡۛۙۜ۠ۜۜۨ۫ۦۧۤۘۘۧۢۚ"
            goto L_0x0085
        L_0x07b6:
            java.lang.String r2 = "ۦۗۖۘۢۗۗۚ۬ۡۤۚۘۘۤۚۢۥۥۜۥۨۨ"
            goto L_0x0085
        L_0x07ba:
            java.lang.String r2 = "ۜۥۘۘۢۦۥۘۧ۠ۨۘۡۧۡۙۤ۟ۛۥ۬"
            goto L_0x0085
        L_0x07be:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.youbasha.ui.lockV2.patternlockview.utils.PatternLockUtils.generateRandomPattern(com.obwhatsapp.youbasha.ui.lockV2.patternlockview.PatternLockView, int):java.util.ArrayList");
    }

    public static String patternToMD5(PatternLockView patternLockView, List<PatternLockView.Dot> list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(patternToString(patternLockView, list).getBytes(DefaultCrypto.UTF_8));
            byte[] digest = instance.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            return String.format((Locale) null, "%0" + (digest.length * 2) + "x", new Object[]{bigInteger}).toLowerCase();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            return null;
        }
    }

    public static String patternToSha1(PatternLockView patternLockView, List<PatternLockView.Dot> list) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(patternToString(patternLockView, list).getBytes(DefaultCrypto.UTF_8));
            byte[] digest = instance.digest();
            BigInteger bigInteger = new BigInteger(1, digest);
            return String.format((Locale) null, "%0" + (digest.length * 2) + "x", new Object[]{bigInteger}).toLowerCase();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e2) {
            return null;
        }
    }

    public static String patternToString(PatternLockView patternLockView, List<PatternLockView.Dot> list) {
        String str = "۫۟ۥۘ۟ۥ۬ۜۨۧۘۦۘ۬ۥۘۛۜ۟ۘۘۛۛۜۘۡۖۨۘ";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        PatternLockView.Dot dot = null;
        int i5 = 0;
        StringBuilder sb = null;
        int i6 = 0;
        while (true) {
            switch ((str.hashCode() ^ 809) ^ -1834217632) {
                case -1669746535:
                    sb.append(dot.getColumn() + (i3 * i4));
                    str = "۬ۢۧ۬ۡ۫ۦۡۘ۟۠ۖ۟ۨۘۥۦۧۚۖۗۧۨ";
                    break;
                case -1248026194:
                    str = "ۘۨۘۖۗۡۨۤۦۘۧۥ۬ۦۢۙ";
                    i5 = i2;
                    break;
                case -923977845:
                    str = "ۙۦ۬۬ۘۜۡۘۦۘۦۜۥۘۚۦۚ۠ۖۥۨۙۛۜۖۥ";
                    i6 = list.size();
                    break;
                case -905893413:
                    str = "ۜۤۤۡۜۢ۫ۛۥۥۗۘۖۗۨۘۨۘ۠";
                    break;
                case -22135348:
                    str = "ۛۚۘۙۜۦۘۤۖۡۛۦۘۗ۟ۚۘۜۜۘۦۖۦۘ۟ۡۘۨۤۜ";
                    sb = new StringBuilder();
                    break;
                case 536977933:
                    return sb.toString();
                case 716475591:
                    return "";
                case 850174385:
                    String str2 = "ۜۤۖۨ۟ۜۖ۫ۘۘ۫ۜۗۤۥۘۨۚ۬ۢۥۧۘۚۚۥۘ";
                    while (true) {
                        switch (str2.hashCode() ^ -51297054) {
                            case -1603204730:
                                if (i5 >= i6) {
                                    str2 = "ۦۜ۠۫ۤۚۧۛۡۤۥۚۡ۟ۗۜۘۘ";
                                    break;
                                } else {
                                    str2 = "ۢ۟ۖۜۡۨ۫ۧۜۘۖۛۤ۠ۚۦۖ۟ۗۙۥۦۧۨۗ";
                                    break;
                                }
                            case -1329722051:
                                str = "ۙۥۜ۫۫ۧ۠ۢۚۧۥۙۗۜ۟۫ۦۘۘۨۢۛ۬ۘ۟";
                                continue;
                            case 133507172:
                                str = "۠ۙۙ۬۫ۥۡ۟ۖۡۘۡ۫ۗ";
                                continue;
                            case 334035577:
                                str2 = "ۜۦۘۘۛۥۚۢۖ۫ۛۜ۫۬ۤۜ۬ۚۧۤۘ۫ۡ۫ۚۥۚۛ";
                                break;
                        }
                    }
                    break;
                case 1035179246:
                    str = "ۤۙۡۘۗۨۚۙۜۤ۫۫ۖۥۗۢ";
                    break;
                case 1282625696:
                    i4 = dot.getRow();
                    str = "ۧۧۡۘۤ۟ۗ۬ۤۧۖ۫ۗۖ۬ۜ۫ۜۜۘ";
                    break;
                case 1336090711:
                    String str3 = "۬۫ۜ۠ۖۥۗۙۜۘۡۚۢۙۗۚ۫ۧۥۘ";
                    while (true) {
                        switch (str3.hashCode() ^ 1212216325) {
                            case -684837876:
                                str3 = "ۙۛۡۡۘۨۘۙۦۨۘۚۦۘۚۦۥۘ۠ۛۥ۬ۙۗۨ۠ۛ";
                                break;
                            case -401948554:
                                str = "۬ۛۙ۠ۛ۬ۜۧۘۛۢۥ۬ۨۖ";
                                continue;
                            case -241272706:
                                str = "ۥۡۡۘۘۦۙ۫ۧۦۘ۫۠ۨۨۙۡۘ۟ۢۦ";
                                continue;
                            case 1211186839:
                                if (list != null) {
                                    str3 = "ۡ۬ۛ۟ۖۨۘۚۢۨۖۗۚۖۡۘۗ۫۟۬ۚۘۨۚ۬ۜۗ۬";
                                    break;
                                } else {
                                    str3 = "۟۟ۚ۠ۧۡۘۤۛۜۡۨۙۦۙۨ۫ۤۗ۫۠ۦۘ۬ۦۘ";
                                    break;
                                }
                        }
                    }
                    break;
                case 1472660711:
                    str = "ۥۢ۫۫ۦ۬۫ۥۨۘ۟ۙۧۦ۟۠";
                    break;
                case 1735717116:
                    str = "ۦۖۥۘۚۜۤ۟ۗۨۨۙ۫ۢۤ۫ۨۖۦ";
                    break;
                case 1794034378:
                    str = "ۦۖۥۘۚۜۤ۟ۗۨۨۙ۫ۢۤ۫ۨۖۦ";
                    i5 = 0;
                    break;
                case 1870078308:
                    str = "ۛۨۥۡۦۧۡ۫ۗۛ۬ۚ۫۠ۤۥۦۖۘۙۘۦۤ";
                    dot = list.get(i5);
                    break;
                case 1879962514:
                    i3 = patternLockView.getDotCount();
                    str = "ۧۗۥۛۡۜۢ۫۟ۧۗ۫ۢۡۧۘۤۦۧۘۖۡۤ";
                    break;
                case 2064606401:
                    i2 = i5 + 1;
                    str = "ۥۢۚۘۤۜۜۦۡۘۦۨۙ۟ۜۗ۠ۛۧۤۧۢۧۤ";
                    break;
            }
        }
    }

    public static List<PatternLockView.Dot> stringToPattern(PatternLockView patternLockView, String str) {
        ArrayList arrayList = null;
        String str2 = "ۧ۫ۡۚۚۙۤۜ۟ۦۧۥۛۚ۠";
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            switch ((str2.hashCode() ^ 840) ^ 1821306242) {
                case -1954088734:
                    str2 = "ۢۙۜۘۚۖۘ۫ۢۥۘۦۤ۟۫ۤ۠۠ۗ۬ۚۖۖۘ۫ۖۘۘۨۦۛ";
                    break;
                case -1682553726:
                    str2 = "۠۟ۙ۟ۚۧ۫ۙۖۧۧ۫ۖۙۜۢۡۗۖۘۖۖۦۘۢۘۛ";
                    break;
                case -1458709993:
                    str2 = "ۚۘ۬ۥۡۙۥ۟ۨۘ۬ۢ۠ۦۛۙۧ۠ۗ";
                    break;
                case -913633854:
                    str2 = "ۛۗۖۨۦۚۜۨۦۨۤۨۚۗۗۘ۠ۛۡۥۘۘۗۛۜ";
                    i4 = i2;
                    break;
                case -660528168:
                    i3 = Character.getNumericValue(str.charAt(i4));
                    str2 = "۫۬ۜۡۡ۫۟ۖۥۘ۠ۙۘۧۗۦۙۡۚۖۖۦۘۦۗۛ";
                    break;
                case -84981422:
                    str2 = "ۧۚ۬ۡۙۘۖۡۥۛ۟ۦۘۜ۟ۙ";
                    i4 = 0;
                    break;
                case 354911905:
                    i2 = i4 + 1;
                    str2 = "ۘ۬ۥۘۡۚ۫ۜۦۦۘۨۢۖۘۧۧۜۘۦۦۧ";
                    break;
                case 536960877:
                    str2 = "ۧۚ۬ۡۙۘۖۡۥۛ۟ۦۘۜ۟ۙ";
                    break;
                case 798317889:
                    arrayList = new ArrayList();
                    str2 = "ۖۛۘۘۙۡۜۜۗ۫ۨۚۘۘۡۨۘۘ۠ۖۘ";
                    break;
                case 1184425124:
                    return arrayList;
                case 1449492167:
                    String str3 = "ۘۜۙۚۥۘۘۤ۬۬ۚۖۨۨۜۘ۬ۦۘۘۚۡۘ";
                    while (true) {
                        switch (str3.hashCode() ^ -1280247828) {
                            case -807138030:
                                str2 = "ۥۨ۟۫ۢۧ۫ۨۤ۠ۨۖۘۛ۫ۜۘۡۘۘۛۨۗ";
                                continue;
                            case -217332713:
                                if (i4 >= str.length()) {
                                    str3 = "ۧۖۗۚۢۜۢ۠ۡۚۜۨۘۧۗۜۘۛ۟ۚ۬ۨۛ";
                                    break;
                                } else {
                                    str3 = "ۙۥ۟ۨۢۢۛۗۗۛۘۘۥۗۦۗۡۚۡۧۨۚۚۜۨۗۡ";
                                    break;
                                }
                            case 1008521074:
                                str2 = "ۨۚۖۥ۫ۨۘۥۗۨۘۧ۬ۜۘۧۦۤۖ";
                                continue;
                            case 1258496523:
                                str3 = "ۤۜۨۘۨۙ۬ۚ۬ۜۛۘۤۧ۟ۧۧ۠ۛۧۙۚۡ۫ۢ۫ۤۦۘ";
                                break;
                        }
                    }
                    break;
                case 1988576093:
                    arrayList.add(PatternLockView.Dot.of(i3 / patternLockView.getDotCount(), i3 % patternLockView.getDotCount()));
                    str2 = "ۛۦۚۘۗ۫ۘۨۥۘ۟۬ۛۖۥ۟ۧۦۜۘۥۜۡۘ";
                    break;
            }
        }
    }
}
