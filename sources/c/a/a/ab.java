package c.a.a;

import android.content.DialogInterface;
/* loaded from: classes.dex */
class ab implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final aa f10a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11b;
    private static int[] y = {72878331, 5882087, 33853605, 85101532, 89808392, 29304122, 34546735};
    private static int[] x = {43195441, 35701381, 69038831, 26942569};

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(aa aaVar, int i) {
        this.f10a = aaVar;
        this.f11b = i;
    }

    private static String h(String str) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            switch (i % 4) {
                case 0:
                    sb.append((char) (charArray[i] ^ 51897));
                    int i2 = x[1];
                    if (i2 >= 0 && (i2 & (84894104 ^ i2)) != 35684869) {
                    }
                    break;
                case 1:
                    sb.append((char) (charArray[i] ^ 1367));
                    int i3 = x[2];
                    if (i3 >= 0 && (i3 & (56874282 ^ i3)) != 68952773) {
                    }
                    break;
                case 2:
                    sb.append((char) (charArray[i] ^ 49243));
                    int i4 = x[3];
                    if (i4 >= 0) {
                        do {
                        } while ((i4 & (84728359 ^ i4)) <= 0);
                        break;
                    } else {
                        break;
                    }
                default:
                    sb.append((char) (charArray[i] ^ 65535));
                    int i5 = x[0];
                    if (i5 >= 0) {
                        do {
                        } while (i5 % (17455996 ^ i5) <= 0);
                        break;
                    } else {
                        break;
                    }
            }
        }
        return sb.toString();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface r18, int r19) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.ab.onClick(android.content.DialogInterface, int):void");
    }
}
