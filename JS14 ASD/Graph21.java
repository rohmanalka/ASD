public class Graph21 {
    int vertex;
    DoubleLinkedList21 list[];
    int matriks[][];

    public Graph21(int v) {
        vertex = v;
        list = new DoubleLinkedList21[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList21();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
        // list[tujuan].addFirst(asal, jarak);
    }

    public void degree(int asal) throws Exception {
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    totalIn++;
                }
            }
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
        // System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + list[asal].size());
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + "(" + list[i].getJarak(j) + "m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public boolean isAdjacent(int asal, int tujuan) {
        for (int i = 0; i < list[asal].size(); i++) {
            try {
                if (list[asal].get(i) == tujuan) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public int inDegree(int node) {
        int inDegreeCount = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != 0) {
                inDegreeCount++;
            }
        }
        return inDegreeCount;
    }
    
    public int outDegree(int node) {
        int outDegreeCount = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != 0) {
                outDegreeCount++;
            }
        }
        return outDegreeCount;
    }

    public void updateJarak(int asal, int tujuan, int jarakBaru) {
        matriks[asal][tujuan] = jarakBaru;
    }

    public int hitungEdge() {
        int edgeCount = 0;
        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != 0) {
                    edgeCount++;
                }
            }
        }
        return edgeCount;
    }
}