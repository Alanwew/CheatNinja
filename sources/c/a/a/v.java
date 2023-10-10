package c.a.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class v extends Thread {

    /* renamed from: a  reason: collision with root package name */
    private final g f54a;
    private static int[] K = {64828248, 10803068, 44122938, 27860595, 50065330, 50952770, 54357877, 43399727, 47709401, 97539951, 25652109, 69314440, 60326319, 18818178};
    private static int[] J = {19436395, 24998249, 51941317, 50754434};

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(g gVar) {
        this.f54a = gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(v vVar) {
        return vVar.f54a;
    }

    private static String j(String str) {
        int i;
        while (true) {
            StringBuilder sb = new StringBuilder();
            char[] charArray = str.toCharArray();
            for (int i2 = 0; i2 < charArray.length; i2++) {
                switch (i2 % 4) {
                    case 0:
                        sb.append((char) (charArray[i2] ^ 54470));
                        int i3 = J[1];
                        if (i3 >= 0) {
                            do {
                                i = i3 % (6957932 ^ i3);
                                i3 = 6690660;
                            } while (i != 6690660);
                        }
                    case 1:
                        sb.append((char) (charArray[i2] ^ 11779));
                        int i4 = J[2];
                        if (i4 >= 0 && i4 % (70844660 ^ i4) == 0) {
                            break;
                        }
                        break;
                    case 2:
                        sb.append((char) (charArray[i2] ^ 13563));
                        int i5 = J[3];
                        if (i5 >= 0) {
                            do {
                            } while ((i5 & (80289656 ^ i5)) <= 0);
                        }
                    default:
                        sb.append((char) (charArray[i2] ^ 65535));
                        int i6 = J[0];
                        if (i6 >= 0) {
                            do {
                            } while (i6 % (12380645 ^ i6) <= 0);
                        }
                }
            }
            return sb.toString();
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 799
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.v.run():void");
    }
}
