import java.util.Scanner;

public class belajar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		belajar alter = new belajar();
		alter.insertData();
	
	}
	public void latihan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan panjang huruf = ");
		Integer angka = scan.nextInt();
		for (int i = 0; i < angka; i++) {
			if (i==0 || i==angka-1) {
				for (int j =0; j < angka; j++) {
					System.out.print("*");
				}
				System.out.println();
			} else {
				for (int j = 0; j < angka; j++) {
					if(j==0 || j==angka-1) {
						System.out.print("*");
					}
					else if (j==(angka/2) && i==(angka/2)) {
						System.out.print("x");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		
	}

	public void belajarArray() {
		int[] myarray;
		// deklarasi variabel hanya size array nya saja tanpa isi
		
		myarray = new int[10];
		//deklarasi dengan isi dari array
		
		int myarray1[]= {3,4,2,5,1,6,7,8,9};
		myarray[0] = 1;
		myarray[4] = 1;
		
		// cara reference
		//System.out.println("Addres sebelum passing reference");
		//System.out.println(myarray);
		//System.out.println(myarray1);
		//myarray = myarray1;
		//System.out.println("Addres setelah passing reference");
		//System.out.println(myarray);
		//System.out.println(myarray1);
		
		// cara manual
		System.out.println("\n\nprint array secara manual");
		for (int i = 0; i < myarray.length; i++) {
			System.out.print(myarray[i]+" ");
		}
		
		System.out.println();
		
		for (int angka : myarray1) {
			System.out.print(angka+" ");
		}
	}

	public void latihanArray() {
	
		Scanner scan = new Scanner(System.in);        
        System.out.println("Masukkan jumlah barang ? ");
        int jmlh = scan.nextInt();
		String[] barang = new String[jmlh];
		for(int i = 0; i < barang.length; i++) {
			System.out.print("Masukkan barang index ke " +i+" = ");
			barang[i] = scan.next();
		}
			
		for(String namaBarang : barang) {
		System.out.println(namaBarang);
		}
	}
	
	public void latihanInput() {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jumlah data mahasiswa = ");
	
		int jmlh = scan.nextInt();
		String[] namaMahasiswa = new String[jmlh];
		int[] nilaiMahasiswa = new int[jmlh];
		for(int i = 0; i < jmlh; i++);
			//System.out.print("Masukkan nama mahasiswa ke "+i+" = ");
			//namaMahasiswa[i]=scan.next();
	}		 	

	public void insertData() {
		Scanner scan = new Scanner(System.in);
		
	
		
		System.out.print("Masukkan banyak data");
		
		int jmlData = scan.nextInt();
		
		ModelData[] data = new ModelData[jmlData];
		
		for (int i = 0; i< jmlData; i++) {
			data[i] =new ModelData();
			System.out.print("Masukkan nama anda : ");
			String nama = scan.next();
			
			data[i].setNama(nama);
			
			System.out.print("Masukkan alamat anda :");
			String alamat = scan.next();
			data[i].setAlamat(alamat);
		}
		
		for (ModelData modelData : data) {
			
			System.out.println("===========================");
			System.out.println("Nama : " + modelData.getNama());
			System.out.println("Alamat : " + modelData.getAlamat());
			System.out.println("===========================");
		}
		
		for (int i = 0; i< jmlData; i++) {
			System.out.println("===========================");
			System.out.println("Nama : " + data[i].getNama());
			System.out.println("Alamat : " + data[i].getAlamat());
			System.out.println("===========================");
		}
	}

}