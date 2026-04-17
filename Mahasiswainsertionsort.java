class DataMahasiswa {
    String nim; int nilai;
    public DataMahasiswa(String nim, int nilai) { this.nim = nim; this.nilai = nilai; }
    public String toString() { return "NPM: " + nim + " | Nilai: " + nilai; }
}

public class Mahasiswainsertionsort {
    public static void main(String[] args) {
        DataMahasiswa[] data = getData();
        System.out.println("=== PROSES LITERASI INSERTION SORT ===");

        for (int i = 1; i < data.length; i++) {
            DataMahasiswa key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j].nilai < key.nilai) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
            System.out.print("Literasi ke-" + i + ": ");
            printNilai(data);
        }
        System.out.println("\n=== HASIL AKHIR (INSERTION SORT) ===");
        for (DataMahasiswa m : data) System.out.println(m);
    }

    public static DataMahasiswa[] getData() {
        return new DataMahasiswa[]{
            new DataMahasiswa("220101550", 74), new DataMahasiswa("220101512", 93),
            new DataMahasiswa("220101588", 60), new DataMahasiswa("220101534", 85),
            new DataMahasiswa("220101590", 68), new DataMahasiswa("220101521", 91),
            new DataMahasiswa("220101576", 77), new DataMahasiswa("220101543", 82),
            new DataMahasiswa("220101567", 63), new DataMahasiswa("220101509", 89)
        };
    }

    public static void printNilai(DataMahasiswa[] arr) {
        System.out.print("[");
        for (int k = 0; k < arr.length; k++) System.out.print(arr[k].nilai + (k == arr.length - 1 ? "" : ", "));
        System.out.println("]");
    }
}