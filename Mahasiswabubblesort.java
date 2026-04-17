class DataMahasiswa {
    String nim; int nilai;
    public DataMahasiswa(String nim, int nilai) { this.nim = nim; this.nilai = nilai; }
    public String toString() { return "NPM: " + nim + " | Nilai: " + nilai; }
}

public class Mahasiswabubblesort {
    public static void main(String[] args) {
        DataMahasiswa[] data = getData();
        System.out.println("=== PROSES LITERASI BUBBLE SORT ===");
        
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].nilai < data[j + 1].nilai) {
                    DataMahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
            System.out.print("Literasi ke-" + (i + 1) + ": ");
            printNilai(data);
        }
        System.out.println("\n=== HASIL AKHIR (BUBBLE SORT) ===");
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