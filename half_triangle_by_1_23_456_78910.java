package patterns;

public class half_triangle_by_1_23_456_78910 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				count++;
				System.out.format("%02d ",count);
			}
			System.out.println("");
		}

	}

}
